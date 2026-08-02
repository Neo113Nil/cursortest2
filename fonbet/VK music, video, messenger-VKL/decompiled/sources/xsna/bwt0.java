package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.ArticleVh;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Image;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vkontakte.android.VKApplication;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.vqo0;

/* compiled from: ViewExt.kt */
/* loaded from: classes.dex */
public final class bwt0 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final bpn0 b;
    public static final Rect c;
    public static final wqo0 d;

    /* compiled from: ViewExt.kt */
    /* loaded from: classes18.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ izs<View, s3q0> d;

        public c(int i, View view, izs izsVar) {
            this.b = view;
            this.c = i;
            this.d = izsVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (this.c != view.getVisibility()) {
                this.d.invoke(view);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: ViewExt.kt */
    /* loaded from: classes18.dex */
    public static final class d implements View.OnLayoutChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ izs<T, s3q0> c;

        /* JADX WARN: Incorrect types in method signature: (TT;Lxsna/izs<-TT;Lxsna/s3q0;>;)V */
        public d(View view, izs izsVar) {
            this.b = view;
            this.c = izsVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2 = this.b;
            view2.removeOnLayoutChangeListener(this);
            this.c.invoke(view2);
        }
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes18.dex */
    public static final class e implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ izs<View, s3q0> c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(View view, izs<? super View, s3q0> izsVar) {
            this.b = view;
            this.c = izsVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            this.c.invoke(view);
            return true;
        }
    }

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(bwt0.class, "location", "getLocation()[I");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new bpn0(new u0f(12));
        c = new Rect();
        d = new wqo0(new dr6(19));
    }

    public static final View A(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static final pxo0 B() {
        return (pxo0) b.getValue();
    }

    public static final Rect C(View view) {
        view.getLocationOnScreen(z());
        int i = z()[0];
        int i2 = z()[1];
        return new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static final float D(View view) {
        if (view.getVisibility() != 0 || view.getWindowVisibility() != 0 || view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !view.isAttachedToWindow()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        Rect F = F(view);
        return (F.height() * F.width()) / (view.getMeasuredWidth() * view.getMeasuredHeight());
    }

    public static final float E(Rect rect, View view) {
        if (view.getVisibility() != 0 || view.getWindowVisibility() != 0 || view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !view.isAttachedToWindow() || !view.getGlobalVisibleRect(rect)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (rect.height() * rect.width()) / (view.getMeasuredWidth() * view.getMeasuredHeight());
    }

    public static final Rect F(View view) {
        return w11.d(view);
    }

    public static final RectF G(View view) {
        RectF rectF = new RectF();
        rectF.set(F(view));
        return rectF;
    }

    public static final void H(View view) {
        if ((view.getSystemUiVisibility() & 5380) != 5380) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 5382);
        }
    }

    public static final View I(int i, ViewGroup viewGroup, boolean z) {
        return tf3.b(viewGroup, i, viewGroup, z);
    }

    public static final boolean J(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean K(View view) {
        return view.getVisibility() == 0;
    }

    public static final void L(VKImageView vKImageView, Image image) {
        S(vKImageView, new yyq0(3, vKImageView, image));
    }

    public static final int M(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int N(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int O(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int P(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final void Q(View view, int i, Object obj) {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            view.setTag(i, obj);
        }
    }

    @ozl
    public static final void R(View view, yzs<? super View, ? super Integer, ? super Integer, s3q0> yzsVar) {
        view.addOnLayoutChangeListener(new tc80(new s0r(yzsVar, 3)));
    }

    public static final <T extends View> void S(T t, izs<? super T, s3q0> izsVar) {
        if (t.getMeasuredHeight() > 0 || t.getMeasuredWidth() > 0) {
            izsVar.invoke(t);
        } else {
            t.addOnLayoutChangeListener(new d(t, izsVar));
        }
    }

    public static final void T(View view, izs<? super View, s3q0> izsVar) {
        view.getViewTreeObserver().addOnPreDrawListener(new e(view, izsVar));
    }

    public static final void U(View view, owt0 owt0Var) {
        if (owt0Var == null) {
            owt0Var = null;
        }
        if (owt0Var != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(owt0Var);
        }
    }

    public static final void V(View view, gzs<s3q0> gzsVar) {
        view.addOnLayoutChangeListener(new lwt0(view, gzsVar, 0L));
    }

    public static final void W(View view, float f, float f2, sp2 sp2Var) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(sp2Var);
        view.startAnimation(scaleAnimation);
    }

    public static final void X(int i, View view) {
        view.setBackground(m33.a(i, view.getContext()));
    }

    public static final void Y(View view, int i, int i2, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i, e3m.f(i2, view.getContext()));
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            gradientDrawable.setCornerRadius(f);
        }
        view.setForeground(gradientDrawable);
    }

    public static final void Z(int i, View view) {
        dhr0.a.e0(i, view);
    }

    public static void a(View view, boolean z, boolean z2, long j, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        long j2 = (i & 4) != 0 ? 300L : j;
        long j3 = (i & 8) != 0 ? 0L : 300L;
        boolean z3 = (i & 32) == 0;
        if (!K(view) && z) {
            if (z2) {
                d3m.c(view, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : j3, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                view.setVisibility(0);
            }
        }
        if (!K(view) || z) {
            return;
        }
        if (z2) {
            d3m.e(view, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : z3);
        } else if (z3) {
            f4m.j(view);
        } else {
            view.setVisibility(4);
        }
    }

    public static final void a0(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.3f);
    }

    public static final boolean b() {
        return B().a();
    }

    public static final void b0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
        }
    }

    public static final boolean c(long j) {
        return B().b(j);
    }

    public static final void c0(int i, View view) {
        m0(view.getLayoutParams().width, i, view);
    }

    public static final void d(View view, float f, boolean z, boolean z2) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new s0w0(f, z, z2));
    }

    public static final void d0(View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final void e0(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.bottomMargin = i4;
        view.setLayoutParams(marginLayoutParams);
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.q f(EditText editText) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new he40(editText, 20));
    }

    public static /* synthetic */ void f0(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = N(view);
        }
        if ((i5 & 2) != 0) {
            i2 = P(view);
        }
        if ((i5 & 4) != 0) {
            i3 = O(view);
        }
        if ((i5 & 8) != 0) {
            i4 = M(view);
        }
        e0(view, i, i2, i3, i4);
    }

    public static final void g(View view, gzs<s3q0> gzsVar) {
        view.addOnAttachStateChangeListener(new a(view, gzsVar));
    }

    public static final void g0(View view, izs<? super View, s3q0> izsVar) {
        view.setOnClickListener(new lo3(new t01(izsVar, 10), 6));
    }

    public static void h(View view, gzs gzsVar) {
        view.addOnLayoutChangeListener(new j8p(1, view, gzsVar));
    }

    public static final void h0(View.OnClickListener onClickListener, View view) {
        if (onClickListener == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(jjc.h(onClickListener));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View$OnLayoutChangeListener, java.lang.Object, xsna.vvt0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, xsna.wvt0] */
    public static final void i(final View view, final long j, final izs<? super View, s3q0> izsVar, gzs<s3q0> gzsVar) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ?? r4 = new View.OnLayoutChangeListener() { // from class: xsna.vvt0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Handler handler2 = handler;
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed((Runnable) ref$ObjectRef.element, j);
            }
        };
        a2d a2dVar = new a2d(handler, gzsVar, view, r4, 3);
        ref$ObjectRef.element = new Runnable() { // from class: xsna.wvt0
            @Override // java.lang.Runnable
            public final void run() {
                handler.removeCallbacksAndMessages(null);
                View view2 = view;
                view2.removeOnLayoutChangeListener(r4);
                izsVar.invoke(view2);
            }
        };
        view.addOnLayoutChangeListener(r4);
        view.addOnAttachStateChangeListener(new cwt0(view, a2dVar));
        handler.postDelayed((Runnable) ref$ObjectRef.element, j);
    }

    public static final void i0(View view, izs<? super View, s3q0> izsVar) {
        view.setOnClickListener(new t01(izsVar, 10));
    }

    public static void j(View view, izs izsVar) {
        i(view, 300L, izsVar, null);
    }

    public static final void j0(View view, final izs<? super View, s3q0> izsVar, final long j) {
        view.setOnClickListener(new View.OnClickListener() { // from class: xsna.svt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (bwt0.B().b(j)) {
                    return;
                }
                izsVar.invoke(view2);
            }
        });
    }

    public static final void k(View view, izs<? super View, s3q0> izsVar) {
        c cVar = new c(view.getVisibility(), view, izsVar);
        view.getViewTreeObserver().addOnGlobalLayoutListener(cVar);
        view.addOnAttachStateChangeListener(new b(view, view, cVar));
    }

    public static final void k0(View view, final izs<? super View, Boolean> izsVar) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.nvt0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                if (bwt0.B().a()) {
                    return true;
                }
                return ((Boolean) izs.this.invoke(view2)).booleanValue();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, xsna.ovt0] */
    public static final WeakReference<Handler> l(final View view, final long j, final izs<? super View, s3q0> izsVar, izs<? super WeakReference<Handler>, s3q0> izsVar2) {
        if (!K(view)) {
            throw new IllegalStateException("view should be visible");
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        WeakReference<Handler> weakReference = new WeakReference<>(handler);
        final Rect rect = new Rect(0, 0, 0, 0);
        final Rect rect2 = new Rect(0, 0, iah0.f().widthPixels, iah0.f().heightPixels);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = F(view);
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        hf80 hf80Var = new hf80(izsVar2, weakReference, handler, 3);
        ref$ObjectRef2.element = new Runnable() { // from class: xsna.ovt0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [T, android.graphics.Rect, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ?? F = bwt0.F(view2);
                boolean equals = F.equals(rect);
                Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                Handler handler2 = handler;
                if (!equals && F.equals(ref$ObjectRef3.element) && rect2.contains(F)) {
                    handler2.removeCallbacksAndMessages(null);
                    izsVar.invoke(view2);
                } else if (view2.isAttachedToWindow() && bwt0.K(view2)) {
                    ref$ObjectRef3.element = F;
                    handler2.postDelayed((Runnable) ref$ObjectRef2.element, j);
                }
            }
        };
        view.addOnAttachStateChangeListener(new cwt0(view, hf80Var));
        if (view.isAttachedToWindow()) {
            handler.postDelayed((Runnable) ref$ObjectRef2.element, j);
            return weakReference;
        }
        g(view, new gzs() { // from class: xsna.pvt0
            @Override // xsna.gzs
            public final Object invoke() {
                handler.postDelayed((Runnable) ref$ObjectRef2.element, j);
                return s3q0.a;
            }
        });
        return weakReference;
    }

    public static final void l0(Toolbar toolbar, izs<? super MenuItem, Boolean> izsVar) {
        toolbar.setOnMenuItemClickListener(new vgc(izsVar));
    }

    public static final void m0(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == layoutParams.width && i2 == layoutParams.height) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void n(View view, izs izsVar) {
        l(view, 300L, izsVar, null);
    }

    public static final void n0(View view, Size size) {
        m0(size.getWidth(), size.getHeight(), view);
    }

    public static final void o(View view, gzs<s3q0> gzsVar) {
        Activity h = e3m.h(view.getContext());
        if (h != null) {
            Window window = h.getWindow();
            if (window == null || !window.isActive()) {
                g(view, gzsVar);
            } else {
                gzsVar.invoke();
            }
        }
    }

    public static final void o0(AppCompatImageView appCompatImageView, int i) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
    }

    public static View p(View view, int i, View.OnClickListener onClickListener, izs izsVar, int i2) {
        View view2 = null;
        if ((i2 & 2) != 0) {
            onClickListener = null;
        }
        if ((i2 & 4) != 0) {
            izsVar = new t6c0(15);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            izsVar.invoke(findViewById);
            if (onClickListener != null) {
                h0(onClickListener, findViewById);
            }
            view2 = findViewById;
        }
        if (view2 != null) {
            return view2;
        }
        StringBuilder sb = new StringBuilder("View not found: ");
        Context context = view.getContext();
        bpn0 bpn0Var = enj.a;
        sb.append(context.getResources().getResourceName(i));
        throw new IllegalStateException(sb.toString());
    }

    public static final void p0(View view, boolean z) {
        if (z != K(view)) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static View q(View view, int i, ArticleVh articleVh, int i2) {
        if ((i2 & 2) != 0) {
            articleVh = null;
        }
        jyq0 jyq0Var = new jyq0(5);
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        jyq0Var.invoke(findViewById);
        if (articleVh != null) {
            h0(articleVh, findViewById);
        }
        return findViewById;
    }

    public static final void q0(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.weight = f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends View> T r(ViewParent viewParent, int i) {
        if (!(viewParent instanceof View)) {
            return null;
        }
        View view = (View) viewParent;
        T t = (T) view.findViewById(i);
        return t == null ? (T) r(view.getParent(), i) : t;
    }

    public static final void r0(int i, View view) {
        m0(i, view.getLayoutParams().height, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ozl
    public static final View s(ViewParent viewParent, izs<? super View, Boolean> izsVar) {
        View view;
        Trace.beginSection(ndp0.f("ViewExt.findViewByIdFromBottomHelper"));
        try {
            if ((viewParent instanceof View) && izsVar.invoke((View) viewParent).booleanValue()) {
                view = (View) viewParent;
            } else if (viewParent instanceof ViewGroup) {
                int childCount = ((ViewGroup) viewParent).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((ViewGroup) viewParent).getChildAt(i);
                    if (izsVar.invoke(childAt).booleanValue()) {
                        return childAt;
                    }
                }
                view = s(((View) viewParent).getParent(), izsVar);
            } else {
                view = null;
            }
            return view;
        } finally {
            Trace.endSection();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void s0(View view, final float f) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.mvt0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    d3m.b(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                    ViewPropertyAnimator animate = view2.animate();
                    float f2 = f;
                    animate.scaleX(f2).scaleY(f2).setDuration(200L).start();
                    return false;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                d3m.b(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
                return false;
            }
        });
    }

    public static final Context t(Context context) {
        return context instanceof lpj ? new l7s(context, ((lpj) context).getThemeResId()) : context instanceof ContextThemeWrapper ? new l7s(context, ((ContextThemeWrapper) context).getTheme()) : context;
    }

    public static void t0(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final l7s u(Context context) {
        dhr0.a.getClass();
        return new l7s(context, dhr0.u().c);
    }

    public static final int u0(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return M(view) + view.getMeasuredHeight() + P(view);
    }

    public static final l7s v(Context context) {
        dhr0.a.getClass();
        return new l7s(context, dhr0.z().c);
    }

    public static final int v0(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return O(view) + view.getMeasuredWidth() + N(view);
    }

    public static final Activity w(View view) {
        while (view != null && !(view.getContext() instanceof Activity)) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        Context context = view != null ? view.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static final float w0(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
        float max = videoAutoPlaySeekBarView2.getMax() - videoAutoPlaySeekBarView2.getMin();
        return max <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : swe0.f((i - videoAutoPlaySeekBarView2.getMin()) / max, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public static final ViewTreeObserver x(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            return viewTreeObserver;
        }
        return null;
    }

    public static final int y(int i, View view) {
        return (int) view.getResources().getDimension(i);
    }

    public static final int[] z() {
        qcy<Object> qcyVar = a[0];
        wqo0 wqo0Var = d;
        wqo0Var.getClass();
        return (int[]) vqo0.a.a(wqo0Var);
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes18.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ gzs<s3q0> c;

        public a(View view, gzs<s3q0> gzsVar) {
            this.b = view;
            this.c = gzsVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes18.dex */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ c d;

        public b(View view, View view2, c cVar) {
            this.b = view;
            this.c = view2;
            this.d = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
