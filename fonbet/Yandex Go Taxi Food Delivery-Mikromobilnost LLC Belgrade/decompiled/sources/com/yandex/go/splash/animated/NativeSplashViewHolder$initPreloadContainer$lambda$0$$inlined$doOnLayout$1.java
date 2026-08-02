package com.yandex.go.splash.animated;

import android.view.View;
import android.view.ViewGroup;
import defpackage.m810;
import defpackage.n450;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1", "core-ktx_release"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NativeSplashViewHolder$initPreloadContainer$lambda$0$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ View $this_apply$inlined;
    final /* synthetic */ n450 this$0;

    public NativeSplashViewHolder$initPreloadContainer$lambda$0$$inlined$doOnLayout$1(n450 n450Var, View view) {
        this.this$0 = n450Var;
        this.$this_apply$inlined = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        float y = this.this$0.b.e.getY() + this.this$0.b.e.getMeasuredHeight();
        float measuredHeight = this.this$0.b.a.getMeasuredHeight() - y;
        view.setY(y);
        View view2 = this.$this_apply$inlined;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = m810.b(measuredHeight);
            view2.setLayoutParams(layoutParams);
        }
    }
}
