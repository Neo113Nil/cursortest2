package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class m7y implements uxs {
    public static final m7y a;
    private static final SerialDescriptor descriptor;

    static {
        m7y m7yVar = new m7y();
        a = m7yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.location.lbs.LbsExperiment", m7yVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("wifi_max_scan_result_age_sec", true);
        pluginGeneratedSerialDescriptor.j("request_interval_sec", true);
        pluginGeneratedSerialDescriptor.j("use_new_version_gsm_listener", true);
        pluginGeneratedSerialDescriptor.j("gsm_polling_interval_sec", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, qke.n(pnzVar), qke.n(pnzVar), qke.n(z96Var), qke.n(pnzVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Long l3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                l = (Long) b.s(serialDescriptor, 1, pnz.a, l);
                i |= 2;
            } else if (v == 2) {
                l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                i |= 4;
            } else if (v == 3) {
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                l3 = (Long) b.s(serialDescriptor, 4, pnz.a, l3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new o7y(i, z2, l, l2, bool, l3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o7y o7yVar = (o7y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || o7yVar.b) {
            b.n(serialDescriptor, 0, o7yVar.b);
        }
        if (b.F() || o7yVar.c != null) {
            b.g(serialDescriptor, 1, pnz.a, o7yVar.c);
        }
        if (b.F() || o7yVar.d != null) {
            b.g(serialDescriptor, 2, pnz.a, o7yVar.d);
        }
        if (b.F() || o7yVar.e != null) {
            b.g(serialDescriptor, 3, z96.a, o7yVar.e);
        }
        if (b.F() || o7yVar.f != null) {
            b.g(serialDescriptor, 4, pnz.a, o7yVar.f);
        }
        b.c(serialDescriptor);
    }
}
