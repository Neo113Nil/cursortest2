package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.snackbar.HideReason;
import com.vk.core.snackbar.VkSnackbarContentLayout;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.flv0;
import xsna.kkv0;

/* compiled from: CoreSnackbar.kt */
/* loaded from: classes.dex */
public final class utj {
    public static final float w;
    public final Context a;
    public final k b;
    public final i c;
    public final f d;
    public final j e;
    public final h f;
    public final e g;
    public final b h;
    public final c i;
    public final d j;
    public View k;
    public WeakReference<Window> l;
    public WeakReference<ViewGroup> m;
    public jkv0 n;
    public gzs<s3q0> o;
    public izs<? super HideReason, s3q0> p;
    public final l q = new l();
    public final m r = new m();
    public static final int s = iah0.a(56);
    public static final int t = iah0.a(8);
    public static final int u = iah0.a(12);
    public static final int v = iah0.a(0);
    public static final float x = iah0.a(16);

    /* compiled from: CoreSnackbar.kt */
    @ozl
    /* loaded from: classes17.dex */
    public static final class a {
        public final Context a;
        public int b;
        public int c;
        public int d;
        public final int e;
        public final int f;
        public final int g;
        public j89 h;
        public boolean i;
        public Drawable j;
        public Size k;
        public Integer l;
        public float m;
        public String n;
        public String o;
        public izs<? super utj, s3q0> p;
        public long q;
        public View r;
        public gzs<Boolean> s;
        public izs<? super HideReason, s3q0> t;
        public FloatingViewGesturesHelper.SwipeDirection u;
        public final boolean v;
        public final int w;
        public Integer x;
        public final float y;

        public a(Context context) {
            this.a = context;
            int i = utj.s;
            int i2 = utj.s;
            this.b = i2;
            this.c = i2;
            int i3 = utj.t;
            this.d = i3;
            this.e = i3;
            this.f = utj.u;
            this.g = utj.v;
            this.m = 0.7f;
            this.q = 4000L;
            this.u = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
            this.v = true;
            this.w = 3;
            this.y = utj.x;
        }

        public final utj a() {
            i iVar = new i(this.i, false, this.v);
            f fVar = new f(this.b, this.c, this.d, this.e, this.f, this.g);
            k kVar = new k(this.n, this.o, false);
            j jVar = new j(this.r, null);
            h hVar = new h(null, null);
            e eVar = new e(this.p, this.s, this.h);
            b bVar = new b(this.j, this.l, this.k);
            c cVar = new c(null, null);
            FloatingViewGesturesHelper.SwipeDirection swipeDirection = this.u;
            Integer num = this.x;
            utj utjVar = new utj(this.a, kVar, iVar, fVar, jVar, hVar, eVar, bVar, cVar, new d(swipeDirection, this.w, this.q, this.m, new g(), num, false, this.y));
            utjVar.p = this.t;
            return utjVar;
        }

        public final void b(izs izsVar) {
            this.t = izsVar;
        }

        public final void c(oot0 oot0Var) {
            this.s = oot0Var;
        }

        public final void d(int i, izs izsVar) {
            this.o = this.a.getString(i);
            this.p = izsVar;
        }

        public final void e(View view) {
            this.r = view;
        }

        public final void f(int i) {
            this.x = Integer.valueOf(i);
        }

        public final void g(int i) {
            e3m.a aVar = e3m.a;
            this.j = m33.a(i, this.a);
        }

        public final void h(int i) {
            this.d = i;
        }

        public final void i(int i) {
            this.b = i;
            this.c = i;
        }

        public final void j(int i) {
            this.n = this.a.getString(i);
        }

        public final void k(long j) {
            this.q = j;
        }

        public final void l() {
            this.q = -1L;
        }

