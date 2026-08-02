package com.yandex.go.chargers.order.completion.pre_finish.data;

import com.yandex.go.chargers.data.model.ChargersStationInfoDto;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ActiveOrderDto;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishResponse;
import defpackage.bvf0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.s1a;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final k7x0 a;
    public final e b;
    public final c c;

    public a(k7x0 k7x0Var, e eVar, c cVar) {
        this.a = k7x0Var;
        this.b = eVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersPreFinishResponse chargersPreFinishResponse, ContinuationImpl continuationImpl) {
        ChargersPreFinishStateMapper$mapToChargersPreFinishState$1 chargersPreFinishStateMapper$mapToChargersPreFinishState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        String str2;
        Object n;
        String str3;
        String str4;
        ChargersPreFinishResponse chargersPreFinishResponse2;
        CharSequence charSequence;
        ActiveOrderDto activeOrderDto;
        Object e;
        CharSequence charSequence2;
        List list;
        String str5;
        String str6;
        ChargersPreFinishResponse chargersPreFinishResponse3;
        ActiveOrderDto activeOrderDto2;
        Object e2;
        String str7;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str8;
        ChargersPreFinishResponse chargersPreFinishResponse4;
        ChargersPreFinishResponse chargersPreFinishResponse5 = chargersPreFinishResponse;
        if (continuationImpl instanceof ChargersPreFinishStateMapper$mapToChargersPreFinishState$1) {
            chargersPreFinishStateMapper$mapToChargersPreFinishState$1 = (ChargersPreFinishStateMapper$mapToChargersPreFinishState$1) continuationImpl;
            int i2 = chargersPreFinishStateMapper$mapToChargersPreFinishState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPreFinishStateMapper$mapToChargersPreFinishState$1.label = i2 - Integer.MIN_VALUE;
                ChargersPreFinishStateMapper$mapToChargersPreFinishState$1 chargersPreFinishStateMapper$mapToChargersPreFinishState$12 = chargersPreFinishStateMapper$mapToChargersPreFinishState$1;
                Object obj = chargersPreFinishStateMapper$mapToChargersPreFinishState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label;
                k7x0 k7x0Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    ChargersStationInfoDto chargersStationInfoDto = chargersPreFinishResponse5.a;
                    String str9 = chargersStationInfoDto != null ? chargersStationInfoDto.c : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    String a = str9.length() == 0 ? null : ((m7x0) k7x0Var).a(str9);
                    ChargersStationInfoDto chargersStationInfoDto2 = chargersPreFinishResponse5.a;
                    String str10 = chargersStationInfoDto2 != null ? chargersStationInfoDto2.a : null;
                    if (str10 == null) {
                        str10 = "";
                    }
                    FormattedText formattedText = chargersStationInfoDto2 != null ? chargersStationInfoDto2.b : null;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse5;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = a;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str10;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 1;
                    Object x = this.b.x(formattedText, chargersPreFinishStateMapper$mapToChargersPreFinishState$12);
                    if (x != coroutineSingletons) {
                        str = a;
                        obj = x;
                        str2 = str10;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence = (CharSequence) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4;
                        String str11 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3;
                        String str12 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2;
                        ChargersPreFinishResponse chargersPreFinishResponse6 = (ChargersPreFinishResponse) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0;
                        b.b(obj);
                        str3 = str11;
                        str4 = str12;
                        chargersPreFinishResponse2 = chargersPreFinishResponse6;
                        List list2 = (List) obj;
                        activeOrderDto = chargersPreFinishResponse2.c;
                        if (activeOrderDto != null || (r6 = activeOrderDto.a) == null) {
                            FormattedText formattedText2 = FormattedText.c;
                        }
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse2;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = str4;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str3;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4 = charSequence;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5 = list2;
                        chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 3;
                        ChargersPreFinishResponse chargersPreFinishResponse7 = chargersPreFinishResponse2;
                        e = c.e(this.c, formattedText2, null, false, chargersPreFinishStateMapper$mapToChargersPreFinishState$12, 30);
                        if (e != coroutineSingletons) {
                            String str13 = str3;
                            charSequence2 = charSequence;
                            list = list2;
                            obj = e;
                            str5 = str4;
                            str6 = str13;
                            chargersPreFinishResponse3 = chargersPreFinishResponse7;
                            CharSequence charSequence5 = (CharSequence) obj;
                            activeOrderDto2 = chargersPreFinishResponse3.c;
                            if (activeOrderDto2 != null) {
                            }
                            FormattedText formattedText3 = FormattedText.c;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse3;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = str5;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str6;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4 = charSequence2;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5 = list;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$6 = charSequence5;
                            chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 4;
                            ChargersPreFinishResponse chargersPreFinishResponse8 = chargersPreFinishResponse3;
                            String str14 = str5;
                            e2 = c.e(this.c, formattedText3, null, false, chargersPreFinishStateMapper$mapToChargersPreFinishState$12, 30);
                            if (e2 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence6 = (CharSequence) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$6;
                        list = (List) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5;
                        CharSequence charSequence7 = (CharSequence) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4;
                        String str15 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3;
                        String str16 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2;
                        chargersPreFinishResponse4 = (ChargersPreFinishResponse) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0;
                        b.b(obj);
                        charSequence3 = charSequence6;
                        charSequence4 = charSequence7;
                        str8 = str15;
                        str7 = str16;
                        List list3 = list;
                        CharSequence charSequence8 = (CharSequence) obj;
                        ActiveOrderDto activeOrderDto3 = chargersPreFinishResponse4.c;
                        String str17 = activeOrderDto3 != null ? activeOrderDto3.c : null;
                        return new s1a(charSequence4, str8, list3, charSequence3, charSequence8, ((m7x0) k7x0Var).a(str17 != null ? str17 : ""), str7);
                    }
                    list = (List) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5;
                    CharSequence charSequence9 = (CharSequence) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4;
                    String str18 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3;
                    String str19 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2;
                    ChargersPreFinishResponse chargersPreFinishResponse9 = (ChargersPreFinishResponse) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0;
                    b.b(obj);
                    charSequence2 = charSequence9;
                    str6 = str18;
                    str5 = str19;
                    chargersPreFinishResponse3 = chargersPreFinishResponse9;
                    CharSequence charSequence52 = (CharSequence) obj;
                    activeOrderDto2 = chargersPreFinishResponse3.c;
                    if (activeOrderDto2 != null || (formattedText3 = activeOrderDto2.b) == null) {
                        FormattedText formattedText32 = FormattedText.c;
                    }
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse3;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = str5;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str6;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4 = charSequence2;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5 = list;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$6 = charSequence52;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 4;
                    ChargersPreFinishResponse chargersPreFinishResponse82 = chargersPreFinishResponse3;
                    String str142 = str5;
                    e2 = c.e(this.c, formattedText32, null, false, chargersPreFinishStateMapper$mapToChargersPreFinishState$12, 30);
                    if (e2 != coroutineSingletons) {
                        str7 = str142;
                        charSequence3 = charSequence52;
                        obj = e2;
                        charSequence4 = charSequence2;
                        str8 = str6;
                        chargersPreFinishResponse4 = chargersPreFinishResponse82;
                        List list32 = list;
                        CharSequence charSequence82 = (CharSequence) obj;
                        ActiveOrderDto activeOrderDto32 = chargersPreFinishResponse4.c;
                        if (activeOrderDto32 != null) {
                        }
                        return new s1a(charSequence4, str8, list32, charSequence3, charSequence82, ((m7x0) k7x0Var).a(str17 != null ? str17 : ""), str7);
                    }
                    return coroutineSingletons;
                }
                String str20 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3;
                String str21 = (String) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2;
                ChargersPreFinishResponse chargersPreFinishResponse10 = (ChargersPreFinishResponse) chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0;
                b.b(obj);
                str2 = str20;
                chargersPreFinishResponse5 = chargersPreFinishResponse10;
                str = str21;
                CharSequence charSequence10 = (CharSequence) obj;
                List list4 = chargersPreFinishResponse5.b;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse5;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = str;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str2;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4 = charSequence10;
                chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 2;
                List list5 = list4;
                n = (list5 != null || list5.isEmpty()) ? EmptyList.a : bvf0.n(new ChargersPreFinishStateMapper$prepareFinishButtons$2(list4, this, null), chargersPreFinishStateMapper$mapToChargersPreFinishState$12);
                if (n != coroutineSingletons) {
                    str3 = str2;
                    str4 = str;
                    chargersPreFinishResponse2 = chargersPreFinishResponse5;
                    charSequence = charSequence10;
                    obj = n;
                    List list22 = (List) obj;
                    activeOrderDto = chargersPreFinishResponse2.c;
                    if (activeOrderDto != null) {
                    }
                    FormattedText formattedText22 = FormattedText.c;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$0 = chargersPreFinishResponse2;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$1 = null;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$2 = str4;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$3 = str3;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$4 = charSequence;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.L$5 = list22;
                    chargersPreFinishStateMapper$mapToChargersPreFinishState$12.label = 3;
                    ChargersPreFinishResponse chargersPreFinishResponse72 = chargersPreFinishResponse2;
                    e = c.e(this.c, formattedText22, null, false, chargersPreFinishStateMapper$mapToChargersPreFinishState$12, 30);
                    if (e != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersPreFinishStateMapper$mapToChargersPreFinishState$1 = new ChargersPreFinishStateMapper$mapToChargersPreFinishState$1(this, continuationImpl);
        ChargersPreFinishStateMapper$mapToChargersPreFinishState$1 chargersPreFinishStateMapper$mapToChargersPreFinishState$122 = chargersPreFinishStateMapper$mapToChargersPreFinishState$1;
        Object obj2 = chargersPreFinishStateMapper$mapToChargersPreFinishState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPreFinishStateMapper$mapToChargersPreFinishState$122.label;
        k7x0 k7x0Var2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence102 = (CharSequence) obj2;
        List list42 = chargersPreFinishResponse5.b;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.L$0 = chargersPreFinishResponse5;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.L$1 = null;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.L$2 = str;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.L$3 = str2;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.L$4 = charSequence102;
        chargersPreFinishStateMapper$mapToChargersPreFinishState$122.label = 2;
        List list52 = list42;
        if (list52 != null) {
        }
        if (n != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
