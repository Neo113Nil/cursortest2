package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: PostingItemContracts.kt */
/* loaded from: classes3.dex */
public interface kgc0 extends cc6 {
    static /* synthetic */ void Z1(kgc0 kgc0Var, PostingCreationEntryPoint postingCreationEntryPoint, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        kgc0Var.F5(postingCreationEntryPoint, z, null, null);
    }

    void F5(PostingCreationEntryPoint postingCreationEntryPoint, boolean z, UserId userId, ExtendedUserProfile extendedUserProfile);

    void I0(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint, boolean z);

    boolean L3(PostingCreationEntryPoint postingCreationEntryPoint);

    void d2(boolean z, dic0 dic0Var, PostingCreationEntryPoint postingCreationEntryPoint);

    void d7(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint);

    void v0(boolean z, PostingCreationEntryPoint postingCreationEntryPoint, String str);

    void w5(boolean z, PostingCreationEntryPoint postingCreationEntryPoint);

    void x1(boolean z, PostingCreationEntryPoint postingCreationEntryPoint);

    void y4(Context context, PostingCreationEntryPoint postingCreationEntryPoint, gzs<s3q0> gzsVar);
}
