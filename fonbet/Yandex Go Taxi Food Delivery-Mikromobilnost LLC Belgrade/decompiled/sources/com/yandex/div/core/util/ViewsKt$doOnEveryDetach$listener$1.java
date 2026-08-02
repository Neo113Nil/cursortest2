package com.yandex.div.core.util;

import android.view.View;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/yandex/div/core/util/ViewsKt$doOnEveryDetach$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class ViewsKt$doOnEveryDetach$listener$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ tls $action;

    public ViewsKt$doOnEveryDetach$listener$1(tls tlsVar) {
        this.$action = tlsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.$action.invoke(view);
    }
}
