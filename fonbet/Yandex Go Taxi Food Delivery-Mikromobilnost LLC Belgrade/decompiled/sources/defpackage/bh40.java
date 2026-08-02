package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

/* loaded from: classes6.dex */
public final /* synthetic */ class bh40 implements uxs {
    public static final bh40 a;
    private static final SerialDescriptor descriptor;

    static {
        bh40 bh40Var = new bh40();
        a = bh40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainSchedulerRequestPayloadDto", bh40Var, 7);
        pluginGeneratedSerialDescriptor.j(MetaDataField.DATE_FIELD, true);
        pluginGeneratedSerialDescriptor.j("starting_stop_id", true);
        pluginGeneratedSerialDescriptor.j("destination_stop_id", true);
        pluginGeneratedSerialDescriptor.j("line_id", true);
        pluginGeneratedSerialDescriptor.j("selected_filter_ids", true);
        pluginGeneratedSerialDescriptor.j("scenario", true);
        pluginGeneratedSerialDescriptor.j("include_unpurchasable_trips", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dh40.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dh40.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        MtScheduleScenario mtScheduleScenario = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    mtScheduleScenario = (MtScheduleScenario) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), mtScheduleScenario);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new dh40(i, str, str2, str3, str4, map, mtScheduleScenario, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dh40 dh40Var = (dh40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dh40.h;
        if (b.F() || dh40Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, dh40Var.a);
        }
        if (b.F() || dh40Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, dh40Var.b);
        }
        if (b.F() || dh40Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, dh40Var.c);
        }
        if (b.F() || dh40Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, dh40Var.d);
        }
        if (b.F() || !jl40.l(dh40Var.e, b.f())) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), dh40Var.e);
        }
        if (b.F() || dh40Var.f != MtScheduleScenario.UNKNOWN) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), dh40Var.f);
        }
        if (b.F() || !dh40Var.g) {
            b.n(serialDescriptor, 6, dh40Var.g);
        }
        b.c(serialDescriptor);
    }
}
