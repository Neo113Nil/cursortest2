package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.qs30;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ns30 implements uxs {
    public static final ns30 a;
    private static final SerialDescriptor descriptor;

    static {
        ns30 ns30Var = new ns30();
        a = ns30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.purchase_availability.MtPurchaseAvailabilityConfigDto", ns30Var, 4);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("spare_button", true);
        pluginGeneratedSerialDescriptor.j("payment_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qs30.f[0].getValue(), z96.a, qke.n(at30.a), qke.n(ws30.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qs30.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        qs30.f fVar = null;
        qs30.d dVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                fVar = (qs30.f) b.s(serialDescriptor, 2, at30.a, fVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                dVar = (qs30.d) b.s(serialDescriptor, 3, ws30.a, dVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qs30(i, map, z2, fVar, dVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qs30 qs30Var = (qs30) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qs30.f;
        if (b.F() || !jl40.l(qs30Var.b, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), qs30Var.b);
        }
        if (b.F() || qs30Var.c) {
            b.n(serialDescriptor, 1, qs30Var.c);
        }
        if (b.F() || qs30Var.d != null) {
            b.g(serialDescriptor, 2, at30.a, qs30Var.d);
        }
        if (b.F() || qs30Var.e != null) {
            b.g(serialDescriptor, 3, ws30.a, qs30Var.e);
        }
        b.c(serialDescriptor);
    }
}
