package com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.eq6;
import defpackage.jl40;
import defpackage.n4h0;
import defpackage.nsz;
import defpackage.ock0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wug0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010%R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/companion_buffer_serch/BufferSearchAnimationItemView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateCursorState", "()V", "cursorIndex", "updateCursorPosition", "(Ljava/lang/Integer;)V", "renderCompletedState", "renderLoadingState", "Lock0;", "uiState", "renderAnimationProgressState", "(Lock0;)V", "updateNodesPointsBackground", "position", "", "isValidCursorPosition", "(Ljava/lang/Integer;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "render", "onDetachedFromWindow", "nodeSize", CA20Status.STATUS_USER_I, "transitionPointSize", "cursorViewSize", "", "Lcom/yandex/go/design/view/GoImageView;", "nodeViews", "Ljava/util/List;", "transitionPointViews", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "cursorView", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "currentState", "Lock0;", "Landroid/view/ViewPropertyAnimator;", "cursorTransitionAnimator", "Landroid/view/ViewPropertyAnimator;", "oldCursorIndex", "", "cursorViewsDistance", "F", "Companion", "eq6", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BufferSearchAnimationItemView extends GoFrameLayout {
    public static final int $stable = 8;
    private static final long CURSOR_TRANSITION_DURATION = 600;
    private static final eq6 Companion = new eq6();
    private static final int DEFAULT_NODES_AMOUNT = 3;
    private static final int DEFAULT_TRANSITION_POINTS_AMOUNT = 6;
    private ock0 currentState;
    private ViewPropertyAnimator cursorTransitionAnimator;
    private final ShimmeringFrameLayout cursorView;
    private final int cursorViewSize;
    private float cursorViewsDistance;
    private final LottieAnimationView lottieView;
    private final int nodeSize;
    private final List<GoImageView> nodeViews;
    private int oldCursorIndex;
    private final int transitionPointSize;
    private final List<List<GoImageView>> transitionPointViews;

    public BufferSearchAnimationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.nodeSize = tje.r(wug0.companion_buffer_search_node_size, getContext());
        this.transitionPointSize = tje.r(wug0.companion_buffer_search_transition_point_size, getContext());
        this.cursorViewSize = tje.r(wug0.companion_buffer_search_cursor_size, getContext());
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
            int i3 = this.nodeSize;
            goImageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
            goImageView.setBackgroundResource(n4h0.companion_buffer_search_node_bg);
            arrayList.add(goImageView);
        }
        this.nodeViews = arrayList;
        ArrayList arrayList2 = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            ArrayList arrayList3 = new ArrayList(6);
            for (int i5 = 0; i5 < 6; i5++) {
                GoImageView goImageView2 = new GoImageView(context, null, 0, 6, null);
                int i6 = this.transitionPointSize;
                goImageView2.setLayoutParams(new FrameLayout.LayoutParams(i6, i6));
                goImageView2.setBackgroundResource(n4h0.companion_buffer_search_transition_point_bg);
                arrayList3.add(goImageView2);
            }
            arrayList2.add(arrayList3);
        }
        this.transitionPointViews = arrayList2;
        ShimmeringFrameLayout shimmeringFrameLayout = new ShimmeringFrameLayout(context, null, 0, 6, null);
        int i7 = this.cursorViewSize;
        shimmeringFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        shimmeringFrameLayout.setShimmeringCornerRadius(tje.r(wug0.companion_buffer_search_cursor_corner_radius, shimmeringFrameLayout.getContext()));
        this.cursorView = shimmeringFrameLayout;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        int i8 = this.cursorViewSize;
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(i8, i8));
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.lottieView = lottieAnimationView;
        Iterator<T> it = this.nodeViews.iterator();
        while (it.hasNext()) {
            addView((View) it.next());
        }
        Iterator it2 = tcc.o(this.transitionPointViews).iterator();
        while (it2.hasNext()) {
            addView((View) it2.next());
        }
        addView(this.cursorView);
        this.cursorView.addView(this.lottieView);
    }

    private final boolean isValidCursorPosition(Integer position) {
        return position != null && y6i0.n(0, 3).g(position.intValue());
    }

    private final void renderAnimationProgressState(ock0 uiState) {
        this.cursorView.setBackgroundResource(n4h0.companion_buffer_search_cursor_bg);
        this.cursorView.setShimmering(false);
        nsz nszVar = uiState.c;
        if (nszVar != null) {
            this.lottieView.setComposition(nszVar);
            this.lottieView.playAnimation();
        }
    }

    private final void renderCompletedState() {
        this.lottieView.cancelAnimation();
        Iterator<T> it = this.nodeViews.iterator();
        while (it.hasNext()) {
            ((GoImageView) it.next()).setBackgroundResource(n4h0.companion_buffer_search_node_done_bg);
        }
        Iterator it2 = tcc.o(this.transitionPointViews).iterator();
        while (it2.hasNext()) {
            ((GoImageView) it2.next()).setBackgroundResource(n4h0.companion_buffer_search_transition_point_done_bg);
        }
    }

    private final void renderLoadingState() {
        this.lottieView.cancelAnimation();
        this.cursorView.setBackgroundResource(n4h0.companion_buffer_search_cursor_loading_bg);
        this.cursorView.setShimmering(true);
    }

    private final void updateCursorPosition(Integer cursorIndex) {
        int intValue = cursorIndex != null ? cursorIndex.intValue() : 0;
        boolean z = this.oldCursorIndex == intValue;
        if (this.cursorView.getVisibility() == 0 && isValidCursorPosition(Integer.valueOf(intValue)) && !z) {
            this.oldCursorIndex = intValue;
            boolean n = xw31.n(getContext());
            float f = this.cursorViewsDistance;
            if (n) {
                intValue = 2 - intValue;
            }
            float f2 = f * intValue;
            ViewPropertyAnimator viewPropertyAnimator = this.cursorTransitionAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.cursorTransitionAnimator = this.cursorView.animate().x(f2).setDuration(600L).setInterpolator(new FastOutSlowInInterpolator()).setUpdateListener(new yi(6, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r2.a == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCursorState() {
        boolean z;
        ock0 ock0Var = this.currentState;
        boolean isValidCursorPosition = isValidCursorPosition(ock0Var != null ? Integer.valueOf(ock0Var.e) : null);
        ock0 ock0Var2 = this.currentState;
        if (ock0Var2 != null) {
            z = true;
        }
        z = false;
        if (this.cursorView.getVisibility() == 0 && (!isValidCursorPosition || z)) {
            this.cursorView.setVisibility(8);
            this.oldCursorIndex = -1;
            return;
        }
        if (this.cursorView.getVisibility() != 0 && isValidCursorPosition && !z) {
            this.cursorView.setVisibility(0);
        }
        ock0 ock0Var3 = this.currentState;
        updateCursorPosition(ock0Var3 != null ? Integer.valueOf(ock0Var3.e) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNodesPointsBackground() {
        float x = this.cursorView.getX() + (this.cursorView.getWidth() / 2);
        for (GoImageView goImageView : this.nodeViews) {
            float x2 = goImageView.getX() + (goImageView.getWidth() / 2);
            if (xw31.n(getContext())) {
                if (x2 > x) {
                    goImageView.setBackgroundResource(n4h0.companion_buffer_search_node_done_bg);
                } else {
                    goImageView.setBackgroundResource(n4h0.companion_buffer_search_node_bg);
                }
            } else if (x2 < x) {
                goImageView.setBackgroundResource(n4h0.companion_buffer_search_node_done_bg);
            } else {
                goImageView.setBackgroundResource(n4h0.companion_buffer_search_node_bg);
            }
        }
        Iterator it = tcc.o(this.transitionPointViews).iterator();
        while (it.hasNext()) {
            GoImageView goImageView2 = (GoImageView) it.next();
            float x3 = goImageView2.getX() + (goImageView2.getWidth() / 2);
            if (xw31.n(getContext())) {
                if (x3 > x) {
                    goImageView2.setBackgroundResource(n4h0.companion_buffer_search_transition_point_done_bg);
                } else {
                    goImageView2.setBackgroundResource(n4h0.companion_buffer_search_transition_point_bg);
                }
            } else if (x3 < x) {
                goImageView2.setBackgroundResource(n4h0.companion_buffer_search_transition_point_done_bg);
            } else {
                goImageView2.setBackgroundResource(n4h0.companion_buffer_search_transition_point_bg);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.cursorTransitionAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener(null);
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.cursorTransitionAnimator;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int i = this.cursorViewSize;
        float f = ((right - left) - i) / 2.0f;
        this.cursorViewsDistance = f;
        float f2 = (i - this.nodeSize) / 2.0f;
        float f3 = (f - i) / 7.0f;
        float f4 = (i / 2.0f) - (this.transitionPointSize / 2.0f);
        int i2 = 0;
        for (Object obj : this.nodeViews) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            GoImageView goImageView = (GoImageView) obj;
            float f5 = this.cursorViewsDistance * i2;
            goImageView.setX(f5 + f2);
            goImageView.setY(f2);
            if (i2 < scc.f(this.nodeViews)) {
                float f6 = f5 + this.cursorViewSize;
                List list = (List) a.S(i2, this.transitionPointViews);
                if (list != null) {
                    int i4 = 0;
                    for (Object obj2 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw null;
                        }
                        GoImageView goImageView2 = (GoImageView) obj2;
                        goImageView2.setX(((i5 * f3) + f6) - (this.transitionPointSize / 2.0f));
                        goImageView2.setY(f4);
                        i4 = i5;
                    }
                } else {
                    continue;
                }
            }
            i2 = i3;
        }
        updateCursorState();
    }

    public final void render(ock0 uiState) {
        if (jl40.l(uiState, this.currentState)) {
            return;
        }
        if (uiState.a) {
            renderCompletedState();
        } else if (uiState.b) {
            renderLoadingState();
        } else if (uiState.c != null) {
            renderAnimationProgressState(uiState);
        }
        this.currentState = uiState;
        if (this.cursorViewsDistance > 0.0f) {
            updateCursorState();
        }
    }

    public BufferSearchAnimationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BufferSearchAnimationItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BufferSearchAnimationItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
