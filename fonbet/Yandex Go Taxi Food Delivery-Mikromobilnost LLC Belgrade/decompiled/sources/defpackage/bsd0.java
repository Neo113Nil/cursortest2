package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class bsd0 extends jd5 implements x3x {
    public final sls b;
    public final String c = "__plusSDKInitialStoryState";

    public bsd0(sls slsVar) {
        this.b = slsVar;
    }

    @Override // defpackage.x3x
    public final String a() {
        return this.c;
    }

    @JavascriptInterface
    public final String getData() {
        return (String) this.b.invoke();
    }
}
