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
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.a;
import ru.yandex.taxi.communications.api.dto.y0;

/* loaded from: classes9.dex */
public final /* synthetic */ class ab8 implements uxs {
    public static final ab8 a;
    private static final SerialDescriptor descriptor;

    static {
        ab8 ab8Var = new ab8();
        a = ab8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.CardBanner", ab8Var, 20);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("zones", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("start_date", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        pluginGeneratedSerialDescriptor.j("promotion", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("animation", true);
        pluginGeneratedSerialDescriptor.j("is_foldable", true);
        pluginGeneratedSerialDescriptor.j("backgrounds", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("show_immediately", true);
        pluginGeneratedSerialDescriptor.j("extra_animation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cb8.v;
        auu0 auu0Var = auu0.a;
        vmt vmtVar = vmt.a;
        z96 z96Var = z96.a;
        y0 y0Var = y0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), h6w.a, qke.n(vmtVar), qke.n(vmtVar), auu0Var, z96Var, z96Var, i3yVarArr[9].getValue(), qke.n(y0Var), qke.n(y0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(er4.a), z96Var, i3yVarArr[16].getValue(), a.a, z96Var, qke.n(fi2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        List list;
        Map map;
        int i;
        String str;
        List list2;
        Map map2;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cb8.v;
        b.getClass();
        String str2 = null;
        String str3 = null;
        TypedContentWidget typedContentWidget = null;
        TypedContentWidget typedContentWidget2 = null;
        gr4 gr4Var = null;
        Set set = null;
        int i3 = 0;
        List list3 = null;
        Map map3 = null;
        List list4 = null;
        BannerWidgets bannerWidgets = null;
        Calendar calendar = null;
        Calendar calendar2 = null;
        hi2 hi2Var = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        String str4 = null;
        int i4 = 0;
        String str5 = null;
        boolean z4 = false;
        boolean z5 = false;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    list = list4;
                    z3 = false;
                    map3 = map3;
                    list4 = list;
                case 0:
                    str = str2;
                    list2 = list4;
                    str4 = b.k(serialDescriptor, 0);
                    i3 |= 1;
                    map3 = map3;
                    list4 = list2;
                    str2 = str;
                case 1:
                    str = str2;
                    list2 = list4;
                    map3 = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map3);
                    i3 |= 2;
                    list4 = list2;
                    str2 = str;
                case 2:
                    str = str2;
                    list4 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list4);
                    i3 |= 4;
                    map3 = map3;
                    str2 = str;
                case 3:
                    map2 = map3;
                    i4 = b.h(serialDescriptor, 3);
                    i3 |= 8;
                    map3 = map2;
                case 4:
                    map = map3;
                    list = list4;
                    calendar = (Calendar) b.s(serialDescriptor, 4, vmt.a, calendar);
                    i3 |= 16;
                    map3 = map;
                    list4 = list;
                case 5:
                    map = map3;
                    list = list4;
                    calendar2 = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar2);
                    i3 |= 32;
                    map3 = map;
                    list4 = list;
                case 6:
                    map2 = map3;
                    str5 = b.k(serialDescriptor, 6);
                    i3 |= 64;
                    map3 = map2;
                case 7:
                    map2 = map3;
                    z = b.C(serialDescriptor, 7);
                    i3 |= 128;
                    map3 = map2;
                case 8:
                    map2 = map3;
                    z2 = b.C(serialDescriptor, 8);
                    i3 |= 256;
                    map3 = map2;
                case 9:
                    map = map3;
                    list = list4;
                    set = (Set) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), set);
                    i3 |= 512;
                    map3 = map;
                    list4 = list;
                case 10:
                    map = map3;
                    list = list4;
                    typedContentWidget2 = (TypedContentWidget) b.s(serialDescriptor, 10, y0.a, typedContentWidget2);
                    i3 |= 1024;
                    map3 = map;
                    list4 = list;
                case 11:
                    map = map3;
                    list = list4;
                    typedContentWidget = (TypedContentWidget) b.s(serialDescriptor, 11, y0.a, typedContentWidget);
                    i3 |= 2048;
                    map3 = map;
                    list4 = list;
                case 12:
                    map = map3;
                    list = list4;
                    str3 = (String) b.s(serialDescriptor, 12, auu0.a, str3);
                    i3 |= 4096;
                    map3 = map;
                    list4 = list;
                case 13:
                    map = map3;
                    list = list4;
                    str2 = (String) b.s(serialDescriptor, 13, auu0.a, str2);
                    i3 |= 8192;
                    map3 = map;
                    list4 = list;
                case 14:
                    map = map3;
                    list = list4;
                    gr4Var = (gr4) b.s(serialDescriptor, 14, er4.a, gr4Var);
                    i3 |= 16384;
                    map3 = map;
                    list4 = list;
                case 15:
                    map2 = map3;
                    z4 = b.C(serialDescriptor, 15);
                    i2 = 32768;
                    i3 |= i2;
                    map3 = map2;
                case 16:
                    map = map3;
                    list = list4;
                    list3 = (List) b.A(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), list3);
                    i = 65536;
                    i3 |= i;
                    map3 = map;
                    list4 = list;
                case 17:
                    map = map3;
                    list = list4;
                    bannerWidgets = (BannerWidgets) b.A(serialDescriptor, 17, a.a, bannerWidgets);
                    i = 131072;
                    i3 |= i;
                    map3 = map;
                    list4 = list;
                case 18:
                    map2 = map3;
                    z5 = b.C(serialDescriptor, 18);
                    i2 = 262144;
                    i3 |= i2;
                    map3 = map2;
                case 19:
                    map = map3;
                    list = list4;
                    hi2Var = (hi2) b.s(serialDescriptor, 19, fi2.a, hi2Var);
                    i = 524288;
                    i3 |= i;
                    map3 = map;
                    list4 = list;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        List list5 = list4;
        b.c(serialDescriptor);
        return new cb8(i3, str4, map3, list5, i4, calendar, calendar2, str5, z, z2, set, typedContentWidget2, typedContentWidget, str3, str2, gr4Var, z4, list3, bannerWidgets, z5, hi2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cb8 cb8Var = (cb8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cb8.v;
        if (b.F() || !jl40.l(cb8Var.b, "")) {
            b.o(serialDescriptor, 0, cb8Var.b);
        }
        if (b.F() || cb8Var.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cb8Var.c);
        }
        if (b.F() || cb8Var.d != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), cb8Var.d);
        }
        if (b.F() || cb8Var.e != 0) {
            b.A(3, cb8Var.e, serialDescriptor);
        }
        if (b.F() || cb8Var.f != null) {
            b.g(serialDescriptor, 4, vmt.a, cb8Var.f);
        }
        if (b.F() || cb8Var.g != null) {
            b.g(serialDescriptor, 5, vmt.a, cb8Var.g);
        }
        if (b.F() || !jl40.l(cb8Var.h, "")) {
            b.o(serialDescriptor, 6, cb8Var.h);
        }
        if (b.F() || cb8Var.i) {
            b.n(serialDescriptor, 7, cb8Var.i);
        }
        if (b.F() || !cb8Var.j) {
            b.n(serialDescriptor, 8, cb8Var.j);
        }
        if (b.F() || !jl40.l(cb8Var.k, EmptySet.a)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), cb8Var.k);
        }
        if (b.F() || cb8Var.l != null) {
            b.g(serialDescriptor, 10, y0.a, cb8Var.l);
        }
        if (b.F() || cb8Var.m != null) {
            b.g(serialDescriptor, 11, y0.a, cb8Var.m);
        }
        if (b.F() || cb8Var.n != null) {
            b.g(serialDescriptor, 12, auu0.a, cb8Var.n);
        }
        if (b.F() || cb8Var.o != null) {
            b.g(serialDescriptor, 13, auu0.a, cb8Var.o);
        }
        if (b.F() || cb8Var.p != null) {
            b.g(serialDescriptor, 14, er4.a, cb8Var.p);
        }
        if (b.F() || cb8Var.q) {
            b.n(serialDescriptor, 15, cb8Var.q);
        }
        if (b.F() || !jl40.l(cb8Var.r, EmptyList.a)) {
            b.e(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), cb8Var.r);
        }
        if (b.F() || !jl40.l(cb8Var.s, BannerWidgets.j)) {
            b.e(serialDescriptor, 17, a.a, cb8Var.s);
        }
        if (b.F() || cb8Var.t) {
            b.n(serialDescriptor, 18, cb8Var.t);
        }
        if (b.F() || cb8Var.u != null) {
            b.g(serialDescriptor, 19, fi2.a, cb8Var.u);
        }
        b.c(serialDescriptor);
    }
}
