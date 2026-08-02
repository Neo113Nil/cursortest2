package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: FlexLayout.kt */
/* loaded from: classes18.dex */
public final class qor extends ViewGroup {
    public static int A;
    public static final int y = iah0.a(4);
    public static final int z = iah0.a(135);
    public final gpr b;
    public AnimatorSet c;
    public izs<? super Integer, s3q0> d;
    public int e;
    public gzs<s3d0> f;
    public boolean g;
    public final ArrayList<List<t0u0>> h;
    public final vor i;
    public mpr j;
    public final fsk k;
    public qpr l;
    public d m;
    public bpr n;
    public int o;
    public int p;
    public gzs<s3q0> q;
    public final int r;
    public int s;
    public a t;
    public int u;
    public int v;
    public cpr w;
    public b x;

    /* compiled from: FlexLayout.kt */
    public interface a {
        void T0(View view, v0u0 v0u0Var);
    }

    /* compiled from: FlexLayout.kt */
    public interface b {
        default boolean a(Canvas canvas, View view, por porVar) {
            return ((Boolean) porVar.invoke()).booleanValue();
        }
    }

    /* compiled from: FlexLayout.kt */
    public interface d {
        void a(int i, int i2);
    }

    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b((Integer) ((Pair) t).j(), (Integer) ((Pair) t2).j());
        }
    }

    /* compiled from: FlexLayout.kt */
    public static final class f {
        public f() {
        }

        public final void a(float f, float f2, int i, int i2) {
            qor qorVar = qor.this;
            if (qorVar.getAreAnimationsEnabled()) {
                qor.c(qorVar, i, i2, f, f2);
                return;
            }
            d dVar = qorVar.m;
            if (dVar != null) {
                dVar.a(i, i2);
            }
            View childAt = qorVar.getChildAt(i);
            qorVar.removeView(childAt);
            qorVar.addView(childAt, i2);
        }
    }

    public qor(Context context) {
        super(context);
        this.b = new gpr(this, new f(), new myh(this, 13));
        this.e = iah0.z(getContext());
        this.f = new cj4(22);
        this.g = true;
        this.h = new ArrayList<>();
        EmptyList emptyList = EmptyList.b;
        int i = y;
        int i2 = z;
        this.i = new vor(0, 0, 0, 0, emptyList, i, i2);
        this.j = new mpr(0, 0, new ArrayList());
        this.k = new fsk();
        boolean z2 = this.g;
        gzs<s3d0> gzsVar = this.f;
        this.l = !z2 ? new nv9(gzsVar) : new mgu(gzsVar);
        this.r = i2;
        this.s = iah0.a(248);
        this.u = i;
        this.v = Integer.MAX_VALUE;
        this.w = new cpr(true, true);
        int a2 = this.l.a() + 1;
        for (int i3 = 0; i3 < a2; i3++) {
            ArrayList<List<t0u0>> arrayList = this.h;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList2.add(new t0u0(0, 0, 0));
            }
            arrayList.add(arrayList2);
        }
        setChildrenDrawingOrderEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public static boolean a(qor qorVar, Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static final void c(final qor qorVar, int i, final int i2, float f2, float f3) {
        List<t0u0> childrenSizes = qorVar.getChildrenSizes();
        t0u0 remove = childrenSizes.remove(i);
        childrenSizes.add(i2, new t0u0(remove.a, remove.b, remove.c));
        v0u0 v0u0Var = qorVar.j.c.get(i);
        int i3 = v0u0Var.d - v0u0Var.b;
        int i4 = v0u0Var.e - v0u0Var.c;
        int b2 = an10.b(f2);
        int b3 = an10.b(f3);
        final mpr a2 = qorVar.j.a();
        a2.c.set(i, v0u0.a(v0u0Var, b2, b3, b2 + i3, b3 + i4, 1));
        final mpr a3 = qorVar.g(childrenSizes).a();
        int size = childrenSizes.size();
        for (int i5 = 0; i5 < size; i5++) {
            a3.c.get(i5).a = childrenSizes.get(i5).a;
        }
        d dVar = qorVar.m;
        if (dVar != null) {
            dVar.a(i, i2);
        }
        View childAt = qorVar.getChildAt(i);
        bwt0.p0(childAt, false);
        qorVar.removeView(childAt);
        qorVar.addView(childAt, i2);
        qorVar.q = new gzs() { // from class: xsna.gor
            @Override // xsna.gzs
            public final Object invoke() {
                qor qorVar2 = qor.this;
                qor.l(qorVar2, a2, a3, new mor(qorVar2, i2, 0));
                return s3q0.a;
            }
        };
    }

    public static void f(qor qorVar, List list, int i, int i2) {
        int min = Math.min(qorVar.getChildCount(), list.size());
        for (int i3 = 0; i3 < min; i3++) {
            qorVar.e(qorVar.getChildAt(i3), i3, (t0u0) list.get(i3), i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAreAnimationsEnabled() {
        return this.w.b && !this.g;
    }

    private final List<t0u0> getChildrenSizes() {
        int min = Math.min(getChildCount(), this.l.a());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new t0u0(0, 0, 0));
        }
        f(this, arrayList, getMeasuredWidth(), getMeasuredHeight());
        return arrayList;
    }

    public static float i(float f2, float f3) {
        return u11.b(1.0f, f2, f3, f2);
    }

    public static void l(final qor qorVar, mpr mprVar, mpr mprVar2, gzs gzsVar) {
        Object obj;
        Object obj2;
        final int i;
        final int i2;
        ValueAnimator valueAnimator;
        final qor qorVar2 = qorVar;
        int paddingLeft = qorVar2.getPaddingLeft();
        int paddingTop = qorVar2.getPaddingTop();
        AnimatorSet animatorSet = qorVar2.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Object obj3 = null;
        qorVar2.c = null;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int childCount = qorVar2.getChildCount();
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= childCount) {
                animatorSet2.setDuration(200L);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.o(qorVar2, i4));
                animatorSet2.play(ofFloat);
                animatorSet2.addListener(new tor(ref$BooleanRef, gzsVar));
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                qorVar2.c = animatorSet2;
                animatorSet2.start();
                return;
            }
            final View childAt = qorVar2.getChildAt(i3);
            Iterator<T> it = mprVar2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = obj3;
                    break;
                } else {
                    obj = it.next();
                    if (((v0u0) obj).a == childAt.getId()) {
                        break;
                    }
                }
            }
            final v0u0 v0u0Var = (v0u0) obj;
            if (v0u0Var == null) {
                i2 = paddingLeft;
                i = paddingTop;
            } else {
                Iterator<T> it2 = mprVar.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((v0u0) obj2).a == childAt.getId()) {
                            break;
                        }
                    }
                }
                final v0u0 v0u0Var2 = (v0u0) obj2;
                if (v0u0Var2 == null) {
                    childAt.layout(v0u0Var.b + paddingLeft, v0u0Var.c + paddingTop, v0u0Var.d + paddingLeft, v0u0Var.e + paddingTop);
                    final float scaleX = childAt.getScaleX();
                    final float scaleY = childAt.getScaleY();
                    final float alpha = childAt.getAlpha();
                    valueAnimator = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(childAt, qorVar2, scaleX, scaleY, alpha) { // from class: xsna.ior
                        public final /* synthetic */ View b;
                        public final /* synthetic */ float c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ float e;

                        {
                            this.c = scaleX;
                            this.d = scaleY;
                            this.e = alpha;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            View view = this.b;
                            bwt0.p0(view, true);
                            view.setScaleX(qor.i(this.c, floatValue));
                            view.setScaleY(qor.i(this.d, floatValue));
                            view.setAlpha(qor.i(this.e, floatValue));
                        }
                    });
                    qorVar2 = qorVar;
                    i2 = paddingLeft;
                    i = paddingTop;
                } else {
                    i = paddingTop;
                    final float scaleX2 = childAt.getScaleX();
                    final float scaleY2 = childAt.getScaleY();
                    final float alpha2 = childAt.getAlpha();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    i2 = paddingLeft;
                    qorVar2 = qorVar;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(v0u0Var, childAt, i2, i, qorVar, scaleX2, scaleY2, alpha2) { // from class: xsna.jor
                        public final /* synthetic */ v0u0 c;
                        public final /* synthetic */ View d;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ int f;
                        public final /* synthetic */ float g;
                        public final /* synthetic */ float h;
                        public final /* synthetic */ float i;

                        {
                            this.g = scaleX2;
                            this.h = scaleY2;
                            this.i = alpha2;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            v0u0 v0u0Var3 = v0u0.this;
                            int i5 = v0u0Var3.b;
                            v0u0 v0u0Var4 = this.c;
                            int b2 = an10.b((v0u0Var4.b - i5) * floatValue) + i5;
                            int b3 = an10.b((v0u0Var4.c - r1) * floatValue) + v0u0Var3.c;
                            int b4 = an10.b((v0u0Var4.d - r1) * floatValue) + v0u0Var3.d;
                            int b5 = an10.b((v0u0Var4.e - r0) * floatValue) + v0u0Var3.e;
                            int i6 = this.e;
                            int i7 = this.f;
                            int i8 = i7 + b5;
                            View view = this.d;
                            view.layout(b2 + i6, b3 + i7, i6 + b4, i8);
                            bwt0.p0(view, true);
                            view.setScaleX(qor.i(this.g, floatValue));
                            view.setScaleY(qor.i(this.h, floatValue));
                            view.setAlpha(qor.i(this.i, floatValue));
                        }
                    });
                    valueAnimator = ofFloat2;
                }
                animatorSet2.play(valueAnimator);
            }
            i3++;
            paddingLeft = i2;
            paddingTop = i;
            obj3 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == this.l.a()) {
            return;
        }
        super.addView(view, i, layoutParams);
        if (view != null) {
            if (view.getId() == -1) {
                int i2 = A;
                A = i2 + 1;
                view.setId(i2);
            }
            if (this.w.a) {
                view.setOnLongClickListener(this.b);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d(List<? extends Pair<? extends View, Integer>> list) {
        int i;
        List D0 = j5g.D0(new e(), list);
        List<t0u0> childrenSizes = getChildrenSizes();
        Iterator it = D0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            View view = (View) pair.i();
            int intValue = ((Number) pair.j()).intValue();
            int i2 = A;
            A = i2 + 1;
            view.setId(i2);
            bwt0.p0(view, true);
            t0u0 t0u0Var = new t0u0(0, 0, 0);
            e(view, intValue, t0u0Var, getMeasuredWidth(), getMeasuredHeight());
            if (intValue < childrenSizes.size()) {
                childrenSizes.add(intValue, t0u0Var);
            } else {
                childrenSizes.add(t0u0Var);
            }
            addView(view, Math.min(intValue, getChildCount()));
        }
        mpr g = g(childrenSizes);
        int size = childrenSizes.size();
        for (i = 0; i < size; i++) {
            g.c.get(i).a = childrenSizes.get(i).a;
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.b.a().F(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.w.a ? this.b.a().dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        por porVar = new por(this, canvas, view, j);
        b bVar = this.x;
        return bVar != null ? bVar.a(canvas, view, porVar) : ((Boolean) porVar.invoke()).booleanValue();
    }

    public final void e(View view, int i, t0u0 t0u0Var, int i2, int i3) {
        int measuredWidth;
        int measuredHeight;
        bpr bprVar = this.n;
        if (bprVar != null) {
            bac c2 = bprVar.c(i);
            measuredWidth = c2.a;
            measuredHeight = c2.b;
        } else if (view.getLayoutParams() == null || view.getLayoutParams().width < 0 || view.getLayoutParams().height < 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredWidth = view.getLayoutParams().width;
            measuredHeight = view.getLayoutParams().height;
        }
        t0u0Var.a = view.getId();
        t0u0Var.b = measuredWidth;
        t0u0Var.c = measuredHeight;
    }

    public final mpr g(List<t0u0> list) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(this.o) - paddingRight;
        vor vorVar = new vor(this.o, this.p, size, View.MeasureSpec.getSize(this.p) - paddingBottom, list, this.u, this.r);
        opr b2 = this.l.b(list.size());
        vorVar.a = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        vorVar.b = View.MeasureSpec.makeMeasureSpec(this.v, Integer.MIN_VALUE);
        vorVar.d = this.s;
        vorVar.h = this.v;
        vorVar.c = size;
        vorVar.e = list;
        vorVar.f = this.u;
        vorVar.g = this.r;
        mpr a2 = b2.a(vorVar);
        int i = 0;
        for (Object obj : a2.c) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ((v0u0) obj).a = list.get(i).a;
            i = i2;
        }
        return a2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new c(layoutParams) : new c();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.b.a().getChildDrawingOrder(i, i2);
    }

    public final gzs<s3d0> getConfigRatioCarousel() {
        return this.f;
    }

    public final b getDecoration() {
        return this.x;
    }

    public final int getPreferredHeight() {
        return this.v;
    }

    public final izs<Integer, s3q0> getScrollToPosition() {
        return this.d;
    }

    public final int getSpacing() {
        return this.u;
    }

    public final int getWidthScreenView() {
        return this.e;
    }

    public final boolean h() {
        return this.g && getChildCount() == 1;
    }

    public final void j(int i) {
        boolean areAnimationsEnabled = getAreAnimationsEnabled();
        cgg0 cgg0Var = cgg0.b;
        if (areAnimationsEnabled) {
            List D0 = j5g.D0(cgg0Var, Collections.singletonList(Integer.valueOf(i)));
            List<t0u0> childrenSizes = getChildrenSizes();
            mpr a2 = this.j.a();
            Iterator it = D0.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue >= 0 && intValue < childrenSizes.size()) {
                    childrenSizes.remove(intValue);
                }
                if (intValue >= 0 && intValue < getChildCount()) {
                    removeViewAt(intValue);
                }
            }
            this.q = new xo8(this, childrenSizes, a2, 3);
            return;
        }
        List D02 = j5g.D0(cgg0Var, Collections.singletonList(Integer.valueOf(i)));
        List<t0u0> childrenSizes2 = getChildrenSizes();
        Iterator it2 = D02.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            if (intValue2 >= 0 && intValue2 < childrenSizes2.size()) {
                childrenSizes2.remove(intValue2);
            }
            if (intValue2 >= 0 && intValue2 < getChildCount()) {
                removeViewAt(intValue2);
            }
        }
        requestLayout();
        invalidate();
    }

    public final void k(ArrayList arrayList) {
        bpr bprVar = this.n;
        List<? extends Pair<? extends View, Integer>> a2 = bprVar != null ? bprVar.a(arrayList, this) : EmptyList.b;
        if (!getAreAnimationsEnabled()) {
            d(a2);
            return;
        }
        List<Pair> D0 = j5g.D0(new v12(2), a2);
        List<t0u0> childrenSizes = getChildrenSizes();
        mpr a3 = this.j.a();
        for (Pair pair : D0) {
            View view = (View) pair.i();
            int intValue = ((Number) pair.j()).intValue();
            int i = A;
            A = i + 1;
            view.setId(i);
            view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            bwt0.p0(view, true);
            t0u0 t0u0Var = new t0u0(0, 0, 0);
            e(view, intValue, t0u0Var, getMeasuredWidth(), getMeasuredHeight());
            if (intValue < childrenSizes.size()) {
                childrenSizes.add(intValue, t0u0Var);
            } else {
                childrenSizes.add(t0u0Var);
            }
            if (intValue >= this.l.a()) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(tgw.b(intValue, "Add item for position (", ") > maxItemsCount")));
            }
            addView(view, Math.min(intValue, getChildCount()));
        }
        this.q = new s2b(this, childrenSizes, a3, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AnimatorSet animatorSet = this.c;
        if (animatorSet == null || !animatorSet.isRunning()) {
            mpr mprVar = this.j;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int size = mprVar.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                v0u0 v0u0Var = mprVar.c.get(i5);
                if (i5 < getChildCount()) {
                    getChildAt(i5).layout(v0u0Var.b + paddingLeft, v0u0Var.c + paddingTop, v0u0Var.d + paddingLeft, v0u0Var.e + paddingTop);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.o = i;
        this.p = i2;
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i) - paddingRight;
        int size2 = View.MeasureSpec.getSize(i2) - paddingBottom;
        List<t0u0> list = this.h.get(getChildCount());
        f(this, list, size, size2);
        opr b2 = this.l.b(getChildCount());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        vor vorVar = this.i;
        vorVar.a = makeMeasureSpec;
        vorVar.b = View.MeasureSpec.makeMeasureSpec(this.v, Integer.MIN_VALUE);
        vorVar.d = this.s;
        vorVar.h = this.v;
        vorVar.c = size;
        vorVar.e = list;
        vorVar.f = this.u;
        vorVar.g = this.r;
        mpr a2 = b2.a(vorVar);
        this.j = a2;
        int size3 = a2.c.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.j.c.get(i3).a = vorVar.e.get(i3).a;
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            v0u0 v0u0Var = this.j.c.get(i4);
            int i5 = v0u0Var.d - v0u0Var.b;
            v0u0 v0u0Var2 = this.j.c.get(i4);
            int i6 = v0u0Var2.e - v0u0Var2.c;
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            View childAt = getChildAt(i4);
            if (childAt != null) {
                a aVar = this.t;
                if (aVar != null) {
                    aVar.T0(childAt, this.j.c.get(i4));
                }
                childAt.measure(makeMeasureSpec2, makeMeasureSpec3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof c) {
                    uzt0 uzt0Var = ((c) layoutParams).a.a;
                    int[] iArr = this.j.d;
                    uzt0Var.a = i4 == iArr[0];
                    uzt0Var.b = i4 == iArr[1];
                    uzt0Var.c = i4 == iArr[2];
                    uzt0Var.d = i4 == iArr[3];
                }
            }
            i4++;
        }
        mpr mprVar = this.j;
        setMeasuredDimension(mprVar.a + paddingRight, mprVar.b + paddingBottom);
        gzs<s3q0> gzsVar = this.q;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.q = null;
    }

    public final void setChildViewProvider(bpr bprVar) {
        this.n = bprVar;
    }

    public final void setConfig(cpr cprVar) {
        this.w = cprVar;
    }

    public final void setConfigRatioCarousel(gzs<s3d0> gzsVar) {
        this.f = gzsVar;
    }

    public final void setContainerMaxHeight(int i) {
        if (i != this.s) {
            this.s = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setDecoration(b bVar) {
        this.x = bVar;
    }

    public final void setMeasureChildListener(a aVar) {
        this.t = aVar;
    }

    public final void setMoveCallback(d dVar) {
        this.m = dVar;
    }

    public final void setPreferredHeight(int i) {
        this.v = i;
    }

    public final void setScrollToPosition(izs<? super Integer, s3q0> izsVar) {
        this.d = izsVar;
    }

    public final void setSpacing(int i) {
        this.u = i;
        this.i.f = i;
    }

    public final void setWidthScreenView(int i) {
        this.e = i;
    }

    /* compiled from: FlexLayout.kt */
    public static final class c extends ViewGroup.MarginLayoutParams {
        public final a6t a;

        public c() {
            super(-2, -2);
            this.a = new a6t((uzt0) null, 3);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = new a6t((uzt0) null, 3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = new a6t((uzt0) null, 3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
