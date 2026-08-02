package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ii1 {
    public final gi1 a;
    public final hd2 b;
    public hi1 c;

    public /* synthetic */ ii1(Context context, String str) {
        this(new gi1(context, str), new hd2(context), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hi1 a() {
        Class<?> cls;
        zy0 zy0Var;
        Object a;
        gi1 gi1Var = this.a;
        qn2 qn2Var = gi1Var.b;
        String str = gi1Var.a;
        qn2Var.getClass();
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            qn2 qn2Var2 = gi1Var.b;
            Object[] objArr = {gi1Var.c};
            qn2Var2.getClass();
            Object a2 = qn2.a(cls, "getFusedLocationProviderClient", objArr);
            if (a2 != null) {
                zy0Var = new zy0(a2);
                if (zy0Var != null) {
                    return null;
                }
                boolean a3 = this.b.a("android.permission.ACCESS_COARSE_LOCATION");
                boolean a4 = this.b.a("android.permission.ACCESS_FINE_LOCATION");
                if ((a3 || a4) && (a = pn2.a(zy0Var.a, "getLastLocation", new Object[0])) != null) {
                    return new hi1(a);
                }
                return null;
            }
        }
        zy0Var = null;
        if (zy0Var != null) {
        }
    }

    public ii1(gi1 gi1Var, hd2 hd2Var, hi1 hi1Var) {
        this.a = gi1Var;
        this.b = hd2Var;
        this.c = hi1Var;
    }
}
