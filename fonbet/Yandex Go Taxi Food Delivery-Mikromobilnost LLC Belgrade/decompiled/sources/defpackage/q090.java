package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class q090 implements uxs {
    public static final q090 a;
    private static final SerialDescriptor descriptor;

    static {
        q090 q090Var = new q090();
        a = q090Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.Overlay", q090Var, 6);
        pluginGeneratedSerialDescriptor.j("shape", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("show_states", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = s090.g;
        return new KSerializer[]{qke.n(auu0.a), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(w7s.a), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(y090.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = s090.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Float[] fArr = null;
        Float[] fArr2 = null;
        FormattedText formattedText = null;
        List list = null;
        a190 a190Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    fArr = (Float[]) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), fArr);
                    i |= 2;
                    break;
                case 2:
                    fArr2 = (Float[]) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), fArr2);
                    i |= 4;
                    break;
                case 3:
                    formattedText = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    a190Var = (a190) b.s(serialDescriptor, 5, y090.a, a190Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new s090(i, str, fArr, fArr2, formattedText, list, a190Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s090 s090Var = (s090) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = s090.g;
        if (b.F() || s090Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, s090Var.a);
        }
        if (b.F() || s090Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), s090Var.b);
        }
        if (b.F() || s090Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), s090Var.c);
        }
        if (b.F() || s090Var.d != null) {
            b.g(serialDescriptor, 3, w7s.a, s090Var.d);
        }
        if (b.F() || s090Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), s090Var.e);
        }
        if (b.F() || s090Var.f != null) {
            b.g(serialDescriptor, 5, y090.a, s090Var.f);
        }
        b.c(serialDescriptor);
    }
}
