package xsna;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: DatabaseStorage.kt */
/* loaded from: classes11.dex */
public final class xwk {
    public static bpn0 a;
    public static bpn0 b;

    public static float a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int b(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final void c(SQLiteDatabase sQLiteDatabase, izs izsVar) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            izsVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static final qdz d() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (qdz) bpn0Var.getValue();
    }

    public static final o0r0 e() {
        bpn0 bpn0Var = b;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (o0r0) bpn0Var.getValue();
    }

    public static final boolean f(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }
}
