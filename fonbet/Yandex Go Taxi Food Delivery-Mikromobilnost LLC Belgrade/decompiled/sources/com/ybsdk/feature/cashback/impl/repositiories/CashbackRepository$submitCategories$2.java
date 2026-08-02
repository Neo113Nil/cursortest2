package com.ybsdk.feature.cashback.impl.repositiories;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.cashback.impl.dto.requests.DecisionsRequest;
import com.ybsdk.feature.cashback.impl.dto.requests.MakeCashbackPromoDecisionRequest;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.network.CashbackApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/cashback/impl/dto/requests/MakePromoDecisionResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.cashback.impl.repositiories.CashbackRepository$submitCategories$2", f = "CashbackRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackRepository$submitCategories$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ List<CashbackSelectorCategoryEntity> $categoryList;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $promoId;
    final /* synthetic */ String $promoType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackRepository$submitCategories$2(a aVar, String str, String str2, String str3, List list, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$promoId = str2;
        this.$promoType = str3;
        this.$categoryList = list;
        this.$idempotencyToken = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CashbackRepository$submitCategories$2(this.this$0, this.$agreementId, this.$promoId, this.$promoType, this.$categoryList, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CashbackRepository$submitCategories$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CashbackApi cashbackApi = this.this$0.a;
            String str = this.$agreementId;
            String str2 = this.$promoId;
            String str3 = this.$promoType;
            List<CashbackSelectorCategoryEntity> list = this.$categoryList;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CashbackSelectorCategoryEntity) it.next()).m380getCategoryIdUWxlUg());
            }
            MakeCashbackPromoDecisionRequest makeCashbackPromoDecisionRequest = new MakeCashbackPromoDecisionRequest(str, Collections.singletonList(new DecisionsRequest(str2, str3, arrayList)));
            String str4 = this.$idempotencyToken;
            this.label = 1;
            a = cashbackApi.a(makeCashbackPromoDecisionRequest, str4, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
