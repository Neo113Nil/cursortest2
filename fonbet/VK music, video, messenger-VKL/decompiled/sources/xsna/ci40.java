package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.bi40;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicDownloadStateIcon.kt */
/* loaded from: classes3.dex */
public final class ci40 implements com.vk.core.compose.component.cell.content.o {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    /* compiled from: MusicDownloadStateIcon.kt */
    public static final class a {
        public static ci40 a(bi40 bi40Var, lg90 lg90Var, izs izsVar, lg90 lg90Var2, gzs gzsVar, boolean z, androidx.compose.runtime.a aVar) {
            bi40 bi40Var2;
            lg90 lg90Var3;
            izs izsVar2;
            lg90 lg90Var4;
            gzs gzsVar2;
            boolean z2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-327853904, 12587456, -1, "com.vk.music.design.compose.download.MusicDownloadStateIcon.Companion.invoke (MusicDownloadStateIcon.kt:93)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                bi40Var2 = bi40Var;
                lg90Var3 = lg90Var;
                izsVar2 = izsVar;
                lg90Var4 = lg90Var2;
                gzsVar2 = gzsVar;
                z2 = z;
                ci40 ci40Var = new ci40(bi40Var2, lg90Var3, izsVar2, lg90Var4, gzsVar2, z2);
                aVar.R(ci40Var);
                x = ci40Var;
            } else {
                bi40Var2 = bi40Var;
                lg90Var3 = lg90Var;
                izsVar2 = izsVar;
                lg90Var4 = lg90Var2;
                gzsVar2 = gzsVar;
                z2 = z;
            }
            ci40 ci40Var2 = (ci40) x;
            ((zak0) ci40Var2.a).setValue(bi40Var2);
            ((zak0) ci40Var2.b).setValue(lg90Var3);
            ((zak0) ci40Var2.c).setValue(izsVar2);
            ((zak0) ci40Var2.d).setValue(lg90Var4);
            ((zak0) ci40Var2.e).setValue(gzsVar2);
            ((zak0) ci40Var2.f).setValue(null);
            ((zak0) ci40Var2.g).setValue(Boolean.valueOf(z2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ci40Var2;
        }
    }

    /* compiled from: MusicDownloadStateIcon.kt */
    public static final class b implements yzs<bi40, androidx.compose.runtime.a, Integer, l5g> {
        public b() {
        }

        @Override // xsna.yzs
        public final l5g invoke(bi40 bi40Var, androidx.compose.runtime.a aVar, Integer num) {
            long j;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(-380758096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-380758096, intValue, -1, "com.vk.music.design.compose.download.MusicDownloadStateIcon.Content.<anonymous> (MusicDownloadStateIcon.kt:51)");
            }
            bi40 bi40Var2 = (bi40) ((zak0) ci40.this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1130010706, 0, -1, "com.vk.music.design.compose.download.MusicDownloadStateIcon.downloadIconTint (MusicDownloadStateIcon.kt:73)");
            }
            if (epx.f(bi40Var2, bi40.c.a) || epx.f(bi40Var2, bi40.d.a)) {
                aVar2.K(686445275);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().l;
                aVar2.j();
            } else {
                if (!epx.f(bi40Var2, bi40.a.a) && !(bi40Var2 instanceof bi40.b)) {
                    throw alb0.c(686441133, aVar2);
                }
                aVar2.K(686449369);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.b().b;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j, aVar2);
        }
    }

    public ci40() {
        throw null;
    }

    public ci40(bi40 bi40Var, lg90 lg90Var, izs izsVar, lg90 lg90Var2, gzs gzsVar, boolean z) {
        this.a = androidx.compose.runtime.k.b(bi40Var);
        this.b = androidx.compose.runtime.k.b(lg90Var);
        this.c = androidx.compose.runtime.k.b(izsVar);
        this.d = androidx.compose.runtime.k.b(lg90Var2);
        this.e = androidx.compose.runtime.k.b(gzsVar);
        this.f = androidx.compose.runtime.k.b(null);
        this.g = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1706724727);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1706724727, i2, -1, "com.vk.music.design.compose.download.MusicDownloadStateIcon.Content (MusicDownloadStateIcon.kt:47)");
            }
            bi40 bi40Var = (bi40) ((zak0) this.a).getValue();
            lg90 lg90Var = (lg90) ((zak0) this.b).getValue();
            izs izsVar = (izs) ((zak0) this.c).getValue();
            lg90 lg90Var2 = (lg90) ((zak0) this.d).getValue();
            M.K(515060256);
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue());
            gzs gzsVar = (gzs) ((zak0) this.e).getValue();
            if (gzsVar != null) {
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = ir.h(M);
                }
                float f = 6;
                q630 g = b2.g(kci.m(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.D(ojc.b(q630.a.a, (sg50) x, null, false, null, gzsVar, 28), f)));
                if (g != null) {
                    b2 = g;
                }
            }
            M.j();
            q630 q = txj0.q(b2, 16);
            dt1.a.getClass();
            ki40.a(bi40Var, lg90Var, new b(), izsVar, spg0Var.a(q, dt1.a.l), lg90Var2, ((Boolean) ((zak0) this.g).getValue()).booleanValue(), M, 262208, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c6v(this, spg0Var, q630Var, i, 1);
        }
    }
}
