package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: ImageContent.kt */
/* loaded from: classes17.dex */
public final class phw implements efj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    /* compiled from: ImageContent.kt */
    public static final class a {
        public static phw a(lg90 lg90Var, rek0 rek0Var, wkj wkjVar, d6g d6gVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            lg90 lg90Var2;
            rek0 rek0Var2 = (i2 & 2) != 0 ? null : rek0Var;
            if ((i2 & 4) != 0) {
                wkjVar = wkj.a.b;
            }
            wkj wkjVar2 = wkjVar;
            d6g d6gVar2 = (i2 & 8) != 0 ? null : d6gVar;
            com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(596719710, i, -1, "com.vk.core.compose.component.image.content.ImageContent.Companion.invoke (ImageContent.kt:67)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                lg90Var2 = lg90Var;
                phw phwVar = new phw(lg90Var2, rek0Var2, d6gVar2, aVar3, wkjVar2);
                aVar2.R(phwVar);
                x = phwVar;
            } else {
                lg90Var2 = lg90Var;
            }
            phw phwVar2 = (phw) x;
            ((zak0) phwVar2.a).setValue(lg90Var2);
            ((zak0) phwVar2.c).setValue(rek0Var2);
            ((zak0) phwVar2.e).setValue(wkjVar2);
            ((zak0) phwVar2.b).setValue(d6gVar2);
            ((zak0) phwVar2.d).setValue(aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return phwVar2;
        }
    }

    public phw(lg90 lg90Var, yk8 yk8Var, d6g d6gVar, SemanticsConfiguration semanticsConfiguration, wkj wkjVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(d6gVar);
        this.c = androidx.compose.runtime.k.b(yk8Var);
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.e = androidx.compose.runtime.k.b(wkjVar);
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(-1228532120);
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
                androidx.compose.runtime.b.f(-1228532120, i2, -1, "com.vk.core.compose.component.image.content.ImageContent.invoke (ImageContent.kt:39)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            yk8 yk8Var = (yk8) ((zak0) this.c).getValue();
            q630.a aVar2 = q630.a.a;
            if (yk8Var != null && (g = b.g(hr80.l(aVar2, yk8Var, null, 6))) != null) {
                b = g;
            }
            q630 d = txj0.d(b, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vjw.a((lg90) ((zak0) this.a).getValue(), null, txj0.d(aVar2, 1.0f), null, (wkj) ((zak0) this.e).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d6g) ((zak0) this.b).getValue(), M, 440, 40);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lhw
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    phw.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
