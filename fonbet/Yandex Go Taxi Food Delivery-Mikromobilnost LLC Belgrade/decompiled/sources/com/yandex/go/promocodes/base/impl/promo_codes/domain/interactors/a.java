package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import com.yandex.go.promocodes.base.impl.promo_codes.domain.exceptions.PromoCodeErrorException;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.wlf0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final c a;
    public final com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c b;

    public a(c cVar, com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x002f, B:13:0x0074, B:15:0x0078, B:19:0x007d, B:20:0x0082, B:27:0x005b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PromoCodeActivationInteractor$activate$1 promoCodeActivationInteractor$activate$1;
        int i;
        Object a;
        try {
            if (continuationImpl instanceof PromoCodeActivationInteractor$activate$1) {
                promoCodeActivationInteractor$activate$1 = (PromoCodeActivationInteractor$activate$1) continuationImpl;
                int i2 = promoCodeActivationInteractor$activate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promoCodeActivationInteractor$activate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = promoCodeActivationInteractor$activate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promoCodeActivationInteractor$activate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        promoCodeActivationInteractor$activate$1.L$0 = str;
                        promoCodeActivationInteractor$activate$1.label = 1;
                        a = this.a.a(promoCodeActivationInteractor$activate$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            wlf0 wlf0Var = (wlf0) obj;
                            if ((wlf0Var != null ? wlf0Var.h : null) == null) {
                                return wlf0Var;
                            }
                            throw new PromoCodeErrorException(wlf0Var);
                        }
                        str = (String) promoCodeActivationInteractor$activate$1.L$0;
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                    }
                    if (!(a instanceof Result.Failure)) {
                        return a;
                    }
                    com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar = this.b;
                    String obj2 = evu0.k0(str).toString();
                    promoCodeActivationInteractor$activate$1.L$0 = null;
                    promoCodeActivationInteractor$activate$1.L$1 = null;
                    promoCodeActivationInteractor$activate$1.label = 2;
                    obj = cVar.k((String) a, obj2, promoCodeActivationInteractor$activate$1);
                }
            }
            if (i != 0) {
            }
            if (!(a instanceof Result.Failure)) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        promoCodeActivationInteractor$activate$1 = new PromoCodeActivationInteractor$activate$1(this, continuationImpl);
        Object obj3 = promoCodeActivationInteractor$activate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeActivationInteractor$activate$1.label;
    }
}
