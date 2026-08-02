package xsna;

import android.content.Context;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfilePostingItemViewDelegate.kt */
/* loaded from: classes5.dex */
public final class hsh {
    public static final int e = cn70.b(0);
    public final Context a;
    public final com.vk.lists.a b;
    public int c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new lg(9));

    public hsh(Context context, com.vk.lists.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final PostingCountersModel.a a(int i) {
        return new PostingCountersModel.a(this.a.getString(R.string.draft_posts_title), i, PostingCountersModel.ClickActionType.OPEN_DRAFTS);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final PostingCountersModel.a b(int i) {
        return new PostingCountersModel.a(this.a.getString((this.c < 2 || ((Boolean) this.d.getValue()).booleanValue()) ? R.string.suggested_posts_title_short : R.string.suggested_posts_title_long), i, PostingCountersModel.ClickActionType.OPEN_SUGGESTED);
    }
}
