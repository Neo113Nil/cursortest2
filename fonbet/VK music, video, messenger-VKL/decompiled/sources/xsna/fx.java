package xsna;

import com.vk.newsfeed.api.data.NewsComment;
import java.util.List;
import java.util.Set;
import xsna.hff;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fx(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((kx) this.c).m((oy) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                hna hnaVar = (hna) this.c;
                spg0 spg0Var = (spg0) this.d;
                q630 q630Var = (q630) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1680319113, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CellLeftIconWithTooltip.Content.<anonymous> (CtaCell.kt:221)");
                    }
                    hnaVar.b.a(spg0Var, q630Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                nk50 nk50Var = (nk50) this.c;
                hff hffVar = (hff) this.d;
                Set set = (Set) this.e;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                lff lffVar = hffVar.a.a;
                hff.a aVar2 = hffVar.c;
                f64 a = ruiVar.a(new lgf(nk50Var, nn50Var, lffVar, aVar2.d, aVar2.a, aVar2.c, aVar2.f, aVar2.h, aVar2.i, aVar2.l));
                f64 a2 = ruiVar.a(new ogf(nk50Var, nn50Var, aVar2.c, aVar2.f, aVar2.a, aVar2.i));
                hff.c cVar = hffVar.b;
                ruiVar.b = new nz7(a2, a, ruiVar.a(new wcf(nk50Var, nn50Var, cVar.a, cVar.b, cVar.c, aVar2.d, aVar2.e, aVar2.h, cVar.d, cVar.e, cVar.f, aVar2.k, aVar2.c, aVar2.n, aVar2.m, set)), ruiVar.a(new ewe(nk50Var, nn50Var, aVar2.b, aVar2.e)), ruiVar.a(new kud(nk50Var, nn50Var, aVar2.c)), 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ub70.b((izs) this.e, (izs) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q6p0.a((String) this.c, (gzs) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((lrq0) this.c).e((List) this.d, (qvm0) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                ((acs0) this.c).b.f8(((e520) obj2).a, (NewsComment) this.d, (aa) this.e);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fx(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ fx(izs izsVar, izs izsVar2, izs izsVar3, int i) {
        this.b = 3;
        this.e = izsVar;
        this.c = izsVar2;
        this.d = izsVar3;
    }
}
