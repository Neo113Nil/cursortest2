package com.yandex.go.promocodes.base.impl.promo_codes.data.datasources;

import com.yandex.go.promocodes.base.impl.promo_codes.data.api.PromoCodesApi;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListRequestDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListResponseDto;
import defpackage.cmt;
import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListResponseDto;", "<anonymous>", "(Ltse;)Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListResponseDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.PromoCodeRemoteDatasource$list$2", f = "PromoCodeRemoteDatasource.kt", l = {43, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PromoCodeRemoteDatasource$list$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $filterServices;
    final /* synthetic */ String $zoneName;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeRemoteDatasource$list$2(String str, c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$zoneName = str;
        this.this$0 = cVar;
        this.$filterServices = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromoCodeRemoteDatasource$list$2 promoCodeRemoteDatasource$list$2 = new PromoCodeRemoteDatasource$list$2(this.$zoneName, this.this$0, this.$filterServices, continuation);
        promoCodeRemoteDatasource$list$2.L$0 = obj;
        return promoCodeRemoteDatasource$list$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodeRemoteDatasource$list$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r13 == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new PromoCodeRemoteDatasource$list$2$launchInfo$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = h.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        cmt<PromoCodeListResponseDto> c = ((PromoCodesApi) this.this$0.c.getValue()).c(new PromoCodeListRequestDto(((dvx) obj).a, this.$zoneName, ((com.yandex.go.payments.paymentlist.data.c) this.this$0.b).f(null), this.$filterServices, Collections.singletonList("promo_code_copy_action")));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object a = ru.yandex.taxi.network.api.a.a(c, null, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
