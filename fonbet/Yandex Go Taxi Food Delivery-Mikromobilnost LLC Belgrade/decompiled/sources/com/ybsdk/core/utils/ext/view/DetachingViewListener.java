package com.ybsdk.core.utils.ext.view;

import android.view.View;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\fJ\u0011\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/utils/ext/view/DetachingViewListener;", "Landroid/view/View;", "T", "Landroid/view/View$OnAttachStateChangeListener;", "view", "Lkotlin/Function1;", "Lzy11;", "add", "remove", "<init>", "(Landroid/view/View;Ltls;Ltls;)V", "dispose", "()V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "init", "()Ljava/lang/AutoCloseable;", "p0", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "Ltls;", "", "isAdded", "Z", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DetachingViewListener<T extends View> implements View.OnAttachStateChangeListener {
    private final tls add;
    private boolean isAdded;
    private final tls remove;
    private final T view;

    public DetachingViewListener(T t, tls tlsVar, tls tlsVar2) {
        this.view = t;
        this.add = tlsVar;
        this.remove = tlsVar2;
    }

    private final void add() {
        if (this.isAdded) {
            return;
        }
        this.add.invoke(this.view);
        this.isAdded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispose() {
        remove();
        this.view.removeOnAttachStateChangeListener(this);
    }

    private final void remove() {
        this.remove.invoke(this.view);
        this.isAdded = false;
    }

    public final AutoCloseable init() {
        this.view.addOnAttachStateChangeListener(this);
        add();
        return new AutoCloseable() { // from class: com.ybsdk.core.utils.ext.view.a
            @Override // java.lang.AutoCloseable
            public final void close() {
                DetachingViewListener.this.dispose();
            }
        };
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p0) {
        add();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p0) {
        remove();
    }
}
