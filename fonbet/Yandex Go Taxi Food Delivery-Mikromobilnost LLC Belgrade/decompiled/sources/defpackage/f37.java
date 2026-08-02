package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;

/* loaded from: classes9.dex */
public final /* synthetic */ class f37 implements uxs {
    public static final f37 a;
    private static final SerialDescriptor descriptor;

    static {
        f37 f37Var = new f37();
        a = f37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.menu.button.ButtonStateDto", f37Var, 3);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h37.d[0].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = h37.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ButtonState buttonState = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                buttonState = (ButtonState) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), buttonState);
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
        return new h37(i, buttonState, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h37 h37Var = (h37) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = h37.d;
        if (b.F() || h37Var.a != ButtonState.ALREADY_DONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), h37Var.a);
        }
        if (b.F() || h37Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, h37Var.b);
        }
        if (b.F() || h37Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, h37Var.c);
        }
        b.c(serialDescriptor);
    }
}
