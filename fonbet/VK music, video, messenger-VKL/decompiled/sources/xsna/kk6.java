package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: BasePostingFragmentBuilder.kt */
/* loaded from: classes3.dex */
public interface kk6 {
    kk6 a(UserId userId, String str, boolean z);

    kk6 b(PostingVisibilityMode postingVisibilityMode);

    kk6 c();

    void d(u90 u90Var, int i);

    kk6 f();

    kk6 g(UserId userId, ExtendedUserProfile extendedUserProfile);

    kk6 h(long j);

    kk6 i(PostingCreationEntryPoint postingCreationEntryPoint);

    kk6 j();

    kk6 k();

    void l(Context context);

    default kk6 e(String str) {
        return this;
    }
}
