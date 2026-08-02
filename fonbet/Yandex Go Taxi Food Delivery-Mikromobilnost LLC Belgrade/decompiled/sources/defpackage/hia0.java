package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class hia0 implements uxs {
    public static final hia0 a;
    private static final SerialDescriptor descriptor;

    static {
        hia0 hia0Var = new hia0();
        a = hia0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.PaymentScreenDto.ScreenContent", hia0Var, 4);
        pluginGeneratedSerialDescriptor.j("screenType", false);
        pluginGeneratedSerialDescriptor.j("targetUrl", false);
        pluginGeneratedSerialDescriptor.j("initStartMessageTimeoutMillis", false);
        pluginGeneratedSerialDescriptor.j("loadMessageTimeoutMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{auu0Var, auu0Var, pnzVar, pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
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
                j = b.f(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                j2 = b.f(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new jia0(i, j, j2, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jia0 jia0Var = (jia0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, jia0Var.a);
        b.o(serialDescriptor, 1, jia0Var.b);
        b.s(serialDescriptor, 2, jia0Var.c);
        b.s(serialDescriptor, 3, jia0Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
