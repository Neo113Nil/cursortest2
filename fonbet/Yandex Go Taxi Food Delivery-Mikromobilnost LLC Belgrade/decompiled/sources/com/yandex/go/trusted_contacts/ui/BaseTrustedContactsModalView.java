package com.yandex.go.trusted_contacts.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.cma1;
import defpackage.l95;
import defpackage.ofp0;
import defpackage.w511;
import defpackage.y130;
import defpackage.zi;
import defpackage.zo31;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\rJ!\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\rJ!\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\rJ!\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/BaseTrustedContactsModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/lang/Runnable;", "startAction", "endAction", "Lzy11;", "animateDismissLeftToRight", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "", "translation", "Landroid/view/ViewPropertyAnimator;", "animateTransition", "(F)Landroid/view/ViewPropertyAnimator;", "Ly130;", "insetsType", "()Ly130;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "animateDismiss", "animateShowRightToLeft", "animateShowLeftToRight", "animateDismissRightToLeft", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BaseTrustedContactsModalView<T extends zo31> extends SlideableBindingModalView<T> {
    public BaseTrustedContactsModalView(Context context) {
        super(context);
    }

    private final void animateDismissLeftToRight(Runnable startAction, Runnable endAction) {
        animateTransition(ofp0.b).withStartAction(startAction).withEndAction(endAction);
    }

    public static /* synthetic */ void animateDismissLeftToRight$default(BaseTrustedContactsModalView baseTrustedContactsModalView, Runnable runnable, Runnable runnable2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animateDismissLeftToRight");
            return;
        }
        if ((i & 1) != 0) {
            runnable = new zi(18);
        }
        if ((i & 2) != 0) {
            runnable2 = new zi(19);
        }
        baseTrustedContactsModalView.animateDismissLeftToRight(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismissLeftToRight$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismissLeftToRight$lambda$1() {
    }

    public static /* synthetic */ void animateDismissRightToLeft$default(BaseTrustedContactsModalView baseTrustedContactsModalView, Runnable runnable, Runnable runnable2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animateDismissRightToLeft");
            return;
        }
        if ((i & 1) != 0) {
            runnable = new zi(14);
        }
        if ((i & 2) != 0) {
            runnable2 = new zi(15);
        }
        baseTrustedContactsModalView.animateDismissRightToLeft(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismissRightToLeft$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismissRightToLeft$lambda$1() {
    }

    public static /* synthetic */ void animateShowLeftToRight$default(BaseTrustedContactsModalView baseTrustedContactsModalView, Runnable runnable, Runnable runnable2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animateShowLeftToRight");
            return;
        }
        if ((i & 1) != 0) {
            runnable = new zi(12);
        }
        if ((i & 2) != 0) {
            runnable2 = new zi(13);
        }
        baseTrustedContactsModalView.animateShowLeftToRight(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShowLeftToRight$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShowLeftToRight$lambda$1() {
    }

    public static /* synthetic */ void animateShowRightToLeft$default(BaseTrustedContactsModalView baseTrustedContactsModalView, Runnable runnable, Runnable runnable2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animateShowRightToLeft");
            return;
        }
        if ((i & 1) != 0) {
            runnable = new zi(16);
        }
        if ((i & 2) != 0) {
            runnable2 = new zi(17);
        }
        baseTrustedContactsModalView.animateShowRightToLeft(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShowRightToLeft$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShowRightToLeft$lambda$1() {
    }

    private final ViewPropertyAnimator animateTransition(float translation) {
        return cma1.g(translation, this).setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [zo31] */
    public static final View insetsType$lambda$0(BaseTrustedContactsModalView baseTrustedContactsModalView) {
        return baseTrustedContactsModalView.getBinding().getRoot();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        animateDismissLeftToRight(startAction, endAction);
    }

    public final void animateDismissRightToLeft(Runnable startAction, Runnable endAction) {
        animateTransition(-ofp0.b).withStartAction(startAction).withEndAction(endAction);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        animateShowRightToLeft(onAnimateShowStartAction, onAnimateShowEndAction);
    }

    public final void animateShowLeftToRight(Runnable startAction, Runnable endAction) {
        setTranslationX(-ofp0.b);
        cma1.g(0.0f, this).setDuration(300L).withStartAction(startAction).withEndAction(endAction);
    }

    public final void animateShowRightToLeft(Runnable startAction, Runnable endAction) {
        setTranslationX(ofp0.b);
        cma1.g(0.0f, this).setDuration(300L).withStartAction(startAction).withEndAction(endAction);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(0, new l95(7, this), true);
    }
}
