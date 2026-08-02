package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import com.lightside.slab.SlotView;
import com.lightside.visum.layouts.ScrollViewBuilder;
import com.yandex.passport.R;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.np31;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q extends t2y {
    public final com.lightside.slab.c c;
    public final ScrollViewBuilder w;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Activity activity) {
        super(activity);
        SlotView slotView = new SlotView(wj91.e(0, activity), null, 0, 0);
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(slotView);
        }
        com.lightside.slab.c cVar = new com.lightside.slab.c(slotView);
        this.c = cVar;
        final ScrollViewBuilder scrollViewBuilder = new ScrollViewBuilder(wj91.e(0, activity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(scrollViewBuilder);
        }
        int i = (int) (8.0f * uc20.a.density);
        scrollViewBuilder.setPadding(i, i, i, i);
        li91.g(R.color.passport_roundabout_background, scrollViewBuilder);
        View view = cVar.a;
        wj91.e(0, scrollViewBuilder.getCtx());
        scrollViewBuilder.addToParent(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams);
        if (scrollViewBuilder.isAttachedToWindow()) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            np31.c(scrollViewBuilder);
        } else {
            scrollViewBuilder.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutFullscreenUi$scrollable$lambda$2$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    scrollViewBuilder.removeOnAttachStateChangeListener(this);
                    ScrollViewBuilder scrollViewBuilder2 = scrollViewBuilder;
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    np31.c(scrollViewBuilder2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
        this.w = scrollViewBuilder;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        RoundaboutFullscreenLayout roundaboutFullscreenLayout = new RoundaboutFullscreenLayout(kp31Var.getCtx());
        roundaboutFullscreenLayout.addView(this.w);
        com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(6, roundaboutFullscreenLayout);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(roundaboutFullscreenLayout, aVar);
        return roundaboutFullscreenLayout;
    }
}