        public final utj m() {
            utj a = a();
            a.e();
            return a;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class b {
        public final Drawable a;
        public final Integer b;
        public final Size c;

        public b(Drawable drawable, Integer num, Size size) {
            this.a = drawable;
            this.b = num;
            this.c = size;
        }

        public final Drawable a() {
            return this.a;
        }

        public final Integer b() {
            return this.b;
        }

        public final Size c() {
            return this.c;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class c {
        public final klw a;
        public final Drawable b;

        public c(klw klwVar, Drawable drawable) {
            this.a = klwVar;
            this.b = drawable;
        }

        public final Drawable a() {
            return this.b;
        }

        public final klw b() {
            return this.a;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class d {
        public final FloatingViewGesturesHelper.SwipeDirection a;
        public final int b;
        public final long c;
        public final float d;
        public final g e;
        public final Integer f;
        public final boolean g;
        public final float h;

        public d(FloatingViewGesturesHelper.SwipeDirection swipeDirection, int i, long j, float f, g gVar, Integer num, boolean z, float f2) {
            this.a = swipeDirection;
            this.b = i;
            this.c = j;
            this.d = f;
            this.e = gVar;
            this.f = num;
            this.g = z;
            this.h = f2;
        }

        public final boolean a() {
            return this.g;
        }

        public final float b() {
            return this.d;
        }

        public final float c() {
            return this.h;
        }

        public final g d() {
            return this.e;
        }

        public final long e() {
            return this.c;
        }

        public final FloatingViewGesturesHelper.SwipeDirection f() {
            return this.a;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class e {
        public final izs<utj, s3q0> a;
        public final gzs<Boolean> b;
        public final wzs<Window, View, s3q0> c;

        public e(izs izsVar, gzs gzsVar, j89 j89Var) {
            this.a = izsVar;
            this.b = gzsVar;
            this.c = j89Var;
        }

        public final izs<utj, s3q0> a() {
            return this.a;
        }

        public final gzs<Boolean> b() {
            return this.b;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class f {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public f(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }

        public final int a() {
            return this.e;
        }

        public final int b() {
            return this.f;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class g {
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class h {
        public final Integer a;
        public final Integer b;

        public h(Integer num, Integer num2) {
            this.a = num;
            this.b = num2;
        }

        public final Integer a() {
            return this.a;
        }

        public final Integer b() {
            return this.b;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class i {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public i(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean a() {
            return this.b;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class j {
        public final View a;
        public final View b;

        public j(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final View a() {
            return this.b;
        }

        public final View b() {
            return this.a;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class k {
        public final CharSequence a;
        public final CharSequence b;
        public final boolean c;

        public k(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final CharSequence a() {
            return this.b;
        }

        public final CharSequence b() {
            return this.a;
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class m implements flv0.a {
        public m() {
        }

        @Override // xsna.flv0.a
        public final void a(HideReason hideReason) {
            utj utjVar = utj.this;
            jkv0 jkv0Var = utjVar.n;
            if (jkv0Var == null) {
                utjVar.d();
                return;
            }
            jkv0Var.e = new j3(8, utjVar, hideReason);
            boolean z = utjVar.c.c;
            View view = jkv0Var.a;
            if (jkv0Var.f == null && !(f4m.h(view) && jkv0Var.g == null)) {
                jkv0Var.a();
                view.setVisibility(4);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                j3 j3Var = jkv0Var.e;
                if (j3Var != null) {
                    j3Var.invoke();
                    return;
                }
                return;
            }
            if (z) {
                jkv0Var.a();
                myt0.a(view, new qw80(jkv0Var, 16));
                return;
            }
            jkv0Var.a();
            view.setVisibility(4);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            j3 j3Var2 = jkv0Var.e;
            if (j3Var2 != null) {
                j3Var2.invoke();
            }
        }

        @Override // xsna.flv0.a
        public final void show() {
            View view;
            utj utjVar = utj.this;
            i iVar = utjVar.c;
            boolean z = iVar.a;
            d dVar = utjVar.j;
            f fVar = utjVar.d;
            int i = fVar.d;
            int i2 = fVar.c;
            int i3 = fVar.b;
            int i4 = fVar.a;
            WeakReference<Window> weakReference = utjVar.l;
            View view2 = null;
            Window window = weakReference != null ? weakReference.get() : null;
            WeakReference<ViewGroup> weakReference2 = utjVar.m;
            ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
            if (viewGroup != null) {
                view = utjVar.a(viewGroup);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(i2, i4, i, i3);
                viewGroup.addView(view, marginLayoutParams);
                Integer num = dVar.f;
                if (num != null) {
                    f4m.m(num.intValue(), view);
                }
            } else {
                if (window == null) {
                    Activity h = e3m.h(utjVar.a);
                    window = h != null ? h.getWindow() : null;
                }
                if (window != null) {
                    view2 = utjVar.a((ViewGroup) window.getDecorView());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, dVar.b | (z ? 48 : 80));
                    layoutParams.setMargins(i2, i4, i, i3);
                    window.addContentView(view2, layoutParams);
                    wzs<Window, View, s3q0> wzsVar = utjVar.g.c;
                    if (wzsVar != null) {
                        wzsVar.invoke(window, view2);
                    }
                }
                view = view2;
            }
            if (view != null) {
                view.setVisibility(4);
                View view3 = utjVar.e.b;
                if (view3 != null) {
                    view3.addOnAttachStateChangeListener(utjVar.q);
                }
                utjVar.k = view;
            }
            if (z) {
                i3 = i4;
            }
            View view4 = utjVar.k;
            if (view4 != null) {
                utjVar.n = new jkv0(view4, i3, z);
            }
            jkv0 jkv0Var = utjVar.n;
            if (jkv0Var != null) {
                jkv0Var.d = new obh(utjVar, 4);
                boolean z2 = iVar.c;
                View view5 = jkv0Var.a;
                if (jkv0Var.f != null) {
                    return;
                }
                if (f4m.h(view5) && jkv0Var.g == null) {
                    return;
                }
                if (!z2) {
                    jkv0Var.a();
                    view5.setVisibility(0);
                    obh obhVar = jkv0Var.d;
                    if (obhVar != null) {
                        obhVar.invoke();
                        return;
                    }
                    return;
                }
                jkv0Var.a();
                if (view5.isLayoutRequested() && view5.getMeasuredHeight() > 0) {
                    jkv0Var.b();
                    return;
                }
                e07 e07Var = new e07(0, jkv0Var, jkv0.class, "showAnimatedImpl", "showAnimatedImpl()V", 0, 6);
                view5.setVisibility(4);
                jkv0Var.h.postDelayed(new w29(e07Var, 14), 50L);
            }
        }
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class n extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), utj.w);
        }
    }

    static {
        w = iah0.a(r0);
    }

    public utj(Context context, k kVar, i iVar, f fVar, j jVar, h hVar, e eVar, b bVar, c cVar, d dVar) {
        this.a = context;
        this.b = kVar;
        this.c = iVar;
        this.d = fVar;
        this.e = jVar;
        this.f = hVar;
        this.g = eVar;
        this.h = bVar;
        this.i = cVar;
        this.j = dVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final View a(ViewGroup viewGroup) {
        int i2 = 0;
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.vk_snackbar, viewGroup, false);
        h hVar = this.f;
        if (hVar.a() != null) {
            inflate.setBackgroundColor(hVar.a().intValue());
        }
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new n());
        d dVar = this.j;
        inflate.setElevation(dVar.c());
        VkSnackbarContentLayout vkSnackbarContentLayout = (VkSnackbarContentLayout) inflate.findViewById(R.id.vk_snackbar_content);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.additional_view_frame);
        j jVar = this.e;
        View b2 = jVar.b();
        int i3 = 8;
        e eVar = this.g;
        if (b2 != null) {
            viewGroup2.addView(jVar.b(), -1, -2);
            vkSnackbarContentLayout.setVisibility(8);
        } else {
            TextView textView = (TextView) vkSnackbarContentLayout.findViewById(R.id.tv_message);
            k kVar = this.b;
            CharSequence b3 = kVar.b();
            if (b3 != null) {
                textView.setText(b3);
            }
            dVar.d().getClass();
            dVar.d().getClass();
            dVar.d().getClass();
            TextView textView2 = (TextView) vkSnackbarContentLayout.findViewById(R.id.btn_action);
            CharSequence a2 = kVar.a();
            if (a2 != null) {
                textView2.setText(a2);
            } else {
                f4m.j(textView2);
            }
            izs<utj, s3q0> a3 = eVar.a();
            if (a3 != null) {
                textView2.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.ttj
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            view.animate().alpha(0.4f).setDuration(150L).start();
                            return false;
                        }
                        if (actionMasked != 1 && actionMasked != 3) {
                            return false;
                        }
                        view.animate().alpha(1.0f).setDuration(150L).start();
                        return false;
                    }
                });
                jjc.g(textView2, new by5(i3, a3, this));
            }
            if (hVar.b() != null) {
                textView2.setTextColor(hVar.b().intValue());
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_icon);
            f4m.E(imageView, true);
            b bVar = this.h;
            if (bVar.b() != null) {
                imageView.setColorFilter(bVar.b().intValue());
            }
            f fVar = this.d;
            f4m.s(fVar.a(), imageView);
            f4m.r(fVar.b(), imageView);
            Drawable a4 = bVar.a();
            if (a4 != null) {
                imageView.setImageDrawable(a4);
            } else {
                f4m.j(imageView);
            }
            Size c2 = bVar.c();
            if (c2 != null) {
                imageView.getLayoutParams().width = c2.getWidth();
                imageView.getLayoutParams().height = c2.getHeight();
            }
            VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.iv_avatar);
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.iv_avatar_badge);
            c cVar = this.i;
            klw b4 = cVar.b();
            if (b4 != null) {
                vKReplacerView.setVisibility(0);
                if (vKReplacerView.a(b4.a().getView())) {
                    b4.a().f(b4.b(), new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this.c.a(), 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65275));
                }
            } else {
                f4m.j(vKReplacerView);
            }
            Drawable a5 = cVar.a();
            if (a5 != null) {
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(a5);
            } else {
                f4m.j(imageView2);
            }
            vkSnackbarContentLayout.a(f4m.h(imageView) || f4m.h(vKReplacerView));
        }
        int i4 = FloatingViewGesturesHelper.f;
        FloatingViewGesturesHelper.a.C0787a a6 = FloatingViewGesturesHelper.a.a();
        int i5 = 3;
        a6.d(new n3i(this, i5));
        a6.e(new k0j(this, i5));
        a6.c(new mmf(this, 13));
        a6.h();
        a6.g(dVar.f());
        a6.f(dVar.b());
        if (dVar.a()) {
            a6.b();
        }
        a6.a(inflate);
        gzs<Boolean> b5 = eVar.b();
        if (b5 != null) {
            inflate.setOnClickListener(new stj(i2, b5, this));
        }
        return inflate;
    }

    public final void b() {
        HideReason hideReason = HideReason.Manual;
        Object obj = flv0.a;
        flv0.b(this.r, hideReason);
    }

    public final boolean c() {
        boolean c2;
        Object obj = flv0.a;
        m mVar = this.r;
        synchronized (flv0.a) {
            c2 = flv0.c(mVar);
        }
        return c2;
    }

    public final void d() {
        View view = this.k;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.k);
        }
        View a2 = this.e.a();
        if (a2 != null) {
            a2.removeOnAttachStateChangeListener(this.q);
        }
        this.l = null;
        this.m = null;
        this.k = null;
    }

    public final void e() {
        kkv0 a2;
        Object obj = this.a;
        while ((obj instanceof ContextWrapper) && !(obj instanceof lkv0)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        lkv0 lkv0Var = obj instanceof lkv0 ? (lkv0) obj : null;
        if (lkv0Var != null && (a2 = lkv0Var.a()) != null) {
            if (a2 instanceof kkv0.a) {
                this.l = null;
                this.m = new WeakReference<>(null);
            } else {
                if (!(a2 instanceof kkv0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.l = new WeakReference<>(null);
                this.m = null;
            }
        }
        Object obj2 = flv0.a;
        flv0.i(this.r, this.j.e());
    }

    public final void f(Window window) {
        this.l = new WeakReference<>(window);
        this.m = null;
        e();
    }

    /* compiled from: CoreSnackbar.kt */
    /* loaded from: classes17.dex */
    public static final class l implements View.OnAttachStateChangeListener {
        public l() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            utj utjVar = utj.this;
            if (utjVar.e.b == null) {
                return;
            }
            View view2 = utjVar.k;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            HideReason hideReason = HideReason.RootViewDetached;
            utjVar.n = null;
            Object obj = flv0.a;
            flv0.d(utjVar.r);
            izs<? super HideReason, s3q0> izsVar = utjVar.p;
            if (izsVar != null) {
                izsVar.invoke(hideReason);
            }
            utjVar.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
