package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class eg8 implements uxs {
    public static final eg8 a;
    private static final SerialDescriptor descriptor;

    static {
        eg8 eg8Var = new eg8();
        a = eg8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputCustomProps", eg8Var, 9);
        pluginGeneratedSerialDescriptor.j("tokenizationData", false);
        pluginGeneratedSerialDescriptor.j("enableDynamicBinInfo", true);
        pluginGeneratedSerialDescriptor.j("enableDebranding", true);
        pluginGeneratedSerialDescriptor.j(DivkitThemeChangeListener.THEME_VARIABLE_NAME, true);
        pluginGeneratedSerialDescriptor.j("dynamicBinInfoProps", true);
        pluginGeneratedSerialDescriptor.j("placeholderColorExpression", true);
        pluginGeneratedSerialDescriptor.j("textColorExpression", true);
        pluginGeneratedSerialDescriptor.j("topLabelColorExpression", true);
        pluginGeneratedSerialDescriptor.j("errorTextColorExpression", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        KSerializer n = qke.n(z96Var);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{ug8.a, n, z96Var, qke.n(auu0Var), qke.n(d5n.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        yg8 yg8Var = null;
        Boolean bool = null;
        String str2 = null;
        f5n f5nVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    yg8Var = (yg8) b.A(serialDescriptor, 0, ug8.a, yg8Var);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    f5nVar = (f5n) b.s(serialDescriptor, 4, d5n.a, f5nVar);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) b.s(serialDescriptor, 7, auu0.a, str5);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ig8(i, yg8Var, bool, z2, str2, f5nVar, str3, str4, str5, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ig8 ig8Var = (ig8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ug8 ug8Var = ug8.a;
        yg8 yg8Var = ig8Var.a;
        String str = ig8Var.i;
        String str2 = ig8Var.h;
        String str3 = ig8Var.g;
        String str4 = ig8Var.f;
        f5n f5nVar = ig8Var.e;
        String str5 = ig8Var.d;
        boolean z = ig8Var.c;
        Boolean bool = ig8Var.b;
        b.e(serialDescriptor, 0, ug8Var, yg8Var);
        if (b.F() || !jl40.l(bool, Boolean.FALSE)) {
            b.g(serialDescriptor, 1, z96.a, bool);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 2, z);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 3, auu0.a, str5);
        }
        if (b.F() || f5nVar != null) {
            b.g(serialDescriptor, 4, d5n.a, f5nVar);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 5, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 6, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 7, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 8, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
