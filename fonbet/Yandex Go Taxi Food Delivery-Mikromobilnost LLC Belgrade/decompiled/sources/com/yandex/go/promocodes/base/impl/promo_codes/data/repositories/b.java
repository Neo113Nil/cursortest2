package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List w;

    public b(r0 r0Var, c cVar, String str, List list) {
        this.a = r0Var;
        this.b = cVar;
        this.c = str;
        this.w = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1 promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1) {
            promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1 = (PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1) continuation;
            int i2 = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w);
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.L$0 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.L$1 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.L$2 = null;
                    promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1 = new PromoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesRepositoryImpl$promoCodesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
