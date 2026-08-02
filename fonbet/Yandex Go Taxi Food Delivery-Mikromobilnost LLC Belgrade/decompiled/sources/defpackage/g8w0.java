package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class g8w0 implements uxs {
    public static final g8w0 a;
    private static final SerialDescriptor descriptor;

    static {
        g8w0 g8w0Var = new g8w0();
        a = g8w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SuperPasses", g8w0Var, 7);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("active_passes", true);
        pluginGeneratedSerialDescriptor.j("active_pass_window", true);
        pluginGeneratedSerialDescriptor.j("entrypoint", true);
        pluginGeneratedSerialDescriptor.j("purchase_window", true);
        pluginGeneratedSerialDescriptor.j("bonus_passes", true);
        pluginGeneratedSerialDescriptor.j("upsale_window", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(xj90.a), qke.n(t20.a), qke.n(lvm0.a), qke.n(y3o.a), qke.n(ffo0.a), qke.n(d2n0.a), qke.n(m0p0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zj90 zj90Var = null;
        v20 v20Var = null;
        ovm0 ovm0Var = null;
        b4o b4oVar = null;
        jfo0 jfo0Var = null;
        h2n0 h2n0Var = null;
        p0p0 p0p0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zj90Var = (zj90) b.s(serialDescriptor, 0, xj90.a, zj90Var);
                    i |= 1;
                    break;
                case 1:
                    v20Var = (v20) b.s(serialDescriptor, 1, t20.a, v20Var);
                    i |= 2;
                    break;
                case 2:
                    ovm0Var = (ovm0) b.s(serialDescriptor, 2, lvm0.a, ovm0Var);
                    i |= 4;
                    break;
                case 3:
                    b4oVar = (b4o) b.s(serialDescriptor, 3, y3o.a, b4oVar);
                    i |= 8;
                    break;
                case 4:
                    jfo0Var = (jfo0) b.s(serialDescriptor, 4, ffo0.a, jfo0Var);
                    i |= 16;
                    break;
                case 5:
                    h2n0Var = (h2n0) b.s(serialDescriptor, 5, d2n0.a, h2n0Var);
                    i |= 32;
                    break;
                case 6:
                    p0p0Var = (p0p0) b.s(serialDescriptor, 6, m0p0.a, p0p0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i8w0(i, zj90Var, v20Var, ovm0Var, b4oVar, jfo0Var, h2n0Var, p0p0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i8w0 i8w0Var = (i8w0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || i8w0Var.a != null) {
            b.g(serialDescriptor, 0, xj90.a, i8w0Var.a);
        }
        if (b.F() || i8w0Var.b != null) {
            b.g(serialDescriptor, 1, t20.a, i8w0Var.b);
        }
        if (b.F() || i8w0Var.c != null) {
            b.g(serialDescriptor, 2, lvm0.a, i8w0Var.c);
        }
        if (b.F() || i8w0Var.d != null) {
            b.g(serialDescriptor, 3, y3o.a, i8w0Var.d);
        }
        if (b.F() || i8w0Var.e != null) {
            b.g(serialDescriptor, 4, ffo0.a, i8w0Var.e);
        }
        if (b.F() || i8w0Var.f != null) {
            b.g(serialDescriptor, 5, d2n0.a, i8w0Var.f);
        }
        if (b.F() || i8w0Var.g != null) {
            b.g(serialDescriptor, 6, m0p0.a, i8w0Var.g);
        }
        b.c(serialDescriptor);
    }
}
