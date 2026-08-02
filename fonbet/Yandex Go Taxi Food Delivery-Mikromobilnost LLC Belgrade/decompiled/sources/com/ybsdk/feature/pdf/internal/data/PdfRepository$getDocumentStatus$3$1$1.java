package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.feature.pdf.internal.network.dto.FileLinkResponse;
import com.ybsdk.feature.pdf.internal.network.dto.ReportFileResponse;
import com.ybsdk.feature.pdf.internal.network.dto.ReportFilesResponse;
import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusResponse;
import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusTypeDto;
import defpackage.d2j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.u3j0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusResponse;", "dto", "Lu3j0;", "<anonymous>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusResponse;)Lu3j0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$getDocumentStatus$3$1$1", f = "PdfRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$getDocumentStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfRepository$getDocumentStatus$3$1$1 pdfRepository$getDocumentStatus$3$1$1 = new PdfRepository$getDocumentStatus$3$1$1(2, continuation);
        pdfRepository$getDocumentStatus$3$1$1.L$0 = obj;
        return pdfRepository$getDocumentStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfRepository$getDocumentStatus$3$1$1) create((ReportStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<ReportFileResponse> items;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        EmptyList emptyList = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ReportStatusResponse reportStatusResponse = (ReportStatusResponse) this.L$0;
        String id = reportStatusResponse.getReport().getId();
        String type = reportStatusResponse.getReport().getType();
        ReportStatusTypeDto status = reportStatusResponse.getReport().getStatus();
        ReportFilesResponse files = reportStatusResponse.getReport().getFiles();
        if (files != null && (items = files.getItems()) != null) {
            List<ReportFileResponse> list = items;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ReportFileResponse reportFileResponse : list) {
                String id2 = reportFileResponse.getId();
                String name = reportFileResponse.getName();
                String type2 = reportFileResponse.getType();
                FileLinkResponse downloadLink = reportFileResponse.getDownloadLink();
                arrayList.add(new d2j0(id2, name, type2, downloadLink != null ? downloadLink.getLink() : null));
            }
            emptyList = arrayList;
        }
        if (emptyList == null) {
            emptyList = EmptyList.a;
        }
        return new u3j0(id, type, status, emptyList);
    }
}
