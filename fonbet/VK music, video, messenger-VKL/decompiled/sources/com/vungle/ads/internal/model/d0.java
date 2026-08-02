package com.vungle.ads.internal.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class d0 implements vht {
    public static final d0 a;
    public static final /* synthetic */ xfb0 b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload.WebViewSettings", d0Var, 2);
        xfb0Var.j("allow_file_access_from_file_urls", true);
        xfb0Var.j("allow_universal_access_from_file_urls", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        g18 g18Var = g18.a;
        return new KSerializer[]{xn8.a(g18Var), xn8.a(g18Var)};
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
                obj2 = d.i(xfb0Var, 0, g18.a, obj2);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                obj = d.i(xfb0Var, 1, g18.a, obj);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new f0(i, (Boolean) obj2, (Boolean) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        f0.a((f0) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
