package xsna;

import com.vk.music.screens.about.entity.CommunityProfileLinksState;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.iqh;
import xsna.qqh;

/* compiled from: CommunityProfileLinksInlineActor.kt */
/* loaded from: classes3.dex */
public final class tqh extends bl50<CommunityProfileLinksState, iqh, on50, bwj, dwj, qqh> {
    public final sj50<CommunityProfileLinksState, on50, ll50<on50, bwj, dwj>, jl50<CommunityProfileLinksState>, qqh> c;

    public tqh(sj50<CommunityProfileLinksState, on50, ll50<on50, bwj, dwj>, jl50<CommunityProfileLinksState>, qqh> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CommunityProfileLinksState, on50, ll50<on50, bwj, dwj>, jl50<CommunityProfileLinksState>, qqh> W() {
        return this.c;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        iqh iqhVar = (iqh) lj50Var;
        if (!(iqhVar instanceof iqh.b)) {
            if (!(iqhVar instanceof iqh.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c(qqh.a.a);
            return;
        }
        List<LinkItemModel> list = ((CommunityProfileLinksState) this.b.getCurrentState()).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((LinkItemModel) obj).b.equals(((iqh.b) iqhVar).b)) {
                arrayList.add(obj);
            }
        }
        LinkItemModel linkItemModel = (LinkItemModel) j5g.a0(arrayList);
        if (linkItemModel == null) {
            return;
        }
        c(new qqh.b(linkItemModel.c));
    }
}
