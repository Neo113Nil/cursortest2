package xsna;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
/* loaded from: classes11.dex */
public final class hsr extends ActionMode.Callback2 implements ActionMode.Callback {
    public final nbo0 a;

    public hsr(nbo0 nbo0Var) {
        this.a = nbo0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.a(menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.d();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        zhf0 b = this.a.b();
        rect.set(Math.round(b.a), Math.round(b.b), Math.round(b.c), Math.round(b.d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.c(menu);
    }
}
