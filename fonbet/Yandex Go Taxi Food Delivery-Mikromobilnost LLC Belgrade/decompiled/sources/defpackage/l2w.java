package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import defpackage.k2w;
import defpackage.l2w;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class l2w {
    public final a2w a;
    public final View b;
    public final View c;
    public final View d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public boolean g;

    public l2w(a2w a2wVar, View view, View view2, View view3) {
        this.a = a2wVar;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view.getPaddingBottom();
    }

    public final void a(final View view) {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.contains(view)) {
            return;
        }
        linkedHashSet.add(view);
        h2r h2rVar = new h2r(10, this, view);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(view, h2rVar);
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.fintechsdk.core.ui.impl.api.activity.InsetsSetupHelper$setupDetachCleanup$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    this.f.remove(view2);
                }
            });
        } else {
            linkedHashSet.remove(view);
        }
        if (view.isAttachedToWindow()) {
            view.post(new k2w(view, this, 0));
        } else if (view.isAttachedToWindow()) {
            view.post(new k2w(view, this, 0));
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.fintechsdk.core.ui.impl.api.activity.InsetsSetupHelper$applyInsetsWhenReady$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    l2w l2wVar = this;
                    l2wVar.getClass();
                    view2.post(new k2w(view2, l2wVar, 0));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public final n751 b(Context context, n751 n751Var) {
        k751 k751Var = n751Var.a;
        a2w a2wVar = this.a;
        if (!a2wVar.a() || a2wVar.a == BottomSheetMode.FULLSCREEN || this.g) {
            return n751Var;
        }
        int i = (int) (a2wVar.b * context.getResources().getDisplayMetrics().density);
        u1w g = k751Var.g(519);
        u1w g2 = k751Var.g(16);
        x651 x651Var = new x651(n751Var);
        u1w c = u1w.c(g.a, i, g.c, g.d);
        y651 y651Var = x651Var.a;
        y651Var.b(519, c);
        y651Var.b(16, u1w.c(g2.a, i, g2.c, g2.d));
        return y651Var.h();
    }

    public final void c() {
        if (this.a.a() && !this.g) {
            this.g = true;
            Context context = this.d.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            for (View view : a.J0(this.f)) {
                if (view.isAttachedToWindow()) {
                    view.post(new k2w(view, this, 1));
                }
            }
        }
    }
}
