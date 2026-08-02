package com.yandex.passport.user_id.ui;

import android.webkit.WebView;
import com.yandex.passport.user_id.w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.user_id.ui.UserIdExternalUiKt$UserId$4$1", f = "UserIdExternalUi.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserIdExternalUiKt$UserId$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $events;
    final /* synthetic */ w $viewModel;
    final /* synthetic */ WebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIdExternalUiKt$UserId$4$1(w wVar, WebView webView, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = wVar;
        this.$webView = webView;
        this.$events = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserIdExternalUiKt$UserId$4$1(this.$viewModel, this.$webView, this.$events, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserIdExternalUiKt$UserId$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.b bVar = this.$viewModel.w;
            com.yandex.passport.internal.ui.sloth.menu.b bVar2 = new com.yandex.passport.internal.ui.sloth.menu.b(3, this.$webView, this.$events);
            this.label = 1;
            if (bVar.collect(bVar2, this) == coroutineSingletons) {
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
