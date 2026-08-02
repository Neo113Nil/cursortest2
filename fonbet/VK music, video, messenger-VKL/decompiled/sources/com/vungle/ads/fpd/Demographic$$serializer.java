package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes7.dex */
public final class Demographic$$serializer implements vht<Demographic> {
    public static final Demographic$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Demographic$$serializer demographic$$serializer = new Demographic$$serializer();
        INSTANCE = demographic$$serializer;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.fpd.Demographic", demographic$$serializer, 2);
        xfb0Var.j("age_range", true);
        xfb0Var.j("gender", true);
        descriptor = xfb0Var;
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        n9x n9xVar = n9x.a;
        return new KSerializer[]{xn8.a(n9xVar), xn8.a(n9xVar)};
    }

    @Override // xsna.a3m
    public Demographic deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        while (z) {
            int m = d.m(descriptor2);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj = d.i(descriptor2, 0, n9x.a, obj);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                obj2 = d.i(descriptor2, 1, n9x.a, obj2);
                i |= 2;
            }
        }
        d.e(descriptor2);
        return new Demographic(i, (Integer) obj, (Integer) obj2, null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, Demographic demographic) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        Demographic.write$Self(demographic, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
