package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.wm10;

/* loaded from: classes10.dex */
public final class g implements wm10 {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public g(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.wm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        this.a.checkCloseActionMenu(menuBuilder);
    }

    @Override // defpackage.wm10
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Window.Callback windowCallback = this.a.getWindowCallback();
        if (windowCallback == null) {
            return true;
        }
        windowCallback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
