package xsna;

import com.vk.dto.music.Artist;
import com.vk.lists.c;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MusicRecommendationOnboardingAdapter.kt */
/* loaded from: classes3.dex */
public final class s250 extends d920 implements c.i {
    public final u250 i;

    public s250(com.vk.music.onboarding.impl.b bVar, RecommendationOnBoardingModel recommendationOnBoardingModel) {
        u250 u250Var = new u250(bVar, recommendationOnBoardingModel);
        this.i = u250Var;
        x0(u250Var);
    }

    public final void C0(List<Artist> list, boolean z) {
        u250 u250Var = this.i;
        if (z) {
            u250Var.clear();
        }
        List<Artist> y0 = u250Var.y0();
        ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            arrayList.add(((Artist) it.next()).b);
        }
        Set S0 = j5g.S0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!S0.contains(((Artist) obj).b)) {
                arrayList2.add(obj);
            }
        }
        u250Var.n0(arrayList2);
    }

    public final void D0(List<Artist> list, Artist artist) {
        List<Artist> list2 = list;
        boolean isEmpty = list2.isEmpty();
        u250 u250Var = this.i;
        if (!isEmpty) {
            ArrayList a = i7o0.a(u250Var.y0());
            ArrayList arrayList = new ArrayList(a);
            arrayList.addAll(a.indexOf(artist) + 1, list2);
            u250Var.setItems(arrayList);
        }
        u250Var.F0(artist, artist);
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return ((ArrayList) this.i.y0()).isEmpty();
    }
}
