package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.q1a;
import xsna.r2a;

/* compiled from: CatalogBlockView.kt */
/* loaded from: classes.dex */
public abstract class q2a<Vs extends r2a, Action extends q1a> extends m2a<Vs, Action, smk> {
    public q2a() {
        super(fpf0.a(smk.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m2a
    public final void b(final a8a a8aVar, final r2a r2aVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(426989089);
        if ((i & 6) == 0) {
            i2 = (M.J(a8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(r2aVar) : M.y(r2aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(426989089, i2, -1, "com.vk.catalog.mvi.block.CatalogBlockViewImplSA.ContentImpl (CatalogBlockView.kt:90)");
            }
            int i3 = i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
            int i4 = i2 >> 3;
            c(a8aVar, r2aVar, izsVar, q630Var2, M, i3 | (i4 & 7168) | (i4 & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.p2a
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    q2a.this.b(a8aVar, r2aVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }

    public abstract void c(a8a a8aVar, Vs vs, izs<? super Action, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
