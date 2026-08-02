package ru.ok.android.externcalls.analytics.internal.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.json.PlainJsonWriter;
import ru.ok.android.commons.io.OutputStreamWriter;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;
import ru.ok.android.externcalls.analytics.internal.upload.StatDeliveryException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.util.Files;
import xsna.gcy;
import xsna.go9;
import xsna.izs;
import xsna.j5g;
import xsna.ro;
import xsna.s3q0;
import xsna.tgw;
import xsna.zcl;
import xsna.zr;

/* compiled from: DatabaseHelper.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {

    @Deprecated
    public static final String COMPRESSED_COLUMN_NAME = "c";
    private static final Companion Companion = new Companion(null);
    private static final String DATABASE_NAME = "calls-sdk-internal-analytics.db";
    private static final int DATABASE_VERSION = 1;

    @Deprecated
    public static final String ID_COLUMN_NAME = "id";

    @Deprecated
    public static final String ITEM_COLUMN_NAME = "item";

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsDbHelper";

    @Deprecated
    public static final String SIZE_COLUMN_NAME = "sz";

    @Deprecated
    public static final String TABLE_NAME = "call_events";
    private final boolean compressContent;
    private final Context context;
    private final CallAnalyticsLogger logger;

    /* compiled from: DatabaseHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String readString(InputStream inputStream, boolean z) throws IOException {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[1024];
            if (z) {
                inputStream = new GZIPInputStream(inputStream);
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            while (true) {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (read < 0) {
                        s3q0 s3q0Var = s3q0.a;
                        inputStreamReader.close();
                        return sb.toString();
                    }
                    sb.append(cArr, 0, read);
                } finally {
                }
            }
        }

        private Companion() {
        }
    }

    /* compiled from: DatabaseHelper.kt */
    public final class RecordsQuery implements Iterator<String>, Closeable, gcy {
        private Cursor cursor;
        private final ArrayList<String> ids = new ArrayList<>();
        private final int limit;

        public RecordsQuery(int i) {
            this.limit = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence drop$lambda$0(String str) {
            return "?";
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        public final void drop(SQLiteDatabase sQLiteDatabase) {
            int delete = sQLiteDatabase.delete(DatabaseHelper.TABLE_NAME, zr.a("id in (", j5g.g0(this.ids, StringUtils.COMMA, null, null, 0, new a(), 30), ")"), (String[]) this.ids.toArray(new String[0]));
            DatabaseHelper.this.logger.d(DatabaseHelper.LOG_TAG, "Rows deleted => " + delete);
            this.ids.clear();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Cursor cursor = this.cursor;
            boolean z = false;
            if (cursor != null && cursor.isAfterLast()) {
                z = true;
            }
            return !z;
        }

        public final void query(SQLiteDatabase sQLiteDatabase) {
            this.cursor = sQLiteDatabase.rawQuery("select item, c, id from call_events  order by id limit " + this.limit, null, null);
            CallAnalyticsLogger callAnalyticsLogger = DatabaseHelper.this.logger;
            Cursor cursor = this.cursor;
            callAnalyticsLogger.d(DatabaseHelper.LOG_TAG, "Rows selected => " + (cursor != null ? Integer.valueOf(cursor.getCount()) : null));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public String next() {
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new NoSuchElementException("No cursor");
            }
            if (!cursor.moveToNext()) {
                throw new NoSuchElementException("No more elements present");
            }
            this.ids.add(String.valueOf(cursor.getInt(2)));
            try {
                Companion companion = DatabaseHelper.Companion;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(0));
                boolean z = true;
                if (cursor.getInt(1) <= 0) {
                    z = false;
                }
                return new JSONObject(companion.readString(byteArrayInputStream, z)).toString(0);
            } catch (Throwable th) {
                DatabaseHelper.this.logger.report(DatabaseHelper.LOG_TAG, "Can't parse or serialize item", new StatDeliveryException(th));
                throw new NoSuchElementException("Wrong element data");
            }
        }
    }

    public DatabaseHelper(Context context, boolean z, EventChannel eventChannel, CallAnalyticsLogger callAnalyticsLogger) {
        super(context, go9.b("calls-sdk-internal-analytics.db_", eventChannel.getKey()), (SQLiteDatabase.CursorFactory) null, 1);
        this.context = context;
        this.compressContent = z;
        this.logger = callAnalyticsLogger;
    }

    private final void appendImpl(CallAnalyticsEvent callAnalyticsEvent) throws SQLiteFullException, SQLiteDatabaseCorruptException {
        SQLiteDatabase writableDatabase;
        try {
            byte[] itemToBytes = itemToBytes(callAnalyticsEvent);
            if (itemToBytes == null || (writableDatabase = getWritableDatabase()) == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(SIZE_COLUMN_NAME, Integer.valueOf(itemToBytes.length));
            contentValues.put("c", Integer.valueOf(this.compressContent ? 1 : 0));
            contentValues.put(ITEM_COLUMN_NAME, itemToBytes);
            if (writableDatabase.insertOrThrow(TABLE_NAME, null, contentValues) < 0) {
                this.logger.e(LOG_TAG, "append failed");
                return;
            }
            this.logger.d(LOG_TAG, "append (c=" + this.compressContent + ") " + callAnalyticsEvent);
        } catch (Throwable th) {
            if ((th instanceof SQLiteFullException) || (th instanceof SQLiteDatabaseCorruptException)) {
                throw th;
            }
            this.logger.report(LOG_TAG, "Unable to insert event to event database", new StatDeliveryException(th));
        }
    }

    private final void dropDatabase() {
        try {
            close();
            File databasePath = this.context.getDatabasePath(getDatabaseName());
            if (databasePath.exists()) {
                Files.delete(databasePath);
                this.logger.d(LOG_TAG, "Database file dropped");
            }
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Unable to drop database", new StatDeliveryException(th));
        }
    }

    private final void dropOldest(int i) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            int delete = writableDatabase.delete(TABLE_NAME, "id in (select id from call_events order by id asc limit ?)", new String[]{String.valueOf(i)});
            this.logger.d(LOG_TAG, delete + " oldest records were deleted");
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, tgw.b(i, "Unable to drop oldest ", " records"), new StatDeliveryException(th));
            dropDatabase();
        }
    }

    private final byte[] itemToBytes(CallAnalyticsEvent callAnalyticsEvent) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStream gZIPOutputStream = this.compressContent ? new GZIPOutputStream(byteArrayOutputStream, 1024, true) : byteArrayOutputStream;
            try {
                try {
                    PlainJsonWriter plainJsonWriter = new PlainJsonWriter(new OutputStreamWriter(gZIPOutputStream));
                    try {
                        EventSerializer.INSTANCE.serialize(plainJsonWriter, callAnalyticsEvent);
                        s3q0 s3q0Var = s3q0.a;
                        plainJsonWriter.close();
                        gZIPOutputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    } finally {
                    }
                } finally {
                    gZIPOutputStream.flush();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Can't close gzip stream", new StatDeliveryException(th));
            return null;
        }
    }

    public static final String readString(InputStream inputStream, boolean z) throws IOException {
        return Companion.readString(inputStream, z);
    }

    public final void append(CallAnalyticsEvent callAnalyticsEvent) {
        try {
            appendImpl(callAnalyticsEvent);
        } catch (Throwable th) {
            if (th instanceof SQLiteFullException) {
                this.logger.e(LOG_TAG, "No space left on device, drop db", th);
                dropOldest(20);
            } else if (th instanceof SQLiteDatabaseCorruptException) {
                this.logger.e(LOG_TAG, "Database corrupt, drop it", th);
                dropDatabase();
            }
            try {
                appendImpl(callAnalyticsEvent);
            } catch (Throwable th2) {
                this.logger.report(LOG_TAG, "Append after drop failed", new StatDeliveryException("Can't append after drop", th2));
            }
        }
    }

    public final int count() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            Cursor rawQuery = writableDatabase.rawQuery("select count(*) from call_events", null, null);
            try {
                int i = rawQuery.moveToNext() ? rawQuery.getInt(0) : 0;
                ro.e(rawQuery, null);
                return i;
            } finally {
            }
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Unable to get total data size", new StatDeliveryException(th));
            return 0;
        }
    }

    public final void drop() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            writableDatabase.execSQL("delete from call_events");
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Unable to drop data", new StatDeliveryException(th));
        }
    }

    public final void grab(int i, izs<? super Iterator<String>, s3q0> izsVar) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                RecordsQuery recordsQuery = new RecordsQuery(i);
                try {
                    try {
                        recordsQuery.query(writableDatabase);
                        izsVar.invoke(recordsQuery);
                        recordsQuery.drop(writableDatabase);
                        recordsQuery.close();
                        s3q0 s3q0Var = s3q0.a;
                        recordsQuery.close();
                        writableDatabase.setTransactionSuccessful();
                    } catch (Throwable th) {
                        recordsQuery.close();
                        throw th;
                    }
                } finally {
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th2) {
            if ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException)) {
                this.logger.e(LOG_TAG, "Network error", th2);
            } else {
                this.logger.report(LOG_TAG, "Upload failed, will try again later", new StatDeliveryException(th2));
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE call_events (id INTEGER PRIMARY KEY AUTOINCREMENT, c INTEGER NOT NULL,sz INTEGER NOT NULL, item BLOB)");
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Can't create table for events", new StatDeliveryException(th));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS call_events");
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Can't drop table for events", new StatDeliveryException(th));
        }
        onCreate(sQLiteDatabase);
    }
}
