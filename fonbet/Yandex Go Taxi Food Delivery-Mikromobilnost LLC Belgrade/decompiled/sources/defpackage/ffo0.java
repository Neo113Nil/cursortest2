package defpackage;

import defpackage.jfo0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class ffo0 implements uxs {
    public static final ffo0 a;
    private static final SerialDescriptor descriptor;

    static {
        ffo0 ffo0Var = new ffo0();
        a = ffo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPassesPurchaseWindowDto", ffo0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("pass_selection_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = jfo0.e;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), qke.n((KSerializer) i3yVarArr[2].getValue()), kfo0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = jfo0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        List list = null;
        jfo0.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bVar = (jfo0.b) b.A(serialDescriptor, 3, kfo0.a, bVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new jfo0(i, formattedText, formattedText2, list, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jfo0 jfo0Var = (jfo0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = jfo0.e;
        if (b.F() || !jl40.l(jfo0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, jfo0Var.a);
        }
        if (b.F() || jfo0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, jfo0Var.b);
        }
        if (b.F() || jfo0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), jfo0Var.c);
        }
        if (b.F() || !jl40.l(jfo0Var.d, new jfo0.b(0))) {
            b.e(serialDescriptor, 3, kfo0.a, jfo0Var.d);
        }
        b.c(serialDescriptor);
    }
}
