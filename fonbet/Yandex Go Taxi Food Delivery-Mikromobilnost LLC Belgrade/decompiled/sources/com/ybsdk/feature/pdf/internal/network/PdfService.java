package com.ybsdk.feature.pdf.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.pdf.internal.network.dto.CommonDocumentRequest;
import com.ybsdk.feature.pdf.internal.network.dto.CommonDocumentResponse;
import com.ybsdk.feature.pdf.internal.network.dto.CreateLinkRequest;
import com.ybsdk.feature.pdf.internal.network.dto.DepositPersonalTermsLink;
import com.ybsdk.feature.pdf.internal.network.dto.DepositPersonalTermsRequest;
import com.ybsdk.feature.pdf.internal.network.dto.FileLinkResponse;
import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportRequest;
import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportStatusResponse;
import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusRequest;
import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusResponse;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftCreateRequest;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftCreateResponse;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusRequest;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftStatusResponse;
import com.ybsdk.feature.pdf.internal.network.dto.credit.CreditAccountTermsRequest;
import com.ybsdk.feature.pdf.internal.network.dto.credit.CreditAccountTermsResponse;
import defpackage.iyd0;
import defpackage.m6x0;
import defpackage.q76;
import defpackage.qg21;
import defpackage.rvj0;
import defpackage.s490;
import defpackage.wqs;
import defpackage.z8u;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J6\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\f0\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020$2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b&\u0010'J$\u0010,\u001a\u00020+2\b\b\u0001\u0010)\u001a\u00020(2\b\b\u0003\u0010*\u001a\u00020(H§@¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/PdfService;", "", "Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse;", "h", "(Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusResponse;", "c", "(Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/CreateLinkRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/FileLinkResponse;", "e", "(Lcom/ybsdk/feature/pdf/internal/network/dto/CreateLinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/DepositPersonalTermsRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/DepositPersonalTermsLink;", "d", "(Lcom/ybsdk/feature/pdf/internal/network/dto/DepositPersonalTermsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/credit/CreditAccountTermsRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/credit/CreditAccountTermsResponse;", "f", "(Lcom/ybsdk/feature/pdf/internal/network/dto/credit/CreditAccountTermsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentResponse;", "g", "(Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusRequest;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;", "b", "(Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "tag", "Lrvj0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PdfService {
    @wqs
    Object a(@qg21 String str, @m6x0 String str2, Continuation<? super rvj0> continuation);

    @s490("/v1/split-contract-draft/status")
    Object b(@q76 SplitContractDraftStatusRequest splitContractDraftStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<SplitContractDraftStatusResponse>>>> continuation);

    @s490("/v1/report/get")
    Object c(@q76 ReportStatusRequest reportStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<ReportStatusResponse>>>> continuation);

    @s490("/v1/savings-account/deposit/personal-terms")
    Object d(@q76 DepositPersonalTermsRequest depositPersonalTermsRequest, Continuation<? super Result<DataWithStatusResponse<DepositPersonalTermsLink>>> continuation);

    @s490("/v1/link/create")
    Object e(@q76 CreateLinkRequest createLinkRequest, Continuation<? super Result<DataWithStatusResponse<FileLinkResponse>>> continuation);

    @s490("/v1/credit_account/agreement_terms")
    Object f(@q76 CreditAccountTermsRequest creditAccountTermsRequest, Continuation<? super Result<DataWithStatusResponse<CreditAccountTermsResponse>>> continuation);

    @s490("/v1/screens/document/get")
    Object g(@q76 CommonDocumentRequest commonDocumentRequest, Continuation<? super Result<DataWithStatusResponse<CommonDocumentResponse>>> continuation);

    @s490("/v1/report/generate")
    Object h(@q76 GenerateReportRequest generateReportRequest, Continuation<? super Result<GenerateReportStatusResponse>> continuation);

    @s490("/v1/split-contract-draft/create")
    Object i(@q76 SplitContractDraftCreateRequest splitContractDraftCreateRequest, Continuation<? super Result<DataWithStatusResponse<SplitContractDraftCreateResponse>>> continuation);
}
