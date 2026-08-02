package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes6.dex */
public final /* synthetic */ class puc0 implements uxs {
    public static final puc0 a;
    private static final SerialDescriptor descriptor;

    static {
        puc0 puc0Var = new puc0();
        a = puc0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.request.PlaquesSeenRequestParam", puc0Var, 4);
        pluginGeneratedSerialDescriptor.j("plaque_id", false);
        pluginGeneratedSerialDescriptor.j("seen_at", false);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, false);
        pluginGeneratedSerialDescriptor.j("context", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(mdx.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n};
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
        String str3 = null;
        c cVar = null;
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
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                cVar = (c) b.s(serialDescriptor, 3, mdx.a, cVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ruc0(i, str, str2, str3, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ruc0 ruc0Var = (ruc0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, ruc0Var.a);
        b.o(serialDescriptor, 1, ruc0Var.b);
        b.o(serialDescriptor, 2, ruc0Var.c);
        b.g(serialDescriptor, 3, mdx.a, ruc0Var.d);
        b.c(serialDescriptor);
    }
}
