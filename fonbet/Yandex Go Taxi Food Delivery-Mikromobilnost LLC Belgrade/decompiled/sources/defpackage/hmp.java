package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes5.dex */
public final /* synthetic */ class hmp implements uxs {
    public static final hmp a;
    private static final SerialDescriptor descriptor;

    static {
        hmp hmpVar = new hmp();
        a = hmpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.FeatureProperties", hmpVar, 11);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("simplified_style", true);
        pluginGeneratedSerialDescriptor.j("bubbles_list", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("overlays", true);
        pluginGeneratedSerialDescriptor.j("image_overlays", true);
        pluginGeneratedSerialDescriptor.j("behavior", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("display_settings", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = jmp.l;
        KSerializer n = qke.n(aqx.a);
        xwu0 xwu0Var = xwu0.a;
        return new KSerializer[]{n, qke.n(xwu0Var), qke.n(xwu0Var), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(pl6.a), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(kmp.a), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(xzj.a), qke.n((KSerializer) i3yVarArr[10].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = jmp.l;
        b.getClass();
        MapObjectType mapObjectType = null;
        f0k f0kVar = null;
        List list = null;
        boolean z2 = true;
        mmp mmpVar = null;
        int i = 0;
        hqx hqxVar = null;
        bxu0 bxu0Var = null;
        bxu0 bxu0Var2 = null;
        List list2 = null;
        rl6 rl6Var = null;
        List list3 = null;
        List list4 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    hqxVar = (hqx) b.s(serialDescriptor, 0, aqx.a, hqxVar);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    bxu0Var = (bxu0) b.s(serialDescriptor, 1, xwu0.a, bxu0Var);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    bxu0Var2 = (bxu0) b.s(serialDescriptor, 2, xwu0.a, bxu0Var2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list2 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    rl6Var = (rl6) b.s(serialDescriptor, 4, pl6.a, rl6Var);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list3 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list4 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    mmpVar = (mmp) b.s(serialDescriptor, 7, kmp.a, mmpVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    f0kVar = (f0k) b.s(serialDescriptor, 9, xzj.a, f0kVar);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    mapObjectType = (MapObjectType) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), mapObjectType);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new jmp(i, hqxVar, bxu0Var, bxu0Var2, list2, rl6Var, list3, list4, mmpVar, list, f0kVar, mapObjectType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jmp jmpVar = (jmp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = jmp.l;
        if (b.F() || jmpVar.a != null) {
            b.g(serialDescriptor, 0, aqx.a, jmpVar.a);
        }
        if (b.F() || jmpVar.b != null) {
            b.g(serialDescriptor, 1, xwu0.a, jmpVar.b);
        }
        if (b.F() || jmpVar.c != null) {
            b.g(serialDescriptor, 2, xwu0.a, jmpVar.c);
        }
        if (b.F() || jmpVar.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), jmpVar.d);
        }
        if (b.F() || jmpVar.e != null) {
            b.g(serialDescriptor, 4, pl6.a, jmpVar.e);
        }
        if (b.F() || jmpVar.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), jmpVar.f);
        }
        if (b.F() || jmpVar.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), jmpVar.g);
        }
        if (b.F() || jmpVar.h != null) {
            b.g(serialDescriptor, 7, kmp.a, jmpVar.h);
        }
        if (b.F() || jmpVar.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), jmpVar.i);
        }
        if (b.F() || jmpVar.j != null) {
            b.g(serialDescriptor, 9, xzj.a, jmpVar.j);
        }
        if (b.F() || jmpVar.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), jmpVar.k);
        }
        b.c(serialDescriptor);
    }
}
