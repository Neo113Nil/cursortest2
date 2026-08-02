package com.yandex.plus.pay.ui.core.debug.internal.domain.form;

import android.util.Base64;
import defpackage.iez;
import defpackage.mvg;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.xkz;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.debug.internal.domain.form.GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1", f = "GetReportFormInfoInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        xkz xkzVar = aVar.c;
        List J0 = kotlin.collections.a.J0(((ndd0) aVar.b).b.d);
        xkzVar.getClass();
        return "data:text/plain;base64,".concat(Base64.encodeToString(kotlin.collections.a.X(J0, "\n", null, null, new iez(1), 30).getBytes(uza.a), 2));
    }
}
