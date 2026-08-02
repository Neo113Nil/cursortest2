package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes.dex */
public class azt0<V extends View> extends CoordinatorLayout.c<V> {
    public bzt0 b;
    public int c;

    public azt0() {
        this.c = 0;
    }

    public final int D() {
        bzt0 bzt0Var = this.b;
        if (bzt0Var != null) {
            return bzt0Var.b();
        }
        return 0;
    }

    public int E() {
        return D();
    }

    public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.R(i, v);
    }

    public final boolean G(int i) {
        bzt0 bzt0Var = this.b;
        if (bzt0Var != null) {
            return bzt0Var.d(i);
        }
        this.c = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.b == null) {
            this.b = new bzt0(v);
        }
        this.b.c();
        this.b.a();
        int i2 = this.c;
        if (i2 == 0) {
            return true;
        }
        this.b.d(i2);
        this.c = 0;
        return true;
    }

    public azt0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
    }
}
