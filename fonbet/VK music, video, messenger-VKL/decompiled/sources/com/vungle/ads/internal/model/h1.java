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

/* loaded from: classes7.dex */
public final class h1 implements vht {
    public static final h1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        h1 h1Var = new h1();
        a = h1Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.CommonRequestBody.IAB", h1Var, 1);
        xfb0Var.j("tcf", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oqm0.a};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else {
                if (m != 0) {
                    throw new UnknownFieldException(m);
                }
                str = d.u(xfb0Var, 0);
                i = 1;
            }
        }
        d.e(xfb0Var);
        return new j1(i, str);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        j1.a((j1) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
