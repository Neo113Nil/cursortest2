package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.AttachmentWithMedia;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: HorizontalGalleryDSView.kt */
/* loaded from: classes18.dex */
public final class qdv<T, VH extends RecyclerView.e0> extends ViewGroup {
    public final VkContentBadge b;
    public final RecyclerView c;
    public final c d;
    public final androidx.recyclerview.widget.g0 e;
    public ai5 f;
    public zoj0<T, VH> g;
    public int h;
    public int i;
    public int j;
    public float k;
    public int l;
    public View m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Integer q;
    public final GestureDetector r;
    public final GestureDetector s;
    public e t;
    public f u;
    public g v;
    public final Rect w;
    public final Rect x;

    /* compiled from: HorizontalGalleryDSView.kt */
    public static final class a extends RecyclerView.n {
        public sni b;

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            this.b.b(0, rect);
        }
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public static final class d extends ViewGroup.LayoutParams {
        public int a;

        public d(int i, int i2) {
            super(i, i2);
            this.a = 8388659;
        }
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public interface e {
        void C0(int i);
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public interface f {
        void A(int i);

        void l(int i);
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public interface g {
        void N(ImageViewer.c<AttachmentWithMedia> cVar);
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public final class h extends RecyclerView.t {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            f fVar;
            super.onScrollStateChanged(recyclerView, i);
            qdv<T, VH> qdvVar = qdv.this;
            int b = qdvVar.b(qdvVar.e);
            if (i != 0 || b == -1 || (fVar = qdvVar.u) == null) {
                return;
            }
            fVar.l(b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            qdv<T, VH> qdvVar = qdv.this;
            int b = qdvVar.b(qdvVar.e);
            if (qdvVar.l == b || b == -1) {
                return;
            }
            qdvVar.d(b);
            f fVar = qdvVar.u;
            if (fVar != null) {
                fVar.A(b);
            }
        }
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public static final class i extends GestureDetector.SimpleOnGestureListener {
        public final int b;

        public i(Context context) {
            this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float abs = Math.abs(f2);
            return abs > Math.abs(f) && abs > ((float) this.b);
        }
    }

    public qdv(Context context) {
        super(context, null, 0);
        VkContentBadge vkContentBadge = new VkContentBadge(context, null, 6);
        this.b = vkContentBadge;
        RecyclerView recyclerView = new RecyclerView(context);
        this.c = recyclerView;
        c cVar = new c(context);
        this.d = cVar;
        androidx.recyclerview.widget.g0 g0Var = new androidx.recyclerview.widget.g0();
        this.e = g0Var;
        this.j = Integer.MAX_VALUE;
        this.k = 1.0f;
        this.l = -1;
        this.n = true;
        this.p = true;
        this.r = new GestureDetector(context, new b());
        this.s = new GestureDetector(context, new i(context));
        this.w = new Rect();
        this.x = new Rect();
        vkContentBadge.setId(R.id.gallery_label);
        vkContentBadge.setVisibility(!c() ? 0 : 8);
        vkContentBadge.setSize(VkContentBadge.Size.Large);
        vkContentBadge.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
        vkContentBadge.setCapsule(true);
        recyclerView.setId(R.id.carousel);
        recyclerView.setLayoutManager(cVar);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        sni sniVar = new sni(18);
        a aVar = new a();
        aVar.b = sniVar;
        recyclerView.addItemDecoration(aVar);
        recyclerView.addOnScrollListener(new h());
        recyclerView.setNestedScrollingEnabled(false);
        g0Var.attachToRecyclerView(recyclerView);
        addView(recyclerView, new d(-1, -1));
        addView(vkContentBadge);
    }

    private final int getAdapterItemsCount() {
        zoj0<T, VH> zoj0Var = this.g;
        if (zoj0Var != null) {
            return zoj0Var.getItemCount();
        }
        return 0;
    }

    private final int getItemCount() {
        Integer num = this.q;
        return num != null ? num.intValue() : getAdapterItemsCount();
    }

    public final void a() {
        boolean c2 = c();
        this.b.setVisibility((!this.n || c2) ? 8 : 0);
        RecyclerView recyclerView = !c2 ? this.c : null;
        androidx.recyclerview.widget.g0 g0Var = this.e;
        if (recyclerView == null) {
            g0Var.attachToRecyclerView(null);
        } else {
            post(new k0(5, g0Var, recyclerView));
        }
    }

    public final int b(androidx.recyclerview.widget.g0 g0Var) {
        boolean c2 = c();
        c cVar = this.d;
        if (c2) {
            int w = cVar.w();
            if (w != getItemCount() - 1) {
                w = cVar.s();
            }
            if (w != -1) {
                return w;
            }
        }
        View findSnapView = g0Var.findSnapView(cVar);
        if (findSnapView == null) {
            return -1;
        }
        return cVar.getPosition(findSnapView);
    }

    public final boolean c() {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public final void d(int i2) {
        g gVar;
        this.l = i2;
        int itemCount = getItemCount();
        VkContentBadge vkContentBadge = this.b;
        if (itemCount != 0) {
            vkContentBadge.animate().cancel();
            vkContentBadge.setAlpha(1.0f);
            vkContentBadge.setText(getContext().getString(R.string.feed_gallery_counter_light, Integer.valueOf((i2 % itemCount) + 1), Integer.valueOf(itemCount)));
        }
        if (this.o) {
            vkContentBadge.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(120L).setStartDelay(4000L).start();
        }
        View findSnapView = this.e.findSnapView(this.d);
        View view = this.m;
        if (view != findSnapView) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    viewGroup.getChildAt(i3).setActivated(false);
                }
            }
            ViewGroup viewGroup2 = findSnapView instanceof ViewGroup ? (ViewGroup) findSnapView : null;
            if (viewGroup2 != null) {
                int childCount2 = viewGroup2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    viewGroup2.getChildAt(i4).setActivated(true);
                }
            }
            View view2 = this.m;
            if (view2 != null) {
                view2.setTag(R.id.carousel_active_item_tag, Boolean.FALSE);
            }
            if (findSnapView != null) {
                findSnapView.setTag(R.id.carousel_active_item_tag, Boolean.TRUE);
            }
            this.m = findSnapView;
        }
        e eVar = this.t;
        if (eVar != null) {
            eVar.C0(i2);
        }
        if (i2 < getAdapterItemsCount() - 2 || (gVar = this.v) == null) {
            return;
        }
        gVar.N(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int childAdapterPosition;
        int[] calculateDistanceToFinalSnap;
        if (c() || !this.r.onTouchEvent(motionEvent)) {
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            RecyclerView recyclerView = this.c;
            View findChildViewUnder = recyclerView.findChildViewUnder(x, y);
            androidx.recyclerview.widget.g0 g0Var = this.e;
            z = (findChildViewUnder == null || findChildViewUnder == g0Var.findSnapView(recyclerView.getLayoutManager())) ? false : true;
            if (z && findChildViewUnder != null) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.dispatchTouchEvent(obtain);
                obtain.recycle();
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(findChildViewUnder)) != -1 && childAdapterPosition != b(g0Var) && (calculateDistanceToFinalSnap = g0Var.calculateDistanceToFinalSnap(layoutManager, findChildViewUnder)) != null) {
                    int i2 = calculateDistanceToFinalSnap[0];
                    int i3 = calculateDistanceToFinalSnap[1];
                    if (i2 != 0 || i3 != 0) {
                        recyclerView.smoothScrollBy(i2, i3);
                    }
                }
            }
        }
        return z || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        d dVar = new d(getContext(), attributeSet);
        dVar.a = 8388659;
        return dVar;
    }

