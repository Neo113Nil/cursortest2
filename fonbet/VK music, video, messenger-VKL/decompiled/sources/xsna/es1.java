package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.q630;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class es1 {
    public static final float a = 280;
    public static final float b = 560;
    public static final float c = 8;
    public static final float d = 12;
    public static final u890 e;
    public static final u890 f;
    public static final pqo g;

    static {
        float f2 = 24;
        e = new u890(f2, f2, f2, f2);
        float f3 = 16;
        s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
        s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
        f = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7);
        g = new pqo(new qo0(1));
    }

    public static final void a(final jai jaiVar, q630 q630Var, final wzs wzsVar, final r5j0 r5j0Var, final long j, final float f2, final long j2, final long j3, final long j4, final long j5, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1378716401);
        int i3 = i | 48 | (M.y(null) ? 256 : 128) | (M.y(null) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.J(r5j0Var) ? 131072 : 65536) | (M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.n(f2) ? 8388608 : 4194304) | (M.p(j2) ? 67108864 : 33554432) | (M.p(j3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (M.p(j4) ? 4 : 2) | (M.p(j5) ? 32 : 16);
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                i2 = i3;
                androidx.compose.runtime.b.f(1378716401, i2, i4, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
            } else {
                i2 = i3;
            }
            jai c2 = kai.c(-652798794, new yr1(wzsVar, j3, j4, j5, j2, jaiVar), M);
            int i5 = i2 >> 12;
            int i6 = (i5 & 896) | (i5 & 112) | 12582918 | ((i2 >> 9) & 57344);
            q630.a aVar2 = q630.a.a;
            xjn0.a(aVar2, r5j0Var, j, 0L, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c2, M, i6, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, wzsVar, r5j0Var, j, f2, j2, j3, j4, j5, i) { // from class: xsna.wr1
                public final /* synthetic */ q630 c;
                public final /* synthetic */ wzs d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    es1.a(jai.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f2, final float f3, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-917637668);
        if (M.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-917637668, i, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:379)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new as1(f2, f3);
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            if (er.f(6, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f2, f3, jaiVar, i) { // from class: xsna.ur1
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ jai d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(439);
                    es1.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final gzs gzsVar, final jai jaiVar, final q630 q630Var, final wzs wzsVar, final wzs wzsVar2, final r5j0 r5j0Var, final long j, final long j2, final long j3, final long j4, final float f2, final xim ximVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        jai jaiVar2;
        wzs wzsVar3;
        r5j0 r5j0Var2;
        int i4;
        float f3;
        androidx.compose.runtime.a M = aVar.M(-867616355);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            jaiVar2 = jaiVar;
            i3 |= M.y(jaiVar2) ? 32 : 16;
        } else {
            jaiVar2 = jaiVar;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            wzsVar3 = wzsVar;
            i3 |= M.y(wzsVar3) ? 2048 : 1024;
        } else {
            wzsVar3 = wzsVar;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.y(wzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            r5j0Var2 = r5j0Var;
            i3 |= M.J(r5j0Var2) ? 8388608 : 4194304;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.p(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.p(j2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.p(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.p(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f3 = f2;
            i4 |= M.n(f3) ? 256 : 128;
        } else {
            f3 = f2;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.J(ximVar) ? 2048 : 1024;
        }
        int i5 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-867616355, i3, i5, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:260)");
            }
            d(gzsVar, q630Var, ximVar, kai.c(527420759, new ds1(wzsVar2, r5j0Var2, j, f3, j2, j3, j4, wzsVar3, jaiVar2), M), M, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vr1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    es1.c(gzs.this, jaiVar, q630Var, wzsVar, wzsVar2, r5j0Var, j, j2, j3, j4, f2, ximVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(gzs gzsVar, q630 q630Var, xim ximVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(24925658);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(ximVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(24925658, i2, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
            }
            ((gt6) M.r(g)).a(new ht6(gzsVar, q630Var, ximVar, jaiVar), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tr1(gzsVar, q630Var, ximVar, jaiVar, i);
        }
    }
}
