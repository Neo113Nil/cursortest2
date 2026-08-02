package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

@ozl
/* loaded from: classes7.dex */
public final class Location$$serializer implements vht<Location> {
    public static final Location$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Location$$serializer location$$serializer = new Location$$serializer();
        INSTANCE = location$$serializer;
        descriptor = new xfb0("com.vungle.ads.fpd.Location", location$$serializer, 0);
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // xsna.a3m
    public Location deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        int m = d.m(descriptor2);
        if (m != -1) {
            throw new UnknownFieldException(m);
        }
        d.e(descriptor2);
        return new Location(0, null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, Location location) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        Location.write$Self(location, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
