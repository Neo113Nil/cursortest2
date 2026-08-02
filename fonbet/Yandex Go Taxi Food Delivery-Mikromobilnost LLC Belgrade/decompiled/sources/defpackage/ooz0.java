package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.soz0;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ooz0 implements uxs {
    public static final ooz0 a;
    private static final SerialDescriptor descriptor;

    static {
        ooz0 ooz0Var = new ooz0();
        a = ooz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment", ooz0Var, 7);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("hint_on_map", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("redesigned_enabled", true);
        pluginGeneratedSerialDescriptor.j("skip_modal_when_user_select_road", true);
        pluginGeneratedSerialDescriptor.j("skip_modal_thresholds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = soz0.i;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), qoz0.a, lpz0.a, z96Var, z96Var, fpz0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = soz0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Map map = null;
        soz0.a aVar = null;
        soz0.k kVar = null;
        soz0.h hVar = null;
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
                    aVar = (soz0.a) b.A(serialDescriptor, 2, qoz0.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    kVar = (soz0.k) b.A(serialDescriptor, 3, lpz0.a, kVar);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z4 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    hVar = (soz0.h) b.A(serialDescriptor, 6, fpz0.a, hVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new soz0(i, z2, map, aVar, kVar, z3, z4, hVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0 soz0Var = (soz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = soz0.i;
        if (b.F() || soz0Var.b) {
            b.n(serialDescriptor, 0, soz0Var.b);
        }
        if (b.F() || !jl40.l(soz0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), soz0Var.c);
        }
        if (b.F() || !jl40.l(soz0Var.d, new soz0.a(0))) {
            b.e(serialDescriptor, 2, qoz0.a, soz0Var.d);
        }
        if (b.F() || !jl40.l(soz0Var.e, new soz0.k(0))) {
            b.e(serialDescriptor, 3, lpz0.a, soz0Var.e);
        }
        if (b.F() || soz0Var.f) {
            b.n(serialDescriptor, 4, soz0Var.f);
        }
        if (b.F() || soz0Var.g) {
            b.n(serialDescriptor, 5, soz0Var.g);
        }
        if (b.F() || !jl40.l(soz0Var.h, new soz0.h(0))) {
            b.e(serialDescriptor, 6, fpz0.a, soz0Var.h);
        }
        b.c(serialDescriptor);
    }
}
