package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.bqx0;
import xsna.g4x;

/* compiled from: InsetsHandler.kt */
/* loaded from: classes3.dex */
public final class l4x {
    public final IdentityHashMap a = new IdentityHashMap();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    /* compiled from: InsetsHandler.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a() {
            this(false, 31, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplyConfig(applyTop=");
            sb.append(this.a);
            sb.append(", applyBottom=");
            sb.append(this.b);
            sb.append(", applyLeft=");
            sb.append(this.c);
            sb.append(", applyRight=");
            sb.append(this.d);
            sb.append(", applyNavigationBars=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public a(boolean z, int i, boolean z2, boolean z3) {
            z = (i & 1) != 0 ? true : z;
            z2 = (i & 2) != 0 ? true : z2;
            boolean z4 = (i & 8) != 0;
            z3 = (i & 16) != 0 ? true : z3;
            this.a = z;
            this.b = z2;
            this.c = true;
            this.d = z4;
            this.e = z3;
        }
    }

    public static void b(bqx0 bqx0Var, a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, Rect rect, g4x.c cVar) {
        bqx0.q qVar = bqx0Var.a;
        h4x i = qVar.i(128);
        h4x i2 = qVar.i(519);
        h4x j = qVar.j(2);
        if (aVar.e) {
            i2 = h4x.a(i2, j);
        }
        h4x a2 = h4x.a(i, i2);
        int i3 = rect.left;
        Integer valueOf = Integer.valueOf(a2.a);
        if (!aVar.c) {
            valueOf = null;
        }
        int intValue = i3 + (valueOf != null ? valueOf.intValue() : 0);
        int i4 = rect.right;
        Integer valueOf2 = Integer.valueOf(a2.c);
        if (!aVar.d) {
            valueOf2 = null;
        }
        int intValue2 = i4 + (valueOf2 != null ? valueOf2.intValue() : 0);
        int i5 = rect.top;
        Integer valueOf3 = Integer.valueOf(a2.b);
        if (!aVar.a) {
            valueOf3 = null;
        }
        int intValue3 = i5 + (valueOf3 != null ? valueOf3.intValue() : 0);
        int i6 = rect.bottom;
        Integer valueOf4 = aVar.b ? Integer.valueOf(a2.d) : null;
        int intValue4 = i6 + (valueOf4 != null ? valueOf4.intValue() : 0);
        int i7 = cVar.c;
        if (intValue < i7) {
            intValue = i7;
        }
        int i8 = cVar.a;
        if (intValue3 < i8) {
            intValue3 = i8;
        }
        int i9 = cVar.d;
        if (intValue2 < i9) {
            intValue2 = i9;
        }
        int i10 = cVar.b;
        if (intValue4 < i10) {
            intValue4 = i10;
        }
        marginLayoutParams.setMargins(intValue, intValue3, intValue2, intValue4);
    }

    public final void a(View view, g4x g4xVar) {
        this.b.add(new qg90(view, g4xVar));
    }

    public final void c(WindowInsets windowInsets, View view, g4x g4xVar, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        IdentityHashMap identityHashMap = this.a;
        Rect rect = (Rect) identityHashMap.get(view);
        if (rect == null) {
            rect = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            identityHashMap.put(view, rect);
        }
        h4x i = bqx0.h(null, windowInsets).a.i(64);
        bqx0.q qVar = bqx0.h(null, windowInsets).a;
        h4x a2 = h4x.a(this.d ? qVar.j(519) : qVar.i(519), i);
        int i2 = a2.d;
        int i3 = a2.c;
        int i4 = a2.a;
        if (z) {
            f4m.u(view, rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        nen h = bqx0.h(null, windowInsets).a.h();
        if (g4xVar instanceof g4x.a) {
            g4x.a aVar = (g4x.a) g4xVar;
            boolean z2 = true;
            if (aVar instanceof g4x.a.C2912a) {
                bqx0 h2 = bqx0.h(null, windowInsets);
                Context context = view.getContext();
                HashSet hashSet = iah0.a;
                b(h2, new a(true, 12, true, fnj.d(context)), marginLayoutParams, rect, ((g4x.a.C2912a) aVar).a);
            } else if (aVar instanceof g4x.a.c) {
                bqx0 h3 = bqx0.h(null, windowInsets);
                Context context2 = view.getContext();
                HashSet hashSet2 = iah0.a;
                b(h3, new a(false, 12, false, fnj.d(context2)), marginLayoutParams, rect, ((g4x.a.c) aVar).a);
            } else if (aVar instanceof g4x.a.b) {
                bqx0 h4 = bqx0.h(null, windowInsets);
                Context context3 = view.getContext();
                HashSet hashSet3 = iah0.a;
                b(h4, new a(false, 4, false, fnj.d(context3)), marginLayoutParams, rect, ((g4x.a.b) aVar).a);
            } else if (aVar instanceof g4x.a.d) {
                if (!iah0.r(view.getContext()) || (!fnj.d(view.getContext()) && !t5m.a(view.getContext()))) {
                    z2 = false;
                }
                b(bqx0.h(null, windowInsets), new a(false, 12, z2, z2), marginLayoutParams, rect, ((g4x.a.d) aVar).a);
            } else {
                if (!(aVar instanceof g4x.a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                b(bqx0.h(null, windowInsets), new a(false, 3, false, false), marginLayoutParams, rect, ((g4x.a.e) aVar).a);
            }
        } else if (epx.f(g4xVar, b4x.a)) {
            marginLayoutParams.setMargins(rect.left + i4, rect.top, rect.right + i3, rect.bottom);
        } else if (epx.f(g4xVar, f4x.a)) {
            marginLayoutParams.setMargins(rect.left + i4, rect.top + a2.b, rect.right + i3, rect.bottom);
        } else if (epx.f(g4xVar, c4x.a)) {
            marginLayoutParams.setMargins(rect.left + i4, rect.top, rect.right + i3, rect.bottom + i2);
        } else if (epx.f(g4xVar, d4x.a)) {
            Context context4 = view.getContext();
            int safeInsetLeft = (!iah0.r(context4) || h == null) ? 0 : h.a.getSafeInsetLeft();
            int safeInsetTop = (!iah0.s(context4) || h == null) ? 0 : h.a.getSafeInsetTop();
            int safeInsetRight = (iah0.s(context4) || h == null) ? 0 : h.a.getSafeInsetRight();
            if (iah0.s(context4) || (!fnj.d(context4) && !t5m.a(context4))) {
                i2 = 0;
            }
            int i5 = rect.left + i4 + safeInsetLeft;
            int i6 = rect.right + i3 + safeInsetRight;
            int i7 = rect.top + safeInsetTop;
            int i8 = rect.bottom + i2;
            if (i5 < 0) {
                i5 = 0;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            marginLayoutParams.setMargins(i5, i7, i6, i8 >= 0 ? i8 : 0);
        } else if (epx.f(g4xVar, e4x.a)) {
            Context context5 = view.getContext();
            int safeInsetLeft2 = (!iah0.r(context5) || h == null) ? 0 : h.a.getSafeInsetLeft();
            int safeInsetRight2 = (iah0.s(context5) || h == null) ? 0 : h.a.getSafeInsetRight();
            int i9 = rect.left + i4 + safeInsetLeft2;
            int i10 = rect.right + i3 + safeInsetRight2;
            int i11 = rect.top;
            int i12 = rect.bottom;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            marginLayoutParams.setMargins(i9, i11, i10, i12 >= 0 ? i12 : 0);
        } else if (epx.f(g4xVar, g4x.d.a)) {
            view.dispatchApplyWindowInsets(windowInsets);
        } else if (!epx.f(g4xVar, g4x.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.e) {
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(WindowInsets windowInsets, boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            qg90 qg90Var = (qg90) it.next();
            c(windowInsets, (View) qg90Var.a, (g4x) qg90Var.b, z);
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            qg90 qg90Var2 = (qg90) it2.next();
            c(windowInsets, (View) qg90Var2.a, (g4x) qg90Var2.b, z);
        }
    }
}
