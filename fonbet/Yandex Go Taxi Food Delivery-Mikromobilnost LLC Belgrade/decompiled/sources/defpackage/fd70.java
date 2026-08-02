package defpackage;

import defpackage.jd70;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class fd70 implements uxs {
    public static final fd70 a;
    private static final SerialDescriptor descriptor;

    static {
        fd70 fd70Var = new fd70();
        a = fd70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.OptimalViewNotificationModal", fd70Var, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), hd70.a};
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
        jd70.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                aVar = (jd70.a) b.A(serialDescriptor, 2, hd70.a, aVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jd70(i, str, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (defpackage.jl40.l(r0, jd70.a.b) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        jd70 jd70Var = (jd70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(jd70Var.a, "")) {
            b.o(serialDescriptor, 0, jd70Var.a);
        }
        if (b.F() || jd70Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, jd70Var.b);
        }
        if (!b.F()) {
            jd70.a aVar = jd70Var.c;
            jd70.a.Companion.getClass();
        }
        b.e(serialDescriptor, 2, hd70.a, jd70Var.c);
        b.c(serialDescriptor);
    }
}
