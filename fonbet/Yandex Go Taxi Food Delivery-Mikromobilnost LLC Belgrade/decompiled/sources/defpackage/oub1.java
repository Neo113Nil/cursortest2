package defpackage;

import android.database.Cursor;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public abstract class oub1 {
    public static mgv a;

    public static final int a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = j73.L(cursor.getColumnNames(), null, null, null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        ny61.g(b64.l("column '", str, "' does not exist. Available columns: ", str2));
        return 0;
    }

    public static final kvj0 b(nz50 nz50Var) {
        cvj0 cvj0Var = new cvj0();
        cvj0Var.a = nub1.f(nz50Var.a);
        nvf0 nvf0Var = Protocol.Companion;
        String str = nz50Var.b.a;
        nvf0Var.getClass();
        cvj0Var.b = nvf0.a(str);
        cvj0Var.c = nz50Var.c;
        cvj0Var.d = nz50Var.d;
        xu50 xu50Var = nz50Var.e;
        keu keuVar = new keu();
        mub1.a(keuVar, xu50Var);
        cvj0Var.f = keuVar.d().d();
        cvj0Var.g = (rvj0) nz50Var.f;
        return cvj0Var.a();
    }
}
