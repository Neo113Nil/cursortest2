package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class bji implements uxs {
    public static final bji a;
    private static final SerialDescriptor descriptor;

    static {
        bji bjiVar = new bji();
        a = bjiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.DeliveryPickupPointAddress", bjiVar, 3);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("short_text", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{b0t.a, auu0Var, auu0Var};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new dji(i, zzsVar, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dji djiVar = (dji) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(djiVar.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, djiVar.a);
        }
        if (b.F() || !jl40.l(djiVar.b, "")) {
            b.o(serialDescriptor, 1, djiVar.b);
        }
        if (b.F() || !jl40.l(djiVar.c, "")) {
            b.o(serialDescriptor, 2, djiVar.c);
        }
        b.c(serialDescriptor);
    }
}
