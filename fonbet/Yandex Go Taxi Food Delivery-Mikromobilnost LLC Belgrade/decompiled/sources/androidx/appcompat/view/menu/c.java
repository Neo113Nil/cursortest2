package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MenuItem;
import defpackage.wl10;

/* loaded from: classes10.dex */
public final class c implements wl10 {
    public final /* synthetic */ CascadingMenuPopup a;

    public c(CascadingMenuPopup cascadingMenuPopup) {
        this.a = cascadingMenuPopup;
    }

    @Override // defpackage.wl10
    public final void a(MenuBuilder menuBuilder, MenuItem menuItem) {
        this.a.mSubMenuHoverHandler.removeCallbacksAndMessages(menuBuilder);
    }

    @Override // defpackage.wl10
    public final void b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        CascadingMenuPopup cascadingMenuPopup = this.a;
        cascadingMenuPopup.mSubMenuHoverHandler.removeCallbacksAndMessages(null);
        int size = cascadingMenuPopup.mShowingMenus.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == cascadingMenuPopup.mShowingMenus.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        cascadingMenuPopup.mSubMenuHoverHandler.postAtTime(new b(this, i2 < cascadingMenuPopup.mShowingMenus.size() ? cascadingMenuPopup.mShowingMenus.get(i2) : null, menuItemImpl, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
    }
}
