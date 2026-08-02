package com.yandex.go.chargers.ui;

import android.content.Context;
import android.view.MotionEvent;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.mqg0;
import defpackage.tje;
import defpackage.vpa;
import defpackage.xw31;
import defpackage.zo31;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001f\u0010\u0014R\"\u0010 \u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001e¨\u0006'"}, d2 = {"Lcom/yandex/go/chargers/ui/ChargersShortcutsLikeSlideableModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initialState", "(Landroid/content/Context;I)V", "", "canDragToExpandFromAnchored", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onBackPressed", "()V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissWithAction", "(Ljava/lang/Runnable;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "animateDismissBackground", "collapsedByUser", "Z", "getCollapsedByUser", "setCollapsedByUser", "(Z)V", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChargersShortcutsLikeSlideableModalView<T extends zo31> extends SlideableBindingModalView<T> {
    private boolean collapsedByUser;

    public ChargersShortcutsLikeSlideableModalView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissWithAction$lambda$0() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return (isTransiting() || behaviourState() == 6 || behaviourState() == 4) ? mqg0.transparent : super.getBackgroundColor();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismissWithAction(Runnable onAnimationEnd) {
        if (!isCollapsed()) {
            super.dismissWithAction(onAnimationEnd);
            return;
        }
        if (onAnimationEnd == null) {
            onAnimationEnd = new vpa(0);
        }
        dismissInternal(onAnimationEnd);
    }

    public final boolean getCollapsedByUser() {
        return this.collapsedByUser;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (behaviourState() == 3) {
            anchor();
        } else {
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        this.collapsedByUser = newState == 4 && movedByUser;
        updateUserInteractionBlockingOutside();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public final void setCollapsedByUser(boolean z) {
        this.collapsedByUser = z;
    }

    public ChargersShortcutsLikeSlideableModalView(Context context, int i) {
        super(context, i);
    }
}
