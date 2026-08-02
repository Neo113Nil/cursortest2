package com.yandex.messaging.internal.view.timeline;

import android.os.SystemClock;
import android.view.View;
import defpackage.fbz;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/MessageTapHandler;", "Landroid/view/View$OnClickListener;", "", "doubleTapTimeout", "Lkotlin/Function0;", "", "isFeatureEnabled", "Lzy11;", "onSingleClick", "onDoubleClick", "<init>", "(JLsls;Lsls;Lsls;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "onActionDown", "()V", "view", "attachTo", "cleanup", "J", "Lsls;", "firstTapTime", "Ljava/lang/Runnable;", "pendingClickRunnable", "Ljava/lang/Runnable;", "suppressNextClick", "Z", "attachedView", "Landroid/view/View;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageTapHandler implements View.OnClickListener {
    public static final int $stable = 8;
    private View attachedView;
    private final long doubleTapTimeout;
    private long firstTapTime;
    private final sls isFeatureEnabled;
    private final sls onDoubleClick;
    private final sls onSingleClick;
    private Runnable pendingClickRunnable;
    private boolean suppressNextClick;

    public /* synthetic */ MessageTapHandler(long j, sls slsVar, sls slsVar2, sls slsVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 150L : j, slsVar, slsVar2, slsVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$1(MessageTapHandler messageTapHandler) {
        messageTapHandler.pendingClickRunnable = null;
        messageTapHandler.firstTapTime = 0L;
        messageTapHandler.onSingleClick.invoke();
    }

    public final void attachTo(View view) {
        this.attachedView = view;
        view.setOnClickListener(this);
    }

    public final void cleanup() {
        View view;
        Runnable runnable = this.pendingClickRunnable;
        if (runnable != null && (view = this.attachedView) != null) {
            view.removeCallbacks(runnable);
        }
        this.pendingClickRunnable = null;
        this.firstTapTime = 0L;
        this.suppressNextClick = false;
    }

    public final void onActionDown() {
        View view;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.firstTapTime;
        long j2 = uptimeMillis - j;
        if (j <= 0 || j2 >= this.doubleTapTimeout) {
            return;
        }
        this.suppressNextClick = true;
        Runnable runnable = this.pendingClickRunnable;
        if (runnable != null && (view = this.attachedView) != null) {
            view.removeCallbacks(runnable);
        }
        this.pendingClickRunnable = null;
        this.firstTapTime = 0L;
        if (((Boolean) this.isFeatureEnabled.invoke()).booleanValue()) {
            this.onDoubleClick.invoke();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        View view;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.firstTapTime;
        long j2 = uptimeMillis - j;
        if (this.suppressNextClick) {
            this.suppressNextClick = false;
            return;
        }
        if (j <= 0 || j2 >= this.doubleTapTimeout) {
            this.firstTapTime = uptimeMillis;
            fbz fbzVar = new fbz(24, this);
            this.pendingClickRunnable = fbzVar;
            View view2 = this.attachedView;
            if (view2 != null) {
                view2.postDelayed(fbzVar, this.doubleTapTimeout);
                return;
            }
            return;
        }
        Runnable runnable = this.pendingClickRunnable;
        if (runnable != null && (view = this.attachedView) != null) {
            view.removeCallbacks(runnable);
        }
        this.pendingClickRunnable = null;
        this.firstTapTime = 0L;
        this.suppressNextClick = true;
        if (((Boolean) this.isFeatureEnabled.invoke()).booleanValue()) {
            this.onDoubleClick.invoke();
        } else {
            this.onSingleClick.invoke();
        }
    }

    public MessageTapHandler(long j, sls slsVar, sls slsVar2, sls slsVar3) {
        this.doubleTapTimeout = j;
        this.isFeatureEnabled = slsVar;
        this.onSingleClick = slsVar2;
        this.onDoubleClick = slsVar3;
    }
}
