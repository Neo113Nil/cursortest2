package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LockableImageContent.kt */
/* loaded from: classes16.dex */
public final class wzz implements efj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public wzz(lg90 lg90Var, boolean z, wkj wkjVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(wkjVar);
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1074311950);
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
                androidx.compose.runtime.b.f(1074311950, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.LockableImageContent.invoke (LockableImageContent.kt:38)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
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
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            q630.a aVar4 = q630.a.a;
            aVar2 = M;
            vjw.a(lg90Var, null, txj0.d(aVar4, 1.0f), null, (wkj) ((zak0) this.c).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 440, 104);
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                aVar2.K(-1315232153);
                vqv.a(pg90.a(R.drawable.vk_icon_lock_shadow_24, 0, aVar2), null, s200.D(ra8.a.b(aVar4, dt1.a.b), 2), l5g.d, aVar2, 3128, 0);
                aVar2 = aVar2;
            } else {
                aVar2.K(-1317110226);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vzz
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    wzz.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
