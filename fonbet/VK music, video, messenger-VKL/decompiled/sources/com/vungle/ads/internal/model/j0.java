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
public final class j0 implements vht {
    public static final j0 a;
    public static final /* synthetic */ xfb0 b;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AppNode", j0Var, 3);
        xfb0Var.j("bundle", false);
        xfb0Var.j("ver", false);
        xfb0Var.j("id", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, oqm0Var};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                str2 = d.u(xfb0Var, 1);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                str3 = d.u(xfb0Var, 2);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new l0(i, str, str2, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        l0.a((l0) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
