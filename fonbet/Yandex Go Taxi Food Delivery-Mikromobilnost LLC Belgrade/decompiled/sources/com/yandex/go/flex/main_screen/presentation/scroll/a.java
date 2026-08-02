package com.yandex.go.flex.main_screen.presentation.scroll;

import android.view.View;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.l8x;
import defpackage.mip0;
import defpackage.tje;
import defpackage.tse;
import defpackage.zbw0;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(OrientationAwareRecyclerView orientationAwareRecyclerView, zbw0 zbw0Var, final tse tseVar) {
        mip0 mip0Var = new mip0(orientationAwareRecyclerView, zbw0Var, tseVar);
        orientationAwareRecyclerView.setClipToPadding(false);
        final ScrollSpanDelegate$observePaddings$1 scrollSpanDelegate$observePaddings$1 = new ScrollSpanDelegate$observePaddings$1(orientationAwareRecyclerView, mip0Var, null);
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.main_screen.utils.ViewExtensionsKt$repeatOnAttach$listener$1
            private l8x job;

            public final l8x getJob() {
                return this.job;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p0) {
                l8x l8xVar = this.job;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                this.job = tje.N(tse.this, null, null, scrollSpanDelegate$observePaddings$1, 3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p0) {
                l8x l8xVar = this.job;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
            }

            public final void setJob(l8x l8xVar) {
                this.job = l8xVar;
            }
        };
        orientationAwareRecyclerView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        if (orientationAwareRecyclerView.isAttachedToWindow()) {
            onAttachStateChangeListener.onViewAttachedToWindow(orientationAwareRecyclerView);
        }
        orientationAwareRecyclerView.addOnLayoutChangeListener(mip0Var.d);
        orientationAwareRecyclerView.addOnScrollListener(mip0Var.e);
    }
}
