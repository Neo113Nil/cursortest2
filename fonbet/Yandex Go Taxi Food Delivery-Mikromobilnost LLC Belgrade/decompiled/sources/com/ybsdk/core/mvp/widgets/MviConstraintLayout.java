package com.ybsdk.core.mvp.widgets;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.tje;
import defpackage.tse;
import defpackage.w2y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/mvp/widgets/MviConstraintLayout;", "TState", "TEffect", "Lcom/ybsdk/core/mvp/widgets/CoroutinesConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lw2y;", "layoutViewModel", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILw2y;)V", "Ltse;", "coroutineScope", "Lzy11;", "onScopeCreated", "(Ltse;)V", "viewState", "render", "(Ljava/lang/Object;)V", "effect", "consumeSideEffect", "onDetachedFromWindow", "()V", "Lw2y;", "core-mvp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MviConstraintLayout<TState, TEffect> extends CoroutinesConstraintLayout {
    private final w2y layoutViewModel;

    public /* synthetic */ MviConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, w2y w2yVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, w2yVar);
    }

    public void consumeSideEffect(TEffect effect) {
    }

    @Override // com.ybsdk.core.mvp.widgets.CoroutinesConstraintLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.layoutViewModel.getClass();
    }

    @Override // com.ybsdk.core.mvp.widgets.CoroutinesConstraintLayout
    public void onScopeCreated(tse coroutineScope) {
        this.layoutViewModel.getClass();
        tje.N(coroutineScope, null, null, new MviConstraintLayout$onScopeCreated$1(this, null), 3);
        tje.N(coroutineScope, null, null, new MviConstraintLayout$onScopeCreated$2(this, null), 3);
    }

    public abstract void render(TState viewState);

    public MviConstraintLayout(Context context, AttributeSet attributeSet, int i, w2y w2yVar) {
        this(context, attributeSet, i, 0, w2yVar, 8, null);
    }

    public MviConstraintLayout(Context context, AttributeSet attributeSet, w2y w2yVar) {
        this(context, attributeSet, 0, 0, w2yVar, 12, null);
    }

    public MviConstraintLayout(Context context, w2y w2yVar) {
        this(context, null, 0, 0, w2yVar, 14, null);
    }

    public MviConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, w2y w2yVar) {
        super(context, attributeSet, i, i2);
        this.layoutViewModel = w2yVar;
    }
}
