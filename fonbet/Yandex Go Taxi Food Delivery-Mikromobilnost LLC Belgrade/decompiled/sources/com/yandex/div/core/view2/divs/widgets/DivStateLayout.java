package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.f1k;
import defpackage.m3k;
import defpackage.msk;
import defpackage.nsk;
import defpackage.sb2;
import defpackage.sls;
import defpackage.u2k;
import defpackage.y2t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001rB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0012J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0012J*\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020*2\u0006\u00108\u001a\u0002072\b\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010H\u001a\u00060GR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010c\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001c\u0010i\u001a\u00020*8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bf\u0010e\"\u0004\bg\u0010hR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\f0j8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010q\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lmsk;", "Lu2k;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "direction", "canScrollHorizontally", "(I)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Lcom/yandex/div/core/state/b;", StateEntry.COLUMN_PATH, "Lcom/yandex/div/core/state/b;", "getPath", "()Lcom/yandex/div/core/state/b;", "setPath", "(Lcom/yandex/div/core/state/b;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "swipeListener", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Ly2t;", "gestureDetector", "Ly2t;", "Lkotlin/Function0;", "swipeOutCallback", "Lsls;", "getSwipeOutCallback", "()Lsls;", "setSwipeOutCallback", "(Lsls;)V", "Lm3k;", "activeStateDiv", "Lm3k;", "getActiveStateDiv$div_release", "()Lm3k;", "setActiveStateDiv$div_release", "(Lm3k;)V", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Lu2k;", "setDiv", "(Lu2k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "getStateId", "()Ljava/lang/String;", "stateId", "SwipeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivStateLayout extends FrameContainerLayout implements msk {
    private final /* synthetic */ nsk $$delegate_0;
    private m3k activeStateDiv;
    private final y2t gestureDetector;
    private com.yandex.div.core.state.b path;
    private final SwipeListener swipeListener;
    private sls swipeOutCallback;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;)V", "Landroid/view/View;", "v", "", RemoteBioParameters.X, RemoteBioParameters.Y, "", "dir", "", "canScroll", "(Landroid/view/View;FFI)Z", "Landroid/view/MotionEvent;", "e", "onDown", "(Landroid/view/MotionEvent;)Z", "e1", "e2", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "Lzy11;", "finishSwipe", "()V", "getView", "()Landroid/view/View;", "view", "getInScroll", "()Z", "inScroll", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        public SwipeListener() {
        }

        private final boolean canScroll(View v, float x, float y, int dir) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (x >= childAt.getLeft() && x < childAt.getRight() && y >= childAt.getTop() && y < childAt.getBottom() && canScroll(childAt, x - childAt.getLeft(), y - childAt.getTop(), dir)) {
                        return true;
                    }
                }
            }
            return v.canScrollHorizontally(dir);
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final void finishSwipe() {
            float abs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float f;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                abs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                f = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        sls swipeOutCallback = DivStateLayout.this.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.invoke();
                        }
                    }
                };
            } else {
                abs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                f = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) sb2.j(abs, 0.0f, 300.0f)).translationX(f).setListener(animatorListenerAdapter).start();
        }

        public final boolean getInScroll() {
            View view = getView();
            return !((view != null ? view.getTranslationX() : 0.0f) == 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            View view = getView();
            if (view == null || e1 == null) {
                return false;
            }
            int signum = (int) Math.signum(distanceX);
            if (view.getTranslationX() == 0.0f && Math.abs(distanceX) > Math.abs(distanceY) * 2.0f && canScroll(view, e1.getX(), e1.getY(), signum)) {
                return false;
            }
            view.setTranslationX(sb2.j(view.getTranslationX() - distanceX, -view.getWidth(), view.getWidth()));
            return !(view.getTranslationX() == 0.0f);
        }
    }

    public DivStateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new y2t(context, swipeListener, new Handler(Looper.getMainLooper()));
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (super.canScrollHorizontally(direction)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(direction);
        }
        View childAt = getChildAt(0);
        return direction < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.b(canvas);
            super.draw(canvas);
            divBorderDrawer.c(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    /* renamed from: getActiveStateDiv$div_release, reason: from getter */
    public final m3k getActiveStateDiv() {
        return this.activeStateDiv;
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public u2k getDiv() {
        return (u2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    public final com.yandex.div.core.state.b getPath() {
        return this.path;
    }

    public final String getStateId() {
        com.yandex.div.core.state.b bVar = this.path;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    public final sls getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    @Override // defpackage.ugk
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.b.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.a(width, height);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.a.onTouchEvent(event);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.a.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public final void setActiveStateDiv$div_release(m3k m3kVar) {
        this.activeStateDiv = m3kVar;
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public final void setPath(com.yandex.div.core.state.b bVar) {
        this.path = bVar;
    }

    public final void setSwipeOutCallback(sls slsVar) {
        this.swipeOutCallback = slsVar;
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @Override // defpackage.msk
    public void setDiv(u2k u2kVar) {
        this.$$delegate_0.c = u2kVar;
    }

    public DivStateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivStateLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
