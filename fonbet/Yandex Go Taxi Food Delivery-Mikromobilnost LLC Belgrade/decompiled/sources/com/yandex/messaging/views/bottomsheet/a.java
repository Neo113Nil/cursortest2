package com.yandex.messaging.views.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.bricks.Brick;
import com.yandex.bricks.c;
import com.yandex.messaging.extension.view.ViewExtensionsKt$onHeightChanged$listener$1;
import com.yandex.messaging.views.bottomsheet.a;
import defpackage.eg6;
import defpackage.gg6;
import defpackage.i3y;
import defpackage.js4;
import defpackage.kgx;
import defpackage.op3;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.u90;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class a {
    public static final /* synthetic */ kgx[] m;
    public final c a;
    public final View b;
    public final BottomSheetDialog c;
    public final LinkedList d = new LinkedList();
    public final BottomSheetBehavior e;
    public final i3y f;
    public final u90 g;
    public ValueAnimator h;
    public ViewPropertyAnimator i;
    public ViewPropertyAnimator j;
    public final op3 k;
    public boolean l;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("onHeightChangedCancellable", 0, "getOnHeightChangedCancellable()Lcom/yandex/messaging/Cancelable;", a.class);
        qoi0.a.getClass();
        m = new kgx[]{mutablePropertyReference1Impl};
    }

    public a(c cVar, View view, NavigableBottomSheetDialog navigableBottomSheetDialog) {
        this.a = cVar;
        this.b = view;
        this.c = navigableBottomSheetDialog;
        BottomSheetBehavior<FrameLayout> behavior = navigableBottomSheetDialog.getBehavior();
        this.e = behavior;
        final int i = 0;
        this.f = kotlin.a.a(new sls(this) { // from class: dg6
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        ViewParent parent = aVar.a.a.getParent();
                        while (true) {
                            if (parent == null) {
                                parent = null;
                            } else if (!(parent instanceof CoordinatorLayout)) {
                                parent = parent.getParent();
                            }
                        }
                        return (CoordinatorLayout) parent;
                    default:
                        BottomSheetBehavior bottomSheetBehavior = aVar.e;
                        c cVar2 = aVar.a;
                        if (bottomSheetBehavior.G() > aVar.a().getHeight()) {
                            bottomSheetBehavior.V(aVar.a().getHeight(), false);
                        } else if (cVar2.a.getHeight() > bottomSheetBehavior.G()) {
                            bottomSheetBehavior.V(cVar2.a.getHeight(), false);
                        }
                        bottomSheetBehavior.P(Math.max(0, aVar.a().getHeight() - bottomSheetBehavior.G()));
                        return zy11.a;
                }
            }
        });
        this.g = new u90(6, this);
        this.k = new op3();
        behavior.v(new gg6(this));
        CoordinatorLayout a = a();
        ArrayList arrayList = new ArrayList();
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                z83.i();
                break;
            }
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            arrayList.add(parent);
            if (parent.equals(a)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ViewGroup) it.next()).setClipChildren(false);
                }
            } else {
                parent = ((ViewGroup) parent).getParent();
            }
        }
        CoordinatorLayout a2 = a();
        final int i2 = 1;
        a2.addOnLayoutChangeListener(new ViewExtensionsKt$onHeightChanged$listener$1(a2, new sls(this) { // from class: dg6
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        ViewParent parent2 = aVar.a.a.getParent();
                        while (true) {
                            if (parent2 == null) {
                                parent2 = null;
                            } else if (!(parent2 instanceof CoordinatorLayout)) {
                                parent2 = parent2.getParent();
                            }
                        }
                        return (CoordinatorLayout) parent2;
                    default:
                        BottomSheetBehavior bottomSheetBehavior = aVar.e;
                        c cVar2 = aVar.a;
                        if (bottomSheetBehavior.G() > aVar.a().getHeight()) {
                            bottomSheetBehavior.V(aVar.a().getHeight(), false);
                        } else if (cVar2.a.getHeight() > bottomSheetBehavior.G()) {
                            bottomSheetBehavior.V(cVar2.a.getHeight(), false);
                        }
                        bottomSheetBehavior.P(Math.max(0, aVar.a().getHeight() - bottomSheetBehavior.G()));
                        return zy11.a;
                }
            }
        }));
    }

    public final CoordinatorLayout a() {
        return (CoordinatorLayout) this.f.getValue();
    }

    public final void b(b bVar, Bundle bundle) {
        Brick j = bVar.j();
        c cVar = this.a;
        cVar.a(j);
        bVar.p(bundle);
        this.d.add(bVar);
        if (Build.VERSION.SDK_INT >= 35) {
            cVar.a.requestApplyInsets();
        }
    }

    public final void c(b bVar, Bundle bundle) {
        c cVar = this.a;
        cVar.a.removeOnLayoutChangeListener(this.g);
        BottomSheetBehavior bottomSheetBehavior = this.e;
        if (bottomSheetBehavior.k0 == 3) {
            this.l = false;
            bottomSheetBehavior.W(4);
        }
        View view = this.b;
        int y = (int) view.getY();
        int G = bottomSheetBehavior.G();
        int i = bVar.k().a;
        int max = Math.max(a().getWidth(), a().getHeight()) + i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setLayoutParams(layoutParams instanceof ConstraintLayout.LayoutParams ? new ConstraintLayout.LayoutParams(((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).width, max) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams(((ViewGroup.MarginLayoutParams) layoutParams).width, max) : new ViewGroup.LayoutParams(layoutParams.width, max));
        eg6 eg6Var = new eg6(this, bVar, bundle, i, y, G);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator alpha = cVar.a.animate().alpha(0.0f);
        alpha.setDuration(100L);
        alpha.withEndAction(new js4(18, eg6Var));
        this.i = alpha;
        alpha.start();
    }
}
