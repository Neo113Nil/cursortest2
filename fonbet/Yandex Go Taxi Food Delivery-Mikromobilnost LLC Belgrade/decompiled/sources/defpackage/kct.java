package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class kct implements uxs {
    public static final kct a;
    private static final SerialDescriptor descriptor;

    static {
        kct kctVar = new kct();
        a = kctVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.data.dto.GetRideHistoryOrderByIdRequest", kctVar, 4);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("image_tags", true);
        pluginGeneratedSerialDescriptor.j("settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        mdx mdxVar = mdx.a;
        KSerializer n = qke.n(mdxVar);
        KSerializer n2 = qke.n(mdxVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        c cVar = null;
        c cVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                cVar = (c) b.s(serialDescriptor, 2, mdx.a, cVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                cVar2 = (c) b.s(serialDescriptor, 3, mdx.a, cVar2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new mct(i, str, str2, cVar, cVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mct mctVar = (mct) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(mctVar.a, "")) {
            b.o(serialDescriptor, 0, mctVar.a);
        }
        if (b.F() || !jl40.l(mctVar.b, "")) {
            b.o(serialDescriptor, 1, mctVar.b);
        }
        if (b.F() || mctVar.c != null) {
            b.g(serialDescriptor, 2, mdx.a, mctVar.c);
        }
        if (b.F() || mctVar.d != null) {
            b.g(serialDescriptor, 3, mdx.a, mctVar.d);
        }
        b.c(serialDescriptor);
    }
}
