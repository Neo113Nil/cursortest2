package xsna;

import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import java.util.List;

/* compiled from: TrendingHashtagsList.kt */
/* loaded from: classes16.dex */
public final class ypp0 {
    public static final void a(List list, izs izsVar, q630 q630Var, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-645044531);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(yzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-645044531, i2, -1, "com.vk.clips.design.compose.description.TrendingHashtagsList (TrendingHashtagsList.kt:23)");
            }
            jnv0.a(false, SubnavigationBarAppearance.Neutral, ahn.E(s200.E(txj0.f(q630Var, 1.0f), kqu0.u, kqu0.t), "LIST_TRENDING_HASHTAGS"), false, false, kai.c(1786811322, new ejj(list, yzsVar, izsVar), M), M, 224310, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ohz(list, izsVar, q630Var, yzsVar, i);
        }
    }
}
