package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrRecognizedSource;
import defpackage.dtj0;
import defpackage.evu0;
import defpackage.mcg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odg0;
import defpackage.pdg0;
import defpackage.pz40;
import defpackage.qdg0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderViewModel$recognizeQr$1", f = "QrReaderViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrReaderViewModel$recognizeQr$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $resultText;
    final /* synthetic */ dtj0 $rules;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrReaderViewModel$recognizeQr$1(b bVar, String str, dtj0 dtj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$resultText = str;
        this.$rules = dtj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrReaderViewModel$recognizeQr$1(this.this$0, this.$resultText, this.$rules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrReaderViewModel$recognizeQr$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        mcg0 mcg0Var;
        QrReaderViewModel$recognizeQr$1 qrReaderViewModel$recognizeQr$1;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                mcg0Var = (mcg0) value;
            } while (!r0Var.k(value, mcg0.a(mcg0Var, false, false, mcg0Var.d + 1, false, null, 55)));
            com.ybsdk.di.modules.mediators.a aVar = this.this$0.B;
            String obj2 = evu0.k0(this.$resultText).toString();
            String origin = this.this$0.H.getOrigin();
            dtj0 dtj0Var = this.$rules;
            String agreementId = this.this$0.H.getAgreementId();
            String autopaymentId = this.this$0.H.getAutopaymentId();
            QrPaymentEvents$QrRecognizedSource qrPaymentEvents$QrRecognizedSource = QrPaymentEvents$QrRecognizedSource.FILE;
            this.label = 1;
            qrReaderViewModel$recognizeQr$1 = this;
            obj = aVar.a(obj2, origin, dtj0Var, agreementId, autopaymentId, qrPaymentEvents$QrRecognizedSource, qrReaderViewModel$recognizeQr$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            qrReaderViewModel$recognizeQr$1 = this;
        }
        qdg0 qdg0Var = (qdg0) obj;
        pz40 Y2 = qrReaderViewModel$recognizeQr$1.this$0.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, mcg0.a((mcg0) value2, false, false, r4.d - 1, false, null, 39)));
        if (qdg0Var instanceof odg0) {
            b.b0(qrReaderViewModel$recognizeQr$1.this$0, (odg0) qdg0Var);
        } else {
            if (!(qdg0Var instanceof pdg0)) {
                w511.b();
                return null;
            }
            qrReaderViewModel$recognizeQr$1.this$0.r0(qdg0Var);
        }
        return zy11.a;
    }
}
