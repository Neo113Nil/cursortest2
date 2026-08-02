package xsna;

import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.czg;

/* compiled from: CommunityCreateReviewReducer.kt */
/* loaded from: classes18.dex */
public final class ezg extends dm50<hzg, czg, fzg> {
    public final sni d;

    public ezg(fzg fzgVar, sni sniVar) {
        super(fzgVar);
        this.d = sniVar;
    }

    @Override // xsna.dm50
    public final fzg c(fzg fzgVar, czg czgVar) {
        List<dak> list;
        fzg fzgVar2 = fzgVar;
        czg czgVar2 = czgVar;
        n7k n7kVar = fzgVar2.e;
        w9k w9kVar = fzgVar2.g;
        boolean z = czgVar2 instanceof czg.b;
        sni sniVar = this.d;
        if (z) {
            n7k n7kVar2 = ((czg.b) czgVar2).b;
            List<dak> list2 = n7kVar2.a;
            sniVar.getClass();
            sni.g(list2);
            return fzg.a(fzgVar2, n7kVar2, null, sni.r(w9kVar, list2, fzgVar2.f), Integer.valueOf(sni.g(list2)), 0, null, false, null, null, null, false, 1048471);
        }
        if (czgVar2 instanceof czg.a) {
            String str = ((czg.a) czgVar2).b;
            list = n7kVar != null ? n7kVar.a : null;
            sniVar.getClass();
            return fzg.a(fzgVar2, null, str, sni.r(w9kVar, list, str), null, 0, null, false, null, null, null, false, 1048527);
        }
        if (czgVar2 instanceof czg.f) {
            return fzg.a(fzgVar2, null, null, null, null, 0, null, true, null, null, null, false, 1046527);
        }
        if (czgVar2 instanceof czg.h) {
            return fzg.a(fzgVar2, null, null, null, null, 0, null, false, null, null, null, false, 1042431);
        }
        if (czgVar2 instanceof czg.g) {
            return fzg.a(fzgVar2, null, null, null, null, (int) ((czg.g) czgVar2).b, null, false, null, null, null, false, 1048447);
        }
        if (czgVar2 instanceof czg.c) {
            czg.c cVar = (czg.c) czgVar2;
            int i = cVar.b;
            String str2 = cVar.c;
            List<UploadImageModel> list3 = cVar.d;
            CreateCommunityReviewData createCommunityReviewData = cVar.e;
            list = n7kVar != null ? n7kVar.a : null;
            sniVar.getClass();
            return fzg.a(fzgVar2, null, str2, sni.r(w9kVar, list, str2), null, i, list3, false, createCommunityReviewData, null, null, false, 802383);
        }
        if (czgVar2 instanceof czg.d) {
            czg.d dVar = (czg.d) czgVar2;
            return fzg.a(fzgVar2, null, null, null, null, 0, null, false, null, dVar.b, dVar.c, false, 819199);
        }
        if (czgVar2 instanceof czg.e) {
            return fzg.a(fzgVar2, null, null, null, null, 0, null, false, null, null, null, true, 917503);
        }
        if (czgVar2 instanceof czg.i.a) {
            return fzg.a(fzgVar2, null, null, null, null, 0, ((czg.i.a) czgVar2).b, false, null, null, null, false, 1048319);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final hzg d() {
        return new hzg(e(new wpg(this, 1)), e(new qb(19)), e(new wh1(10)));
    }

    @Override // xsna.dm50
    public final void h(fzg fzgVar, hzg hzgVar) {
        fzg fzgVar2 = fzgVar;
        hzg hzgVar2 = hzgVar;
        if (fzgVar2.s) {
            f(hzgVar2.b, fzgVar2);
        } else if (fzgVar2.q == null && fzgVar2.r == null) {
            f(hzgVar2.a, fzgVar2);
        } else {
            f(hzgVar2.c, fzgVar2);
        }
    }
}
