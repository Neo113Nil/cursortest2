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
public final class e80 implements vht {
    public static final e80 a;
    public static final /* synthetic */ xfb0 b;

    static {
        e80 e80Var = new e80();
        a = e80Var;
        xfb0 xfb0Var = new xfb0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", e80Var, 6);
        xfb0Var.j("id", true);
        xfb0Var.j("name", false);
        xfb0Var.j("logo_url", true);
        xfb0Var.j("adapter_status", true);
        xfb0Var.j("adapters", false);
        xfb0Var.j("latest_adapter_version", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g80.g;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), oqm0Var, xn8.a(oqm0Var), xn8.a(oqm0Var), kSerializerArr[4], xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        KSerializer[] kSerializerArr = g80.g;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
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
                    str3 = (String) d.i(xfb0Var, 2, oqm0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) d.i(xfb0Var, 3, oqm0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    list = (List) d.y(xfb0Var, 4, kSerializerArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) d.i(xfb0Var, 5, oqm0.a, str5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new g80(i, str, str2, str3, str4, list, str5);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        g80 g80Var = (g80) obj;
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        KSerializer[] kSerializerArr = g80.g;
        if (d.z() || g80Var.a != null) {
            d.s(xfb0Var, 0, oqm0.a, g80Var.a);
        }
        d.m(xfb0Var, 1, g80Var.b);
        if (d.z() || g80Var.c != null) {
            d.s(xfb0Var, 2, oqm0.a, g80Var.c);
        }
        if (d.z() || g80Var.d != null) {
            d.s(xfb0Var, 3, oqm0.a, g80Var.d);
        }
        d.n(xfb0Var, 4, kSerializerArr[4], g80Var.e);
        if (d.z() || g80Var.f != null) {
            d.s(xfb0Var, 5, oqm0.a, g80Var.f);
        }
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
