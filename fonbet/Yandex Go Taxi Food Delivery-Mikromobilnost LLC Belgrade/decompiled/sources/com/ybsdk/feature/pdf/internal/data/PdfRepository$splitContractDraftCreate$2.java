package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.feature.pdf.internal.network.PdfService;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftCreateRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$splitContractDraftCreate$2", f = "PdfRepository.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$splitContractDraftCreate$2 extends SuspendLambda implements tls {
    final /* synthetic */ PdfLoaderScreenParams.SplitContractDraft $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfRepository$splitContractDraftCreate$2(a aVar, PdfLoaderScreenParams.SplitContractDraft splitContractDraft, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$params = splitContractDraft;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PdfRepository$splitContractDraftCreate$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PdfRepository$splitContractDraftCreate$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            PdfService pdfService = this.this$0.b;
            List<PdfLoaderScreenParams.SplitContractDraft.Cart.Item> items = this.$params.getCart().getItems();
            ArrayList arrayList = new ArrayList(tcc.n(items, 10));
            for (PdfLoaderScreenParams.SplitContractDraft.Cart.Item item : items) {
                arrayList.add(new SplitContractDraftCreateRequest.Item(item.getTitle(), item.getCount()));
            }
            SplitContractDraftCreateRequest splitContractDraftCreateRequest = new SplitContractDraftCreateRequest(arrayList, this.$params.getCart().getTotalAmount(), this.$params.getPlanConstructor(), this.$params.getMerchantID(), this.$params.isPrepayment());
            this.label = 1;
            i = pdfService.i(splitContractDraftCreateRequest, this);
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
