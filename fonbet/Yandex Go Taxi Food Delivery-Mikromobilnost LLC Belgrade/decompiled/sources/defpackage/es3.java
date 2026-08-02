package defpackage;

import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes11.dex */
public final class es3 implements ip60 {
    public static final es3 a = new es3();
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
    public static final lxq p;

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        b = new lxq("projectNumber", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 2;
        c = new lxq("messageId", x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
        nb3 nb3Var3 = new nb3();
        nb3Var3.a = 3;
        d = new lxq("instanceId", x4e.u(x4e.o(dvf0.class, nb3Var3.a())));
        nb3 nb3Var4 = new nb3();
        nb3Var4.a = 4;
        e = new lxq("messageType", x4e.u(x4e.o(dvf0.class, nb3Var4.a())));
        nb3 nb3Var5 = new nb3();
        nb3Var5.a = 5;
        f = new lxq("sdkPlatform", x4e.u(x4e.o(dvf0.class, nb3Var5.a())));
        nb3 nb3Var6 = new nb3();
        nb3Var6.a = 6;
        g = new lxq("packageName", x4e.u(x4e.o(dvf0.class, nb3Var6.a())));
        nb3 nb3Var7 = new nb3();
        nb3Var7.a = 7;
        h = new lxq("collapseKey", x4e.u(x4e.o(dvf0.class, nb3Var7.a())));
        nb3 nb3Var8 = new nb3();
        nb3Var8.a = 8;
        i = new lxq("priority", x4e.u(x4e.o(dvf0.class, nb3Var8.a())));
        nb3 nb3Var9 = new nb3();
        nb3Var9.a = 9;
        j = new lxq("ttl", x4e.u(x4e.o(dvf0.class, nb3Var9.a())));
        nb3 nb3Var10 = new nb3();
        nb3Var10.a = 10;
        k = new lxq("topic", x4e.u(x4e.o(dvf0.class, nb3Var10.a())));
        nb3 nb3Var11 = new nb3();
        nb3Var11.a = 11;
        l = new lxq("bulkId", x4e.u(x4e.o(dvf0.class, nb3Var11.a())));
        nb3 nb3Var12 = new nb3();
        nb3Var12.a = 12;
        m = new lxq(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, x4e.u(x4e.o(dvf0.class, nb3Var12.a())));
        nb3 nb3Var13 = new nb3();
        nb3Var13.a = 13;
        n = new lxq("analyticsLabel", x4e.u(x4e.o(dvf0.class, nb3Var13.a())));
        nb3 nb3Var14 = new nb3();
        nb3Var14.a = 14;
        o = new lxq("campaignId", x4e.u(x4e.o(dvf0.class, nb3Var14.a())));
        nb3 nb3Var15 = new nb3();
        nb3Var15.a = 15;
        p = new lxq("composerLabel", x4e.u(x4e.o(dvf0.class, nb3Var15.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        oz10 oz10Var = (oz10) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, oz10Var.a);
        jp60Var.f(c, oz10Var.b);
        jp60Var.f(d, oz10Var.c);
        jp60Var.f(e, oz10Var.d);
        jp60Var.f(f, oz10Var.e);
        jp60Var.f(g, oz10Var.f);
        jp60Var.f(h, oz10Var.g);
        jp60Var.c(i, oz10Var.h);
        jp60Var.c(j, oz10Var.i);
        jp60Var.f(k, oz10Var.j);
        jp60Var.e(l, 0L);
        jp60Var.f(m, oz10Var.k);
        jp60Var.f(n, oz10Var.l);
        jp60Var.e(o, 0L);
        jp60Var.f(p, oz10Var.m);
    }
}
