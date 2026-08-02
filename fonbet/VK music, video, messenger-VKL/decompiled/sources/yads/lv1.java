package yads;

import java.util.Map;
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
import xsna.xn8;

/* loaded from: classes10.dex */
public final class lv1 implements vht {
    public static final lv1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        lv1 lv1Var = new lv1();
        a = lv1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", lv1Var, 5);
        xfb0Var.j("timestamp", false);
        xfb0Var.j("method", false);
        xfb0Var.j("url", false);
        xfb0Var.j("headers", false);
        xfb0Var.j("body", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = nv1.f;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{u500.a, oqm0Var, oqm0Var, xn8.a(kSerializerArr[3]), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = nv1.f;
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Map map = null;
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
            } else if (m == 3) {
                map = (Map) d.i(xfb0Var, 3, kSerializerArr[3], map);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                str3 = (String) d.i(xfb0Var, 4, oqm0.a, str3);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new nv1(i, j, str, str2, map, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        nv1 nv1Var = (nv1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = nv1.f;
        d.q(xfb0Var, 0, nv1Var.a);
        d.m(xfb0Var, 1, nv1Var.b);
        d.m(xfb0Var, 2, nv1Var.c);
        d.s(xfb0Var, 3, kSerializerArr[3], nv1Var.d);
        d.s(xfb0Var, 4, oqm0.a, nv1Var.e);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
