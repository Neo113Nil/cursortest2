package com.ybsdk.feature.cashback.impl.domain;

import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/cashback/impl/entities/SelectedCodeStatus;", "idempotencyToken", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.cashback.impl.domain.CashbackInteractor$submitCategories$2", f = "CashbackInteractor.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackInteractor$submitCategories$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ List<CashbackSelectorCategoryEntity> $categoryList;
    final /* synthetic */ String $promoId;
    final /* synthetic */ String $promoType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackInteractor$submitCategories$2(a aVar, String str, String str2, List list, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$promoId = str;
        this.$promoType = str2;
        this.$categoryList = list;
        this.$agreementId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CashbackInteractor$submitCategories$2 cashbackInteractor$submitCategories$2 = new CashbackInteractor$submitCategories$2(this.this$0, this.$promoId, this.$promoType, this.$categoryList, this.$agreementId, continuation);
        cashbackInteractor$submitCategories$2.L$0 = obj;
        return cashbackInteractor$submitCategories$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CashbackInteractor$submitCategories$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.cashback.impl.repositiories.a aVar = this.this$0.a;
            String str2 = this.$promoId;
            String str3 = this.$promoType;
            List<CashbackSelectorCategoryEntity> list = this.$categoryList;
            String str4 = this.$agreementId;
            this.label = 1;
            b = aVar.b(str2, str3, list, str, str4, this);
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
