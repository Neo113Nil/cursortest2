package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.aye0;
import defpackage.bqs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oi01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lvos;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.FundCreationInteractor$openFund$2", f = "FundCreationInteractor.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundCreationInteractor$openFund$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $fundId;
    final /* synthetic */ bqs $fundTopupInfoEntity;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundCreationInteractor$openFund$2(a aVar, String str, String str2, String str3, bqs bqsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$fundId = str3;
        this.$fundTopupInfoEntity = bqsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FundCreationInteractor$openFund$2 fundCreationInteractor$openFund$2 = new FundCreationInteractor$openFund$2(this.this$0, this.$verificationToken, this.$operationId, this.$fundId, this.$fundTopupInfoEntity, continuation);
        fundCreationInteractor$openFund$2.L$0 = obj;
        return fundCreationInteractor$openFund$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundCreationInteractor$openFund$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Pair pair = null;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            a aVar = this.this$0;
            com.ybsdk.feature.savings.internal.data.b bVar = aVar.a;
            String str2 = this.$verificationToken;
            String str3 = this.$operationId;
            String str4 = this.$fundId;
            bqs bqsVar = this.$fundTopupInfoEntity;
            if (bqsVar != null) {
                aye0 aye0Var = aVar.c;
                String str5 = aVar.d.a.f;
                String str6 = bqsVar.b;
                String str7 = bqsVar.c;
                MoneyEntity moneyEntity = bqsVar.a;
                Object obj2 = aye0Var.b;
                pair = new Pair(bqsVar, new HmacDto(oi01.a(str5, str, str2, "FUND_CREDIT", str6, str7, "", moneyEntity), HmacDto.Version.FOUR));
            }
            this.label = 1;
            f = bVar.f(str, str2, str3, str4, pair, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
