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
import xsna.xn8;

/* loaded from: classes10.dex */
public final class c40 implements vht {
    public static final c40 a;
    public static final /* synthetic */ xfb0 b;

    static {
        c40 c40Var = new c40();
        a = c40Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        xfb0Var.j("name", false);
        xfb0Var.j("ad_type", false);
        xfb0Var.j("ad_unit_id", false);
        xfb0Var.j("mediation", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer a2 = xn8.a(k40.a);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, oqm0Var, a2};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        m40 m40Var = null;
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
                str3 = d.u(xfb0Var, 2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                m40Var = (m40) d.i(xfb0Var, 3, k40.a, m40Var);
                i |= 8;
            }
        }
        d.e(xfb0Var);
        return new e40(i, str, str2, str3, m40Var);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        e40 e40Var = (e40) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        d.m(xfb0Var, 0, e40Var.a);
        d.m(xfb0Var, 1, e40Var.b);
        d.m(xfb0Var, 2, e40Var.c);
        if (d.z() || e40Var.d != null) {
            d.s(xfb0Var, 3, k40.a, e40Var.d);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
