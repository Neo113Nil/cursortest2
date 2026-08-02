package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: MarketItemsForReviewComposeContentScreen.kt */
/* loaded from: classes18.dex */
public final class k510 {
    public static final void a(List list, izs izsVar, Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-1287033210);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(obj) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1287033210, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeContentScreen (MarketItemsForReviewComposeContentScreen.kt:24)");
            }
            f5z f5zVar = (f5z) M.r(bvz.a);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = new pp00(list, 2);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            s3q0 s3q0Var = s3q0.a;
            boolean y = ((i2 & 896) == 256) | M.y(f5zVar) | M.y(yvjVar) | M.J(b);
            Object x3 = M.x();
            if (y || x3 == c0012a2) {
                c0012a = c0012a2;
                i510 i510Var = new i510(obj, f5zVar, yvjVar, b, null);
                M.R(i510Var);
                x3 = i510Var;
            } else {
                c0012a = c0012a2;
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            int i4 = i2 & 112;
            boolean J = M.J(b) | (i4 == 32);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new j510(b, izsVar, null);
                M.R(x4);
            }
            bap.g(b, (wzs) x4, M, 0);
            boolean z2 = i4 == 32;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new rq0(izsVar, 1);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            boolean z3 = i4 == 32;
            Object x6 = M.x();
            if (z3 || x6 == c0012a) {
                x6 = new om9(izsVar, 6);
                M.R(x6);
            }
            q630Var2 = q630.a.a;
            v510.a(list, izsVar2, (wzs) x6, b, q630Var2, M, i3 | 24576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p750(list, izsVar, obj, q630Var2, i);
        }
    }
}
