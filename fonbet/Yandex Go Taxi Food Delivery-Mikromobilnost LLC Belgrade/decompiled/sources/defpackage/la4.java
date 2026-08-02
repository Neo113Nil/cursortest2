package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class la4 implements uxs {
    public static final la4 a;
    private static final SerialDescriptor descriptor;

    static {
        la4 la4Var = new la4();
        a = la4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.summary.tariff_details.experiment.AvailableCarsTariffDetailsExperiment", la4Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("available_tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("cars_url", true);
        pluginGeneratedSerialDescriptor.j("cars_url_title", true);
        pluginGeneratedSerialDescriptor.j("cars_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = na4.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = na4.h;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        Set set = null;
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
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new na4(i, z2, map, set, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        na4 na4Var = (na4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = na4.h;
        if (b.F() || na4Var.b) {
            b.n(serialDescriptor, 0, na4Var.b);
        }
        if (b.F() || !jl40.l(na4Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), na4Var.c);
        }
        if (b.F() || !jl40.l(na4Var.d, EmptySet.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), na4Var.d);
        }
        if (b.F() || !jl40.l(na4Var.e, "")) {
            b.o(serialDescriptor, 3, na4Var.e);
        }
        if (b.F() || !jl40.l(na4Var.f, "")) {
            b.o(serialDescriptor, 4, na4Var.f);
        }
        if (b.F() || !jl40.l(na4Var.g, "")) {
            b.o(serialDescriptor, 5, na4Var.g);
        }
        b.c(serialDescriptor);
    }
}
