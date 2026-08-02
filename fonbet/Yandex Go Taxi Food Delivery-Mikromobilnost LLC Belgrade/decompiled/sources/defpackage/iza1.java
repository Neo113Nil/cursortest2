package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class iza1 implements ip60 {
    public static final iza1 a = new iza1();
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
    public static final lxq l;
    public static final lxq m;
    public static final lxq n;
    public static final lxq o;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("appId", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("appVersion", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("firebaseProjectId", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
        pf91 pf91Var4 = new pf91();
        pf91Var4.a = 4;
        e = new lxq("mlSdkVersion", x4e.u(uw51.o(dg91.class, pf91Var4.a())));
        pf91 pf91Var5 = new pf91();
        pf91Var5.a = 5;
        f = new lxq("tfliteSchemaVersion", x4e.u(uw51.o(dg91.class, pf91Var5.a())));
        pf91 pf91Var6 = new pf91();
        pf91Var6.a = 6;
        g = new lxq("gcmSenderId", x4e.u(uw51.o(dg91.class, pf91Var6.a())));
        pf91 pf91Var7 = new pf91();
        pf91Var7.a = 7;
        h = new lxq(Constants.KEY_API_KEY, x4e.u(uw51.o(dg91.class, pf91Var7.a())));
        pf91 pf91Var8 = new pf91();
        pf91Var8.a = 8;
        i = new lxq("languages", x4e.u(uw51.o(dg91.class, pf91Var8.a())));
        pf91 pf91Var9 = new pf91();
        pf91Var9.a = 9;
        j = new lxq("mlSdkInstanceId", x4e.u(uw51.o(dg91.class, pf91Var9.a())));
        pf91 pf91Var10 = new pf91();
        pf91Var10.a = 10;
        k = new lxq("isClearcutClient", x4e.u(uw51.o(dg91.class, pf91Var10.a())));
        pf91 pf91Var11 = new pf91();
        pf91Var11.a = 11;
        l = new lxq("isStandaloneMlkit", x4e.u(uw51.o(dg91.class, pf91Var11.a())));
        pf91 pf91Var12 = new pf91();
        pf91Var12.a = 12;
        m = new lxq("isJsonLogging", x4e.u(uw51.o(dg91.class, pf91Var12.a())));
        pf91 pf91Var13 = new pf91();
        pf91Var13.a = 13;
        n = new lxq("buildLevel", x4e.u(uw51.o(dg91.class, pf91Var13.a())));
        pf91 pf91Var14 = new pf91();
        pf91Var14.a = 14;
        o = new lxq("optionalModuleVersion", x4e.u(uw51.o(dg91.class, pf91Var14.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        opb1 opb1Var = (opb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, opb1Var.a);
        jp60Var.f(c, opb1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, opb1Var.c);
        jp60Var.f(f, opb1Var.d);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, opb1Var.e);
        jp60Var.f(j, opb1Var.f);
        jp60Var.f(k, opb1Var.g);
        jp60Var.f(l, opb1Var.h);
        jp60Var.f(m, opb1Var.i);
        jp60Var.f(n, opb1Var.j);
        jp60Var.f(o, opb1Var.k);
    }
}
