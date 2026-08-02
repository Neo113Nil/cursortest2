package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class c23 implements uxs {
    public static final c23 a;
    private static final SerialDescriptor descriptor;

    static {
        c23 c23Var = new c23();
        a = c23Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.response.ApplinkPaymentConfigDto", c23Var, 4);
        pluginGeneratedSerialDescriptor.j("is_bug_available", true);
        pluginGeneratedSerialDescriptor.j("is_webview_cache_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_webview_dom_storage_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_webview_forced", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                i |= 2;
            } else if (v == 2) {
                bool3 = (Boolean) b.s(serialDescriptor, 2, z96.a, bool3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool4 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new e23(i, bool, bool2, bool3, bool4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e23 e23Var = (e23) obj;
        Boolean bool = e23Var.d;
        Boolean bool2 = e23Var.c;
        Boolean bool3 = e23Var.b;
        Boolean bool4 = e23Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bool4 != null) {
            b.g(serialDescriptor, 0, z96.a, bool4);
        }
        if (b.F() || bool3 != null) {
            b.g(serialDescriptor, 1, z96.a, bool3);
        }
        if (b.F() || bool2 != null) {
            b.g(serialDescriptor, 2, z96.a, bool2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 3, z96.a, bool);
        }
        b.c(serialDescriptor);
    }
}
