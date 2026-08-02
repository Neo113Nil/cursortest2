package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class due0 implements uxs {
    public static final due0 a;
    private static final SerialDescriptor descriptor;

    static {
        due0 due0Var = new due0();
        a = due0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.PresaleDto", due0Var, 13);
        pluginGeneratedSerialDescriptor.j("loadingTitle", false);
        pluginGeneratedSerialDescriptor.j("benefitTitle", false);
        pluginGeneratedSerialDescriptor.j("periodTitle", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("presaleAdditionalTitle", false);
        pluginGeneratedSerialDescriptor.j("loadingDelayMillis", false);
        pluginGeneratedSerialDescriptor.j("acceptAdditionalButtonText", false);
        pluginGeneratedSerialDescriptor.j("acceptButtonText", false);
        pluginGeneratedSerialDescriptor.j("rejectButtonText", false);
        pluginGeneratedSerialDescriptor.j("batchId", false);
        pluginGeneratedSerialDescriptor.j("eventSessionId", false);
        pluginGeneratedSerialDescriptor.j("presaleTarget", false);
        pluginGeneratedSerialDescriptor.j("offer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        k3k0 k3k0Var = k3k0.a;
        KSerializer n = qke.n(k3k0Var);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{k3k0Var, n, k3k0Var, k3k0Var, k3k0Var, pnz.a, k3k0Var, k3k0Var, k3k0Var, auu0Var, auu0Var, auu0Var, tnd.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        long j = 0;
        spd spdVar = null;
        q3k0 q3k0Var = null;
        boolean z2 = true;
        q3k0 q3k0Var2 = null;
        q3k0 q3k0Var3 = null;
        int i = 0;
        q3k0 q3k0Var4 = null;
        q3k0 q3k0Var5 = null;
        q3k0 q3k0Var6 = null;
        q3k0 q3k0Var7 = null;
        q3k0 q3k0Var8 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    q3k0Var4 = (q3k0) b.A(serialDescriptor, 0, k3k0.a, q3k0Var4);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    q3k0Var5 = (q3k0) b.s(serialDescriptor, 1, k3k0.a, q3k0Var5);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    q3k0Var6 = (q3k0) b.A(serialDescriptor, 2, k3k0.a, q3k0Var6);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    q3k0Var7 = (q3k0) b.A(serialDescriptor, 3, k3k0.a, q3k0Var7);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    q3k0Var8 = (q3k0) b.A(serialDescriptor, 4, k3k0.a, q3k0Var8);
                    i |= 16;
                    break;
                case 5:
                    j = b.f(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z = z2;
                    q3k0Var2 = (q3k0) b.A(serialDescriptor, 6, k3k0.a, q3k0Var2);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    q3k0Var3 = (q3k0) b.A(serialDescriptor, 7, k3k0.a, q3k0Var3);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    q3k0Var = (q3k0) b.A(serialDescriptor, 8, k3k0.a, q3k0Var);
                    i |= 256;
                    break;
                case 9:
                    str = b.k(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    str2 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                case 11:
                    str3 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    continue;
                case 12:
                    z = z2;
                    spdVar = (spd) b.A(serialDescriptor, 12, tnd.a, spdVar);
                    i |= 4096;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new fue0(i, q3k0Var4, q3k0Var5, q3k0Var6, q3k0Var7, q3k0Var8, j, q3k0Var2, q3k0Var3, q3k0Var, str, str2, str3, spdVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fue0 fue0Var = (fue0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k3k0 k3k0Var = k3k0.a;
        b.e(serialDescriptor, 0, k3k0Var, fue0Var.a);
        b.g(serialDescriptor, 1, k3k0Var, fue0Var.b);
        b.e(serialDescriptor, 2, k3k0Var, fue0Var.c);
        b.e(serialDescriptor, 3, k3k0Var, fue0Var.d);
        b.e(serialDescriptor, 4, k3k0Var, fue0Var.e);
        b.s(serialDescriptor, 5, fue0Var.f);
        b.e(serialDescriptor, 6, k3k0Var, fue0Var.g);
        b.e(serialDescriptor, 7, k3k0Var, fue0Var.h);
        b.e(serialDescriptor, 8, k3k0Var, fue0Var.i);
        b.o(serialDescriptor, 9, fue0Var.j);
        b.o(serialDescriptor, 10, fue0Var.k);
        b.o(serialDescriptor, 11, fue0Var.l);
        b.e(serialDescriptor, 12, tnd.a, fue0Var.m);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
