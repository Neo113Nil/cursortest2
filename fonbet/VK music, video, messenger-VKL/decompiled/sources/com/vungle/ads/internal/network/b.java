package com.vungle.ads.internal.network;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.jdz;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class b implements vht {
    public static final b a;
    public static final /* synthetic */ xfb0 b;

    static {
        b bVar = new b();
        a = bVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.network.FailedTpat", bVar, 6);
        xfb0Var.j("method", true);
        xfb0Var.j("headers", true);
        xfb0Var.j("body", true);
        xfb0Var.j("retryAttempt", true);
        xfb0Var.j("retryCount", false);
        xfb0Var.j("tpatKey", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        KSerializer a2 = xn8.a(new jdz(oqm0Var, oqm0Var));
        KSerializer a3 = xn8.a(oqm0Var);
        KSerializer a4 = xn8.a(oqm0Var);
        n9x n9xVar = n9x.a;
        return new KSerializer[]{e.a, a2, a3, n9xVar, n9xVar, a4};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj4 = d.y(xfb0Var, 0, e.a, obj4);
                    i |= 1;
                    break;
                case 1:
                    oqm0 oqm0Var = oqm0.a;
                    obj3 = d.i(xfb0Var, 1, new jdz(oqm0Var, oqm0Var), obj3);
                    i |= 2;
                    break;
                case 2:
                    obj2 = d.i(xfb0Var, 2, oqm0.a, obj2);
                    i |= 4;
                    break;
                case 3:
                    i2 = d.s(xfb0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = d.s(xfb0Var, 4);
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
        return new d(i, (g) obj4, (Map) obj3, (String) obj2, i2, i3, (String) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.a((d) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
