package com.ybsdk.feature.webview.internal.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import defpackage.nl91;
import defpackage.qyq;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/webview/internal/utils/FileChooserActivity;", "Landroid/app/Activity;", "<init>", "()V", "Lzy11;", "finishWithCancel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Companion", "qyq", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FileChooserActivity extends Activity {
    public static final qyq Companion = new qyq();
    private static final int REQUEST_CODE = 0;
    private static final String URL_FOR_LOGS = "extra_url_for_logs";

    private final void finishWithCancel() {
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        setResult(resultCode, data);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Intent intent;
        super.onCreate(savedInstanceState);
        Intent intent2 = getIntent();
        if (intent2 == null || (intent = (Intent) intent2.getParcelableExtra("android.intent.extra.INTENT")) == null) {
            finishWithCancel();
            return;
        }
        try {
            startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            nl91.g(intent.getStringExtra(URL_FOR_LOGS), null, "Failed to open file choose intent", null, e, null, null, null, null, null, 2024);
            finishWithCancel();
        }
    }
}
