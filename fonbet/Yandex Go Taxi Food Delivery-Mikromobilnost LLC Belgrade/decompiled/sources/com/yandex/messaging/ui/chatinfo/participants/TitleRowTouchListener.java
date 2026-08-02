package com.yandex.messaging.ui.chatinfo.participants;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.sls;
import defpackage.vji0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\u0019R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/messaging/ui/chatinfo/participants/TitleRowTouchListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Lvji0;", "Landroid/content/Context;", "context", "Landroid/graphics/Rect;", "bounds", "Lkotlin/Function0;", "Lzy11;", "onClick", "<init>", "(Landroid/content/Context;Landroid/graphics/Rect;Lsls;)V", "Landroid/view/MotionEvent;", "e", "", "buttonTouched", "(Landroid/view/MotionEvent;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallowIntercept", "onRequestDisallowInterceptTouchEvent", "(Z)V", "onDown", "onSingleTapUp", "Landroid/graphics/Rect;", "Lsls;", "isButtonVisible", "Z", "()Z", "setButtonVisible", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TitleRowTouchListener extends GestureDetector.SimpleOnGestureListener implements vji0 {
    public static final int $stable = 8;
    private final Rect bounds;
    private final GestureDetector gestureDetector;
    private boolean isButtonVisible;
    private final sls onClick;

    public TitleRowTouchListener(Context context, Rect rect, sls slsVar) {
        this.bounds = rect;
        this.onClick = slsVar;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setIsLongpressEnabled(false);
        this.gestureDetector = gestureDetector;
    }

    private final boolean buttonTouched(MotionEvent e) {
        return !this.bounds.isEmpty() && this.isButtonVisible && e.getY() < ((float) this.bounds.bottom) && e.getY() > ((float) this.bounds.top) && e.getX() > ((float) (this.bounds.width() / 2));
    }

    /* renamed from: isButtonVisible, reason: from getter */
    public final boolean getIsButtonVisible() {
        return this.isButtonVisible;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override // defpackage.vji0
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        if (buttonTouched(e)) {
            return this.gestureDetector.onTouchEvent(e);
        }
        return false;
    }

    @Override // defpackage.vji0
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        this.onClick.invoke();
        return true;
    }

    @Override // defpackage.vji0
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        if (buttonTouched(e)) {
            this.gestureDetector.onTouchEvent(e);
        }
    }

    public final void setButtonVisible(boolean z) {
        this.isButtonVisible = z;
    }
}
