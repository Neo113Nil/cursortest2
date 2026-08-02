package xsna;

import com.vk.dto.user.ReactionUserProfile;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ModalPostAllReactionsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class o030 extends FunctionReferenceImpl implements izs<x130, List<? extends b.a>> {
    @Override // xsna.izs
    public final List<? extends b.a> invoke(x130 x130Var) {
        x130 x130Var2 = x130Var;
        ((com.vk.newsfeed.impl.postmodal.reactions.tabs.all.a) this.receiver).getClass();
        List<ReactionUserProfile> list = x130Var2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b.a((ReactionUserProfile) it.next(), x130Var2.j));
        }
        return arrayList;
    }
}
