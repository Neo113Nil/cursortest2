package xsna;

import android.content.Context;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;

/* compiled from: EducationFilterBottomSheetContent.kt */
/* loaded from: classes5.dex */
public final class r7p extends kk50<com.vk.search.params.impl.presentation.modal.education.mvi.model.d, com.vk.search.params.impl.presentation.modal.education.mvi.model.a> {
    public final xqi<d.b> e;

    public r7p(c8p c8pVar, Context context, xqi xqiVar) {
        super(context, c8pVar);
        this.e = xqiVar;
    }

    @Override // xsna.jj50
    public final /* bridge */ /* synthetic */ void b(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        g((com.vk.search.params.impl.presentation.modal.education.mvi.model.d) ao50Var, izsVar, aVar, 0);
    }

    public final void g(com.vk.search.params.impl.presentation.modal.education.mvi.model.d dVar, izs<? super com.vk.search.params.impl.presentation.modal.education.mvi.model.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1303748932);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1303748932, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.EducationFilterBottomSheetContent.Content (EducationFilterBottomSheetContent.kt:52)");
            }
            rrv0.d(null, null, null, null, kai.c(-550794071, new mog(5, this, izsVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vb5(i, 1, this, dVar, izsVar);
        }
    }
}
