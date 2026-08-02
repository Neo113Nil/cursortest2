package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.LabelType;

/* loaded from: classes9.dex */
public final /* synthetic */ class aqx implements uxs {
    public static final aqx a;
    private static final SerialDescriptor descriptor;

    static {
        aqx aqxVar = new aqx();
        a = aqxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.Label", aqxVar, 15);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("behavior", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        pluginGeneratedSerialDescriptor.j("draw_background", true);
        pluginGeneratedSerialDescriptor.j("typeface", true);
        pluginGeneratedSerialDescriptor.j("anchor_x", true);
        pluginGeneratedSerialDescriptor.j("anchor_y", true);
        pluginGeneratedSerialDescriptor.j("max_lines", true);
        pluginGeneratedSerialDescriptor.j("max_chars", true);
        pluginGeneratedSerialDescriptor.j("alignment", true);
        pluginGeneratedSerialDescriptor.j("safe_zone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = hqx.p;
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[2].getValue());
        KSerializer n4 = qke.n(hl5.a);
        h6w h6wVar = h6w.a;
        KSerializer n5 = qke.n(h6wVar);
        KSerializer n6 = qke.n(h6wVar);
        nor norVar = nor.a;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, qke.n(norVar), qke.n(z96.a), qke.n(h6wVar), qke.n(norVar), qke.n(norVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(norVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        Float[] fArr;
        jl5 jl5Var;
        Integer num;
        jl5 jl5Var2;
        String str;
        jl5 jl5Var3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = hqx.p;
        b.getClass();
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        int i = 0;
        Integer num5 = null;
        Float f3 = null;
        Float[] fArr2 = null;
        jl5 jl5Var4 = null;
        Integer num6 = null;
        Integer num7 = null;
        Float f4 = null;
        int i2 = 1;
        boolean z = true;
        String str2 = null;
        LabelType labelType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    num = num2;
                    jl5Var2 = jl5Var4;
                    str = str2;
                    z = false;
                    f = f;
                    jl5Var4 = jl5Var2;
                    i2 = 1;
                    str2 = str;
                    num2 = num;
                case 0:
                    num = num2;
                    jl5Var2 = jl5Var4;
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    f = f;
                    fArr2 = fArr2;
                    jl5Var4 = jl5Var2;
                    i2 = 1;
                    str2 = str;
                    num2 = num;
                case 1:
                    num = num2;
                    jl5Var3 = jl5Var4;
                    labelType = (LabelType) b.s(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), labelType);
                    i |= 2;
                    fArr2 = fArr2;
                    jl5Var4 = jl5Var3;
                    num2 = num;
                case 2:
                    num = num2;
                    jl5Var3 = jl5Var4;
                    fArr2 = (Float[]) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), fArr2);
                    i |= 4;
                    jl5Var4 = jl5Var3;
                    num2 = num;
                case 3:
                    num = num2;
                    jl5Var4 = (jl5) b.s(serialDescriptor, 3, hl5.a, jl5Var4);
                    i |= 8;
                    fArr2 = fArr2;
                    num2 = num;
                case 4:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num6 = (Integer) b.s(serialDescriptor, 4, h6w.a, num6);
                    i |= 16;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 5:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num7 = (Integer) b.s(serialDescriptor, 5, h6w.a, num7);
                    i |= 32;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 6:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    f4 = (Float) b.s(serialDescriptor, 6, nor.a, f4);
                    i |= 64;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 7:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 8:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num3 = (Integer) b.s(serialDescriptor, 8, h6w.a, num3);
                    i |= 256;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 9:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    f2 = (Float) b.s(serialDescriptor, 9, nor.a, f2);
                    i |= 512;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 10:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    f = (Float) b.s(serialDescriptor, 10, nor.a, f);
                    i |= 1024;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 11:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num2 = (Integer) b.s(serialDescriptor, 11, h6w.a, num2);
                    i |= 2048;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 12:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num4 = (Integer) b.s(serialDescriptor, 12, h6w.a, num4);
                    i |= 4096;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 13:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    num5 = (Integer) b.s(serialDescriptor, 13, h6w.a, num5);
                    i |= 8192;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                case 14:
                    fArr = fArr2;
                    jl5Var = jl5Var4;
                    f3 = (Float) b.s(serialDescriptor, 14, nor.a, f3);
                    i |= 16384;
                    fArr2 = fArr;
                    jl5Var4 = jl5Var;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        Integer num8 = num2;
        jl5 jl5Var5 = jl5Var4;
        b.c(serialDescriptor);
        return new hqx(i, str2, labelType, fArr2, jl5Var5, num6, num7, f4, bool, num3, f2, f, num8, num4, num5, f3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        hqx.c((hqx) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
