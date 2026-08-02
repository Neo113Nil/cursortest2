package xsna;

import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.sf90;
import xsna.taw0;
import xsna.waw0;

/* compiled from: VmojiRecommendationsReducer.kt */
/* loaded from: classes7.dex */
public final class vaw0 extends dm50<abw0, taw0, waw0> {
    public final saw0 d;

    public vaw0(waw0.a aVar) {
        super(aVar);
        this.d = new saw0();
    }

    @Override // xsna.dm50
    public final waw0 c(waw0 waw0Var, taw0 taw0Var) {
        waw0 waw0Var2 = waw0Var;
        taw0 taw0Var2 = taw0Var;
        if (taw0Var2 instanceof taw0.a) {
            taw0.a aVar = (taw0.a) taw0Var2;
            return new waw0.a(aVar.b, aVar.c, aVar.d, waw0.a.AbstractC3923a.C3924a.a, new sf90.b(aVar.e));
        }
        if (taw0Var2 instanceof taw0.c) {
            taw0.c cVar = (taw0.c) taw0Var2;
            if (waw0Var2 instanceof waw0.a) {
                if (cVar instanceof taw0.c.C3736c) {
                    return waw0.a.a((waw0.a) waw0Var2, null, waw0.a.AbstractC3923a.b.a, null, 23);
                }
                if (cVar instanceof taw0.c.b) {
                    throw null;
                }
                if (cVar instanceof taw0.c.a) {
                    return waw0.a.a((waw0.a) waw0Var2, null, waw0.a.AbstractC3923a.C3924a.a, null, 23);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(taw0Var2 instanceof taw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            taw0.b bVar = (taw0.b) taw0Var2;
            if (waw0Var2 instanceof waw0.a) {
                if (bVar instanceof taw0.b.c) {
                    waw0.a aVar2 = (waw0.a) waw0Var2;
                    return waw0.a.a(aVar2, null, null, new sf90.c(aVar2.f.a), 15);
                }
                if (bVar instanceof taw0.b.C3735b) {
                    waw0.a aVar3 = (waw0.a) waw0Var2;
                    List<VmojiStickerPackPreviewModel> list = aVar3.d;
                    RecommendationsBlockModel recommendationsBlockModel = ((taw0.b.C3735b) bVar).b;
                    return waw0.a.a(aVar3, j5g.u0(recommendationsBlockModel.f, list), null, new sf90.b(recommendationsBlockModel.e), 11);
                }
                if (!(bVar instanceof taw0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                waw0.a aVar4 = (waw0.a) waw0Var2;
                return waw0.a.a(aVar4, null, null, new sf90.a(((taw0.b.a) bVar).b, aVar4.f.a), 15);
            }
        }
        return waw0Var2;
    }

    @Override // xsna.dm50
    public final abw0 d() {
        return new abw0(e(new ixu0(this, 2)));
    }

    @Override // xsna.dm50
    public final void h(waw0 waw0Var, abw0 abw0Var) {
        waw0 waw0Var2 = waw0Var;
        abw0 abw0Var2 = abw0Var;
        if (!(waw0Var2 instanceof waw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(abw0Var2.a, waw0Var2);
    }
}
