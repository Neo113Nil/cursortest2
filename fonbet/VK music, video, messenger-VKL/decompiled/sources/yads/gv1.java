package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class gv1 implements vht {
    public static final gv1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        gv1 gv1Var = new gv1();
        a = gv1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", gv1Var, 2);
        xfb0Var.j("request", false);
        xfb0Var.j("response", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lv1.a, xn8.a(ov1.a)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        nv1 nv1Var = null;
        boolean z = true;
        int i = 0;
        qv1 qv1Var = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                nv1Var = (nv1) d.y(xfb0Var, 0, lv1.a, nv1Var);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                qv1Var = (qv1) d.i(xfb0Var, 1, ov1.a, qv1Var);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new iv1(i, nv1Var, qv1Var);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        iv1 iv1Var = (iv1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.n(xfb0Var, 0, lv1.a, iv1Var.a);
        d.s(xfb0Var, 1, ov1.a, iv1Var.b);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
