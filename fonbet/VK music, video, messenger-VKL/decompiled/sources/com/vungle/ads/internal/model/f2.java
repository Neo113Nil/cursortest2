package com.vungle.ads.internal.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class f2 implements vht {
    public static final f2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        f2 f2Var = new f2();
        a = f2Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.ConfigPayload.Endpoints", f2Var, 5);
        xfb0Var.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        xfb0Var.j("ri", true);
        xfb0Var.j("error_logs", true);
        xfb0Var.j("metrics", true);
        xfb0Var.j("csb", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj5 = d.i(xfb0Var, 0, oqm0.a, obj5);
                i |= 1;
            } else if (m == 1) {
                obj4 = d.i(xfb0Var, 1, oqm0.a, obj4);
                i |= 2;
            } else if (m == 2) {
                obj3 = d.i(xfb0Var, 2, oqm0.a, obj3);
                i |= 4;
            } else if (m == 3) {
                obj2 = d.i(xfb0Var, 3, oqm0.a, obj2);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 4, oqm0.a, obj);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new h2(i, (String) obj5, (String) obj4, (String) obj3, (String) obj2, (String) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        h2.a((h2) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
