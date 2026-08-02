package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class bl0 implements uxs {
    public static final bl0 a;
    private static final SerialDescriptor descriptor;

    static {
        bl0 bl0Var = new bl0();
        a = bl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.AdditionalButton", bl0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("size", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dl0.e;
        return new KSerializer[]{qke.n(w7s.a), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(sk0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dl0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        AdditionalButtonStyle additionalButtonStyle = null;
        ActionButtonSize actionButtonSize = null;
        uk0 uk0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                additionalButtonStyle = (AdditionalButtonStyle) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), additionalButtonStyle);
                i |= 2;
            } else if (v == 2) {
                actionButtonSize = (ActionButtonSize) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), actionButtonSize);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                uk0Var = (uk0) b.s(serialDescriptor, 3, sk0.a, uk0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new dl0(i, formattedText, additionalButtonStyle, actionButtonSize, uk0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dl0 dl0Var = (dl0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dl0.e;
        if (b.F() || dl0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, dl0Var.a);
        }
        if (b.F() || dl0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dl0Var.b);
        }
        if (b.F() || dl0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), dl0Var.c);
        }
        if (b.F() || dl0Var.d != null) {
            b.g(serialDescriptor, 3, sk0.a, dl0Var.d);
        }
        b.c(serialDescriptor);
    }
}
