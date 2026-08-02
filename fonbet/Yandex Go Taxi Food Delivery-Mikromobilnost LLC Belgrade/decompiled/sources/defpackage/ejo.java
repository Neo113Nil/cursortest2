package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ejo implements uxs {
    public static final ejo a;
    private static final SerialDescriptor descriptor;

    static {
        ejo ejoVar = new ejo();
        a = ejoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.EvolveOfferResponse", ejoVar, 3);
        pluginGeneratedSerialDescriptor.j("bluetooth", true);
        pluginGeneratedSerialDescriptor.j("finish_actions", true);
        pluginGeneratedSerialDescriptor.j("nearest_parking", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(x56.a), gjo.d[1].getValue(), vk50.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gjo.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        z56 z56Var = null;
        List list = null;
        xk50 xk50Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z56Var = (z56) b.s(serialDescriptor, 0, x56.a, z56Var);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                xk50Var = (xk50) b.A(serialDescriptor, 2, vk50.a, xk50Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new gjo(i, z56Var, list, xk50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gjo gjoVar = (gjo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gjo.d;
        if (b.F() || gjoVar.a != null) {
            b.g(serialDescriptor, 0, x56.a, gjoVar.a);
        }
        if (b.F() || !jl40.l(gjoVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), gjoVar.b);
        }
        if (b.F() || !jl40.l(gjoVar.c, new xk50(0))) {
            b.e(serialDescriptor, 2, vk50.a, gjoVar.c);
        }
        b.c(serialDescriptor);
    }
}
