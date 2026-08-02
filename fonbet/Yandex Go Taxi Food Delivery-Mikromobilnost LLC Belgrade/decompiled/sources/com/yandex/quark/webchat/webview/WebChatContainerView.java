package com.yandex.quark.webchat.webview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.yandex.quark.webchat.i;
import defpackage.hg41;
import defpackage.y3x0;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/quark/webchat/webview/WebChatContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lhg41;", "webContentView", "", "gestureFixEnabled", "<init>", "(Landroid/content/Context;Lhg41;Z)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "fixMalformedCancel", "(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Z", "Lcom/yandex/quark/webchat/i;", "insetsController", "Lcom/yandex/quark/webchat/i;", "getInsetsController", "()Lcom/yandex/quark/webchat/i;", "lastValidEvent", "Landroid/view/MotionEvent;", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebChatContainerView extends FrameLayout {
    private final boolean gestureFixEnabled;
    private final i insetsController;
    private MotionEvent lastValidEvent;

    public WebChatContainerView(Context context, hg41 hg41Var, boolean z) {
        super(context);
        this.gestureFixEnabled = z;
        this.insetsController = new i(this, hg41Var);
        addView(((y3x0) hg41Var).e, -1, -1);
    }

    private final MotionEvent fixMalformedCancel(MotionEvent event) {
        MotionEvent motionEvent;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            MotionEvent motionEvent2 = this.lastValidEvent;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.lastValidEvent = null;
            return event;
        }
        if (actionMasked != 3) {
            MotionEvent motionEvent3 = this.lastValidEvent;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.lastValidEvent = MotionEvent.obtain(event);
            return event;
        }
        if (event.getSource() == 0 && (motionEvent = this.lastValidEvent) != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.lastValidEvent = null;
            return obtain;
        }
        MotionEvent motionEvent4 = this.lastValidEvent;
        if (motionEvent4 != null) {
            motionEvent4.recycle();
        }
        this.lastValidEvent = null;
        return event;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (!this.gestureFixEnabled) {
            return super.dispatchTouchEvent(event);
        }
        MotionEvent fixMalformedCancel = fixMalformedCancel(event);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(fixMalformedCancel);
        if (fixMalformedCancel != event) {
            fixMalformedCancel.recycle();
        }
        return dispatchTouchEvent;
    }

    public final i getInsetsController() {
        return this.insetsController;
    }
}