    public final zoj0<T, VH> getAdapter() {
        return this.g;
    }

    public final RecyclerView getRecyclerView() {
        return this.c;
    }

    public final int getSnapPosition() {
        return b(this.e);
    }

    public final Integer getTotalCount() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.b.animate().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        boolean onTouchEvent = this.s.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!onTouchEvent);
        }
        if (!onTouchEvent) {
            setShouldHideLabel(true);
            if (!onInterceptTouchEvent && !c()) {
                return motionEvent.getActionMasked() == 1 && !this.r.onTouchEvent(motionEvent);
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i4 - i2) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i5 - i3) - getPaddingBottom();
        int layoutDirection = getLayoutDirection();
        RecyclerView recyclerView = this.c;
        recyclerView.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
        Rect rect = this.w;
        rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        VkContentBadge vkContentBadge = this.b;
        if (vkContentBadge.getVisibility() != 8) {
            int measuredWidth = vkContentBadge.getMeasuredWidth();
            int measuredHeight = vkContentBadge.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = vkContentBadge.getLayoutParams();
            d dVar = layoutParams instanceof d ? (d) layoutParams : null;
            int i6 = dVar != null ? dVar.a : 8388659;
            rect.top += this.i;
            rect.left = recyclerView.getPaddingLeft() + this.h + rect.left;
            rect.right -= recyclerView.getPaddingRight() + this.h;
            Rect rect2 = this.w;
            rect2.bottom -= this.i;
            Gravity.apply(i6, measuredWidth, measuredHeight, rect2, this.x, layoutDirection);
            Rect rect3 = this.x;
            vkContentBadge.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int a2 = gp10.a(i2, getSuggestedMinimumWidth(), View.MeasureSpec.getSize(i2), getPaddingRight() + getPaddingLeft());
        int i4 = this.j;
        RecyclerView recyclerView = this.c;
        int min = (int) ((Math.min(i4, (a2 - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) * 1.0f) + 0.5f);
        int size = View.MeasureSpec.getSize(i2);
        int i5 = (int) ((min / this.k) + 0.5f);
        this.d.s = min;
        recyclerView.measure(tr.a(size, 1073741823, 0, 1073741824), tr.a(i5, 1073741823, 0, 1073741824));
        VkContentBadge vkContentBadge = this.b;
        if (vkContentBadge.getVisibility() != 8) {
            vkContentBadge.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(size - this.h, 1073741823)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(i5 - this.i, 1073741823)), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, i5);
    }

    public final void setAdapter(zoj0<T, VH> zoj0Var) {
        this.g = zoj0Var;
        this.c.setAdapter(zoj0Var);
    }

    public final void setAutoPlayProvider(ai5 ai5Var) {
        this.f = ai5Var;
    }

    public final void setCanHideLabel(boolean z) {
        this.p = z;
    }

    public final void setCurrentItem(int i2) {
        int min;
        if (i2 < 0 || i2 >= getAdapterItemsCount()) {
            return;
        }
        RecyclerView recyclerView = this.c;
        recyclerView.stopScroll();
        int width = recyclerView.getWidth();
        if (width == 0) {
            min = 0;
        } else {
            int paddingRight = width - (recyclerView.getPaddingRight() + recyclerView.getPaddingLeft());
            min = (paddingRight - Math.min(this.j, paddingRight)) / 2;
        }
        this.d.K(i2, min);
        d(i2);
    }

    public final void setLabelGravity(int i2) {
        VkContentBadge vkContentBadge = this.b;
        ViewGroup.LayoutParams layoutParams = vkContentBadge.getLayoutParams();
        d dVar = layoutParams instanceof d ? (d) layoutParams : null;
        if (dVar == null || dVar.a == i2) {
            return;
        }
        dVar.a = i2;
        vkContentBadge.requestLayout();
    }

    public final void setLabelMarginEnd(int i2) {
        if (this.h != i2) {
            this.h = i2;
            requestLayout();
        }
    }

    public final void setLabelMarginTop(int i2) {
        if (this.i != i2) {
            this.i = i2;
            requestLayout();
        }
    }

    public final void setLabelVisible(boolean z) {
        this.n = z;
        this.b.setVisibility(z && !c() ? 0 : 8);
    }

    public final void setMaxHeight(int i2) {
        if (this.j != i2) {
            this.j = i2;
            requestLayout();
            invalidate();
        }
    }

    public final void setOnPageChangedListener(e eVar) {
        this.t = eVar;
    }

    public final void setOnScrollStateChangeListener(f fVar) {
        this.u = fVar;
    }

    public final void setPaginationDelegate(g gVar) {
        this.v = gVar;
    }

    public final void setPrefetchMediaEnabled(boolean z) {
        c cVar = this.d;
        boolean z2 = cVar.t;
        cVar.t = z;
        if (z != z2) {
            this.c.requestLayout();
        }
    }

    public final void setRatio(float f2) {
        if (this.k == f2) {
            return;
        }
        this.k = f2;
        requestLayout();
    }

    public final void setShouldHideLabel(boolean z) {
        this.o = z && this.p;
    }

    public final void setTotalCount(Integer num) {
        this.q = num;
    }

    public final void setViewPool(RecyclerView.u uVar) {
        this.c.setRecycledViewPool(uVar);
    }

    /* compiled from: HorizontalGalleryDSView.kt */
    public static final class c extends LinearLayoutManager {
        public final Rect r;
        public int s;
        public boolean t;

        public c(Context context) {
            super(0, false);
            this.r = new Rect();
        }

        public static boolean P(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean checkLayoutParams(RecyclerView.p pVar) {
            return pVar != null && ((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateDefaultLayoutParams() {
            RecyclerView.p generateDefaultLayoutParams = super.generateDefaultLayoutParams();
            ((ViewGroup.MarginLayoutParams) generateDefaultLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateDefaultLayoutParams).height = -1;
            return generateDefaultLayoutParams;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
            RecyclerView.p generateLayoutParams = super.generateLayoutParams(context, attributeSet);
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = -1;
            return generateLayoutParams;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void measureChildWithMargins(View view, int i, int i2) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            calculateItemDecorationsForChild(view, this.r);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.s, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
            if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && P(view.getWidth(), makeMeasureSpec, ((ViewGroup.MarginLayoutParams) pVar).width) && P(view.getHeight(), makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return;
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(RecyclerView.a0 a0Var, int[] iArr) {
            super.o(a0Var, iArr);
            iArr[1] = iArr[1] + (this.t ? iah0.f().widthPixels : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.v vVar, RecyclerView.a0 a0Var, am amVar) {
            super.onInitializeAccessibilityNodeInfo(vVar, a0Var, amVar);
            boolean z = true;
            boolean z2 = x() < getItemCount() - 1;
            boolean z3 = v() > 0;
            if (!z2) {
                amVar.i(am.a.i);
            }
            if (!z3) {
                amVar.i(am.a.j);
            }
            if (!z2 && !z3) {
                z = false;
            }
            amVar.y(z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            RecyclerView.p generateLayoutParams = super.generateLayoutParams(layoutParams);
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = -1;
            return generateLayoutParams;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.a = 8388659;
            dVar2.a = dVar.a;
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.a = 8388659;
        return dVar3;
    }
}
