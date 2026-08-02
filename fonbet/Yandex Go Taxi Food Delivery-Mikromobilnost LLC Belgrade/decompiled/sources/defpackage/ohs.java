package defpackage;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ohs implements uxs {
    public static final ohs a;
    private static final SerialDescriptor descriptor;

    static {
        ohs ohsVar = new ohs();
        a = ohsVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.FullScreenBanner", ohsVar, 12);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("zones", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("start_date", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("promotion", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        pluginGeneratedSerialDescriptor.j("pages", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = shs.n;
        auu0 auu0Var = auu0.a;
        vmt vmtVar = vmt.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), h6w.a, qke.n(vmtVar), qke.n(vmtVar), i3yVarArr[6].getValue(), auu0Var, z96Var, z96Var, i3yVarArr[10].getValue(), qke.n(h8s0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = shs.n;
        b.getClass();
        n8s0 n8s0Var = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        Map map = null;
        List list2 = null;
        int i2 = 0;
        Calendar calendar = null;
        Calendar calendar2 = null;
        Set set = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    calendar = (Calendar) b.s(serialDescriptor, 4, vmt.a, calendar);
                    i |= 16;
                    break;
                case 5:
                    calendar2 = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar2);
                    i |= 32;
                    break;
                case 6:
                    set = (Set) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), set);
                    i |= 64;
                    break;
                case 7:
                    str2 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    z3 = b.C(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                case 11:
                    n8s0Var = (n8s0) b.s(serialDescriptor, 11, h8s0.a, n8s0Var);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new shs(i, str, map, list2, i2, calendar, calendar2, set, str2, z2, z3, list, n8s0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        shs shsVar = (shs) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = shs.n;
        if (b.F() || !jl40.l(shsVar.b, "")) {
            b.o(serialDescriptor, 0, shsVar.b);
        }
        if (b.F() || shsVar.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), shsVar.c);
        }
        if (b.F() || shsVar.d != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), shsVar.d);
        }
        if (b.F() || shsVar.e != 0) {
            b.A(3, shsVar.e, serialDescriptor);
        }
        if (b.F() || shsVar.f != null) {
            b.g(serialDescriptor, 4, vmt.a, shsVar.f);
        }
        if (b.F() || shsVar.g != null) {
            b.g(serialDescriptor, 5, vmt.a, shsVar.g);
        }
        if (b.F() || !jl40.l(shsVar.h, EmptySet.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), shsVar.h);
        }
        if (b.F() || !jl40.l(shsVar.i, "")) {
            b.o(serialDescriptor, 7, shsVar.i);
        }
        if (b.F() || shsVar.j) {
            b.n(serialDescriptor, 8, shsVar.j);
        }
        if (b.F() || !shsVar.k) {
            b.n(serialDescriptor, 9, shsVar.k);
        }
        if (b.F() || !jl40.l(shsVar.l, EmptyList.a)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), shsVar.l);
        }
        if (b.F() || shsVar.m != null) {
            b.g(serialDescriptor, 11, h8s0.a, shsVar.m);
        }
        b.c(serialDescriptor);
    }
}
