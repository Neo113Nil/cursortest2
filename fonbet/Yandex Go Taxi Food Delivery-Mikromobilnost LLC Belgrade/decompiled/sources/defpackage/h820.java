package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class h820 implements uxs {
    public static final h820 a;
    private static final SerialDescriptor descriptor;

    static {
        h820 h820Var = new h820();
        a = h820Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.network.cache.repository.MetaData", h820Var, 7);
        pluginGeneratedSerialDescriptor.j("freshTimeInterval", false);
        pluginGeneratedSerialDescriptor.j("staleTimeInterval", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j("staleIfError", true);
        pluginGeneratedSerialDescriptor.j("deleteAfterUse", false);
        pluginGeneratedSerialDescriptor.j("saveInMemory", false);
        pluginGeneratedSerialDescriptor.j("cacheLabel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        KSerializer n = qke.n(pnzVar);
        KSerializer n2 = qke.n(pnzVar);
        KSerializer n3 = qke.n(auu0.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, pnzVar, z96Var, z96Var, z96Var, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Long l = null;
        Long l2 = null;
        long j = 0;
        boolean z4 = true;
        String str = null;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                    continue;
                case 0:
                    l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) b.s(serialDescriptor, 1, pnz.a, l2);
                    i |= 2;
                    break;
                case 2:
                    j = b.f(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z = b.C(serialDescriptor, 3);
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
                    str = (String) b.s(serialDescriptor, 6, auu0.a, str);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new j820(i, l, l2, j, z, z2, z3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j820 j820Var = (j820) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        pnz pnzVar = pnz.a;
        Long l = j820Var.a;
        String str = j820Var.g;
        boolean z = j820Var.d;
        b.g(serialDescriptor, 0, pnzVar, l);
        b.g(serialDescriptor, 1, pnzVar, j820Var.b);
        b.s(serialDescriptor, 2, j820Var.c);
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.n(serialDescriptor, 4, j820Var.e);
        b.n(serialDescriptor, 5, j820Var.f);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 6, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
