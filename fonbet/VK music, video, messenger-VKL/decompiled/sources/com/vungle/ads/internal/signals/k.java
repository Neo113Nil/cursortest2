package com.vungle.ads.internal.signals;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class k implements vht {
    public static final k a;
    public static final /* synthetic */ xfb0 b;

    static {
        k kVar = new k();
        a = kVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        xfb0Var.j("500", true);
        xfb0Var.j("109", false);
        xfb0Var.j("107", true);
        xfb0Var.j("110", true);
        xfb0Var.j("108", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        KSerializer a2 = xn8.a(oqm0Var);
        KSerializer a3 = xn8.a(oqm0Var);
        u500 u500Var = u500.a;
        return new KSerializer[]{a2, u500Var, a3, u500Var, n9x.a};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        int i = 0;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        Object obj2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj2 = d.i(xfb0Var, 0, oqm0.a, obj2);
                i |= 1;
            } else if (m == 1) {
                j = d.r(xfb0Var, 1);
                i |= 2;
            } else if (m == 2) {
                obj = d.i(xfb0Var, 2, oqm0.a, obj);
                i |= 4;
            } else if (m == 3) {
                j2 = d.r(xfb0Var, 3);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                i2 = d.s(xfb0Var, 4);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new m(i, (String) obj2, j, (String) obj, j2, i2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        m.a((m) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
