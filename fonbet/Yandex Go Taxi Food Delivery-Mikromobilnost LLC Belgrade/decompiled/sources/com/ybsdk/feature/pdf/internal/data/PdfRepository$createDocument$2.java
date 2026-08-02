package com.ybsdk.feature.pdf.internal.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.pdf.internal.network.PdfService;
import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportRequest;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValues;
import defpackage.l0w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$createDocument$2", f = "PdfRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$createDocument$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $reportType;
    final /* synthetic */ List<l0w> $values;
    final /* synthetic */ String $version;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfRepository$createDocument$2(a aVar, String str, String str2, String str3, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$reportType = str2;
        this.$version = str3;
        this.$values = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PdfRepository$createDocument$2(this.this$0, this.$idempotencyToken, this.$reportType, this.$version, this.$values, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PdfRepository$createDocument$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PdfService pdfService = this.this$0.b;
            GenerateReportRequest generateReportRequest = new GenerateReportRequest(this.$idempotencyToken, this.$reportType, this.$version, new InputParametersValues(this.$values));
            this.label = 1;
            h = pdfService.h(generateReportRequest, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
