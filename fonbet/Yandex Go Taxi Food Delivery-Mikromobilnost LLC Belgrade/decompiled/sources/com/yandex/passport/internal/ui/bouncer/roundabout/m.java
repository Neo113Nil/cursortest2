package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lightside.slab.SlotView;
import com.lightside.visum.layouts.CoordinatorLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.view.NestedScrollViewBuilder;
import com.yandex.passport.internal.flags.presentation.s0;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.np31;
import defpackage.t2y;
import defpackage.wj91;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class m extends t2y {
    public final com.lightside.slab.c c;
    public final BottomSheetBehavior w;
    public final NestedScrollViewBuilder x;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Activity activity) {
        super(activity);
        SlotView slotView = new SlotView(wj91.e(0, activity), null, 0, 0);
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(slotView);
        }
        com.lightside.slab.c cVar = new com.lightside.slab.c(slotView);
        this.c = cVar;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior(activity, null);
        bottomSheetBehavior.f0 = false;
        bottomSheetBehavior.V(0, false);
        bottomSheetBehavior.W(4);
        bottomSheetBehavior.Q(true);
        bottomSheetBehavior.E = v.O;
        this.w = bottomSheetBehavior;
        final NestedScrollViewBuilder nestedScrollViewBuilder = new NestedScrollViewBuilder(wj91.e(0, activity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(nestedScrollViewBuilder);
        }
        nestedScrollViewBuilder.setBackgroundResource(R.drawable.passport_roundabout_bottomsheet_background);
        View view = cVar.a;
        wj91.e(0, nestedScrollViewBuilder.getCtx());
        nestedScrollViewBuilder.addToParent(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams);
        if (nestedScrollViewBuilder.isAttachedToWindow()) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            np31.c(nestedScrollViewBuilder);
        } else {
            nestedScrollViewBuilder.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutBottomsheetUi$content$lambda$3$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    nestedScrollViewBuilder.removeOnAttachStateChangeListener(this);
                    NestedScrollViewBuilder nestedScrollViewBuilder2 = nestedScrollViewBuilder;
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    np31.c(nestedScrollViewBuilder2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
        this.x = nestedScrollViewBuilder;
    }

    @Override // defpackage.t2y
    public final void a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        com.yandex.passport.internal.ui.o oVar = new com.yandex.passport.internal.ui.o(4, this, coordinatorLayout);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(coordinatorLayout, oVar);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        CoordinatorLayoutBuilder coordinatorLayoutBuilder = new CoordinatorLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(coordinatorLayoutBuilder);
        }
        coordinatorLayoutBuilder.invoke(this.x, new s0(12, coordinatorLayoutBuilder, this));
        return coordinatorLayoutBuilder;
    }
}
