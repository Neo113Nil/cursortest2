package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: IconImpl.kt */
/* loaded from: classes17.dex */
public final class nqv implements mkk0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public nqv() {
        throw null;
    }

    public nqv(lg90 lg90Var, pco pcoVar, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(pcoVar);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(gzsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [xsna.q630] */
    @Override // xsna.mkk0
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        ?? q;
        androidx.compose.runtime.a M = aVar.M(61615432);
        int i2 = (M.p(j) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(61615432, i2, -1, "com.vk.core.compose.component.spinner.IconImpl.Content (IconImpl.kt:27)");
            }
            wh50 wh50Var = this.d;
            boolean z = ((gzs) ((zak0) wh50Var).getValue()) != null;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(1634465048);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new d1(17);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-917106987);
            }
            M.j();
            gzs gzsVar2 = gzsVar;
            pco pcoVar = (pco) ((zak0) this.b).getValue();
            q630.a aVar2 = q630.a.a;
            if (pcoVar != null && (q = txj0.q(aVar2, pcoVar.b)) != 0) {
                aVar2 = q;
            }
            nzu0.e(gzsVar2, aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, z, null, null, kai.c(1249619005, new wzs() { // from class: xsna.iqv
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v15, types: [xsna.q630] */
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ?? q2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1249619005, intValue, -1, "com.vk.core.compose.component.spinner.IconImpl.Content.<anonymous> (IconImpl.kt:33)");
                        }
                        nqv nqvVar = nqv.this;
                        pco pcoVar2 = (pco) ((zak0) nqvVar.b).getValue();
                        q630.a aVar4 = q630.a.a;
                        vqv.a((lg90) ((zak0) nqvVar.a).getValue(), (String) ((zak0) nqvVar.c).getValue(), (pcoVar2 == null || (q2 = txj0.q(aVar4, pcoVar2.b)) == 0) ? aVar4 : q2, j, aVar3, 8, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.jqv
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    nqv.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
