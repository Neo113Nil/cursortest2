package xsna;

import android.view.View;

/* compiled from: GoodReviewItemComposeViewHolder.kt */
/* loaded from: classes18.dex */
public final class y7u implements View.OnAttachStateChangeListener {
    public final /* synthetic */ x7u b;

    public y7u(x7u x7uVar) {
        this.b = x7uVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x7u x7uVar = this.b;
        x7uVar.itemView.getViewTreeObserver().addOnScrollChangedListener(x7uVar.q);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        x7u x7uVar = this.b;
        x7uVar.itemView.getViewTreeObserver().removeOnScrollChangedListener(x7uVar.q);
    }
}
