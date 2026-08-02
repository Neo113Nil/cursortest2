package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.ButtonStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class j07 implements uxs {
    public static final j07 a;
    private static final SerialDescriptor descriptor;

    static {
        j07 j07Var = new j07();
        a = j07Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.ButtonItem", j07Var, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, l07.d[1].getValue(), lvw0.e};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l07.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ButtonStyle buttonStyle = null;
        kvw0 kvw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                buttonStyle = (ButtonStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), buttonStyle);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                kvw0Var = (kvw0) b.A(serialDescriptor, 2, lvw0.e, kvw0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new l07(i, str, buttonStyle, kvw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l07 l07Var = (l07) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l07.d;
        if (b.F() || !jl40.l(l07Var.a, "")) {
            b.o(serialDescriptor, 0, l07Var.a);
        }
        if (b.F() || l07Var.b != ButtonStyle.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), l07Var.b);
        }
        if (b.F() || !jl40.l(l07Var.c, jvw0.INSTANCE)) {
            b.e(serialDescriptor, 2, lvw0.e, l07Var.c);
        }
        b.c(serialDescriptor);
    }
}
