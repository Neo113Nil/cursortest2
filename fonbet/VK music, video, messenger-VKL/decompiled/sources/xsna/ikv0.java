package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.vk.core.snackbar.HideReason;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.utj;

/* compiled from: VkSnackbar.kt */
/* loaded from: classes17.dex */
public final class ikv0 implements f5z {
    public static final int e = utj.s;
    public final utj b;
    public final h7k0 c;
    public final androidx.lifecycle.m d = new androidx.lifecycle.m(this, true);

    /* compiled from: VkSnackbar.kt */
    public static class a {
        public final Context a;
        public boolean b;
        public boolean d;
        public View f;
        public gzs<Boolean> g;
        public izs<? super HideReason, s3q0> h;
        public Integer l;
        public boolean m;
        public Integer n;
        public Integer o;
        public Integer p;
        public Integer q;
        public Integer r;
        public e s;
        public c t;
        public d u;
        public Integer v;
        public Float w;
        public float c = 0.7f;
        public long e = 4000;
        public FloatingViewGesturesHelper.SwipeDirection i = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
        public boolean j = true;
        public int k = 3;

        public a(Context context) {
            this.a = context;
        }

        public final void a(Fragment fragment) {
            this.f = fragment.getView();
        }

        public final ikv0 b() {
            Context context = this.a;
            h7k0 h7k0Var = new h7k0(context);
            int i = utj.s;
            int i2 = utj.s;
            int i3 = utj.t;
            int i4 = utj.u;
            int i5 = utj.v;
            FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
            float f = utj.x;
            boolean z = this.d;
            long j = this.e;
            FloatingViewGesturesHelper.SwipeDirection swipeDirection2 = this.i;
            float f2 = this.c;
            boolean z2 = this.j;
            int i6 = this.k;
            View view = this.f;
            if (view == null) {
                view = null;
            }
            gzs<Boolean> gzsVar = this.g;
            if (gzsVar == null) {
                gzsVar = null;
            }
            izs<? super HideReason, s3q0> izsVar = this.h;
            if (izsVar == null) {
                izsVar = null;
            }
            int i7 = i2;
            Integer num = this.l;
            Integer valueOf = num != null ? Integer.valueOf(num.intValue()) : null;
            Integer num2 = this.n;
            int intValue = num2 != null ? num2.intValue() : i7;
            Integer num3 = this.o;
            if (num3 != null) {
                i7 = num3.intValue();
            }
            Integer num4 = this.q;
            if (num4 != null) {
                i5 = num4.intValue();
            }
            Integer num5 = this.p;
            int intValue2 = num5 != null ? num5.intValue() : i3;
            Integer num6 = this.r;
            if (num6 != null) {
                i3 = num6.intValue();
            }
            Integer num7 = this.v;
            if (num7 == null) {
                num7 = null;
            }
            Float f3 = this.w;
            if (f3 != null) {
                f = f3.floatValue();
            }
            float f4 = f;
            boolean z3 = this.b;
            boolean z4 = this.m;
            utj utjVar = new utj(context, new utj.k(null, null, z), new utj.i(z3, false, z2), new utj.f(intValue, i7, intValue2, i3, i4, i5), new utj.j(h7k0Var, view), new utj.h(num7, null), new utj.e(null, gzsVar, null), new utj.b(null, null, null), new utj.c(null, null), new utj.d(swipeDirection2, i6, j, f2, new utj.g(), valueOf, z4, f4));
            utjVar.p = izsVar;
            h7k0Var.setRight(this.s);
            h7k0Var.setLeft(this.t);
            d dVar = this.u;
            if (dVar != null) {
                h7k0Var.setMiddle(dVar);
            }
            h7k0Var.getContext();
            return new ikv0(utjVar, h7k0Var);
        }

        public final void c() {
            this.m = true;
        }

        public final void d(izs izsVar) {
            this.h = izsVar;
        }

        public final void e(int i) {
            this.o = Integer.valueOf(i);
        }

        public final void f() {
            this.d = true;
        }

        public final void g(int i) {
            this.l = Integer.valueOf(i);
        }

        public void h(c cVar) {
            this.t = cVar;
        }

        public void i(d dVar) {
            this.u = dVar;
        }

        public void j(e eVar) {
            this.s = eVar;
        }

        public final void k(long j) {
            this.e = j;
        }

        public final void l() {
            this.e = -1L;
        }

        public final void m(FloatingViewGesturesHelper.SwipeDirection swipeDirection) {
            this.i = swipeDirection;
        }

