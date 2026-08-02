package yads;

import com.ironsource.O6;
import java.util.Map;
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
public final class at1 implements vht {
    public static final at1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        at1 at1Var = new at1();
        a = at1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", at1Var, 2);
        xfb0Var.j(O6.G1, false);
        xfb0Var.j("network_data", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oqm0.a, dt1.d[1]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = dt1.d;
        String str = null;
        boolean z = true;
        int i = 0;
        Map map = null;
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
                map = (Map) d.y(xfb0Var, 1, kSerializerArr[1], map);
                i |= 2;
            }
        }
        d.e(xfb0Var);
        return new dt1(i, str, map);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        dt1 dt1Var = (dt1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = dt1.d;
        d.m(xfb0Var, 0, dt1Var.b);
        d.n(xfb0Var, 1, kSerializerArr[1], dt1Var.c);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
