package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.mentions.MentionProfileVO;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mentions.model.PostMentionProfile;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class knc0 implements c420 {
    public final /* synthetic */ enc0 a;

    public knc0(enc0 enc0Var) {
        this.a = enc0Var;
    }

    @Override // xsna.c420
    public final void b(MentionProfileVO mentionProfileVO) {
        String str = mentionProfileVO.c;
        UserId userId = mentionProfileVO.b;
        String str2 = mentionProfileVO.f;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        enc0 enc0Var = this.a;
        enc0Var.g0.getClass();
        enc0Var.h0.Q(userId, "@" + str2 + " (" + sb2 + ')', (r3 & 4) == 0);
        enc0Var.U.invoke(new PostingAction.Mentions.MentionSelected(new PostMentionProfile(userId, mentionProfileVO.c, mentionProfileVO.d, mentionProfileVO.e, str2)));
    }
}
