package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: MovieButtonsCatalogView.kt */
/* loaded from: classes.dex */
public final class zc30 extends m2a<fd30, wc30, u5s0> {
    public final w5s0 b;

    public zc30(w5s0 w5s0Var) {
        super(fpf0.a(u5s0.class));
        this.b = w5s0Var;
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final fd30 fd30Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(969073979);
        if ((i & 48) == 0) {
            i2 = (M.J(fd30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(969073979, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.MovieButtonsCatalogView.ButtonsView.ContentImpl (MovieButtonsCatalogView.kt:81)");
            }
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qhf(izsVar, 4);
                M.R(x);
            }
            this.b.a(ksrVar, (izs) x, M, (i2 >> 9) & 14);
            cd30.a(fd30Var, izsVar, s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.x, 7), M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.yc30
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zc30.this.b(a8aVar, fd30Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
