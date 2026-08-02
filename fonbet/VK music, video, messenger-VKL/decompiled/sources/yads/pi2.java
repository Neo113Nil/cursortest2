package yads;

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

/* loaded from: classes10.dex */
public final class pi2 implements vht {
    public static final pi2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        pi2 pi2Var = new pi2();
        a = pi2Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", pi2Var, 2);
        xfb0Var.j("name", false);
        xfb0Var.j("network_ad_unit", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                str2 = d.u(xfb0Var, 1);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new ri2(i, str, str2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ri2 ri2Var = (ri2) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, ri2Var.a);
        d.m(xfb0Var, 1, ri2Var.b);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
