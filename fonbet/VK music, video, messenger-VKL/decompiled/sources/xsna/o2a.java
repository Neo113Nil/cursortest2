package xsna;

import com.vungle.ads.internal.protos.Sdk;
import xsna.r2a;

/* compiled from: CatalogBlockView.kt */
/* loaded from: classes.dex */
public abstract class o2a<Vs extends r2a> extends m2a<Vs, q1a, smk> {
    public o2a() {
        super(smk.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m2a
    public final void b(final a8a a8aVar, final r2a r2aVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1931659780);
        if ((i & 6) == 0) {
            i2 = (M.J(a8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(r2aVar) : M.y(r2aVar) ? 32 : 16;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1931659780, i2, -1, "com.vk.catalog.mvi.block.CatalogBlockViewImplS.ContentImpl (CatalogBlockView.kt:115)");
            }
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            int i4 = i2 >> 6;
            c(a8aVar, r2aVar, q630Var, M, i3 | (i4 & 896) | (i4 & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.n2a
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    o2a.this.b(a8aVar, r2aVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }

    public abstract void c(a8a a8aVar, Vs vs, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
