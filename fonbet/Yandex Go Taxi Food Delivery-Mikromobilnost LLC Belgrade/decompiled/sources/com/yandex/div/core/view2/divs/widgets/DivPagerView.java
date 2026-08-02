package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.pager.e;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.dab1;
import defpackage.f1k;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.msk;
import defpackage.nsk;
import defpackage.q2k;
import defpackage.s2l;
import defpackage.sls;
import defpackage.t2l;
import defpackage.tls;
import defpackage.ty60;
import defpackage.u890;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e*\u0002\u0081\u0001\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0003¤\u0001pB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u0013J/\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J)\u00108\u001a\u0002072\u0006\u00101\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\"2\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002072\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bD\u0010CJ\u0019\u0010F\u001a\u0004\u0018\u00010\"2\u0006\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00010\"2\u0006\u00104\u001a\u00020\"H\u0012¢\u0006\u0004\bH\u0010IJ\u001f\u0010M\u001a\u0002072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH\u0012¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u0002072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH\u0012¢\u0006\u0004\bO\u0010NJ;\u0010T\u001a\u0002072\u0006\u0010Q\u001a\u00020P2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002070RH\u0012¢\u0006\u0004\bT\u0010UR.\u0010W\u001a\u0004\u0018\u00010:2\b\u0010V\u001a\u0004\u0018\u00010:8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010=R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020:0\\8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b]\u0010^R.\u0010_\u001a\u0004\u0018\u00010:2\b\u0010V\u001a\u0004\u0018\u00010:8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b_\u0010X\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010=R.\u0010c\u001a\u0004\u0018\u00010b2\b\u0010V\u001a\u0004\u0018\u00010b8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR.\u0010j\u001a\u0004\u0018\u00010i2\b\u0010V\u001a\u0004\u0018\u00010i8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00018RX\u0092\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0093\u0001\u001a\u0002078\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u0098\u0001\u001a\u0002078\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0094\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\\8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010\u009e\u0001\u001a\u0002072\u0006\u0010V\u001a\u0002078P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u0094\u0001\"\u0006\b\u009d\u0001\u0010\u0097\u0001R)\u0010£\u0001\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Lmsk;", "Lq2k;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "enableAccessibility", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Landroidx/viewpager2/widget/ViewPager2$a;", "callback", "addChangePageCallbackForIndicators", "(Landroidx/viewpager2/widget/ViewPager2$a;)V", "removeChangePageCallbackForIndicators", "clearChangePageCallbackForIndicators", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "index", "getPageView", "(I)Landroid/view/View;", "getWrapperFor", "(Landroid/view/View;)Landroid/view/View;", "", RemoteBioParameters.X, RemoteBioParameters.Y, "hasClickableChildAt", "(FF)Z", "hasLongClickableChildAt", "Landroid/view/ViewGroup;", "viewGroup", "Lkotlin/Function1;", "predicate", "findViewWithPropertyAt", "(Landroid/view/ViewGroup;IILtls;)Z", "value", "changePageCallbackForState", "Landroidx/viewpager2/widget/ViewPager2$a;", "getChangePageCallbackForState$div_release", "()Landroidx/viewpager2/widget/ViewPager2$a;", "setChangePageCallbackForState$div_release", "", "changePageCallbacksForIndicators", "Ljava/util/List;", "changePageCallbackForLogger", "getChangePageCallbackForLogger$div_release", "setChangePageCallbackForLogger$div_release", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "changePageCallbackForOffScreenPages", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "getChangePageCallbackForOffScreenPages$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "setChangePageCallbackForOffScreenPages$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;)V", "Lu890;", "pagerSelectedActionsDispatcher", "Lu890;", "getPagerSelectedActionsDispatcher$div_release", "()Lu890;", "setPagerSelectedActionsDispatcher$div_release", "(Lu890;)V", "Ls2l;", "pagerOnItemsCountChange", "Ls2l;", "getPagerOnItemsCountChange$div_release", "()Ls2l;", "setPagerOnItemsCountChange$div_release", "(Ls2l;)V", "Lty60;", "onInterceptTouchEventListener", "Lty60;", "getOnInterceptTouchEventListener", "()Lty60;", "setOnInterceptTouchEventListener", "(Lty60;)V", "Landroid/view/GestureDetector;", "parentClickGestureDetector", "Landroid/view/GestureDetector;", "t2l", "accessibilityDelegate$delegate", "Li3y;", "getAccessibilityDelegate", "()Lt2l;", "accessibilityDelegate", "Landroid/graphics/Rect;", "hitRect", "Landroid/graphics/Rect;", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Lq2k;", "setDiv", "(Lq2k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "getClipToPage$div_release", "setClipToPage$div_release", "clipToPage", "getCurrentItem$div_release", "()I", "setCurrentItem$div_release", "(I)V", "currentItem", "OffScreenPagesUpdateCallback", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivPagerView extends ViewPager2Wrapper implements msk {
    private final /* synthetic */ nsk $$delegate_0;

    /* renamed from: accessibilityDelegate$delegate, reason: from kotlin metadata */
    private final i3y accessibilityDelegate;
    private ViewPager2.a changePageCallbackForLogger;
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;
    private ViewPager2.a changePageCallbackForState;
    private final List<ViewPager2.a> changePageCallbacksForIndicators;
    private final Rect hitRect;
    private ty60 onInterceptTouchEventListener;
    private s2l pagerOnItemsCountChange;
    private u890 pagerSelectedActionsDispatcher;
    private final GestureDetector parentClickGestureDetector;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JY\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "Landroidx/viewpager2/widget/ViewPager2$a;", "Landroid/view/View$OnLayoutChangeListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.a implements View.OnLayoutChangeListener {
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        }
    }

    public DivPagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.parentClickGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$parentClickGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
                boolean hasLongClickableChildAt;
                boolean isLongClickable = DivPagerView.this.isLongClickable();
                DivPagerView divPagerView = DivPagerView.this;
                if (isLongClickable) {
                    divPagerView.performLongClick();
                    return;
                }
                hasLongClickableChildAt = divPagerView.hasLongClickableChildAt(e.getX(), e.getY());
                if (hasLongClickableChildAt) {
                    return;
                }
                com.yandex.div.core.view2.divs.a.C(DivPagerView.this);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                boolean hasClickableChildAt;
                boolean isClickable = DivPagerView.this.isClickable();
                DivPagerView divPagerView = DivPagerView.this;
                if (isClickable) {
                    return divPagerView.performClick();
                }
                hasClickableChildAt = divPagerView.hasClickableChildAt(e.getX(), e.getY());
                if (hasClickableChildAt) {
                    return false;
                }
                ViewGroup viewGroup = DivPagerView.this;
                do {
                    ViewParent parent = viewGroup.getParent();
                    viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup == null || viewGroup.getParent() == null) {
                        return false;
                    }
                } while (!viewGroup.performClick());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.accessibilityDelegate = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                RecyclerView recyclerView = DivPagerView.this.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new t2l(recyclerView, DivPagerView.this);
            }
        });
        this.hitRect = new Rect();
    }

    private boolean findViewWithPropertyAt(ViewGroup viewGroup, int x, int y, tls predicate) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            childAt.getHitRect(this.hitRect);
            if (this.hitRect.contains(x, y)) {
                if (((Boolean) predicate.invoke(childAt)).booleanValue()) {
                    return true;
                }
                if (childAt instanceof ViewGroup) {
                    Rect rect = this.hitRect;
                    if (findViewWithPropertyAt((ViewGroup) childAt, x - rect.left, y - rect.top, predicate)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private t2l getAccessibilityDelegate() {
        return (t2l) this.accessibilityDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrapperFor(View child) {
        while (!jl40.l(child, getRecyclerView())) {
            if (child instanceof DivViewWrapper) {
                return child;
            }
            Object parent = child.getParent();
            child = parent instanceof View ? (View) parent : null;
            if (child == null) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasClickableChildAt(float x, float y) {
        return findViewWithPropertyAt(this, (int) x, (int) y, DivPagerView$hasClickableChildAt$1.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasLongClickableChildAt(float x, float y) {
        return findViewWithPropertyAt(this, (int) x, (int) y, DivPagerView$hasLongClickableChildAt$1.b);
    }

    public void addChangePageCallbackForIndicators(ViewPager2.a callback) {
        this.changePageCallbacksForIndicators.add(callback);
        getViewPager().registerOnPageChangeCallback(callback);
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().unregisterOnPageChangeCallback((ViewPager2.a) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        this.parentClickGestureDetector.onTouchEvent(event);
        return super.dispatchTouchEvent(event);
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

    public void enableAccessibility() {
        RecyclerView recyclerView;
        t2l accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    /* renamed from: getChangePageCallbackForLogger$div_release, reason: from getter */
    public ViewPager2.a getChangePageCallbackForLogger() {
        return this.changePageCallbackForLogger;
    }

    /* renamed from: getChangePageCallbackForOffScreenPages$div_release, reason: from getter */
    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages() {
        return this.changePageCallbackForOffScreenPages;
    }

    /* renamed from: getChangePageCallbackForState$div_release, reason: from getter */
    public ViewPager2.a getChangePageCallbackForState() {
        return this.changePageCallbackForState;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Override // defpackage.msk
    public q2k getDiv() {
        return (q2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    public ty60 getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public View getPageView(int index) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    /* renamed from: getPagerOnItemsCountChange$div_release, reason: from getter */
    public s2l getPagerOnItemsCountChange() {
        return this.pagerOnItemsCountChange;
    }

    /* renamed from: getPagerSelectedActionsDispatcher$div_release, reason: from getter */
    public u890 getPagerSelectedActionsDispatcher() {
        return this.pagerSelectedActionsDispatcher;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
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
        ty60 onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            ((dab1) onInterceptTouchEventListener).n(this, event);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeChangePageCallbackForIndicators(ViewPager2.a callback) {
        this.changePageCallbacksForIndicators.remove(callback);
        getViewPager().unregisterOnPageChangeCallback(callback);
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    public void setChangePageCallbackForLogger$div_release(ViewPager2.a aVar) {
        ViewPager2.a aVar2 = this.changePageCallbackForLogger;
        if (aVar2 != null) {
            getViewPager().unregisterOnPageChangeCallback(aVar2);
        }
        if (aVar != null) {
            getViewPager().registerOnPageChangeCallback(aVar);
        }
        this.changePageCallbackForLogger = aVar;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().registerOnPageChangeCallback(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    public void setChangePageCallbackForState$div_release(ViewPager2.a aVar) {
        ViewPager2.a aVar2 = this.changePageCallbackForState;
        if (aVar2 != null) {
            getViewPager().unregisterOnPageChangeCallback(aVar2);
        }
        if (aVar != null) {
            getViewPager().registerOnPageChangeCallback(aVar);
        }
        this.changePageCallbackForState = aVar;
    }

    public void setClipToPage$div_release(boolean z) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z);
    }

    public void setCurrentItem$div_release(int i) {
        getViewPager().setCurrentItem(i, false);
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(ty60 ty60Var) {
        this.onInterceptTouchEventListener = ty60Var;
    }

    public void setPagerOnItemsCountChange$div_release(s2l s2lVar) {
        this.pagerOnItemsCountChange = s2lVar;
    }

    public void setPagerSelectedActionsDispatcher$div_release(u890 u890Var) {
        u890 u890Var2 = this.pagerSelectedActionsDispatcher;
        if (u890Var2 != null) {
            ViewPager2 viewPager = getViewPager();
            e eVar = u890Var2.d;
            if (eVar != null) {
                viewPager.unregisterOnPageChangeCallback(eVar);
            }
            u890Var2.d = null;
        }
        if (u890Var != null) {
            ViewPager2 viewPager2 = getViewPager();
            e eVar2 = new e(u890Var);
            viewPager2.registerOnPageChangeCallback(eVar2);
            u890Var.d = eVar2;
        }
        this.pagerSelectedActionsDispatcher = u890Var;
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
    public void setDiv(q2k q2kVar) {
        this.$$delegate_0.c = q2kVar;
    }

    public DivPagerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivPagerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
