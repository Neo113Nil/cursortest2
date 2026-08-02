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
import xsna.xn8;

/* loaded from: classes10.dex */
public final class f40 implements vht {
    public static final f40 a;
    public static final /* synthetic */ xfb0 b;

    static {
        f40 f40Var = new f40();
        a = f40Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        xfb0Var.j(O6.G1, true);
        xfb0Var.j("network_name", false);
        xfb0Var.j("bidding_parameters", false);
        xfb0Var.j("network_ad_unit_id", true);
        xfb0Var.j("network_ad_unit_id_name", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = h40.f;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), oqm0Var, kSerializerArr[2], xn8.a(oqm0Var), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = h40.f;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = (String) d.i(xfb0Var, 0, oqm0.a, str);
                i |= 1;
            } else if (m == 1) {
                str2 = d.u(xfb0Var, 1);
                i |= 2;
            } else if (m == 2) {
                list = (List) d.y(xfb0Var, 2, kSerializerArr[2], list);
                i |= 4;
            } else if (m == 3) {
                str3 = (String) d.i(xfb0Var, 3, oqm0.a, str3);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                str4 = (String) d.i(xfb0Var, 4, oqm0.a, str4);
                i |= 16;
            }
        }
        d.e(xfb0Var);
        return new h40(i, str, str2, list, str3, str4);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        h40 h40Var = (h40) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = h40.f;
        if (d.z() || h40Var.a != null) {
            d.s(xfb0Var, 0, oqm0.a, h40Var.a);
        }
        d.m(xfb0Var, 1, h40Var.b);
        d.n(xfb0Var, 2, kSerializerArr[2], h40Var.c);
        if (d.z() || h40Var.d != null) {
            d.s(xfb0Var, 3, oqm0.a, h40Var.d);
        }
        if (d.z() || h40Var.e != null) {
            d.s(xfb0Var, 4, oqm0.a, h40Var.e);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
