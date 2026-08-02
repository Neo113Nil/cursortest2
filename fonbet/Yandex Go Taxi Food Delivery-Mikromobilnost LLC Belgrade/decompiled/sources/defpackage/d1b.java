package defpackage;

import com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class d1b {
    public final ew2 a;
    public final a820 b;
    public final krw c;
    public ye0 d = new a1b(this);
    public boolean e;

    public d1b(qh41 qh41Var) {
        this.a = qh41Var.r;
        this.b = (a820) qh41Var.y.getValue();
        this.c = (krw) qh41Var.A.getValue();
    }

    public final ye0 a(ChatBackgroundController$BackgroundFragment chatBackgroundController$BackgroundFragment) {
        Object obj = this.d;
        y0b y0bVar = obj instanceof y0b ? (y0b) obj : null;
        if (y0bVar == null) {
            jl40.x("Background fragment exists but no preloading processed");
            return null;
        }
        if (jl40.l(y0bVar.a(), chatBackgroundController$BackgroundFragment)) {
            return this.d;
        }
        jl40.x("Lost background fragment tries to handle WebView");
        return null;
    }

    public final void b(ye0 ye0Var) {
        this.a.c("wm_chat_background", b.i(new Pair("from", this.d.a), new Pair("to", ye0Var.a)));
        this.d = ye0Var;
    }
}
