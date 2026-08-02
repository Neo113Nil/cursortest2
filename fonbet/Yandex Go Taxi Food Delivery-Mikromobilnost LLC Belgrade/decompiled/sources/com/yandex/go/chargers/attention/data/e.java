package com.yandex.go.chargers.attention.data;

import com.yandex.go.chargers.data.model.Action$Info;
import com.yandex.go.chargers.data.model.Action$OpenDiscountDetails;
import com.yandex.go.chargers.data.model.ChargersAttentionDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.en9;
import defpackage.ffx;
import defpackage.hm9;
import defpackage.im9;
import defpackage.jm9;
import defpackage.km9;
import defpackage.lm9;
import defpackage.mm9;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.w511;
import defpackage.wnt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class e implements en9 {
    public final wnt a;
    public final tt2 b;
    public final ru.yandex.taxi.widget.c c;
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public e(wnt wntVar, tt2 tt2Var, ru.yandex.taxi.widget.c cVar) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r0 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ChargersAttentionDto chargersAttentionDto, ContinuationImpl continuationImpl) {
        ChargersAttentionRepositoryImpl$mapToDomain$1 chargersAttentionRepositoryImpl$mapToDomain$1;
        int i;
        com.yandex.go.chargers.data.model.e eVar2;
        km9 km9Var;
        CharSequence charSequence;
        String str;
        km9 km9Var2;
        String str2;
        CharSequence charSequence2;
        String str3;
        String str4;
        ChargersAttentionDto chargersAttentionDto2;
        com.yandex.go.chargers.data.model.e eVar3;
        Object i2;
        com.yandex.go.chargers.data.model.e eVar4;
        CharSequence charSequence3;
        ChargersAttentionDto chargersAttentionDto3;
        CharSequence charSequence4;
        String str5;
        String str6;
        ChargersAttentionDto chargersAttentionDto4 = chargersAttentionDto;
        eVar.getClass();
        ru.yandex.taxi.widget.c cVar = eVar.c;
        if (continuationImpl instanceof ChargersAttentionRepositoryImpl$mapToDomain$1) {
            chargersAttentionRepositoryImpl$mapToDomain$1 = (ChargersAttentionRepositoryImpl$mapToDomain$1) continuationImpl;
            int i3 = chargersAttentionRepositoryImpl$mapToDomain$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersAttentionRepositoryImpl$mapToDomain$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersAttentionRepositoryImpl$mapToDomain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAttentionRepositoryImpl$mapToDomain$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chargersAttentionDto4 != null) {
                        FormattedText formattedText = chargersAttentionDto4.a;
                        chargersAttentionRepositoryImpl$mapToDomain$1.L$0 = chargersAttentionDto4;
                        chargersAttentionRepositoryImpl$mapToDomain$1.L$1 = null;
                        chargersAttentionRepositoryImpl$mapToDomain$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersAttentionRepositoryImpl$mapToDomain$1, 30);
                    }
                    return mm9.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence4 = (CharSequence) chargersAttentionRepositoryImpl$mapToDomain$1.L$6;
                        eVar4 = (com.yandex.go.chargers.data.model.e) chargersAttentionRepositoryImpl$mapToDomain$1.L$5;
                        str5 = (String) chargersAttentionRepositoryImpl$mapToDomain$1.L$4;
                        str6 = (String) chargersAttentionRepositoryImpl$mapToDomain$1.L$3;
                        charSequence3 = (CharSequence) chargersAttentionRepositoryImpl$mapToDomain$1.L$2;
                        chargersAttentionDto3 = (ChargersAttentionDto) chargersAttentionRepositoryImpl$mapToDomain$1.L$0;
                        kotlin.b.b(obj);
                        String str7 = ((Action$Info) eVar4).a.c;
                        String str8 = chargersAttentionDto3.f;
                        hm9 hm9Var = new hm9(charSequence4, (CharSequence) obj, str7);
                        str2 = str5;
                        chargersAttentionDto4 = chargersAttentionDto3;
                        str = str6;
                        charSequence = charSequence3;
                        km9Var2 = hm9Var;
                        return new lm9(charSequence, str, str2, km9Var2, chargersAttentionDto4.f, chargersAttentionDto4.e);
                    }
                    eVar3 = (com.yandex.go.chargers.data.model.e) chargersAttentionRepositoryImpl$mapToDomain$1.L$5;
                    str4 = (String) chargersAttentionRepositoryImpl$mapToDomain$1.L$4;
                    str3 = (String) chargersAttentionRepositoryImpl$mapToDomain$1.L$3;
                    charSequence2 = (CharSequence) chargersAttentionRepositoryImpl$mapToDomain$1.L$2;
                    chargersAttentionDto2 = (ChargersAttentionDto) chargersAttentionRepositoryImpl$mapToDomain$1.L$0;
                    kotlin.b.b(obj);
                    CharSequence charSequence5 = (CharSequence) obj;
                    FormattedText formattedText2 = ((Action$Info) eVar3).a.b;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$0 = chargersAttentionDto2;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$1 = null;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$2 = charSequence2;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$3 = str3;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$4 = str4;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$5 = eVar3;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$6 = charSequence5;
                    chargersAttentionRepositoryImpl$mapToDomain$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersAttentionRepositoryImpl$mapToDomain$1, 30);
                    if (i2 != coroutineSingletons) {
                        eVar4 = eVar3;
                        charSequence3 = charSequence2;
                        chargersAttentionDto3 = chargersAttentionDto2;
                        charSequence4 = charSequence5;
                        obj = i2;
                        str5 = str4;
                        str6 = str3;
                        String str72 = ((Action$Info) eVar4).a.c;
                        String str82 = chargersAttentionDto3.f;
                        hm9 hm9Var2 = new hm9(charSequence4, (CharSequence) obj, str72);
                        str2 = str5;
                        chargersAttentionDto4 = chargersAttentionDto3;
                        str = str6;
                        charSequence = charSequence3;
                        km9Var2 = hm9Var2;
                        return new lm9(charSequence, str, str2, km9Var2, chargersAttentionDto4.f, chargersAttentionDto4.e);
                    }
                    return coroutineSingletons;
                }
                chargersAttentionDto4 = (ChargersAttentionDto) chargersAttentionRepositoryImpl$mapToDomain$1.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                String str9 = chargersAttentionDto4.b;
                String str10 = chargersAttentionDto4.c;
                eVar2 = chargersAttentionDto4.d;
                if (eVar2 instanceof Action$Info) {
                    if (eVar2 instanceof Action$OpenDiscountDetails) {
                        ChargersDiscountDto chargersDiscountDto = ((Action$OpenDiscountDetails) eVar2).a;
                        if (chargersDiscountDto != null) {
                            km9Var = new jm9(chargersDiscountDto.a.name(), chargersDiscountDto.b);
                        }
                        return mm9.a;
                    }
                    if (!(eVar2 instanceof com.yandex.go.chargers.data.model.d) && eVar2 != null) {
                        w511.b();
                        return null;
                    }
                    km9Var = im9.a;
                    charSequence = charSequence6;
                    str = str9;
                    km9Var2 = km9Var;
                    str2 = str10;
                    return new lm9(charSequence, str, str2, km9Var2, chargersAttentionDto4.f, chargersAttentionDto4.e);
                }
                FormattedText formattedText3 = ((Action$Info) eVar2).a.a;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$0 = chargersAttentionDto4;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$1 = null;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$2 = charSequence6;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$3 = str9;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$4 = str10;
                chargersAttentionRepositoryImpl$mapToDomain$1.L$5 = eVar2;
                chargersAttentionRepositoryImpl$mapToDomain$1.label = 2;
                Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersAttentionRepositoryImpl$mapToDomain$1, 30);
                if (i4 != coroutineSingletons) {
                    charSequence2 = charSequence6;
                    obj = i4;
                    str3 = str9;
                    str4 = str10;
                    chargersAttentionDto2 = chargersAttentionDto4;
                    eVar3 = eVar2;
                    CharSequence charSequence52 = (CharSequence) obj;
                    FormattedText formattedText22 = ((Action$Info) eVar3).a.b;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$0 = chargersAttentionDto2;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$1 = null;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$2 = charSequence2;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$3 = str3;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$4 = str4;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$5 = eVar3;
                    chargersAttentionRepositoryImpl$mapToDomain$1.L$6 = charSequence52;
                    chargersAttentionRepositoryImpl$mapToDomain$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, chargersAttentionRepositoryImpl$mapToDomain$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersAttentionRepositoryImpl$mapToDomain$1 = new ChargersAttentionRepositoryImpl$mapToDomain$1(eVar, continuationImpl);
        Object obj2 = chargersAttentionRepositoryImpl$mapToDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAttentionRepositoryImpl$mapToDomain$1.label;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj2;
        String str92 = chargersAttentionDto4.b;
        String str102 = chargersAttentionDto4.c;
        eVar2 = chargersAttentionDto4.d;
        if (eVar2 instanceof Action$Info) {
        }
    }
}
