package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class j2a implements uxs {
    public static final j2a a;
    private static final SerialDescriptor descriptor;

    static {
        j2a j2aVar = new j2a();
        a = j2aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.ChargersKnownOrderInfo", j2aVar, 4);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, false);
        pluginGeneratedSerialDescriptor.j("api_tag", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new l2a(i, str, str2, str3, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l2a l2aVar = (l2a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = l2aVar.a;
        Boolean bool = l2aVar.d;
        String str2 = l2aVar.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, l2aVar.b);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 3, z96.a, bool);
        }
        b.c(serialDescriptor);
    }
}
