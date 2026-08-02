package com.ybsdk.feature.cashback.impl.repositiories;

import com.ybsdk.core.analytics.generated.delegates.CashbackEvents$CashbackGetPromoResultResult;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.dto.requests.PromosRequest;
import com.ybsdk.feature.cashback.impl.dto.responses.ActiveCashbackPromoResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.ActivePromosResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackPromosResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.SuggestedCashbackPromoResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.SuggestedPromosResponse;
import com.ybsdk.feature.cashback.impl.network.CashbackApi;
import defpackage.ayg0;
import defpackage.bob1;
import defpackage.dbv0;
import defpackage.fav0;
import defpackage.g30;
import defpackage.job1;
import defpackage.jqp0;
import defpackage.jv8;
import defpackage.mvg;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.o39;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.tcc;
import defpackage.tls;
import defpackage.trp0;
import defpackage.w00;
import defpackage.w530;
import defpackage.z94;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lo39;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.cashback.impl.repositiories.CashbackRepository$getPromos$promo$1", f = "CashbackRepository.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackRepository$getPromos$promo$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackPromosResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.cashback.impl.repositiories.CashbackRepository$getPromos$promo$1$1", f = "CashbackRepository.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.cashback.impl.repositiories.CashbackRepository$getPromos$promo$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $agreementId;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$agreementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$agreementId, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                CashbackApi cashbackApi = this.this$0.a;
                PromosRequest promosRequest = new PromosRequest(this.$agreementId);
                this.label = 1;
                b = cashbackApi.b(promosRequest, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                b = ((Result) obj).getValue();
            }
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackRepository$getPromos$promo$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CashbackRepository$getPromos$promo$1(this.this$0, this.$agreementId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CashbackRepository$getPromos$promo$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        g30 g30Var;
        Object failure;
        Object failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        dbv0 dbv0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$agreementId, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        if (!(c instanceof Result.Failure)) {
            CashbackPromosResponse cashbackPromosResponse = (CashbackPromosResponse) c;
            w530 w530Var = aVar.c.a;
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            String title = cashbackPromosResponse.getCashback().getTitle();
            bVar.getClass();
            Text.Constant constant = new Text.Constant(title);
            Text.Constant constant2 = new Text.Constant(cashbackPromosResponse.getCashback().getSubtitle());
            rbv f = job1.f(qxy0.c(cashbackPromosResponse.getCashback().getThemedImage(), cashbackPromosResponse.getCashback().getImage()), new jv8(5));
            if (f == null) {
                f = new nbv(ayg0.ybsdk_ic_cashback_icon, null);
            }
            rbv rbvVar = f;
            Money money = cashbackPromosResponse.getCashback().getMoney();
            MoneyEntity g = money != null ? bob1.g(money, w530Var) : bob1.g(new Money(BigDecimal.ZERO, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), w530Var);
            ActivePromosResponse activePromos = cashbackPromosResponse.getActivePromos();
            if (activePromos != null) {
                Text constant3 = activePromos.getTitle() != null ? new Text.Constant(activePromos.getTitle()) : Text.Empty.INSTANCE;
                List<ActiveCashbackPromoResponse> promos = activePromos.getPromos();
                ArrayList arrayList = new ArrayList(tcc.n(promos, 10));
                Iterator<T> it = promos.iterator();
                while (it.hasNext()) {
                    try {
                        failure2 = w00.a((ActiveCashbackPromoResponse) it.next());
                    } catch (Exception e) {
                        trp0 trp0Var = trp0.a;
                        trp0.e(new jqp0(e, "Exception during mapCatching() in CommonExt", null, null));
                        failure2 = new Result.Failure(e);
                    }
                    arrayList.add(new Result(failure2));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!(((Result) next).getValue() instanceof Result.Failure)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object value = ((Result) it3.next()).getValue();
                    b.b(value);
                    arrayList3.add(value);
                }
                g30Var = new g30(constant3, arrayList3);
            } else {
                g30Var = null;
            }
            SuggestedPromosResponse suggestedPromos = cashbackPromosResponse.getSuggestedPromos();
            if (suggestedPromos != null) {
                String title2 = suggestedPromos.getTitle();
                List<SuggestedCashbackPromoResponse> promos2 = suggestedPromos.getPromos();
                ArrayList arrayList4 = new ArrayList(tcc.n(promos2, 10));
                Iterator<T> it4 = promos2.iterator();
                while (it4.hasNext()) {
                    try {
                        failure = fav0.a((SuggestedCashbackPromoResponse) it4.next());
                    } catch (Exception e2) {
                        trp0 trp0Var2 = trp0.a;
                        trp0.e(new jqp0(e2, "Exception during mapCatching() in CommonExt", null, null));
                        failure = new Result.Failure(e2);
                    }
                    arrayList4.add(new Result(failure));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (!(((Result) next2).getValue() instanceof Result.Failure)) {
                        arrayList5.add(next2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    Object value2 = ((Result) it6.next()).getValue();
                    b.b(value2);
                    arrayList6.add(value2);
                }
                dbv0Var = new dbv0(title2, arrayList6);
            }
            c = new o39(constant, constant2, rbvVar, g, g30Var, dbv0Var);
        }
        a aVar2 = this.this$0;
        if (!(c instanceof Result.Failure)) {
            z94.m(aVar2.b.m, CashbackEvents$CashbackGetPromoResultResult.OK);
        }
        a aVar3 = this.this$0;
        if (Result.a(c) != null) {
            z94.m(aVar3.b.m, CashbackEvents$CashbackGetPromoResultResult.ERROR);
        }
        return new Result(c);
    }
}
