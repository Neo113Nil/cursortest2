package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.model.TextAlign;

/* loaded from: classes5.dex */
public final /* synthetic */ class h0e implements uxs {
    public static final h0e a;
    private static final SerialDescriptor descriptor;

    static {
        h0e h0eVar = new h0e();
        a = h0eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.Configuration.Dialogue", h0eVar, 3);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("title_align", true);
        pluginGeneratedSerialDescriptor.j("ignore_max_communications_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, j0e.d[1].getValue(), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j0e.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        TextAlign textAlign = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                textAlign = (TextAlign) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), textAlign);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new j0e(i, str, textAlign, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j0e j0eVar = (j0e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j0e.d;
        if (b.F() || !jl40.l(j0eVar.a, "")) {
            b.o(serialDescriptor, 0, j0eVar.a);
        }
        if (b.F() || j0eVar.b != TextAlign.START) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), j0eVar.b);
        }
        if (b.F() || !jl40.l(j0eVar.c, Boolean.FALSE)) {
            b.g(serialDescriptor, 2, z96.a, j0eVar.c);
        }
        b.c(serialDescriptor);
    }
}
