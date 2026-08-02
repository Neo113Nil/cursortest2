package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import defpackage.pjy0;
import defpackage.rc2;
import defpackage.zii0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode$Callback;", "Lpjy0;", "textActionModeCallback", "<init>", "(Lpjy0;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Lzy11;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "Lpjy0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FloatingTextActionModeCallback extends ActionMode.Callback2 implements ActionMode.Callback {
    private final pjy0 textActionModeCallback;

    public FloatingTextActionModeCallback(pjy0 pjy0Var) {
        this.textActionModeCallback = pjy0Var;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        this.textActionModeCallback.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        ((rc2) this.textActionModeCallback).a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
        ((rc2) this.textActionModeCallback).a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode mode, View view, Rect outRect) {
        zii0 zii0Var = (zii0) ((rc2) this.textActionModeCallback).c.invoke();
        outRect.set(Math.round(zii0Var.a), Math.round(zii0Var.b), Math.round(zii0Var.c), Math.round(zii0Var.d));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return ((rc2) this.textActionModeCallback).a(menu);
    }
}
