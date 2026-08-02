package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class i5o0 implements uxs {
    public static final i5o0 a;
    private static final SerialDescriptor descriptor;

    static {
        i5o0 i5o0Var = new i5o0();
        a = i5o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment", i5o0Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("show_on_first_ride_numbers", true);
        pluginGeneratedSerialDescriptor.j("statuses", true);
        pluginGeneratedSerialDescriptor.j("replaces_damage_report", true);
        pluginGeneratedSerialDescriptor.j("communication_id", true);
        pluginGeneratedSerialDescriptor.j("for_model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersOnboardingOnActiveRideExperiment.h;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, pnz.a, i3yVarArr[2].getValue(), z96Var, auu0.a, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersOnboardingOnActiveRideExperiment.h;
        b.getClass();
        Object obj = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        List list = null;
        jsq0 jsq0Var = null;
        String str = null;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), jsq0Var);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ScootersOnboardingOnActiveRideExperiment(i, z, j, jsq0Var, z2, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersOnboardingOnActiveRideExperiment scootersOnboardingOnActiveRideExperiment = (ScootersOnboardingOnActiveRideExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersOnboardingOnActiveRideExperiment.h;
        if (b.F() || scootersOnboardingOnActiveRideExperiment.b) {
            b.n(serialDescriptor, 0, scootersOnboardingOnActiveRideExperiment.b);
        }
        if (b.F() || scootersOnboardingOnActiveRideExperiment.c != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            b.s(serialDescriptor, 1, scootersOnboardingOnActiveRideExperiment.c);
        }
        if (b.F() || !jl40.l(scootersOnboardingOnActiveRideExperiment.d, ksq0.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), scootersOnboardingOnActiveRideExperiment.d);
        }
        if (b.F() || scootersOnboardingOnActiveRideExperiment.e) {
            b.n(serialDescriptor, 3, scootersOnboardingOnActiveRideExperiment.e);
        }
        if (b.F() || !jl40.l(scootersOnboardingOnActiveRideExperiment.f, "")) {
            b.o(serialDescriptor, 4, scootersOnboardingOnActiveRideExperiment.f);
        }
        if (b.F() || !jl40.l(scootersOnboardingOnActiveRideExperiment.g, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), scootersOnboardingOnActiveRideExperiment.g);
        }
        b.c(serialDescriptor);
    }
}
