package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.attachpicker.widget.MaxWidthFrameLayout;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dh6;
import xsna.e3m;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes17.dex */
public class dw20 extends dh6 implements dcn {
    public static final String d1 = fpf0.a(dw20.class).l();
    public static final int e1 = iah0.a(480.0f);
    public boolean B;
    public Drawable C0;
    public boolean D;
    public MaxWidthFrameLayout D0;
    public boolean E;
    public Integer E0;
    public boolean G;
    public wzs<? super com.vk.core.ui.bottomsheet.internal.b, ? super u080, ? extends ModalBottomSheetBehavior<ViewGroup>> H;
    public CharSequence I;
    public Integer J;
    public Integer K;
    public boolean K0;
    public Integer L;
    public Float M;
    public Integer M0;
    public Integer N;
    public Rect O;
    public boolean P;
    public boolean P0;
    public CharSequence Q;
    public int Q0;
    public String R;
    public boolean R0;
    public izs<? super View, s3q0> S;
    public Drawable T;
    public boolean T0;
    public CharSequence U;
    public boolean U0;
    public CharSequence V;
    public boolean V0;
    public hz20 W;
    public boolean W0;
    public CharSequence X;
    public hz20 Y;
    public boolean Y0;
    public izs<? super View, s3q0> Z;
    public izs<? super View, s3q0> a0;
    public Boolean a1;
    public wzs<? super View, ? super MotionEvent, Boolean> b0;
    public boolean b1;
    public DialogInterface.OnDismissListener c0;
    public izs<? super nw20, s3q0> d0;
    public com.vk.core.ui.bottomsheet.internal.b e0;
    public u080 f0;
    public gz20 g0;
    public DialogInterface.OnKeyListener h0;
    public ModalBottomSheetBehavior.d i0;
    public boolean k0;
    public Integer l0;
    public boolean m0;
    public boolean n0;
    public Boolean o0;
    public Integer p0;
    public gzs<s3q0> q0;
    public gzs<Boolean> r0;
    public boolean s0;
    public boolean t0;
    public Drawable u0;
    public View v0;
    public int z0;
    public float A = nw20.m1;
    public boolean C = true;
    public boolean F = true;
    public boolean j0 = true;
    public int w0 = -1;
    public int x0 = -1;
    public int y0 = -1;
    public int A0 = -1;
    public float B0 = -1.0f;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = e1;
    public boolean L0 = true;
    public boolean N0 = true;
    public boolean O0 = true;
    public final FrameLayout.LayoutParams S0 = new FrameLayout.LayoutParams(-1, -1);
    public boolean X0 = true;
    public boolean Z0 = true;
    public final bpn0 c1 = new bpn0(new r010(this, 3));

    /* compiled from: ModalBottomSheet.kt */
    public static abstract class a<B extends a<B, T>, T extends dw20> {
        public final Context b;
        public Context c;
        public final e.a d;

        /* compiled from: ModalBottomSheet.kt */
        /* renamed from: xsna.dw20$a$a, reason: collision with other inner class name */
        public static final class C2764a implements hz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public C2764a(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.hz20
            public final void a(int i) {
                this.b.invoke();
            }
        }

        /* compiled from: ModalBottomSheet.kt */
        public static final class b implements hz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public b(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.hz20
            public final void a(int i) {
                this.b.invoke();
            }
        }

        /* compiled from: ModalBottomSheet.kt */
        public static final class c implements gz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public c(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.gz20
            public final void onCancel() {
                this.b.invoke();
            }
        }

        /* compiled from: ModalBottomSheet.kt */
        public static final class d implements iz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public d(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.iz20
            public final void n(dw20 dw20Var) {
                this.b.invoke();
            }
        }

        /* compiled from: ModalBottomSheet.kt */
        public static final class e implements hz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public e(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.hz20
            public final void a(int i) {
                this.b.invoke();
            }
        }

        /* compiled from: ModalBottomSheet.kt */
        public static final class f implements hz20 {
            public final /* synthetic */ gzs<s3q0> b;

            public f(gzs<s3q0> gzsVar) {
                this.b = gzsVar;
            }

            @Override // xsna.hz20
            public final void a(int i) {
                this.b.invoke();
            }
        }

        public a(Context context, dh6.a aVar) {
            this.b = context;
            this.c = context;
            e.a aVar2 = new e.a();
            this.d = aVar2;
            aVar2.f1 = aVar;
            Context context2 = this.c;
            lpj lpjVar = context2 instanceof lpj ? (lpj) context2 : null;
            if (lpjVar != null) {
                aVar2.r1 = lpjVar.getThemeResId();
            }
        }

        public static a Q(a aVar, int i) {
            String string = aVar.c.getString(i);
            e.a aVar2 = aVar.g().d;
            aVar2.j0 = string;
            aVar2.k0 = -1;
            aVar2.l0 = 1;
            return aVar.g();
        }

        public static a R(a aVar, CharSequence charSequence, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            e.a aVar2 = aVar.g().d;
            aVar2.j0 = charSequence;
            aVar2.k0 = i;
            aVar2.l0 = i2;
            return aVar.g();
        }

        public static a g0(a aVar, klw klwVar, boolean z, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            e.a aVar2 = aVar.g().d;
            aVar2.H = klwVar;
            aVar2.J = z;
            aVar2.B0 = null;
            return aVar.g();
        }

