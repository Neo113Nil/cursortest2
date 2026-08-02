package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import defpackage.rwg0;
import defpackage.wm10;

/* loaded from: classes10.dex */
public class d {
    public final Context a;
    public final MenuBuilder b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public wm10 i;
    public MenuPopup j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper$1
        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            d.this.d();
        }
    };

    public d(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.a = context;
        this.b = menuBuilder;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public final MenuPopup b() {
        MenuPopup standardMenuPopup;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(rwg0.abc_cascading_menus_min_smallest_width)) {
                standardMenuPopup = new CascadingMenuPopup(this.a, this.f, this.d, this.e, this.c);
            } else {
                standardMenuPopup = new StandardMenuPopup(this.a, this.b, this.f, this.d, this.e, this.c);
            }
            standardMenuPopup.addMenu(this.b);
            standardMenuPopup.setOnDismissListener(this.l);
            standardMenuPopup.setAnchorView(this.f);
            standardMenuPopup.setCallback(this.i);
            standardMenuPopup.setForceShowIcon(this.h);
            standardMenuPopup.setGravity(this.g);
            this.j = standardMenuPopup;
        }
        return this.j;
    }

    public final boolean c() {
        MenuPopup menuPopup = this.j;
        return menuPopup != null && menuPopup.isShowing();
    }

    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void e(boolean z) {
        this.h = z;
        MenuPopup menuPopup = this.j;
        if (menuPopup != null) {
            menuPopup.setForceShowIcon(z);
        }
    }

    public final void f(wm10 wm10Var) {
        this.i = wm10Var;
        MenuPopup menuPopup = this.j;
        if (menuPopup != null) {
            menuPopup.setCallback(wm10Var);
        }
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        MenuPopup b = b();
        b.setShowTitle(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            b.setHorizontalOffset(i);
            b.setVerticalOffset(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.setEpicenterBounds(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.show();
    }
}
