package com.yandex.messaging.ui.chatcreate;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e9h0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/ui/chatcreate/ButtonsBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Landroid/view/ViewGroup;", "<init>", "()V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonsBarBehavior extends CoordinatorLayout.a {
    public final boolean a = true;
    public boolean b;
    public boolean c;
    public ViewGroup w;
    public View x;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (!this.c && view2.getId() == e9h0.user_list_slot) {
            this.c = true;
            this.w = viewGroup;
            this.x = view2;
        }
        return view2.getId() == e9h0.user_list_slot;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (!this.a) {
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        if (i2 > 0) {
            View view3 = this.x;
            if (view3 == null) {
                view3 = null;
            }
            float y = view3.getY() - i2;
            if (y > 0.0f) {
                u(y, viewGroup.getHeight());
                iArr[1] = i2;
            } else {
                u(0.0f, viewGroup.getHeight());
                if (y < 0.0f) {
                    i2 += (int) y;
                }
                iArr[1] = i2;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void m(int i, int i2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (this.b || i2 >= 0) {
            return;
        }
        View view2 = this.x;
        if (view2 == null) {
            view2 = null;
        }
        if (view2.getY() < viewGroup.getHeight()) {
            float height = viewGroup.getHeight();
            View view3 = this.x;
            u(Math.min(height, (view3 != null ? view3 : null).getY() - i2), height);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.b = false;
        return view3 instanceof RecyclerView;
    }

    public final void u(float f, float f2) {
        View view = this.x;
        if (view == null) {
            view = null;
        }
        if (view.getY() < f && f == f2) {
            this.b = true;
        }
        ViewGroup viewGroup = this.w;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setY(f - f2);
        View view2 = this.x;
        (view2 != null ? view2 : null).setY(f);
    }
}
