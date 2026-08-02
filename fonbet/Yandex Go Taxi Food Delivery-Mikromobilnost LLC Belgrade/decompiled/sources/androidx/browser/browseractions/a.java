package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import defpackage.ayh0;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ BrowserActionsFallbackMenuUi a;

    public a(BrowserActionsFallbackMenuUi browserActionsFallbackMenuUi) {
        this.a = browserActionsFallbackMenuUi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BrowserActionsFallbackMenuUi browserActionsFallbackMenuUi = this.a;
        ((ClipboardManager) browserActionsFallbackMenuUi.mContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", browserActionsFallbackMenuUi.mUri.toString()));
        Toast.makeText(browserActionsFallbackMenuUi.mContext, browserActionsFallbackMenuUi.mContext.getString(ayh0.copy_toast_msg), 0).show();
    }
}
