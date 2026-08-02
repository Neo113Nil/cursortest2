package com.yandex.quark.utils.lifecycle;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.kgx;
import defpackage.pey;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0006J$\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/quark/utils/lifecycle/ViewLifecycleDelegate;", "Lpey;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "v", "Lzy11;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Lkgx;", "property", "getValue", "(Landroid/view/View;Lkgx;)Lpey;", "Landroid/view/View;", "Landroidx/lifecycle/t;", "lifecycleRegistry", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewLifecycleDelegate implements pey, View.OnAttachStateChangeListener {
    private final Lifecycle lifecycle;
    private final t lifecycleRegistry;
    private final View view;

    public ViewLifecycleDelegate(View view) {
        this.view = view;
        t tVar = new t(this, true);
        this.lifecycleRegistry = tVar;
        tVar.i(Lifecycle.State.CREATED);
        view.addOnAttachStateChangeListener(this);
        this.lifecycle = tVar;
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final pey getValue(View view, kgx property) {
        return this;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.lifecycleRegistry.i(Lifecycle.State.STARTED);
        this.lifecycleRegistry.i(Lifecycle.State.RESUMED);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.lifecycleRegistry.i(Lifecycle.State.DESTROYED);
        this.view.removeOnAttachStateChangeListener(this);
    }
}
