package xsna;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes11.dex */
public final class lrr {
    public static final float a;
    public static final float b;

    static {
        int i = obq.a;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        int i2 = mbq.a;
        a = 20;
        b = 80;
    }

    public static final void a(final gzs gzsVar, q630 q630Var, r5j0 r5j0Var, long j, long j2, uqr uqrVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final r5j0 r5j0Var2;
        final long j3;
        final long j4;
        final uqr uqrVar2;
        long c;
        long a2;
        uqr g;
        int i2;
        r5j0 r5j0Var3;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(1039585610);
        int i3 = i | (M.y(gzsVar) ? 4 : 2) | 1647792;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-536021915, 6, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:525)");
                }
                r5j0 a3 = p6j0.a(nbq.a, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1855656391, 6, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:529)");
                }
                c = u7g.c(hhq.a, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = u7g.a(0, c, M);
                g = sdi.g();
                i2 = i3 & (-524161);
                r5j0Var3 = a3;
                q630Var3 = q630.a.a;
            } else {
                M.h();
                i2 = i3 & (-524161);
                q630Var3 = q630Var;
                r5j0Var3 = r5j0Var;
                c = j;
                a2 = j2;
                g = uqrVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1039585610, i2, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:320)");
            }
            long j5 = a2;
            uqr uqrVar3 = g;
            long j6 = c;
            b(gzsVar, q630Var3, r5j0Var3, j6, j5, uqrVar3, kai.c(-1233936436, new irr(), M), M, (i2 & 14) | 14155824);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            r5j0Var2 = r5j0Var3;
            j3 = j6;
            j4 = j5;
            uqrVar2 = uqrVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
            r5j0Var2 = r5j0Var;
            j3 = j;
            j4 = j2;
            uqrVar2 = uqrVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, r5j0Var2, j3, j4, uqrVar2, i) { // from class: xsna.frr
                public final /* synthetic */ q630 c;
                public final /* synthetic */ r5j0 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ uqr g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(12582913);
                    lrr.a(gzs.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final gzs gzsVar, final q630 q630Var, final r5j0 r5j0Var, final long j, final long j2, final uqr uqrVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(748201188);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(r5j0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.p(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(uqrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(748201188, i2, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
            }
            int i3 = i2 << 9;
            aVar2 = M;
            c(gzsVar, evp0.a(nbq.b, M), chq.b, q630Var, r5j0Var, j, j2, uqrVar, jaiVar, aVar2, (i2 & 14) | 3456 | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), (i2 >> 21) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.grr
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lrr.b(gzs.this, q630Var, r5j0Var, j, j2, uqrVar, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final gzs gzsVar, final nmo0 nmo0Var, final float f, final q630 q630Var, final r5j0 r5j0Var, final long j, final long j2, final uqr uqrVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        jai jaiVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i5;
        float f2 = chq.a;
        androidx.compose.runtime.a M = aVar.M(121669932);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(nmo0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.n(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.n(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(r5j0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.p(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.J(uqrVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= M.J(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            jaiVar2 = jaiVar;
            i4 = i2 | (M.y(jaiVar2) ? 4 : 2);
        } else {
            jaiVar2 = jaiVar;
            i4 = i2;
        }
        boolean z = true;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(121669932, i3, i4, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
            }
            M.K(-282833393);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.j();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new a60(29);
                M.R(x2);
            }
            q630 b2 = egi0.b(q630Var, false, (izs) x2);
            float f3 = uqrVar.a;
            int i6 = i3 >> 21;
            int i7 = i6 & 112;
            int i8 = i3;
            if (androidx.compose.runtime.b.d()) {
                q630Var2 = b2;
                androidx.compose.runtime.b.f(-424810125, i7, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:619)");
            } else {
                q630Var2 = b2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1845106002, i7, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:628)");
            }
            boolean J = M.J(sg50Var);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                i5 = i7;
                x3 = new xqr(uqrVar.a, uqrVar.b, uqrVar.d, uqrVar.c);
                M.R(x3);
            } else {
                i5 = i7;
            }
            xqr xqrVar = (xqr) x3;
            boolean y = M.y(xqrVar);
            if (((i5 ^ 48) <= 32 || !M.J(uqrVar)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean z2 = y | z;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new rqr(xqrVar, uqrVar, null);
                M.R(x4);
            }
            bap.g(uqrVar, (wzs) x4, M, (i5 >> 3) & 14);
            boolean J2 = M.J(sg50Var) | M.y(xqrVar);
            Object x5 = M.x();
            if (J2 || x5 == c0012a) {
                x5 = new tqr(sg50Var, xqrVar, null);
                M.R(x5);
            }
            bap.g(sg50Var, (wzs) x5, M, 0);
            kq2<pco, sq2> kq2Var = xqrVar.e.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i9 = i8 >> 6;
            aVar2 = M;
            xjn0.c(gzsVar, q630Var2, false, r5j0Var, j, j2, f3, ((pco) ((zak0) kq2Var.c).getValue()).b, sg50Var, kai.c(-1779603465, new krr(j2, nmo0Var, f, jaiVar2), M), aVar2, (i8 & 14) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 260);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hrr
                {
                    float f4 = chq.a;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    float f4 = chq.a;
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    lrr.c(gzsVar, nmo0Var, f, q630Var, r5j0Var, j, j2, uqrVar, jaiVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}
