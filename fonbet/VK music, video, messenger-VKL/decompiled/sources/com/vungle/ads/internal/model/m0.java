package com.vungle.ads.internal.model;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class m0 implements vht {
    public static final m0 a;
    public static final /* synthetic */ xfb0 b;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.BidPayload", m0Var, 4);
        xfb0Var.j("version", true);
        xfb0Var.j("adunit", true);
        xfb0Var.j("impression", true);
        xfb0Var.j("ad", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer a2 = xn8.a(n9x.a);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{a2, xn8.a(oqm0Var), xn8.a(new yk3(oqm0Var)), xn8.a(c.a)};
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
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj4 = d.i(xfb0Var, 0, n9x.a, obj4);
                i |= 1;
            } else if (m == 1) {
                obj3 = d.i(xfb0Var, 1, oqm0.a, obj3);
                i |= 2;
            } else if (m == 2) {
                obj2 = d.i(xfb0Var, 2, new yk3(oqm0.a), obj2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 3, c.a, obj);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new p0(i, (Integer) obj4, (String) obj3, (List) obj2, (h0) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        p0.a((p0) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
