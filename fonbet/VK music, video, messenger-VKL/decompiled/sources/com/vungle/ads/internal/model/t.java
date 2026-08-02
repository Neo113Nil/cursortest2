package com.vungle.ads.internal.model;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.jdz;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class t implements vht {
    public static final t a;
    public static final /* synthetic */ xfb0 b;

    static {
        t tVar = new t();
        a = tVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload.TemplateSettings", tVar, 2);
        xfb0Var.j("normal_replacements", true);
        xfb0Var.j("cacheable_replacements", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(new jdz(oqm0Var, oqm0Var)), xn8.a(new jdz(oqm0Var, m.a))};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Object obj2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                oqm0 oqm0Var = oqm0.a;
                obj2 = d.i(xfb0Var, 0, new jdz(oqm0Var, oqm0Var), obj2);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 1, new jdz(oqm0.a, m.a), obj);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new v(i, (Map) obj2, (Map) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        v.a((v) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
