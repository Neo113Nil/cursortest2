package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.settings.api.dto.settings.types.SetSettingType;

/* loaded from: classes6.dex */
public final /* synthetic */ class h4r0 implements uxs {
    public static final h4r0 a;
    private static final SerialDescriptor descriptor;

    static {
        h4r0 h4r0Var = new h4r0();
        a = h4r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.SetSettingAction", h4r0Var, 2);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, j4r0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j4r0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SetSettingType setSettingType = null;
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
                setSettingType = (SetSettingType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), setSettingType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j4r0(i, str, setSettingType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j4r0 j4r0Var = (j4r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j4r0.c;
        if (b.F() || !jl40.l(j4r0Var.a, "")) {
            b.o(serialDescriptor, 0, j4r0Var.a);
        }
        if (b.F() || j4r0Var.b != SetSettingType.NONE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), j4r0Var.b);
        }
        b.c(serialDescriptor);
    }
}
