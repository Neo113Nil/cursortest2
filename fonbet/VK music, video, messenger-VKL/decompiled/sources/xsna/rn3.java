package xsna;

import android.content.Intent;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollInfo;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: ArticleContract.kt */
/* loaded from: classes15.dex */
public interface rn3 extends gm6 {
    void S(int i, UserId userId);

    void S5(String str, e5 e5Var);

    void U1(Article article);

    void U3(PollInfo pollInfo, boolean z, izs<? super PollAttachment, s3q0> izsVar);

    void W1();

    void Z3(Intent intent);

    void y1(Article article);

    void z2(PollInfo pollInfo);
}
