package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class pl6 implements uxs {
    public static final pl6 a;
    private static final SerialDescriptor descriptor;

    static {
        pl6 pl6Var = new pl6();
        a = pl6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.Bubble", pl6Var, 15);
        pluginGeneratedSerialDescriptor.j("components", true);
        pluginGeneratedSerialDescriptor.j("selected_components", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("hide_after_tap", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("max_per_session", true);
        pluginGeneratedSerialDescriptor.j("max_per_user", true);
        pluginGeneratedSerialDescriptor.j("enable_animation", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("selected_style", true);
        pluginGeneratedSerialDescriptor.j("separator", true);
        pluginGeneratedSerialDescriptor.j("overlay", true);
        pluginGeneratedSerialDescriptor.j("supports_multiline", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = rl6.p;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        h6w h6wVar = h6w.a;
        KSerializer n3 = qke.n(h6wVar);
        z96 z96Var = z96.a;
        KSerializer n4 = qke.n(z96Var);
        auu0 auu0Var = auu0.a;
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(auu0Var);
        KSerializer n7 = qke.n(h6wVar);
        KSerializer n8 = qke.n(h6wVar);
        KSerializer n9 = qke.n(z96Var);
        KSerializer n10 = qke.n((KSerializer) i3yVarArr[9].getValue());
        ywu0 ywu0Var = ywu0.a;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, n7, n8, n9, n10, qke.n(ywu0Var), qke.n(ywu0Var), qke.n(auu0Var), qke.n(kn6.a), z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        dxu0 dxu0Var;
        Integer num;
        List list;
        dxu0 dxu0Var2;
        List list2;
        Integer num2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = rl6.p;
        b.getClass();
        dxu0 dxu0Var3 = null;
        dxu0 dxu0Var4 = null;
        Float[] fArr = null;
        Boolean bool = null;
        String str = null;
        Integer num3 = null;
        int i = 0;
        mn6 mn6Var = null;
        List list3 = null;
        Integer num4 = null;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        Integer num5 = null;
        int i2 = 1;
        boolean z = true;
        List list4 = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    dxu0Var = dxu0Var3;
                    num = num4;
                    list = list4;
                    dxu0Var2 = dxu0Var4;
                    z = false;
                    dxu0Var4 = dxu0Var2;
                    num4 = num;
                    i2 = 1;
                    list4 = list;
                    dxu0Var3 = dxu0Var;
                case 0:
                    dxu0Var = dxu0Var3;
                    num = num4;
                    List list5 = list3;
                    myi myiVar = (myi) i3yVarArr[0].getValue();
                    List list6 = list4;
                    dxu0Var2 = dxu0Var4;
                    list = (List) b.s(serialDescriptor, 0, myiVar, list6);
                    i |= 1;
                    list3 = list5;
                    dxu0Var4 = dxu0Var2;
                    num4 = num;
                    i2 = 1;
                    list4 = list;
                    dxu0Var3 = dxu0Var;
                case 1:
                    dxu0Var = dxu0Var3;
                    list3 = (List) b.s(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), list3);
                    i |= 2;
                    num4 = num4;
                    dxu0Var3 = dxu0Var;
                case 2:
                    dxu0Var = dxu0Var3;
                    num4 = (Integer) b.s(serialDescriptor, 2, h6w.a, num4);
                    i |= 4;
                    list3 = list3;
                    dxu0Var3 = dxu0Var;
                case 3:
                    list2 = list3;
                    num2 = num4;
                    bool2 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool2);
                    i |= 8;
                    list3 = list2;
                    num4 = num2;
                case 4:
                    list2 = list3;
                    num2 = num4;
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    list3 = list2;
                    num4 = num2;
                case 5:
                    list2 = list3;
                    num2 = num4;
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    list3 = list2;
                    num4 = num2;
                case 6:
                    list2 = list3;
                    num2 = num4;
                    num5 = (Integer) b.s(serialDescriptor, 6, h6w.a, num5);
                    i |= 64;
                    list3 = list2;
                    num4 = num2;
                case 7:
                    list2 = list3;
                    num2 = num4;
                    num3 = (Integer) b.s(serialDescriptor, 7, h6w.a, num3);
                    i |= 128;
                    list3 = list2;
                    num4 = num2;
                case 8:
                    list2 = list3;
                    num2 = num4;
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    list3 = list2;
                    num4 = num2;
                case 9:
                    list2 = list3;
                    num2 = num4;
                    fArr = (Float[]) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), fArr);
                    i |= 512;
                    list3 = list2;
                    num4 = num2;
                case 10:
                    list2 = list3;
                    num2 = num4;
                    dxu0Var4 = (dxu0) b.s(serialDescriptor, 10, ywu0.a, dxu0Var4);
                    i |= 1024;
                    list3 = list2;
                    num4 = num2;
                case 11:
                    list2 = list3;
                    num2 = num4;
                    dxu0Var3 = (dxu0) b.s(serialDescriptor, 11, ywu0.a, dxu0Var3);
                    i |= 2048;
                    list3 = list2;
                    num4 = num2;
                case 12:
                    list2 = list3;
                    num2 = num4;
                    str = (String) b.s(serialDescriptor, 12, auu0.a, str);
                    i |= 4096;
                    list3 = list2;
                    num4 = num2;
                case 13:
                    list2 = list3;
                    num2 = num4;
                    mn6Var = (mn6) b.s(serialDescriptor, 13, kn6.a, mn6Var);
                    i |= 8192;
                    list3 = list2;
                    num4 = num2;
                case 14:
                    z2 = b.C(serialDescriptor, 14);
                    i |= 16384;
                    list3 = list3;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        dxu0 dxu0Var5 = dxu0Var3;
        List list7 = list4;
        b.c(serialDescriptor);
        return new rl6(i, list7, list3, num4, bool2, str2, str3, num5, num3, bool, fArr, dxu0Var4, dxu0Var5, str, mn6Var, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        rl6.l((rl6) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
