package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.bi40;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SearchHistoryCellRight.kt */
/* loaded from: classes3.dex */
public final class quh0 implements com.vk.core.compose.component.cell.content.o {
    public final /* synthetic */ wh50<zuh0> a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gzs<s3q0> c;
    public final /* synthetic */ sg50 d;
    public final /* synthetic */ guw e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public quh0(wh50<zuh0> wh50Var, long j, gzs<s3q0> gzsVar, sg50 sg50Var, guw guwVar, String str, long j2) {
        this.a = wh50Var;
        this.b = j;
        this.c = gzsVar;
        this.d = sg50Var;
        this.e = guwVar;
        this.f = str;
        this.g = j2;
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1466493799);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1466493799, i, -1, "com.vk.music.ui.search.history.moreIconCell.<no name provided>.Content (SearchHistoryCellRight.kt:139)");
        }
        bi40 bi40Var = this.a.getValue().b;
        dt1.a.getClass();
        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(14), dt1.a.l, aVar, 54);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, q630Var);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        if (bi40Var == null || bi40Var.equals(bi40.c.a)) {
            bi40Var = null;
        }
        if (bi40Var == null) {
            aVar.K(817732907);
        } else {
            aVar.K(817732908);
            hco.a(bi40Var, aVar, 0);
        }
        aVar.j();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar == null) {
            aVar.K(817913483);
            Object x = aVar.x();
            if (x == c0012a) {
                x = new i13(26);
                aVar.R(x);
            }
            gzsVar = (gzs) x;
        } else {
            aVar.K(1273309954);
        }
        aVar.j();
        gzs<s3q0> gzsVar2 = gzsVar;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new n9w(24);
            aVar.R(x2);
        }
        q630 b = egi0.b(q630.a.a, true, (izs) x2);
        final String str = this.f;
        final long j = this.g;
        com.vk.music.ui.search.history.b.a(this.b, true, gzsVar2, this.d, this.e, b, kai.c(-928184249, new wzs() { // from class: xsna.puh0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-928184249, intValue, -1, "com.vk.music.ui.search.history.moreIconCell.<no name provided>.Content.<anonymous>.<anonymous> (SearchHistoryCellRight.kt:162)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a2, str, null, j, aVar3, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            }
        }, aVar), aVar, 1575984);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
