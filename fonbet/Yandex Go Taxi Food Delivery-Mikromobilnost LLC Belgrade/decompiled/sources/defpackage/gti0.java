package defpackage;

import com.yandex.div.state.db.StateEntry;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class gti0 implements uxs {
    public static final gti0 a;
    private static final SerialDescriptor descriptor;

    static {
        gti0 gti0Var = new gti0();
        a = gti0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.ReloadParams", gti0Var, 3);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, true);
        pluginGeneratedSerialDescriptor.j("overrideUserAgent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(b6j0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        d6j0 d6j0Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d6j0Var = (d6j0) b.s(serialDescriptor, 0, b6j0.a, d6j0Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new iti0(i, d6j0Var, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iti0 iti0Var = (iti0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || iti0Var.a != null) {
            b.g(serialDescriptor, 0, b6j0.a, iti0Var.a);
        }
        if (b.F() || iti0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, iti0Var.b);
        }
        if (b.F() || iti0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, iti0Var.c);
        }
        b.c(serialDescriptor);
    }
}
