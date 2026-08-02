package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class m8p0 implements uxs {
    public static final m8p0 a;
    private static final SerialDescriptor descriptor;

    static {
        m8p0 m8p0Var = new m8p0();
        a = m8p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersVoluntarySlowdownExperiment", m8p0Var, 7);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("speed_limit_km_h", true);
        pluginGeneratedSerialDescriptor.j("newbie_preactivation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = o8p0.i;
        z96 z96Var = z96.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), auu0.a, w7sVar, w7sVar, qke.n(h6w.a), z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = o8p0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Map map = null;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    formattedText = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText);
                    i |= 8;
                    break;
                case 4:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new o8p0(i, z2, map, str, formattedText, formattedText2, num, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o8p0 o8p0Var = (o8p0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = o8p0.i;
        if (b.F() || o8p0Var.b) {
            b.n(serialDescriptor, 0, o8p0Var.b);
        }
        if (b.F() || !jl40.l(o8p0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), o8p0Var.c);
        }
        if (b.F() || !jl40.l(o8p0Var.d, "")) {
            b.o(serialDescriptor, 2, o8p0Var.d);
        }
        if (b.F() || !jl40.l(o8p0Var.e, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, o8p0Var.e);
        }
        if (b.F() || !jl40.l(o8p0Var.f, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, o8p0Var.f);
        }
        if (b.F() || o8p0Var.g != null) {
            b.g(serialDescriptor, 5, h6w.a, o8p0Var.g);
        }
        if (b.F() || o8p0Var.h) {
            b.n(serialDescriptor, 6, o8p0Var.h);
        }
        b.c(serialDescriptor);
    }
}
