package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import defpackage.knf0;
import defpackage.lnf0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List w;

    public a(vpr vprVar, c cVar, String str, List list) {
        this.a = vprVar;
        this.b = cVar;
        this.c = str;
        this.w = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1 promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1) {
            promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1 = (PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1) continuation;
            int i2 = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lnf0 a = ((knf0) obj).a(this.b.i(), this.c, this.w);
                    Object obj3 = a != null ? a.c : null;
                    if (obj3 == null) {
                        obj3 = EmptyList.a;
                    }
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.L$0 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.L$1 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.L$2 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.L$3 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1 = new PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
