package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.div.core.view2.debugview.SafeAreaTopMarginController$attachStateChangeListener$1;
import defpackage.gol0;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class gol0 {
    public final ViewGroup a;
    public final int[] b = new int[2];
    public int c;
    public final SafeAreaTopMarginController$attachStateChangeListener$1 d;
    public View e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.debugview.SafeAreaTopMarginController$attachStateChangeListener$1] */
    public gol0(ViewGroup viewGroup) {
        this.a = viewGroup;
        ?? r0 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.debugview.SafeAreaTopMarginController$attachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                gol0.this.c();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        this.d = r0;
        if (viewGroup.isAttachedToWindow()) {
            c();
        } else {
            viewGroup.addOnAttachStateChangeListener(r0);
        }
    }

    public final void a() {
        this.a.removeOnAttachStateChangeListener(this.d);
        this.e = null;
    }

    public final void b(LinearLayout linearLayout) {
        this.e = linearLayout;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i = marginLayoutParams.topMargin;
            int i2 = this.c;
            if (i == i2) {
                return;
            }
            marginLayoutParams.topMargin = i2;
            linearLayout.requestLayout();
        }
    }

    public final void c() {
        Activity activity;
        ViewGroup viewGroup = this.a;
        View view = viewGroup;
        while (true) {
            activity = null;
            if (view == null) {
                break;
            }
            Context context = view.getContext();
            Activity activity2 = context instanceof Activity ? (Activity) context : null;
            if (activity2 != null) {
                activity = activity2;
                break;
            } else {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        int i = window.getAttributes().flags;
        if ((67108864 & i) == 0 && (i & 512) == 0 && (window.getDecorView().getSystemUiVisibility() & 1024) == 0) {
            return;
        }
        vfc0 vfc0Var = new vfc0(22, this);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(viewGroup, vfc0Var);
        n751 a = op31.a(viewGroup);
        if (a != null) {
            d(a);
        }
    }

    public final void d(n751 n751Var) {
        int i = n751Var.a.g(1).b;
        ViewGroup viewGroup = this.a;
        int[] iArr = this.b;
        viewGroup.getLocationInWindow(iArr);
        int i2 = iArr[1];
        this.c = (i <= 0 || i2 >= i) ? 0 : i - i2;
        View view = this.e;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i3 = marginLayoutParams.topMargin;
            int i4 = this.c;
            if (i3 == i4) {
                return;
            }
            marginLayoutParams.topMargin = i4;
            view.requestLayout();
        }
    }
}
