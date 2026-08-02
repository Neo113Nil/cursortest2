package xsna;

import android.view.ViewGroup;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutActivity;
import xsna.pgn0;

/* compiled from: ShortcutPresenter.kt */
/* loaded from: classes6.dex */
public final class ehj0 {
    public final ShortcutActivity a;
    public final long b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final dhj0 d = new dhj0(this);

    public ehj0(ShortcutActivity shortcutActivity, long j) {
        this.a = shortcutActivity;
        this.b = j;
    }

    public final void a() {
        ViewGroup viewGroup = this.a.g;
        if (viewGroup == null) {
            viewGroup = null;
        }
        f4m.j(viewGroup);
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (!wdx0Var.k()) {
            ShortcutActivity shortcutActivity = this.a;
            wdx0 wdx0Var2 = e370.f;
            wdx0 wdx0Var3 = wdx0Var2 != null ? wdx0Var2 : null;
            new pgn0.b();
            wdx0Var3.l(shortcutActivity);
            this.a.g0();
            return;
        }
        vdx0 vdx0Var = e370.e;
        this.c.b((vdx0Var != null ? vdx0Var : null).d().X("https://" + a0a.d + "/app" + this.b + '}').subscribe(new cl30(new arb0(this, 15), 11), new skz(new r8a0(this, 21), 26)));
    }
}
