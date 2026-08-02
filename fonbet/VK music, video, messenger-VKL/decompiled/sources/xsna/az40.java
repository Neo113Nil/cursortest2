package xsna;

import android.view.MenuItem;

/* compiled from: MusicPlayerTrackListAdapter.kt */
/* loaded from: classes3.dex */
public final class az40 implements fsv<whp0> {
    public final /* synthetic */ bz40 b;

    public az40(bz40 bz40Var) {
        this.b = bz40Var;
    }

    @Override // xsna.fsv
    public final void Ig(int i, whp0 whp0Var) {
        whp0 whp0Var2 = whp0Var;
        yb40 yb40Var = this.b.f;
        xhp0 xhp0Var = whp0Var2 instanceof xhp0 ? (xhp0) whp0Var2 : null;
        yb40Var.Ig(i, xhp0Var != null ? xhp0Var.a : null);
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
