package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: TypographyCompareContent.kt */
/* loaded from: classes18.dex */
public final class avp0 implements yah0 {

    /* compiled from: TypographyCompareContent.kt */
    public static final class a {
        public final int a;
        public final frv0 b;

        public a(int i, frv0 frv0Var) {
            this.a = i;
            this.b = frv0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "StylePair(xml=" + this.a + ", compose=" + this.b + ')';
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        avp0 avp0Var;
        ?? r6;
        androidx.compose.runtime.a M = aVar.M(-1570308292);
        int i2 = (i & 6) == 0 ? (M.y(gzsVar) ? 4 : 2) | i : i;
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1570308292, i2, -1, "com.vk.design.demo.presentation.screens.typography.TypographyCompareContent.Content (TypographyCompareContent.kt:42)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i4 = i2;
            List l = e43.l(new a(R.style.VkUiTypography_Lego_Title1, wlb0.l(M).u), new a(R.style.VkUiTypography_Lego_Title2, wlb0.l(M).z), new a(R.style.VkUiTypography_Lego_Title3, wlb0.l(M).E), new a(R.style.VkUiTypography_Lego_Label1, wlb0.l(M).W0), new a(R.style.VkUiTypography_Lego_Label2, wlb0.l(M).b1), new a(R.style.VkUiTypography_Lego_Body, wlb0.l(M).g1), new a(R.style.VkUiTypography_Lego_Headline, wlb0.l(M).l1), new a(R.style.VkUiTypography_Lego_TextBold, wlb0.l(M).V), new a(R.style.VkUiTypography_Lego_Text, wlb0.l(M).T), new a(R.style.VkUiTypography_Lego_Paragraph, wlb0.l(M).Y), new a(R.style.VkUiTypography_Lego_Footnote, wlb0.l(M).i0), new a(R.style.VkUiTypography_Lego_FootnoteBold, wlb0.l(M).k0));
            if (androidx.compose.runtime.b.d()) {
                r6 = 0;
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            } else {
                r6 = 0;
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, r6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.e("Typography Compare: XML vs Compose", null, null, b, null, gzsVar, false, null, false, null, M, 4102 | ((i4 << 15) & 458752), 0, 2006);
            M = M;
            q630 D2 = p490.D(txj0.d(aVar2, 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, r6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(-536326562);
            int size = l.size();
            for (int i5 = r6; i5 < size; i5++) {
                a aVar5 = (a) l.get(i5);
                q630 B = txj0.B(aVar2, null, 3);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, r6);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c3 = qri.c(M, B);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D4, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                boolean J = M.J(aVar5) | ((i4 & 458752) == 131072 ? true : r6);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new vlc0(aVar5, this);
                    M.R(x);
                }
                ae2.a(48, 4, M, (izs) x, null, aVar2);
                androidx.compose.runtime.a aVar7 = M;
                yqv0.c("Съешь ещё этих мягких французских булок, да выпей чаю", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, aVar5.b, aVar7, 0, 0, 8190);
                M = aVar7;
                M.G();
            }
            avp0Var = this;
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            avp0Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wk1(avp0Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
