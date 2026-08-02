package xsna;

import java.util.List;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class k2o implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k2o(int i, List list, izs izsVar, izs izsVar2, sum0.c cVar, sum0 sum0Var) {
        this.e = sum0Var;
        this.f = cVar;
        this.c = izsVar;
        this.g = list;
        this.h = izsVar2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((l2o) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.h, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((com.vk.catalog.mvi.block.video.impl.movies.detail.info.a) this.e).d((a8a) this.f, (ee30) this.g, this.c, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                sum0 sum0Var = (sum0) this.e;
                sum0.c cVar = (sum0.c) this.f;
                List list = (List) this.g;
                izs izsVar = (izs) this.h;
                ((Integer) obj2).intValue();
                sum0Var.j(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, list, this.c, izsVar, cVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k2o(com.vk.catalog.mvi.block.video.impl.movies.detail.info.a aVar, a8a a8aVar, ee30 ee30Var, izs izsVar, q630 q630Var, int i) {
        this.e = aVar;
        this.f = a8aVar;
        this.g = ee30Var;
        this.c = izsVar;
        this.h = q630Var;
        this.d = i;
    }

    public /* synthetic */ k2o(l2o l2oVar, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = l2oVar;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.c = izsVar;
        this.d = i;
    }
}
