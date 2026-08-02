package com.vungle.ads.internal.model;

import com.ironsource.C4497pd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class u1 implements vht {
    public static final u1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        u1 u1Var = new u1();
        a = u1Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.ConfigPayload", u1Var, 18);
        xfb0Var.j("reuse_assets", true);
        xfb0Var.j("config", true);
        xfb0Var.j("endpoints", true);
        xfb0Var.j("log_metrics", true);
        xfb0Var.j(C4497pd.c, true);
        xfb0Var.j("user", true);
        xfb0Var.j("config_extension", true);
        xfb0Var.j("disable_ad_id", true);
        xfb0Var.j("ri_enabled", true);
        xfb0Var.j("session_timeout", true);
        xfb0Var.j("wait_for_connectivity_for_tpat", true);
        xfb0Var.j("sdk_session_timeout", true);
        xfb0Var.j("signals_disabled", true);
        xfb0Var.j("fpd_enabled", true);
        xfb0Var.j("rta_debugging", true);
        xfb0Var.j("config_last_validated_ts", true);
        xfb0Var.j("auto_redirect", true);
        xfb0Var.j("enable_ot", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer a2 = xn8.a(y1.a);
        KSerializer a3 = xn8.a(c2.a);
        KSerializer a4 = xn8.a(f2.a);
        KSerializer a5 = xn8.a(p2.a);
        KSerializer a6 = xn8.a(new yk3(g3.a));
        KSerializer a7 = xn8.a(s2.a);
        KSerializer a8 = xn8.a(oqm0.a);
        g18 g18Var = g18.a;
        KSerializer a9 = xn8.a(g18Var);
        KSerializer a10 = xn8.a(g18Var);
        n9x n9xVar = n9x.a;
        return new KSerializer[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, xn8.a(n9xVar), xn8.a(g18Var), xn8.a(n9xVar), xn8.a(g18Var), xn8.a(g18Var), xn8.a(g18Var), xn8.a(u500.a), xn8.a(v1.a), xn8.a(g18Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        Object obj;
        h2 h2Var;
        int i;
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj2 = null;
        List list = null;
        u2 u2Var = null;
        x1 x1Var = null;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        Boolean bool4 = null;
        Integer num2 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str = null;
        r2 r2Var = null;
        h2 h2Var2 = null;
        e2 e2Var = null;
        a2 a2Var = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            List list2 = list;
            int m = d.m(xfb0Var);
            u2 u2Var2 = u2Var;
            switch (m) {
                case -1:
                    z = false;
                    u2Var = u2Var2;
                    list = list2;
                case 0:
                    obj = obj2;
                    h2Var = h2Var2;
                    u2Var2 = u2Var2;
                    list2 = list2;
                    a2Var = d.i(xfb0Var, 0, y1.a, a2Var);
                    i = 1;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 1:
                    obj = obj2;
                    h2Var = h2Var2;
                    u2Var2 = u2Var2;
                    list2 = list2;
                    e2Var = d.i(xfb0Var, 1, c2.a, e2Var);
                    i = 2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 2:
                    obj = obj2;
                    u2Var2 = u2Var2;
                    list2 = list2;
                    h2Var = d.i(xfb0Var, 2, f2.a, h2Var2);
                    i = 4;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 3:
                    obj = obj2;
                    u2Var2 = u2Var2;
                    list2 = list2;
                    r2Var = d.i(xfb0Var, 3, p2.a, r2Var);
                    h2Var = h2Var2;
                    i = 8;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 4:
                    obj = obj2;
                    h2Var = h2Var2;
                    u2Var2 = u2Var2;
                    i = 16;
                    list2 = d.i(xfb0Var, 4, new yk3(g3.a), list2);
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 5:
                    obj = obj2;
                    i = 32;
                    u2Var2 = d.i(xfb0Var, 5, s2.a, u2Var2);
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 6:
                    i = 64;
                    str = d.i(xfb0Var, 6, oqm0.a, str);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 7:
                    i = 128;
                    bool6 = d.i(xfb0Var, 7, g18.a, bool6);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 8:
                    i = 256;
                    bool5 = d.i(xfb0Var, 8, g18.a, bool5);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 9:
                    i = 512;
                    num2 = d.i(xfb0Var, 9, n9x.a, num2);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 10:
                    i = 1024;
                    bool4 = d.i(xfb0Var, 10, g18.a, bool4);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 11:
                    i = 2048;
                    num = d.i(xfb0Var, 11, n9x.a, num);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 12:
                    i = 4096;
                    bool3 = d.i(xfb0Var, 12, g18.a, bool3);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 13:
                    i = 8192;
                    bool2 = d.i(xfb0Var, 13, g18.a, bool2);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 14:
                    i = 16384;
                    bool = d.i(xfb0Var, 14, g18.a, bool);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 15:
                    i = 32768;
                    l = d.i(xfb0Var, 15, u500.a, l);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 16:
                    i = 65536;
                    x1Var = d.i(xfb0Var, 16, v1.a, x1Var);
                    obj = obj2;
                    h2Var = h2Var2;
                    i2 |= i;
                    h2Var2 = h2Var;
                    list = list2;
                    u2Var = u2Var2;
                    obj2 = obj;
                case 17:
                    obj2 = d.i(xfb0Var, 17, g18.a, obj2);
                    i2 |= 131072;
                    list = list2;
                    u2Var = u2Var2;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        u2 u2Var3 = u2Var;
        d.e(xfb0Var);
        return new v2(i2, a2Var, e2Var, h2Var2, r2Var, list, u2Var3, str, bool6, bool5, num2, bool4, num, bool3, bool2, bool, l, x1Var, (Boolean) obj2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        v2.a((v2) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
