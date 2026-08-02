package com.yandex.passport.sloth.ui;

import android.webkit.WebView;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.jqr;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.uza;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothWebScreenKt$SlothWebScreen$2$1", f = "SlothWebScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothWebScreenKt$SlothWebScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ k $component;
    final /* synthetic */ WebView $currentWebView;
    final /* synthetic */ lz40 $webViewControlFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/ui/m2;", "control", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/ui/m2;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.sloth.ui.SlothWebScreenKt$SlothWebScreen$2$1$1", f = "SlothWebScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.sloth.ui.SlothWebScreenKt$SlothWebScreen$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ k $component;
        final /* synthetic */ WebView $currentWebView;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebView webView, k kVar, Continuation continuation) {
            super(2, continuation);
            this.$currentWebView = webView;
            this.$component = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentWebView, this.$component, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((m2) obj, (Continuation) obj2);
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
            m2 m2Var = (m2) this.L$0;
            if (m2Var instanceof l2) {
                this.$currentWebView.reload();
            } else if (m2Var instanceof k2) {
                String str = ((k2) m2Var).a;
                String f0 = evu0.f0('?', evu0.d0(str, "https://localhost/", ""), "");
                boolean J = evu0.J(f0);
                WebView webView = this.$currentWebView;
                if (J) {
                    com.yandex.passport.sloth.ui.dependencies.p slothWebViewSettings = ((a) this.$component).a.getSlothWebViewSettings();
                    q5z.h(slothWebViewSettings);
                    webView.loadUrl(str, ((com.yandex.passport.internal.ui.sloth.n) slothWebViewSettings).a);
                } else {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(webView.getContext().getAssets().open("webam/".concat(f0)), uza.a), 8192);
                    try {
                        String x0 = cma1.x0(bufferedReader);
                        bufferedReader.close();
                        this.$currentWebView.loadDataWithBaseURL(str, x0, "text/html", "UTF-8", "");
                    } finally {
                    }
                }
            } else {
                if (!(m2Var instanceof j2)) {
                    w511.b();
                    return null;
                }
                this.$currentWebView.evaluateJavascript(((j2) m2Var).a, null);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothWebScreenKt$SlothWebScreen$2$1(lz40 lz40Var, WebView webView, k kVar, Continuation continuation) {
        super(2, continuation);
        this.$webViewControlFlow = lz40Var;
        this.$currentWebView = webView;
        this.$component = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlothWebScreenKt$SlothWebScreen$2$1 slothWebScreenKt$SlothWebScreen$2$1 = new SlothWebScreenKt$SlothWebScreen$2$1(this.$webViewControlFlow, this.$currentWebView, this.$component, continuation);
        slothWebScreenKt$SlothWebScreen$2$1.L$0 = obj;
        return slothWebScreenKt$SlothWebScreen$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SlothWebScreenKt$SlothWebScreen$2$1 slothWebScreenKt$SlothWebScreen$2$1 = (SlothWebScreenKt$SlothWebScreen$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        slothWebScreenKt$SlothWebScreen$2$1.invokeSuspend(zy11Var);
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
        kotlinx.coroutines.flow.e.H((tse) this.L$0, new jqr(this.$webViewControlFlow, new AnonymousClass1(this.$currentWebView, this.$component, null), 3));
        return zy11.a;
    }
}
