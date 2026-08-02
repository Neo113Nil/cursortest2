package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.mr2;
import defpackage.wm10;

/* loaded from: classes10.dex */
public final class m implements wm10 {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public m(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.wm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuBuilder rootMenu = menuBuilder.getRootMenu();
        boolean z2 = rootMenu != menuBuilder;
        if (z2) {
            menuBuilder = rootMenu;
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        mr2 findMenuPanel = appCompatDelegateImpl.findMenuPanel(menuBuilder);
        if (findMenuPanel != null) {
            if (!z2) {
                appCompatDelegateImpl.closePanel(findMenuPanel, z);
            } else {
                appCompatDelegateImpl.callOnPanelClosed(findMenuPanel.a, findMenuPanel, rootMenu);
                appCompatDelegateImpl.closePanel(findMenuPanel, true);
            }
        }
    }

    @Override // defpackage.wm10
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Window.Callback windowCallback;
        if (menuBuilder != menuBuilder.getRootMenu()) {
            return true;
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        if (!appCompatDelegateImpl.mHasActionBar || (windowCallback = appCompatDelegateImpl.getWindowCallback()) == null || appCompatDelegateImpl.mDestroyed) {
            return true;
        }
        windowCallback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
