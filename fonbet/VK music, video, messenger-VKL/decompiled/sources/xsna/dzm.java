package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.Iterator;
import xsna.kt6;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class dzm {
    public static final kt6.a a = new kt6.a();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget2 != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget2 : null;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.V[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dVar.V[1];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviour3 == dimensionBehaviour9 || constraintWidget.F() || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.s == 0 && constraintWidget.Z == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.y(0)) || (dimensionBehaviour3 == dimensionBehaviour2 && constraintWidget.s == 1 && constraintWidget.z(0, constraintWidget.v()));
        boolean z2 = dimensionBehaviour4 == dimensionBehaviour9 || constraintWidget.G() || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.t == 0 && constraintWidget.Z == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.y(1)) || (dimensionBehaviour4 == dimensionBehaviour && constraintWidget.t == 1 && constraintWidget.z(1, constraintWidget.p()));
        return (constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z || z2)) || (z && z2);
    }

    public static void b(int i, ConstraintWidget constraintWidget, kt6.b bVar, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        char c;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.n) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.E() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.e0(constraintWidget, bVar, new kt6.a());
        }
        ConstraintAnchor n = constraintWidget.n(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor n2 = constraintWidget.n(ConstraintAnchor.Type.RIGHT);
        int d = n.d();
        int d2 = n2.d();
        HashSet<ConstraintAnchor> hashSet = n.a;
        if (hashSet != null && n.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i2 = i + 1;
                boolean a2 = a(constraintWidget2);
                ConstraintAnchor constraintAnchor5 = constraintWidget2.K;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.M;
                if (constraintWidget2.E() && a2) {
                    c = 0;
                    androidx.constraintlayout.core.widgets.d.e0(constraintWidget2, bVar, new kt6.a());
                } else {
                    c = 0;
                }
                char c2 = ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f) != null && constraintAnchor4.c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f) != null && constraintAnchor3.c)) ? (char) 1 : c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.V[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || a2) {
                    if (!constraintWidget2.E()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f == null) {
                            int e = constraintAnchor5.e() + d;
                            constraintWidget2.P(e, constraintWidget2.v() + e);
                            b(i2, constraintWidget2, bVar, z);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                            int e2 = d - constraintAnchor6.e();
                            constraintWidget2.P(e2 - constraintWidget2.v(), e2);
                            b(i2, constraintWidget2, bVar, z);
                        } else if (c2 != 0 && !constraintWidget2.C()) {
                            c(i2, constraintWidget2, bVar, z);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.w >= 0 && constraintWidget2.v >= 0 && (constraintWidget2.j0 == 8 || (constraintWidget2.s == 0 && constraintWidget2.Z == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget2.C() && !constraintWidget2.H && c2 != 0 && !constraintWidget2.C()) {
                        d(i2, constraintWidget, bVar, constraintWidget2, z);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = n2.a;
        if (hashSet2 != null && n2.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i3 = i + 1;
                boolean a3 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor7 = constraintWidget3.K;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.M;
                if (constraintWidget3.E() && a3) {
                    androidx.constraintlayout.core.widgets.d.e0(constraintWidget3, bVar, new kt6.a());
                }
                boolean z2 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f) != null && constraintAnchor2.c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || a3) {
                    if (!constraintWidget3.E()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f == null) {
                            int e3 = constraintAnchor7.e() + d2;
                            constraintWidget3.P(e3, constraintWidget3.v() + e3);
                            b(i3, constraintWidget3, bVar, z);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                            int e4 = d2 - constraintAnchor8.e();
                            constraintWidget3.P(e4 - constraintWidget3.v(), e4);
                            b(i3, constraintWidget3, bVar, z);
                        } else if (z2 && !constraintWidget3.C()) {
                            c(i3, constraintWidget3, bVar, z);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.w >= 0 && constraintWidget3.v >= 0) {
                    if (constraintWidget3.j0 == 8 || (constraintWidget3.s == 0 && constraintWidget3.Z == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        if (!constraintWidget3.C() && !constraintWidget3.H && z2 && !constraintWidget3.C()) {
                            d(i3, constraintWidget, bVar, constraintWidget3, z);
                        }
                    }
                }
            }
        }
        constraintWidget.n = true;
    }

    public static void c(int i, ConstraintWidget constraintWidget, kt6.b bVar, boolean z) {
        float f = constraintWidget.g0;
        ConstraintAnchor constraintAnchor = constraintWidget.K;
        int d = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        int d2 = constraintAnchor2.f.d();
        int e = constraintAnchor.e() + d;
        int e2 = d2 - constraintAnchor2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int v = constraintWidget.v();
        int i2 = (d2 - d) - v;
        if (d > d2) {
            i2 = (d - d2) - v;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + d;
        int i4 = i3 + v;
        if (d > d2) {
            i4 = i3 - v;
        }
        constraintWidget.P(i3, i4);
        b(i + 1, constraintWidget, bVar, z);
    }

    public static void d(int i, ConstraintWidget constraintWidget, kt6.b bVar, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.K;
        int e = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
        int d = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (d >= e) {
            int v = constraintWidget2.v();
            if (constraintWidget2.j0 != 8) {
                int i2 = constraintWidget2.s;
                if (i2 == 2) {
                    v = (int) (constraintWidget2.g0 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.v() : constraintWidget.W.v()));
                } else if (i2 == 0) {
                    v = d - e;
                }
                v = Math.max(constraintWidget2.v, v);
                int i3 = constraintWidget2.w;
                if (i3 > 0) {
                    v = Math.min(i3, v);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - v)) + 0.5f));
            constraintWidget2.P(i4, v + i4);
            b(i + 1, constraintWidget2, bVar, z);
        }
    }

    public static void e(int i, ConstraintWidget constraintWidget, kt6.b bVar) {
        float f = constraintWidget.h0;
        ConstraintAnchor constraintAnchor = constraintWidget.L;
        int d = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        int d2 = constraintAnchor2.f.d();
        int e = constraintAnchor.e() + d;
        int e2 = d2 - constraintAnchor2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int p = constraintWidget.p();
        int i2 = (d2 - d) - p;
        if (d > d2) {
            i2 = (d - d2) - p;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = d + i3;
        int i5 = i4 + p;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - p;
        }
        constraintWidget.Q(i4, i5);
        g(i + 1, constraintWidget, bVar);
    }

    public static void f(int i, ConstraintWidget constraintWidget, kt6.b bVar, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.L;
        int e = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.N;
        int d = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (d >= e) {
            int p = constraintWidget2.p();
            if (constraintWidget2.j0 != 8) {
                int i2 = constraintWidget2.t;
                if (i2 == 2) {
                    p = (int) (f * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.p() : constraintWidget.W.p()));
                } else if (i2 == 0) {
                    p = d - e;
                }
                p = Math.max(constraintWidget2.y, p);
                int i3 = constraintWidget2.z;
                if (i3 > 0) {
                    p = Math.min(i3, p);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - p)) + 0.5f));
            constraintWidget2.Q(i4, p + i4);
            g(i + 1, constraintWidget2, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(int i, ConstraintWidget constraintWidget, kt6.b bVar) {
        char c;
        char c2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        float f;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.o) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.E() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.e0(constraintWidget, bVar, new kt6.a());
        }
        ConstraintAnchor n = constraintWidget.n(ConstraintAnchor.Type.TOP);
        ConstraintAnchor n2 = constraintWidget.n(ConstraintAnchor.Type.BOTTOM);
        int d = n.d();
        int d2 = n2.d();
        HashSet<ConstraintAnchor> hashSet = n.a;
        char c3 = 1;
        if (hashSet != null && n.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i2 = i + 1;
                boolean a2 = a(constraintWidget2);
                ConstraintAnchor constraintAnchor5 = constraintWidget2.L;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.N;
                if (constraintWidget2.E() && a2) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    androidx.constraintlayout.core.widgets.d.e0(constraintWidget2, bVar, new kt6.a());
                } else {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                char c4 = ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f) != null && constraintAnchor4.c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f) != null && constraintAnchor3.c)) ? c3 : (char) 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.V[c3];
                char c5 = c3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || a2) {
                    if (!constraintWidget2.E()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f == null) {
                            int e = constraintAnchor5.e() + d;
                            constraintWidget2.Q(e, constraintWidget2.p() + e);
                            g(i2, constraintWidget2, bVar);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                            int e2 = d - constraintAnchor6.e();
                            constraintWidget2.Q(e2 - constraintWidget2.p(), e2);
                            g(i2, constraintWidget2, bVar);
                        } else if (c4 != 0 && !constraintWidget2.D()) {
                            e(i2, constraintWidget2, bVar);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.z >= 0 && constraintWidget2.y >= 0 && ((constraintWidget2.j0 == 8 || (constraintWidget2.t == 0 && constraintWidget2.Z == f)) && !constraintWidget2.D() && !constraintWidget2.H && c4 != 0 && !constraintWidget2.D())) {
                    f(i2, constraintWidget, bVar, constraintWidget2);
                }
                c3 = c5;
            }
        }
        char c6 = c3;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = n2.a;
        if (hashSet2 != null && n2.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i3 = i + 1;
                boolean a3 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor7 = constraintWidget3.L;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.N;
                if (constraintWidget3.E() && a3) {
                    androidx.constraintlayout.core.widgets.d.e0(constraintWidget3, bVar, new kt6.a());
                }
                boolean z = ((next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f) != null && constraintAnchor2.c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f) != null && constraintAnchor.c)) ? c6 == true ? 1 : 0 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[c6 == true ? 1 : 0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || a3) {
                    if (!constraintWidget3.E()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f == null) {
                            int e3 = constraintAnchor7.e() + d2;
                            constraintWidget3.Q(e3, constraintWidget3.p() + e3);
                            g(i3, constraintWidget3, bVar);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                            int e4 = d2 - constraintAnchor8.e();
                            constraintWidget3.Q(e4 - constraintWidget3.p(), e4);
                            g(i3, constraintWidget3, bVar);
                        } else if (z && !constraintWidget3.D()) {
                            e(i3, constraintWidget3, bVar);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.z >= 0 && constraintWidget3.y >= 0 && (constraintWidget3.j0 == 8 || (constraintWidget3.t == 0 && constraintWidget3.Z == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget3.D() && !constraintWidget3.H && z && !constraintWidget3.D()) {
                        f(i3, constraintWidget, bVar, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor n3 = constraintWidget.n(ConstraintAnchor.Type.BASELINE);
        if (n3.a != null && n3.c) {
            int d3 = n3.d();
            Iterator<ConstraintAnchor> it3 = n3.a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.d;
                int i4 = i + 1;
                boolean a4 = a(constraintWidget4);
                ConstraintAnchor constraintAnchor9 = constraintWidget4.O;
                if (constraintWidget4.E() && a4) {
                    androidx.constraintlayout.core.widgets.d.e0(constraintWidget4, bVar, new kt6.a());
                }
                if (constraintWidget4.V[c6 == true ? 1 : 0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget4.E()) {
                        if (next3 == constraintAnchor9) {
                            int e5 = next3.e() + d3;
                            if (constraintWidget4.F) {
                                int i5 = e5 - constraintWidget4.d0;
                                int i6 = constraintWidget4.Y + i5;
                                constraintWidget4.c0 = i5;
                                constraintWidget4.L.l(i5);
                                constraintWidget4.N.l(i6);
                                constraintAnchor9.l(e5);
                                boolean z2 = c6 == true ? 1 : 0;
                                constraintWidget4.m = z2;
                                c = z2;
                            } else {
                                c = c6 == true ? 1 : 0;
                            }
                            g(i4, constraintWidget4, bVar);
                            c2 = c;
                            c6 = c2;
                        }
                    }
                }
                c2 = c6 == true ? 1 : 0;
                c6 = c2;
            }
        }
        constraintWidget.o = c6;
    }
}