        public final ikv0 n() {
            ikv0 b = b();
            b.b.e();
            return b;
        }

        public final ikv0 o(ViewGroup viewGroup) {
            ikv0 b = b();
            utj utjVar = b.b;
            utjVar.l = null;
            utjVar.m = new WeakReference<>(viewGroup);
            utjVar.e();
            return b;
        }

        public final ikv0 p(Window window) {
            ikv0 b = b();
            b.b.f(window);
            return b;
        }
    }

    /* compiled from: VkSnackbar.kt */
    public static final class b {
        public static void a(Window window) {
            if (window.getDecorView().findViewById(R.id.vk_snackbar_root) != null) {
                synchronized (flv0.a) {
                    flv0.a(flv0.c, HideReason.Manual);
                }
            }
        }
    }

    /* compiled from: VkSnackbar.kt */
    public static final class d {
        public final ug50<c> a;
        public final ug50<b> b;
        public final ug50<a> c;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this((c) null, (b) (0 == true ? 1 : 0), (a) (0 == true ? 1 : 0), 7);
        }

        public final c a() {
            return this.a.d();
        }

        public d(c cVar, b bVar, a aVar) {
            this.a = new ug50<>(cVar);
            this.b = new ug50<>(bVar);
            this.c = new ug50<>(aVar);
        }

        /* compiled from: VkSnackbar.kt */
        public static final class a implements f {
            public final String a;
            public final izs<ikv0, s3q0> b;

            public a(String str, izs izsVar) {
                this.a = str;
                this.b = izsVar;
            }

            @Override // xsna.ikv0.f
            public final izs<ikv0, s3q0> b() {
                return this.b;
            }

            @Override // xsna.ikv0.f
            public final Integer getCount() {
                return null;
            }

            @Override // xsna.ikv0.f
            public final String getText() {
                return this.a;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(String str, VkButton.Appearance appearance, izs izsVar, int i) {
                this(str, izsVar);
                VkButton.Mode mode = VkButton.Mode.Primary;
                if ((i & 4) != 0) {
                    VkButton.Appearance appearance2 = VkButton.Appearance.Accent;
                }
                VkButton.Size size = VkButton.Size.Small;
            }
        }

        /* compiled from: VkSnackbar.kt */
        public static final class b {
            public final String a;
            public final Integer b;

            public b(String str, Integer num) {
                this.a = str;
                this.b = num;
            }

            public /* synthetic */ b(String str) {
                this(str, 3);
            }
        }

        /* compiled from: VkSnackbar.kt */
        public static final class c {
            public final String a;
            public final Integer b;

            public c(String str, Integer num) {
                this.a = str;
                this.b = num;
            }

            public /* synthetic */ c(String str) {
                this(str, 2);
            }
        }

        public /* synthetic */ d(c cVar, b bVar, a aVar, int i) {
            this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : aVar);
        }

