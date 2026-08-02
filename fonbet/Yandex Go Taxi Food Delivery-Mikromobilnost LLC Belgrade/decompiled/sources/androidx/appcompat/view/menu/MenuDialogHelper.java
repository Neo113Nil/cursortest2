package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import defpackage.kvh0;
import defpackage.rq1;
import defpackage.wm10;

/* loaded from: classes10.dex */
class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, wm10 {
    private AlertDialog mDialog;
    private MenuBuilder mMenu;
    ListMenuPresenter mPresenter;
    private wm10 mPresenterCallback;

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public void dismiss() {
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.mMenu.performItemAction((MenuItemImpl) this.mPresenter.getAdapter().getItem(i), 0);
    }

    @Override // defpackage.wm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.mMenu) {
            dismiss();
        }
        wm10 wm10Var = this.mPresenterCallback;
        if (wm10Var != null) {
            wm10Var.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.mPresenter.onCloseMenu(this.mMenu, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.mDialog.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.mDialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.mMenu.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.mMenu.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.wm10
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        wm10 wm10Var = this.mPresenterCallback;
        if (wm10Var != null) {
            return wm10Var.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    public void setPresenterCallback(wm10 wm10Var) {
        this.mPresenterCallback = wm10Var;
    }

    public void show(IBinder iBinder) {
        MenuBuilder menuBuilder = this.mMenu;
        AlertDialog.a aVar = new AlertDialog.a(menuBuilder.getContext());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(aVar.getContext(), kvh0.abc_list_menu_item_layout);
        this.mPresenter = listMenuPresenter;
        listMenuPresenter.setCallback(this);
        this.mMenu.addMenuPresenter(this.mPresenter);
        ListAdapter adapter = this.mPresenter.getAdapter();
        rq1 rq1Var = aVar.a;
        rq1Var.q = adapter;
        rq1Var.r = this;
        View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            rq1Var.e = headerView;
        } else {
            rq1Var.c = menuBuilder.getHeaderIcon();
            aVar.setTitle(menuBuilder.getHeaderTitle());
        }
        rq1Var.o = this;
        AlertDialog create = aVar.create();
        this.mDialog = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.mDialog.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.mDialog.show();
    }
}
