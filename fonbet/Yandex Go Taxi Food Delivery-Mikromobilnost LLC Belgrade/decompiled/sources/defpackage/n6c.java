package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class n6c implements uxs {
    public static final n6c a;
    private static final SerialDescriptor descriptor;

    static {
        n6c n6cVar = new n6c();
        a = n6cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.ClosingOfferDto.ClosingOfferAsset", n6cVar, 4);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("additionalButtonText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        k3k0 k3k0Var = k3k0.a;
        return new KSerializer[]{k3k0Var, k3k0Var, m9v.a, qke.n(k3k0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        q3k0 q3k0Var = null;
        q3k0 q3k0Var2 = null;
        q9v q9vVar = null;
        q3k0 q3k0Var3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                q3k0Var = (q3k0) b.A(serialDescriptor, 0, k3k0.a, q3k0Var);
                i |= 1;
            } else if (v == 1) {
                q3k0Var2 = (q3k0) b.A(serialDescriptor, 1, k3k0.a, q3k0Var2);
                i |= 2;
            } else if (v == 2) {
                q9vVar = (q9v) b.A(serialDescriptor, 2, m9v.a, q9vVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                q3k0Var3 = (q3k0) b.s(serialDescriptor, 3, k3k0.a, q3k0Var3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new p6c(i, q3k0Var, q3k0Var2, q9vVar, q3k0Var3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p6c p6cVar = (p6c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k3k0 k3k0Var = k3k0.a;
        q3k0 q3k0Var = p6cVar.a;
        q3k0 q3k0Var2 = p6cVar.d;
        b.e(serialDescriptor, 0, k3k0Var, q3k0Var);
        b.e(serialDescriptor, 1, k3k0Var, p6cVar.b);
        b.e(serialDescriptor, 2, m9v.a, p6cVar.c);
        if (b.F() || q3k0Var2 != null) {
            b.g(serialDescriptor, 3, k3k0Var, q3k0Var2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
