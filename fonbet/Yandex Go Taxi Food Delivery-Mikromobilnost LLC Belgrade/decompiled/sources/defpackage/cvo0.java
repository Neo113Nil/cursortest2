package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.fvo0;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class cvo0 implements uxs {
    public static final cvo0 a;
    private static final SerialDescriptor descriptor;

    static {
        cvo0 cvo0Var = new cvo0();
        a = cvo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.share_location.data.model.ScootersShareLocationOnRideExperiment", cvo0Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("sharing_interval_seconds", true);
        pluginGeneratedSerialDescriptor.j("about_dialog_content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, fvo0.f[1].getValue(), pnz.a, dvo0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fvo0.f;
        b.getClass();
        int i = 0;
        boolean z = false;
        Map map = null;
        fvo0.a aVar = null;
        long j = 0;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z2 = false;
            } else if (v == 0) {
                z = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                j = b.f(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (fvo0.a) b.A(serialDescriptor, 3, dvo0.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new fvo0(i, z, map, j, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fvo0 fvo0Var = (fvo0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fvo0.f;
        if (b.F() || fvo0Var.b) {
            b.n(serialDescriptor, 0, fvo0Var.b);
        }
        if (b.F() || !jl40.l(fvo0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), fvo0Var.c);
        }
        if (b.F() || fvo0Var.d != 10) {
            b.s(serialDescriptor, 2, fvo0Var.d);
        }
        if (b.F() || !jl40.l(fvo0Var.e, new fvo0.a(0))) {
            b.e(serialDescriptor, 3, dvo0.a, fvo0Var.e);
        }
        b.c(serialDescriptor);
    }
}
