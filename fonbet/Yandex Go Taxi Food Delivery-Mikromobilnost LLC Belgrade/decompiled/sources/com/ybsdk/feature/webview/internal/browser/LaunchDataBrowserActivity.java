package com.ybsdk.feature.webview.internal.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import defpackage.rje;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/webview/internal/browser/LaunchDataBrowserActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LaunchDataBrowserActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        WeakReference weakReference;
        Runnable runnable;
        Handler handler;
        LaunchBrowserActivity.Companion.getClass();
        weakReference = LaunchBrowserActivity.finishRunnableRef;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            handler = LaunchBrowserActivity.handler;
            handler.removeCallbacks(runnable);
        }
        LaunchBrowserActivity.finishRunnableRef = null;
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, (Class<?>) LaunchBrowserActivity.class);
        intent.putExtra(LaunchBrowserActivity.KEY_URI, getIntent().getData());
        rje.k(this, intent);
        finish();
    }
}
