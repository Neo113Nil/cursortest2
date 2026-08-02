package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class c5v0 implements uxs {
    public static final c5v0 a;
    private static final SerialDescriptor descriptor;

    static {
        c5v0 c5v0Var = new c5v0();
        a = c5v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.taxi.suggest.SuggestField", c5v0Var, 6);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, false);
        pluginGeneratedSerialDescriptor.j("log", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("entrance", false);
        pluginGeneratedSerialDescriptor.j("short_text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(b0t.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, auu0Var, qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zzsVar = (zzs) b.s(serialDescriptor, 0, b0t.a, zzsVar);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new e5v0(i, zzsVar, str, str2, str3, str4, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e5v0 e5v0Var = (e5v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, b0t.a, e5v0Var.a);
        b.o(serialDescriptor, 1, e5v0Var.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, e5v0Var.c);
        b.o(serialDescriptor, 3, e5v0Var.d);
        b.g(serialDescriptor, 4, auu0Var, e5v0Var.e);
        b.g(serialDescriptor, 5, auu0Var, e5v0Var.f);
        b.c(serialDescriptor);
    }
}
