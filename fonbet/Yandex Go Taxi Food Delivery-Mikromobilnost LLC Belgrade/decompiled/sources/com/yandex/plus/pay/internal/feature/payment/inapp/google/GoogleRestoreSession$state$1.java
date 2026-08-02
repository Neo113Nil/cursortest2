package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import defpackage.mdd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wcd0;
import defpackage.wls;
import defpackage.xcd0;
import defpackage.ycd0;
import defpackage.zcd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzcd0;", "restoreState", "Lzy11;", "<anonymous>", "(Lzcd0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.GoogleRestoreSession$state$1", f = "GoogleRestoreSession.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GoogleRestoreSession$state$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleRestoreSession$state$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleRestoreSession$state$1 googleRestoreSession$state$1 = new GoogleRestoreSession$state$1(this.this$0, continuation);
        googleRestoreSession$state$1.L$0 = obj;
        return googleRestoreSession$state$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GoogleRestoreSession$state$1 googleRestoreSession$state$1 = (GoogleRestoreSession$state$1) create((zcd0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        googleRestoreSession$state$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        zcd0 zcd0Var = (zcd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mdd0 mdd0Var = this.this$0.f;
        PayCoreLogTag payCoreLogTag = PayCoreLogTag.IN_APP_PAYMENT;
        if (zcd0Var instanceof ycd0) {
            str = "Waiting";
        } else if (zcd0Var instanceof xcd0) {
            str = "Success";
        } else {
            if (!(zcd0Var instanceof wcd0)) {
                w511.b();
                return null;
            }
            str = "Error(exception=" + ((wcd0) zcd0Var).a + ')';
        }
        mdd0.d(mdd0Var, payCoreLogTag, "Collect in-app restore state: ".concat(str));
        return zy11.a;
    }
}
