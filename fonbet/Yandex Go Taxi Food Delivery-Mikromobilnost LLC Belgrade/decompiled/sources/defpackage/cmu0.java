package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class cmu0 implements uxs {
    public static final cmu0 a;
    private static final SerialDescriptor descriptor;

    static {
        cmu0 cmu0Var = new cmu0();
        a = cmu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.StoriesConfig", cmu0Var, 4);
        pluginGeneratedSerialDescriptor.j("screenName", true);
        pluginGeneratedSerialDescriptor.j("storiesIds", true);
        pluginGeneratedSerialDescriptor.j("previewCornersRadius", true);
        pluginGeneratedSerialDescriptor.j("animationRect", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n((KSerializer) emu0.e[1].getValue()), qke.n(h6w.a), qke.n(si2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = emu0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        Integer num = null;
        ui2 ui2Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                ui2Var = (ui2) b.s(serialDescriptor, 3, si2.a, ui2Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new emu0(i, str, list, num, ui2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        emu0 emu0Var = (emu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = emu0.e;
        if (b.F() || emu0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, emu0Var.a);
        }
        if (b.F() || emu0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), emu0Var.b);
        }
        if (b.F() || emu0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, emu0Var.c);
        }
        if (b.F() || emu0Var.d != null) {
            b.g(serialDescriptor, 3, si2.a, emu0Var.d);
        }
        b.c(serialDescriptor);
    }
}
