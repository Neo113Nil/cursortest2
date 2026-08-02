package xsna;

import com.vk.dto.newsfeed.entries.Post;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostponedPostsMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class jsc0 extends FunctionReferenceImpl implements izs<Post, Boolean> {
    public static final jsc0 b = new jsc0(1, Post.class, "isPostponed", "isPostponed()Z", 0);

    @Override // xsna.izs
    public final Boolean invoke(Post post) {
        return Boolean.valueOf(post.oc());
    }
}
