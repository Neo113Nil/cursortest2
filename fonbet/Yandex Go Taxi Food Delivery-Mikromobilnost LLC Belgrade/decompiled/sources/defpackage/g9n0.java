package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class g9n0 implements uxs {
    public static final g9n0 a;
    private static final SerialDescriptor descriptor;

    static {
        g9n0 g9n0Var = new g9n0();
        a = g9n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.data.model.ScootersCompletionPhotoExperiment", g9n0Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("require_user_confirmation", true);
        pluginGeneratedSerialDescriptor.j("photo_quality", true);
        pluginGeneratedSerialDescriptor.j("camera_title", true);
        pluginGeneratedSerialDescriptor.j("penalty_warning_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = i9n0.h;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, qke.n(h6w.a), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i9n0.h;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Map map = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i9n0(i, z2, map, z3, num, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i9n0 i9n0Var = (i9n0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i9n0.h;
        if (b.F() || i9n0Var.b) {
            b.n(serialDescriptor, 0, i9n0Var.b);
        }
        if (b.F() || !jl40.l(i9n0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), i9n0Var.c);
        }
        if (b.F() || !i9n0Var.d) {
            b.n(serialDescriptor, 2, i9n0Var.d);
        }
        if (b.F() || i9n0Var.e != null) {
            b.g(serialDescriptor, 3, h6w.a, i9n0Var.e);
        }
        if (b.F() || i9n0Var.f != null) {
            b.g(serialDescriptor, 4, auu0.a, i9n0Var.f);
        }
        if (b.F() || i9n0Var.g != null) {
            b.g(serialDescriptor, 5, auu0.a, i9n0Var.g);
        }
        b.c(serialDescriptor);
    }
}
