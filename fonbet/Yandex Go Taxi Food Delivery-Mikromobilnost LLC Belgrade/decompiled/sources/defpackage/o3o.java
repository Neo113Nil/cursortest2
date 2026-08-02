package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class o3o implements uxs {
    public static final o3o a;
    private static final SerialDescriptor descriptor;

    static {
        o3o o3oVar = new o3o();
        a = o3oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.entrances.experiment.EntrancesInSuggestExperiment", o3oVar, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, q3o.d[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q3o.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q3o(map, z2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q3o q3oVar = (q3o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q3o.d;
        if (b.F() || q3oVar.b) {
            b.n(serialDescriptor, 0, q3oVar.b);
        }
        if (b.F() || !jl40.l(q3oVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), q3oVar.c);
        }
        b.c(serialDescriptor);
    }
}
