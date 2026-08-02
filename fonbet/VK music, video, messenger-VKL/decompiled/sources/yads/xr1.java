package yads;

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
import xsna.xn8;

/* loaded from: classes10.dex */
public final class xr1 implements vht {
    public static final xr1 a;
    public static final /* synthetic */ xfb0 b;

    static {
        xr1 xr1Var = new xr1();
        a = xr1Var;
        xfb0 xfb0Var = new xfb0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", xr1Var, 4);
        xfb0Var.j("name", false);
        xfb0Var.j("id", false);
        xfb0Var.j("version", false);
        xfb0Var.j("adapters", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = cs1.e;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, xn8.a(oqm0Var), kSerializerArr[3]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = cs1.e;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(xfb0Var, 0);
                i |= 1;
            } else if (m == 1) {
                str2 = d.u(xfb0Var, 1);
                i |= 2;
            } else if (m == 2) {
                str3 = (String) d.i(xfb0Var, 2, oqm0.a, str3);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                list = (List) d.y(xfb0Var, 3, kSerializerArr[3], list);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new cs1(i, str, str2, str3, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        cs1 cs1Var = (cs1) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = cs1.e;
        d.m(xfb0Var, 0, cs1Var.a);
        d.m(xfb0Var, 1, cs1Var.b);
        d.s(xfb0Var, 2, oqm0.a, cs1Var.c);
        d.n(xfb0Var, 3, kSerializerArr[3], cs1Var.d);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
