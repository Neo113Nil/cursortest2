package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import java.util.Iterator;

/* compiled from: RulesValidatorDelegate.kt */
/* loaded from: classes4.dex */
public final class vrg0 {
    public final PostingState a(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        xmc0 xmc0Var = new xmc0(editing);
        Iterator<PostingRule> it = editing.d.d.b.iterator();
        while (it.hasNext()) {
            it.next().F2(xmc0Var).a();
        }
        return PostingState.Editing.a(xmc0Var.a, null, null, null, null, null, null, null, null, ActionsAvailabilityState.a(xmc0Var.g, null, xmc0Var.h, null, null, null, 253), null, false, null, false, null, null, null, null, null, 1047551);
    }
}
