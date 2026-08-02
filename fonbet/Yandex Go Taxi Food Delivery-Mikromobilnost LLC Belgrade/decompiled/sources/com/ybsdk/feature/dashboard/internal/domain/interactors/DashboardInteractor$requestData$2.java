package com.ybsdk.feature.dashboard.internal.domain.interactors;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.DashboardUserIdentificationStatusEntity;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import defpackage.gkg;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pig;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x5t;
import defpackage.xj1;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lpig;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.domain.interactors.DashboardInteractor$requestData$2", f = "DashboardInteractor.kt", l = {37, 38, 54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardInteractor$requestData$2 extends SuspendLambda implements wls {
    final /* synthetic */ DashboardScreenParams $screenParams;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardInteractor$requestData$2(b bVar, DashboardScreenParams dashboardScreenParams, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenParams = dashboardScreenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardInteractor$requestData$2 dashboardInteractor$requestData$2 = new DashboardInteractor$requestData$2(this.this$0, this.$screenParams, continuation);
        dashboardInteractor$requestData$2.L$0 = obj;
        return dashboardInteractor$requestData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardInteractor$requestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        Object obj2;
        Throwable a;
        Throwable a2;
        Object obj3;
        Object obj4;
        xj1 xj1Var;
        YBProduct yBProduct;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h = tje.h(tseVar, null, null, new DashboardInteractor$requestData$2$identificationStatusDeferred$1(this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new DashboardInteractor$requestData$2$dashboard$1(this.this$0, this.$screenParams, null), 3);
            this.L$0 = h2;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj4 = this.L$0;
                kotlin.b.b(obj);
                return new Result(obj4);
            }
            obj2 = this.L$0;
            kotlin.b.b(obj);
            Object value = ((Result) obj).getValue();
            b bVar = this.this$0;
            DashboardScreenParams dashboardScreenParams = this.$screenParams;
            a = Result.a(obj2);
            if (a == null) {
                value = new Result.Failure(a);
            } else if (!(value instanceof Result.Failure)) {
                DashboardUserIdentificationStatusEntity dashboardUserIdentificationStatusEntity = (DashboardUserIdentificationStatusEntity) obj2;
                x5t x5tVar = (x5t) value;
                List list = x5tVar.b;
                String str = x5tVar.d;
                if (str != null) {
                    ProductId productId = dashboardScreenParams.getProductId();
                    bVar.getClass();
                    switch (gkg.a[productId.ordinal()]) {
                        case 1:
                            yBProduct = YBProduct.WALLET;
                            break;
                        case 2:
                            yBProduct = YBProduct.PRO;
                            break;
                        case 3:
                            yBProduct = YBProduct.SPLIT;
                            break;
                        case 4:
                            yBProduct = YBProduct.CREDIT_LIMIT;
                            break;
                        case 5:
                            yBProduct = YBProduct.CREDIT_ACCOUNT;
                            break;
                        case 6:
                            yBProduct = YBProduct.CREDIT;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    xj1Var = new xj1(str, EmptyList.a, yBProduct);
                } else {
                    xj1Var = null;
                }
                value = new pig(list, dashboardUserIdentificationStatusEntity, xj1Var, x5tVar);
            }
            b bVar2 = this.this$0;
            ProductId productId2 = this.$screenParams.getProductId();
            this.L$0 = value;
            this.label = 3;
            a2 = Result.a(value);
            obj3 = zy11.a;
            if (a2 != null) {
                bVar2.getClass();
                pig pigVar = (pig) value;
                a aVar = bVar2.d;
                x5t x5tVar2 = pigVar.d;
                DashboardCardInfoEntity dashboardCardInfoEntity = x5tVar2 != null ? x5tVar2.i : null;
                xj1 xj1Var2 = pigVar.c;
                Object f = aVar.f(dashboardCardInfoEntity, xj1Var2 != null ? xj1Var2.a : null, false, productId2, this);
                if (f == coroutineSingletons) {
                    obj3 = f;
                }
            } else {
                bVar2.d.c(productId2, this);
            }
            if (obj3 != coroutineSingletons) {
                obj4 = value;
                return new Result(obj4);
            }
            return coroutineSingletons;
        }
        nohVar = (noh) this.L$0;
        kotlin.b.b(obj);
        Object value2 = ((Result) obj).getValue();
        this.L$0 = value2;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            obj2 = value2;
            obj = k;
            Object value3 = ((Result) obj).getValue();
            b bVar3 = this.this$0;
            DashboardScreenParams dashboardScreenParams2 = this.$screenParams;
            a = Result.a(obj2);
            if (a == null) {
            }
            b bVar22 = this.this$0;
            ProductId productId22 = this.$screenParams.getProductId();
            this.L$0 = value3;
            this.label = 3;
            a2 = Result.a(value3);
            obj3 = zy11.a;
            if (a2 != null) {
            }
            if (obj3 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
