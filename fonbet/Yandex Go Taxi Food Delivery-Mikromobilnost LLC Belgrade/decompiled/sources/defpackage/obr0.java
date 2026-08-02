package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class obr0 implements uxs {
    public static final obr0 a;
    private static final SerialDescriptor descriptor;

    static {
        obr0 obr0Var = new obr0();
        a = obr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.SettingsParam", obr0Var, 3);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("push_settings", false);
        pluginGeneratedSerialDescriptor.j("last_received_tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(b0t.a), a4g0.a, qbr0.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qbr0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        c4g0 c4g0Var = null;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.s(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                c4g0Var = (c4g0) b.A(serialDescriptor, 1, a4g0.a, c4g0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qbr0(i, zzsVar, c4g0Var, set);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qbr0 qbr0Var = (qbr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qbr0.d;
        b.g(serialDescriptor, 0, b0t.a, qbr0Var.a);
        b.e(serialDescriptor, 1, a4g0.a, qbr0Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), qbr0Var.c);
        b.c(serialDescriptor);
    }
}
