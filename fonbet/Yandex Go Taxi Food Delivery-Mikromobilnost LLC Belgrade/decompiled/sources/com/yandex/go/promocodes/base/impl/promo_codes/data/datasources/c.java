package com.yandex.go.promocodes.base.impl.promo_codes.data.datasources;

import com.yandex.go.promocodes.base.impl.promo_codes.data.api.PromoCodesApi;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation.PromoCodeActivationRequestDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation.PromoCodeActivationResponseDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.deactivation.PromoCodeDeactivationRequestDto;
import defpackage.bvf0;
import defpackage.cda0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final ru.yandex.taxi.launch.c a;
    public final cda0 b;
    public final i3y c;

    public c(on2 on2Var, ru.yandex.taxi.launch.c cVar, cda0 cda0Var) {
        this.a = cVar;
        this.b = cda0Var;
        this.c = kotlin.a.a(new ck(on2Var, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        PromoCodeRemoteDatasource$activate$1 promoCodeRemoteDatasource$activate$1;
        int i;
        if (continuationImpl instanceof PromoCodeRemoteDatasource$activate$1) {
            promoCodeRemoteDatasource$activate$1 = (PromoCodeRemoteDatasource$activate$1) continuationImpl;
            int i2 = promoCodeRemoteDatasource$activate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeRemoteDatasource$activate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeRemoteDatasource$activate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeRemoteDatasource$activate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promoCodeRemoteDatasource$activate$1.L$0 = str;
                    promoCodeRemoteDatasource$activate$1.L$1 = str2;
                    promoCodeRemoteDatasource$activate$1.label = 1;
                    obj = this.a.c(promoCodeRemoteDatasource$activate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str2 = (String) promoCodeRemoteDatasource$activate$1.L$1;
                    str = (String) promoCodeRemoteDatasource$activate$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<PromoCodeActivationResponseDto> a = ((PromoCodesApi) this.c.getValue()).a(new PromoCodeActivationRequestDto((String) obj, str, str2, ((com.yandex.go.payments.paymentlist.data.c) this.b).f(null)));
                promoCodeRemoteDatasource$activate$1.L$0 = null;
                promoCodeRemoteDatasource$activate$1.L$1 = null;
                promoCodeRemoteDatasource$activate$1.L$2 = null;
                promoCodeRemoteDatasource$activate$1.L$3 = null;
                promoCodeRemoteDatasource$activate$1.label = 2;
                Object a2 = ru.yandex.taxi.network.api.a.a(a, null, promoCodeRemoteDatasource$activate$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        promoCodeRemoteDatasource$activate$1 = new PromoCodeRemoteDatasource$activate$1(this, continuationImpl);
        Object obj2 = promoCodeRemoteDatasource$activate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeRemoteDatasource$activate$1.label;
        if (i != 0) {
        }
        cmt<PromoCodeActivationResponseDto> a3 = ((PromoCodesApi) this.c.getValue()).a(new PromoCodeActivationRequestDto((String) obj2, str, str2, ((com.yandex.go.payments.paymentlist.data.c) this.b).f(null)));
        promoCodeRemoteDatasource$activate$1.L$0 = null;
        promoCodeRemoteDatasource$activate$1.L$1 = null;
        promoCodeRemoteDatasource$activate$1.L$2 = null;
        promoCodeRemoteDatasource$activate$1.L$3 = null;
        promoCodeRemoteDatasource$activate$1.label = 2;
        Object a22 = ru.yandex.taxi.network.api.a.a(a3, null, promoCodeRemoteDatasource$activate$1);
        if (a22 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r6, null, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PromoCodeRemoteDatasource$deactivate$1 promoCodeRemoteDatasource$deactivate$1;
        int i;
        if (continuationImpl instanceof PromoCodeRemoteDatasource$deactivate$1) {
            promoCodeRemoteDatasource$deactivate$1 = (PromoCodeRemoteDatasource$deactivate$1) continuationImpl;
            int i2 = promoCodeRemoteDatasource$deactivate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeRemoteDatasource$deactivate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeRemoteDatasource$deactivate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeRemoteDatasource$deactivate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promoCodeRemoteDatasource$deactivate$1.L$0 = str;
                    promoCodeRemoteDatasource$deactivate$1.label = 1;
                    obj = this.a.c(promoCodeRemoteDatasource$deactivate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str = (String) promoCodeRemoteDatasource$deactivate$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<zy11> b = ((PromoCodesApi) this.c.getValue()).b(new PromoCodeDeactivationRequestDto((String) obj, str));
                promoCodeRemoteDatasource$deactivate$1.L$0 = null;
                promoCodeRemoteDatasource$deactivate$1.L$1 = null;
                promoCodeRemoteDatasource$deactivate$1.L$2 = null;
                promoCodeRemoteDatasource$deactivate$1.label = 2;
            }
        }
        promoCodeRemoteDatasource$deactivate$1 = new PromoCodeRemoteDatasource$deactivate$1(this, continuationImpl);
        Object obj2 = promoCodeRemoteDatasource$deactivate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeRemoteDatasource$deactivate$1.label;
        if (i != 0) {
        }
        cmt<zy11> b2 = ((PromoCodesApi) this.c.getValue()).b(new PromoCodeDeactivationRequestDto((String) obj2, str));
        promoCodeRemoteDatasource$deactivate$1.L$0 = null;
        promoCodeRemoteDatasource$deactivate$1.L$1 = null;
        promoCodeRemoteDatasource$deactivate$1.L$2 = null;
        promoCodeRemoteDatasource$deactivate$1.label = 2;
    }

    public final Object c(String str, List list, Continuation continuation) {
        return bvf0.n(new PromoCodeRemoteDatasource$list$2(str, this, list, null), continuation);
    }
}
