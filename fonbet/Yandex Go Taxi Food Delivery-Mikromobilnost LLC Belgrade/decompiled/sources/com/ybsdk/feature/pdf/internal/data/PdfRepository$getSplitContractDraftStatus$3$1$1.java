package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.feature.pdf.internal.entities.SplitContractDraftStatus$Status;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusResponse;
import defpackage.mvg;
import defpackage.nst0;
import defpackage.ny61;
import defpackage.ost0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;", "it", "Lost0;", "<anonymous>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;)Lost0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$getSplitContractDraftStatus$3$1$1", f = "PdfRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$getSplitContractDraftStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfRepository$getSplitContractDraftStatus$3$1$1 pdfRepository$getSplitContractDraftStatus$3$1$1 = new PdfRepository$getSplitContractDraftStatus$3$1$1(2, continuation);
        pdfRepository$getSplitContractDraftStatus$3$1$1.L$0 = obj;
        return pdfRepository$getSplitContractDraftStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfRepository$getSplitContractDraftStatus$3$1$1) create((SplitContractDraftStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SplitContractDraftStatus$Status splitContractDraftStatus$Status;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        SplitContractDraftStatusResponse splitContractDraftStatusResponse = (SplitContractDraftStatusResponse) this.L$0;
        int i = nst0.a[splitContractDraftStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            splitContractDraftStatus$Status = SplitContractDraftStatus$Status.PROCESSING;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            splitContractDraftStatus$Status = SplitContractDraftStatus$Status.SUCCESS;
        }
        SplitContractDraftStatusResponse.Link link = splitContractDraftStatusResponse.getLink();
        return new ost0(splitContractDraftStatus$Status, link != null ? link.getUrl() : null);
    }
}
