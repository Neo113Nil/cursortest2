package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class d9z implements uxs {
    public static final d9z a;
    private static final SerialDescriptor descriptor;

    static {
        d9z d9zVar = new d9z();
        a = d9zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.polling.LocationInfoPollingExperiment", d9zVar, 9);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("polling_timeout_sec", true);
        pluginGeneratedSerialDescriptor.j("polling_interval_sec", true);
        pluginGeneratedSerialDescriptor.j("max_count_coordinates", true);
        pluginGeneratedSerialDescriptor.j("request_polling_final_suggest", true);
        pluginGeneratedSerialDescriptor.j("restart_request_polling_final_suggest_when_expand_app", true);
        pluginGeneratedSerialDescriptor.j("suspend_collect_when_on_stop", true);
        pluginGeneratedSerialDescriptor.j("send_warm_up_locations_in_coord_providers", true);
        pluginGeneratedSerialDescriptor.j("fused_setup_initial_geo_location", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, pnzVar, pnzVar, pnzVar, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z7 = true;
        while (z7) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z7 = false;
                    break;
                case 0:
                    z = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j2 = b.f(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j3 = b.f(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z5 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z6 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new f9z(i, z, j, j2, j3, z2, z3, z4, z5, z6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f9z f9zVar = (f9z) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || f9zVar.b) {
            b.n(serialDescriptor, 0, f9zVar.b);
        }
        if (b.F() || f9zVar.c != 0) {
            b.s(serialDescriptor, 1, f9zVar.c);
        }
        if (b.F() || f9zVar.d != 0) {
            b.s(serialDescriptor, 2, f9zVar.d);
        }
        if (b.F() || f9zVar.e != 0) {
            b.s(serialDescriptor, 3, f9zVar.e);
        }
        if (b.F() || f9zVar.f) {
            b.n(serialDescriptor, 4, f9zVar.f);
        }
        if (b.F() || f9zVar.g) {
            b.n(serialDescriptor, 5, f9zVar.g);
        }
        if (b.F() || f9zVar.h) {
            b.n(serialDescriptor, 6, f9zVar.h);
        }
        if (b.F() || f9zVar.i) {
            b.n(serialDescriptor, 7, f9zVar.i);
        }
        if (b.F() || f9zVar.j) {
            b.n(serialDescriptor, 8, f9zVar.j);
        }
        b.c(serialDescriptor);
    }
}
