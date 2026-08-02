package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ao0 implements uxs {
    public static final ao0 a;
    private static final SerialDescriptor descriptor;

    static {
        ao0 ao0Var = new ao0();
        a = ao0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.AdditionalSuggestItem", ao0Var, 10);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("group_id", true);
        pluginGeneratedSerialDescriptor.j("item_index", true);
        pluginGeneratedSerialDescriptor.j("item_action", true);
        pluginGeneratedSerialDescriptor.j("analytics", true);
        pluginGeneratedSerialDescriptor.j("lead", true);
        pluginGeneratedSerialDescriptor.j("lead_body", true);
        pluginGeneratedSerialDescriptor.j("trail_body", true);
        pluginGeneratedSerialDescriptor.j("trail_button", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        KSerializer n = qke.n(h6wVar);
        KSerializer n2 = qke.n(h6wVar);
        KSerializer n3 = qke.n(sk0.a);
        KSerializer n4 = qke.n(vk0.a);
        ol0 ol0Var = ol0.a;
        KSerializer n5 = qke.n(ol0Var);
        yk0 yk0Var = yk0.a;
        return new KSerializer[]{auu0.a, n, n2, n3, n4, n5, qke.n(yk0Var), qke.n(yk0Var), qke.n(bl0.a), qke.n(ol0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ql0 ql0Var = null;
        boolean z = true;
        dl0 dl0Var = null;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        uk0 uk0Var = null;
        xk0 xk0Var = null;
        ql0 ql0Var2 = null;
        al0 al0Var = null;
        al0 al0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    uk0Var = (uk0) b.s(serialDescriptor, 3, sk0.a, uk0Var);
                    i |= 8;
                    break;
                case 4:
                    xk0Var = (xk0) b.s(serialDescriptor, 4, vk0.a, xk0Var);
                    i |= 16;
                    break;
                case 5:
                    ql0Var2 = (ql0) b.s(serialDescriptor, 5, ol0.a, ql0Var2);
                    i |= 32;
                    break;
                case 6:
                    al0Var = (al0) b.s(serialDescriptor, 6, yk0.a, al0Var);
                    i |= 64;
                    break;
                case 7:
                    al0Var2 = (al0) b.s(serialDescriptor, 7, yk0.a, al0Var2);
                    i |= 128;
                    break;
                case 8:
                    dl0Var = (dl0) b.s(serialDescriptor, 8, bl0.a, dl0Var);
                    i |= 256;
                    break;
                case 9:
                    ql0Var = (ql0) b.s(serialDescriptor, 9, ol0.a, ql0Var);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new co0(i, str, num, num2, uk0Var, xk0Var, ql0Var2, al0Var, al0Var2, dl0Var, ql0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        co0 co0Var = (co0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(co0Var.a, "")) {
            b.o(serialDescriptor, 0, co0Var.a);
        }
        if (b.F() || co0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, co0Var.b);
        }
        if (b.F() || co0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, co0Var.c);
        }
        if (b.F() || co0Var.d != null) {
            b.g(serialDescriptor, 3, sk0.a, co0Var.d);
        }
        if (b.F() || co0Var.e != null) {
            b.g(serialDescriptor, 4, vk0.a, co0Var.e);
        }
        if (b.F() || co0Var.f != null) {
            b.g(serialDescriptor, 5, ol0.a, co0Var.f);
        }
        if (b.F() || co0Var.g != null) {
            b.g(serialDescriptor, 6, yk0.a, co0Var.g);
        }
        if (b.F() || co0Var.h != null) {
            b.g(serialDescriptor, 7, yk0.a, co0Var.h);
        }
        if (b.F() || co0Var.i != null) {
            b.g(serialDescriptor, 8, bl0.a, co0Var.i);
        }
        if (b.F() || co0Var.j != null) {
            b.g(serialDescriptor, 9, ol0.a, co0Var.j);
        }
        b.c(serialDescriptor);
    }
}
