package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class jz91 implements ip60 {
    public static final jz91 a = new jz91();
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
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("durationMs", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("autoManageModelOnBackground", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
        bf91 bf91Var5 = new bf91();
        bf91Var5.a = 5;
        f = new lxq("autoManageModelOnLowMemory", x4e.u(uw51.n(sf91.class, bf91Var5.a())));
        bf91 bf91Var6 = new bf91();
        bf91Var6.a = 6;
        g = new lxq("isNnApiEnabled", x4e.u(uw51.n(sf91.class, bf91Var6.a())));
        bf91 bf91Var7 = new bf91();
        bf91Var7.a = 7;
        h = new lxq("eventsCount", x4e.u(uw51.n(sf91.class, bf91Var7.a())));
        bf91 bf91Var8 = new bf91();
        bf91Var8.a = 8;
        i = new lxq("otherErrors", x4e.u(uw51.n(sf91.class, bf91Var8.a())));
        bf91 bf91Var9 = new bf91();
        bf91Var9.a = 9;
        j = new lxq("remoteConfigValueForAcceleration", x4e.u(uw51.n(sf91.class, bf91Var9.a())));
        bf91 bf91Var10 = new bf91();
        bf91Var10.a = 10;
        k = new lxq("isAccelerated", x4e.u(uw51.n(sf91.class, bf91Var10.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        uoa1 uoa1Var = (uoa1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, uoa1Var.a);
        jp60Var.f(c, uoa1Var.b);
        jp60Var.f(d, uoa1Var.c);
        jp60Var.f(e, uoa1Var.d);
        jp60Var.f(f, uoa1Var.e);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, null);
        jp60Var.f(j, null);
        jp60Var.f(k, null);
    }
}
