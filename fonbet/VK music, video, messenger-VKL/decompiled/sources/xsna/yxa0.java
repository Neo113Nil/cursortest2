package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PlaybackQueueDatabaseHelper.kt */
/* loaded from: classes3.dex */
public final class yxa0 extends SQLiteOpenHelper {
    public final xl40 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yxa0(xl40 xl40Var) {
        super((r0 == null ? null : r0).getApplicationContext(), "playback_queue", (SQLiteDatabase.CursorFactory) null, 30);
        Context context = e43.a;
        this.b = xl40Var;
    }

    public static long o() {
        return o25.a().c().b;
    }

    public final ArrayList b(int i, long j) {
        String str;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder("\n                SELECT * FROM analytics_listening_time \n                WHERE timestamp_ms <= ");
            sb.append(j);
            sb.append(" AND user_id = ");
            sb.append(o());
            sb.append(" \n                ");
            if (i > 0) {
                str = " LIMIT " + i;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("\n            ");
            Cursor rawQuery = writableDatabase.rawQuery(xqm0.g(sb.toString()), null);
            try {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    long j2 = rawQuery.getLong(0);
                    MusicTrack musicTrack = new MusicTrack(cqm0.j(rawQuery.getString(3)));
                    long j3 = rawQuery.getLong(4);
                    long j4 = rawQuery.getLong(5);
                    boolean z = rawQuery.getInt(6) == 1;
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(7), 0)));
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                        dataInputStream.close();
                        arrayList.add(new lhz(j2, j4, j3, musicTrack, (PlaybackLaunchMeta) G, z));
                    } finally {
                    }
                }
                rawQuery.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    writableDatabase.execSQL(xqm0.g("\n                    DELETE FROM analytics_listening_time \n                    WHERE timestamp_ms = " + ((lhz) it.next()).a + " AND user_id = " + o() + "\n                "));
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final ArrayList m() {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM audiobook_chapter_progress WHERE user_id = " + o(), null);
            try {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList.add(new o05(rawQuery.getString(0), rawQuery.getInt(1), rawQuery.getString(2)));
                }
                rawQuery.close();
                readableDatabase.setTransactionSuccessful();
                return arrayList;
            } finally {
            }
        } finally {
            readableDatabase.endTransaction();
        }
    }

    public final int n() {
        return this.b.isEnabled().getValue().booleanValue() ? 1 : 0;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            kq01.h(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            kq01.h(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= i || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS original_tracks_order");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS actual_tracks_order");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS current_track");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_tracks");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS play_source");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytics_listening_time");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS audiobook_chapter_progress");
        kq01.h(sQLiteDatabase);
    }

    public final ArrayList p(int i, long j) {
        String str;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder("\n                SELECT * FROM analytics_listening_time \n                WHERE timestamp_ms <= ");
            sb.append(j);
            sb.append(" AND user_id = ");
            sb.append(o());
            sb.append(" \n                ");
            if (i > 0) {
                str = " LIMIT " + i;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("\n            ");
            Cursor rawQuery = readableDatabase.rawQuery(xqm0.g(sb.toString()), null);
            try {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    long j2 = rawQuery.getLong(0);
                    MusicTrack musicTrack = new MusicTrack(cqm0.j(rawQuery.getString(3)));
                    long j3 = rawQuery.getLong(4);
                    long j4 = rawQuery.getLong(5);
                    boolean z = rawQuery.getInt(6) == 1;
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(7), 0)));
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                        dataInputStream.close();
                        arrayList.add(new lhz(j2, j4, j3, musicTrack, (PlaybackLaunchMeta) G, z));
                    } finally {
                    }
                }
                rawQuery.close();
                readableDatabase.setTransactionSuccessful();
                readableDatabase.endTransaction();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            readableDatabase.endTransaction();
            throw th;
        }
    }

    public final void q(ArrayList arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DELETE FROM audiobook_chapter_progress WHERE chapter_id IN(" + f870.B(arrayList, StringUtils.COMMA, new fo20(9)) + ") AND user_id = " + o());
            s3q0 s3q0Var = s3q0.a;
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final lhz r() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            long o = o();
            lhz lhzVar = null;
            Cursor rawQuery = writableDatabase.rawQuery(xqm0.g("\n                SELECT * FROM analytics_listening_time \n                    WHERE timestamp_ms = (\n                        SELECT MIN(timestamp_ms) FROM analytics_listening_time WHERE user_id = " + o + "\n                    ) AND user_id = " + o + " \n                    LIMIT 1\n            "), null);
            try {
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    MusicTrack musicTrack = new MusicTrack(cqm0.j(rawQuery.getString(3)));
                    long j2 = rawQuery.getLong(4);
                    long j3 = rawQuery.getLong(5);
                    boolean z = rawQuery.getInt(6) == 1;
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(7), 0)));
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                        dataInputStream.close();
                        lhzVar = new lhz(j, j3, j2, musicTrack, (PlaybackLaunchMeta) G, z);
                    } finally {
                    }
                }
                rawQuery.close();
                if (lhzVar != null) {
                    writableDatabase.execSQL(xqm0.g("\n                    DELETE FROM analytics_listening_time \n                    WHERE timestamp_ms = " + lhzVar.a + " AND user_id = " + o + "\n                "));
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return lhzVar;
            } finally {
            }
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final void s(o05 o05Var) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("chapter_id", o05Var.a);
            contentValues.put("progress_ms", Integer.valueOf(o05Var.b));
            contentValues.put("launch_origin", o05Var.c);
            contentValues.put("user_id", Long.valueOf(o()));
            writableDatabase.insertWithOnConflict("audiobook_chapter_progress", null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final boolean t(lhz lhzVar) {
        MusicTrack musicTrack = lhzVar.b;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp_ms", Long.valueOf(lhzVar.a));
            contentValues.put("mid", musicTrack.Fb());
            contentValues.put("user_id", Long.valueOf(o()));
            contentValues.put("playable", musicTrack.e5().toString());
            contentValues.put("stream_duration_ms", Long.valueOf(lhzVar.d));
            contentValues.put("listening_time_ms", Long.valueOf(lhzVar.c));
            contentValues.put("is_final", Boolean.valueOf(lhzVar.e));
            contentValues.put("launch_meta", dni0.a(lhzVar.f));
            boolean z = writableDatabase.insert("analytics_listening_time", null, contentValues) != -1;
            writableDatabase.setTransactionSuccessful();
            return z;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void v(String str, ArrayList arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DELETE FROM " + str + " WHERE user_id = " + o() + " AND COL_QUEUE_TYPE = " + n());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gza0 gza0Var = (gza0) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mid", gza0Var.a);
                contentValues.put("uuid", gza0Var.b);
                contentValues.put("access_key", gza0Var.c);
                contentValues.put("track_code", gza0Var.d);
                contentValues.put("launch_meta", dni0.a(gza0Var.e));
                contentValues.put("user_id", Long.valueOf(o()));
                contentValues.put("COL_QUEUE_TYPE", Integer.valueOf(n()));
                writableDatabase.insert(str, null, contentValues);
            }
            s3q0 s3q0Var = s3q0.a;
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
