package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class on20 implements uxs {
    public static final on20 a;
    private static final SerialDescriptor descriptor;

    static {
        on20 on20Var = new on20();
        a = on20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.model.MobCronJobState", on20Var, 2);
        pluginGeneratedSerialDescriptor.j("prev_launch_seconds", true);
        pluginGeneratedSerialDescriptor.j("next_launch_seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{qke.n(pnzVar), qke.n(pnzVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                l2 = (Long) b.s(serialDescriptor, 1, pnz.a, l2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new qn20(i, l, l2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qn20 qn20Var = (qn20) obj;
        Long l = qn20Var.b;
        Long l2 = qn20Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || l2 != null) {
            b.g(serialDescriptor, 0, pnz.a, l2);
        }
        if (b.F() || l != null) {
            b.g(serialDescriptor, 1, pnz.a, l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
