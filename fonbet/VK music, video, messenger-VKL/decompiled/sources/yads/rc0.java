package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class rc0 implements rq3 {
    public static final String e;
    public static final String[] f;
    public final w30 b;
    public boolean d;
    public final String a = "ExoPlayerDownloads";
    public final Object c = new Object();

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        e = sb.toString();
        f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public rc0(m43 m43Var, int i) {
        this.b = m43Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i = mc3.a;
            for (String str2 : str.split(StringUtils.COMMA, -1)) {
                String[] split = str2.split("\\.", -1);
                if (split.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new z43(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    public final hj0 b(String str) {
        a();
        try {
            Cursor a = a("id = ?", new String[]{str});
            try {
                if (a.getCount() == 0) {
                    a.close();
                    return null;
                }
                a.moveToNext();
                hj0 a2 = a(a);
                a.close();
                return a2;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new v30(e2);
        }
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, null, null);
        } catch (Throwable th) {
            throw new v30(th);
        }
    }

    public static hj0 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = MimeTypes.APPLICATION_MPD;
        } else if ("hls".equals(string3)) {
            str = MimeTypes.APPLICATION_M3U8;
        } else if ("ss".equals(string3)) {
            str = MimeTypes.APPLICATION_SS;
        } else {
            str = MimeTypes.VIDEO_UNKNOWN;
        }
        qj0 qj0Var = new qj0(string, parse, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        oj0 oj0Var = new oj0();
        oj0Var.a = cursor.getLong(13);
        oj0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new hj0(qj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, oj0Var);
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int a = ue3.a(this.b.getReadableDatabase(), 0, "");
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        ue3.a(writableDatabase, 0, "", 3);
                        if (a == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.a);
                        writableDatabase.execSQL("CREATE TABLE " + this.a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((hj0) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (Throwable th2) {
                throw new v30(th2);
            }
        }
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.b.getReadableDatabase().query(this.a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new v30(th);
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new v30(th);
        }
    }

    public static hj0 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList a = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        qj0 qj0Var = new qj0(string, parse, string3, a, blob, cursor.getString(4), cursor.getBlob(5));
        oj0 oj0Var = new oj0();
        oj0Var.a = cursor.getLong(13);
        oj0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new hj0(qj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, oj0Var);
    }

    public final ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!mc3.a(sQLiteDatabase, this.a)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(b(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void a(hj0 hj0Var) {
        a();
        try {
            a(hj0Var, this.b.getWritableDatabase());
        } catch (Throwable th) {
            throw new v30(th);
        }
    }

    public final void a(hj0 hj0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = hj0Var.a.f;
        if (bArr == null) {
            bArr = mc3.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hj0Var.a.b);
        contentValues.put("mime_type", hj0Var.a.d);
        contentValues.put("uri", hj0Var.a.c.toString());
        List list = hj0Var.a.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            z43 z43Var = (z43) list.get(i);
            sb.append(z43Var.b);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(z43Var.c);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(z43Var.d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", hj0Var.a.g);
        contentValues.put("data", hj0Var.a.h);
        contentValues.put("state", Integer.valueOf(hj0Var.b));
        contentValues.put("start_time_ms", Long.valueOf(hj0Var.c));
        contentValues.put("update_time_ms", Long.valueOf(hj0Var.d));
        contentValues.put("content_length", Long.valueOf(hj0Var.e));
        contentValues.put("stop_reason", Integer.valueOf(hj0Var.f));
        contentValues.put("failure_reason", Integer.valueOf(hj0Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(hj0Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(hj0Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    public final void a(int i, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.getWritableDatabase().update(this.a, contentValues, e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new v30(th);
        }
    }
}
