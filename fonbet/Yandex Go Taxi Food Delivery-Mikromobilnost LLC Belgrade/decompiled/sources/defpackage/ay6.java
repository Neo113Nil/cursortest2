package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ay6 implements uxs {
    public static final ay6 a;
    private static final SerialDescriptor descriptor;

    static {
        ay6 ay6Var = new ay6();
        a = ay6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.main.BusinessToBusinessExperiment", ay6Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("landing_url", true);
        pluginGeneratedSerialDescriptor.j("section_title_key", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cy6.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, auu0Var, auu0Var, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cy6.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new cy6(i, str, str2, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cy6 cy6Var = (cy6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cy6.f;
        if (b.F() || cy6Var.b) {
            b.n(serialDescriptor, 0, cy6Var.b);
        }
        if (b.F() || !jl40.l(cy6Var.c, "")) {
            b.o(serialDescriptor, 1, cy6Var.c);
        }
        if (b.F() || !jl40.l(cy6Var.d, "")) {
            b.o(serialDescriptor, 2, cy6Var.d);
        }
        if (b.F() || !jl40.l(cy6Var.e, b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), cy6Var.e);
        }
        b.c(serialDescriptor);
    }
}