        public static a k(a aVar, av20 av20Var, int i) {
            boolean z = (i & 2) == 0;
            e.a aVar2 = aVar.g().d;
            aVar2.C0 = av20Var;
            aVar2.e = z;
            aVar2.f = false;
            return aVar.g();
        }

        public static a k0(a aVar, CharSequence charSequence, hz20 hz20Var, Drawable drawable, Integer num, int i) {
            if ((i & 4) != 0) {
                drawable = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            e.a aVar2 = aVar.g().d;
            aVar2.H0 = charSequence;
            aVar2.J0 = hz20Var;
            aVar2.I0 = drawable;
            aVar2.K0 = num;
            return aVar.g();
        }

        public final B A(int i) {
            g().d.s = i;
            return g();
        }

        @ozl
        public final B A0(Integer num) {
            g().d.T = num;
            return g();
        }

        @ozl
        public final B B(float f2, boolean z, boolean z2) {
            e.a aVar = g().d;
            aVar.a = f2;
            aVar.b = z;
            aVar.c = z2;
            return g();
        }

        public final B B0(Integer num) {
            g().d.Z = num;
            return g();
        }

        @ozl
        public final B C(float f2) {
            g().d.y0 = f2;
            return g();
        }

        @ozl
        public final B C0(Integer num) {
            g().d.q = num;
            return g();
        }

        public final a D() {
            g().d.E1 = true;
            return g();
        }

        public final B D0(View view, boolean z) {
            e.a aVar = g().d;
            aVar.j = view;
            aVar.k = z;
            return g();
        }

        public final B E(boolean z) {
            g().d.D1 = z;
            return g();
        }

        @ozl
        public final B E0(boolean z) {
            g().d.o = z;
            return g();
        }

        @ozl
        public final a F(Drawable drawable, String str) {
            e.a aVar = g().d;
            aVar.g1 = drawable;
            aVar.h0 = null;
            if (str != null) {
                aVar.h1 = str;
            }
            return g();
        }

        @ozl
        public final B F0(boolean z) {
            g().d.n = z;
            return g();
        }

        @ozl
        public final B G(int i) {
            B g = g();
            g.d.h0 = g.c.getString(i);
            g.d.g1 = null;
            return g();
        }

        public final a G0() {
            g().d.n0 = false;
            return g();
        }

        @ozl
        public final B H(izs<? super View, s3q0> izsVar) {
            g().d.i0 = izsVar;
            return g();
        }

        public final dw20 H0(FragmentManager fragmentManager, String str) {
            String str2 = dw20.d1;
            dw20 a = c.a(fragmentManager, str, dw20.class);
            if (a == null) {
                a = a();
                if (str == null) {
                    try {
                        str = dw20.d1;
                    } catch (IllegalStateException e2) {
                        Log.e(dw20.d1, e2.toString());
                    }
                }
                a.Td(fragmentManager, str);
                return a;
            }
            return a;
        }

        public final B I(boolean z) {
            g().d.m0 = z;
            return g();
        }

        public final dw20 I0(String str) {
            return H0(((FragmentActivity) e3m.h(this.c)).getSupportFragmentManager(), str);
        }

        @ozl
        public final a J() {
            g().d.p = false;
            return g();
        }

        public final a K() {
            g().d.o0 = true;
            return g();
        }

        public final B K0(int i) {
            g().d.r0 = Integer.valueOf(i);
            return g();
        }

        public final B L(int i) {
            Context context = this.c;
            e3m.a aVar = e3m.a;
            N(m33.a(i, context));
            return g();
        }

        public final B L0() {
            ((b) this).d.N = true;
            return (b) this;
        }

        public final B M(int i, Integer num) {
            Context context = this.c;
            e3m.a aVar = e3m.a;
            N(new baf0(m33.a(i, context), e3m.f(num.intValue(), this.c)));
            return g();
        }

        public final B M0() {
            g().d.E0 = true;
            return g();
        }

        public final B N(Drawable drawable) {
            g().d.G = drawable;
            return g();
        }

        @ozl
        public final a N0() {
            g().d.g = false;
            return g();
        }

        public final B O() {
            g().d.i = true;
            return g();
        }

        public final B O0() {
            g().d.p1 = true;
            return g();
        }

        public final B P(List<brj0> list, izs<? super brj0, s3q0> izsVar) {
            g().i(new apj0(list, izsVar), true, true);
            return g();
        }

        public final B P0() {
            g().d.o1 = true;
            return g();
        }

        public final B Q0(int i, int i2) {
            B g = g();
            g.d.O = Integer.valueOf(i);
            g.d.P = Integer.valueOf(i2);
            return g();
        }

        @ozl
        public final B R0(boolean z) {
            g().d.q0 = z;
            return g();
        }

        public final B S(int i) {
            g().d.z0 = i;
            return g();
        }

        public final B T(int i, gzs<s3q0> gzsVar) {
            return W(this.c.getString(i), new C2764a(gzsVar));
        }

        public final B U(int i, hz20 hz20Var) {
            return W(this.c.getString(i), hz20Var);
        }

        public final B V(CharSequence charSequence, gzs<s3q0> gzsVar) {
            return W(charSequence, new b(gzsVar));
        }

        public final B W(CharSequence charSequence, hz20 hz20Var) {
            e.a aVar = g().d;
            aVar.O0 = charSequence;
            aVar.P0 = hz20Var;
            return g();
        }

        public final B X(gzs<s3q0> gzsVar) {
            return Y(new c(gzsVar));
        }

        public final B Y(gz20 gz20Var) {
            g().d.U0 = gz20Var;
            return g();
        }

        public final B Z(DialogInterface.OnDismissListener onDismissListener) {
            g().d.a1 = onDismissListener;
            return g();
        }

        public final T a() {
            hz20 hz20Var;
            hz20 hz20Var2;
            com.vk.qrcode.e eVar;
            hz20 hz20Var3;
            hz20 hz20Var4;
            com.vk.qrcode.e eVar2;
            hz20 hz20Var5;
            T f2 = f();
            e.a aVar = this.d;
            aVar.getClass();
            aVar.J1 = false;
            String str = dw20.d1;
            com.vk.core.ui.bottomsheet.internal.e Hn = f2.Hn();
            Hn.F = aVar.o1;
            Hn.G = aVar.p1;
            Hn.H = aVar.q1;
            Hn.I = aVar.d;
            Hn.M = aVar.g;
            Hn.J = aVar.J1;
            Hn.s = aVar.C0;
            Hn.t.addAll(aVar.D0);
            Hn.Y = aVar.j;
            Hn.Z = aVar.k;
            Hn.b0 = aVar.l;
            Hn.c0 = aVar.D;
            Hn.d0 = aVar.E;
            Hn.X = aVar.j1;
            Hn.W = aVar.k1;
            Hn.E = aVar.W0;
            int i = com.vk.core.ui.bottomsheet.internal.e.a1;
            Hn.V0 = aVar.d1;
            Hn.N = aVar.n1;
            Hn.P = aVar.v0;
            Hn.Q = aVar.w0;
            Hn.R = aVar.t;
            Hn.S = aVar.u;
            Hn.T = aVar.v;
            Hn.U = aVar.w;
            Hn.V = aVar.x;
            Hn.X0 = aVar.F;
            Hn.Y0 = aVar.i1;
            Hn.v0 = aVar.u1;
            Hn.u0 = aVar.t1;
            Hn.w0 = aVar.v1;
            if (!aVar.d) {
                Hn.K = aVar.e;
                Hn.L = aVar.f;
                Hn.r0 = aVar.Q;
                Hn.s0 = aVar.R;
                Hn.x0 = aVar.T;
                Hn.y0 = aVar.U;
                Hn.t0 = aVar.W;
                Hn.z0 = aVar.Y;
                Hn.A0 = aVar.Z;
                Hn.B0 = aVar.a0;
                Hn.C0 = aVar.c0;
                Hn.E0 = aVar.d0;
                Hn.F0 = aVar.e0;
                Hn.G0 = aVar.f0;
                Hn.H0 = aVar.g0;
                Hn.D0 = aVar.S;
                Hn.T0 = aVar.X0;
                CharSequence charSequence = aVar.H0;
                if (charSequence != null && !drm0.N(charSequence) && (hz20Var5 = aVar.J0) != null) {
                    Hn.O0 = aVar.H0;
                    Hn.v = hz20Var5;
                    Hn.w = aVar.K0;
                }
                Hn.Q0 = aVar.I0;
                String str2 = aVar.L0;
                if (str2 != null && !drm0.N(str2) && (eVar2 = aVar.M0) != null) {
                    Hn.P0 = aVar.L0;
                    Hn.x = eVar2;
                    Hn.y = aVar.N0;
                }
                Hn.e0 = aVar.G;
                Hn.f0 = aVar.g1;
                Hn.g0 = aVar.h1;
                Hn.h0 = aVar.h0;
                Hn.i0 = aVar.i0;
                Hn.k0 = aVar.I;
                Hn.j0 = aVar.H;
                Hn.l0 = aVar.J;
                Hn.m0 = aVar.K;
                Hn.W0 = aVar.L;
                Hn.n0 = aVar.M;
                Hn.o0 = aVar.N;
                Hn.q0 = aVar.P;
                Hn.p0 = aVar.O;
                Hn.I0 = aVar.j0;
                Hn.J0 = null;
                Hn.K0 = aVar.k0;
                Hn.L0 = aVar.l0;
                Hn.U0 = aVar.B0;
                Hn.N0 = aVar.E0;
                CharSequence charSequence2 = aVar.F0;
                if (charSequence2 != null && !drm0.N(charSequence2) && (hz20Var4 = aVar.G0) != null) {
                    Hn.M0 = aVar.F0;
                    Hn.o = hz20Var4;
                }
                CharSequence charSequence3 = aVar.O0;
                if (charSequence3 != null && !drm0.N(charSequence3) && (hz20Var3 = aVar.P0) != null) {
                    Hn.R0 = aVar.O0;
                    Hn.A = hz20Var3;
                    Hn.B = aVar.Q0;
                }
                String str3 = aVar.R0;
                if (str3 != null && !drm0.N(str3) && (eVar = aVar.S0) != null) {
                    Hn.S0 = aVar.R0;
                    Hn.C = eVar;
                    Hn.D = aVar.T0;
                }
                Hn.O = aVar.h;
            }
            f2.g0 = aVar.U0;
            f2.h0 = aVar.V0;
            f2.D = aVar.d;
            f2.A = aVar.a;
            f2.B = aVar.b;
            f2.C = aVar.c;
            f2.q0 = aVar.z1;
            f2.r0 = aVar.A1;
            f2.s0 = aVar.w1;
            f2.t0 = aVar.x1;
            f2.u0 = aVar.y1;
            f2.D0 = aVar.l;
            f2.E0 = aVar.m;
            f2.E = aVar.m0;
            f2.F = aVar.n0;
            f2.G = aVar.o0;
            f2.H = aVar.p0;
            CharSequence charSequence4 = aVar.Q;
            if (charSequence4 != null && !drm0.N(charSequence4)) {
                f2.I = aVar.Q;
            }
            Integer num = aVar.R;
            if (num != null) {
                f2.J = num;
            }
            f2.K = aVar.T;
            f2.L = aVar.U;
            f2.M = aVar.V;
            f2.N = aVar.W;
            f2.O = aVar.X;
            CharSequence charSequence5 = aVar.c0;
            if (charSequence5 != null && charSequence5.length() != 0) {
                f2.Q = aVar.c0;
            }
            f2.P = aVar.b0;
            f2.k0 = aVar.s1;
            f2.A0 = aVar.r1;
            f2.B0 = aVar.y0;
            f2.j0 = aVar.q0;
            f2.i0 = aVar.e1;
            f2.l0 = aVar.r0;
            f2.w0 = aVar.s0;
            f2.x0 = aVar.t0;
            f2.y0 = aVar.u0;
            f2.z0 = aVar.x0;
            f2.C0 = aVar.v0;
            f2.T = aVar.g1;
            f2.U = aVar.h1;
            f2.R = aVar.h0;
            f2.S = aVar.i0;
            f2.Z = aVar.X0;
            f2.a0 = aVar.Y0;
            f2.b0 = aVar.Z0;
            f2.c0 = aVar.a1;
            f2.d0 = aVar.b1;
            f2.e0 = aVar.c1;
            f2.f0 = aVar.d1;
            if (f2.x == null) {
                f2.x = aVar.f1;
            }
            f2.N0 = aVar.m1;
            f2.O0 = aVar.n1;
            f2.P0 = aVar.o;
            f2.K0 = aVar.n;
            f2.L0 = aVar.p;
            f2.M0 = aVar.q;
            f2.I0 = aVar.z;
            f2.H0 = aVar.y;
            f2.F0 = aVar.r;
            f2.G0 = aVar.s;
            f2.Q0 = aVar.z0;
            f2.m0 = aVar.A;
            f2.n0 = aVar.B;
            Boolean bool = aVar.C;
            if (bool == null) {
                bool = Boolean.valueOf(aVar.l1);
            }
            f2.o0 = bool;
            f2.b1 = aVar.i;
            f2.J0 = aVar.A0;
            f2.R0 = aVar.B1;
            f2.T0 = aVar.C1;
            f2.U0 = aVar.D1;
            f2.V0 = aVar.E1;
            f2.W0 = aVar.F1;
            f2.X0 = aVar.I1;
            f2.Y0 = aVar.G1;
            f2.Z0 = aVar.H1;
            f2.a1 = Boolean.valueOf(aVar.J1);
            if (aVar.d || aVar.J1) {
                CharSequence charSequence6 = aVar.H0;
                if (charSequence6 != null && !drm0.N(charSequence6) && (hz20Var2 = aVar.J0) != null) {
                    f2.V = aVar.H0;
                    f2.W = hz20Var2;
                }
                CharSequence charSequence7 = aVar.O0;
                if (charSequence7 != null && !drm0.N(charSequence7) && (hz20Var = aVar.P0) != null) {
                    f2.X = aVar.O0;
                    f2.Y = hz20Var;
                }
                View view = aVar.E;
                if (view != null) {
                    f2.v0 = view;
                }
            }
            return f2;
        }

        public final B a0(gzs<s3q0> gzsVar) {
            g().d.a1 = new b0c(gzsVar, 1);
            return g();
        }

        @ozl
        public final B b0(izs<? super View, s3q0> izsVar) {
            g().d.X0 = izsVar;
            return g();
        }

        public final B c(com.vk.core.ui.bottomsheet.internal.b bVar) {
            e.a aVar = g().d;
            aVar.d = true;
            aVar.c1 = bVar;
            return g();
        }

        public final B c0(DialogInterface.OnKeyListener onKeyListener) {
            g().d.V0 = onKeyListener;
            return g();
        }

        public final B d0(gzs<s3q0> gzsVar) {
            g().d.W0 = new d(gzsVar);
            return g();
        }

        public final Context e() {
            return this.c;
        }

        public final B e0(iz20 iz20Var) {
            g().d.W0 = iz20Var;
            return g();
        }

        public abstract T f();

        public final B f0(izs<? super View, s3q0> izsVar) {
            g().d.j1 = izsVar;
            return g();
        }

        public abstract B g();

        public final B h(CharSequence charSequence, hz20 hz20Var) {
            e.a aVar = g().d;
            aVar.F0 = charSequence;
            aVar.G0 = hz20Var;
            return g();
        }

        public final B h0(int i, gzs<s3q0> gzsVar) {
            return (B) k0(this, this.c.getString(i), new e(gzsVar), null, null, 12);
        }

        public final B i(RecyclerView.Adapter<? extends RecyclerView.e0> adapter, boolean z, boolean z2) {
            e.a aVar = g().d;
            aVar.C0 = adapter;
            aVar.e = z;
            aVar.f = z2;
            return g();
        }

        public final B i0(int i, hz20 hz20Var) {
            return (B) k0(this, this.c.getString(i), hz20Var, null, null, 12);
        }

        public final B j0(CharSequence charSequence, gzs<s3q0> gzsVar) {
            return (B) k0(this, charSequence, new f(gzsVar), null, null, 12);
        }

        @ozl
        public final B l(int i) {
            g().d.u0 = i;
            return g();
        }

        public final B l0(RecyclerView.n nVar) {
            g().d.D0.add(nVar);
            return g();
        }

        @ozl
        public final B m(int i) {
            g().d.s0 = i;
            return g();
        }

        public final B m0(int i) {
            g().d.v = i;
            return g();
        }

        public final B n(ModalBottomSheetBehavior.d dVar) {
            g().d.e1 = dVar;
            return g();
        }

        public final B n0(int i) {
            g().d.w = i;
            return g();
        }

        public final a o() {
            g().d.n1 = false;
            return g();
        }

        public final B o0(int i) {
            g().d.x = i;
            return g();
        }

        public final B p(boolean z) {
            g().d.m1 = z;
            return g();
        }

        @ozl
        public final B p0(int i) {
            g().d.u = i;
            return g();
        }

        public final B q(boolean z) {
            g().d.l1 = z;
            return g();
        }

        public final B q0(boolean z) {
            g().d.s1 = z;
            return g();
        }

        public final a r() {
            g().d.C = Boolean.FALSE;
            return g();
        }

        @ozl
        public final B r0(int i) {
            s0(this.c.getString(i));
            return g();
        }

        @ozl
        public final B s(Drawable drawable) {
            g().d.y1 = drawable;
            return g();
        }

        @ozl
        public final B s0(CharSequence charSequence) {
            g().d.c0 = charSequence;
            return g();
        }

        @ozl
        public final B t() {
            g().d.x1 = true;
            return g();
        }

        public final B t0(int i) {
            g().d.S = Integer.valueOf(i);
            return g();
        }

        public final B u(int i) {
            g().d.y = i;
            return g();
        }

        public final B u0(int i) {
            B g = g();
            g.d.r1 = i;
            if (i != -1) {
                g.c = new lpj(g.b, i);
            }
            return g();
        }

        public final B v(int i) {
            g().d.t = i;
            return g();
        }

        @ozl
        public final B v0(int i) {
            B g = g();
            g.d.Q = g.c.getString(i);
            return g();
        }

        public final a w() {
            g().d.h = true;
            return g();
        }

        @ozl
        public final B w0(CharSequence charSequence) {
            g().d.Q = charSequence;
            return g();
        }

        public final B x(int i) {
            g().d.z = i;
            return g();
        }

        public final B x0(Integer num) {
            g().d.a0 = num;
            return g();
        }

        @ozl
        public final B y(Drawable drawable) {
            g().d.v0 = drawable;
            return g();
        }

        @ozl
        public final B y0(int i) {
            g().d.R = Integer.valueOf(i);
            return g();
        }

        public final B z(View view) {
            g().d.E = view;
            return g();
        }

        @ozl
        public final B z0(Integer num) {
            g().d.W = num;
            return g();
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    public static final class c {
        public static final dw20 a(FragmentManager fragmentManager, String str, Class cls) {
            String str2 = dw20.d1;
            if (str == null) {
                str = dw20.d1;
            }
            Fragment H = fragmentManager.H(str);
            if (H != null) {
                if (!cls.isInstance(H)) {
                    H = null;
                }
                if (H != null) {
                    return (dw20) cls.cast(H);
                }
            }
            return null;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    public static final class d implements gz20 {
        public final /* synthetic */ gzs<s3q0> b;

        public d(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.gz20
        public final void onCancel() {
            this.b.invoke();
        }
    }

    public static void Rn(dw20 dw20Var, View view, int i) {
        boolean z = (i & 2) != 0 ? dw20Var.T0 : true;
        com.vk.core.ui.bottomsheet.internal.e Hn = dw20Var.Hn();
        Hn.Y = view;
        Hn.Z = z;
    }

    public final void En() {
        Dialog dialog;
        if (getActivity() == null || (dialog = this.s) == null) {
            return;
        }
        Display defaultDisplay = ((WindowManager) kn().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = this.J0;
        if (i >= i2) {
            i = i2;
        }
        if (dialog instanceof nw20) {
            ((nw20) dialog).v(i);
            return;
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        window.setLayout(i, -1);
    }

    public nw20 Fn(int i, Context context) {
        return new nw20(context, i);
    }

    public void G8() {
        hide();
    }

    public final ViewGroup Gn() {
        Dialog dialog = this.s;
        if (dialog instanceof nw20) {
            return ((nw20) dialog).n0;
        }
        LinearLayout linearLayout = Hn().c;
        if (linearLayout == null) {
            return null;
        }
        return linearLayout;
    }

    public final com.vk.core.ui.bottomsheet.internal.e Hn() {
        return (com.vk.core.ui.bottomsheet.internal.e) this.c1.getValue();
    }

    public void Ie() {
        hide();
    }

    public FrameLayout.LayoutParams In() {
        return this.S0;
    }

    public final TextView Jn() {
        if (this.s instanceof nw20) {
            throw new IllegalArgumentException("Fullscreen bottomsheet hasn't message view!");
        }
        TextView textView = Hn().m;
        if (textView == null) {
            return null;
        }
        return textView;
    }

    public final TextView Kn() {
        Dialog dialog = this.s;
        if (dialog instanceof nw20) {
            TextView textView = ((nw20) dialog).g0;
            if (textView == null) {
                return null;
            }
            return textView;
        }
        TextView textView2 = Hn().u;
        if (textView2 != null) {
            return textView2;
        }
        return null;
    }

    public final ViewGroup Ln() {
        ViewGroup viewGroup = Hn().a;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final Context Mn() {
        return this.A0 == -1 ? mo2getContext() : new lpj(mo2getContext(), this.A0);
    }

    public void Ng() {
        hide();
    }

    public final void On(int i) {
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var == null || (modalBottomSheetBehavior = nw20Var.i) == null) {
            return;
        }
        modalBottomSheetBehavior.O(i);
    }

    public final void Pn(int i) {
        Hn().d(i);
    }

    public final void Qn(boolean z) {
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var == null) {
            com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
            if (bVar != null) {
                bVar.setCancelable(z);
                return;
            }
            return;
        }
        nw20Var.N0 = z;
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = nw20Var.i;
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.D = z;
        }
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.M(z);
        }
        nw20Var.setCancelable(z);
    }

    @ozl
    public final void Sn(Context context) {
        Context s;
        TextView textView = Hn().k;
        if (textView != null) {
            his0.x(textView, R.color.vk_gray_100);
        }
        TextView textView2 = Hn().m;
        if (textView2 != null) {
            his0.x(textView2, R.color.vk_gray_400);
        }
        TextView textView3 = Hn().u;
        if (textView3 == null) {
            textView3 = null;
        }
        if (textView3 != null) {
            his0.x(textView3, R.color.vk_black);
            Context context2 = textView3.getContext();
            e3m.a aVar = e3m.a;
            textView3.setBackgroundColor(context2.getColor(R.color.vk_white));
        }
        if (context == null) {
            context = mo2getContext();
        }
        Context context3 = context;
        if (context3 != null) {
            com.vk.core.ui.bottomsheet.internal.e Hn = Hn();
            d1x d1xVar = new d1x(context3, hbh0.a(context3, 12.0f), 0, (int) hbh0.a(context3, 0.7f), 0);
            d1xVar.b(R.drawable.vk_bg_card_elevation8_cropped);
            TypedValue typedValue = krv0.a;
            d1xVar.a((krv0.b == null || (s = dhr0.s()) == null) ? e3m.f(R.attr.vk_ui_background_modal, context3) : e3m.f(R.attr.vk_ui_background_modal, s));
            d1xVar.setLayerInset(1, hbh0.b(8, context3), hbh0.b(8, context3), hbh0.b(8, context3), hbh0.b(8, context3));
            ViewGroup viewGroup = Hn.a;
            if (viewGroup != null) {
                viewGroup.setBackground(d1xVar);
            }
        }
    }

    @ozl
    public final void Tn(int i) {
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var != null) {
            ViewGroup viewGroup = nw20Var.l0;
            ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
            if (viewGroup2 != null) {
                viewGroup2.findViewById(R.id.btnEndTitle).setVisibility(i);
                return;
            }
        }
        throw new IllegalArgumentException("Card bottomsheet hasn't toolbar view!");
    }

    public final void Un(ModalBottomSheetBehavior.e eVar) {
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var == null || (modalBottomSheetBehavior = nw20Var.i) == null) {
            return;
        }
        modalBottomSheetBehavior.G = eVar;
    }

    public final void Vn(gzs<s3q0> gzsVar) {
        this.g0 = new d(gzsVar);
    }

    public final void Wn(FragmentManager fragmentManager, String str) {
        if (c.a(fragmentManager, str, getClass()) != null) {
            return;
        }
        if (str == null) {
            try {
                str = d1;
            } catch (IllegalStateException e) {
                e.printStackTrace();
                return;
            }
        }
        Td(fragmentManager, str);
    }

    public boolean a0() {
        gzs<Boolean> gzsVar = this.r0;
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return false;
    }

    @Override // xsna.dh6, androidx.fragment.app.d
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
            super.tn();
        }
        Hn().b();
        Hn().c();
    }

