package com.ybsdk.feature.pdf.internal.domain;

import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusTypeDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u3j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu3j0;", "", "<anonymous>", "(Lu3j0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.domain.PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1", f = "PdfLinkInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1 pdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1 = new PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1(2, continuation);
        pdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1.L$0 = obj;
        return pdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1) create((u3j0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(((u3j0) this.L$0).c != ReportStatusTypeDto.PROCESSING);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
