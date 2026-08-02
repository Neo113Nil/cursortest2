package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import defpackage.d6w;
import defpackage.dd00;
import defpackage.gd00;
import defpackage.t5w;
import defpackage.tc00;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uhr;
import defpackage.wc00;
import defpackage.xc00;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0085\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ!\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\u000f¢\u0006\u0004\b*\u0010)J\u001d\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J/\u00102\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0002¢\u0006\u0004\b<\u0010&J\u0017\u0010=\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010>J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\nJ'\u0010D\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0014H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0014H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010\nJ\u000f\u0010M\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010\nR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR\u0016\u0010]\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR\u0016\u0010^\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010YR\u0016\u0010_\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR\u0016\u0010`\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010h\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR&\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00130u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR$\u0010y\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0012\u0010\u0080\u0001\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u007f\u0010KR\u0013\u0010\u0082\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010KR\u0013\u0010\u0083\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010&¨\u0006\u0086\u0001"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/MainSidePager;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "onFinishInflate", "()V", "Landroid/view/View;", "view", "setSidePage", "(Landroid/view/View;)V", "", "isSidePageView", "(Landroid/view/View;)Z", "clearSidePage", "Lkotlin/Function1;", "", "listener", "addProgressListener", "(Ltls;)V", "removeProgressListener", "", "text", "setPullHint", "(Ljava/lang/CharSequence;)V", "", "height", "setHintHeaderHeight", "(I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "animated", "showMain", "(Z)V", "showSidePage", "target", "setProgress", "(FZ)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "dy", "canStartVerticalDrag", "(F)Z", "isInMidTransition", "updatePhasesFromDrag", "(F)V", "velocityY", "snapAfterRelease", "snapOpenTowardSide", "overlayTarget", "sideTarget", "animateToPhases", "(FFZ)V", "overlay", "side", "applyPhases", "(FF)V", "resolveHintOverlayVisualPhase", "()F", "resetDragState", "adoptInflatedMainPageChildren", "Landroid/widget/FrameLayout;", "sidePage", "Landroid/widget/FrameLayout;", "mainPage", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/MainSidePagerHintOverlay;", "hintOverlay", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/MainSidePagerHintOverlay;", "Lgd00;", "swipeHapticFeedback", "Lgd00;", "overlayPhase", "F", "sidePhase", "previousSidePhase", "hintOverlayVisualPhase", "dragStartX", "dragStartY", "dragStartRawX", "dragStartRawY", "dragStartSidePhase", "isDragging", "Z", "isAutoCommitted", "activePointerId", CA20Status.STATUS_USER_I, "touchSlop", "minFlingVelocity", "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/view/VelocityTracker;", "Landroid/animation/ValueAnimator;", "phaseAnimator", "Landroid/animation/ValueAnimator;", "Landroid/view/animation/PathInterpolator;", "openInterpolator", "Landroid/view/animation/PathInterpolator;", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "closeInterpolator", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "", "progressListeners", "Ljava/util/List;", "Lxc00;", "nestedScrollDelegate", "Lxc00;", "getNestedScrollDelegate", "()Lxc00;", "setNestedScrollDelegate", "(Lxc00;)V", "getCurrentProgress", "currentProgress", "getCurrentOverlayPhase", "currentOverlayPhase", "isOnSidePage", "Companion", "tc00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainSidePager extends GoFrameLayout {
    private static final float AUTO_OPEN_PROGRESS_THRESHOLD = 0.15f;
    public static final tc00 Companion = new tc00();
    private static final float DRAG_SPEED_RATIO = 0.5f;
    private static final long OPEN_SNAP_ANIMATION_DURATION_MS = 340;
    private static final float PROGRESS_EDGE_EPSILON = 0.01f;
    private static final float PROGRESS_ON_SIDE_EPSILON = 0.01f;
    private static final long SNAP_ANIMATION_DURATION_MS = 280;
    private static final float SNAP_THRESHOLD = 0.11f;
    public static final float TARGET_MAIN = 0.0f;
    public static final float TARGET_SIDE = 1.0f;
    private int activePointerId;
    private final FastOutSlowInInterpolator closeInterpolator;
    private float dragStartRawX;
    private float dragStartRawY;
    private float dragStartSidePhase;
    private float dragStartX;
    private float dragStartY;
    private final MainSidePagerHintOverlay hintOverlay;
    private float hintOverlayVisualPhase;
    private boolean isAutoCommitted;
    private boolean isDragging;
    private final FrameLayout mainPage;
    private final int minFlingVelocity;
    private xc00 nestedScrollDelegate;
    private final PathInterpolator openInterpolator;
    private float overlayPhase;
    private ValueAnimator phaseAnimator;
    private float previousSidePhase;
    private final List<tls> progressListeners;
    private final FrameLayout sidePage;
    private float sidePhase;
    private final gd00 swipeHapticFeedback;
    private final int touchSlop;
    private VelocityTracker velocityTracker;

    public MainSidePager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.sidePage = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.mainPage = frameLayout2;
        MainSidePagerHintOverlay mainSidePagerHintOverlay = new MainSidePagerHintOverlay(context);
        this.hintOverlay = mainSidePagerHintOverlay;
        this.swipeHapticFeedback = new gd00(context);
        this.activePointerId = -1;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.minFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.openInterpolator = new PathInterpolator(0.35f, 0.0f, 0.85f, 1.0f);
        this.closeInterpolator = new FastOutSlowInInterpolator();
        this.progressListeners = new ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        addView(mainSidePagerHintOverlay, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void adoptInflatedMainPageChildren() {
        d6w n = y6i0.n(0, getChildCount());
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        Iterator it = n.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((t5w) it).nextInt()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            View view = (View) obj;
            if (view != this.sidePage && view != this.mainPage && view != this.hintOverlay) {
                arrayList2.add(obj);
            }
        }
        for (View view2 : arrayList2) {
            removeView(view2);
            this.mainPage.addView(view2, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private final void animateToPhases(final float overlayTarget, final float sideTarget, boolean animated) {
        ValueAnimator valueAnimator = this.phaseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.sidePhase;
        if (!animated || getHeight() <= 0) {
            applyPhases(overlayTarget, sideTarget);
            return;
        }
        boolean z = sideTarget > f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, sideTarget);
        ofFloat.setDuration(z ? OPEN_SNAP_ANIMATION_DURATION_MS : 280L);
        ofFloat.setInterpolator(z ? this.openInterpolator : this.closeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sc00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MainSidePager.animateToPhases$lambda$0$0(MainSidePager.this, overlayTarget, valueAnimator2);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager$animateToPhases$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                MainSidePager.this.applyPhases(overlayTarget, sideTarget);
            }
        });
        ofFloat.start();
        this.phaseAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToPhases$lambda$0$0(MainSidePager mainSidePager, float f, ValueAnimator valueAnimator) {
        mainSidePager.applyPhases(f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPhases(float overlay, float side) {
        this.overlayPhase = y6i0.c(overlay, 0.0f, 1.0f);
        float c = y6i0.c(side, 0.0f, 1.0f);
        this.sidePhase = c;
        if (!this.isDragging && c >= 0.99f) {
            this.overlayPhase = 0.0f;
        }
        float height = getHeight();
        if (height <= 0.0f) {
            return;
        }
        float f = this.sidePhase;
        float f2 = f * height;
        this.sidePage.setTranslationY((1.0f - f) * (-height));
        this.mainPage.setTranslationY(f2);
        this.hintOverlay.setTranslationY(f2);
        float resolveHintOverlayVisualPhase = resolveHintOverlayVisualPhase();
        this.hintOverlayVisualPhase = resolveHintOverlayVisualPhase;
        this.hintOverlay.applyOverlayPhase(resolveHintOverlayVisualPhase);
        Iterator<T> it = this.progressListeners.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Float.valueOf(this.sidePhase));
        }
        this.previousSidePhase = this.sidePhase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r7 < (r3.getHeight() + r2)) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean canStartVerticalDrag(float dy) {
        xc00 xc00Var = this.nestedScrollDelegate;
        if (xc00Var != null && !isInMidTransition()) {
            float f = this.sidePhase;
            if (f <= 0.01f && this.overlayPhase <= 0.01f) {
                if (dy > 0.0f) {
                    float f2 = this.dragStartRawX;
                    float f3 = this.dragStartRawY;
                    wc00 wc00Var = (wc00) xc00Var;
                    if (((dd00) wc00Var.b).b.a.getValue() != MainSidePagerSidePage.NONE) {
                        int[] iArr = wc00Var.f;
                        View view = wc00Var.d;
                        if (view != null && view.getVisibility() == 0 && view.isLaidOut() && view.getHeight() > 0) {
                            view.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            int i2 = iArr[1];
                            if (f2 >= i) {
                                if (f2 < view.getWidth() + i) {
                                    if (f3 >= i2) {
                                    }
                                }
                            }
                        }
                        if (((Number) ((uhr) wc00Var.a).a.getValue()).intValue() > 0 || !wc00.a(wc00Var.c)) {
                        }
                    }
                }
                return false;
            }
            if (f >= 0.99f && (dy >= 0.0f || !((Boolean) ((wc00) xc00Var).e.invoke()).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    private final boolean isInMidTransition() {
        float f = this.overlayPhase;
        if (f > 0.01f && f < 0.99f) {
            return true;
        }
        float f2 = this.sidePhase;
        return f2 > 0.01f && f2 < 0.99f;
    }

    private final void resetDragState() {
        gd00 gd00Var = this.swipeHapticFeedback;
        gd00Var.b = false;
        gd00Var.c = false;
        this.isDragging = false;
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final float resolveHintOverlayVisualPhase() {
        float f = this.overlayPhase;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (this.isDragging || this.sidePhase >= this.previousSidePhase - 0.01f) {
            return f;
        }
        return 0.0f;
    }

    public static /* synthetic */ void showMain$default(MainSidePager mainSidePager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainSidePager.showMain(z);
    }

    public static /* synthetic */ void showSidePage$default(MainSidePager mainSidePager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainSidePager.showSidePage(z);
    }

    private final void snapAfterRelease(float velocityY) {
        int i = this.minFlingVelocity;
        boolean z = velocityY <= ((float) (-i));
        boolean z2 = velocityY >= ((float) i);
        if (z) {
            showMain(true);
        } else if (!z2 && this.sidePhase < SNAP_THRESHOLD) {
            showMain(true);
        } else {
            this.swipeHapticFeedback.a();
            snapOpenTowardSide();
        }
    }

    private final void snapOpenTowardSide() {
        animateToPhases(this.overlayPhase, 1.0f, true);
    }

    private final void updatePhasesFromDrag(float dy) {
        if (this.isAutoCommitted) {
            return;
        }
        float height = getHeight();
        if (height <= 0.0f) {
            return;
        }
        gd00 gd00Var = this.swipeHapticFeedback;
        boolean z = dy > 0.0f;
        gd00Var.b = z;
        if (!z) {
            gd00Var.c = false;
        }
        float f = this.dragStartSidePhase;
        float c = y6i0.c(((dy / height) * (f <= 0.01f ? 0.5f : 1.0f)) + f, 0.0f, 1.0f);
        applyPhases(c > 0.01f ? 1.0f : 0.0f, c);
        if (dy <= 0.0f || c < 0.15f) {
            return;
        }
        this.isAutoCommitted = true;
        this.swipeHapticFeedback.a();
        snapOpenTowardSide();
    }

    public final void addProgressListener(tls listener) {
        this.progressListeners.add(listener);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.hintOverlay.applyTheme(themeType);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void clearSidePage() {
        this.sidePage.removeAllViews();
    }

    /* renamed from: getCurrentOverlayPhase, reason: from getter */
    public final float getOverlayPhase() {
        return this.overlayPhase;
    }

    /* renamed from: getCurrentProgress, reason: from getter */
    public final float getSidePhase() {
        return this.sidePhase;
    }

    public final xc00 getNestedScrollDelegate() {
        return this.nestedScrollDelegate;
    }

    public final boolean isOnSidePage() {
        return this.sidePhase > 0.01f;
    }

    public final boolean isSidePageView(View view) {
        return view.getParent() == this.sidePage;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        adoptInflatedMainPageChildren();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (isEnabled() && getHeight() > 0) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                ValueAnimator valueAnimator = this.phaseAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.isAutoCommitted = false;
                gd00 gd00Var = this.swipeHapticFeedback;
                gd00Var.b = false;
                gd00Var.c = false;
                this.activePointerId = event.getPointerId(0);
                this.dragStartX = event.getX();
                this.dragStartY = event.getY();
                this.dragStartRawX = event.getRawX();
                this.dragStartRawY = event.getRawY();
                this.dragStartSidePhase = this.sidePhase;
                this.isDragging = false;
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                VelocityTracker obtain = VelocityTracker.obtain();
                this.velocityTracker = obtain;
                if (obtain != null) {
                    obtain.addMovement(event);
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = event.findPointerIndex(this.activePointerId);
                if (findPointerIndex >= 0) {
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(event);
                    }
                    float y = event.getY(findPointerIndex) - this.dragStartY;
                    float x = event.getX(findPointerIndex) - this.dragStartX;
                    if (!this.isDragging && Math.abs(y) > this.touchSlop && Math.abs(y) > Math.abs(x)) {
                        if (canStartVerticalDrag(y)) {
                            this.isDragging = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.dragStartY = event.getY(findPointerIndex);
                            this.dragStartSidePhase = this.sidePhase;
                        }
                    }
                    if (this.isDragging) {
                        updatePhasesFromDrag(event.getY(findPointerIndex) - this.dragStartY);
                        return true;
                    }
                }
            }
            return this.isDragging;
        }
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        applyPhases(this.overlayPhase, this.sidePhase);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled() || getHeight() <= 0 || !this.isDragging) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = this.velocityTracker;
            float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f;
            if (!this.isAutoCommitted) {
                snapAfterRelease(yVelocity);
            }
            resetDragState();
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = event.findPointerIndex(this.activePointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.addMovement(event);
            }
            updatePhasesFromDrag(event.getY(findPointerIndex) - this.dragStartY);
            return true;
        }
        if (actionMasked == 3) {
            if (!this.isAutoCommitted) {
                snapAfterRelease(0.0f);
            }
            resetDragState();
            return true;
        }
        if (actionMasked == 6) {
            int actionIndex = event.getActionIndex();
            if (event.getPointerId(actionIndex) == this.activePointerId && event.getPointerCount() > 1) {
                int i = actionIndex == 0 ? 1 : 0;
                if (i < event.getPointerCount()) {
                    this.activePointerId = event.getPointerId(i);
                    this.dragStartY = event.getY(i);
                    this.dragStartSidePhase = this.sidePhase;
                }
            }
        }
        return true;
    }

    public final void removeProgressListener(tls listener) {
        this.progressListeners.remove(listener);
    }

    public final void setHintHeaderHeight(int height) {
        this.hintOverlay.setHeaderHeight(height);
    }

    public final void setNestedScrollDelegate(xc00 xc00Var) {
        this.nestedScrollDelegate = xc00Var;
    }

    public final void setProgress(float target, boolean animated) {
        animateToPhases(0.0f, y6i0.c(target, 0.0f, 1.0f), animated);
    }

    public final void setPullHint(CharSequence text) {
        this.hintOverlay.setPullHint(text);
    }

    public final void setSidePage(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.sidePage;
        if (parent == frameLayout) {
            return;
        }
        frameLayout.removeAllViews();
        ViewParent parent2 = view.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.sidePage.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void showMain(boolean animated) {
        animateToPhases(0.0f, 0.0f, animated);
    }

    public final void showSidePage(boolean animated) {
        animateToPhases(0.0f, 1.0f, animated);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainSidePager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MainSidePager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
