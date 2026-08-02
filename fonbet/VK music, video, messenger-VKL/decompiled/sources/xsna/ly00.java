package xsna;

/* compiled from: MarketFastQuestionBubble.kt */
/* loaded from: classes18.dex */
public final class ly00 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1494992263);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1494992263, i2, -1, "com.vk.ecomm.design.compose.MarketFastQuestionBubble (MarketFastQuestionBubble.kt:23)");
            }
            q630 d = rte0.d(q630Var, vog0.a);
            if (wlb0.h(M).s()) {
                M.K(1496682453);
                j = wlb0.h(M).getBackground().p;
                M.j();
            } else {
                M.K(1496772012);
                j = wlb0.h(M).getBackground().e;
                M.j();
            }
            aVar2 = M;
            yqv0.c(str, s200.E(ojc.c(hr80.m(d, j, androidx.compose.ui.graphics.e.a), false, null, null, gzsVar, 15), kqu0.w, kqu0.s), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).Y, aVar2, i2 & 14, 48, 6136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o54(i, 4, str, gzsVar, q630Var);
        }
    }
}
