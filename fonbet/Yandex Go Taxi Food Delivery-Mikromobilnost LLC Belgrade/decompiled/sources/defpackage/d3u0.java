package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final /* synthetic */ class d3u0 implements uxs {
    public static final d3u0 a;
    private static final SerialDescriptor descriptor;

    static {
        d3u0 d3u0Var = new d3u0();
        a = d3u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.State", d3u0Var, 13);
        pluginGeneratedSerialDescriptor.j("pin", false);
        pluginGeneratedSerialDescriptor.j("bbox", false);
        pluginGeneratedSerialDescriptor.j("zoom", false);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("known_orders", true);
        pluginGeneratedSerialDescriptor.j("user", false);
        pluginGeneratedSerialDescriptor.j("known_orders_info", false);
        pluginGeneratedSerialDescriptor.j("multiclass_options", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("night_mode", true);
        pluginGeneratedSerialDescriptor.j("masstransit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = l3u0.n;
        b0t b0tVar = b0t.a;
        return new KSerializer[]{b0tVar, uc4.Companion.serializer(), nor.a, i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), b0tVar, i3yVarArr[6].getValue(), ij21.a, qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(bp40.a), qke.n(auu0.a), z96.a, qke.n(k310.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        float f;
        boolean z;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l3u0.n;
        b.getClass();
        float f2 = 0.0f;
        m310 m310Var = null;
        String str = null;
        hp40 hp40Var = null;
        List list = null;
        boolean z3 = true;
        kj21 kj21Var = null;
        int i = 0;
        zzs zzsVar = null;
        uc4 uc4Var = null;
        Mode mode = null;
        Screen screen = null;
        zzs zzsVar2 = null;
        List list2 = null;
        boolean z4 = false;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    f = f2;
                    z3 = false;
                    f2 = f;
                case 0:
                    z = z3;
                    f = f2;
                    zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                    i |= 1;
                    z3 = z;
                    f2 = f;
                case 1:
                    z = z3;
                    f = f2;
                    uc4Var = (uc4) b.A(serialDescriptor, 1, uc4.Companion.serializer(), uc4Var);
                    i |= 2;
                    z3 = z;
                    f2 = f;
                case 2:
                    z2 = z3;
                    f2 = b.y(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                case 3:
                    z = z3;
                    f = f2;
                    mode = (Mode) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), mode);
                    i |= 8;
                    z3 = z;
                    f2 = f;
                case 4:
                    z = z3;
                    f = f2;
                    screen = (Screen) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), screen);
                    i |= 16;
                    z3 = z;
                    f2 = f;
                case 5:
                    z = z3;
                    f = f2;
                    zzsVar2 = (zzs) b.A(serialDescriptor, 5, b0t.a, zzsVar2);
                    i |= 32;
                    z3 = z;
                    f2 = f;
                case 6:
                    z = z3;
                    f = f2;
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    z3 = z;
                    f2 = f;
                case 7:
                    z = z3;
                    f = f2;
                    kj21Var = (kj21) b.A(serialDescriptor, 7, ij21.a, kj21Var);
                    i |= 128;
                    z3 = z;
                    f2 = f;
                case 8:
                    z = z3;
                    f = f2;
                    list = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    z3 = z;
                    f2 = f;
                case 9:
                    z = z3;
                    f = f2;
                    hp40Var = (hp40) b.s(serialDescriptor, 9, bp40.a, hp40Var);
                    i |= 512;
                    z3 = z;
                    f2 = f;
                case 10:
                    z = z3;
                    f = f2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    z3 = z;
                    f2 = f;
                case 11:
                    z2 = z3;
                    z4 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    z3 = z2;
                case 12:
                    z = z3;
                    f = f2;
                    m310Var = (m310) b.s(serialDescriptor, 12, k310.a, m310Var);
                    i |= 4096;
                    z3 = z;
                    f2 = f;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new l3u0(i, zzsVar, uc4Var, f2, mode, screen, zzsVar2, list2, kj21Var, list, hp40Var, str, z4, m310Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l3u0 l3u0Var = (l3u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l3u0.n;
        b0t b0tVar = b0t.a;
        zzs zzsVar = l3u0Var.a;
        m310 m310Var = l3u0Var.m;
        boolean z = l3u0Var.l;
        String str = l3u0Var.k;
        hp40 hp40Var = l3u0Var.j;
        List list = l3u0Var.g;
        b.e(serialDescriptor, 0, b0tVar, zzsVar);
        b.e(serialDescriptor, 1, uc4.Companion.serializer(), l3u0Var.b);
        b.z(serialDescriptor, 2, l3u0Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), l3u0Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), l3u0Var.e);
        b.e(serialDescriptor, 5, b0tVar, l3u0Var.f);
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), list);
        }
        b.e(serialDescriptor, 7, ij21.a, l3u0Var.h);
        b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), l3u0Var.i);
        if (b.F() || hp40Var != null) {
            b.g(serialDescriptor, 9, bp40.a, hp40Var);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 10, auu0.a, str);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 11, z);
        }
        if (b.F() || m310Var != null) {
            b.g(serialDescriptor, 12, k310.a, m310Var);
        }
        b.c(serialDescriptor);
    }
}
