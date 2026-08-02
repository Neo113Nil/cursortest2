package com.yandex.go.multimodal_route.mappers;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.multimodal_route.network.models.HubDoneButtonDto;
import com.yandex.go.multimodal_route.network.models.HubRatingSelectorDto;
import com.yandex.go.multimodal_route.network.models.SupportButtonDto;
import com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto;
import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$Unsupported;
import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$ValueTipsChoiceDto;
import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$ZeroValueTipsChoiceDto;
import com.yandex.go.multimodal_route.network.models.TipsChoicesDto;
import com.yandex.go.multimodal_route.network.models.w;
import defpackage.a711;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.ny61;
import defpackage.o611;
import defpackage.obm;
import defpackage.p611;
import defpackage.t611;
import defpackage.u611;
import defpackage.w511;
import defpackage.x611;
import defpackage.xdf;
import defpackage.y611;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final e b;
    public final xdf c;

    public a(c cVar, e eVar, xdf xdfVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = xdfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiFeedbackDto taxiFeedbackDto, Integer num, int i, ContinuationImpl continuationImpl) {
        TaxiFeedbackDtoMapper$map$1 taxiFeedbackDtoMapper$map$1;
        int i2;
        HubRatingSelectorDto hubRatingSelectorDto;
        SupportButtonDto supportButtonDto;
        TipsChoicesDto tipsChoicesDto;
        fef h;
        int i3;
        o611 o611Var;
        String str;
        Object obj;
        String str2;
        p611 p611Var;
        t611 t611Var;
        String str3;
        String str4;
        fef fefVar;
        SupportButtonDto supportButtonDto2;
        TipsChoicesDto tipsChoicesDto2;
        Integer num2;
        p611 p611Var2;
        String str5;
        String str6;
        CharSequence charSequence;
        String str7;
        String str8;
        CharSequence charSequence2;
        String str9;
        obm obmVar;
        String str10;
        a711 a711Var;
        Object obj2;
        Object y611Var;
        Integer num3 = num;
        if (continuationImpl instanceof TaxiFeedbackDtoMapper$map$1) {
            taxiFeedbackDtoMapper$map$1 = (TaxiFeedbackDtoMapper$map$1) continuationImpl;
            int i4 = taxiFeedbackDtoMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                taxiFeedbackDtoMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = taxiFeedbackDtoMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = taxiFeedbackDtoMapper$map$1.label;
                c cVar = this.a;
                Object obj4 = null;
                if (i2 != 0) {
                    b.b(obj3);
                    hubRatingSelectorDto = taxiFeedbackDto.d;
                    supportButtonDto = taxiFeedbackDto.e;
                    tipsChoicesDto = taxiFeedbackDto.f;
                    ief iefVar = taxiFeedbackDto.h;
                    h = iefVar != null ? gwk0.h(iefVar) : null;
                    if (num3 != null) {
                        HubDoneButtonDto hubDoneButtonDto = taxiFeedbackDto.g;
                        String str11 = hubDoneButtonDto.a;
                        str = hubDoneButtonDto.b;
                        FormattedText formattedText = hubDoneButtonDto.c;
                        taxiFeedbackDtoMapper$map$1.L$0 = null;
                        taxiFeedbackDtoMapper$map$1.L$1 = num3;
                        taxiFeedbackDtoMapper$map$1.L$2 = hubRatingSelectorDto;
                        taxiFeedbackDtoMapper$map$1.L$3 = supportButtonDto;
                        taxiFeedbackDtoMapper$map$1.L$4 = tipsChoicesDto;
                        taxiFeedbackDtoMapper$map$1.L$5 = h;
                        taxiFeedbackDtoMapper$map$1.L$6 = str11;
                        taxiFeedbackDtoMapper$map$1.L$7 = str;
                        taxiFeedbackDtoMapper$map$1.I$0 = i;
                        taxiFeedbackDtoMapper$map$1.label = 1;
                        Object i5 = c.i(cVar, formattedText, null, taxiFeedbackDtoMapper$map$1, 30);
                        if (i5 != coroutineSingletons) {
                            obj = i5;
                            i3 = i;
                            str2 = str11;
                        }
                        return coroutineSingletons;
                    }
                    i3 = i;
                    o611Var = null;
                    p611Var = new p611(hubRatingSelectorDto.a, hubRatingSelectorDto.b);
                    if (supportButtonDto == null) {
                        t611Var = null;
                        Integer num4 = num3;
                        o611 o611Var2 = o611Var;
                        if (tipsChoicesDto == null) {
                        }
                        return new u611(p611Var, t611Var, a711Var, o611Var2, num4, new Integer(i3));
                    }
                    str3 = supportButtonDto.a;
                    str4 = supportButtonDto.b;
                    FormattedText formattedText2 = supportButtonDto.c;
                    taxiFeedbackDtoMapper$map$1.L$0 = null;
                    taxiFeedbackDtoMapper$map$1.L$1 = num3;
                    taxiFeedbackDtoMapper$map$1.L$2 = null;
                    taxiFeedbackDtoMapper$map$1.L$3 = null;
                    taxiFeedbackDtoMapper$map$1.L$4 = tipsChoicesDto;
                    taxiFeedbackDtoMapper$map$1.L$5 = h;
                    taxiFeedbackDtoMapper$map$1.L$6 = o611Var;
                    taxiFeedbackDtoMapper$map$1.L$7 = supportButtonDto;
                    taxiFeedbackDtoMapper$map$1.L$8 = str4;
                    taxiFeedbackDtoMapper$map$1.L$9 = str3;
                    taxiFeedbackDtoMapper$map$1.L$10 = p611Var;
                    taxiFeedbackDtoMapper$map$1.I$0 = i3;
                    taxiFeedbackDtoMapper$map$1.label = 2;
                    Object i6 = c.i(cVar, formattedText2, null, taxiFeedbackDtoMapper$map$1, 30);
                    if (i6 != coroutineSingletons) {
                        TipsChoicesDto tipsChoicesDto3 = tipsChoicesDto;
                        fefVar = h;
                        supportButtonDto2 = supportButtonDto;
                        tipsChoicesDto2 = tipsChoicesDto3;
                        num2 = num3;
                        p611Var2 = p611Var;
                        obj3 = i6;
                        str5 = str4;
                        str6 = str3;
                        charSequence = (CharSequence) obj3;
                        str7 = supportButtonDto2.d;
                        if (str7 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = taxiFeedbackDtoMapper$map$1.I$0;
                        p611Var2 = (p611) taxiFeedbackDtoMapper$map$1.L$12;
                        str10 = (String) taxiFeedbackDtoMapper$map$1.L$11;
                        charSequence = (CharSequence) taxiFeedbackDtoMapper$map$1.L$10;
                        str6 = (String) taxiFeedbackDtoMapper$map$1.L$9;
                        str5 = (String) taxiFeedbackDtoMapper$map$1.L$8;
                        supportButtonDto2 = (SupportButtonDto) taxiFeedbackDtoMapper$map$1.L$7;
                        o611Var = (o611) taxiFeedbackDtoMapper$map$1.L$6;
                        fefVar = (fef) taxiFeedbackDtoMapper$map$1.L$5;
                        tipsChoicesDto2 = (TipsChoicesDto) taxiFeedbackDtoMapper$map$1.L$4;
                        num2 = (Integer) taxiFeedbackDtoMapper$map$1.L$1;
                        b.b(obj3);
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj3;
                        obm obmVar2 = bitmapDrawable != null ? null : new obm(str10, bitmapDrawable);
                        str8 = str6;
                        charSequence2 = charSequence;
                        str9 = str5;
                        obmVar = obmVar2;
                        p611Var = p611Var2;
                        num3 = num2;
                        t611Var = new t611(str8, str9, charSequence2, obmVar, supportButtonDto2.e);
                        h = fefVar;
                        tipsChoicesDto = tipsChoicesDto2;
                        Integer num42 = num3;
                        o611 o611Var22 = o611Var;
                        if (tipsChoicesDto == null) {
                            String str12 = tipsChoicesDto.a;
                            String str13 = tipsChoicesDto.b;
                            List<w> list = tipsChoicesDto.d;
                            ArrayList arrayList = new ArrayList();
                            for (w wVar : list) {
                                if (wVar instanceof TipsChoiceItemDto$Unsupported) {
                                    obj2 = obj4;
                                    y611Var = obj2;
                                } else if (wVar instanceof TipsChoiceItemDto$ValueTipsChoiceDto) {
                                    TipsChoiceItemDto$ValueTipsChoiceDto tipsChoiceItemDto$ValueTipsChoiceDto = (TipsChoiceItemDto$ValueTipsChoiceDto) wVar;
                                    String str14 = tipsChoiceItemDto$ValueTipsChoiceDto.a;
                                    String str15 = tipsChoiceItemDto$ValueTipsChoiceDto.b;
                                    String str16 = tipsChoiceItemDto$ValueTipsChoiceDto.c;
                                    if (str16 == null) {
                                        obj2 = obj4;
                                        str16 = this.c.c(h, str15, true);
                                    } else {
                                        obj2 = obj4;
                                    }
                                    y611Var = new x611(str14, str15, str16);
                                } else {
                                    obj2 = obj4;
                                    if (!(wVar instanceof TipsChoiceItemDto$ZeroValueTipsChoiceDto)) {
                                        w511.b();
                                        return obj2;
                                    }
                                    TipsChoiceItemDto$ZeroValueTipsChoiceDto tipsChoiceItemDto$ZeroValueTipsChoiceDto = (TipsChoiceItemDto$ZeroValueTipsChoiceDto) wVar;
                                    y611Var = new y611(tipsChoiceItemDto$ZeroValueTipsChoiceDto.a, tipsChoiceItemDto$ZeroValueTipsChoiceDto.b);
                                }
                                if (y611Var != null) {
                                    arrayList.add(y611Var);
                                }
                                obj4 = obj2;
                            }
                            a711Var = new a711(str12, str13, i3, arrayList);
                        } else {
                            a711Var = null;
                        }
                        return new u611(p611Var, t611Var, a711Var, o611Var22, num42, new Integer(i3));
                    }
                    i3 = taxiFeedbackDtoMapper$map$1.I$0;
                    p611Var2 = (p611) taxiFeedbackDtoMapper$map$1.L$10;
                    str3 = (String) taxiFeedbackDtoMapper$map$1.L$9;
                    str4 = (String) taxiFeedbackDtoMapper$map$1.L$8;
                    SupportButtonDto supportButtonDto3 = (SupportButtonDto) taxiFeedbackDtoMapper$map$1.L$7;
                    o611Var = (o611) taxiFeedbackDtoMapper$map$1.L$6;
                    fefVar = (fef) taxiFeedbackDtoMapper$map$1.L$5;
                    tipsChoicesDto2 = (TipsChoicesDto) taxiFeedbackDtoMapper$map$1.L$4;
                    num2 = (Integer) taxiFeedbackDtoMapper$map$1.L$1;
                    b.b(obj3);
                    supportButtonDto2 = supportButtonDto3;
                    str5 = str4;
                    str6 = str3;
                    charSequence = (CharSequence) obj3;
                    str7 = supportButtonDto2.d;
                    if (str7 != null) {
                        str8 = str6;
                        charSequence2 = charSequence;
                        str9 = str5;
                        obmVar = null;
                        p611Var = p611Var2;
                        num3 = num2;
                        t611Var = new t611(str8, str9, charSequence2, obmVar, supportButtonDto2.e);
                        h = fefVar;
                        tipsChoicesDto = tipsChoicesDto2;
                        Integer num422 = num3;
                        o611 o611Var222 = o611Var;
                        if (tipsChoicesDto == null) {
                        }
                        return new u611(p611Var, t611Var, a711Var, o611Var222, num422, new Integer(i3));
                    }
                    taxiFeedbackDtoMapper$map$1.L$0 = null;
                    taxiFeedbackDtoMapper$map$1.L$1 = num2;
                    taxiFeedbackDtoMapper$map$1.L$2 = null;
                    taxiFeedbackDtoMapper$map$1.L$3 = null;
                    taxiFeedbackDtoMapper$map$1.L$4 = tipsChoicesDto2;
                    taxiFeedbackDtoMapper$map$1.L$5 = fefVar;
                    taxiFeedbackDtoMapper$map$1.L$6 = o611Var;
                    taxiFeedbackDtoMapper$map$1.L$7 = supportButtonDto2;
                    taxiFeedbackDtoMapper$map$1.L$8 = str5;
                    taxiFeedbackDtoMapper$map$1.L$9 = str6;
                    taxiFeedbackDtoMapper$map$1.L$10 = charSequence;
                    taxiFeedbackDtoMapper$map$1.L$11 = str7;
                    taxiFeedbackDtoMapper$map$1.L$12 = p611Var2;
                    taxiFeedbackDtoMapper$map$1.I$0 = i3;
                    taxiFeedbackDtoMapper$map$1.label = 3;
                    int i7 = i3;
                    Object f = e.f(this.b, str7, null, taxiFeedbackDtoMapper$map$1, 6);
                    if (f != coroutineSingletons) {
                        str10 = str7;
                        obj3 = f;
                        i3 = i7;
                        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj3;
                        if (bitmapDrawable2 != null) {
                        }
                        str8 = str6;
                        charSequence2 = charSequence;
                        str9 = str5;
                        obmVar = obmVar2;
                        p611Var = p611Var2;
                        num3 = num2;
                        t611Var = new t611(str8, str9, charSequence2, obmVar, supportButtonDto2.e);
                        h = fefVar;
                        tipsChoicesDto = tipsChoicesDto2;
                        Integer num4222 = num3;
                        o611 o611Var2222 = o611Var;
                        if (tipsChoicesDto == null) {
                        }
                        return new u611(p611Var, t611Var, a711Var, o611Var2222, num4222, new Integer(i3));
                    }
                    return coroutineSingletons;
                }
                i3 = taxiFeedbackDtoMapper$map$1.I$0;
                String str17 = (String) taxiFeedbackDtoMapper$map$1.L$7;
                String str18 = (String) taxiFeedbackDtoMapper$map$1.L$6;
                h = (fef) taxiFeedbackDtoMapper$map$1.L$5;
                tipsChoicesDto = (TipsChoicesDto) taxiFeedbackDtoMapper$map$1.L$4;
                supportButtonDto = (SupportButtonDto) taxiFeedbackDtoMapper$map$1.L$3;
                hubRatingSelectorDto = (HubRatingSelectorDto) taxiFeedbackDtoMapper$map$1.L$2;
                Integer num5 = (Integer) taxiFeedbackDtoMapper$map$1.L$1;
                b.b(obj3);
                str2 = str18;
                obj = obj3;
                str = str17;
                num3 = num5;
                o611Var = new o611((CharSequence) obj, str2, str);
                p611Var = new p611(hubRatingSelectorDto.a, hubRatingSelectorDto.b);
                if (supportButtonDto == null) {
                }
            }
        }
        taxiFeedbackDtoMapper$map$1 = new TaxiFeedbackDtoMapper$map$1(this, continuationImpl);
        Object obj32 = taxiFeedbackDtoMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = taxiFeedbackDtoMapper$map$1.label;
        c cVar2 = this.a;
        Object obj42 = null;
        if (i2 != 0) {
        }
        o611Var = new o611((CharSequence) obj, str2, str);
        p611Var = new p611(hubRatingSelectorDto.a, hubRatingSelectorDto.b);
        if (supportButtonDto == null) {
        }
    }
}
