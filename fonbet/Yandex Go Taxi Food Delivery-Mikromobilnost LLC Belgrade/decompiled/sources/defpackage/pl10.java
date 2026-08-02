package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;

/* loaded from: classes6.dex */
public final /* synthetic */ class pl10 implements uxs {
    public static final pl10 a;
    private static final SerialDescriptor descriptor;

    static {
        pl10 pl10Var = new pl10();
        a = pl10Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.MenuItemElement", pl10Var, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("icon_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        sl10 sl10Var = sl10.a;
        return new KSerializer[]{rl10.e[0].getValue(), sl10Var, sl10Var, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rl10.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        MenuItemElementType menuItemElementType = null;
        ul10 ul10Var = null;
        ul10 ul10Var2 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                menuItemElementType = (MenuItemElementType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), menuItemElementType);
                i |= 1;
            } else if (v == 1) {
                ul10Var = (ul10) b.A(serialDescriptor, 1, sl10.a, ul10Var);
                i |= 2;
            } else if (v == 2) {
                ul10Var2 = (ul10) b.A(serialDescriptor, 2, sl10.a, ul10Var2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new rl10(i, menuItemElementType, ul10Var, ul10Var2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rl10 rl10Var = (rl10) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rl10.e;
        if (b.F() || rl10Var.a != MenuItemElementType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), rl10Var.a);
        }
        if (b.F() || !jl40.l(rl10Var.b, new ul10(null))) {
            b.e(serialDescriptor, 1, sl10.a, rl10Var.b);
        }
        if (b.F() || !jl40.l(rl10Var.c, new ul10(null))) {
            b.e(serialDescriptor, 2, sl10.a, rl10Var.c);
        }
        if (b.F() || rl10Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, rl10Var.d);
        }
        b.c(serialDescriptor);
    }
}
