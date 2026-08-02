package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class q1 implements vht {
    public static final q1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        q1 q1Var = new q1();
        a = q1Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.CommonRequestBody.User", q1Var, 5);
        xfb0Var.j("gdpr", true);
        xfb0Var.j("ccpa", true);
        xfb0Var.j("coppa", true);
        xfb0Var.j("fpd", true);
        xfb0Var.j("iab", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xn8.a(e1.a), xn8.a(u0.a), xn8.a(x0.a), xn8.a(FirstPartyData$$serializer.INSTANCE), xn8.a(h1.a)};
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
                obj5 = d.i(xfb0Var, 0, e1.a, obj5);
                i |= 1;
            } else if (m == 1) {
                obj4 = d.i(xfb0Var, 1, u0.a, obj4);
                i |= 2;
            } else if (m == 2) {
                obj3 = d.i(xfb0Var, 2, x0.a, obj3);
                i |= 4;
            } else if (m == 3) {
                obj2 = d.i(xfb0Var, 3, FirstPartyData$$serializer.INSTANCE, obj2);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 4, h1.a, obj);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new s1(i, (g1) obj5, (w0) obj4, (z0) obj3, (FirstPartyData) obj2, (j1) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        s1.a((s1) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
