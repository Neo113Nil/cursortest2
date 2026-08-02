package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class dba1 implements ip60 {
    public static final dba1 a = new dba1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;
    public static final lxq h;
    public static final lxq i;
    public static final lxq j;
    public static final lxq k;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("durationMs", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
        pf91 pf91Var4 = new pf91();
        pf91Var4.a = 4;
        e = new lxq("autoManageModelOnBackground", x4e.u(uw51.o(dg91.class, pf91Var4.a())));
        pf91 pf91Var5 = new pf91();
        pf91Var5.a = 5;
        f = new lxq("autoManageModelOnLowMemory", x4e.u(uw51.o(dg91.class, pf91Var5.a())));
        pf91 pf91Var6 = new pf91();
        pf91Var6.a = 6;
        g = new lxq("isNnApiEnabled", x4e.u(uw51.o(dg91.class, pf91Var6.a())));
        pf91 pf91Var7 = new pf91();
        pf91Var7.a = 7;
        h = new lxq("eventsCount", x4e.u(uw51.o(dg91.class, pf91Var7.a())));
        pf91 pf91Var8 = new pf91();
        pf91Var8.a = 8;
        i = new lxq("otherErrors", x4e.u(uw51.o(dg91.class, pf91Var8.a())));
        pf91 pf91Var9 = new pf91();
        pf91Var9.a = 9;
        j = new lxq("remoteConfigValueForAcceleration", x4e.u(uw51.o(dg91.class, pf91Var9.a())));
        pf91 pf91Var10 = new pf91();
        pf91Var10.a = 10;
        k = new lxq("isAccelerated", x4e.u(uw51.o(dg91.class, pf91Var10.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        h9b1 h9b1Var = (h9b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, h9b1Var.a);
        jp60Var.f(c, h9b1Var.b);
        jp60Var.f(d, h9b1Var.c);
        jp60Var.f(e, h9b1Var.d);
        jp60Var.f(f, h9b1Var.e);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, null);
        jp60Var.f(j, null);
        jp60Var.f(k, null);
    }
}
