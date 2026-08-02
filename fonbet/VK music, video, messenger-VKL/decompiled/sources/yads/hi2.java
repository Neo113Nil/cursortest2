package yads;

import com.ironsource.O6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class hi2 implements vht {
    public static final hi2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        hi2 hi2Var = new hi2();
        a = hi2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", hi2Var, 5);
        xfb0Var.j(O6.G1, false);
        xfb0Var.j("network_winner", false);
        xfb0Var.j("revenue", false);
        xfb0Var.j("result", false);
        xfb0Var.j("network_ad_info", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, xn8.a(pi2.a), xn8.a(fj2.a), zi2.a, xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        String str = null;
        ri2 ri2Var = null;
        hj2 hj2Var = null;
        bj2 bj2Var = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                ri2Var = (ri2) d.i(xfb0Var, 1, pi2.a, ri2Var);
                i |= 2;
            } else if (m == 2) {
                hj2Var = (hj2) d.i(xfb0Var, 2, fj2.a, hj2Var);
                i |= 4;
            } else if (m == 3) {
                bj2Var = (bj2) d.y(xfb0Var, 3, zi2.a, bj2Var);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                str2 = (String) d.i(xfb0Var, 4, oqm0.a, str2);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new ji2(i, str, ri2Var, hj2Var, bj2Var, str2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ji2 ji2Var = (ji2) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, ji2Var.a);
        d.s(xfb0Var, 1, pi2.a, ji2Var.b);
        d.s(xfb0Var, 2, fj2.a, ji2Var.c);
        d.n(xfb0Var, 3, zi2.a, ji2Var.d);
        d.s(xfb0Var, 4, oqm0.a, ji2Var.e);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
