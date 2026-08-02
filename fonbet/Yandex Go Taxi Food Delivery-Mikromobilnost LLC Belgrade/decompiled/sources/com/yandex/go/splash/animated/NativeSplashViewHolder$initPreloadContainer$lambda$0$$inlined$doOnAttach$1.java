package com.yandex.go.splash.animated;

import android.view.View;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NativeSplashViewHolder$initPreloadContainer$lambda$0$$inlined$doOnAttach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ sls $preloadDone$inlined;
    final /* synthetic */ View $this_apply$inlined;
    final /* synthetic */ View $this_doOnAttach;

    public NativeSplashViewHolder$initPreloadContainer$lambda$0$$inlined$doOnAttach$1(View view, View view2, sls slsVar) {
        this.$this_doOnAttach = view;
        this.$this_apply$inlined = view2;
        this.$preloadDone$inlined = slsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        final View view2 = this.$this_apply$inlined;
        boolean isAttachedToWindow = view2.isAttachedToWindow();
        final sls slsVar = this.$preloadDone$inlined;
        if (isAttachedToWindow) {
            view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.splash.animated.NativeSplashViewHolder$initPreloadContainer$lambda$0$1$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    view2.removeOnAttachStateChangeListener(this);
                    slsVar.invoke();
                }
            });
        } else {
            slsVar.invoke();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
