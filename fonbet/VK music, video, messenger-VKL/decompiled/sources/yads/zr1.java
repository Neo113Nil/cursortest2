package yads;

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

/* loaded from: classes10.dex */
public final class zr1 implements vht {
    public static final zr1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        zr1 zr1Var = new zr1();
        a = zr1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", zr1Var, 3);
        xfb0Var.j("format", false);
        xfb0Var.j("version", false);
        xfb0Var.j("isIntegrated", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, xn8.a(oqm0Var), g18.a};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                str2 = (String) d.i(xfb0Var, 1, oqm0.a, str2);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                z2 = d.F(xfb0Var, 2);
                i |= 4;
            }
        }
        d.e(xfb0Var);
        return new bs1(i, str, str2, z2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        bs1 bs1Var = (bs1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, bs1Var.a);
        d.s(xfb0Var, 1, oqm0.a, bs1Var.b);
        d.l(xfb0Var, 2, bs1Var.c);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
