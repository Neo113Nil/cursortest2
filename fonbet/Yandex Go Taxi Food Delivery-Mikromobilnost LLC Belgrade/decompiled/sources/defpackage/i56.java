package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.NotificationParams;

/* loaded from: classes9.dex */
public final /* synthetic */ class i56 implements uxs {
    public static final i56 a;
    private static final SerialDescriptor descriptor;

    static {
        i56 i56Var = new i56();
        a = i56Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.BlockedZones", i56Var, 6);
        pluginGeneratedSerialDescriptor.j("nearest_zones", true);
        pluginGeneratedSerialDescriptor.j("notification_params", true);
        pluginGeneratedSerialDescriptor.j("pin_point_id", true);
        pluginGeneratedSerialDescriptor.j("pin_zone_id", true);
        pluginGeneratedSerialDescriptor.j("pin_zone_type", true);
        pluginGeneratedSerialDescriptor.j("pin_point_changed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) k56.g[0].getValue());
        KSerializer n2 = qke.n(ti60.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = k56.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        NotificationParams notificationParams = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    notificationParams = (NotificationParams) b.s(serialDescriptor, 1, ti60.a, notificationParams);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new k56(i, list, notificationParams, str, str2, str3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k56 k56Var = (k56) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = k56.g;
        if (b.F() || k56Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), k56Var.a);
        }
        if (b.F() || k56Var.b != null) {
            b.g(serialDescriptor, 1, ti60.a, k56Var.b);
        }
        if (b.F() || k56Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, k56Var.c);
        }
        if (b.F() || k56Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, k56Var.d);
        }
        if (b.F() || k56Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, k56Var.e);
        }
        if (b.F() || k56Var.f) {
            b.n(serialDescriptor, 5, k56Var.f);
        }
        b.c(serialDescriptor);
    }
}
