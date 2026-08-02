package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class owi0 implements uxs {
    public static final owi0 a;
    private static final SerialDescriptor descriptor;

    static {
        owi0 owi0Var = new owi0();
        a = owi0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.experiments.RemoveCardNotificationExperiment", owi0Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("popup_title", false);
        pluginGeneratedSerialDescriptor.j("popup_subtitle", false);
        pluginGeneratedSerialDescriptor.j("popup_button_delete_card_text", false);
        pluginGeneratedSerialDescriptor.j("no_card_title", false);
        pluginGeneratedSerialDescriptor.j("l10n", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qwi0.g;
        KSerializer n = qke.n(z96.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qwi0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new qwi0(i, bool, str, str2, str3, str4, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qwi0 qwi0Var = (qwi0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qwi0.g;
        if (b.F() || qwi0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, qwi0Var.a);
        }
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, qwi0Var.b);
        b.g(serialDescriptor, 2, auu0Var, qwi0Var.c);
        b.g(serialDescriptor, 3, auu0Var, qwi0Var.d);
        b.g(serialDescriptor, 4, auu0Var, qwi0Var.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), qwi0Var.f);
        b.c(serialDescriptor);
    }
}
