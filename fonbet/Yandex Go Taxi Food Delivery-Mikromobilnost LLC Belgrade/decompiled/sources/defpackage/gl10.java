package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;

/* loaded from: classes6.dex */
public final /* synthetic */ class gl10 implements uxs {
    public static final gl10 a;
    private static final SerialDescriptor descriptor;

    static {
        gl10 gl10Var = new gl10();
        a = gl10Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.MenuItemAction", gl10Var, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{il10.c[0].getValue(), h4r0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = il10.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        SectionItemActionType sectionItemActionType = null;
        j4r0 j4r0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                sectionItemActionType = (SectionItemActionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), sectionItemActionType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                j4r0Var = (j4r0) b.A(serialDescriptor, 1, h4r0.a, j4r0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new il10(i, sectionItemActionType, j4r0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        il10 il10Var = (il10) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = il10.c;
        if (b.F() || il10Var.a != SectionItemActionType.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), il10Var.a);
        }
        if (b.F() || !jl40.l(il10Var.b, new j4r0(0))) {
            b.e(serialDescriptor, 1, h4r0.a, il10Var.b);
        }
        b.c(serialDescriptor);
    }
}
