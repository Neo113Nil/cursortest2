package xsna;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: VkCheckActionModeCallback.kt */
/* loaded from: classes15.dex */
public final class pju0 implements ActionMode.Callback {
    public final l090 a;
    public final i1x b;
    public final int c;
    public final int d;

    public pju0(l090 l090Var, i1x i1xVar, int i, int i2) {
        this.a = l090Var;
        this.b = i1xVar;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        l090 l090Var;
        String a;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908322 || (a = (l090Var = this.a).a()) == null) {
            return false;
        }
        boolean b = l090Var.b(a);
        if (b) {
            this.b.a(this.c, p490.l(this.d, a), true);
        }
        return b;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem findItem = menu.findItem(R.id.paste);
        if (findItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, R.id.paste, 0, findItem.getTitle());
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
