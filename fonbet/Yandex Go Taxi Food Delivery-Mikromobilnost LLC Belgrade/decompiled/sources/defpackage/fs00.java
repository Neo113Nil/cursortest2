package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.a;
import ru.yandex.taxi.map_common.style.source.model.Theme;

/* loaded from: classes9.dex */
public final /* synthetic */ class fs00 implements uxs {
    public static final fs00 a;
    private static final SerialDescriptor descriptor;

    static {
        fs00 fs00Var = new fs00();
        a = fs00Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.map_common.style.source.model.MapStyle", fs00Var, 4);
        pluginGeneratedSerialDescriptor.j("map_style", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("route_traffic_style", true);
        pluginGeneratedSerialDescriptor.j(DivkitThemeChangeListener.THEME_VARIABLE_NAME, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(zbx.a), qke.n(auu0.a), qke.n(e5l0.a), qke.n((KSerializer) hs00.e[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hs00.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        a aVar = null;
        String str = null;
        g5l0 g5l0Var = null;
        Theme theme = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (a) b.s(serialDescriptor, 0, zbx.a, aVar);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                g5l0Var = (g5l0) b.s(serialDescriptor, 2, e5l0.a, g5l0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                theme = (Theme) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), theme);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new hs00(i, aVar, str, g5l0Var, theme);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hs00 hs00Var = (hs00) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hs00.e;
        if (b.F() || hs00Var.a != null) {
            b.g(serialDescriptor, 0, zbx.a, hs00Var.a);
        }
        if (b.F() || hs00Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, hs00Var.b);
        }
        if (b.F() || hs00Var.c != null) {
            b.g(serialDescriptor, 2, e5l0.a, hs00Var.c);
        }
        if (b.F() || hs00Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), hs00Var.d);
        }
        b.c(serialDescriptor);
    }
}
