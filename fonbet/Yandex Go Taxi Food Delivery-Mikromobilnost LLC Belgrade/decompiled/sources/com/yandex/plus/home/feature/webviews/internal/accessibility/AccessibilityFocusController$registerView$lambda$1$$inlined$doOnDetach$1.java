package com.yandex.plus.home.feature.webviews.internal.accessibility;

import android.view.View;
import defpackage.vg;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessibilityFocusController$registerView$lambda$1$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ vg this$0;

    public AccessibilityFocusController$registerView$lambda$1$$inlined$doOnDetach$1(View view, vg vgVar, View view2) {
        this.$this_doOnDetach = view;
        this.this$0 = vgVar;
        this.$view$inlined = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        this.this$0.a.remove(this.$view$inlined);
        vg.a((View) a.b0(this.this$0.a));
    }
}
