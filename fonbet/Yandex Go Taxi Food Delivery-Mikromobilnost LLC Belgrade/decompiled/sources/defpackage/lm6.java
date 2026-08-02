package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class lm6 implements uxs {
    public static final lm6 a;
    private static final SerialDescriptor descriptor;

    static {
        lm6 lm6Var = new lm6();
        a = lm6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.BubbleComponentText", lm6Var, 2);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("font_style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, nm6.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nm6.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        BubbleFontStyle bubbleFontStyle = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bubbleFontStyle = (BubbleFontStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), bubbleFontStyle);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new nm6(i, str, bubbleFontStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nm6 nm6Var = (nm6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nm6.c;
        if (b.F() || !jl40.l(nm6Var.a, "")) {
            b.o(serialDescriptor, 0, nm6Var.a);
        }
        if (b.F() || nm6Var.b != BubbleFontStyle.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), nm6Var.b);
        }
        b.c(serialDescriptor);
    }
}
