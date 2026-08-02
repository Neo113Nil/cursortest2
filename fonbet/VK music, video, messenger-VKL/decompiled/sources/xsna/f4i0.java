package xsna;

import androidx.compose.runtime.a;

/* compiled from: Seekbar.kt */
/* loaded from: classes7.dex */
public final class f4i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final long j, final long j2, q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-422626200);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.p(j2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-422626200, i2, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.seekbar.Seekbar (Seekbar.kt:18)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            b4i0 b4i0Var = (b4i0) wh50Var.getValue();
            if (b4i0Var != null) {
                b4i0Var.a(j, j2);
            }
            boolean z = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ll1(24, izsVar, wh50Var);
                M.R(x2);
            }
            q630Var2 = q630Var;
            ae2.a((i2 >> 3) & 112, 4, M, (izs) x2, null, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(j, j2, q630Var3, izsVar, i) { // from class: xsna.e4i0
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    f4i0.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
