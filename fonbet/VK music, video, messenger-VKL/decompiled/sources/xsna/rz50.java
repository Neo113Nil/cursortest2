package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import java.util.Iterator;
import xsna.wpc0;

/* compiled from: NavigatorSubBackStack.kt */
/* loaded from: classes4.dex */
public final class rz50 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wpc0.a.C3948a c3948a, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1078130949);
        if ((i & 6) == 0) {
            i2 = (M.J(c3948a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1078130949, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.NavigatorSubBackStack (NavigatorSubBackStack.kt:15)");
            }
            Iterator it = ((jv5) jk50.c(c3948a.c, M).getValue()).a.iterator();
            while (it.hasNext()) {
                mlc0 mlc0Var = (mlc0) it.next();
                if (mlc0Var.a instanceof PostingStepScreen.RemovePollAlert) {
                    M.K(996733687);
                    oxf0.a(mlc0Var.a, izsVar, M, (i2 & 112) | 384);
                    M.j();
                } else {
                    M.K(996735913);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(c3948a, izsVar, i, 5);
        }
    }
}
