package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pdf.internal.entities.ButtonEntity$Alignment;
import com.ybsdk.feature.pdf.internal.network.dto.Button;
import com.ybsdk.feature.pdf.internal.network.dto.ButtonsGroup;
import com.ybsdk.feature.pdf.internal.network.dto.CommonDocumentResponse;
import defpackage.aoc;
import defpackage.boc;
import defpackage.g8e;
import defpackage.j57;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uz6;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentResponse;", "it", "Laoc;", "<anonymous>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentResponse;)Laoc;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository$getCommonScreenData$3$1", f = "PdfRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfRepository$getCommonScreenData$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PdfRepository$getCommonScreenData$3$1 pdfRepository$getCommonScreenData$3$1 = new PdfRepository$getCommonScreenData$3$1(2, continuation);
        pdfRepository$getCommonScreenData$3$1.L$0 = obj;
        return pdfRepository$getCommonScreenData$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PdfRepository$getCommonScreenData$3$1) create((CommonDocumentResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        j57 j57Var = null;
        ButtonEntity$Alignment buttonEntity$Alignment = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        CommonDocumentResponse commonDocumentResponse = (CommonDocumentResponse) this.L$0;
        String url = commonDocumentResponse.getUrl();
        ButtonsGroup buttonsGroup = commonDocumentResponse.getButtonsGroup();
        if (buttonsGroup != null) {
            Button primaryButton = buttonsGroup.getPrimaryButton();
            uz6 uz6Var = primaryButton != null ? new uz6(g8e.i(Text.Companion, primaryButton.getText()), primaryButton.getAction()) : null;
            Button secondaryButton = buttonsGroup.getSecondaryButton();
            uz6 uz6Var2 = secondaryButton != null ? new uz6(g8e.i(Text.Companion, secondaryButton.getText()), secondaryButton.getAction()) : null;
            Button.Alignment alignment = buttonsGroup.getAlignment();
            int i = alignment == null ? -1 : boc.a[alignment.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    buttonEntity$Alignment = ButtonEntity$Alignment.VERTICAL;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    buttonEntity$Alignment = ButtonEntity$Alignment.HORIZONTAL;
                }
            }
            j57Var = new j57(uz6Var, uz6Var2, buttonEntity$Alignment);
        }
        return new aoc(url, j57Var);
    }
}
