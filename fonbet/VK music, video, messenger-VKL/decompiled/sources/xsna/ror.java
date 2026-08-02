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
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.photo.ImageCropData;
import com.vk.feed.tool.view.newsfeed.posting.PostingItemWrapper;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropableImageContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cvj;

/* compiled from: FlexLayout.kt */
/* loaded from: classes4.dex */
public final class ror extends ViewGroup {
    public static final int C = iah0.a(4);
    public static final int D = iah0.a(135);
    public static int E;
    public float A;
    public float B;
    public final boolean b;
    public final boolean c;
    public final fpr d;
    public izs<? super Integer, s3q0> e;
    public int f;
    public gzs<CarouselRatio> g;
    public boolean h;
    public final ArrayList<List<s0u0>> i;
    public final uor j;
    public lpr k;
    public final rpr l;
    public ppr m;
    public d n;
    public e o;
    public qbq p;
    public boolean q;
    public int r;
    public int s;
    public gzs<s3q0> t;
    public CropsForRatio u;
    public CropableImageContainer v;
    public int w;
    public int x;
    public int y;
    public b z;

    /* compiled from: FlexLayout.kt */
    public static final class a {
        public a() {
        }

        public final void a(float f, float f2, int i, int i2) {
            ror.b(ror.this, i, i2, f, f2);
        }
    }

    /* compiled from: FlexLayout.kt */
    public interface d {
        boolean e(int i, int i2);
    }

    /* compiled from: FlexLayout.kt */
    public interface e {
        void a(int i, int i2);
    }

