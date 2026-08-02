package com.yandex.plus.plaquesdk.plaque;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.transition.Transition;
import defpackage.crc0;
import defpackage.erc0;
import defpackage.fy31;
import defpackage.gsc0;
import defpackage.i3y;
import defpackage.imc0;
import defpackage.loc0;
import defpackage.mic0;
import defpackage.qg20;
import defpackage.roc0;
import defpackage.t9a0;
import defpackage.tls;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+J/\u00102\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010?\u001a\u0004\u0018\u00010\u00122\b\u0010>\u001a\u0004\u0018\u00010\u00128G@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010%\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010CR\u0014\u0010D\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010J\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020(0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/yandex/plus/plaquesdk/plaque/PlaqueView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "uiContext", "Lfy31;", "visualSizeListener", "Limc0;", "errorHandler", "Lkotlin/Function1;", "Leg20;", "Lzy11;", "onWidgetClicked", "Lmic0;", "animator", "<init>", "(Landroid/content/Context;Lfy31;Limc0;Ltls;Lmic0;)V", "", "duration", "Lroc0;", "newModel", "", "newPayload", "startAnimation", "(JLroc0;Ljava/lang/Object;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "handleTouch", "(Landroid/view/MotionEvent;)Z", "Lcrc0;", "oldState", "newState", "Landroidx/transition/Transition$TransitionListener;", "createTransitionListener", "(Lcrc0;Lcrc0;)Landroidx/transition/Transition$TransitionListener;", "model", "animDuration", "payload", "show", "(Lroc0;JLjava/lang/Object;)V", "Lerc0;", "listener", "addPlaqueStateListener", "(Lerc0;)V", "removePlaqueStateListener", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "dispatchTouchEvent", "Lfy31;", "Lmic0;", "Li3y;", "Lcom/yandex/plus/plaquesdk/plaque/NotificationView;", "notificationViewLazy", "Li3y;", "Lqg20;", "adapter", "Lqg20;", "value", "plaqueModel", "Lroc0;", "getPlaqueModel", "()Lroc0;", "Ljava/lang/Object;", "touchSlop", CA20Status.STATUS_USER_I, "", "initialTouchY", "F", "minimumSwipeHeight", "swipeActionInProgress", "Z", "actionCanBeHandled", "", "plaqueStateChangeListeners", "Ljava/util/List;", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaqueView extends FrameLayout {
    private boolean actionCanBeHandled;
    private final qg20 adapter;
    private final mic0 animator;
    private float initialTouchY;
    private final int minimumSwipeHeight;
    private final i3y notificationViewLazy;
    private Object payload;
    private roc0 plaqueModel;
    private final List<erc0> plaqueStateChangeListeners;
    private boolean swipeActionInProgress;
    private final int touchSlop;
    private final fy31 visualSizeListener;

    public PlaqueView(Context context, fy31 fy31Var, imc0 imc0Var, tls tlsVar, mic0 mic0Var) {
        super(context);
        this.visualSizeListener = fy31Var;
        this.animator = mic0Var;
        this.notificationViewLazy = a.a(new t9a0(13, this));
        this.adapter = new qg20(this, imc0Var, tlsVar, true);
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.touchSlop = scaledTouchSlop;
        this.minimumSwipeHeight = scaledTouchSlop * 3;
        this.actionCanBeHandled = true;
        this.plaqueStateChangeListeners = new ArrayList();
        setImportantForAccessibility(2);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final Transition.TransitionListener createTransitionListener(crc0 oldState, crc0 newState) {
        return new gsc0(this, oldState, newState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r0 != 3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean handleTouch(MotionEvent event) {
        roc0 roc0Var = this.plaqueModel;
        if (roc0Var == null || !roc0Var.f) {
            this.swipeActionInProgress = false;
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float y = this.initialTouchY - event.getY();
                    if (y > this.touchSlop) {
                        this.swipeActionInProgress = true;
                    }
                    if (y > this.minimumSwipeHeight) {
                        return true;
                    }
                }
            }
            this.swipeActionInProgress = false;
        } else {
            this.initialTouchY = event.getY();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationView notificationViewLazy$lambda$0(PlaqueView plaqueView) {
        return new NotificationView(plaqueView.getContext());
    }

    public static /* synthetic */ void show$default(PlaqueView plaqueView, roc0 roc0Var, long j, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        plaqueView.show(roc0Var, j, obj);
    }

    private final void startAnimation(long duration, roc0 newModel, Object newPayload) {
        roc0 roc0Var = this.plaqueModel;
        crc0 crc0Var = roc0Var != null ? new crc0(roc0Var.a, this.payload) : null;
        final crc0 crc0Var2 = new crc0(newModel.a, newPayload);
        if (crc0Var != null) {
            this.animator.c(this, duration, newModel.d, createTransitionListener(crc0Var, crc0Var2));
            return;
        }
        Iterator<T> it = this.plaqueStateChangeListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.plaquesdk.plaque.PlaqueView$startAnimation$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                List list;
                view.removeOnLayoutChangeListener(this);
                list = PlaqueView.this.plaqueStateChangeListeners;
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    throw unr0.i(it2);
                }
            }
        });
    }

    public final void addPlaqueStateListener(erc0 listener) {
        this.plaqueStateChangeListeners.add(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getActionMasked() == 0) {
            this.actionCanBeHandled = true;
        }
        if (this.actionCanBeHandled && !handleTouch(event)) {
            super.dispatchTouchEvent(event);
        }
        return true;
    }

    public final roc0 getPlaqueModel() {
        return this.plaqueModel;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.visualSizeListener.i(w, h);
    }

    public final void removePlaqueStateListener(erc0 listener) {
        this.plaqueStateChangeListeners.remove(listener);
    }

    public final void show(roc0 model, long animDuration, Object payload) {
        if (animDuration != 0) {
            startAnimation(animDuration, model, payload);
        }
        this.adapter.c(Collections.singletonList(model.b));
        loc0 loc0Var = model.c;
        i3y i3yVar = this.notificationViewLazy;
        if (loc0Var != null) {
            NotificationView notificationView = (NotificationView) i3yVar.getValue();
            if (notificationView.getParent() == null) {
                addView(notificationView);
            }
            notificationView.update(model);
        } else if (i3yVar.isInitialized()) {
            removeView((View) this.notificationViewLazy.getValue());
        }
        this.plaqueModel = model;
        this.payload = payload;
    }

    public final void show(roc0 roc0Var, long j) {
        show$default(this, roc0Var, j, null, 4, null);
    }

    public final void show(roc0 roc0Var) {
        show$default(this, roc0Var, 0L, null, 6, null);
    }
}
