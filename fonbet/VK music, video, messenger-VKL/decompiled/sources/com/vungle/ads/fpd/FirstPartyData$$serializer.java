package com.vungle.ads.fpd;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.jdz;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes7.dex */
public final class FirstPartyData$$serializer implements vht<FirstPartyData> {
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        xfb0Var.j("model_version", true);
        xfb0Var.j("session_context", true);
        xfb0Var.j("demographic", true);
        xfb0Var.j("location", true);
        xfb0Var.j("revenue", true);
        xfb0Var.j("custom_data", true);
        descriptor = xfb0Var;
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, xn8.a(SessionContext$$serializer.INSTANCE), xn8.a(Demographic$$serializer.INSTANCE), xn8.a(Location$$serializer.INSTANCE), xn8.a(Revenue$$serializer.INSTANCE), xn8.a(new jdz(oqm0Var, oqm0Var))};
    }

    @Override // xsna.a3m
    public FirstPartyData deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        Object obj3 = null;
        String str = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int m = d.m(descriptor2);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = d.u(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    obj = d.i(descriptor2, 1, SessionContext$$serializer.INSTANCE, obj);
                    i |= 2;
                    break;
                case 2:
                    obj2 = d.i(descriptor2, 2, Demographic$$serializer.INSTANCE, obj2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = d.i(descriptor2, 3, Location$$serializer.INSTANCE, obj3);
                    i |= 8;
                    break;
                case 4:
                    obj4 = d.i(descriptor2, 4, Revenue$$serializer.INSTANCE, obj4);
                    i |= 16;
                    break;
                case 5:
                    oqm0 oqm0Var = oqm0.a;
                    obj5 = d.i(descriptor2, 5, new jdz(oqm0Var, oqm0Var), obj5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(descriptor2);
        return new FirstPartyData(i, str, (SessionContext) obj, (Demographic) obj2, (Location) obj3, (Revenue) obj4, (Map) obj5, null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, FirstPartyData firstPartyData) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        FirstPartyData.write$Self(firstPartyData, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
