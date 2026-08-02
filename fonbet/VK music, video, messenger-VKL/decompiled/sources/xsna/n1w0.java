package xsna;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;

/* compiled from: VkWebFileChooser.kt */
/* loaded from: classes6.dex */
public interface n1w0 {
    void a(Intent intent, boolean z, izs<? super Uri, s3q0> izsVar);

    void b(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    void c(int i, Intent intent, boolean z);

    boolean d(int i);
}
