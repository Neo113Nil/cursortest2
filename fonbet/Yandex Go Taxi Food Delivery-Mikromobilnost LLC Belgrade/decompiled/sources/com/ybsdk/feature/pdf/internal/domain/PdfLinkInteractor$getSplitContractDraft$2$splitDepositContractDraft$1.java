package com.ybsdk.feature.pdf.internal.domain;

import com.ybsdk.feature.pdf.internal.entities.SplitContractDraftStatus$Status;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ost0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lost0;", "", "<anonymous>", "(Lost0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.domain.PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1", f = "PdfLinkInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1 pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1 = new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1(2, continuation);
        pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1.L$0 = obj;
        return pdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1) create((ost0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(((ost0) this.L$0).a != SplitContractDraftStatus$Status.PROCESSING);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
