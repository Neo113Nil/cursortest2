package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class ov1 implements vht {
    public static final ov1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        ov1 ov1Var = new ov1();
        a = ov1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", ov1Var, 4);
        xfb0Var.j("timestamp", false);
        xfb0Var.j("code", false);
        xfb0Var.j("headers", false);
        xfb0Var.j("body", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u500.a, xn8.a(n9x.a), xn8.a(qv1.e[2]), xn8.a(oqm0.a)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = qv1.e;
        int i = 0;
        long j = 0;
        Integer num = null;
        Map map = null;
        String str = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                j = d.r(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                num = (Integer) d.i(xfb0Var, 1, n9x.a, num);
                i |= 2;
            } else if (m == 2) {
                map = (Map) d.i(xfb0Var, 2, kSerializerArr[2], map);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                str = (String) d.i(xfb0Var, 3, oqm0.a, str);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new qv1(i, j, num, map, str);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        qv1 qv1Var = (qv1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = qv1.e;
        d.q(xfb0Var, 0, qv1Var.a);
        d.s(xfb0Var, 1, n9x.a, qv1Var.b);
        d.s(xfb0Var, 2, kSerializerArr[2], qv1Var.c);
        d.s(xfb0Var, 3, oqm0.a, qv1Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
