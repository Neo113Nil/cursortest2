package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CacheFileMetadataIndex.java */
/* loaded from: classes.dex */
public final class tw8 implements p7f0 {
    public static final String[] d = {"name", "length", "last_touch_timestamp"};
    public final Object b;
    public Object c;

    public tw8(fwk fwkVar, pgn pgnVar) {
        this.b = fwkVar;
        this.c = pgnVar;
    }

    public HashMap a() throws DatabaseIOException {
        try {
            ((String) this.c).getClass();
            Cursor query = ((swk) this.b).getReadableDatabase().query((String) this.c, d, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new sw8(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public String b() {
        String s;
        s = Preference.s((String) this.c, (String) this.b, new String());
        return s;
    }

    public void c(long j) throws DatabaseIOException {
        swk swkVar = (swk) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (bor0.a(swkVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = swkVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    bor0.c(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r8.booleanValue() != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(String str) {
        boolean z;
        boolean z2;
        pgn pgnVar = (pgn) this.c;
        synchronized (pgnVar) {
            Iterator it = ((ArrayList) pgnVar.b).iterator();
            z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (TextUtils.equals(((q93) it.next()).a, str)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                ((ArrayList) pgnVar.b).remove(i);
                z = true;
            }
        }
        if (z) {
            return true;
        }
        fwk fwkVar = (fwk) this.b;
        fwkVar.getClass();
        try {
            io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new dwk(0, fwkVar, str));
            asu0 asu0Var = asu0.a;
            Boolean bool = (Boolean) itg0.d(s0Var.r0(asu0Var.c()), 3000L);
            Boolean bool2 = (Boolean) itg0.d(new io.reactivex.rxjava3.internal.operators.observable.s0(new ewk(0, fwkVar, str)).r0(asu0Var.c()), 3000L);
            if (!bool.booleanValue()) {
            }
            z2 = true;
        } catch (Exception unused) {
        }
        return !z2;
        z2 = false;
        if (!z2) {
        }
    }

    public void e(Set set) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((swk) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void f(long j, long j2, String str) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((swk) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void g(String str) {
        Preference.H((String) this.c, (String) this.b, str);
    }

    @Override // xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return b();
    }

    @Override // xsna.p7f0
    public /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Object obj2) {
        g((String) obj2);
    }

    public tw8(String str, String str2) {
        this.c = str;
        this.b = str2;
    }

    public tw8(swk swkVar) {
        this.b = swkVar;
    }
}
