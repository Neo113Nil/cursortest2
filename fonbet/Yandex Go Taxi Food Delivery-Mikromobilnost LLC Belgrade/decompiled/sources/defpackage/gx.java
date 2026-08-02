package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.d;

/* loaded from: classes10.dex */
public abstract class gx {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private ex mSubUiVisibilityListener;
    private fx mVisibilityListener;

    public gx(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public abstract boolean hasSubMenu();

    public abstract boolean isVisible();

    public abstract View onCreateActionView(MenuItem menuItem);

    public abstract boolean onPerformDefaultAction();

    public abstract void onPrepareSubMenu(SubMenu subMenu);

    public abstract boolean overridesItemVisibility();

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(ex exVar) {
        this.mSubUiVisibilityListener = exVar;
    }

    public abstract void setVisibilityListener(fx fxVar);

    public void subUiVisibilityChanged(boolean z) {
        ex exVar = this.mSubUiVisibilityListener;
        if (exVar != null) {
            d dVar = (d) exVar;
            if (z) {
                wm10 wm10Var = dVar.x;
                if (wm10Var != null) {
                    wm10Var.onOpenSubMenu(dVar.c);
                    return;
                }
                return;
            }
            MenuBuilder menuBuilder = dVar.c;
            if (menuBuilder != null) {
                menuBuilder.close(false);
            }
        }
    }
}
