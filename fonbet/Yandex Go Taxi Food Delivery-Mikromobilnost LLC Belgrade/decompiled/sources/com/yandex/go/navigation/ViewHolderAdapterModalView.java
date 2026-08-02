package com.yandex.go.navigation;

import android.view.View;
import defpackage.b230;
import defpackage.dzt0;
import defpackage.e230;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0012R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/navigation/ViewHolderAdapterModalView;", "Lru/yandex/taxi/widget/ModalView;", "Ldzt0;", "holder", "<init>", "(Ldzt0;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "duration", "Lzy11;", "animateShowBackground", "(J)V", "animateDismissBackground", "()V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "onModalViewDisappear", "Ldzt0;", "getHolder", "()Ldzt0;", "", "isActive", "()Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewHolderAdapterModalView extends ModalView {
    private final dzt0 holder;

    public ViewHolderAdapterModalView(dzt0 dzt0Var) {
        super(dzt0Var.b.getContext());
        this.holder = dzt0Var;
        addView(dzt0Var.b);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        if (this.holder.c.c.isEmpty()) {
            endAction.run();
        } else {
            this.holder.c.a(endAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.holder.b;
    }

    public final dzt0 getHolder() {
        return this.holder;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return b230.a;
    }

    public final boolean isActive() {
        return isEnabled();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.holder.c.a(null);
    }
}
