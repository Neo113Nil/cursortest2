package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ArraySet.kt */
/* loaded from: classes.dex */
public final class fl3 implements fv10 {
    public static final int A(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static final Integer B(Cursor cursor, String str) {
        if (H(cursor, str)) {
            return null;
        }
        return Integer.valueOf(A(cursor, str));
    }

    public static final long C(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    public static final Long D(Cursor cursor, String str) {
        if (H(cursor, str)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
    }

    public static final String E(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static final String F(Cursor cursor, String str) {
        if (H(cursor, str)) {
            return null;
        }
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static final int G(el3 el3Var, Object obj, int i) {
        int i2 = el3Var.d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int b = ey2.b(i2, i, el3Var.b);
            if (b < 0 || epx.f(obj, el3Var.c[b])) {
                return b;
            }
            int i3 = b + 1;
            while (i3 < i2 && el3Var.b[i3] == i) {
                if (epx.f(obj, el3Var.c[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = b - 1; i4 >= 0 && el3Var.b[i4] == i; i4--) {
                if (epx.f(obj, el3Var.c[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean H(Cursor cursor, String str) {
        return cursor.isNull(cursor.getColumnIndexOrThrow(str));
    }

    public static final Boolean I(Cursor cursor) {
        Boolean bool;
        try {
            if (cursor.moveToFirst()) {
                bool = Boolean.valueOf(cursor.getInt(0) != 0);
            } else {
                bool = null;
            }
            return bool;
        } finally {
            cursor.close();
        }
    }

    public static final Integer J(Cursor cursor) {
        try {
            Integer num = null;
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                num = Integer.valueOf(cursor.getInt(0));
            }
            return num;
        } finally {
            cursor.close();
        }
    }

    public static final Long K(Cursor cursor) {
        try {
            Long l = null;
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                l = Long.valueOf(cursor.getLong(0));
            }
            return l;
        } finally {
            cursor.close();
        }
    }

    public static final Object i(Cursor cursor, izs izsVar) {
        try {
            return izsVar.invoke(new kjt(new nid0(cursor, 8), new l850(cursor, 13)));
        } finally {
            if (!cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    public static final String j(Cursor cursor) {
        try {
            String str = null;
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                str = cursor.getString(0);
            }
            return str;
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0065, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(SQLiteDatabase sQLiteDatabase, izs izsVar) {
        Trace.beginSection(ndp0.f("SQLiteDatabase.execTransaction"));
        try {
            Trace.beginSection(ndp0.f("SQLiteDatabase.beginTransactionNonExclusive"));
            sQLiteDatabase.beginTransactionNonExclusive();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            Trace.beginSection(ndp0.f("SQLiteDatabase.execTransaction action"));
            try {
                izsVar.invoke(sQLiteDatabase);
                Trace.endSection();
                sQLiteDatabase.setTransactionSuccessful();
                Trace.beginSection(ndp0.f("SQLiteDatabase.endTransaction()"));
                sQLiteDatabase.endTransaction();
                Trace.endSection();
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    public static final ArrayList l(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        ArrayList arrayList = new ArrayList(rawQuery.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        arrayList.add(rawQuery.getString(0));
                        rawQuery.moveToNext();
                    }
                }
                rawQuery.close();
                s3q0 s3q0Var = s3q0.a;
                return arrayList;
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final byte[] v(Cursor cursor, String str) {
        if (H(cursor, str)) {
            return null;
        }
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }

    public static final boolean w(Cursor cursor, int i) {
        return cursor.getInt(i) != 0;
    }

    public static final boolean x(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    public static final Boolean y(Cursor cursor, String str) {
        if (H(cursor, str)) {
            return null;
        }
        return Boolean.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0);
    }

    @Override // xsna.fv10
    public ur4 b() {
        return null;
    }

    @Override // xsna.fv10
    public SpeakerType f() {
        return SpeakerType.OUTER;
    }

    @Override // xsna.fv10
    public float getVolume() {
        return 1.0f;
    }

    @Override // xsna.fv10
    public boolean isPlaying() {
        return false;
    }

    @Override // xsna.fv10
    public boolean m() {
        return false;
    }

    @Override // xsna.fv10
    public List n() {
        return EmptyList.b;
    }

    @Override // xsna.fv10
    public float o() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.fv10
    public boolean s() {
        return false;
    }

    @Override // xsna.fv10
    public boolean t() {
        return false;
    }

    @Override // xsna.fv10
    public boolean u() {
        return false;
    }

    @Override // xsna.fv10
    public Speed z() {
        return Speed.X1;
    }

    @Override // xsna.fv10
    public void e(lza0 lza0Var) {
    }

    @Override // xsna.fv10
    public void h(hv10 hv10Var) {
    }

    @Override // xsna.fv10
    public void p(bgk0 bgk0Var) {
    }

    @Override // xsna.fv10
    public void q(bgk0 bgk0Var) {
    }

    @Override // xsna.fv10
    public void a(lza0 lza0Var, float f) {
    }

    @Override // xsna.fv10
    public void c(bgk0 bgk0Var, Speed speed) {
    }

    @Override // xsna.fv10
    public void d(bgk0 bgk0Var, SpeakerType speakerType) {
    }

    @Override // xsna.fv10
    public void g(bgk0 bgk0Var, ur4 ur4Var) {
    }

    @Override // xsna.fv10
    public void r(bgk0 bgk0Var, List list) {
    }
}
