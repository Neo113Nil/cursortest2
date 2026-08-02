package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.feature.pdf.internal.network.PdfService;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$getSplitContractDraftStatus$2", f = "PdfRepository.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$getSplitContractDraftStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $contractId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfRepository$getSplitContractDraftStatus$2(a aVar, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$contractId = str;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PdfRepository$getSplitContractDraftStatus$2(this.this$0, this.$contractId, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PdfRepository$getSplitContractDraftStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PdfService pdfService = this.this$0.b;
            SplitContractDraftStatusRequest splitContractDraftStatusRequest = new SplitContractDraftStatusRequest(this.$contractId);
            int i2 = this.$attemptNumber;
            this.label = 1;
            b = pdfService.b(splitContractDraftStatusRequest, i2, this);
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
