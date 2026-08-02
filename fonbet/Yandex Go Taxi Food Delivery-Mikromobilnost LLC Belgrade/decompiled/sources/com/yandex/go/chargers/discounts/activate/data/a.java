package com.yandex.go.chargers.discounts.activate.data;

import com.yandex.go.chargers.discounts.data.ChargersDiscountsApi;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateRequestDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateResponseDto;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.xoj;
import defpackage.yj9;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final po21 a;
    public final h3y b;

    public a(po21 po21Var, h3y h3yVar) {
        this.a = po21Var;
        this.b = h3yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r4 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yj9 yj9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountsActivateRepository$activatePromocode$1 chargersDiscountsActivateRepository$activatePromocode$1;
        int i;
        yj9 yj9Var2;
        Object h;
        if (continuationImpl instanceof ChargersDiscountsActivateRepository$activatePromocode$1) {
            chargersDiscountsActivateRepository$activatePromocode$1 = (ChargersDiscountsActivateRepository$activatePromocode$1) continuationImpl;
            int i2 = chargersDiscountsActivateRepository$activatePromocode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsActivateRepository$activatePromocode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountsActivateRepository$activatePromocode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsActivateRepository$activatePromocode$1.label;
                if (i != 0) {
                    b.b(obj);
                    yj9Var2 = yj9Var;
                    chargersDiscountsActivateRepository$activatePromocode$1.L$0 = yj9Var2;
                    chargersDiscountsActivateRepository$activatePromocode$1.label = 1;
                    h = ((e) this.a).h(chargersDiscountsActivateRepository$activatePromocode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    yj9 yj9Var3 = (yj9) chargersDiscountsActivateRepository$activatePromocode$1.L$0;
                    b.b(obj);
                    h = obj;
                    yj9Var2 = yj9Var3;
                }
                mo21 mo21Var = (mo21) h;
                ChargersDiscountsApi chargersDiscountsApi = (ChargersDiscountsApi) this.b.get();
                String str = yj9Var2.a;
                String str2 = yj9Var2.b;
                xoj xojVar = yj9Var2.c;
                cmt<ChargersDiscountsActivateResponseDto> c = chargersDiscountsApi.c(new ChargersDiscountsActivateRequestDto(str, str2, xojVar == null ? new ChargersDiscountsActivateRequestDto.ChargersDiscountsActivateStationInfo(xojVar.a, xojVar.b) : null, new zzs(mo21Var.a, mo21Var.b, 0, null, null, 28)));
                chargersDiscountsActivateRepository$activatePromocode$1.L$0 = null;
                chargersDiscountsActivateRepository$activatePromocode$1.L$1 = null;
                chargersDiscountsActivateRepository$activatePromocode$1.label = 2;
                Object a = c.a(chargersDiscountsActivateRepository$activatePromocode$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        chargersDiscountsActivateRepository$activatePromocode$1 = new ChargersDiscountsActivateRepository$activatePromocode$1(this, continuationImpl);
        Object obj2 = chargersDiscountsActivateRepository$activatePromocode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsActivateRepository$activatePromocode$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) h;
        ChargersDiscountsApi chargersDiscountsApi2 = (ChargersDiscountsApi) this.b.get();
        String str3 = yj9Var2.a;
        String str22 = yj9Var2.b;
        xoj xojVar2 = yj9Var2.c;
        cmt<ChargersDiscountsActivateResponseDto> c2 = chargersDiscountsApi2.c(new ChargersDiscountsActivateRequestDto(str3, str22, xojVar2 == null ? new ChargersDiscountsActivateRequestDto.ChargersDiscountsActivateStationInfo(xojVar2.a, xojVar2.b) : null, new zzs(mo21Var2.a, mo21Var2.b, 0, null, null, 28)));
        chargersDiscountsActivateRepository$activatePromocode$1.L$0 = null;
        chargersDiscountsActivateRepository$activatePromocode$1.L$1 = null;
        chargersDiscountsActivateRepository$activatePromocode$1.label = 2;
        Object a2 = c2.a(chargersDiscountsActivateRepository$activatePromocode$1);
        if (a2 != coroutineSingletons2) {
        }
    }
}
