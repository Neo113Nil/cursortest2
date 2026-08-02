package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ComposeStackTraceBuilder.kt */
/* loaded from: classes11.dex */
public final class tqi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.q3y0, xsna.sqi] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.rgt] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List a(y2k0 y2k0Var, Integer num, int i, Integer num2) {
        int i2;
        int w;
        fh50<Object> b;
        if (y2k0Var.w || y2k0Var.t() == 0) {
            return EmptyList.b;
        }
        ?? q3y0Var = new q3y0(y2k0Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = y2k0Var.v;
            if (i2 < 0) {
                i2 = y2k0Var.M(i, y2k0Var.b);
            }
        }
        if (num == 0) {
            int V = y2k0Var.i - y2k0Var.V(y2k0Var.v(i), y2k0Var.b);
            pg50<fh50<Object>> pg50Var = y2k0Var.s;
            num = Integer.valueOf(V + ((pg50Var == null || (b = pg50Var.b(i)) == null) ? 0 : b.b));
        }
        int v = y2k0Var.v(i) * 5;
        int[] iArr = y2k0Var.b;
        if (v < iArr.length) {
            w = y2k0Var.w(i);
        } else {
            int M = i2 >= 0 ? y2k0Var.M(i2, iArr) : i2;
            w = y2k0Var.w(i2);
            int i3 = i2;
            i2 = M;
            i = i3;
        }
        while (i >= 0) {
            q3y0Var.d(w, (y2k0Var.b[(y2k0Var.v(i) * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? y2k0Var.x(i) : a.C0011a.a, y2k0Var.W(i), num);
            num = y2k0Var.b(i);
            if (i2 >= 0) {
                int M2 = y2k0Var.M(i2, y2k0Var.b);
                w = y2k0Var.w(i2);
                int i4 = i2;
                i2 = M2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return q3y0Var.a;
    }

    public static final Integer b(r2k0 r2k0Var, cvi cviVar, int i, int i2) {
        Integer b;
        int[] iArr = r2k0Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int a = x2k0.a(i, iArr) + i;
            if (r2k0Var.j(i) && r2k0Var.i(i) == 206 && epx.f(r2k0Var.p(i, iArr), androidx.compose.runtime.b.f)) {
                Object h = r2k0Var.h(i, 0);
                iuf0 iuf0Var = h instanceof iuf0 ? (iuf0) h : null;
                Object b2 = iuf0Var != null ? iuf0Var.b() : null;
                c.a aVar = b2 instanceof c.a ? (c.a) b2 : null;
                if (aVar != null && aVar.b.equals(cviVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (r2k0Var.d(i) && (b = b(r2k0Var, cviVar, i + 1, a)) != null) {
                return Integer.valueOf(b.intValue());
            }
            i = a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.sqi, xsna.y7f0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList c(r2k0 r2k0Var, int i, Integer num) {
        ?? y7f0Var = new y7f0(r2k0Var);
        int q = r2k0Var.q(i);
        rgt a = r2k0Var.a(i);
        while (i >= 0) {
            y7f0Var.d(r2k0Var.i(i), r2k0Var.k(i) ? r2k0Var.p(i, r2k0Var.b) : a.C0011a.a, r2k0Var.a.h0(i), num);
            if (q >= 0) {
                rgt rgtVar = a;
                a = r2k0Var.a(q);
                i = q;
                q = r2k0Var.q(q);
                num = rgtVar;
            } else {
                i = q;
                num = a;
            }
        }
        return y7f0Var.a;
    }
}
