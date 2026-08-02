package defpackage;

import defpackage.ir40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class gr40 implements uxs {
    public static final gr40 a;
    private static final SerialDescriptor descriptor;

    static {
        gr40 gr40Var = new gr40();
        a = gr40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.multiexit.MultiexitSettingsExperiment.Notification", gr40Var, 4);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, pnz.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
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
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ir40.a(i, j, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ir40.a aVar = (ir40.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || aVar.c != 0) {
            b.s(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
