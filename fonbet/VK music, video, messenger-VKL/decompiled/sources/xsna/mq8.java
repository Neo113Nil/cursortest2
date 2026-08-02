package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class mq8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gzs gzsVar, final q630 q630Var, final bcl bclVar, final r5j0 r5j0Var, final ybl yblVar, final s890 s890Var, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        kq2 a;
        androidx.compose.runtime.a M = aVar.M(-1084573925);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.l(true) ? 256 : 128) | (M.J(null) ? 2048 : 1024) | (M.J(bclVar) ? 16384 : 8192) | (M.J(r5j0Var) ? 131072 : 65536) | (M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(yblVar) ? 8388608 : 4194304) | (M.J(s890Var) ? 67108864 : 33554432);
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1084573925, i2, -1, "androidx.compose.material.Button (Button.kt:105)");
            }
            M.K(497721888);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.j();
            int i3 = i2 >> 6;
            int i4 = (i3 & 14) | ((i2 >> 18) & 112);
            yblVar.getClass();
            M.K(-2133647540);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2133647540, i4, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
            }
            wh50 f = bo.f(0, yblVar.b, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ur0(2);
                M.R(x2);
            }
            q630 b = egi0.b(q630Var, false, (izs) x2);
            M.K(-655254499);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-655254499, i4, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
            }
            wh50 f2 = bo.f(0, yblVar.a, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            long j = ((l5g) f2.getValue()).a;
            long c = l5g.c(14, ((l5g) f.getValue()).a, 1.0f);
            if (bclVar == null) {
                M.K(498128545);
                M.j();
                a = null;
            } else {
                M.K(1401541984);
                a = bclVar.a(true, sg50Var, M, i3 & 910);
                M.j();
            }
            jaiVar2 = jaiVar;
            aVar2 = M;
            yjn0.b(gzsVar, b, r5j0Var, j, c, a != null ? ((pco) a.getValue()).b : 0, sg50Var, kai.c(-20345758, new k77(f, s890Var, jaiVar2, 1), M), aVar2, (i3 & 7168) | (i2 & 14) | 805306368 | (i2 & 896) | (3670016 & i2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            s.d = new wzs(q630Var, bclVar, r5j0Var, yblVar, s890Var, jaiVar3, i) { // from class: xsna.hq8
                public final /* synthetic */ q630 c;
                public final /* synthetic */ bcl d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ ybl f;
                public final /* synthetic */ s890 g;
                public final /* synthetic */ jai h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(805306369);
                    mq8.a(gzs.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
