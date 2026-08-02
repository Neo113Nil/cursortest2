package com.vungle.ads.internal.network;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.v2;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.d;
import okhttp3.k;
import okhttp3.l;
import okhttp3.p;
import okhttp3.t;
import xsna.fpf0;
import xsna.j5g;
import xsna.j8y;
import xsna.n9y;
import xsna.s1v;

/* loaded from: classes7.dex */
public final class c0 {
    public static final j8y c = n9y.a(b0.a);
    public final d.a a;
    public final com.vungle.ads.internal.network.converters.b b = new com.vungle.ads.internal.network.converters.b();

    public c0(okhttp3.o oVar) {
        this.a = oVar;
    }

    public static p.a a(c0 c0Var, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        c0Var.getClass();
        p.a aVar = new p.a();
        aVar.i(str2);
        aVar.c.b("User-Agent", str);
        aVar.c.b("Vungle-Version", "7.1.0");
        aVar.c.b("Content-Type", "application/json");
        if (map != null) {
            aVar.c = k.b.c(map).d();
        }
        if (str3 != null) {
            aVar.c.b("X-Vungle-Placement-Ref-Id", str3);
        }
        String c2 = d0.c();
        if (c2 != null) {
            aVar.c.b("X-VUNGLE-APP-VERSION", c2);
        }
        String b = d0.b();
        if (b != null) {
            aVar.c.b("X-Vungle-App-Id", b);
        }
        return aVar;
    }

    public final m b(String str, String str2, t1 t1Var) {
        try {
            j8y j8yVar = c;
            String b = j8yVar.b(s1v.p(j8yVar.b, fpf0.d(t1.class)), t1Var);
            try {
                p.a a = a(this, str, str2, null, null, 12);
                okhttp3.t.Companion.getClass();
                a.f("POST", t.a.a(b, null));
                return new m(this.a.a(a.b()), new com.vungle.ads.internal.network.converters.d(fpf0.d(v2.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m c(String str, String str2, t1 t1Var) {
        try {
            j8y j8yVar = c;
            String b = j8yVar.b(s1v.p(j8yVar.b, fpf0.d(t1.class)), t1Var);
            try {
                p.a a = a(this, str, str2, null, null, 12);
                okhttp3.t.Companion.getClass();
                a.f("POST", t.a.a(b, null));
                return new m(this.a.a(a.b()), this.b);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m b(String str, String str2, okhttp3.t tVar) {
        l.a aVar = new l.a();
        aVar.e(null, str2);
        okhttp3.l b = aVar.b().f().b();
        p.a aVar2 = new p.a();
        aVar2.a = b;
        aVar2.c.b("User-Agent", str);
        aVar2.c.b("Vungle-Version", "7.1.0");
        aVar2.c.b("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b2 = d0.b();
        if (b2 != null) {
            aVar2.c.b("X-Vungle-App-Id", b2);
        }
        String c2 = d0.c();
        if (c2 != null) {
            aVar2.c.b("X-VUNGLE-APP-VERSION", c2);
        }
        aVar2.f("POST", tVar);
        return new m(this.a.a(aVar2.b()), this.b);
    }

    public final m a(String str, String str2, t1 t1Var) {
        List a;
        try {
            j8y j8yVar = c;
            String b = j8yVar.b(s1v.p(j8yVar.b, fpf0.d(t1.class)), t1Var);
            p1 c2 = t1Var.c();
            try {
                p.a a2 = a(this, str, str2, (c2 == null || (a = c2.a()) == null) ? null : (String) j5g.a0(a), null, 8);
                okhttp3.t.Companion.getClass();
                a2.f("POST", t.a.a(b, null));
                return new m(this.a.a(a2.b()), new com.vungle.ads.internal.network.converters.d(fpf0.d(h0.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m a(String str, String str2, g gVar, Map map, okhttp3.t tVar) {
        okhttp3.p b;
        p.a a = a(this, str, str2, null, map, 4);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            a.d();
            b = a.b();
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (tVar == null) {
                tVar = t.a.d(okhttp3.t.Companion, new byte[0], null, 0, 6);
            }
            a.f("POST", tVar);
            b = a.b();
        }
        return new m(this.a.a(b), this.b);
    }

    public final m a(String str, String str2, okhttp3.t tVar) {
        l.a aVar = new l.a();
        aVar.e(null, str2);
        okhttp3.l b = aVar.b().f().b();
        p.a aVar2 = new p.a();
        aVar2.a = b;
        aVar2.c.b("User-Agent", str);
        aVar2.c.b("Vungle-Version", "7.1.0");
        aVar2.c.b("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b2 = d0.b();
        if (b2 != null) {
            aVar2.c.b("X-Vungle-App-Id", b2);
        }
        String c2 = d0.c();
        if (c2 != null) {
            aVar2.c.b("X-VUNGLE-APP-VERSION", c2);
        }
        aVar2.f("POST", tVar);
        return new m(this.a.a(aVar2.b()), this.b);
    }

    public final m a(okhttp3.t tVar) {
        l.a aVar = new l.a();
        aVar.e(null, "https://events.ads.vungle.com/rtadebugging");
        p.a a = a(this, "debug", aVar.b().f().b().i, null, null, 12);
        a.f("POST", tVar);
        return new m(this.a.a(a.b()), this.b);
    }
}
