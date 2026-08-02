package com.ybsdk.feature.webview.internal.browser;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$EsiaLaunchBrowserProcessIntentStatus;
import defpackage.dhv;
import defpackage.dnp0;
import defpackage.eja1;
import defpackage.i5z0;
import defpackage.q5z;
import defpackage.rje;
import defpackage.rt1;
import defpackage.sd90;
import defpackage.slf;
import defpackage.tlf;
import defpackage.unr0;
import defpackage.vit;
import defpackage.wux;
import defpackage.x8g;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/webview/internal/browser/LaunchBrowserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lzy11;", "processIntent", "(Landroid/content/Intent;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "launchChromeCustomTabs", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "onResume", "onPause", "Ljava/lang/Runnable;", "finishRunnable", "Ljava/lang/Runnable;", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "getAnalyticsReporter", "()Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "analyticsReporter", "Companion", "wux", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LaunchBrowserActivity extends AppCompatActivity {
    public static final String KEY_CUSTOMTAB = "use_customtab";
    public static final String KEY_URI = "uri";
    private static WeakReference<Runnable> finishRunnableRef;
    private final Runnable finishRunnable = new dhv(18, this);
    public static final wux Companion = new wux();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishRunnable$lambda$0(LaunchBrowserActivity launchBrowserActivity) {
        launchBrowserActivity.setResult(0);
        launchBrowserActivity.finish();
    }

    private final AppAnalyticsReporter getAnalyticsReporter() {
        vit vitVar = eja1.g;
        if (vitVar == null) {
            return null;
        }
        AppAnalyticsReporter d = ((x8g) ((dnp0) vitVar.b)).d();
        q5z.h(d);
        return d;
    }

    private final void launchChromeCustomTabs(Uri uri) {
        tlf a = new slf().a();
        i5z0.a.a(unr0.n(uri, "LaunchBrowserActivity launch uri "), new Object[0]);
        try {
            AppAnalyticsReporter analyticsReporter = getAnalyticsReporter();
            if (analyticsReporter != null) {
                rt1 rt1Var = analyticsReporter.s0;
                String m = sd90.m(uri);
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(KEY_URI, m);
                rt1Var.a.a("esia.launch_browser.launch_url", linkedHashMap);
            }
            a.a(this, uri);
        } catch (ActivityNotFoundException e) {
            AppAnalyticsReporter analyticsReporter2 = getAnalyticsReporter();
            if (analyticsReporter2 != null) {
                analyticsReporter2.s0.n(UpgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType.ERROR, e.getMessage());
            }
            setResult(0);
            finish();
        }
    }

    private final void processIntent(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(KEY_URI);
        if (uri == null) {
            AppAnalyticsReporter analyticsReporter = getAnalyticsReporter();
            if (analyticsReporter != null) {
                analyticsReporter.s0.o(UpgradeEvents$EsiaLaunchBrowserProcessIntentStatus.CANCELLED, null);
            }
            setResult(0);
        } else {
            AppAnalyticsReporter analyticsReporter2 = getAnalyticsReporter();
            if (analyticsReporter2 != null) {
                analyticsReporter2.s0.o(UpgradeEvents$EsiaLaunchBrowserProcessIntentStatus.OK, sd90.m(uri));
            }
            Intent intent2 = new Intent();
            intent2.setData(uri);
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Uri data = getIntent().getData();
            if (data == null) {
                AppAnalyticsReporter analyticsReporter = getAnalyticsReporter();
                if (analyticsReporter != null) {
                    analyticsReporter.s0.n(UpgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType.NULL, null);
                }
                finish();
                return;
            }
            if (getIntent().getBooleanExtra(KEY_CUSTOMTAB, true)) {
                launchChromeCustomTabs(data);
            } else {
                rje.k(this, new Intent("android.intent.action.VIEW", data));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handler.removeCallbacks(this.finishRunnable);
        processIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        finishRunnableRef = null;
        handler.removeCallbacks(this.finishRunnable);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        finishRunnableRef = new WeakReference<>(this.finishRunnable);
        handler.post(this.finishRunnable);
    }
}
