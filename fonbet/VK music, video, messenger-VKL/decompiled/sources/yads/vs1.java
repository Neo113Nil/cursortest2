package yads;

import com.ironsource.O6;
import java.util.List;
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
public final class vs1 implements vht {
    public static final vs1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        vs1 vs1Var = new vs1();
        a = vs1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", vs1Var, 2);
        xfb0Var.j("ad_unit_id", false);
        xfb0Var.j(O6.E1, false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oqm0.a, ys1.d[1]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = ys1.d;
        String str = null;
        boolean z = true;
        int i = 0;
        List list = null;
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
                list = (List) d.y(xfb0Var, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new ys1(i, str, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        ys1 ys1Var = (ys1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = ys1.d;
        d.m(xfb0Var, 0, ys1Var.b);
        d.n(xfb0Var, 1, kSerializerArr[1], ys1Var.c);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