    public final void hide() {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        gz20 gz20Var = this.g0;
        if (gz20Var != null) {
            gz20Var.onCancel();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        izs<? super nw20, s3q0> izsVar = this.d0;
        if (izsVar != null) {
            Dialog dialog = this.s;
            izsVar.invoke(dialog instanceof nw20 ? (nw20) dialog : null);
        }
        En();
    }

    @Override // xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        try {
            super.onDismiss(dialogInterface);
        } catch (Exception unused) {
            super.tn();
        }
        Hn().b();
        Hn().c();
        DialogInterface.OnDismissListener onDismissListener = this.c0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Integer num = this.l0;
        if (num != null) {
            int intValue = num.intValue();
            Dialog dialog = this.s;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        En();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_full_screen", this.D);
    }

    public void r4() {
        G8();
    }

    public final void sj(String str) {
        this.I = str;
        Dialog dialog = this.s;
        if (dialog != null) {
            if (!(dialog instanceof nw20)) {
                dialog.setTitle(str);
                return;
            }
            nw20 nw20Var = (nw20) dialog;
            nw20Var.u = str;
            TextView textView = nw20Var.b0;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str);
        }
    }

    @Override // xsna.dh6, androidx.fragment.app.d
    public void tn() {
        super.tn();
        Hn().b();
        Hn().c();
    }

