package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.mqr;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes7.dex */
public final class SessionContext$$serializer implements vht<SessionContext> {
    public static final SessionContext$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SessionContext$$serializer sessionContext$$serializer = new SessionContext$$serializer();
        INSTANCE = sessionContext$$serializer;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.fpd.SessionContext", sessionContext$$serializer, 1);
        xfb0Var.j("level_percentile", true);
        descriptor = xfb0Var;
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{xn8.a(mqr.a)};
    }

    @Override // xsna.a3m
    public SessionContext deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        boolean z = true;
        int i = 0;
        Object obj = null;
        while (z) {
            int m = d.m(descriptor2);
            if (m == -1) {
                z = false;
            } else {
                if (m != 0) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(descriptor2, 0, mqr.a, obj);
                i = 1;
            }
        }
        d.e(descriptor2);
        return new SessionContext(i, (Float) obj, null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, SessionContext sessionContext) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        SessionContext.write$Self(sessionContext, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
