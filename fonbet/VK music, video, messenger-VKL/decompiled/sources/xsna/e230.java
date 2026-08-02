package xsna;

import com.vk.dto.user.ReactionUserProfile;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ModalPostRepostsTabReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class e230 extends FunctionReferenceImpl implements izs<x130, List<? extends b.c>> {
    @Override // xsna.izs
    public final List<? extends b.c> invoke(x130 x130Var) {
        ((com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a) this.receiver).getClass();
        List<ReactionUserProfile> list = x130Var.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b.c((ReactionUserProfile) it.next()));
        }
        return arrayList;
    }
}
