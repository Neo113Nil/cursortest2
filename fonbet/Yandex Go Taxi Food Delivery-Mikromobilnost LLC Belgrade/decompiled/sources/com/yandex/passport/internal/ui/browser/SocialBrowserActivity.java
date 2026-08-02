package com.yandex.passport.internal.ui.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.yandex.passport.common.browser.c;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.analytics.e0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.di.a;
import com.yandex.passport.internal.n;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes15.dex */
public class SocialBrowserActivity extends Activity {
    private static final String KEY_SKIP_SETTING_TARGET_PACKAGE_NAME = "skip-setting-target-package-name";
    private static final String KEY_TARGET_PACKAGE_NAME = "target-package-name";
    private static WeakReference<Runnable> finishRunnableRef;
    private final Runnable finishRunnable = new n(7, this);
    private e0 reporter;
    private static final Handler handler = new Handler();
    static String SOCIAL_KEY_URI = LaunchBrowserActivity.KEY_URI;

    public static void clearFinishRunnable() {
        WeakReference<Runnable> weakReference = finishRunnableRef;
        Runnable runnable = weakReference == null ? null : weakReference.get();
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static Intent createIntent(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) SocialBrowserActivity.class);
        intent.setData(uri);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0() {
        e0 e0Var = this.reporter;
        e0Var.getClass();
        e0Var.a(r.i, new Pair("task_id", String.valueOf(getTaskId())));
        setResult(0);
        finish();
    }

    private void processIntent(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(SOCIAL_KEY_URI);
        if (uri == null) {
            setResult(0);
            e0 e0Var = this.reporter;
            e0Var.getClass();
            e0Var.a(r.g, new Pair("task_id", String.valueOf(getTaskId())));
        } else {
            Intent intent2 = new Intent();
            intent2.setData(uri);
            setResult(-1, intent2);
            e0 e0Var2 = this.reporter;
            e0Var2.getClass();
            e0Var2.a(r.h, new Pair("task_id", String.valueOf(getTaskId())));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0 socialBrowserReporter = a.a().getSocialBrowserReporter();
        this.reporter = socialBrowserReporter;
        if (bundle != null) {
            socialBrowserReporter.getClass();
            socialBrowserReporter.a(r.c, new Pair("task_id", String.valueOf(getTaskId())));
            return;
        }
        if (getIntent().getData() == null) {
            e0 e0Var = this.reporter;
            e0Var.getClass();
            e0Var.a(r.b, new Pair("task_id", String.valueOf(getTaskId())));
            finish();
            return;
        }
        Uri data = getIntent().getData();
        data.getClass();
        Uri uri = c.a;
        b.Companion.getClass();
        Object c = c.c(this, data.toString());
        if (!(c instanceof Result.Failure)) {
            c = new com.yandex.passport.common.browser.a((String) c);
        }
        if (c instanceof Result.Failure) {
            c = null;
        }
        com.yandex.passport.common.browser.a aVar = (com.yandex.passport.common.browser.a) c;
        e0 e0Var2 = this.reporter;
        if (aVar == null) {
            ActivityNotFoundException activityNotFoundException = new ActivityNotFoundException();
            e0Var2.getClass();
            e0Var2.a(r.d, new Pair("error", Log.getStackTraceString(activityNotFoundException)));
            setResult(0);
            finish();
            return;
        }
        String str = aVar.a;
        e0Var2.getClass();
        r rVar = r.e;
        if (str == null) {
            str = "null";
        }
        e0Var2.a(rVar, new Pair("target_package_name", str), new Pair("task_id", String.valueOf(getTaskId())));
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        finishRunnableRef = null;
        handler.removeCallbacks(this.finishRunnable);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        finishRunnableRef = new WeakReference<>(this.finishRunnable);
        handler.post(this.finishRunnable);
    }
}
