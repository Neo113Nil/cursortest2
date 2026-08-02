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
public final class h80 implements vht {
    public static final h80 a;
    public static final /* synthetic */ xfb0 b;

    static {
        h80 h80Var = new h80();
        a = h80Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", h80Var, 7);
        xfb0Var.j("page_id", true);
        xfb0Var.j("latest_sdk_version", true);
        xfb0Var.j("app_ads_txt_url", true);
        xfb0Var.j("app_status", true);
        xfb0Var.j("alerts", true);
        xfb0Var.j("ad_units", true);
        xfb0Var.j("mediation_networks", false);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = j80.h;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(kSerializerArr[4]), xn8.a(kSerializerArr[5]), kSerializerArr[6]};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = j80.h;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                    str2 = (String) d.i(xfb0Var, 1, oqm0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) d.i(xfb0Var, 2, oqm0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) d.i(xfb0Var, 3, oqm0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    list = (List) d.i(xfb0Var, 4, kSerializerArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) d.i(xfb0Var, 5, kSerializerArr[5], list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) d.y(xfb0Var, 6, kSerializerArr[6], list3);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new j80(i, str, str2, str3, str4, list, list2, list3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        j80 j80Var = (j80) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = j80.h;
        if (d.z() || j80Var.a != null) {
            d.s(xfb0Var, 0, oqm0.a, j80Var.a);
        }
        if (d.z() || j80Var.b != null) {
            d.s(xfb0Var, 1, oqm0.a, j80Var.b);
        }
        if (d.z() || j80Var.c != null) {
            d.s(xfb0Var, 2, oqm0.a, j80Var.c);
        }
        if (d.z() || j80Var.d != null) {
            d.s(xfb0Var, 3, oqm0.a, j80Var.d);
        }
        if (d.z() || j80Var.e != null) {
            d.s(xfb0Var, 4, kSerializerArr[4], j80Var.e);
        }
        if (d.z() || j80Var.f != null) {
            d.s(xfb0Var, 5, kSerializerArr[5], j80Var.f);
        }
        d.n(xfb0Var, 6, kSerializerArr[6], j80Var.g);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
