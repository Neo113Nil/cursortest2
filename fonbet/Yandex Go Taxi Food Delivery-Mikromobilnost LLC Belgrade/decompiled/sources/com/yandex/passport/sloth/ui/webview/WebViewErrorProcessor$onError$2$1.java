package com.yandex.passport.sloth.ui.webview;

import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.webview.WebViewErrorProcessor$onError$2$1", f = "WebViewErrorProcessor.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewErrorProcessor$onError$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ b1 $interactor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewErrorProcessor$onError$2$1(b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.$interactor = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewErrorProcessor$onError$2$1(this.$interactor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewErrorProcessor$onError$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b1 b1Var = this.$interactor;
            y0 y0Var = new y0();
            this.label = 1;
            if (((com.yandex.passport.sloth.b1) b1Var).f(y0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
