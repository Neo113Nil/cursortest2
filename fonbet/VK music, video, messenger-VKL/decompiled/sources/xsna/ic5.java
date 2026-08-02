package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ec5;
import xsna.jc5;
import xsna.nc5;

/* compiled from: AuthorSelectionFeature.kt */
/* loaded from: classes4.dex */
public final class ic5 extends wk50<zc5, oc5, ec5, jc5> {
    public final vfc0 f;
    public final f4z g;

    public ic5(vfc0 vfc0Var, ArrayList arrayList, PostingAuthorUiModel postingAuthorUiModel) {
        super(new ec5.b(arrayList, postingAuthorUiModel), new mc5(new oc5(0)));
        this.f = vfc0Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(oc5 oc5Var, ec5 ec5Var) {
        ec5 ec5Var2 = ec5Var;
        if (ec5Var2 instanceof ec5.b) {
            ec5.b bVar = (ec5.b) ec5Var2;
            T(new jc5.a(bVar.b, bVar.c));
        } else {
            if (!(ec5Var2 instanceof ec5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingAuthorUiModel postingAuthorUiModel = ((ec5.a) ec5Var2).b;
            nc5.a aVar = new nc5.a(postingAuthorUiModel);
            f4z f4zVar = this.g;
            f4zVar.b(aVar);
            this.f.a(postingAuthorUiModel.e().b);
            f4zVar.b(nc5.b.a);
        }
    }
}
