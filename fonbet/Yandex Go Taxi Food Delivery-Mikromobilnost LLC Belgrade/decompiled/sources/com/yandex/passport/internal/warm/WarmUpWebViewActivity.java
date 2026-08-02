package com.yandex.passport.internal.warm;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.p;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.network.l;
import com.yandex.passport.internal.report.kc;
import com.yandex.passport.internal.report.lc;
import com.yandex.passport.internal.report.mc;
import com.yandex.passport.internal.report.nc;
import com.yandex.passport.internal.report.oc;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.qv10;
import defpackage.wv10;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/internal/warm/WarmUpWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/yandex/passport/internal/report/reporters/h1;", "reporter", "Lcom/yandex/passport/internal/report/reporters/h1;", "Companion", "com/yandex/passport/internal/warm/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WarmUpWebViewActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final b Companion = new b();
    public static final long DEFAULT_TIME_MS_CLOSE_WEB_VIEW_AFTER_LOAD_URL = 30000;
    private static final String ENVIRONMENT_INTEGER_KEY = "environment_integer_key";
    public static final long MAX_TIME_MS_CLOSE_WEB_VIEW_AFTER_LOAD_URL = 120000;
    public static final long MIN_TIME_MS_CLOSE_WEB_VIEW_AFTER_LOAD_URL = 1000;
    private static final String TIME_OUT_FOR_CLOSING_WEB_VIEW_LONG_KEY = "time_out_for_closing_web_view";
    private h1 reporter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(WarmUpWebViewActivity warmUpWebViewActivity, a aVar, Ref$ObjectRef ref$ObjectRef, long j) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, qv10.k(j, "WebView onDestroy after loading ", " ms"), 8);
        }
        h1 h1Var = warmUpWebViewActivity.reporter;
        h1 h1Var2 = h1Var != null ? h1Var : null;
        h1Var2.getClass();
        h1Var2.h(nc.w);
        aVar.getWarmWebView().destroy();
        warmUpWebViewActivity.getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ref$ObjectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.app.Application$ActivityLifecycleCallbacks, com.yandex.passport.internal.warm.WarmUpWebViewActivity$onCreate$activityLifecycleCallback$1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Runnable, wv10] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int intExtra = getIntent().getIntExtra(ENVIRONMENT_INTEGER_KEY, 1);
        Environment.Companion.getClass();
        Environment a = com.yandex.passport.common.core.a.a(intExtra);
        b bVar = Companion;
        Intent intent = getIntent();
        bVar.getClass();
        long longExtra = intent.getLongExtra(TIME_OUT_FOR_CLOSING_WEB_VIEW_LONG_KEY, 30000L);
        long j = (1000 > longExtra || longExtra >= 120001) ? 30000L : longExtra;
        PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
        this.reporter = a2.getWarmUpWebViewReporter();
        l lVar = (l) a2.getUrlDispatcher();
        lVar.getClass();
        String h = lVar.h(a, PassportUrlType.WEBAM, p.b);
        if (h == null) {
            h = l.n(a, null, "/auth");
        }
        final a warmUpContent = ((Boolean) a2.getFlagRepository().b(q.b0)).booleanValue() ? new WarmUpContent(this) : new c(this);
        setContentView(warmUpContent.getTheRootView());
        final Handler handler = new Handler(getMainLooper());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? r3 = new Application.ActivityLifecycleCallbacks() { // from class: com.yandex.passport.internal.warm.WarmUpWebViewActivity$onCreate$activityLifecycleCallback$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                h1 h1Var;
                if (activity instanceof BouncerActivity) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "WebView onDestroy due started login", 8);
                    }
                    h1Var = WarmUpWebViewActivity.this.reporter;
                    h1 h1Var2 = h1Var != null ? h1Var : null;
                    h1Var2.getClass();
                    h1Var2.h(mc.w);
                    warmUpContent.getWarmWebView().destroy();
                    Runnable runnable = ref$ObjectRef2.element;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    WarmUpWebViewActivity.this.getApplication().unregisterActivityLifecycleCallbacks(ref$ObjectRef.element);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }
        };
        getApplication().registerActivityLifecycleCallbacks(r3);
        ref$ObjectRef.element = r3;
        final ?? wv10Var = new wv10(this, warmUpContent, ref$ObjectRef, j);
        ref$ObjectRef2.element = wv10Var;
        warmUpContent.getWarmWebView().setWebViewClient(new WebViewClient());
        warmUpContent.getWarmWebView().setWebChromeClient(new WebChromeClient() { // from class: com.yandex.passport.internal.warm.WarmUpWebViewActivity$onCreate$1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                h1 h1Var;
                super.onProgressChanged(view, newProgress);
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onProgress load url: " + newProgress, 8);
                }
                if (newProgress == 100) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "WebView onDestroy", 8);
                    }
                    h1Var = WarmUpWebViewActivity.this.reporter;
                    h1 h1Var2 = h1Var != null ? h1Var : null;
                    h1Var2.getClass();
                    h1Var2.h(lc.w);
                    view.destroy();
                    handler.removeCallbacks(wv10Var);
                    WarmUpWebViewActivity.this.getApplication().unregisterActivityLifecycleCallbacks(ref$ObjectRef.element);
                }
            }
        });
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "WebView load url ".concat(h), 8);
        }
        warmUpContent.getWarmWebView().loadUrl(h);
        h1 h1Var = this.reporter;
        h1 h1Var2 = h1Var != null ? h1Var : null;
        h1Var2.getClass();
        h1Var2.h(oc.w);
        handler.postDelayed(wv10Var, j);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h1 h1Var = this.reporter;
        if (h1Var == null) {
            h1Var = null;
        }
        h1Var.getClass();
        h1Var.h(kc.w);
    }
}
