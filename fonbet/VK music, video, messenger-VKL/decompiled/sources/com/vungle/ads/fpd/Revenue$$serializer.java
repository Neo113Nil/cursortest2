package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.mqr;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes7.dex */
public final class Revenue$$serializer implements vht<Revenue> {
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.fpd.Revenue", revenue$$serializer, 4);
        xfb0Var.j("iaa_revenue_usd", true);
        xfb0Var.j("iap_revenue_usd", true);
        xfb0Var.j("total_revenue_usd", true);
        xfb0Var.j("is_user_a_purchaser", true);
        descriptor = xfb0Var;
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        mqr mqrVar = mqr.a;
        return new KSerializer[]{xn8.a(mqrVar), xn8.a(mqrVar), xn8.a(mqrVar), xn8.a(g18.a)};
    }

    @Override // xsna.a3m
    public Revenue deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int m = d.m(descriptor2);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                obj = d.i(descriptor2, 0, mqr.a, obj);
                i |= 1;
            } else if (m == 1) {
                obj2 = d.i(descriptor2, 1, mqr.a, obj2);
                i |= 2;
            } else if (m == 2) {
                obj3 = d.i(descriptor2, 2, mqr.a, obj3);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                obj4 = d.i(descriptor2, 3, g18.a, obj4);
                i |= 8;
            }
        }
        d.e(descriptor2);
        return new Revenue(i, (Float) obj, (Float) obj2, (Float) obj3, (Boolean) obj4, null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, Revenue revenue) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        Revenue.write$Self(revenue, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
