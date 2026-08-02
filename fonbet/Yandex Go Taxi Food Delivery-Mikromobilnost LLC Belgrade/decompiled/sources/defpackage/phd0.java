package defpackage;

import android.webkit.JavascriptInterface;
import com.yandex.plus.core.analytics.logging.PlusLogTag;

/* loaded from: classes2.dex */
public final class phd0 extends jd5 implements x3x {
    public final vhw0 b;
    public final boolean c;
    public final String d = "__webviewPaymentWidget";

    public phd0(vhw0 vhw0Var, boolean z) {
        this.b = vhw0Var;
        this.c = z;
    }

    @Override // defpackage.x3x
    public final String a() {
        return this.d;
    }

    @JavascriptInterface
    public final String getToken() {
        if (this.c) {
            return null;
        }
        return (String) this.b.get();
    }

    @JavascriptInterface
    public final void onEvent(String str) {
        skd0.b(PlusLogTag.JS, "onEvent() " + str + " ignored");
    }
}
