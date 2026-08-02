package xsna;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.f2f0;
import xsna.hxb0;
import xsna.hxb0.a;

/* compiled from: FeedReactionsPopupView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes18.dex */
public final class m3r extends ViewGroup {
    public static final /* synthetic */ int R = 0;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public final Rect I;
    public final Rect J;
    public final bpn0 K;
    public final bpn0 L;
    public final k6f0 M;
    public final VkContentBadge[] N;
    public final a6f0 O;
    public final z5f0 P;
    public final r2f0 Q;
    public final ArrayList b;
    public final y6f0 c;
    public final bbb0 d;
    public final b6f0 e;
    public final x2f0 f;
    public final nij g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final Handler u;
    public int v;
    public final int[] w;
    public int x;
    public int y;
    public int z;

    public m3r(Context context, ArrayList arrayList, y6f0 y6f0Var, x7d x7dVar, bbb0 bbb0Var, b6f0 b6f0Var, x2f0 x2f0Var, nij nijVar) {
        super(context);
        this.b = arrayList;
        this.c = y6f0Var;
        this.d = bbb0Var;
        this.e = b6f0Var;
        this.f = x2f0Var;
        this.g = nijVar;
        int i = y6f0Var.b;
        this.h = i;
        int i2 = y6f0Var.e;
        this.i = i2;
        int i3 = y6f0Var.f;
        this.j = i3;
        int i4 = y6f0Var.g;
        this.k = i4;
        int i5 = i4 - i2;
        this.l = i5;
        int i6 = i2 + i + i3;
        this.m = i6;
        this.n = y6f0Var.n;
        this.o = y6f0Var.h;
        this.p = y6f0Var.i;
        this.q = y6f0Var.j;
        this.r = y6f0Var.k;
        this.s = (arrayList.size() * i6) + i5 + (i4 - i3) + getSeparatorWidth();
        int i7 = (i4 * 2) + i;
        this.t = i7;
        this.u = new Handler(Looper.getMainLooper());
        this.w = new int[2];
        this.D = -1;
        this.E = 1.0f;
        this.G = i7;
        this.H = this.v;
        this.I = new Rect();
        this.J = new Rect();
        final int i8 = 0;
        this.K = new bpn0(new i3r(context, 0));
        this.L = new bpn0(new j3r(context, i8));
        this.M = new k6f0(context, arrayList, y6f0Var);
        int size = arrayList.size();
        VkContentBadge[] vkContentBadgeArr = new VkContentBadge[size];
        for (int i9 = 0; i9 < size; i9++) {
            String str = null;
            VkContentBadge vkContentBadge = new VkContentBadge(context, null, 6);
            vkContentBadge.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            vkContentBadge.setSize(VkContentBadge.Size.Medium);
            vkContentBadge.setMode(VkContentBadge.Mode.Primary);
            vkContentBadge.setCapsule(true);
            Integer num = this.c.m;
            cut0 x7gVar = num != null ? new x7g(num.intValue()) : null;
            vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(x7gVar == null ? new z7g(this.c.l) : x7gVar, new x7g(R.attr.vk_ui_background_content_inverse), null, 12));
            f2f0 f2f0Var = (f2f0) j5g.b0(i9, this.b);
            if (f2f0Var != null) {
                str = f2f0Var.getTitle();
            }
            vkContentBadge.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkContentBadge.setText(str);
            addView(vkContentBadge);
            s3q0 s3q0Var = s3q0.a;
            vkContentBadgeArr[i9] = vkContentBadge;
        }
        this.N = vkContentBadgeArr;
        a6f0 a6f0Var = new a6f0(this, this.M, vkContentBadgeArr, this.b, this.c, this.f, this.g);
        this.O = a6f0Var;
        z5f0 z5f0Var = new z5f0(this, this.M, this.f, x7dVar, a6f0Var);
        this.P = z5f0Var;
        r2f0 r2f0Var = new r2f0(this, z5f0Var);
        this.Q = r2f0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        iut0.q(this, r2f0Var);
        addView(this.M, new ViewGroup.MarginLayoutParams(-1, this.t));
        this.M.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.k3r
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                m3r m3rVar = m3r.this;
                m3rVar.requestLayout();
                m3rVar.M.post(new vb(m3rVar, 8));
            }
        });
        int length = this.M.getReactionViews().length;
        while (i8 < length) {
            this.M.getReactionViews()[i8].setOnClickListener(new View.OnClickListener() { // from class: xsna.g3r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m3r.this.P.f.c(i8);
                }
            });
            i8++;
        }
    }

    public static void a(View view, ViewGroup viewGroup) {
        if (view.getParent() != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
                s3q0 s3q0Var = s3q0.a;
            }
            viewGroup.addView(view);
        }
    }

    private final NinePatchDrawable getPopupBackground() {
        return (NinePatchDrawable) this.K.getValue();
    }

    private final NinePatchDrawable getPopupShadowBackground() {
        return (NinePatchDrawable) this.L.getValue();
    }

    private final int getSeparatorWidth() {
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((f2f0) it.next()) instanceof f2f0.a) {
                return cn70.b(17);
            }
        }
        return 0;
    }

    public final void b(float f) {
        NinePatchDrawable popupShadowBackground = getPopupShadowBackground();
        if (popupShadowBackground != null) {
            popupShadowBackground.setAlpha(swe0.g(an10.b(255 * f), 0, 255));
        }
        NinePatchDrawable popupBackground = getPopupBackground();
        if (popupBackground != null) {
            popupBackground.setColorFilter(new PorterDuffColorFilter(n8g.l(dhr0.t.c(this.c.a), swe0.g(an10.b(Color.alpha(r4) * f), 0, 255)), PorterDuff.Mode.SRC_IN));
        }
    }

    public final void c() {
        a6f0 a6f0Var = this.O;
        a6f0Var.b();
        b3f0 b3f0Var = a6f0Var.d;
        m3r m3rVar = b3f0Var.a;
        m3rVar.setVisibility(0);
        m3rVar.i();
        m3rVar.setPopupVisibility$design_release(false);
        m3rVar.setPopupHideInProgress$design_release(true);
        for (f3r f3rVar : m3rVar.M.getReactionViews()) {
            f3rVar.a();
        }
        ((AnimatorSet) b3f0Var.k.getValue()).start();
        m3rVar.postOnAnimationDelayed(b3f0Var.j, b3f0.m);
    }

    public final int d(float f, float f2) {
        if (!this.O.a() || !f(f, f2)) {
            return -1;
        }
        w1r[] reactionContainerViews = this.M.getReactionContainerViews();
        int length = reactionContainerViews.length;
        for (int i = 0; i < length; i++) {
            w1r w1rVar = reactionContainerViews[i];
            int[] location = w1rVar.getLocation();
            if (e(w1rVar)) {
                int i2 = location[0];
                if (f >= i2 - this.i && f <= w1rVar.getMeasuredWidth() + i2 + this.j) {
                    int i3 = location[1];
                    int i4 = this.k;
                    if (f2 >= i3 - i4 && f2 <= w1rVar.getMeasuredHeight() + i3 + i4) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i = this.t;
        float f = this.E;
        float f2 = ((1.0f - f) * i) / 2.0f;
        int i2 = this.x;
        int i3 = this.o;
        int b = an10.b(((-i3) / f) - f2) + i2;
        int b2 = an10.b(f2 - (this.p / this.E)) + this.F + this.y;
        int i4 = this.x;
        int i5 = this.q;
        float f3 = this.E;
        int b3 = an10.b(((this.H * f3) + (i5 / f3)) - f2) + i4;
        int i6 = this.F + this.y;
        float f4 = this.r;
        float f5 = this.E;
        int b4 = an10.b((this.G * f5) + (f4 / f5) + f2) + i6;
        Rect rect = this.J;
        rect.set(b, b2, b3, b4);
        float f6 = this.x;
        float f7 = -i3;
        float f8 = this.E;
        float f9 = ((((i5 / f8) + (f7 / f8)) + i) / 2.0f) + f6;
        canvas.save();
        float f10 = this.E;
        canvas.scale(f10, f10, f9, rect.centerY());
        NinePatchDrawable popupShadowBackground = getPopupShadowBackground();
        if (popupShadowBackground != null) {
            popupShadowBackground.setBounds(rect);
        }
        NinePatchDrawable popupShadowBackground2 = getPopupShadowBackground();
        if (popupShadowBackground2 != null) {
            popupShadowBackground2.draw(canvas);
        }
        NinePatchDrawable popupBackground = getPopupBackground();
        if (popupBackground != null) {
            popupBackground.setBounds(rect);
        }
        NinePatchDrawable popupBackground2 = getPopupBackground();
        if (popupBackground2 != null) {
            popupBackground2.draw(canvas);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.Q.d.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final boolean e(w1r w1rVar) {
        k6f0 k6f0Var = this.M;
        int[] location = k6f0Var.getLocation();
        int[] location2 = w1rVar.getLocation();
        int i = location[0];
        int i2 = location2[0];
        if (i <= i2) {
            if (w1rVar.getMeasuredWidth() + i2 <= k6f0Var.getMeasuredWidth() + location[0]) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(float f, float f2) {
        int[] location = this.M.getLocation();
        if (f >= location[0] && f <= r0.getMeasuredWidth() + r3) {
            if (f2 >= location[1] && f2 <= r0.getMeasuredHeight() + r1) {
                return true;
            }
        }
        return false;
    }

    public final void g(View view, w1r w1rVar, boolean z) {
        if (!z) {
            a(view, w1rVar);
        } else if (e(w1rVar)) {
            a(view, this);
        } else {
            a(view, w1rVar);
        }
    }

    public final int getDialogHeight$design_release() {
        return this.t;
    }

    public final int getDialogWidth$design_release() {
        return this.v;
    }

    public int[] getLocation() {
        int[] iArr = this.w;
        getLocationOnScreen(iArr);
        return iArr;
    }

    public final int getPopupTranslationY() {
        return this.F;
    }

    public final List<f2f0> getReactions() {
        return this.b;
    }

    public final k6f0 getScrollView() {
        return this.M;
    }

    public final int getSelectedPosition$design_release() {
        if (this.O.a()) {
            return this.D;
        }
        return -1;
    }

    public final int getSelectedReactionPosition() {
        return this.D;
    }

    public final void h(Integer num) {
        k6f0 k6f0Var = this.M;
        int length = k6f0Var.getReactionViews().length;
        for (int i = 0; i < length; i++) {
            if (num == null || i != num.intValue()) {
                a(k6f0Var.getReactionViews()[i], k6f0Var.getReactionContainerViews()[i]);
            }
        }
    }

    public final void i() {
        k6f0 k6f0Var = this.M;
        int length = k6f0Var.getReactionViews().length;
        for (int i = 0; i < length; i++) {
            g(k6f0Var.getReactionViews()[i], k6f0Var.getReactionContainerViews()[i], true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.O.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = (View) this.d.invoke();
        Rect rect = (Rect) this.e.invoke();
        if (view == null || !view.isAttachedToWindow() || rect.isEmpty()) {
            post(new p31(this, 12));
            return;
        }
        boolean z2 = this.C;
        if (!z2) {
            getLocationOnScreen(this.w);
            if (rect.isEmpty()) {
                post(new qd0(this, 8));
                return;
            }
        }
        int i5 = this.x;
        int i6 = this.y;
        k6f0 k6f0Var = this.M;
        if (k6f0Var.getVisibility() != 8) {
            int measuredWidth = k6f0Var.getMeasuredWidth();
            int measuredHeight = k6f0Var.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = k6f0Var.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i7 = i5 + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            int i8 = i6 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            k6f0Var.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        }
        Rect rect2 = this.I;
        if (!z2) {
            getGlobalVisibleRect(rect2);
        }
        int length = k6f0Var.getReactionContainerViews().length;
        for (int i9 = 0; i9 < length; i9++) {
            w1r w1rVar = k6f0Var.getReactionContainerViews()[i9];
            f3r f3rVar = k6f0Var.getReactionViews()[i9];
            VkContentBadge vkContentBadge = this.N[i9];
            Rect rect3 = w1rVar.c;
            w1rVar.getGlobalVisibleRect(rect3);
            if (f3rVar.getParent() == this) {
                int i10 = rect3.left;
                int i11 = rect2.left;
                int i12 = rect3.top;
                int i13 = rect2.top;
                f3rVar.layout(i10 - i11, i12 - i13, rect3.right - i11, rect3.bottom - i13);
            }
            int i14 = (rect3.top - rect2.top) - this.n;
            int measuredHeight2 = i14 - vkContentBadge.getMeasuredHeight();
            int centerX = (rect3.centerX() - rect2.left) - (vkContentBadge.getMeasuredWidth() / 2);
            int i15 = this.z;
            if (centerX < i15) {
                centerX = i15;
            } else if (vkContentBadge.getMeasuredWidth() + centerX > getMeasuredWidth() - this.A) {
                centerX = (getMeasuredWidth() - this.A) - vkContentBadge.getMeasuredWidth();
            }
            vkContentBadge.layout(centerX, measuredHeight2, vkContentBadge.getMeasuredWidth() + centerX, i14);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        for (VkContentBadge vkContentBadge : this.N) {
            vkContentBadge.measure(0, 0);
        }
        super.onMeasure(i, i2);
        Rect rect = (Rect) this.e.invoke();
        boolean z = this.C;
        int[] iArr = this.w;
        if (!z) {
            getLocationOnScreen(iArr);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            View view = (View) this.d.invoke();
            if (rect.isEmpty() || view == null || !view.isAttachedToWindow() || (i3 = rect.top) > size2 + iArr[1] || view.getMeasuredHeight() + i3 < iArr[1] || (i4 = rect.left) > size + iArr[0] || view.getMeasuredWidth() + i4 < iArr[0]) {
                post(new b3m(this, 1));
                return;
            }
        }
        int measuredWidth = getMeasuredWidth();
        y6f0 y6f0Var = this.c;
        int i5 = y6f0Var.p;
        int i6 = y6f0Var.o;
        int i7 = y6f0Var.p;
        int i8 = y6f0Var.q;
        int i9 = (measuredWidth - i5) - i8;
        int i10 = this.s;
        if (i10 < i9) {
            this.z = i5;
            this.A = i8;
            this.v = i10;
        } else {
            int measuredWidth2 = getMeasuredWidth();
            int i11 = y6f0Var.r;
            int i12 = y6f0Var.s;
            if (i10 < (measuredWidth2 - i11) - i12) {
                this.z = i11;
                this.A = i12;
                this.v = i10;
            } else {
                this.z = i7;
                this.A = i8;
                int measuredWidth3 = (getMeasuredWidth() - i7) - i8;
                int i13 = this.l;
                int i14 = this.m;
                int i15 = ((measuredWidth3 - i13) / i14) - 1;
                if (i15 < 0) {
                    i15 = 0;
                }
                this.v = (i14 / 2) + (i15 * i14) + i13;
            }
        }
        int width = (rect.width() / 2) + (rect.left - iArr[0]);
        int i16 = this.v;
        int i17 = width - (i16 / 2);
        this.x = i17;
        int i18 = this.z;
        if (i17 < i18) {
            this.x = i18;
        } else if (i17 + i16 > getMeasuredWidth() - this.A) {
            this.x = (getMeasuredWidth() - this.v) - this.A;
        }
        boolean z2 = this.C;
        int i19 = this.t;
        if (!z2) {
            int i20 = rect.top;
            int i21 = ((i20 - i19) - i6) - iArr[1];
            this.y = i21;
            if (i21 < y6f0Var.t) {
                this.y = ((rect.height() + i20) + i6) - iArr[1];
            }
        }
        this.M.measure(tr.a(this.v, 1073741823, 0, 1073741824), tr.a(i19, 1073741823, 0, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.B || (view = (View) this.d.invoke()) == null) {
            return;
        }
        p3h p3hVar = new p3h(this, 15);
        nwk nwkVar = new nwk(this, 7);
        Handler handler = this.u;
        handler.removeCallbacksAndMessages(null);
        view.addOnAttachStateChangeListener(new l3r(view, new k5h(this, 13)));
        if (view.isAttachedToWindow()) {
            handler.postDelayed(new h3r(this, p3hVar, nwkVar, 0), 50L);
        } else {
            bwt0.g(view, new xah(this, p3hVar, nwkVar, 3));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int findPointerIndex2;
        int findPointerIndex3;
        int findPointerIndex4;
        int findPointerIndex5;
        boolean a = this.O.a();
        z5f0 z5f0Var = this.P;
        hxb0 hxb0Var = z5f0Var.f;
        hxb0 hxb0Var2 = z5f0Var.f;
        hxb0Var.g = a;
        ugh0 ugh0Var = z5f0Var.e;
        m3r m3rVar = z5f0Var.a;
        jj5 jj5Var = z5f0Var.g;
        k6f0 k6f0Var = z5f0Var.b;
        boolean z = false;
        if (!z5f0Var.o) {
            int action = motionEvent.getAction() & 255;
            Integer num = null;
            r10 = null;
            Integer num2 = null;
            num = null;
            if (action == 0) {
                int i = z5f0Var.h;
                if (i == -1) {
                    z5f0Var.h = motionEvent.getPointerId(0);
                } else {
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        num = Integer.valueOf(findPointerIndex);
                    }
                    if (num == null) {
                        return false;
                    }
                }
                if (z5f0Var.i == null) {
                    z5f0Var.a();
                    z5f0Var.i = Long.valueOf(System.currentTimeMillis());
                }
                hxb0Var.i = false;
                z5f0Var.c.a();
                boolean f = m3rVar.f(motionEvent.getRawX(), motionEvent.getRawY());
                z5f0Var.n = f;
                z5f0Var.j = Float.valueOf(motionEvent.getRawX());
                ugh0Var.getClass();
                ugh0Var.b = Float.valueOf(motionEvent.getRawX());
                ugh0Var.c = Float.valueOf(motionEvent.getRawY());
                z5f0Var.k = Float.valueOf(motionEvent.getRawX());
                z5f0Var.l = Float.valueOf(motionEvent.getRawY());
                if (!f) {
                    z5f0Var.b();
                    return true;
                }
                k6f0Var.onTouchEvent(motionEvent);
                hxb0Var.a();
                int d = hxb0Var.a.d(motionEvent.getRawX(), motionEvent.getRawY());
                if (d >= 0) {
                    hxb0.a aVar = hxb0Var.new a(d);
                    hxb0Var.f.postDelayed(aVar, hxb0Var.e);
                    hxb0Var.h = aVar;
                }
                jj5Var.b(motionEvent);
                return true;
            }
            if (action == 1) {
                int i2 = z5f0Var.h;
                if (((i2 == -1 || (findPointerIndex2 = motionEvent.findPointerIndex(i2)) == -1) ? null : Integer.valueOf(findPointerIndex2)) == null) {
                    return false;
                }
                z5f0Var.k = null;
                z5f0Var.l = null;
                z5f0Var.h = -1;
                if (z5f0Var.m) {
                    jj5Var.a();
                    hxb0Var2.b();
                    z5f0Var.a();
                    if (z5f0Var.n) {
                        return k6f0Var.onTouchEvent(motionEvent);
                    }
                    return true;
                }
                jj5Var.a();
                int d2 = hxb0Var.a.d(motionEvent.getRawX(), motionEvent.getRawY());
                if (!hxb0Var.g || d2 < 0) {
                    hxb0Var.c.b();
                    return true;
                }
                hxb0Var.c(d2);
                return true;
            }
            if (action == 2) {
                int i3 = z5f0Var.h;
                Integer valueOf = (i3 == -1 || (findPointerIndex3 = motionEvent.findPointerIndex(i3)) == -1) ? null : Integer.valueOf(findPointerIndex3);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    z5f0Var.k = Float.valueOf(motionEvent.getX(intValue));
                    z5f0Var.l = Float.valueOf(motionEvent.getY(intValue));
                    if (z5f0Var.m) {
                        jj5Var.a();
                        hxb0Var2.b();
                        if (z5f0Var.n) {
                            return k6f0Var.onTouchEvent(motionEvent);
                        }
                        return true;
                    }
                    if (z5f0Var.n) {
                        Float f2 = z5f0Var.j;
                        Float valueOf2 = f2 != null ? Float.valueOf(motionEvent.getRawX() - f2.floatValue()) : null;
                        if (valueOf2 != null) {
                            int b = an10.b(valueOf2.floatValue());
                            if (!hxb0Var.i && hxb0Var.a.getSelectedPosition$design_release() < 0 && ugh0Var.a(motionEvent) && k6f0Var.canScrollHorizontally(-b)) {
                                z = true;
                            }
                        }
                    }
                    z5f0Var.m = z;
                    if (z) {
                        jj5Var.a();
                        hxb0Var2.b();
                        if (z5f0Var.n) {
                            return k6f0Var.onTouchEvent(motionEvent);
                        }
                        return true;
                    }
                    if (hxb0Var.g) {
                        hxb0Var.d(motionEvent.getRawX(), motionEvent.getRawY());
                    } else {
                        hxb0Var.b();
                    }
                    jj5Var.b(motionEvent);
                    return true;
                }
            } else {
                if (action == 3) {
                    int i4 = z5f0Var.h;
                    if (((i4 == -1 || (findPointerIndex4 = motionEvent.findPointerIndex(i4)) == -1) ? null : Integer.valueOf(findPointerIndex4)) == null) {
                        return false;
                    }
                    z5f0Var.k = null;
                    z5f0Var.l = null;
                    z5f0Var.h = -1;
                    if (!z5f0Var.m) {
                        jj5Var.a();
                        hxb0Var2.b();
                        z5f0Var.a();
                        m3rVar.c();
                        return true;
                    }
                    jj5Var.a();
                    hxb0Var2.b();
                    z5f0Var.a();
                    if (z5f0Var.n) {
                        return k6f0Var.onTouchEvent(motionEvent);
                    }
                    return true;
                }
                int i5 = z5f0Var.h;
                if (i5 != -1 && (findPointerIndex5 = motionEvent.findPointerIndex(i5)) != -1) {
                    num2 = Integer.valueOf(findPointerIndex5);
                }
                if (num2 != null && z5f0Var.m && z5f0Var.n) {
                    return k6f0Var.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public final void setActivePointerId(int i) {
        this.P.h = i;
    }

    public final void setPopupHeight$design_release(int i) {
        this.G = i;
    }

    public final void setPopupHideInProgress$design_release(boolean z) {
        this.C = z;
    }

    public final void setPopupScale$design_release(float f) {
        this.E = f;
    }

    public final void setPopupTranslationY(int i) {
        this.F = i;
        this.M.setBackgroundTranslation(i);
    }

    public final void setPopupVisibility$design_release(boolean z) {
        this.B = z;
    }

    public final void setPopupWidth$design_release(int i) {
        this.H = i;
    }

    public final void setSelectedPosition$design_release(int i) {
        setSelectedReactionPosition(i);
        if (i >= 0) {
            this.f.c();
        }
    }

    public final void setSelectedReactionPosition(int i) {
        boolean z;
        if (this.D == i) {
            return;
        }
        this.D = i;
        m6f0 m6f0Var = this.O.a;
        ((AnimatorSet) m6f0Var.z.getValue()).cancel();
        m3r m3rVar = m6f0Var.a;
        sx3 sx3Var = m6f0Var.x;
        m3rVar.removeCallbacks(sx3Var);
        float[] fArr = m6f0Var.i;
        float[] fArr2 = m6f0Var.f;
        float[] fArr3 = m6f0Var.e;
        m6f0Var.n = i;
        k6f0 k6f0Var = m6f0Var.b;
        int length = k6f0Var.getReactionViews().length;
        for (int i2 = 0; i2 < length; i2++) {
            f3r f3rVar = k6f0Var.getReactionViews()[i2];
            w1r w1rVar = k6f0Var.getReactionContainerViews()[i2];
            VkContentBadge vkContentBadge = m6f0Var.c[i2];
            if (i == i2) {
                m6f0Var.o = f3rVar.getScale();
                m6f0Var.p = 1.0f;
                m6f0Var.q = f3rVar.getTranslationY();
                m6f0Var.r = m6f0Var.m;
                m6f0Var.s = vkContentBadge.getTranslationY();
                m6f0Var.t = m6f0.B;
                m6f0Var.u = vkContentBadge.getAlpha();
                m6f0Var.v = 1.0f;
            } else {
                fArr3[i2] = f3rVar.getScale();
                fArr2[i2] = m6f0Var.d;
                m6f0Var.k[i2] = vkContentBadge.getAlpha();
                m6f0Var.l[i2] = 0.0f;
                m6f0Var.g[i2] = vkContentBadge.getTranslationY();
                m6f0Var.h[i2] = 0.0f;
                fArr[i2] = f3rVar.getTranslationY();
                m6f0Var.j[i2] = 0.0f;
                if (fArr[i2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr3[i2] == fArr2[i2]) {
                    z = false;
                    m3rVar.g(f3rVar, w1rVar, z);
                }
            }
            z = true;
            m3rVar.g(f3rVar, w1rVar, z);
        }
        if (m3rVar.getSelectedReactionPosition() >= 0) {
            m3rVar.performHapticFeedback(3);
        }
        ((AnimatorSet) m6f0Var.z.getValue()).start();
        m3rVar.postOnAnimationDelayed(sx3Var, 100L);
    }
}
