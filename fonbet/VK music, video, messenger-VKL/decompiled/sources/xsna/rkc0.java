package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final class rkc0 implements izs<PostingState.Editing, wow<qyf>> {
    public final /* synthetic */ qkc0 b;

    public rkc0(qkc0 qkc0Var) {
        this.b = qkc0Var;
    }

    @Override // xsna.izs
    public final wow<qyf> invoke(PostingState.Editing editing) {
        ArrayList arrayList;
        vpc0 vpc0Var = this.b.d;
        List<CoauthorDto> list = editing.i.n;
        vpc0Var.getClass();
        if (list != null) {
            List<CoauthorDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                Owner owner = ((CoauthorDto) it.next()).b;
                String str = owner.c;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new qyf(str, owner.f(cn70.b(40))));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new wow<>(arrayList);
        }
        return null;
    }
}
