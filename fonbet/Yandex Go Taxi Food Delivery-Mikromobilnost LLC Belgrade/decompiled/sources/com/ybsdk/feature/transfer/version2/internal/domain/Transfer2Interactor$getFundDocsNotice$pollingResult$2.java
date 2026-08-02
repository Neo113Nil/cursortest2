package com.ybsdk.feature.transfer.version2.internal.domain;

import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldqg;", "Lxns;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor$getFundDocsNotice$pollingResult$2", f = "Transfer2Interactor.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Interactor$getFundDocsNotice$pollingResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ FundDocsNoticeInfo $noticeInfo;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$getFundDocsNotice$pollingResult$2(b bVar, FundDocsNoticeInfo fundDocsNoticeInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$noticeInfo = fundDocsNoticeInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Interactor$getFundDocsNotice$pollingResult$2 transfer2Interactor$getFundDocsNotice$pollingResult$2 = new Transfer2Interactor$getFundDocsNotice$pollingResult$2(this.this$0, this.$noticeInfo, continuation);
        transfer2Interactor$getFundDocsNotice$pollingResult$2.I$0 = ((tq11) obj).a;
        return transfer2Interactor$getFundDocsNotice$pollingResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        Transfer2Interactor$getFundDocsNotice$pollingResult$2 transfer2Interactor$getFundDocsNotice$pollingResult$2 = new Transfer2Interactor$getFundDocsNotice$pollingResult$2(this.this$0, this.$noticeInfo, (Continuation) obj2);
        transfer2Interactor$getFundDocsNotice$pollingResult$2.I$0 = i;
        return transfer2Interactor$getFundDocsNotice$pollingResult$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar = this.this$0.e;
            FundDocsNoticeInfo fundDocsNoticeInfo = this.$noticeInfo;
            this.label = 1;
            g = aVar.g(fundDocsNoticeInfo, i2, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
        }
        return new Result(g);
    }
}
