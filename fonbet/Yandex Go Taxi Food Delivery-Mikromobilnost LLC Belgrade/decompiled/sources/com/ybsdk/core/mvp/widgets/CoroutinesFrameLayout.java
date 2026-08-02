package com.ybsdk.core.mvp.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u0014\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/core/mvp/widgets/CoroutinesFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ltse;", "coroutineScope", "Lzy11;", "onScopeCreated", "(Ltse;)V", "onScopeCleared", "()V", "onAttachedToWindow", "onDetachedFromWindow", "scope", "Ltse;", "getScope", "()Ltse;", "setScope", "core-mvp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CoroutinesFrameLayout extends FrameLayout {
    private tse scope;

    public CoroutinesFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.scope = bvf0.a(cvw.U(a, o400.a));
    }

    public final tse getScope() {
        return this.scope;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onScopeCreated(this.scope);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.a.g(this.scope.getCoroutineContext(), null);
    }

    public void onScopeCleared() {
    }

    public void onScopeCreated(tse coroutineScope) {
    }

    public final void setScope(tse tseVar) {
        this.scope = tseVar;
    }

    public CoroutinesFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CoroutinesFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ CoroutinesFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public CoroutinesFrameLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
