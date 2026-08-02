package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class loc implements uxs {
    public static final loc a;
    private static final SerialDescriptor descriptor;

    static {
        loc locVar = new loc();
        a = locVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.CommonKnownOrderInfo", locVar, 5);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, false);
        pluginGeneratedSerialDescriptor.j("api_tag", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, true);
        pluginGeneratedSerialDescriptor.j("vehicle_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
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
        String str4 = null;
        String str5 = null;
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
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new noc(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        noc nocVar = (noc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = nocVar.a;
        String str2 = nocVar.e;
        String str3 = nocVar.d;
        String str4 = nocVar.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, nocVar.b);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 3, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
