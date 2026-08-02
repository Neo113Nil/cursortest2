package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class le2 implements vht {
    public static final le2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        le2 le2Var = new le2();
        a = le2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", le2Var, 5);
        xfb0Var.j("minBufferMs", true);
        xfb0Var.j("maxBufferMs", true);
        xfb0Var.j("bufferForPlaybackMs", true);
        xfb0Var.j("bufferForPlaybackAfterRebufferMs", true);
        xfb0Var.j("targetBufferBytes", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        n9x n9xVar = n9x.a;
        return new KSerializer[]{xn8.a(n9xVar), xn8.a(n9xVar), xn8.a(n9xVar), xn8.a(n9xVar), xn8.a(n9xVar)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                num = (Integer) d.i(xfb0Var, 0, n9x.a, num);
                i |= 1;
            } else if (m == 1) {
                num2 = (Integer) d.i(xfb0Var, 1, n9x.a, num2);
                i |= 2;
            } else if (m == 2) {
                num3 = (Integer) d.i(xfb0Var, 2, n9x.a, num3);
                i |= 4;
            } else if (m == 3) {
                num4 = (Integer) d.i(xfb0Var, 3, n9x.a, num4);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                num5 = (Integer) d.i(xfb0Var, 4, n9x.a, num5);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new ne2(i, num, num2, num3, num4, num5);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ne2 ne2Var = (ne2) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        if (d.z() || ne2Var.a != null) {
            d.s(xfb0Var, 0, n9x.a, ne2Var.a);
        }
        if (d.z() || ne2Var.b != null) {
            d.s(xfb0Var, 1, n9x.a, ne2Var.b);
        }
        if (d.z() || ne2Var.c != null) {
            d.s(xfb0Var, 2, n9x.a, ne2Var.c);
        }
        if (d.z() || ne2Var.d != null) {
            d.s(xfb0Var, 3, n9x.a, ne2Var.d);
        }
        if (d.z() || ne2Var.e != null) {
            d.s(xfb0Var, 4, n9x.a, ne2Var.e);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
