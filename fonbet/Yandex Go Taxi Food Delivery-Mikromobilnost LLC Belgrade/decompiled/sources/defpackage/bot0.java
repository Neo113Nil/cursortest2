package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class bot0 implements uxs {
    public static final bot0 a;
    private static final SerialDescriptor descriptor;

    static {
        bot0 bot0Var = new bot0();
        a = bot0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.SpecialAppAppearanceExperiment", bot0Var, 8);
        pluginGeneratedSerialDescriptor.j("starting_point_pin_tag", true);
        pluginGeneratedSerialDescriptor.j("starting_point_pin_with_eta_tag", true);
        pluginGeneratedSerialDescriptor.j("starting_point_logo_tag", true);
        pluginGeneratedSerialDescriptor.j("starting_point_localized_logo_tags", true);
        pluginGeneratedSerialDescriptor.j("starting_point_car_poi_tags", true);
        pluginGeneratedSerialDescriptor.j("summary_car_poi_tags", true);
        pluginGeneratedSerialDescriptor.j("order_car_poi_tags", true);
        pluginGeneratedSerialDescriptor.j("colorized_order_car_poi_tags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dot0.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dot0.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        Map map5 = null;
        int i = 0;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    map3 = (Map) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map3);
                    i |= 16;
                    break;
                case 5:
                    map4 = (Map) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map4);
                    i |= 32;
                    break;
                case 6:
                    map5 = (Map) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map5);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new dot0(i, str, str2, str3, map2, map3, map4, map5, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dot0 dot0Var = (dot0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dot0.j;
        if (b.F() || dot0Var.b != null) {
            b.g(serialDescriptor, 0, auu0.a, dot0Var.b);
        }
        if (b.F() || dot0Var.c != null) {
            b.g(serialDescriptor, 1, auu0.a, dot0Var.c);
        }
        if (b.F() || dot0Var.d != null) {
            b.g(serialDescriptor, 2, auu0.a, dot0Var.d);
        }
        if (b.F() || !jl40.l(dot0Var.e, b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), dot0Var.e);
        }
        if (b.F() || !jl40.l(dot0Var.f, b.f())) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), dot0Var.f);
        }
        if (b.F() || !jl40.l(dot0Var.g, b.f())) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), dot0Var.g);
        }
        if (b.F() || !jl40.l(dot0Var.h, b.f())) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), dot0Var.h);
        }
        if (b.F() || !jl40.l(dot0Var.i, b.f())) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), dot0Var.i);
        }
        b.c(serialDescriptor);
    }
}
