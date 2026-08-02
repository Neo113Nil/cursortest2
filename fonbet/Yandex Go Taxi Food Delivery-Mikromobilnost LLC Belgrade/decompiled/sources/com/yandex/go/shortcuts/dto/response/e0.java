package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.models.OfferType;
import defpackage.asq0;
import defpackage.cei0;
import defpackage.d6z;
import defpackage.di2;
import defpackage.fd60;
import defpackage.i3y;
import defpackage.ncx;
import defpackage.oi60;
import defpackage.sjd;
import defpackage.ur60;
import defpackage.vcx;
import defpackage.vfx;
import defpackage.yci0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class e0 extends vfx {
    public static final e0 a = new e0();
    public static final i3y b;
    public static final i3y c;
    public static final i3y d;
    public static final asq0 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = kotlin.a.b(lazyThreadSafetyMode, new oi60(15));
        c = kotlin.a.b(lazyThreadSafetyMode, new oi60(16));
        d = kotlin.a.b(lazyThreadSafetyMode, new oi60(17));
        e = d6z.f("com.yandex.go.shortcuts.dto.response.Offer", new SerialDescriptor[0], new fd60(12));
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        com.yandex.go.dto.response.q1 q1Var;
        asq0 asq0Var = e;
        sjd b2 = ncxVar.b(asq0Var);
        FormattedText formattedText = FormattedText.c;
        TextStyleDto textStyleDto = new TextStyleDto(0);
        Background background = new Background(0);
        Background background2 = new Background(0);
        Counters counters = new Counters(0);
        Object obj = OfferType.UNSUPPORTED;
        Offer$Animation.Companion.getClass();
        FormattedText formattedText2 = formattedText;
        FormattedText formattedText3 = formattedText2;
        TextStyleDto textStyleDto2 = textStyleDto;
        Background background3 = background;
        Background background4 = background2;
        Counters counters2 = counters;
        Offer$Animation offer$Animation = Offer$Animation.g;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        double d2 = 0.0d;
        double d3 = 0.0d;
        List list = EmptyList.a;
        List list2 = list;
        List list3 = list2;
        Object obj2 = null;
        f0 f0Var = null;
        Offer$MainScreenOnboarding offer$MainScreenOnboarding = null;
        di2 di2Var = null;
        cei0 cei0Var = null;
        while (true) {
            a.getClass();
            int v = b2.v(asq0Var);
            switch (v) {
                case -1:
                    kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj2;
                    if (cVar == null || (q1Var = (com.yandex.go.dto.response.q1) ncxVar.d().a(((OfferType) obj).getSerializer(), cVar)) == null) {
                        q1Var = com.yandex.go.dto.response.e0.INSTANCE;
                    }
                    ur60 ur60Var = new ur60(str, str2, str3, formattedText2, formattedText3, d2, d3, list, textStyleDto2, background3, background4, counters2, f0Var, (OfferType) obj, q1Var, str4, str5, str6, list2, offer$MainScreenOnboarding, offer$Animation, list3, di2Var, cei0Var);
                    ur60Var.y = cVar;
                    b2.c(asq0Var);
                    return ur60Var;
                case 0:
                    str = b2.k(asq0Var, v);
                    break;
                case 1:
                    str2 = b2.k(asq0Var, v);
                    break;
                case 2:
                    str3 = b2.k(asq0Var, v);
                    break;
                case 3:
                    formattedText2 = (FormattedText) b2.A(asq0Var, v, FormattedText.Companion.serializer(), null);
                    break;
                case 4:
                    formattedText3 = (FormattedText) b2.A(asq0Var, v, FormattedText.Companion.serializer(), null);
                    break;
                case 5:
                    d2 = b2.E(asq0Var, v);
                    break;
                case 6:
                    d3 = b2.E(asq0Var, v);
                    break;
                case 7:
                    list = (List) b2.A(asq0Var, v, (KSerializer) b.getValue(), null);
                    break;
                case 8:
                    textStyleDto2 = (TextStyleDto) b2.A(asq0Var, v, TextStyleDto.Companion.serializer(), null);
                    break;
                case 9:
                    background3 = (Background) b2.A(asq0Var, v, Background.Companion.serializer(), null);
                    break;
                case 10:
                    background4 = (Background) b2.A(asq0Var, v, Background.Companion.serializer(), null);
                    break;
                case 11:
                    counters2 = (Counters) b2.A(asq0Var, v, Counters.Companion.serializer(), null);
                    break;
                case 12:
                    f0Var = (f0) b2.s(asq0Var, v, f0.Companion.serializer(), null);
                    break;
                case 13:
                    obj = b2.A(asq0Var, v, OfferType.Companion.serializer(), null);
                    break;
                case 14:
                    obj2 = b2.A(asq0Var, v, kotlinx.serialization.json.c.Companion.serializer(), null);
                    break;
                case 15:
                    str4 = b2.k(asq0Var, v);
                    break;
                case 16:
                    str5 = b2.k(asq0Var, v);
                    break;
                case 17:
                    str6 = b2.k(asq0Var, v);
                    break;
                case 18:
                    list2 = (List) b2.A(asq0Var, v, (KSerializer) c.getValue(), null);
                    break;
                case 19:
                    offer$MainScreenOnboarding = (Offer$MainScreenOnboarding) b2.s(asq0Var, v, Offer$MainScreenOnboarding.Companion.serializer(), null);
                    break;
                case 20:
                    offer$Animation = (Offer$Animation) b2.A(asq0Var, v, Offer$Animation.Companion.serializer(), null);
                    break;
                case 21:
                    list3 = (List) b2.A(asq0Var, v, (KSerializer) d.getValue(), null);
                    break;
                case 22:
                    di2Var = (di2) b2.s(asq0Var, v, di2.Companion.serializer(), null);
                    break;
                case 23:
                    cei0Var = (cei0) b2.s(asq0Var, v, cei0.Companion.serializer(), null);
                    break;
                default:
                    yci0.m("Invalid index received in ");
                    return null;
            }
        }
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        ur60 ur60Var = (ur60) obj;
        asq0 asq0Var = e;
        yjd b2 = vcxVar.b(asq0Var);
        a.getClass();
        b2.o(asq0Var, 0, ur60Var.a);
        b2.o(asq0Var, 1, ur60Var.b);
        b2.o(asq0Var, 2, ur60Var.c);
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        b2.e(asq0Var, 3, bVar.serializer(), ur60Var.d);
        b2.e(asq0Var, 4, bVar.serializer(), ur60Var.e);
        b2.E(asq0Var, 5, ur60Var.f);
        b2.E(asq0Var, 6, ur60Var.g);
        b2.e(asq0Var, 7, (KSerializer) b.getValue(), ur60Var.h);
        b2.e(asq0Var, 8, TextStyleDto.Companion.serializer(), ur60Var.i);
        f fVar = Background.Companion;
        b2.e(asq0Var, 9, fVar.serializer(), ur60Var.j);
        b2.e(asq0Var, 10, fVar.serializer(), ur60Var.k);
        b2.e(asq0Var, 11, Counters.Companion.serializer(), ur60Var.l);
        b2.g(asq0Var, 12, f0.Companion.serializer(), ur60Var.m);
        b2.e(asq0Var, 13, OfferType.Companion.serializer(), ur60Var.n);
        b2.g(asq0Var, 14, kotlinx.serialization.json.c.Companion.serializer(), ur60Var.y);
        b2.o(asq0Var, 15, ur60Var.p);
        b2.o(asq0Var, 16, ur60Var.q);
        b2.o(asq0Var, 17, ur60Var.r);
        b2.e(asq0Var, 18, (KSerializer) c.getValue(), ur60Var.s);
        b2.g(asq0Var, 19, Offer$MainScreenOnboarding.Companion.serializer(), ur60Var.t);
        b2.e(asq0Var, 20, Offer$Animation.Companion.serializer(), ur60Var.u);
        b2.e(asq0Var, 21, (KSerializer) d.getValue(), ur60Var.v);
        b2.g(asq0Var, 22, di2.Companion.serializer(), ur60Var.w);
        b2.g(asq0Var, 23, cei0.Companion.serializer(), ur60Var.x);
        b2.c(asq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return e;
    }
}
