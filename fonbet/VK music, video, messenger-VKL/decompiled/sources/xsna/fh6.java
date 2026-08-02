package xsna;

import com.vk.dto.newsfeed.Counters;
import com.vk.dto.reactions.ReactionMeta;
import kotlin.collections.EmptyList;
import xsna.gh6;

/* compiled from: BaseModalPostReactionsTabReducer.kt */
/* loaded from: classes4.dex */
public abstract class fh6<VS extends gh6> extends dm50<VS, w130, x130> {
    public fh6(Counters counters, ReactionMeta reactionMeta, int i, int i2) {
        super(new x130(EmptyList.b, (i2 & 1) != 0 ? null : counters, 0, (i2 & 2) != 0 ? null : reactionMeta, (i2 & 4) != 0 ? 0 : i, true, true, false, null));
    }
}