    public ror(Context context, ndc0 ndc0Var) {
        super(context);
        boolean z = ndc0Var.c;
        this.b = z;
        boolean z2 = ndc0Var.a;
        this.c = z2;
        this.d = new fpr(this, new a(), new k5h(this, 15), z, ndc0Var);
        this.f = iah0.z(getContext());
        this.g = new pr0(13);
        this.h = true;
        this.i = new ArrayList<>();
        EmptyList emptyList = EmptyList.b;
        int i = C;
        int i2 = D;
        this.j = new uor(0, 0, 0, 0, emptyList, i, i2);
        this.k = new lpr(0, 0, new ArrayList());
        rpr ine0Var = z2 ? new ine0() : new sdy();
        this.l = ine0Var;
        ppr b2 = ine0Var.b(this.h, this.g);
        this.m = b2;
        this.w = i2;
        this.x = i;
        this.y = Integer.MAX_VALUE;
        int a2 = b2.a() + 1;
        for (int i3 = 0; i3 < a2; i3++) {
            ArrayList<List<s0u0>> arrayList = this.i;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList2.add(new s0u0(0, 0, 0));
            }
            arrayList.add(arrayList2);
        }
        setChildrenDrawingOrderEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public static boolean a(ror rorVar, Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static final void b(ror rorVar, int i, int i2, float f, float f2) {
        List<s0u0> childrenSizes = rorVar.getChildrenSizes();
        s0u0 remove = childrenSizes.remove(i);
        childrenSizes.add(i2, new s0u0(remove.a, remove.b, remove.c));
        u0u0 u0u0Var = rorVar.k.c.get(i);
        int i3 = u0u0Var.d - u0u0Var.b;
        int i4 = u0u0Var.e - u0u0Var.c;
        int b2 = an10.b(f);
        int b3 = an10.b(f2);
        lpr a2 = rorVar.k.a();
        a2.c.set(i2, u0u0.a(u0u0Var, b2, b3, b2 + i3, b3 + i4, 1));
        lpr a3 = rorVar.f(childrenSizes).a();
        int size = childrenSizes.size();
        for (int i5 = 0; i5 < size; i5++) {
            a3.c.get(i5).a = childrenSizes.get(i5).a;
        }
        e eVar = rorVar.o;
        if (eVar != null) {
            eVar.a(i, i2);
        }
        View childAt = rorVar.getChildAt(i);
        bwt0.p0(childAt, false);
        rorVar.removeView(childAt);
        rorVar.addView(childAt, i2);
        rorVar.t = new Cfor(rorVar, a2, a3, i2);
    }

    public static void e(ror rorVar, List list, int i, int i2) {
        int min = Math.min(rorVar.getChildCount(), list.size());
        for (int i3 = 0; i3 < min; i3++) {
            rorVar.d(rorVar.getChildAt(i3), i3, (s0u0) list.get(i3), i, i2);
        }
    }

    private final List<s0u0> getChildrenSizes() {
        int min = Math.min(getChildCount(), this.m.a());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new s0u0(0, 0, 0));
        }
        e(this, arrayList, getMeasuredWidth(), getMeasuredHeight());
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == this.m.a()) {
            return;
        }
        super.addView(view, i, layoutParams);
        if (view != null) {
            if (view.getId() == -1) {
                int i2 = E;
                E = i2 + 1;
                view.setId(i2);
            }
            if (this.h || !this.c) {
                view.setOnLongClickListener(this.d);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        List<Pair> D0 = j5g.D0(new j4q(1), arrayList);
        List<s0u0> childrenSizes = getChildrenSizes();
        lpr a2 = this.k.a();
        float f = getChildCount() == 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (Pair pair : D0) {
            View view = (View) pair.i();
            int intValue = ((Number) pair.j()).intValue();
            int i = E;
            E = i + 1;
            view.setId(i);
            view.setScaleX(f);
            view.setScaleY(f);
            view.setAlpha(f);
            bwt0.p0(view, true);
            s0u0 s0u0Var = new s0u0(0, 0, 0);
            d(view, intValue, s0u0Var, getMeasuredWidth(), getMeasuredHeight());
            if (intValue < childrenSizes.size()) {
                childrenSizes.add(intValue, s0u0Var);
            } else {
                childrenSizes.add(s0u0Var);
            }
            if (intValue >= this.m.a()) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(tgw.b(intValue, "Add item for position (", ") > maxItemsCount")));
            }
            addView(view, Math.min(intValue, getChildCount()));
        }
        this.t = new hor(this, childrenSizes, a2, D0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d(View view, int i, s0u0 s0u0Var, int i2, int i3) {
        int measuredWidth;
        int measuredHeight;
        qbq qbqVar = this.p;
        if (qbqVar != null) {
            e6y0 e6y0Var = new e6y0();
            qbqVar.b(i, e6y0Var);
            measuredWidth = e6y0Var.a;
            measuredHeight = e6y0Var.b;
        } else if (view.getLayoutParams() == null || view.getLayoutParams().width < 0 || view.getLayoutParams().height < 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredWidth = view.getLayoutParams().width;
            measuredHeight = view.getLayoutParams().height;
        }
        s0u0Var.a = view.getId();
        s0u0Var.b = measuredWidth;
        s0u0Var.c = measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b bVar;
        fpr fprVar = this.d;
        fprVar.a().F(canvas);
        super.dispatchDraw(canvas);
        if (fprVar.a().t() || this.q || (bVar = this.z) == null) {
            return;
        }
        bVar.f(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.d.a().dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.b && this.d.a().R2(view)) {
            return super.drawChild(canvas, view, j);
        }
        oor oorVar = new oor(this, canvas, view, j);
        b bVar = this.z;
        boolean c2 = bVar != null ? bVar.c(canvas, view, oorVar) : ((Boolean) oorVar.invoke()).booleanValue();
        b bVar2 = this.z;
        if (bVar2 != null) {
            bVar2.e(view, canvas);
        }
        return c2;
    }

    public final lpr f(List<s0u0> list) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        npr b2 = this.m.b(list.size());
        int size = View.MeasureSpec.getSize(this.r) - paddingRight;
        lpr a2 = b2.a(new uor(b2 != null ? View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE) : this.r, b2 != null ? View.MeasureSpec.makeMeasureSpec(this.y, Integer.MIN_VALUE) : this.s, size, (b2 != null ? this.y : View.MeasureSpec.getSize(this.s)) - paddingBottom, list, this.x, this.w));
        int i = 0;
        for (Object obj : a2.c) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ((u0u0) obj).a = list.get(i).a;
            i = i2;
        }
        return a2;
    }

    public final void g(int i) {
        List D0 = j5g.D0(cgg0.b, Collections.singletonList(Integer.valueOf(i)));
        List<s0u0> childrenSizes = getChildrenSizes();
        lpr a2 = this.k.a();
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
        this.t = new ty0(this, childrenSizes, a2, 5);
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
        return this.d.a().getChildDrawingOrder(i, i2);
    }

    public final float getChildInnerRadius() {
        return this.B;
    }

    public final float getChildOuterRadius() {
        return this.A;
    }

    public final gzs<CarouselRatio> getConfigRatioCarousel() {
        return this.g;
    }

    public final cvj getCornersStateKeeper() {
        b bVar = this.z;
        cvj cvjVar = bVar instanceof cvj ? (cvj) bVar : null;
        return cvjVar == null ? cvj.a.a.getSTUB() : cvjVar;
    }

    public final b getDecoration() {
        return this.z;
    }

    public final int getMinItemSize() {
        return this.w;
    }

    public final int getPreferredHeight() {
        return this.y;
    }

    public final izs<Integer, s3q0> getScrollToPosition() {
        return this.e;
    }

    public final int getSpacing() {
        return this.x;
    }

    public final int getWidthScreenView() {
        return this.f;
    }

    public final void h(lpr lprVar, lpr lprVar2, final gzj gzjVar, gzs gzsVar) {
        Object obj;
        Object obj2;
        final int paddingLeft = getPaddingLeft();
        final int paddingTop = getPaddingTop();
        AnimatorSet animatorSet = new AnimatorSet();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View childAt = getChildAt(i);
            Iterator<T> it = lprVar2.c.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((u0u0) obj2).a == childAt.getId()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            final u0u0 u0u0Var = (u0u0) obj2;
            if (u0u0Var != null) {
                Iterator<T> it2 = lprVar.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((u0u0) next).a == childAt.getId()) {
                        obj = next;
                        break;
                    }
                }
                final u0u0 u0u0Var2 = (u0u0) obj;
                if (u0u0Var2 == null) {
                    childAt.layout(u0u0Var.b + paddingLeft, u0u0Var.c + paddingTop, u0u0Var.d + paddingLeft, u0u0Var.e + paddingTop);
                } else if (!u0u0Var.equals(u0u0Var2)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.lor
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            u0u0 u0u0Var3 = u0u0.this;
                            int i2 = u0u0Var3.b;
                            u0u0 u0u0Var4 = u0u0Var;
                            int b2 = an10.b((u0u0Var4.b - i2) * floatValue) + i2;
                            int b3 = an10.b((u0u0Var4.c - r1) * floatValue) + u0u0Var3.c;
                            int b4 = an10.b((u0u0Var4.d - r1) * floatValue) + u0u0Var3.d;
                            int b5 = an10.b((u0u0Var4.e - r0) * floatValue) + u0u0Var3.e;
                            int i3 = paddingLeft;
                            int i4 = paddingTop;
                            int i5 = i4 + b5;
                            View view = childAt;
                            view.layout(b2 + i3, b3 + i4, i3 + b4, i5);
                            bwt0.p0(view, true);
                        }
                    });
                    animatorSet.play(ofFloat);
                }
            }
        }
        animatorSet.setDuration(200L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.nor
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.floatValue();
                izs izsVar = izs.this;
                if (izsVar != null) {
                    izsVar.invoke(f);
                }
                this.requestLayout();
            }
        });
        animatorSet.play(ofFloat2);
        animatorSet.addListener(new sor(this, gzsVar));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            getCornersStateKeeper().h(next);
            getCornersStateKeeper().a(next, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getCornersStateKeeper().clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.q) {
            return;
        }
        lpr lprVar = this.k;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = lprVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            u0u0 u0u0Var = lprVar.c.get(i5);
            if (i5 < getChildCount()) {
                getChildAt(i5).layout(u0u0Var.b + paddingLeft, u0u0Var.c + paddingTop, u0u0Var.d + paddingLeft, u0u0Var.e + paddingTop);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        PhotoAttachment photoAttachment;
        CropsForRatio cropsForRatio;
        List<ImageCropData> a2;
        Object obj;
        ImageCropData imageCropData;
        CropsForRatio cropsForRatio2;
        super.onMeasure(i, i2);
        this.r = i;
        this.s = i2;
        boolean z2 = false;
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i) - paddingRight;
        int size2 = View.MeasureSpec.getSize(i2) - paddingBottom;
        List<s0u0> list = this.i.get(getChildCount());
        e(this, list, size, size2);
        npr b2 = this.m.b(getChildCount());
        uor uorVar = this.j;
        if (b2 != null) {
            uorVar.a = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            uorVar.b = View.MeasureSpec.makeMeasureSpec(this.y, Integer.MIN_VALUE);
            uorVar.d = this.y;
        } else {
            uorVar.a = this.r;
            uorVar.b = this.s;
            uorVar.d = size2;
        }
        uorVar.c = size;
        uorVar.e = list;
        uorVar.f = this.x;
        uorVar.g = this.w;
        lpr a3 = b2.a(uorVar);
        this.k = a3;
        int size3 = a3.c.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.k.c.get(i3).a = uorVar.e.get(i3).a;
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            u0u0 u0u0Var = this.k.c.get(i4);
            int i5 = u0u0Var.d - u0u0Var.b;
            u0u0 u0u0Var2 = this.k.c.get(i4);
            int i6 = u0u0Var2.e - u0u0Var2.c;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            View childAt = getChildAt(i4);
            if (childAt == null) {
                z = z2;
            } else {
                boolean z3 = i4 == 0 ? true : z2;
                if (this.c) {
                    CropableImageContainer cropableImageContainer = (CropableImageContainer) childAt.findViewById(R.id.cropContainer);
                    if (cropableImageContainer != null) {
                        boolean z4 = (!(this.h && getChildCount() == 1) && this.h) ? z2 : true;
                        qik imageLayer = cropableImageContainer.getImageLayer();
                        if ((this.h && getChildCount() > 1) || (photoAttachment = imageLayer.getPhotoAttachment()) == null || (cropsForRatio = this.u) == null || (a2 = cropsForRatio.a()) == null) {
                            imageCropData = null;
                        } else {
                            Iterator<T> it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next = it.next();
                                if (epx.f(((ImageCropData) next).b(), photoAttachment.Hb())) {
                                    obj = next;
                                    break;
                                }
                            }
                            imageCropData = (ImageCropData) obj;
                        }
                        qik imageLayer2 = cropableImageContainer.getImageLayer();
                        imageLayer2.e = z4;
                        imageLayer2.g = z4;
                        imageLayer2.c.h = imageCropData;
                        if (z3 && this.v == null && (((this.h && getChildCount() == 1) || !this.h) && (cropsForRatio2 = this.u) != null && cropsForRatio2.a)) {
                            PreviewRatio b3 = cropsForRatio2.b();
                            if (b3 != null) {
                                cropableImageContainer.f = b3;
                                cropableImageContainer.e = true;
                                if (cropableImageContainer.d) {
                                    cropableImageContainer.c.a(b3, cropableImageContainer.b.getHasMoreVerticalSpace());
                                    cropableImageContainer.e = false;
                                }
                            }
                            this.v = cropableImageContainer;
                        }
                    }
                } else {
                    PostingItemWrapper postingItemWrapper = (PostingItemWrapper) childAt.findViewById(R.id.wrapper);
                    if (postingItemWrapper != null) {
                        postingItemWrapper.setWrapContent((!this.h || getChildCount() == 1) ? Boolean.TRUE : null);
                    }
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof c) {
                    uzt0 uzt0Var = ((c) layoutParams).a.a;
                    int[] iArr = this.k.d;
                    z = false;
                    uzt0Var.a = i4 == iArr[0];
                    uzt0Var.b = i4 == iArr[1];
                    uzt0Var.c = i4 == iArr[2];
                    uzt0Var.d = i4 == iArr[3];
                } else {
                    z = false;
                }
                if (!this.d.a().t()) {
                    getCornersStateKeeper().a(childAt, this.k.c.get(i4));
                }
            }
            i4++;
            z2 = z;
        }
        lpr lprVar = this.k;
        setMeasuredDimension(lprVar.a + paddingRight, lprVar.b + paddingBottom);
        gzs<s3q0> gzsVar = this.t;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.t = null;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        getCornersStateKeeper().h(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        getCornersStateKeeper().b(view);
        super.onViewRemoved(view);
    }

    public final void setChildInnerRadius(float f) {
        if (this.B == f) {
            return;
        }
        this.B = f;
        requestLayout();
        invalidate();
    }

    public final void setChildOuterRadius(float f) {
        if (this.A == f) {
            return;
        }
        this.A = f;
        requestLayout();
        invalidate();
    }

    public final void setConfigRatioCarousel(gzs<CarouselRatio> gzsVar) {
        this.g = gzsVar;
    }

    public final void setCurrentPlacement(CropsForRatio cropsForRatio) {
        this.u = cropsForRatio;
    }

    public final void setDecoration(b bVar) {
        this.z = bVar;
    }

    public final void setImagesAdapter(qbq qbqVar) {
        this.p = qbqVar;
        qbqVar.u = this;
    }

    public final void setMinItemSize(int i) {
        this.w = i;
    }

    public final void setMoveAllowedProvider(d dVar) {
        this.n = dVar;
    }

    public final void setMoveCallback(e eVar) {
        this.o = eVar;
    }

    public final void setPreferredHeight(int i) {
        this.y = i;
    }

    public final void setScrollToPosition(izs<? super Integer, s3q0> izsVar) {
        this.e = izsVar;
    }

    public final void setSpacing(int i) {
        this.x = i;
        this.j.f = i;
    }

    public final void setWidthScreenView(int i) {
        this.f = i;
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

    /* compiled from: FlexLayout.kt */
    public interface b {
        default boolean c(Canvas canvas, View view, oor oorVar) {
            return ((Boolean) oorVar.invoke()).booleanValue();
        }

        default void e(View view, Canvas canvas) {
        }

        default void f(Canvas canvas, ror rorVar) {
        }
    }
}
