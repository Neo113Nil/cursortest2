package com.vungle.ads.internal.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class i2 implements vht {
    public static final i2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        i2 i2Var = new i2();
        a = i2Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", i2Var, 6);
        xfb0Var.j("is_country_data_protected", true);
        xfb0Var.j("consent_title", true);
        xfb0Var.j("consent_message", true);
        xfb0Var.j("consent_message_version", true);
        xfb0Var.j("button_accept", true);
        xfb0Var.j("button_deny", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer a2 = xn8.a(g18.a);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{a2, xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var)};
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
        Object obj6 = null;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj6 = d.i(xfb0Var, 0, g18.a, obj6);
                    i |= 1;
                    break;
                case 1:
                    obj5 = d.i(xfb0Var, 1, oqm0.a, obj5);
                    i |= 2;
                    break;
                case 2:
                    obj4 = d.i(xfb0Var, 2, oqm0.a, obj4);
                    i |= 4;
                    break;
                case 3:
                    obj3 = d.i(xfb0Var, 3, oqm0.a, obj3);
                    i |= 8;
                    break;
                case 4:
                    obj2 = d.i(xfb0Var, 4, oqm0.a, obj2);
                    i |= 16;
                    break;
                case 5:
                    obj = d.i(xfb0Var, 5, oqm0.a, obj);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new k2(i, (Boolean) obj6, (String) obj5, (String) obj4, (String) obj3, (String) obj2, (String) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        k2.a((k2) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
