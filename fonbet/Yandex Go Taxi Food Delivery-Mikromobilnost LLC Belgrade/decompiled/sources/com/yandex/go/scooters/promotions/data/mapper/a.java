package com.yandex.go.scooters.promotions.data.mapper;

import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.bvf0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.wno0;
import defpackage.xno0;
import defpackage.yno0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final k7x0 a;
    public final e b;

    public a(k7x0 k7x0Var, e eVar) {
        this.a = k7x0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersPromoblockResponse.PromotionsCommunication promotionsCommunication, ContinuationImpl continuationImpl) {
        ScootersPromotionsMapper$mapPromotionsCommunication$1 scootersPromotionsMapper$mapPromotionsCommunication$1;
        int i;
        String a;
        ScootersPromoblockResponse.PromotionsCommunication promotionsCommunication2;
        String str;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2;
        CharSequence charSequence3;
        if (continuationImpl instanceof ScootersPromotionsMapper$mapPromotionsCommunication$1) {
            scootersPromotionsMapper$mapPromotionsCommunication$1 = (ScootersPromotionsMapper$mapPromotionsCommunication$1) continuationImpl;
            int i2 = scootersPromotionsMapper$mapPromotionsCommunication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPromotionsMapper$mapPromotionsCommunication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPromotionsMapper$mapPromotionsCommunication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPromotionsMapper$mapPromotionsCommunication$1.label;
                e eVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (promotionsCommunication == null) {
                        return null;
                    }
                    ScootersPromoblockResponse.PromotionsCommunication.PromotionsCommunicationIcon promotionsCommunicationIcon = promotionsCommunication.d;
                    a = promotionsCommunicationIcon.a.length() > 0 ? ((m7x0) this.a).a(promotionsCommunicationIcon.a) : null;
                    String str3 = promotionsCommunication.a;
                    FormattedText formattedText2 = promotionsCommunication.b;
                    scootersPromotionsMapper$mapPromotionsCommunication$1.L$0 = promotionsCommunication;
                    scootersPromotionsMapper$mapPromotionsCommunication$1.L$1 = a;
                    scootersPromotionsMapper$mapPromotionsCommunication$1.L$2 = str3;
                    scootersPromotionsMapper$mapPromotionsCommunication$1.label = 1;
                    Object t = eVar.t(formattedText2, scootersPromotionsMapper$mapPromotionsCommunication$1);
                    if (t != coroutineSingletons) {
                        promotionsCommunication2 = promotionsCommunication;
                        str = str3;
                        obj = t;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) scootersPromotionsMapper$mapPromotionsCommunication$1.L$4;
                    str = (String) scootersPromotionsMapper$mapPromotionsCommunication$1.L$3;
                    str2 = (String) scootersPromotionsMapper$mapPromotionsCommunication$1.L$1;
                    b.b(obj);
                    charSequence2 = (CharSequence) obj;
                    charSequence = charSequence3;
                    a = str2;
                    return new wno0(charSequence, charSequence2, str, a != null ? a : null);
                }
                String str4 = (String) scootersPromotionsMapper$mapPromotionsCommunication$1.L$2;
                String str5 = (String) scootersPromotionsMapper$mapPromotionsCommunication$1.L$1;
                promotionsCommunication2 = (ScootersPromoblockResponse.PromotionsCommunication) scootersPromotionsMapper$mapPromotionsCommunication$1.L$0;
                b.b(obj);
                str = str4;
                a = str5;
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = promotionsCommunication2.c;
                if (formattedText != null) {
                    charSequence = charSequence4;
                    charSequence2 = null;
                    return new wno0(charSequence, charSequence2, str, a != null ? a : null);
                }
                scootersPromotionsMapper$mapPromotionsCommunication$1.L$0 = null;
                scootersPromotionsMapper$mapPromotionsCommunication$1.L$1 = a;
                scootersPromotionsMapper$mapPromotionsCommunication$1.L$2 = null;
                scootersPromotionsMapper$mapPromotionsCommunication$1.L$3 = str;
                scootersPromotionsMapper$mapPromotionsCommunication$1.L$4 = charSequence4;
                scootersPromotionsMapper$mapPromotionsCommunication$1.label = 2;
                Object t2 = eVar.t(formattedText, scootersPromotionsMapper$mapPromotionsCommunication$1);
                if (t2 != coroutineSingletons) {
                    str2 = a;
                    charSequence3 = charSequence4;
                    obj = t2;
                    charSequence2 = (CharSequence) obj;
                    charSequence = charSequence3;
                    a = str2;
                    return new wno0(charSequence, charSequence2, str, a != null ? a : null);
                }
                return coroutineSingletons;
            }
        }
        scootersPromotionsMapper$mapPromotionsCommunication$1 = new ScootersPromotionsMapper$mapPromotionsCommunication$1(this, continuationImpl);
        Object obj2 = scootersPromotionsMapper$mapPromotionsCommunication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromotionsMapper$mapPromotionsCommunication$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = promotionsCommunication2.c;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersPromoblockResponse scootersPromoblockResponse, ContinuationImpl continuationImpl) {
        ScootersPromotionsMapper$mapScootersPromotionsResponse$1 scootersPromotionsMapper$mapScootersPromotionsResponse$1;
        Object obj;
        int i;
        Object n;
        wno0 wno0Var;
        if (continuationImpl instanceof ScootersPromotionsMapper$mapScootersPromotionsResponse$1) {
            scootersPromotionsMapper$mapScootersPromotionsResponse$1 = (ScootersPromotionsMapper$mapScootersPromotionsResponse$1) continuationImpl;
            int i2 = scootersPromotionsMapper$mapScootersPromotionsResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPromotionsMapper$mapScootersPromotionsResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPromotionsMapper$mapScootersPromotionsResponse$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPromotionsMapper$mapScootersPromotionsResponse$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ScootersPromoblockResponse.ScootersPromo scootersPromo = scootersPromoblockResponse.a;
                    ScootersPromoblockResponse.PromotionsCommunication promotionsCommunication = scootersPromo != null ? scootersPromo.a : null;
                    scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$0 = scootersPromoblockResponse;
                    scootersPromotionsMapper$mapScootersPromotionsResponse$1.label = 1;
                    obj2 = a(promotionsCommunication, scootersPromotionsMapper$mapScootersPromotionsResponse$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wno0Var = (wno0) scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$1;
                        scootersPromoblockResponse = (ScootersPromoblockResponse) scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$0;
                        b.b(obj2);
                        xno0 xno0Var = (xno0) obj2;
                        ScootersPromoblockResponse.ScootersPromo scootersPromo2 = scootersPromoblockResponse.a;
                        return new yno0(wno0Var, xno0Var, scootersPromo2 != null ? scootersPromo2.b : null);
                    }
                    scootersPromoblockResponse = (ScootersPromoblockResponse) scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$0;
                    b.b(obj2);
                }
                wno0 wno0Var2 = (wno0) obj2;
                ScootersPromoblockResponse.ScootersTopBanner scootersTopBanner = scootersPromoblockResponse.b;
                scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$0 = scootersPromoblockResponse;
                scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$1 = wno0Var2;
                scootersPromotionsMapper$mapScootersPromotionsResponse$1.label = 2;
                n = scootersTopBanner != null ? null : bvf0.n(new ScootersPromotionsMapper$mapTopBannerCommunication$2(this, scootersTopBanner, null), scootersPromotionsMapper$mapScootersPromotionsResponse$1);
                if (n != obj) {
                    obj2 = n;
                    wno0Var = wno0Var2;
                    xno0 xno0Var2 = (xno0) obj2;
                    ScootersPromoblockResponse.ScootersPromo scootersPromo22 = scootersPromoblockResponse.a;
                    return new yno0(wno0Var, xno0Var2, scootersPromo22 != null ? scootersPromo22.b : null);
                }
                return obj;
            }
        }
        scootersPromotionsMapper$mapScootersPromotionsResponse$1 = new ScootersPromotionsMapper$mapScootersPromotionsResponse$1(this, continuationImpl);
        Object obj22 = scootersPromotionsMapper$mapScootersPromotionsResponse$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromotionsMapper$mapScootersPromotionsResponse$1.label;
        if (i != 0) {
        }
        wno0 wno0Var22 = (wno0) obj22;
        ScootersPromoblockResponse.ScootersTopBanner scootersTopBanner2 = scootersPromoblockResponse.b;
        scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$0 = scootersPromoblockResponse;
        scootersPromotionsMapper$mapScootersPromotionsResponse$1.L$1 = wno0Var22;
        scootersPromotionsMapper$mapScootersPromotionsResponse$1.label = 2;
        if (scootersTopBanner2 != null) {
        }
        if (n != obj) {
        }
        return obj;
    }
}
