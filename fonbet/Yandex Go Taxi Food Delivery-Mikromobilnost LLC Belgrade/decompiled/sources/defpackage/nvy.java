package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.rvy;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class nvy implements uxs {
    public static final nvy a;
    private static final SerialDescriptor descriptor;

    static {
        nvy nvyVar = new nvy();
        a = nvyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.LiveLocationModalExperiment", nvyVar, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("turn_on_screen", true);
        pluginGeneratedSerialDescriptor.j("turn_off_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rvy.f;
        pvy pvyVar = pvy.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), pvyVar, pvyVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rvy.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        rvy.a aVar = null;
        rvy.a aVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                aVar = (rvy.a) b.A(serialDescriptor, 2, pvy.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar2 = (rvy.a) b.A(serialDescriptor, 3, pvy.a, aVar2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new rvy(i, z2, map, aVar, aVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rvy rvyVar = (rvy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rvy.f;
        if (b.F() || rvyVar.b) {
            b.n(serialDescriptor, 0, rvyVar.b);
        }
        if (b.F() || !jl40.l(rvyVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), rvyVar.c);
        }
        if (b.F() || !jl40.l(rvyVar.d, new rvy.a(0))) {
            b.e(serialDescriptor, 2, pvy.a, rvyVar.d);
        }
        if (b.F() || !jl40.l(rvyVar.e, new rvy.a(0))) {
            b.e(serialDescriptor, 3, pvy.a, rvyVar.e);
        }
        b.c(serialDescriptor);
    }
}
