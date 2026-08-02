package xsna;

import com.vk.dto.newsfeed.Counters;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;

/* compiled from: ReactionsScreenContract.kt */
/* loaded from: classes.dex */
public interface i6f0 extends im6<h6f0> {
    void Fg(ReactionSet reactionSet, ItemReactions itemReactions);

    void Ve(Integer num);

    void kl(rtt rttVar, String str, Counters counters, boolean z);

    void setTitle(CharSequence charSequence);
}
