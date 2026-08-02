package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrResolvingRulesLoadedResult;
import com.ybsdk.feature.qr.api.domain.QrResolvingRulesSource;
import defpackage.dtj0;
import defpackage.hcg0;
import defpackage.jcg0;
import defpackage.kcg0;
import defpackage.lcg0;
import defpackage.lrp0;
import defpackage.mcg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderViewModel$fetchQrResolvingRules$1", f = "QrReaderViewModel.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrReaderViewModel$fetchQrResolvingRules$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrReaderViewModel$fetchQrResolvingRules$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrReaderViewModel$fetchQrResolvingRules$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrReaderViewModel$fetchQrResolvingRules$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        lcg0 hcg0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.qr.api.domain.a aVar = this.this$0.J;
            QrResolvingRulesSource qrResolvingRulesSource = QrResolvingRulesSource.INTERNAL;
            this.label = 1;
            a = aVar.a(qrResolvingRulesSource, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            bVar.C.Y.C(QrPaymentEvents$QrResolvingRulesLoadedResult.OK, null);
            hcg0Var = new kcg0((dtj0) a);
        } else {
            x4c.g("Failed to retrieve qr_resolving_rules", a2, null, Collections.singletonList(lrp0.w), 4);
            bVar.C.Y.C(QrPaymentEvents$QrResolvingRulesLoadedResult.ERROR, a2.getMessage());
            hcg0Var = new hcg0(a2);
        }
        lcg0 lcg0Var = hcg0Var;
        lcg0 lcg0Var2 = ((mcg0) this.this$0.X()).f;
        jcg0 jcg0Var = lcg0Var2 instanceof jcg0 ? (jcg0) lcg0Var2 : null;
        String str = jcg0Var != null ? jcg0Var.a : null;
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, mcg0.a((mcg0) value, false, false, 0, false, lcg0Var, 31)));
        if (str != null) {
            this.this$0.s0();
            this.this$0.q0(str);
        }
        return zy11.a;
    }
}
