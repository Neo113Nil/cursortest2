package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.e90;
import defpackage.iog0;
import defpackage.nw70;
import defpackage.ny61;

/* loaded from: classes10.dex */
public final class k {
    public final MenuBuilder a;
    public final View b;
    public final androidx.appcompat.view.menu.d c;
    public e90 d;

    public k(Context context, View view, int i, int i2, int i3) {
        this.b = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.a = menuBuilder;
        menuBuilder.setCallback(new nw70(26, this));
        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context, menuBuilder, view, i2, i3, false);
        this.c = dVar;
        dVar.g = i;
        dVar.k = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu$2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                k.this.getClass();
            }
        };
    }

    public final void a() {
        androidx.appcompat.view.menu.d dVar = this.c;
        if (dVar.c()) {
            return;
        }
        if (dVar.f != null) {
            dVar.g(0, 0, false, false);
        } else {
            ny61.r("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public k(Context context, View view, int i) {
        this(context, view, i, iog0.popupMenuStyle, 0);
    }
}
