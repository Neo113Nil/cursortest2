package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class po61 implements uxs {
    public static final po61 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        po61 po61Var = new po61();
        a = po61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", po61Var, 7);
        pluginGeneratedSerialDescriptor.j("page_id", true);
        pluginGeneratedSerialDescriptor.j("latest_sdk_version", true);
        pluginGeneratedSerialDescriptor.j("app_ads_txt_url", true);
        pluginGeneratedSerialDescriptor.j("app_status", true);
        pluginGeneratedSerialDescriptor.j("alerts", true);
        pluginGeneratedSerialDescriptor.j("ad_units", true);
        pluginGeneratedSerialDescriptor.j("mediation_networks", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kc71.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = kc71.h;
        b2.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b2.s(pluginGeneratedSerialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b2.s(pluginGeneratedSerialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b2.s(pluginGeneratedSerialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b2.s(pluginGeneratedSerialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b2.s(pluginGeneratedSerialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b2.s(pluginGeneratedSerialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) b2.A(pluginGeneratedSerialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new kc71(i, str, str2, str3, str4, list, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kc71 kc71Var = (kc71) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = kc71.h;
        if (b2.F() || kc71Var.a != null) {
            b2.g(pluginGeneratedSerialDescriptor, 0, auu0.a, kc71Var.a);
        }
        if (b2.F() || kc71Var.b != null) {
            b2.g(pluginGeneratedSerialDescriptor, 1, auu0.a, kc71Var.b);
        }
        if (b2.F() || kc71Var.c != null) {
            b2.g(pluginGeneratedSerialDescriptor, 2, auu0.a, kc71Var.c);
        }
        if (b2.F() || kc71Var.d != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, auu0.a, kc71Var.d);
        }
        if (b2.F() || kc71Var.e != null) {
            b2.g(pluginGeneratedSerialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), kc71Var.e);
        }
        if (b2.F() || kc71Var.f != null) {
            b2.g(pluginGeneratedSerialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), kc71Var.f);
        }
        b2.e(pluginGeneratedSerialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), kc71Var.g);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
