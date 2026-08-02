package com.yandex.go.taxi.order.chat.ui.chat;

import android.view.animation.Animation;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fR$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"com/yandex/go/taxi/order/chat/ui/chat/TaxiOrderMessageViewHolder$PendingAnimationListener", "Landroid/view/animation/Animation$AnimationListener;", "<init>", "(Lcom/yandex/go/taxi/order/chat/ui/chat/b;)V", "", CaretView.ALPHA_PROPERTY, "Lzy11;", "animateTo", "(F)V", "Landroid/view/animation/Animation;", "animation", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "", "value", "isAnimating", "Z", "()Z", "finalAlpha", "F", "getFinalAlpha", "()F", "setFinalAlpha", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class TaxiOrderMessageViewHolder$PendingAnimationListener implements Animation.AnimationListener {
    private float finalAlpha = 1.0f;
    private boolean isAnimating;
    final /* synthetic */ b this$0;

    public TaxiOrderMessageViewHolder$PendingAnimationListener(b bVar) {
        this.this$0 = bVar;
    }

    private final void animateTo(float alpha) {
        this.this$0.X().animate().alpha(alpha).setDuration(900L).withLayer().start();
    }

    public final float getFinalAlpha() {
        return this.finalAlpha;
    }

    /* renamed from: isAnimating, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.isAnimating = false;
        animateTo(this.finalAlpha);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        this.isAnimating = true;
    }

    public final void setFinalAlpha(float f) {
        this.finalAlpha = f;
    }
}
