package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class x5p0 {
    public static final float a;
    public static final float b = 24;
    public static final float c = 40;
    public static final u890 d;

    static {
        float f = 4;
        a = f;
        float f2 = 8;
        d = new u890(f2, f, f2, f);
    }

    public static final void a(final b6p0 b6p0Var, q630 q630Var, float f, r5j0 r5j0Var, long j, long j2, float f2, float f3, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final float f4;
        final r5j0 r5j0Var2;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        float f7;
        int i3;
        float f8;
        float f9;
        q630 q630Var3;
        r5j0 r5j0Var3;
        long j5;
        androidx.compose.runtime.a M = aVar.M(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(b6p0Var) : M.y(b6p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | X2.b.f;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i5 & 1, (306783379 & i5) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f7 = f5p0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(49570325, 6, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:622)");
                }
                r5j0 a2 = p6j0.a(ata0.b, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1982928937, 6, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:630)");
                }
                long c2 = u7g.c(ata0.c, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(102696215, 6, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:626)");
                }
                long c3 = u7g.c(ata0.a, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = i5 & (-4186113);
                f8 = 0;
                f9 = 0;
                j3 = c2;
                q630Var3 = q630.a.a;
                r5j0Var3 = a2;
                j5 = c3;
            } else {
                M.h();
                i3 = i5 & (-4186113);
                q630Var3 = q630Var;
                f7 = f;
                r5j0Var3 = r5j0Var;
                j3 = j;
                j5 = j2;
                f8 = f2;
                f9 = f3;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-343758958, i3, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
            }
            M.K(-1719831991);
            M.j();
            int i6 = i3 >> 9;
            aVar2 = M;
            xjn0.a(q630Var3, r5j0Var3, j5, 0L, f8, f9, kai.c(-1573998995, new s5p0(f7, j3, jaiVar), M), aVar2, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f4 = f7;
            q630Var2 = q630Var3;
            r5j0Var2 = r5j0Var3;
            j4 = j5;
            f5 = f8;
            f6 = f9;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            f4 = f;
            r5j0Var2 = r5j0Var;
            j3 = j;
            j4 = j2;
            f5 = f2;
            f6 = f3;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q5p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x5p0.a(b6p0.this, q630Var2, f4, r5j0Var2, j3, j4, f5, f6, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(fxb0 fxb0Var, final jai jaiVar, h6p0 h6p0Var, q630 q630Var, boolean z, jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        fxb0 fxb0Var2;
        h6p0 h6p0Var2;
        final jai jaiVar3;
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(-293753984);
        if ((i & 6) == 0) {
            i2 = (M.J(fxb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(h6p0Var) : M.y(h6p0Var) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= M.y(jaiVar2) ? 67108864 : 33554432;
        }
        if (M.t(i3 & 1, (38347923 & i3) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-293753984, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
            }
            wlp0 f = ump0.f(h6p0Var.c(), "tooltip transition", M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new c6p0(new meo(2, wh50Var), fxb0Var);
                M.R(x2);
            }
            fxb0Var2 = fxb0Var;
            h6p0Var2 = h6p0Var;
            ru6.a(fxb0Var2, kai.c(-527401546, new t5p0(f, jaiVar, (c6p0) x2), M), h6p0Var2, kai.c(-23901870, new v5p0(wh50Var, jaiVar2), M), M, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
            jaiVar3 = jaiVar2;
            z2 = true;
        } else {
            fxb0Var2 = fxb0Var;
            h6p0Var2 = h6p0Var;
            M.h();
            jaiVar3 = jaiVar2;
            z2 = z;
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final fxb0 fxb0Var3 = fxb0Var2;
            final h6p0 h6p0Var3 = h6p0Var2;
            s.d = new wzs() { // from class: xsna.r5p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x5p0.b(fxb0.this, jaiVar, h6p0Var3, q630Var2, z2, jaiVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final k6p0 c(androidx.compose.runtime.a aVar) {
        ni50 ni50Var = fu6.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1413230530, 0, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:962)");
        }
        boolean l = aVar.l(false) | aVar.J(ni50Var);
        Object x = aVar.x();
        if (l || x == a.C0011a.a) {
            x = new k6p0(ni50Var);
            aVar.R(x);
        }
        k6p0 k6p0Var = (k6p0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return k6p0Var;
    }
}
