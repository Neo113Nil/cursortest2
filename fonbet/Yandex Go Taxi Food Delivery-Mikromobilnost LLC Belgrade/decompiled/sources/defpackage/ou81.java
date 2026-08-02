package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class ou81 implements uxs {
    public static final ou81 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ou81 ou81Var = new ou81();
        a = ou81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", ou81Var, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("logo_url", true);
        pluginGeneratedSerialDescriptor.j("adapter_status", true);
        pluginGeneratedSerialDescriptor.j("adapters", false);
        pluginGeneratedSerialDescriptor.j("latest_adapter_version", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kl61.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[4].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = kl61.g;
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b2.s(pluginGeneratedSerialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
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
                    list = (List) b2.A(pluginGeneratedSerialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b2.s(pluginGeneratedSerialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new kl61(i, str, str2, str3, str4, str5, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kl61 kl61Var = (kl61) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = kl61.g;
        if (b2.F() || kl61Var.a != null) {
            b2.g(pluginGeneratedSerialDescriptor, 0, auu0.a, kl61Var.a);
        }
        String str = kl61Var.b;
        String str2 = kl61Var.f;
        String str3 = kl61Var.d;
        String str4 = kl61Var.c;
        b2.o(pluginGeneratedSerialDescriptor, 1, str);
        if (b2.F() || str4 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 2, auu0.a, str4);
        }
        if (b2.F() || str3 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, auu0.a, str3);
        }
        b2.e(pluginGeneratedSerialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), kl61Var.e);
        if (b2.F() || str2 != null) {
            b2.g(pluginGeneratedSerialDescriptor, 5, auu0.a, str2);
        }
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
