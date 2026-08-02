package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.mention.StoryMentionSpan;

/* compiled from: StorySpanProviders.kt */
/* loaded from: classes16.dex */
public final class w6m0 extends wn4 {
    public final Integer a = -1;

    @Override // xsna.wn4
    public final i420 j(UserId userId) {
        return new StoryMentionSpan(userId, false, 0, 6, null);
    }

    @Override // xsna.wn4
    public final Integer k() {
        return this.a;
    }
}
