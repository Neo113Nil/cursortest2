package com.vungle.ads.internal.model;

import com.ironsource.O6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.utils.Logger;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class w2 implements vht {
    public static final w2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        w2 w2Var = new w2();
        a = w2Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.DeviceNode", w2Var, 11);
        xfb0Var.j(O6.t, false);
        xfb0Var.j("model", false);
        xfb0Var.j(O6.G, false);
        xfb0Var.j(O6.R0, true);
        xfb0Var.j(O6.F, false);
        xfb0Var.j(Logger.METHOD_W, false);
        xfb0Var.j("h", false);
        xfb0Var.j(O6.d0, true);
        xfb0Var.j("ifa", true);
        xfb0Var.j("lmt", true);
        xfb0Var.j("ext", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        KSerializer a2 = xn8.a(oqm0Var);
        n9x n9xVar = n9x.a;
        return new KSerializer[]{oqm0Var, oqm0Var, oqm0Var, a2, oqm0Var, n9xVar, n9xVar, xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(n9xVar), xn8.a(y2.a)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        boolean z = true;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = d.u(xfb0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = d.u(xfb0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = d.u(xfb0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    obj5 = d.i(xfb0Var, 3, oqm0.a, obj5);
                    i |= 8;
                    break;
                case 4:
                    str4 = d.u(xfb0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = d.s(xfb0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    i3 = d.s(xfb0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    obj4 = d.i(xfb0Var, 7, oqm0.a, obj4);
                    i |= 128;
                    break;
                case 8:
                    obj3 = d.i(xfb0Var, 8, oqm0.a, obj3);
                    i |= 256;
                    break;
                case 9:
                    obj2 = d.i(xfb0Var, 9, n9x.a, obj2);
                    i |= 512;
                    break;
                case 10:
                    obj = d.i(xfb0Var, 10, y2.a, obj);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new b3(i, str, str2, str3, (String) obj5, str4, i2, i3, (String) obj4, (String) obj3, (Integer) obj2, (a3) obj);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        b3.a((b3) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
