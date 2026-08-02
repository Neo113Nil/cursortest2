package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.SnappingAnchor;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class q1t0 {
    public final kn2 a;
    public final kn2 b;
    public final lq80 c;

    public q1t0(kn2 kn2Var, kn2 kn2Var2, lq80 lq80Var) {
        this.a = kn2Var;
        this.b = kn2Var2;
        this.c = lq80Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, o1t0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, o1t0] */
    public static final void c(d2t0 d2t0Var, RecyclerView.e eVar, q1t0 q1t0Var, View view, ScrollDirection scrollDirection, d0 d0Var, int i, Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, a2t0 a2t0Var, Ref$BooleanRef ref$BooleanRef, SnappingAnchor snappingAnchor) {
        int k;
        int k2;
        n1t0 n1t0Var = new n1t0(eVar, q1t0Var.b, snappingAnchor, view, d2t0Var, scrollDirection);
        int[] iArr = p1t0.a;
        int i2 = iArr[snappingAnchor.ordinal()];
        if (i2 == 1) {
            k = d0Var.k();
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            k = d0Var.g();
        }
        int d = n1t0Var.d() - k;
        boolean z = false;
        boolean z2 = n1t0Var.c(k) || n1t0Var.a(k, k + i, scrollDirection);
        if (Math.abs(ref$IntRef.element) > Math.abs(d) && tje.f0(d) == scrollDirection) {
            z = true;
        }
        if (jl40.l(d2t0Var.b, Boolean.TRUE) && z2 && z) {
            view.setTag(qch0.snapping_anchor, snappingAnchor);
            ref$ObjectRef.element = new o1t0(view, a2t0Var);
            ref$IntRef.element = d;
            ref$BooleanRef.element = true;
        }
        int i3 = iArr[snappingAnchor.ordinal()];
        if (i3 == 1) {
            k2 = d0Var.k();
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            k2 = d0Var.g();
        }
        int d2 = n1t0Var.d() - k2;
        if (!n1t0Var.c(k2 + i) || Math.abs(ref$IntRef.element) <= Math.abs(d2) || ref$BooleanRef.element) {
            return;
        }
        view.setTag(qch0.snapping_anchor, snappingAnchor);
        ref$ObjectRef.element = new o1t0(view, a2t0Var);
        ref$IntRef.element = d2;
    }

    public final int[] a(RecyclerView.e eVar, ScrollDirection scrollDirection, View view) {
        int d;
        int g;
        int d2;
        int g2;
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        Object tag = view.getTag(qch0.snapping_anchor);
        SnappingAnchor snappingAnchor = tag instanceof SnappingAnchor ? (SnappingAnchor) tag : null;
        if (snappingAnchor == null) {
            snappingAnchor = SnappingAnchor.START;
        }
        SnappingAnchor snappingAnchor2 = snappingAnchor;
        a2t0 a2t0Var = (a2t0) this.a.invoke(view);
        if (a2t0Var != null) {
            SnappingAnchor snappingAnchor3 = SnappingAnchor.START;
            d2t0 c = snappingAnchor2 == snappingAnchor3 ? a2t0Var.c() : a2t0Var.b();
            if (c != null) {
                n1t0 n1t0Var = new n1t0(eVar, this.b, snappingAnchor2, view, c, scrollDirection);
                boolean I = eVar.I();
                lq80 lq80Var = this.c;
                if (I) {
                    d0 a = lq80Var.a(eVar);
                    if (snappingAnchor2 == snappingAnchor3) {
                        d2 = n1t0Var.d();
                        g2 = a.k();
                    } else {
                        d2 = n1t0Var.d();
                        g2 = a.g();
                    }
                    iArr[0] = d2 - g2;
                }
                if (eVar.J()) {
                    d0 c2 = lq80Var.c(eVar);
                    if (snappingAnchor2 == snappingAnchor3) {
                        d = n1t0Var.d();
                        g = c2.k();
                    } else {
                        d = n1t0Var.d();
                        g = c2.g();
                    }
                    iArr[1] = d - g;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o1t0 b(RecyclerView.e eVar, ScrollDirection scrollDirection, int i) {
        d0 b;
        a2t0 a2t0Var;
        if (eVar.getItemCount() == 0 || (b = this.c.b(eVar)) == null) {
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = Integer.MAX_VALUE;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int d0 = eVar.d0();
        for (int i2 = 0; i2 < d0; i2++) {
            View c0 = eVar.c0(i2);
            if (c0 != null && (a2t0Var = (a2t0) this.a.invoke(c0)) != null && a2t0Var.d()) {
                d2t0 c = a2t0Var.c();
                if (c != null) {
                    c(c, eVar, this, c0, scrollDirection, b, i, ref$IntRef, ref$ObjectRef, a2t0Var, ref$BooleanRef, SnappingAnchor.START);
                }
                d2t0 b2 = a2t0Var.b();
                if (b2 != null) {
                    c(b2, eVar, this, c0, scrollDirection, b, i, ref$IntRef, ref$ObjectRef, a2t0Var, ref$BooleanRef, SnappingAnchor.END);
                }
            }
        }
        return (o1t0) ref$ObjectRef.element;
    }
}