        public /* synthetic */ d(String str, String str2, a aVar, int i) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : aVar);
        }

        public d(String str, String str2, a aVar) {
            this(new c(str), new b(str2), aVar);
        }
    }

    /* compiled from: VkSnackbar.kt */
    public interface f {
        izs<ikv0, s3q0> b();

        Integer getCount();

        String getText();
    }

    /* compiled from: VkSnackbar.kt */
    public interface g {
        Size a();

        cut0 b();

        String c();

        dko getIcon();
    }

    public ikv0(utj utjVar, h7k0 h7k0Var) {
        this.b = utjVar;
        this.c = h7k0Var;
        h7k0Var.setHandleButtonClick$foundation_release(new fda0(this, 23));
    }

    public final void a() {
        this.b.b();
    }

    public final boolean b() {
        return this.b.c();
    }

    public final void c() {
        this.b.e();
    }

    public final void d(Window window) {
        this.b.f(window);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.d;
    }

    /* compiled from: VkSnackbar.kt */
    public interface c {

        /* compiled from: VkSnackbar.kt */
        public static final class a implements c {
            public final c.d a;

            public a(c.d dVar) {
                this.a = dVar;
            }
        }

        /* compiled from: VkSnackbar.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: VkSnackbar.kt */
        public static final class d implements c {
            public static final d a = new d();
        }

        /* compiled from: VkSnackbar.kt */
        public static final class e implements c {
            public final c.d a;
            public final a b;
            public final Integer c;

            /* compiled from: VkSnackbar.kt */
            public static final class a implements g {
                public final gko a = new gko(R.drawable.vk_icon_donut_color_16);
                public final x7g b = null;
                public final Size c;

                public a() {
                    Context context = e43.a;
                    int b = hbh0.b(16, context == null ? null : context);
                    Context context2 = e43.a;
                    this.c = new Size(b, hbh0.b(16, context2 != null ? context2 : null));
                }

                @Override // xsna.ikv0.g
                public final Size a() {
                    return this.c;
                }

                @Override // xsna.ikv0.g
                public final cut0 b() {
                    return this.b;
                }

                @Override // xsna.ikv0.g
                public final String c() {
                    return null;
                }

                @Override // xsna.ikv0.g
                public final dko getIcon() {
                    return this.a;
                }
            }

            public e(c.d dVar, a aVar, Integer num, int i) {
                aVar = (i & 2) != 0 ? null : aVar;
                num = (i & 4) != 0 ? null : num;
                this.a = dVar;
                this.b = aVar;
                this.c = num;
            }
        }

        /* compiled from: VkSnackbar.kt */
        public static final class f implements c {
            public static final f a = new f();
        }

        /* compiled from: VkSnackbar.kt */
        /* renamed from: xsna.ikv0$c$c, reason: collision with other inner class name */
        public static final class C3058c implements c, g {
            public final dko a;
            public final cut0 b;
            public final Size c;

            public C3058c(int i, Integer num, Size size) {
                this(new gko(i), num != null ? new x7g(num.intValue()) : null, size);
            }

            @Override // xsna.ikv0.g
            public final Size a() {
                return this.c;
            }

            @Override // xsna.ikv0.g
            public final cut0 b() {
                return this.b;
            }

            @Override // xsna.ikv0.g
            public final String c() {
                return null;
            }

            @Override // xsna.ikv0.g
            public final dko getIcon() {
                return this.a;
            }

            public /* synthetic */ C3058c(dko dkoVar, x7g x7gVar, Size size, int i) {
                this(dkoVar, (i & 2) != 0 ? null : x7gVar, (i & 4) != 0 ? null : size);
            }

            public C3058c(dko dkoVar, cut0 cut0Var, Size size) {
                this.a = dkoVar;
                this.b = cut0Var;
                this.c = size;
            }

            public /* synthetic */ C3058c(int i, Integer num, Size size, int i2) {
                this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : size);
            }
        }
    }

    /* compiled from: VkSnackbar.kt */
    public interface e {

        /* compiled from: VkSnackbar.kt */
        public static final class a implements e, f {
            public final String a;
            public final izs<ikv0, s3q0> b;

            public a() {
                throw null;
            }

            public a(int i, String str, izs izsVar) {
                VkButton.Mode mode = VkButton.Mode.Primary;
                if ((i & 4) != 0) {
                    VkButton.Appearance appearance = VkButton.Appearance.Accent;
                }
                VkButton.Size size = VkButton.Size.Small;
                this.a = str;
                this.b = izsVar;
            }

            @Override // xsna.ikv0.f
            public final izs<ikv0, s3q0> b() {
                return this.b;
            }

            @Override // xsna.ikv0.f
            public final Integer getCount() {
                return null;
            }

            @Override // xsna.ikv0.f
            public final String getText() {
                return this.a;
            }
        }

        /* compiled from: VkSnackbar.kt */
        public static final class b implements e, g {
            public final gko a;
            public final cut0 b;
            public final Size c;
            public final izs<ikv0, s3q0> d;

            public b() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b(int i, Integer num, Size size, izs izsVar, int i2) {
                this(new gko(i), num != null ? new x7g(num.intValue()) : null, (i2 & 4) != 0 ? null : size, (i2 & 16) != 0 ? null : izsVar);
                num = (i2 & 2) != 0 ? null : num;
            }

            @Override // xsna.ikv0.g
            public final Size a() {
                return this.c;
            }

            @Override // xsna.ikv0.g
            public final cut0 b() {
                return this.b;
            }

            @Override // xsna.ikv0.g
            public final String c() {
                return null;
            }

            @Override // xsna.ikv0.g
            public final dko getIcon() {
                return this.a;
            }

            public b(gko gkoVar, cut0 cut0Var, Size size, izs izsVar) {
                this.a = gkoVar;
                this.b = cut0Var;
                this.c = size;
                this.d = izsVar;
            }

            public /* synthetic */ b(gko gkoVar, cut0 cut0Var, Size size, izs izsVar, int i) {
                this(gkoVar, cut0Var, (i & 4) != 0 ? null : size, (i & 16) != 0 ? null : izsVar);
            }
        }
    }
}
