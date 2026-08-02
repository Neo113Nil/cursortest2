package com.ybsdk.feature.pdf.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lost0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.domain.PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2", f = "PdfLinkInteractor.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $contractId;
    final /* synthetic */ a $this_runCatching;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_runCatching = aVar;
        this.$contractId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2 pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2 = new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2(this.$this_runCatching, this.$contractId, continuation);
        pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2.I$0 = ((tq11) obj).a;
        return pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2 pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2 = new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2(this.$this_runCatching, this.$contractId, (Continuation) obj2);
        pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2.I$0 = i;
        return pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            int i3 = this.I$0;
            com.ybsdk.feature.pdf.internal.data.a aVar = this.$this_runCatching.a;
            String str = this.$contractId;
            this.label = 1;
            i = aVar.i(i3, str, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            i = ((Result) obj).getValue();
        }
        return new Result(i);
    }
}
