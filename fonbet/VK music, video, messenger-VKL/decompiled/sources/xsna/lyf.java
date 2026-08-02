package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CoauthorAvatar.kt */
/* loaded from: classes17.dex */
public final class lyf {
    public final wh50 a;
    public final wh50 b;

    public lyf() {
        throw null;
    }

    public lyf(ArrayList arrayList, float f) {
        this.a = androidx.compose.runtime.k.b(arrayList);
        this.b = cq.f(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        pco pcoVar;
        azl azlVar;
        dgw dgwVar;
        androidx.compose.runtime.a M = aVar.M(-1694013287);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1694013287, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.coauthors.CoauthorAvatar.Content (CoauthorAvatar.kt:40)");
            }
            final List list = (List) ((zak0) this.a).getValue();
            wh50 wh50Var = this.b;
            final float f = ((pco) ((zak0) wh50Var).getValue()).b;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new mo1(17);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y6g y6gVar = new y6g(ylu0Var.getBackground().g);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(156966333, 0, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.coauthors.rememberCoauthorsAvatarPainter (CoauthorAvatar.kt:73)");
            }
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(y6gVar);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            new y6g(ylu0Var2.getBackground().g);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(575738534, 0, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.coauthors.rememberCoauthorsAvatarBitmap (CoauthorAvatar.kt:88)");
            }
            nyf nyfVar = new nyf();
            boolean J = M.J(nyfVar);
            Object x3 = M.x();
            if (J || x3 == obj) {
                x3 = new s4(nyfVar, 29);
                M.R(x3);
            }
            final Lazy a = msy.a(LazyThreadSafetyMode.NONE, (gzs) x3);
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new dgw();
                M.R(x4);
            }
            final dgw dgwVar2 = (dgw) x4;
            final wh50 c = androidx.compose.runtime.k.c(izsVar, M, 0);
            final azl azlVar2 = (azl) M.r(uvi.h);
            pco pcoVar2 = new pco(f);
            boolean y = M.y(a) | M.y(list) | M.J(azlVar2) | M.n(f) | M.J(c);
            Object x5 = M.x();
            if (y || x5 == obj) {
                izs izsVar2 = new izs() { // from class: xsna.myf
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return new oyf(((ClipsCoauthorsComponent) a.getValue()).Fc().a(Integer.valueOf(azlVar2.r0(f)), list).a0(asu0.a.d()).subscribe(new qs2(new com.vk.movika.sdk.base.observable.k(dgwVar2, 24), 9), new defpackage.d(new me2(2, c), 15)));
                    }
                };
                pcoVar = pcoVar2;
                azlVar = azlVar2;
                dgwVar = dgwVar2;
                M.R(izsVar2);
                x5 = izsVar2;
            } else {
                pcoVar = pcoVar2;
                azlVar = azlVar2;
                dgwVar = dgwVar2;
            }
            bap.a(list, pcoVar, azlVar, (izs) x5, M, 0);
            agw agwVar = (agw) ((zak0) dgwVar.b).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (agwVar != null) {
                wh50Var2.setValue(new rc7(agwVar));
            }
            lg90 lg90Var = (lg90) wh50Var2.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            vjw.a(lg90Var, null, txj0.q(q630.a.a, ((pco) ((zak0) wh50Var).getValue()).b), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kyf
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    lyf.this.a(q630Var, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
