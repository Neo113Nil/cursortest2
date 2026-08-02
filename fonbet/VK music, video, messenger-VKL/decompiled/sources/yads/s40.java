package yads;

import com.ironsource.O6;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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
public final class s40 implements vht {
    public static final s40 a;
    public static final /* synthetic */ xfb0 b;

    static {
        s40 s40Var = new s40();
        a = s40Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", s40Var, 6);
        xfb0Var.j(O6.G1, true);
        xfb0Var.j("network_name", false);
        xfb0Var.j("waterfall_parameters", false);
        xfb0Var.j("network_ad_unit_id_name", true);
        xfb0Var.j(InAppPurchaseMetaData.KEY_CURRENCY, false);
        xfb0Var.j("cpm_floors", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = u40.g;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), oqm0Var, kSerializerArr[2], xn8.a(oqm0Var), xn8.a(ia0.a), kSerializerArr[5]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = u40.g;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        ka0 ka0Var = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) d.i(xfb0Var, 0, oqm0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = d.u(xfb0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) d.y(xfb0Var, 2, kSerializerArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) d.i(xfb0Var, 3, oqm0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    ka0Var = (ka0) d.i(xfb0Var, 4, ia0.a, ka0Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) d.y(xfb0Var, 5, kSerializerArr[5], list2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new u40(i, str, str2, list, str3, ka0Var, list2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        u40 u40Var = (u40) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = u40.g;
        if (d.z() || u40Var.a != null) {
            d.s(xfb0Var, 0, oqm0.a, u40Var.a);
        }
        d.m(xfb0Var, 1, u40Var.b);
        d.n(xfb0Var, 2, kSerializerArr[2], u40Var.c);
        if (d.z() || u40Var.d != null) {
            d.s(xfb0Var, 3, oqm0.a, u40Var.d);
        }
        d.s(xfb0Var, 4, ia0.a, u40Var.e);
        d.n(xfb0Var, 5, kSerializerArr[5], u40Var.f);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
