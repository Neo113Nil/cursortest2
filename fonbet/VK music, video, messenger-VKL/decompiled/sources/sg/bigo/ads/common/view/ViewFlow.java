package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.an.p;
import xsna.uq;

/* loaded from: classes9.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {
    private static final Interpolator s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private float A;
    private float B;
    private int C;
    private VelocityTracker D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final Runnable J;
    private int K;
    private boolean L;
    private boolean M;
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected View e;
    protected View f;
    public boolean g;
    public boolean h;
    protected int i;
    protected int j;
    private final a k;
    private int l;
    private int m;
    private int n;
    private d o;
    private d p;
    private p q;
    private boolean r;
    private Scroller t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private float y;
    private float z;

    public static class a implements c {
        c a;
        int b;
        private final ViewFlow c;

        private a(ViewFlow viewFlow) {
            this.b = 0;
            this.c = viewFlow;
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i2 = aVar.b;
                    int i3 = i;
                    if (i2 == i3) {
                        return;
                    }
                    aVar.b = i3;
                    c cVar = aVar.a;
                    if (cVar != null) {
                        cVar.a(i3);
                    }
                }
            });
        }

        public /* synthetic */ a(ViewFlow viewFlow, byte b) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i, final int i2) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.a;
                    if (cVar != null) {
                        cVar.a(i, i2);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.a;
                    if (cVar != null) {
                        cVar.a(view, i);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i, final float f) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.a;
                    if (cVar != null) {
                        cVar.a(view, i, f);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {
        public int a;
        public int b;
        public boolean c;
        public int d;
        public int e;

        public b() {
            this((byte) 0);
        }

        private b(byte b) {
            super(-1, -1);
            this.e = 17;
        }
    }

    public interface c {
        void a(int i);

        void a(int i, int i2);

        void a(@NonNull View view, int i);

        void a(@NonNull View view, int i, float f);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    private static float b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void c(int i) {
        a(i, true, -20);
    }

    private boolean f() {
        int i = this.c;
        return i == 2 || i == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.n - getMeasuredWidth());
    }

    private void h() {
        this.h = false;
        this.v = true;
    }

    private void i() {
        this.v = false;
        this.w = false;
        this.h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == view) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f) {
                i = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.e) {
                i++;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.u = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.as.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }

    public final boolean e() {
        int i = this.n;
        View view = this.e;
        if (view != null) {
            i -= view.getRight();
        }
        View view2 = this.f;
        if (view2 != null) {
            i -= view2.getMeasuredWidth();
        }
        return getWidth() >= i;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.d;
    }

    public int getCurrentItem() {
        return this.a;
    }

    public int getItemCount() {
        return this.b;
    }

    @NonNull
    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.e && childAt != this.f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.k.a;
    }

    public int getViewStyle() {
        return this.c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.J);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.v) {
                return true;
            }
            if (this.w) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.A = x;
            this.y = x;
            float y = motionEvent.getY();
            this.B = y;
            this.z = y;
            this.C = motionEvent.getPointerId(0);
            this.w = false;
            this.u = true;
            this.t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.t.getFinalX() - this.t.getCurrX()) <= this.H) {
                a(false);
                this.v = false;
            } else {
                this.t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.C;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.y;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.B);
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f2 = this.y;
                    if ((f2 >= this.j || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((f2 <= getWidth() - this.j || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && getWidth() < this.n)) {
                        this.y = x2;
                        this.z = y2;
                        this.w = true;
                        return false;
                    }
                }
                int i2 = this.x;
                if (abs > i2 && abs * 0.5f > abs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f3 = this.A;
                    float f4 = this.x;
                    this.y = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f3 + f4 : f3 - f4;
                    this.z = y2;
                } else if (abs2 > i2) {
                    this.w = true;
                }
                if (this.v) {
                    a(x2);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float measuredWidth;
        int max;
        float f3;
        float max2;
        this.k.a(this.b);
        this.n = 0;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        float abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i3 - i);
        View view = this.e;
        if (view != null) {
            if (view != null) {
                float measuredHeight = (abs - view.getMeasuredHeight()) / 2.0f;
                View view2 = this.e;
                view2.layout(0, (int) measuredHeight, view2.getMeasuredWidth(), (int) (measuredHeight + this.e.getMeasuredHeight()));
            }
            this.n = this.e.getRight() + this.n;
        }
        boolean z2 = true;
        View view3 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.e && childAt != this.f) {
                int i6 = this.c;
                if (i6 == 2) {
                    f3 = this.n;
                    max2 = z2 ? Math.max(this.d, (abs2 - childAt.getMeasuredWidth()) / 2.0f) : this.m;
                } else if (i6 != 3) {
                    this.n += z2 ? this.d : this.m;
                    int i7 = ((b) childAt.getLayoutParams()).e;
                    int measuredHeight2 = i7 == 48 ? (int) (i7 != 80 ? (abs - childAt.getMeasuredHeight()) / 2.0f : abs - childAt.getMeasuredHeight()) : 0;
                    int i8 = this.n;
                    childAt.layout(i8, measuredHeight2, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + measuredHeight2);
                    this.n = childAt.getRight();
                    z2 = false;
                    view3 = childAt;
                } else {
                    if (view3 != null) {
                        this.n = (int) (((abs2 - view3.getMeasuredWidth()) / 2.0f) + this.n);
                    }
                    max2 = this.n;
                    f3 = (abs2 - childAt.getMeasuredWidth()) / 2.0f;
                }
                this.n = (int) (f3 + max2);
                int i72 = ((b) childAt.getLayoutParams()).e;
                if (i72 == 48) {
                }
                int i82 = this.n;
                childAt.layout(i82, measuredHeight2, childAt.getMeasuredWidth() + i82, childAt.getMeasuredHeight() + measuredHeight2);
                this.n = childAt.getRight();
                z2 = false;
                view3 = childAt;
            }
        }
        if (view3 != null) {
            int i9 = this.c;
            if (i9 == 2) {
                f = this.n;
                f2 = this.d;
                measuredWidth = (abs2 - view3.getMeasuredWidth()) / 2.0f;
            } else if (i9 != 3) {
                max = this.n + this.d;
                this.n = max;
            } else {
                f = this.n;
                measuredWidth = (abs2 - view3.getMeasuredWidth()) / 2.0f;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            max = (int) (Math.max(f2, measuredWidth) + f);
            this.n = max;
        }
        View view4 = this.f;
        if (view4 != null) {
            int i10 = this.n;
            if (view4 != null) {
                View view5 = this.e;
                int right = view5 != null ? view5.getRight() : 0;
                if (i10 - right < getMeasuredWidth()) {
                    i10 = getMeasuredWidth() + right;
                }
                float measuredHeight3 = (abs - this.f.getMeasuredHeight()) / 2.0f;
                View view6 = this.f;
                view6.layout(i10, (int) measuredHeight3, view6.getMeasuredWidth() + i10, (int) (measuredHeight3 + this.f.getMeasuredHeight()));
            }
            this.n = this.f.getRight();
        }
        if (this.I) {
            a(this.a, false, 0);
        } else {
            c(this.a);
        }
        this.I = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        p pVar;
        p a2;
        p pVar2;
        b bVar;
        int i3;
        int i4 = 0;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.j = Math.min(measuredWidth / 10, this.i);
        int measuredWidth2 = getMeasuredWidth() - (this.d * 2);
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt == this.e || childAt == this.f || (bVar = (b) childAt.getLayoutParams()) == null || !bVar.c) {
                i5++;
            } else {
                int i6 = bVar.a;
                if (i6 > 0 && (i3 = bVar.b) > 0) {
                    pVar = p.a(i6, i3, measuredWidth2, measuredHeight);
                }
            }
        }
        pVar = null;
        if (pVar == null && (pVar2 = this.q) != null) {
            pVar = p.a(pVar2.b, pVar2.c, measuredWidth2, measuredHeight);
        }
        this.a = Math.min(Math.max(0, this.a), this.b - 1);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2 == this.e || childAt2 == this.f) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i4), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i4));
            } else {
                b bVar2 = (b) childAt2.getLayoutParams();
                if (bVar2 != null) {
                    int i8 = bVar2.a;
                    int i9 = bVar2.b;
                    if (this.c == Integer.MIN_VALUE) {
                        a2 = p.a(i8, i9, measuredHeight);
                    } else {
                        int i10 = bVar2.d;
                        if (i10 == 1 || i10 == 2) {
                            if (i10 == 2 && pVar != null) {
                                a2 = pVar;
                            } else if (i8 > 0 && i9 > 0) {
                                a2 = p.a(i8, i9, measuredWidth2, measuredHeight);
                            }
                        }
                        a2 = new p(measuredWidth2, measuredHeight);
                    }
                    int i11 = a2.b;
                    ((ViewGroup.LayoutParams) bVar2).width = i11;
                    ((ViewGroup.LayoutParams) bVar2).height = a2.c;
                    i4 = 0;
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i11), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((ViewGroup.LayoutParams) bVar2).height), 1073741824));
                }
            }
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onScrollChanged(i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.e) {
            i5 = 0;
            i6 = i;
        } else {
            i6 = Math.max(childAt.getRight(), i);
            i5 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f) {
            i6 = Math.min(childAt2.getLeft() - getMeasuredWidth(), i6);
            childCount--;
        }
        float a2 = f() ? uq.a(getMeasuredWidth(), 1.0f, 2.0f, i6) : i6 + this.d;
        View childAt3 = getChildAt(this.a + i5);
        int measuredWidth = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.d * 2) : childAt3.getMeasuredWidth();
        for (int i7 = i5; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            if (childAt4 != null) {
                float max = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - a2) + 0.5f) : childAt4.getLeft() - a2) / measuredWidth));
                int i8 = i7 - i5;
                if (childAt4.getLeft() < a2 && childAt4.getRight() > a2) {
                    this.l = i8;
                }
                this.k.a(childAt4, i8, max);
                if (max == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.a != i8) {
                    this.a = i8;
                    this.l = i8;
                    this.k.a(childAt4, i8);
                }
            }
        }
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(i, getScrollRange());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
    
        if (r1 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0217, code lost:
    
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023c, code lost:
    
        if (r1 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerId;
        d dVar;
        int i;
        int scrollRange;
        boolean z;
        this.M = true;
        boolean z2 = false;
        if (!this.r) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || getChildCount() == 0) {
            return false;
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.v) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.C);
                        if (findPointerIndex == -1) {
                            z2 = g();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.y);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.z);
                            if (abs > this.x && abs > abs2) {
                                h();
                                j();
                                float f = this.A;
                                this.y = x - f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + this.x : f - this.x;
                                this.z = y;
                                setScrollState(1);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.v) {
                        a(motionEvent.getX(motionEvent.findPointerIndex(this.C)));
                    } else {
                        this.h = true;
                    }
                } else if (action == 3) {
                    if (this.v) {
                        a(this.a, true, 0);
                        z = g();
                    }
                    z = false;
                } else if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.y = motionEvent.getX(actionIndex);
                    pointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    a(motionEvent);
                    this.y = motionEvent.getX(motionEvent.findPointerIndex(this.C));
                }
                if (z2) {
                    sg.bigo.ads.as.a.a(this);
                }
                return true;
            }
            if (this.v) {
                VelocityTracker velocityTracker = this.D;
                velocityTracker.computeCurrentVelocity(1000, this.F);
                int xVelocity = (int) velocityTracker.getXVelocity(this.C);
                int scrollX = getScrollX();
                int x2 = (int) (motionEvent.getX(motionEvent.findPointerIndex(this.C)) - this.A);
                if (Integer.MIN_VALUE != this.c) {
                    int i2 = this.l;
                    int i3 = (Math.abs(x2) <= this.G || Math.abs(xVelocity) <= this.E || xVelocity > 0) ? i2 : i2 + 1;
                    if (i3 == i2) {
                        double measuredWidth = (x2 * 1.0f) / a(i2).getMeasuredWidth();
                        if (measuredWidth > 0.1d) {
                            i2--;
                        } else if (measuredWidth < -0.1d) {
                            i2++;
                        }
                    } else {
                        i2 = i3;
                    }
                    int max = Math.max(Math.min(i2, this.a + 1), this.a - 1);
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View view = this.e;
                        if (view != null && view == getChildAt(0)) {
                            childCount--;
                        }
                        View view2 = this.f;
                        if (view2 != null && view2 == getChildAt(getChildCount() - 1)) {
                            childCount--;
                        }
                        max = Math.max(0, Math.min(max, childCount - 1));
                    }
                    a(max, true, xVelocity);
                } else if (Math.abs(xVelocity) > this.E) {
                    int i4 = -xVelocity;
                    if (this.e != null) {
                        View childAt = getChildAt(0);
                        View view3 = this.e;
                        if (childAt == view3) {
                            i = view3.getRight();
                            if (this.f != null) {
                                View childAt2 = getChildAt(getChildCount() - 1);
                                View view4 = this.f;
                                if (childAt2 == view4) {
                                    scrollRange = view4.getLeft() - getMeasuredWidth();
                                    int i5 = scrollRange;
                                    if (getChildCount() > 0) {
                                        this.t.fling(getScrollX(), getScrollY(), i4, 0, i, i5, 0, 0);
                                        postInvalidateOnAnimation();
                                    }
                                }
                            }
                            scrollRange = getScrollRange();
                            int i52 = scrollRange;
                            if (getChildCount() > 0) {
                            }
                        }
                    }
                    i = 0;
                    if (this.f != null) {
                    }
                    scrollRange = getScrollRange();
                    int i522 = scrollRange;
                    if (getChildCount() > 0) {
                    }
                } else {
                    post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewFlow.a(ViewFlow.this);
                        }
                    });
                }
                if (scrollX != 0 || x2 <= 0 || this.e == null || getChildAt(0) != this.e) {
                    if (this.f != null) {
                        View childAt3 = getChildAt(getChildCount() - 1);
                        View view5 = this.f;
                        if (childAt3 == view5) {
                            if (x2 < 0) {
                                if (scrollX == view5.getRight() - getMeasuredWidth()) {
                                    dVar = this.p;
                                }
                            }
                        }
                    }
                    z = g();
                } else {
                    dVar = this.o;
                }
                if (z2) {
                }
                return true;
            }
            if (Integer.MIN_VALUE != this.c) {
                c(this.l);
            } else {
                post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewFlow.a(ViewFlow.this);
                    }
                });
            }
            z = false;
            this.h = false;
            z2 = z;
            if (z2) {
            }
            return true;
        }
        this.t.abortAnimation();
        float x3 = motionEvent.getX();
        this.A = x3;
        this.y = x3;
        float y2 = motionEvent.getY();
        this.B = y2;
        this.z = y2;
        pointerId = motionEvent.getPointerId(0);
        this.C = pointerId;
        if (z2) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f || view == this.e || view == null) {
            return;
        }
        this.b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f || view == this.e || view == null) {
            return;
        }
        this.b--;
    }

    public void setContentMaxWidthSpace(int i) {
        int max = Math.max(0, i);
        if (this.d != max) {
            this.d = max;
            requestLayout();
        }
    }

    public void setDividerWidth(int i) {
        int max = Math.max(0, i);
        if (this.m != max) {
            this.m = max;
            if (this.c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.k.a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.o = dVar;
    }

    public void setScrollEnabled(boolean z) {
        this.r = z;
    }

    public void setScrollState(int i) {
        if (this.K == i) {
            return;
        }
        this.K = i;
    }

    public void setStartView(View view) {
        View view2 = this.e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new a(this, (byte) 0);
        this.a = 0;
        this.b = 0;
        this.l = 0;
        this.c = 3;
        this.r = true;
        this.g = false;
        this.h = false;
        this.C = -1;
        this.I = true;
        this.J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.t = new Scroller(context2, s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.x = viewConfiguration.getScaledPagingTouchSlop();
        this.E = (int) (400.0f * f);
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f);
        this.H = (int) (2.0f * f);
        this.i = (int) (f * 16.0f);
    }

    @Nullable
    public final View a(int i) {
        List<View> items = getItems();
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    public final void b(int i) {
        this.a = i;
        if (this.I) {
            requestLayout();
        } else {
            c(i);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // sg.bigo.ads.common.view.a
    public final void a() {
        int i;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int currentItem = getCurrentItem();
        if (!this.L) {
            if (currentItem != itemCount - 1) {
                View view = this.f;
                int i2 = this.n;
                if (view != null) {
                    i2 -= view.getMeasuredWidth();
                }
                if (getMeasuredWidth() + getScrollX() < i2) {
                    i = currentItem + 1;
                }
            }
            i = currentItem - 1;
            this.L = true;
        } else if (currentItem == 0) {
            i = currentItem + 1;
            this.L = false;
        } else {
            i = currentItem - 1;
        }
        c(i);
    }

    @Override // sg.bigo.ads.common.view.a
    public final boolean b() {
        return !this.v;
    }

    private void a(int i, int i2) {
        int scrollX;
        if (this.b == 0) {
            return;
        }
        Scroller scroller = this.t;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.u ? this.t.getCurrX() : this.t.getStartX();
            this.t.abortAnimation();
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth / 2;
        float b2 = (b(Math.min(1.0f, (Math.abs(i4) * 1.0f) / measuredWidth)) * f) + f;
        int abs = Math.abs(i2);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(b2 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / getChildAt(this.a).getWidth()) + 1.0f) * 100.0f), 600);
        this.u = false;
        this.t.startScroll(i3, scrollY, i4, i5, min);
        sg.bigo.ads.as.a.a(this);
    }

    private void a(int i, boolean z, int i2) {
        int i3;
        int measuredWidth;
        if (this.b <= 0) {
            return;
        }
        int min = Math.min(Math.max(0, i), this.b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.e) {
            min++;
        }
        View childAt2 = getChildAt(min);
        int left = childAt2 != null ? f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.d, this.m) : 0;
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f != null) {
                i3 = this.n - getMeasuredWidth();
                measuredWidth = this.f.getMeasuredWidth();
            } else {
                i3 = this.n;
                measuredWidth = getMeasuredWidth();
            }
            left = (int) Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(left, i3 - measuredWidth));
        }
        if (left == getScrollX()) {
            return;
        }
        if (z) {
            a(left, i2);
        } else {
            a(false);
            scrollTo(left, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.y = motionEvent.getX(i);
            this.C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.K == 2;
        if (z2 && !this.t.isFinished()) {
            this.t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.t.getCurrX();
            int currY = this.t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z2) {
            if (z) {
                sg.bigo.ads.as.a.a(this, this.J);
            } else {
                this.J.run();
            }
        }
    }

    private boolean a(float f) {
        float f2 = this.y - f;
        this.y = f;
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(getScrollX() + f2, getScrollRange()));
        sg.bigo.ads.bn.a.a("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + max);
        int i = (int) max;
        this.y = (max - ((float) i)) + this.y;
        scrollTo(i, getScrollY());
        return false;
    }
}
