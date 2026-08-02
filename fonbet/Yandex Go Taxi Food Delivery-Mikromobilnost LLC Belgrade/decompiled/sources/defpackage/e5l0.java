package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class e5l0 implements uxs {
    public static final e5l0 a;
    private static final SerialDescriptor descriptor;

    static {
        e5l0 e5l0Var = new e5l0();
        a = e5l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.map_common.style.source.model.RouteJamsStyle", e5l0Var, 5);
        pluginGeneratedSerialDescriptor.j("inner_outline_enabled", true);
        pluginGeneratedSerialDescriptor.j("outline_color", true);
        pluginGeneratedSerialDescriptor.j("outline_width", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        pluginGeneratedSerialDescriptor.j("jam_style_colors", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = g5l0.f;
        KSerializer n = qke.n(z96.a);
        KSerializer n2 = qke.n(auu0.a);
        nor norVar = nor.a;
        return new KSerializer[]{n, n2, qke.n(norVar), qke.n(norVar), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = g5l0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        Float f = null;
        Float f2 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                f = (Float) b.s(serialDescriptor, 2, nor.a, f);
                i |= 4;
            } else if (v == 3) {
                f2 = (Float) b.s(serialDescriptor, 3, nor.a, f2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new g5l0(i, bool, str, f, f2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g5l0 g5l0Var = (g5l0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = g5l0.f;
        if (b.F() || !jl40.l(g5l0Var.a, Boolean.FALSE)) {
            b.g(serialDescriptor, 0, z96.a, g5l0Var.a);
        }
        if (b.F() || g5l0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, g5l0Var.b);
        }
        if (b.F() || g5l0Var.c != null) {
            b.g(serialDescriptor, 2, nor.a, g5l0Var.c);
        }
        if (b.F() || g5l0Var.d != null) {
            b.g(serialDescriptor, 3, nor.a, g5l0Var.d);
        }
        if (b.F() || g5l0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), g5l0Var.e);
        }
        b.c(serialDescriptor);
    }
}
