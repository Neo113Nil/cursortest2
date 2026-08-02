package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.vht;
import xsna.x1o0;
import xsna.yrp;

/* loaded from: classes7.dex */
public final class e implements vht {
    public static final e a = new e();
    public static final /* synthetic */ yrp b;

    static {
        yrp yrpVar = new yrp("com.vungle.ads.internal.network.HttpMethod", 2);
        yrpVar.j("GET", false);
        yrpVar.j("POST", false);
        b = yrpVar;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return g.values()[decoder.j(b)];
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(b, ((g) obj).ordinal());
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
