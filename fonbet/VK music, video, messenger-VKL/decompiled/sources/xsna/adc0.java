package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingAuthorRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class adc0 extends FunctionReferenceImpl implements yzs<UserId, PostingAuthor.User, List<? extends PostingAuthor.Community>, com.vk.newsfeed.api.posting.author.a> {
    @Override // xsna.yzs
    public final com.vk.newsfeed.api.posting.author.a invoke(UserId userId, PostingAuthor.User user, List<? extends PostingAuthor.Community> list) {
        ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) this.receiver).getClass();
        return new com.vk.newsfeed.api.posting.author.a(userId, user, list);
    }
}
