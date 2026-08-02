package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes12.dex */
public final class b7x {
    public final String a;
    public final prr b;

    public b7x(String str, prr prrVar) {
        this.a = str;
        this.b = prrVar;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.b.a.n(new r7v(13, this, str));
    }
}
