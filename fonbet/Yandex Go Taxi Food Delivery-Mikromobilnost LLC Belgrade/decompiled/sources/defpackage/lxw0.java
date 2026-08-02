package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public final class lxw0 extends ItemTouchHelper$Callback {
    public final t7f d;

    public lxw0(t7f t7fVar) {
        this.d = t7fVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void b(RecyclerView recyclerView, x0 x0Var) {
        View view = x0Var.a;
        Object tag = view.getTag(xbh0.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.m(view, floatValue);
        }
        view.setTag(xbh0.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        fl2 fl2Var = x0Var instanceof fl2 ? (fl2) x0Var : null;
        if (fl2Var != null) {
            fl2Var.P.setActivated(false);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int e(x0 x0Var) {
        return ItemTouchHelper$Callback.k(x0Var instanceof fl2 ? 3 : 0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        return x0Var2 instanceof fl2;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void n(RecyclerView recyclerView, x0 x0Var, int i, x0 x0Var2, int i2) {
        t7f t7fVar = this.d;
        Collections.swap(t7fVar.m, i - 1, i2 - 1);
        t7fVar.d();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void o(x0 x0Var, int i) {
        View view;
        if (i != 0) {
            fl2 fl2Var = x0Var instanceof fl2 ? (fl2) x0Var : null;
            if (fl2Var != null) {
                fl2Var.P.setActivated(true);
            }
            if (x0Var == null || (view = x0Var.a) == null) {
                return;
            }
            view.setElevation(kjs0.d(3));
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
    }
}
