package defpackage;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class o1d0 implements uxs {
    public static final o1d0 a;
    private static final SerialDescriptor descriptor;

    static {
        o1d0 o1d0Var = new o1d0();
        a = o1d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.experiments.api.cache.PlusCachedExperiments", o1d0Var, 5);
        pluginGeneratedSerialDescriptor.j("testIdsWithBucketNumber", true);
        pluginGeneratedSerialDescriptor.j("triggeredTestIdsWithBucketNumber", true);
        pluginGeneratedSerialDescriptor.j("testIds", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q1d0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), x3n.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q1d0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        Set set = null;
        e3n e3nVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                set = (Set) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                e3nVar = (e3n) b.A(serialDescriptor, 4, x3n.a, e3nVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new q1d0(i, str, str2, list, set, e3nVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q1d0 q1d0Var = (q1d0) obj;
        Set set = q1d0Var.d;
        List list = q1d0Var.c;
        String str = q1d0Var.b;
        String str2 = q1d0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q1d0.f;
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 0, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        if (b.F() || set != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), set);
        }
        b.e(serialDescriptor, 4, x3n.a, new e3n(q1d0Var.e));
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
