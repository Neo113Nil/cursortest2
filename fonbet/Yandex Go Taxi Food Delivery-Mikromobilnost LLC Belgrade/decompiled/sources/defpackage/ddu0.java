package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class ddu0 implements uxs {
    public static final ddu0 a;
    private static final SerialDescriptor descriptor;

    static {
        ddu0 ddu0Var = new ddu0();
        a = ddu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.StickersContext", ddu0Var, 1);
        pluginGeneratedSerialDescriptor.j("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fdu0.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fdu0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        StickersStyle stickersStyle = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                stickersStyle = (StickersStyle) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), stickersStyle);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new fdu0(i, stickersStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fdu0 fdu0Var = (fdu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fdu0.b;
        if (b.F() || fdu0Var.a != StickersStyle.Unknown) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), fdu0Var.a);
        }
        b.c(serialDescriptor);
    }
}
