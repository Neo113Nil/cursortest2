package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class lw50 implements uxs {
    public static final lw50 a;
    private static final SerialDescriptor descriptor;

    static {
        lw50 lw50Var = new lw50();
        a = lw50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkLocationModel", lw50Var, 3);
        pluginGeneratedSerialDescriptor.j("geoId", true);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j("geoPinPosition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        tq50 tq50Var = tq50.a;
        return new KSerializer[]{n, qke.n(tq50Var), qke.n(tq50Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        vq50 vq50Var = null;
        vq50 vq50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                vq50Var = (vq50) b.s(serialDescriptor, 1, tq50.a, vq50Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vq50Var2 = (vq50) b.s(serialDescriptor, 2, tq50.a, vq50Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new nw50(i, num, vq50Var, vq50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nw50 nw50Var = (nw50) obj;
        vq50 vq50Var = nw50Var.c;
        vq50 vq50Var2 = nw50Var.b;
        Integer num = nw50Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 0, h6w.a, num);
        }
        if (b.F() || vq50Var2 != null) {
            b.g(serialDescriptor, 1, tq50.a, vq50Var2);
        }
        if (b.F() || vq50Var != null) {
            b.g(serialDescriptor, 2, tq50.a, vq50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
