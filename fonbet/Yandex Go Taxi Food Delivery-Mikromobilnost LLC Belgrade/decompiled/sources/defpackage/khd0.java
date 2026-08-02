package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class khd0 extends jd5 implements x3x {
    public final vhw0 b;
    public final String c = "__webviewPaymentCard";

    public khd0(vhw0 vhw0Var) {
        this.b = vhw0Var;
    }

    @Override // defpackage.x3x
    public final String a() {
        return this.c;
    }

    @JavascriptInterface
    public final String getPaymentCardId() {
        String str = (String) this.b.get();
        return str == null ? "" : str;
    }
}
