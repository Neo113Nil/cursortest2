package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: IconWithOnboardingTooltip.kt */
/* loaded from: classes17.dex */
public final class jrv {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    /* compiled from: IconWithOnboardingTooltip.kt */
    public static final class a {
        public static jrv a(lg90 lg90Var, long j, String str, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar) {
            lg90 lg90Var2;
            long j2;
            String str2;
            gzs gzsVar3;
            gzs gzsVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-730138862, 221192, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.icon.IconWithOnboardingTooltip.Companion.invoke (IconWithOnboardingTooltip.kt:80)");
            }
            boolean J = aVar.J(lg90Var) | aVar.p(j) | aVar.J(str) | aVar.J(gzsVar);
            Object x = aVar.x();
            if (J || x == a.C0011a.a) {
                lg90Var2 = lg90Var;
                j2 = j;
                str2 = str;
                gzsVar3 = gzsVar;
                gzsVar4 = gzsVar2;
                jrv jrvVar = new jrv(lg90Var2, j2, str2, gzsVar3, gzsVar4);
                aVar.R(jrvVar);
                x = jrvVar;
            } else {
                lg90Var2 = lg90Var;
                j2 = j;
                str2 = str;
                gzsVar3 = gzsVar;
                gzsVar4 = gzsVar2;
            }
            jrv jrvVar2 = (jrv) x;
            ((zak0) jrvVar2.a).setValue(lg90Var2);
            ((zak0) jrvVar2.b).setValue(new l5g(j2));
            ((zak0) jrvVar2.c).setValue(str2);
            ((zak0) jrvVar2.d).setValue(gzsVar3);
            ((zak0) jrvVar2.e).setValue(gzsVar4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return jrvVar2;
        }
    }

    public jrv() {
        throw null;
    }

    public jrv(lg90 lg90Var, long j, String str, gzs gzsVar, gzs gzsVar2) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(gzsVar2);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1377378762);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1377378762, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.icon.IconWithOnboardingTooltip.Content (IconWithOnboardingTooltip.kt:32)");
            }
            String str = (String) ((zak0) this.c).getValue();
            if (str == null) {
                M.K(626968640);
                int i3 = i2 << 3;
                b((i3 & 896) | (i3 & 112) | 8, M, q630Var, (lg90) ((zak0) this.a).getValue());
                M.j();
            } else {
                M.K(627039413);
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (z || x == obj) {
                    x = new wik(this, 15);
                    M.R(x);
                }
                buv0 z2 = rdi.z(true, (izs) x, null, M, 6, 4);
                wh50 wh50Var = this.d;
                o9v0.a(str, z2, q630.a.a, null, null, null, null, null, (gzs) ((zak0) wh50Var).getValue(), (gzs) ((zak0) wh50Var).getValue(), null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(1533848037, new cx(10, this, q630Var), M), M, 384, 805502976, 490744);
                M = M;
                Boolean valueOf = Boolean.valueOf(z2.isVisible());
                boolean y = M.y(z2) | (i4 == 32);
                Object x2 = M.x();
                if (y || x2 == obj) {
                    x2 = new krv(z2, this, null);
                    M.R(x2);
                }
                bap.g(valueOf, (wzs) x2, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(this, q630Var, i, 3);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, q630 q630Var, lg90 lg90Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2020973765);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-2020973765, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.icon.IconWithOnboardingTooltip.Icon (IconWithOnboardingTooltip.kt:63)");
            }
            pzu0.b(lg90Var, null, txj0.q(q630Var, 28), ((l5g) ((zak0) this.b).getValue()).a, M, 56 | (i2 & 14), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hg8(i, 1, this, lg90Var, q630Var);
        }
    }
}
