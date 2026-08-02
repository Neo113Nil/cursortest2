package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* loaded from: classes10.dex */
public final class yv1 implements vht {
    public static final yv1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        yv1 yv1Var = new yv1();
        a = yv1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", yv1Var, 4);
        xfb0Var.j("timestamp", false);
        xfb0Var.j("type", false);
        xfb0Var.j("tag", false);
        xfb0Var.j("text", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{u500.a, oqm0Var, oqm0Var, oqm0Var};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                j = d.r(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                str = d.u(xfb0Var, 1);
                i |= 2;
            } else if (m == 2) {
                str2 = d.u(xfb0Var, 2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                str3 = d.u(xfb0Var, 3);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new aw1(i, j, str, str2, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        aw1 aw1Var = (aw1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.q(xfb0Var, 0, aw1Var.a);
        d.m(xfb0Var, 1, aw1Var.b);
        d.m(xfb0Var, 2, aw1Var.c);
        d.m(xfb0Var, 3, aw1Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
