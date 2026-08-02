package com.yandex.passport.internal.ui.challenge.webview;

import android.webkit.WebView;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.webview.ChallengeWebScreenKt$ChallengeWebScreen$1$1", f = "ChallengeWebScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChallengeWebScreenKt$ChallengeWebScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebView $currentWebView;
    final /* synthetic */ lz40 $webViewControlFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/webview/n;", "control", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/challenge/webview/n;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.challenge.webview.ChallengeWebScreenKt$ChallengeWebScreen$1$1$1", f = "ChallengeWebScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.challenge.webview.ChallengeWebScreenKt$ChallengeWebScreen$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ WebView $currentWebView;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.$currentWebView = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentWebView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (jl40.l((n) this.L$0, n.a)) {
                this.$currentWebView.reload();
                return zy11.a;
            }
            w511.b();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeWebScreenKt$ChallengeWebScreen$1$1(lz40 lz40Var, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.$webViewControlFlow = lz40Var;
        this.$currentWebView = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChallengeWebScreenKt$ChallengeWebScreen$1$1 challengeWebScreenKt$ChallengeWebScreen$1$1 = new ChallengeWebScreenKt$ChallengeWebScreen$1$1(this.$webViewControlFlow, this.$currentWebView, continuation);
        challengeWebScreenKt$ChallengeWebScreen$1$1.L$0 = obj;
        return challengeWebScreenKt$ChallengeWebScreen$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChallengeWebScreenKt$ChallengeWebScreen$1$1 challengeWebScreenKt$ChallengeWebScreen$1$1 = (ChallengeWebScreenKt$ChallengeWebScreen$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        challengeWebScreenKt$ChallengeWebScreen$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.e.H((tse) this.L$0, new jqr(this.$webViewControlFlow, new AnonymousClass1(this.$currentWebView, null), 3));
        return zy11.a;
    }
}
