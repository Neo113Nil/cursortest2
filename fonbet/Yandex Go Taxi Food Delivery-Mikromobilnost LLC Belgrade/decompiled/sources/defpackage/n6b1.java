package defpackage;

import java.util.ArrayList;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public abstract class n6b1 {
    public static mgv a;

    public static final void a(hk2 hk2Var, String str, String str2) {
        if (str2.length() <= 0) {
            lxv.a("alternateText can't be an empty string.");
        }
        gk2 gk2Var = new gk2(new wsu0(str), hk2Var.a.length(), 0, 4);
        ArrayList arrayList = hk2Var.b;
        arrayList.add(gk2Var);
        hk2Var.c.add(gk2Var);
        arrayList.size();
        hk2Var.d(str2);
        hk2Var.f();
    }

    public static final boolean c(ap5 ap5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        long c = ap5Var.c();
        o430 o430Var = e3n.b;
        return currentTimeMillis < e3n.e(kp50.U(ap5Var.d(), DurationUnit.SECONDS)) + c;
    }
}
