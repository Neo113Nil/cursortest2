package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.u0;
import defpackage.alx;
import defpackage.bl40;
import defpackage.blx;
import defpackage.c06;
import defpackage.d6z;
import defpackage.g8e;
import defpackage.ly00;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.o2i0;
import defpackage.org0;
import defpackage.oyr;
import defpackage.sb2;
import defpackage.u90;
import defpackage.vy8;
import defpackage.wy8;
import defpackage.xy8;
import defpackage.yy8;
import defpackage.z2i0;
import defpackage.zy8;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public class CarouselLayoutManager extends RecyclerView.e implements u0 {
    public int J;
    public int K;
    public int L;
    public final wy8 M;
    public final bl40 N;
    public b O;
    public blx P;
    public int Q;
    public HashMap R;
    public zy8 S;
    public final View.OnLayoutChangeListener T;
    public int U;
    public int V;
    public final int W;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.M = new wy8();
        this.Q = 0;
        this.T = new u90(12, this);
        this.V = -1;
        this.W = 0;
        this.N = new bl40();
        Q1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.Carousel);
            this.W = obtainStyledAttributes.getInt(z2i0.Carousel_carousel_alignment, 0);
            Q1();
            S1(obtainStyledAttributes.getInt(o2i0.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public static c06 K1(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = Float.MAX_VALUE;
        float f4 = -3.4028235E38f;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            alx alxVar = (alx) list.get(i5);
            float f6 = z ? alxVar.b : alxVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f5) {
                i3 = i5;
                f5 = abs;
            }
            if (f6 <= f3) {
                i2 = i5;
                f3 = f6;
            }
            if (f6 > f4) {
                i4 = i5;
                f4 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        alx alxVar2 = (alx) list.get(i);
        alx alxVar3 = (alx) list.get(i3);
        c06 c06Var = new c06();
        d6z.n(alxVar2.a <= alxVar3.a);
        c06Var.a = alxVar2;
        c06Var.b = alxVar3;
        return c06Var;
    }

    public final void A1(r0 r0Var, int i, int i2) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        float E1 = E1(i);
        View e = r0Var.e(i);
        D0(0, 0, e);
        float z1 = z1(E1, this.P.a / 2.0f);
        c06 K1 = K1(this.P.c, z1, false);
        float D1 = D1(z1, K1);
        float f = this.P.a / 2.0f;
        G(i2, e, false);
        D0(0, 0, e);
        this.S.h((int) (D1 - f), (int) (D1 + f), e);
        T1(e, z1, K1);
    }

    public final void B1(int i, r0 r0Var, RecyclerView.k kVar) {
        float E1 = E1(i);
        while (i < kVar.b()) {
            float z1 = z1(E1, this.P.a / 2.0f);
            c06 K1 = K1(this.P.c, z1, false);
            float D1 = D1(z1, K1);
            if (N1(D1, K1)) {
                return;
            }
            E1 = z1(E1, this.P.a);
            if (!O1(D1, K1)) {
                View e = r0Var.e(i);
                float f = this.P.a / 2.0f;
                G(-1, e, false);
                D0(0, 0, e);
                this.S.h((int) (D1 - f), (int) (D1 + f), e);
                T1(e, z1, K1);
            }
            i++;
        }
    }

    public final void C1(r0 r0Var, int i) {
        float E1 = E1(i);
        while (i >= 0) {
            float z1 = z1(E1, this.P.a / 2.0f);
            c06 K1 = K1(this.P.c, z1, false);
            float D1 = D1(z1, K1);
            if (O1(D1, K1)) {
                return;
            }
            float f = this.P.a;
            E1 = M1() ? E1 + f : E1 - f;
            if (!N1(D1, K1)) {
                View e = r0Var.e(i);
                float f2 = this.P.a / 2.0f;
                G(0, e, false);
                D0(0, 0, e);
                this.S.h((int) (D1 - f2), (int) (D1 + f2), e);
                T1(e, z1, K1);
            }
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void D0(int i, int i2, View view) {
        if (!(view instanceof ly00)) {
            ny61.r("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        m(view, rect);
        int i3 = rect.left + rect.right;
        int i4 = rect.top + rect.bottom;
        b bVar = this.O;
        view.measure(RecyclerView.e.e0(this.H, this.F, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, (int) ((bVar == null || this.S.a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : bVar.a.a), L1()), RecyclerView.e.e0(this.I, this.G, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, (int) ((bVar == null || this.S.a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : bVar.a.a), J()));
    }

    public final float D1(float f, c06 c06Var) {
        alx alxVar = (alx) c06Var.a;
        float f2 = alxVar.b;
        alx alxVar2 = (alx) c06Var.b;
        float f3 = alxVar2.b;
        float f4 = alxVar.a;
        float f5 = alxVar2.a;
        float b = mj2.b(f2, f3, f4, f5, f);
        if (alxVar2 != this.P.b() && alxVar != this.P.d()) {
            return b;
        }
        return g8e.b(1.0f, alxVar2.c, f - f5, b);
    }

    public final float E1(int i) {
        return z1(this.S.f() - this.J, this.P.a * i);
    }

    public final void F1(r0 r0Var, RecyclerView.k kVar) {
        while (d0() > 0) {
            View c0 = c0(0);
            Rect rect = new Rect();
            RecyclerView.getDecoratedBoundsWithMarginsInt(c0, rect);
            float centerX = L1() ? rect.centerX() : rect.centerY();
            if (!O1(centerX, K1(this.P.c, centerX, true))) {
                break;
            } else {
                e1(c0, r0Var);
            }
        }
        while (d0() - 1 >= 0) {
            View c02 = c0(d0() - 1);
            Rect rect2 = new Rect();
            RecyclerView.getDecoratedBoundsWithMarginsInt(c02, rect2);
            float centerX2 = L1() ? rect2.centerX() : rect2.centerY();
            if (!N1(centerX2, K1(this.P.c, centerX2, true))) {
                break;
            } else {
                e1(c02, r0Var);
            }
        }
        if (d0() == 0) {
            C1(r0Var, this.Q - 1);
            B1(this.Q, r0Var, kVar);
        } else {
            int r0 = RecyclerView.e.r0(c0(0));
            int r02 = RecyclerView.e.r0(c0(d0() - 1));
            C1(r0Var, r0 - 1);
            B1(r02 + 1, r0Var, kVar);
        }
    }

    public final int G1() {
        return L1() ? this.H : this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        bl40 bl40Var = this.N;
        float f = bl40Var.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(org0.m3_carousel_small_item_size_min);
        }
        bl40Var.a = f;
        float f2 = bl40Var.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(org0.m3_carousel_small_item_size_max);
        }
        bl40Var.b = f2;
        Q1();
        recyclerView.addOnLayoutChangeListener(this.T);
    }

    public final blx H1(int i) {
        blx blxVar;
        HashMap hashMap = this.R;
        return (hashMap == null || (blxVar = (blx) hashMap.get(Integer.valueOf(sb2.k(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.O.a : blxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return L1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        recyclerView.removeOnLayoutChangeListener(this.T);
    }

    public final int I1(int i, blx blxVar) {
        if (!M1()) {
            return (int) ((blxVar.a / 2.0f) + ((i * blxVar.a) - blxVar.a().a));
        }
        float G1 = G1() - blxVar.c().a;
        float f = blxVar.a;
        return (int) ((G1 - (i * f)) - (f / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return !L1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0031, code lost:
    
        if (M1() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        if (r8 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003e, code lost:
    
        if (M1() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        char c;
        if (d0() == 0) {
            return null;
        }
        int i2 = this.S.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (RecyclerView.e.r0(view) == 0) {
                        return null;
                    }
                    A1(r0Var, RecyclerView.e.r0(c0(0)) - 1, 0);
                    return c0(M1() ? d0() - 1 : 0);
                }
                if (RecyclerView.e.r0(view) == getItemCount() - 1) {
                    return null;
                }
                A1(r0Var, RecyclerView.e.r0(c0(d0() - 1)) + 1, -1);
                return c0(M1() ? 0 : d0() - 1);
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public final int J1(int i, blx blxVar) {
        int i2 = Integer.MAX_VALUE;
        for (alx alxVar : blxVar.c.subList(blxVar.d, blxVar.e + 1)) {
            float f = blxVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int G1 = (M1() ? (int) ((G1() - alxVar.a) - f2) : (int) (f2 - alxVar.a)) - this.J;
            if (Math.abs(i2) > Math.abs(G1)) {
                i2 = G1;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (d0() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.e.r0(c0(0)));
            accessibilityEvent.setToIndex(RecyclerView.e.r0(c0(d0() - 1)));
        }
    }

    public final boolean L1() {
        return this.S.a == 0;
    }

    public final boolean M1() {
        return L1() && this.b.getLayoutDirection() == 1;
    }

    public final boolean N1(float f, c06 c06Var) {
        alx alxVar = (alx) c06Var.a;
        float f2 = alxVar.d;
        alx alxVar2 = (alx) c06Var.b;
        float b = mj2.b(f2, alxVar2.d, alxVar.b, alxVar2.b, f) / 2.0f;
        float f3 = M1() ? f + b : f - b;
        return M1() ? f3 < 0.0f : f3 > ((float) G1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int O(RecyclerView.k kVar) {
        if (d0() == 0 || this.O == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (this.H * (this.O.a.a / Q(kVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        V1();
    }

    public final boolean O1(float f, c06 c06Var) {
        alx alxVar = (alx) c06Var.a;
        float f2 = alxVar.d;
        alx alxVar2 = (alx) c06Var.b;
        float z1 = z1(f, mj2.b(f2, alxVar2.d, alxVar.b, alxVar2.b, f) / 2.0f);
        return M1() ? z1 > ((float) G1()) : z1 < 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int P(RecyclerView.k kVar) {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        V1();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final void P1(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int Q(RecyclerView.k kVar) {
        return this.L - this.K;
    }

    public final void Q1() {
        this.O = null;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (d0() == 0 || this.O == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (this.I * (this.O.a.a / T(kVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        V1();
    }

    public final int R1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (d0() != 0 && i != 0) {
            if (this.O == null) {
                P1(r0Var);
            }
            int itemCount = getItemCount();
            b bVar = this.O;
            if (itemCount > (M1() ? bVar.a() : bVar.c()).b) {
                int i2 = this.J;
                int i3 = this.K;
                int i4 = this.L;
                int i5 = i2 + i;
                if (i5 < i3) {
                    i = i3 - i2;
                } else if (i5 > i4) {
                    i = i4 - i2;
                }
                this.J = i2 + i;
                U1(this.O);
                float f = this.P.a / 2.0f;
                float E1 = E1(RecyclerView.e.r0(c0(0)));
                Rect rect = new Rect();
                boolean M1 = M1();
                blx blxVar = this.P;
                float f2 = M1 ? blxVar.c().b : blxVar.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < d0(); i6++) {
                    View c0 = c0(i6);
                    float z1 = z1(E1, f);
                    c06 K1 = K1(this.P.c, z1, false);
                    float D1 = D1(z1, K1);
                    RecyclerView.getDecoratedBoundsWithMarginsInt(c0, rect);
                    T1(c0, z1, K1);
                    this.S.j(c0, rect, f, D1);
                    float abs = Math.abs(f2 - D1);
                    if (abs < f3) {
                        this.V = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                        f3 = abs;
                    }
                    E1 = z1(E1, this.P.a);
                }
                F1(r0Var, kVar);
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        return this.J;
    }

    public final void S1(int i) {
        zy8 yy8Var;
        if (i != 0 && i != 1) {
            ny61.g(oyr.i(i, "invalid orientation:"));
            return;
        }
        H(null);
        zy8 zy8Var = this.S;
        if (zy8Var == null || i != zy8Var.a) {
            if (i == 0) {
                yy8Var = new yy8(this);
            } else {
                if (i != 1) {
                    ny61.g("invalid orientation");
                    return;
                }
                yy8Var = new xy8(this);
            }
            this.S = yy8Var;
            Q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        return this.L - this.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T1(View view, float f, c06 c06Var) {
        if (view instanceof ly00) {
            alx alxVar = (alx) c06Var.a;
            float f2 = alxVar.c;
            alx alxVar2 = (alx) c06Var.b;
            float b = mj2.b(f2, alxVar2.c, alxVar.a, alxVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF b2 = this.S.b(height, width, mj2.b(0.0f, height / 2.0f, 0.0f, 1.0f, b), mj2.b(0.0f, width / 2.0f, 0.0f, 1.0f, b));
            float D1 = D1(f, c06Var);
            RectF rectF = new RectF(D1 - (b2.width() / 2.0f), D1 - (b2.height() / 2.0f), (b2.width() / 2.0f) + D1, (b2.height() / 2.0f) + D1);
            RectF rectF2 = new RectF(this.S.d(), this.S.g(), this.S.e(), this.S.c());
            this.N.getClass();
            this.S.a(b2, rectF, rectF2);
            this.S.i(b2, rectF, rectF2);
            ((ly00) view).setMaskRectF(b2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        if (kVar.b() <= 0 || G1() <= 0.0f) {
            c1(r0Var);
            this.Q = 0;
            return;
        }
        boolean M1 = M1();
        b bVar = this.O;
        int i = 1;
        boolean z = bVar == null;
        if (z || bVar.a.f != G1()) {
            P1(r0Var);
        }
        b bVar2 = this.O;
        boolean M12 = M1();
        blx a = M12 ? bVar2.a() : bVar2.c();
        float f = (M12 ? a.c() : a.a()).a;
        float f2 = a.a / 2.0f;
        int f3 = (int) (this.S.f() - (M1() ? f + f2 : f - f2));
        b bVar3 = this.O;
        boolean M13 = M1();
        blx c = M13 ? bVar3.c() : bVar3.a();
        alx a2 = M13 ? c.a() : c.c();
        int b = (int) ((((M13 ? -1 : 1) * a2.d) / 2.0f) + ((((kVar.b() - 1) * c.a) * (M13 ? -1.0f : 1.0f)) - (a2.a - this.S.f())));
        int min = M13 ? Math.min(0, b) : Math.max(0, b);
        this.K = M1 ? min : f3;
        if (M1) {
            min = f3;
        }
        this.L = min;
        if (z) {
            this.J = f3;
            b bVar4 = this.O;
            int itemCount = getItemCount();
            int i2 = this.K;
            int i3 = this.L;
            boolean M14 = M1();
            List list = bVar4.b;
            List list2 = bVar4.c;
            float f4 = bVar4.a.a;
            HashMap hashMap = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (i4 < itemCount) {
                int i6 = M14 ? (itemCount - i4) - i : i4;
                int i7 = i;
                if (i6 * f4 * (M14 ? -1 : i7) > i3 - bVar4.g || i4 >= itemCount - list2.size()) {
                    hashMap.put(Integer.valueOf(i6), (blx) list2.get(sb2.k(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = itemCount - 1; i10 >= 0; i10--) {
                int i11 = M14 ? (itemCount - i10) - 1 : i10;
                if (i11 * f4 * (M14 ? -1 : i8) < i2 + bVar4.f || i10 < list.size()) {
                    hashMap.put(Integer.valueOf(i11), (blx) list.get(sb2.k(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.R = hashMap;
            int i12 = this.V;
            if (i12 != -1) {
                this.J = I1(i12, H1(i12));
            }
        }
        int i13 = this.J;
        int i14 = this.K;
        int i15 = this.L;
        this.J = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.Q = sb2.k(this.Q, 0, kVar.b());
        U1(this.O);
        U(r0Var);
        F1(r0Var, kVar);
        this.U = getItemCount();
    }

    public final void U1(b bVar) {
        int i = this.L;
        int i2 = this.K;
        if (i <= i2) {
            this.P = M1() ? bVar.a() : bVar.c();
        } else {
            this.P = bVar.b(this.J, i2, i);
        }
        List list = this.P.c;
        wy8 wy8Var = this.M;
        wy8Var.getClass();
        wy8Var.b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        if (d0() == 0) {
            this.Q = 0;
        } else {
            this.Q = RecyclerView.e.r0(c0(0));
        }
    }

    public final void V1() {
        int itemCount = getItemCount();
        int i = this.U;
        if (itemCount == i || this.O == null) {
            return;
        }
        bl40 bl40Var = this.N;
        if ((i < bl40Var.c && getItemCount() >= bl40Var.c) || (i >= bl40Var.c && getItemCount() < bl40Var.c)) {
            Q1();
        }
        this.U = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.u0
    public final PointF d(int i) {
        if (this.O == null) {
            return null;
        }
        int I1 = I1(i, H1(i)) - this.J;
        return L1() ? new PointF(I1, 0.0f) : new PointF(0.0f, I1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean h1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int J1;
        if (this.O == null || (J1 = J1(RecyclerView.e.r0(view), H1(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition()))) == 0) {
            return false;
        }
        int i = this.J;
        int i2 = this.K;
        int i3 = this.L;
        int i4 = i + J1;
        if (i4 < i2) {
            J1 = i2 - i;
        } else if (i4 > i3) {
            J1 = i3 - i;
        }
        int J12 = J1(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), this.O.b(i + J1, i2, i3));
        if (L1()) {
            recyclerView.scrollBy(J12, 0);
            return true;
        }
        recyclerView.scrollBy(0, J12);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void i0(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        float centerY = rect.centerY();
        if (L1()) {
            centerY = rect.centerX();
        }
        c06 K1 = K1(this.P.c, centerY, true);
        alx alxVar = (alx) K1.a;
        float f = alxVar.d;
        alx alxVar2 = (alx) K1.b;
        float b = mj2.b(f, alxVar2.d, alxVar.b, alxVar2.b, centerY);
        float width = L1() ? (rect.width() - b) / 2.0f : 0.0f;
        float height = L1() ? 0.0f : (rect.height() - b) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (L1()) {
            return R1(i, r0Var, kVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        this.V = i;
        if (this.O == null) {
            return;
        }
        this.J = I1(i, H1(i));
        this.Q = sb2.k(i, 0, Math.max(0, getItemCount() - 1));
        U1(this.O);
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (J()) {
            return R1(i, r0Var, kVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: x0 */
    public final boolean getK() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        vy8 vy8Var = new vy8(this, recyclerView.getContext());
        vy8Var.a = i;
        v(vy8Var);
    }

    public final float z1(float f, float f2) {
        return M1() ? f - f2 : f + f2;
    }

    public CarouselLayoutManager() {
        bl40 bl40Var = new bl40();
        this.M = new wy8();
        this.Q = 0;
        this.T = new u90(12, this);
        this.V = -1;
        this.W = 0;
        this.N = bl40Var;
        Q1();
        S1(0);
    }
}
