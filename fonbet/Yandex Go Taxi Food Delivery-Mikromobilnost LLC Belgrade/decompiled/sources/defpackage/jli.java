package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.nli;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jli implements uxs {
    public static final jli a;
    private static final SerialDescriptor descriptor;

    static {
        jli jliVar = new jli();
        a = jliVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.ndd_route_selector.view.filters.experiment.DeliveryPvzMapFiltersExperiment", jliVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("filters_list_source", true);
        pluginGeneratedSerialDescriptor.j("filters_list_destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = nli.g;
        qli qliVar = qli.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), oli.a, qke.n(qliVar), qke.n(qliVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nli.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        nli.b bVar = null;
        nli.c cVar = null;
        nli.c cVar2 = null;
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
                bVar = (nli.b) b.A(serialDescriptor, 2, oli.a, bVar);
                i |= 4;
            } else if (v == 3) {
                cVar = (nli.c) b.s(serialDescriptor, 3, qli.a, cVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                cVar2 = (nli.c) b.s(serialDescriptor, 4, qli.a, cVar2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new nli(i, z2, map, bVar, cVar, cVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nli nliVar = (nli) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nli.g;
        if (b.F() || nliVar.b) {
            b.n(serialDescriptor, 0, nliVar.b);
        }
        if (b.F() || !jl40.l(nliVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), nliVar.c);
        }
        if (b.F() || !jl40.l(nliVar.d, new nli.b(0))) {
            b.e(serialDescriptor, 2, oli.a, nliVar.d);
        }
        if (b.F() || nliVar.e != null) {
            b.g(serialDescriptor, 3, qli.a, nliVar.e);
        }
        if (b.F() || nliVar.f != null) {
            b.g(serialDescriptor, 4, qli.a, nliVar.f);
        }
        b.c(serialDescriptor);
    }
}
