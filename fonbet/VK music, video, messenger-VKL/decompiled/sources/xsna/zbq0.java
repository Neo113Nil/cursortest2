package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: UploadListView.kt */
/* loaded from: classes.dex */
public final class zbq0 extends m2a<acq0, fcq0, saq0> {
    public final taq0 b;

    public zbq0(dot0 dot0Var) {
        super(saq0.class);
        this.b = new taq0(dot0Var);
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final acq0 acq0Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 f;
        ArrayList<bdq0> arrayList = acq0Var.c;
        androidx.compose.runtime.a M = aVar.M(887010032);
        int i2 = (i & 48) == 0 ? (M.J(acq0Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (66705 & i2) != 66704)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(887010032, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.UploadListView.UploadListBlockView.ContentImpl (UploadListView.kt:137)");
            }
            if (arrayList.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.l(new wzs() { // from class: xsna.ybq0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            zbq0.this.b(a8aVar, acq0Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    });
                    return;
                }
                return;
            }
            this.b.a(ksrVar, M, (i2 >> 9) & 14);
            f = txj0.f(q630.a.a, 1.0f);
            q630 E = ahn.E(f, "upload_video_item_list_test_tag");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.d(), M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a b = cri.a.b();
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(b);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.d());
            k9q0.w(M, D, cri.a.f());
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
            k9q0.t(M, cri.a.a());
            k9q0.w(M, c, cri.a.e());
            M.K(1882828374);
            for (bdq0 bdq0Var : arrayList) {
                boolean J = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.J(bdq0Var);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new cv3(izsVar, acq0Var, bdq0Var, 5);
                    M.R(x);
                }
                sbq0.d(bdq0Var, (gzs) x, null, M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.l(new nx(this, a8aVar, acq0Var, izsVar, ksrVar, q630Var, i, 1));
        }
    }
}
