package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class opj0 implements uxs {
    public static final opj0 a;
    private static final SerialDescriptor descriptor;

    static {
        opj0 opj0Var = new opj0();
        a = opj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsOrderPopupDto", opj0Var, 5);
        pluginGeneratedSerialDescriptor.j("popup_title", true);
        pluginGeneratedSerialDescriptor.j("popup_description", true);
        pluginGeneratedSerialDescriptor.j("popup_order_button", true);
        pluginGeneratedSerialDescriptor.j("popup_alternative_button", true);
        pluginGeneratedSerialDescriptor.j("popup_unknown_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        awi0 awi0Var = awi0.a;
        return new KSerializer[]{awi0Var, awi0Var, awi0Var, awi0Var, awi0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        cwi0 cwi0Var = null;
        cwi0 cwi0Var2 = null;
        cwi0 cwi0Var3 = null;
        cwi0 cwi0Var4 = null;
        cwi0 cwi0Var5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cwi0Var = (cwi0) b.A(serialDescriptor, 0, awi0.a, cwi0Var);
                i |= 1;
            } else if (v == 1) {
                cwi0Var2 = (cwi0) b.A(serialDescriptor, 1, awi0.a, cwi0Var2);
                i |= 2;
            } else if (v == 2) {
                cwi0Var3 = (cwi0) b.A(serialDescriptor, 2, awi0.a, cwi0Var3);
                i |= 4;
            } else if (v == 3) {
                cwi0Var4 = (cwi0) b.A(serialDescriptor, 3, awi0.a, cwi0Var4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                cwi0Var5 = (cwi0) b.A(serialDescriptor, 4, awi0.a, cwi0Var5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new qpj0(i, cwi0Var, cwi0Var2, cwi0Var3, cwi0Var4, cwi0Var5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qpj0 qpj0Var = (qpj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        boolean F = b.F();
        cwi0 cwi0Var = cwi0.d;
        if (F || !jl40.l(qpj0Var.a, cwi0Var)) {
            b.e(serialDescriptor, 0, awi0.a, qpj0Var.a);
        }
        if (b.F() || !jl40.l(qpj0Var.b, cwi0Var)) {
            b.e(serialDescriptor, 1, awi0.a, qpj0Var.b);
        }
        if (b.F() || !jl40.l(qpj0Var.c, cwi0Var)) {
            b.e(serialDescriptor, 2, awi0.a, qpj0Var.c);
        }
        if (b.F() || !jl40.l(qpj0Var.d, cwi0Var)) {
            b.e(serialDescriptor, 3, awi0.a, qpj0Var.d);
        }
        if (b.F() || !jl40.l(qpj0Var.e, cwi0Var)) {
            b.e(serialDescriptor, 4, awi0.a, qpj0Var.e);
        }
        b.c(serialDescriptor);
    }
}
