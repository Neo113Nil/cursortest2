package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class cm20 implements uxs {
    public static final cm20 a;
    private static final SerialDescriptor descriptor;

    static {
        cm20 cm20Var = new cm20();
        a = cm20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.model.MobAvailabilityReportState", cm20Var, 4);
        pluginGeneratedSerialDescriptor.j("is_complete", true);
        pluginGeneratedSerialDescriptor.j("api_names_to_process", true);
        pluginGeneratedSerialDescriptor.j("need_to_select_proxies", true);
        pluginGeneratedSerialDescriptor.j("need_to_optimize_pings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = em20.e;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = em20.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new em20(i, z2, set, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        em20 em20Var = (em20) obj;
        boolean z = em20Var.d;
        boolean z2 = em20Var.c;
        Set set = em20Var.b;
        boolean z3 = em20Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = em20.e;
        if (b.F() || !z3) {
            b.n(serialDescriptor, 0, z3);
        }
        if (b.F() || !jl40.l(set, EmptySet.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), set);
        }
        if (b.F() || z2) {
            b.n(serialDescriptor, 2, z2);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