    @Override // androidx.fragment.app.d
    public int vn() {
        Boolean bool;
        if (this.D) {
            return R.style.VkFullScreenBottomSheetTheme;
        }
        boolean z = false;
        if (mo2getContext() != null && (bool = this.a1) != null) {
            z = bool.booleanValue();
        }
        return z ? R.style.VkFullScreenBottomSheetTheme : R.style.VkBottomSheetTheme;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0222  */
    @Override // xsna.c33, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Dialog yn(Bundle bundle) {
        hz20 hz20Var;
        hz20 hz20Var2;
        Dialog dialog;
        Boolean bool;
        Window window;
        if (bundle != null) {
            this.D = bundle.getBoolean("is_full_screen");
        }
        Context Mn = Mn();
        if (!this.D) {
            if (!((mo2getContext() == null || (bool = this.a1) == null) ? false : bool.booleanValue())) {
                Dialog bVar = new com.google.android.material.bottomsheet.b(Mn, vn());
                if (this.B0 > -1.0f && (window = bVar.getWindow()) != null) {
                    window.setDimAmount(this.B0);
                }
                bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.aw20
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        String str = dw20.d1;
                        dw20 dw20Var = dw20.this;
                        if (!dw20Var.isAdded() || dw20Var.mo2getContext() == null) {
                            return;
                        }
                        com.google.android.material.bottomsheet.b bVar2 = (com.google.android.material.bottomsheet.b) dialogInterface;
                        FrameLayout frameLayout = (FrameLayout) bVar2.findViewById(R.id.design_bottom_sheet);
                        if (frameLayout != null) {
                            frameLayout.setContentDescription(frameLayout.getContext().getString(R.string.accessibility_dialog));
                            Integer num = dw20Var.p0;
                            if (num != null) {
                                frameLayout.setBackgroundResource(num.intValue());
                            } else {
                                frameLayout.setBackgroundResource(android.R.color.transparent);
                            }
                            BottomSheetBehavior L = BottomSheetBehavior.L(frameLayout);
                            L.X(3);
                            if (!dw20Var.n || !dw20Var.N0) {
                                L.W(Integer.MAX_VALUE, false);
                                L.V(false);
                            }
                        }
                        FrameLayout frameLayout2 = (FrameLayout) bVar2.findViewById(R$id.container);
                        if (frameLayout2 != null) {
                            dw20Var.Nn(frameLayout2);
                        }
                        iz20 iz20Var = dw20Var.Hn().E;
                        if (iz20Var != null) {
                            iz20Var.n(dw20Var);
                        }
                    }
                });
                dialog = bVar;
                dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.bw20
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        dw20 dw20Var = dw20.this;
                        if (i == 4) {
                            String str = dw20.d1;
                            if (keyEvent.getAction() == 0) {
                                return dw20Var.a0();
                            }
                        }
                        DialogInterface.OnKeyListener onKeyListener = dw20Var.h0;
                        if (onKeyListener != null) {
                            return onKeyListener.onKey(dialogInterface, i, keyEvent);
                        }
                        return false;
                    }
                });
                if (bundle != null) {
                    dialog.setContentView(Hn().a(Mn), In());
                    return dialog;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new t12(this, 9), 100L);
                return dialog;
            }
        }
        nw20 Fn = Fn(vn(), Mn);
        CharSequence charSequence = this.I;
        if (charSequence != null) {
            Fn.u = charSequence;
        }
        Integer num = this.J;
        if (num != null) {
            Fn.v = Integer.valueOf(num.intValue());
        }
        Integer num2 = this.K;
        if (num2 != null) {
            Fn.w = Integer.valueOf(num2.intValue());
        }
        Integer num3 = this.L;
        if (num3 != null) {
            Fn.x = Integer.valueOf(num3.intValue());
        }
        Float f = this.M;
        if (f != null) {
            Fn.z = f.floatValue();
        }
        Integer num4 = this.N;
        if (num4 != null) {
            Fn.y = Integer.valueOf(num4.intValue());
        }
        Rect rect = this.O;
        if (rect != null) {
            Fn.A = rect;
        }
        Fn.B = this.P;
        CharSequence charSequence2 = this.Q;
        if (charSequence2 != null) {
            Fn.C = charSequence2;
        }
        Drawable drawable = this.T;
        if (drawable != null) {
            Fn.F = drawable;
        }
        CharSequence charSequence3 = this.U;
        if (charSequence3 != null) {
            Fn.G = charSequence3;
        }
        Fn.k = this.E;
        Fn.m = this.G;
        wzs<? super com.vk.core.ui.bottomsheet.internal.b, ? super u080, ? extends ModalBottomSheetBehavior<ViewGroup>> wzsVar = this.H;
        if (wzsVar != null) {
            Fn.h = wzsVar;
        }
        Fn.l = this.F;
        izs<? super View, s3q0> izsVar = this.Z;
        if (izsVar != null) {
            Fn.N = izsVar;
        }
        izs<? super View, s3q0> izsVar2 = this.a0;
        if (izsVar2 != null) {
            Fn.J = izsVar2;
        }
        wzs<? super View, ? super MotionEvent, Boolean> wzsVar2 = this.b0;
        if (wzsVar2 != null) {
            Fn.K = wzsVar2;
        }
        String str = this.R;
        if (str != null) {
            Fn.D = str;
        }
        izs<? super View, s3q0> izsVar3 = this.S;
        if (izsVar3 != null) {
            Fn.E = izsVar3;
        }
        com.vk.core.ui.bottomsheet.internal.b bVar2 = this.e0;
        if (bVar2 != null) {
            Fn.r0 = bVar2;
        }
        u080 u080Var = this.f0;
        if (u080Var != null) {
            Fn.B0 = u080Var;
        }
        Fn.n = this.m0;
        Fn.o = this.n0;
        Boolean bool2 = this.o0;
        if (bool2 != null) {
            Fn.setCanceledOnTouchOutside(bool2.booleanValue());
        }
        Fn.H0 = this.K0;
        Fn.c1 = this.U0;
        Fn.y0 = this.X0;
        Fn.d1 = this.V0;
        Fn.e1 = this.W0;
        Fn.f1 = this.Y0;
        Fn.s0 = this.Z0;
        Fn.t0 = this.D;
        Fn.u0 = this.a1;
        Fn.I0 = this.L0;
        Fn.S0 = this.M0;
        Fn.F0 = this.D0;
        Fn.G0 = this.E0;
        boolean z = this.N0;
        Fn.N0 = z;
        ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = Fn.i;
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.D = z;
        }
        Fn.q = this.O0;
        boolean z2 = this.b1;
        Fn.T0 = z2;
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.F = z2;
        }
        Fn.w(this.P0);
        int i = this.F0;
        if (i != -1) {
            Fn.L0 = i;
        }
        int i2 = this.G0;
        if (i2 != -1) {
            Fn.M0 = i2;
            ViewGroup viewGroup = Fn.j0;
            if (viewGroup != null) {
                f4m.v(i2, viewGroup);
            }
        }
        int i3 = this.I0;
        if (i3 != -1) {
            Fn.K0 = i3;
        }
        int i4 = this.H0;
        if (i4 != -1) {
            Fn.J0 = i4;
        }
        Fn.P = this.j0;
        Fn.Q = this.i0;
        CharSequence charSequence4 = this.V;
        if (charSequence4 != null && !drm0.N(charSequence4) && (hz20Var2 = this.W) != null) {
            Fn.H = this.V;
            Fn.I = hz20Var2;
        }
        CharSequence charSequence5 = this.X;
        if (charSequence5 != null && !drm0.N(charSequence5) && (hz20Var = this.Y) != null) {
            Fn.L = this.X;
            Fn.M = hz20Var;
        }
        View view = this.v0;
        if (view != null) {
            Fn.q0 = view;
        }
        int i5 = this.w0;
        if (i5 != -1) {
            Fn.R = i5;
        }
        int i6 = this.y0;
        if (i6 != -1) {
            Fn.W = i6;
        }
        int i7 = this.x0;
        if (i7 != -1) {
            Fn.S = i7;
        }
        Fn.P0 = this.C0 != null;
        float f2 = this.B0;
        if (f2 > -1.0f) {
            Fn.O = f2;
        }
        Fn.X = this.z0;
        Fn.E0 = this.k0;
        Fn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.zv20
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String str2 = dw20.d1;
                dw20 dw20Var = dw20.this;
                iz20 iz20Var = dw20Var.Hn().E;
                if (iz20Var != null) {
                    iz20Var.n(dw20Var);
                }
            }
        });
        Fn.R0 = this.Q0;
        float f3 = this.A;
        boolean z3 = this.B;
        boolean z4 = this.C;
        Fn.T = f3;
        Fn.U = z3;
        Fn.V = z4;
        Fn.W0 = this.s0;
        Fn.X0 = this.t0;
        Fn.Z0 = this.u0;
        gzs<s3q0> gzsVar = this.q0;
        if (gzsVar != null) {
            Fn.Y0 = gzsVar;
        }
        dialog = Fn;
        if (this.R0) {
            Fn.a1 = true;
            dialog = Fn;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.bw20
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
                dw20 dw20Var = dw20.this;
                if (i8 == 4) {
                    String str2 = dw20.d1;
                    if (keyEvent.getAction() == 0) {
                        return dw20Var.a0();
                    }
                }
                DialogInterface.OnKeyListener onKeyListener = dw20Var.h0;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(dialogInterface, i8, keyEvent);
                }
                return false;
            }
        });
        if (bundle != null) {
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    public static class b extends a<b, dw20> {
        public b(Context context) {
            super(context, null);
        }

        @Override // xsna.dw20.a
        public dw20 f() {
            return new dw20();
        }

        @Override // xsna.dw20.a
        public final b g() {
            return this;
        }
    }

    public void Nn(FrameLayout frameLayout) {
    }
}
