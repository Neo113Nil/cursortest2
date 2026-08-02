package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class fiz0 implements uxs {
    public static final fiz0 a;
    private static final SerialDescriptor descriptor;

    static {
        fiz0 fiz0Var = new fiz0();
        a = fiz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.Title", fiz0Var, 3);
        pluginGeneratedSerialDescriptor.j("hl", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) iiz0.d[0].getValue()), qke.n(auu0.a), qke.n(w7s.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = iiz0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new iiz0(i, list, str, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iiz0 iiz0Var = (iiz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iiz0.d;
        if (b.F() || iiz0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), iiz0Var.a);
        }
        if (b.F() || iiz0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, iiz0Var.b);
        }
        if (b.F() || iiz0Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, iiz0Var.c);
        }
        b.c(serialDescriptor);
    }
}
