package xsna;

import androidx.compose.runtime.a;
import java.util.ArrayList;

/* compiled from: ComposePodcastSliderVh.kt */
/* loaded from: classes16.dex */
public final class ojb0 implements efj {
    public final ArrayList a;
    public final boolean b;
    public final gzs<s3q0> c;

    public ojb0(ArrayList arrayList, gzs gzsVar, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = gzsVar;
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(333327466);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(333327466, i2, -1, "com.vk.catalog2.feature.music.holders.podcast.PodcastThumbsContent.invoke (ComposePodcastSliderVh.kt:191)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(d, (sg50) x, null, false, null, this.c, 28);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new d0w(this, 15);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z2 = i3 == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new qw30(this, 17);
                M.R(x3);
            }
            ae2.a(0, 0, M, izsVar, (izs) x3, b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.njb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    ojb0.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
