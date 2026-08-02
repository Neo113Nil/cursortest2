package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGallery;
import defpackage.aw5;
import defpackage.b7l;
import defpackage.cxk;
import defpackage.dab1;
import defpackage.egk;
import defpackage.f1k;
import defpackage.h8;
import defpackage.i9l;
import defpackage.k2k;
import defpackage.m0i0;
import defpackage.m3k;
import defpackage.msk;
import defpackage.nsk;
import defpackage.ny61;
import defpackage.ssi0;
import defpackage.tls;
import defpackage.ty60;
import defpackage.w890;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\u0006\b\u0010\u0018\u0000 §\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002¨\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J*\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0014¢\u0006\u0004\b*\u0010\u001bJ\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u001bJ\u0017\u00108\u001a\u00020-2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b;\u00109J/\u0010@\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010I\u001a\u00020-2\u0006\u0010C\u001a\u00020B2\b\u0010F\u001a\u0004\u0018\u00010!2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J\u0019\u0010M\u001a\u0004\u0018\u00010!2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ+\u0010T\u001a\u00020-2\u0006\u0010O\u001a\u00020\t2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0PH\u0012¢\u0006\u0004\bT\u0010UJ+\u0010V\u001a\u00020-2\u0006\u0010O\u001a\u00020\t2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0PH\u0012¢\u0006\u0004\bV\u0010UJ\u001f\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010W2\u0006\u0010O\u001a\u00020\tH\u0012¢\u0006\u0004\bY\u0010ZJ'\u0010\\\u001a\u00020-*\u00020[2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0PH\u0012¢\u0006\u0004\b\\\u0010]J;\u0010a\u001a\u00020\t2\u0006\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0PH\u0012¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020-H\u0012¢\u0006\u0004\bc\u0010dJ\u0013\u0010f\u001a\u00020\t*\u00020eH\u0012¢\u0006\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010k\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bk\u0010iR*\u0010m\u001a\u00020e2\u0006\u0010l\u001a\u00020e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010t\u001a\u0004\u0018\u00010s8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0016@\u0016X\u0096\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020-8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010iR'\u0010\u008b\u0001\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u008b\u0001\u0010i\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0005\b\u008e\u0001\u00102R'\u0010\u008f\u0001\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010i\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001\"\u0005\b\u0091\u0001\u00102R(\u0010\u0092\u0001\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0089\u0001\u001a\u0005\b\u0093\u0001\u0010d\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R#\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\u009f\u0001\u001a\u00020-8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010dR \u0010¢\u0001\u001a\u00020-8\u0016@\u0016X\u0096\u000f¢\u0006\u000f\u001a\u0005\b \u0001\u0010d\"\u0006\b¡\u0001\u0010\u0095\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\r0£\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006©\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Lmsk;", "Lk2k;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "widthSpec", "heightSpec", "onMeasure", "velocityX", "velocityY", "", "fling", "(II)Z", ClidProvider.STATE, "onScrollStateChanged", "(I)V", "dx", "dy", "onScrolled", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "e", "onTouchEvent", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "release", "index", "getItemView", "(I)Landroid/view/View;", "spec", "Lkotlin/Function1;", "Legk;", "Lcom/yandex/div2/DivSize;", "size", "needConsiderMatchParent", "(ILtls;)Z", "needRecalculateMatchParent", "", "Lcxk;", "getItemsIfNeeded", "(I)Ljava/util/List;", "Lm3k;", "isMatchParent", "(Lm3k;Ltls;)Z", "isCrossAxis", "oldSpec", "paddings", "getMaxSizeSpec", "(ZIILtls;)I", "canScroll", "()Z", "", "toTouchPoint", "(F)I", "scrollPointerId", CA20Status.STATUS_USER_I, "pointTouchX", "pointTouchY", "value", "scrollInterceptionAngle", "F", "getScrollInterceptionAngle", "()F", "setScrollInterceptionAngle", "(F)V", "Lty60;", "onInterceptTouchEventListener", "Lty60;", "getOnInterceptTouchEventListener", "()Lty60;", "setOnInterceptTouchEventListener", "(Lty60;)V", "Lcom/yandex/div2/DivGallery$ScrollMode;", "scrollMode", "Lcom/yandex/div2/DivGallery$ScrollMode;", "getScrollMode", "()Lcom/yandex/div2/DivGallery$ScrollMode;", "setScrollMode", "(Lcom/yandex/div2/DivGallery$ScrollMode;)V", "Lw890;", "pagerSnapStartHelper", "Lw890;", "getPagerSnapStartHelper", "()Lw890;", "setPagerSnapStartHelper", "(Lw890;)V", "needFling", "Z", "beforeScrollFocusPosition", "widthMeasureSpec", "getWidthMeasureSpec", "()I", "setWidthMeasureSpec", "heightMeasureSpec", "getHeightMeasureSpec", "setHeightMeasureSpec", "considerMatchParent", "getConsiderMatchParent", "setConsiderMatchParent", "(Z)V", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Lk2k;", "setDiv", "(Lk2k;)V", "div", "isTransient", "getNeedClipping", "setNeedClipping", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Companion", "b7l", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements msk {
    public static final b7l Companion = new b7l();
    public static final float NOT_INTERCEPT = 0.0f;
    private static final double RIGHT_ANGLE = 90.0d;
    private final /* synthetic */ nsk $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean considerMatchParent;
    private int heightMeasureSpec;
    private boolean needFling;
    private ty60 onInterceptTouchEventListener;
    private w890 pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;
    private DivGallery.ScrollMode scrollMode;
    private int scrollPointerId;
    private int widthMeasureSpec;

    public DivRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, m0i0.Div_Gallery), attributeSet, i);
        this.$$delegate_0 = new nsk();
        this.scrollPointerId = -1;
        this.scrollMode = DivGallery.ScrollMode.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private List<cxk> getItemsIfNeeded(int spec) {
        if (View.MeasureSpec.getMode(spec) == 0) {
            RecyclerView.Adapter adapter = getAdapter();
            com.yandex.div.core.view2.divs.gallery.a aVar = adapter instanceof com.yandex.div.core.view2.divs.gallery.a ? (com.yandex.div.core.view2.divs.gallery.a) adapter : null;
            if (aVar != null) {
                ArrayList g = aVar.g();
                if (!g.isEmpty()) {
                    return g;
                }
            }
        }
        return null;
    }

    private int getMaxSizeSpec(boolean isCrossAxis, int oldSpec, int paddings, tls size) {
        if (!isCrossAxis) {
            return oldSpec;
        }
        h8 h8Var = new h8(3, this);
        if (!h8Var.hasNext()) {
            ny61.p();
            return 0;
        }
        int intValue = ((Number) size.invoke((View) h8Var.next())).intValue();
        while (h8Var.hasNext()) {
            int intValue2 = ((Number) size.invoke((View) h8Var.next())).intValue();
            if (intValue < intValue2) {
                intValue = intValue2;
            }
        }
        RecyclerView.e layoutManager = getLayoutManager();
        DivGridLayoutManager divGridLayoutManager = layoutManager instanceof DivGridLayoutManager ? (DivGridLayoutManager) layoutManager : null;
        if (divGridLayoutManager == null) {
            return View.MeasureSpec.makeMeasureSpec(intValue + paddings, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(divGridLayoutManager.c2() + (intValue * 2) + paddings, 1073741824);
    }

    private boolean isMatchParent(m3k m3kVar, tls tlsVar) {
        return tlsVar.invoke(m3kVar.d()) instanceof i9l;
    }

    private boolean needConsiderMatchParent(int spec, tls size) {
        List<cxk> itemsIfNeeded = getItemsIfNeeded(spec);
        if (itemsIfNeeded == null) {
            return false;
        }
        List<cxk> list = itemsIfNeeded;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!isMatchParent(((cxk) it.next()).a, size)) {
                return false;
            }
        }
        return true;
    }

    private boolean needRecalculateMatchParent(int spec, tls size) {
        List<cxk> itemsIfNeeded = getItemsIfNeeded(spec);
        if (itemsIfNeeded == null) {
            return false;
        }
        List<cxk> list = itemsIfNeeded;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (isMatchParent(((cxk) it.next()).a, size)) {
                return true;
            }
        }
        return false;
    }

    private int toTouchPoint(float f) {
        return (int) Math.ceil(f);
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        boolean fling = super.fling(velocityX, velocityY);
        if (getScrollMode() == DivGallery.ScrollMode.PAGING) {
            this.needFling = !fling;
        }
        return fling;
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    public boolean getConsiderMatchParent() {
        return this.considerMatchParent;
    }

    @Override // defpackage.msk
    public k2k getDiv() {
        return (k2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    public int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    public View getItemView(int index) {
        View childAt = getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    public ty60 getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public w890 getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    public DivGallery.ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    public int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int findPointerIndex;
        ty60 onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            ((dab1) onInterceptTouchEventListener).n(this, event);
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            this.scrollPointerId = event.getPointerId(0);
            this.pointTouchX = toTouchPoint(event.getX());
            this.pointTouchY = toTouchPoint(event.getY());
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(event);
            }
            this.scrollPointerId = event.getPointerId(actionIndex);
            this.pointTouchX = toTouchPoint(event.getX(actionIndex));
            this.pointTouchY = toTouchPoint(event.getY(actionIndex));
            return super.onInterceptTouchEvent(event);
        }
        RecyclerView.e layoutManager = getLayoutManager();
        if (layoutManager != null && (findPointerIndex = event.findPointerIndex(this.scrollPointerId)) >= 0) {
            int touchPoint = toTouchPoint(event.getX(findPointerIndex));
            int touchPoint2 = toTouchPoint(event.getY(findPointerIndex));
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(event);
            }
            int abs = Math.abs(touchPoint - this.pointTouchX);
            int abs2 = Math.abs(touchPoint2 - this.pointTouchY);
            if (abs != 0 || abs2 != 0) {
                double atan = abs != 0 ? (Math.atan(abs2 / abs) * 180.0d) / 3.141592653589793d : RIGHT_ANGLE;
                if ((layoutManager.I() && atan <= getScrollInterceptionAngle()) || (layoutManager.J() && atan > getScrollInterceptionAngle())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        m3k div;
        setWidthMeasureSpec(widthSpec);
        setHeightMeasureSpec(heightSpec);
        RecyclerView.e layoutManager = getLayoutManager();
        final int i = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).J : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).N : 0;
        setConsiderMatchParent(i == 0 ? needConsiderMatchParent(getHeightMeasureSpec(), DivRecyclerView$onMeasure$1.w) : needConsiderMatchParent(getWidthMeasureSpec(), DivRecyclerView$onMeasure$2.w));
        super.onMeasure(widthSpec, heightSpec);
        if (!(i == 0 ? needRecalculateMatchParent(getHeightMeasureSpec(), DivRecyclerView$onMeasure$needRecalculateMatchParent$1.w) : needRecalculateMatchParent(getWidthMeasureSpec(), DivRecyclerView$onMeasure$needRecalculateMatchParent$2.w))) {
            return;
        }
        setConsiderMatchParent(false);
        setWidthMeasureSpec(getMaxSizeSpec(i == 1, widthSpec, getPaddingRight() + getPaddingLeft(), DivRecyclerView$onMeasure$3.w));
        setHeightMeasureSpec(getMaxSizeSpec(i == 0, heightSpec, getPaddingBottom() + getPaddingTop(), DivRecyclerView$onMeasure$4.w));
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            }
            msk s = com.yandex.div.core.view2.divs.a.s(childAt);
            if (s != null && (div = s.getDiv()) != null && isMatchParent(div, new tls() { // from class: com.yandex.div.core.view2.divs.widgets.DivRecyclerView$onMeasure$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    egk egkVar = (egk) obj;
                    return i == 0 ? egkVar.getHeight() : egkVar.getWidth();
                }
            })) {
                childAt.measure(getWidthMeasureSpec(), getHeightMeasureSpec());
            }
            i2 = i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        if (state == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        if (r4 > 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(int dx, int dy) {
        int i;
        int i2;
        DivViewWrapper divViewWrapper;
        View child;
        if (this.beforeScrollFocusPosition == -1) {
            return;
        }
        RecyclerView.e layoutManager = getLayoutManager();
        int i3 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).J : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).N : 0;
        if (i3 != 1 || dy <= 0) {
            if (i3 != 1 || dy > 0) {
                i = this.beforeScrollFocusPosition;
            } else {
                i = this.beforeScrollFocusPosition;
            }
            i2 = i - 1;
            x0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i2);
            KeyEvent.Callback callback = findViewHolderForAdapterPosition == null ? findViewHolderForAdapterPosition.a : null;
            divViewWrapper = callback instanceof DivViewWrapper ? (DivViewWrapper) callback : null;
            if (divViewWrapper != null && (child = divViewWrapper.getChild()) != null) {
                child.requestFocus();
            }
            super.onScrolled(dx, dy);
        }
        i = this.beforeScrollFocusPosition;
        i2 = i + 1;
        x0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
        if (findViewHolderForAdapterPosition2 == null) {
        }
        if (callback instanceof DivViewWrapper) {
        }
        if (divViewWrapper != null) {
            child.requestFocus();
        }
        super.onScrolled(dx, dy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        RecyclerView.e layoutManager;
        w890 pagerSnapStartHelper;
        View e2;
        int[] c;
        int i;
        DivGallery.ScrollMode scrollMode = getScrollMode();
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
        if (scrollMode == scrollMode2) {
            this.needFling = true;
        }
        boolean z = super.onTouchEvent(e) && canScroll();
        if (e != null && e.getActionMasked() == 1 && getScrollMode() == scrollMode2 && this.needFling && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (e2 = pagerSnapStartHelper.e(layoutManager)) != null && ((i = (c = pagerSnapStartHelper.c(layoutManager, e2))[0]) != 0 || c[1] != 0)) {
            smoothScrollBy(i, c[1]);
        }
        return z;
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof ssi0) {
            ((ssi0) adapter).release();
        }
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    public void setConsiderMatchParent(boolean z) {
        this.considerMatchParent = z;
    }

    public void setHeightMeasureSpec(int i) {
        this.heightMeasureSpec = i;
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(ty60 ty60Var) {
        this.onInterceptTouchEventListener = ty60Var;
    }

    public void setPagerSnapStartHelper(w890 w890Var) {
        this.pagerSnapStartHelper = w890Var;
    }

    public void setScrollInterceptionAngle(float f) {
        this.scrollInterceptionAngle = f != 0.0f ? Math.abs(f) % 90.0f : 0.0f;
    }

    public void setScrollMode(DivGallery.ScrollMode scrollMode) {
        this.scrollMode = scrollMode;
    }

    public void setWidthMeasureSpec(int i) {
        this.widthMeasureSpec = i;
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
    public void setDiv(k2k k2kVar) {
        this.$$delegate_0.c = k2kVar;
    }

    public DivRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
