package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes12.dex */
public abstract class bu90 {
    public abstract void a(String str);

    @JavascriptInterface
    public final void receiveMessage(String str) {
        a(str);
    }
}
