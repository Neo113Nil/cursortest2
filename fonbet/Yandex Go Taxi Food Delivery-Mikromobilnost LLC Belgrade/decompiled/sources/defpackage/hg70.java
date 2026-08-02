package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class hg70 implements uxs {
    public static final hg70 a;
    private static final SerialDescriptor descriptor;

    static {
        hg70 hg70Var = new hg70();
        a = hg70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.Options", hg70Var, 4);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("stroke_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        pluginGeneratedSerialDescriptor.j("zoom_range", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(q5w.c)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        int[] iArr = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                iArr = (int[]) b.s(serialDescriptor, 3, q5w.c, iArr);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new pg70(i, str, str2, num, iArr);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pg70 pg70Var = (pg70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || pg70Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, pg70Var.a);
        }
        if (b.F() || pg70Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, pg70Var.b);
        }
        if (b.F() || pg70Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, pg70Var.c);
        }
        if (b.F() || pg70Var.d != null) {
            b.g(serialDescriptor, 3, q5w.c, pg70Var.d);
        }
        b.c(serialDescriptor);
    }
}
