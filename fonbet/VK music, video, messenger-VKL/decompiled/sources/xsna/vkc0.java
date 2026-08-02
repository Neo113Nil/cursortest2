package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.GroupAdminLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class vkc0 extends FunctionReferenceImpl implements izs<PostingState.Editing, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(PostingState.Editing editing) {
        PostingState.Editing editing2 = editing;
        ((vpc0) this.receiver).getClass();
        PostingContext postingContext = editing2.c;
        boolean d = fkq0.d(postingContext.b.b);
        GroupWallPostingSettings groupWallPostingSettings = editing2.d.h;
        boolean z = false;
        boolean z2 = (!postingContext.i || epx.f(postingContext.k, Boolean.TRUE)) && postingContext.d && !editing2.h.Ja() && (d || ((groupWallPostingSettings != null ? groupWallPostingSettings.c : null) == GroupPrivacyType.OPEN) || (groupWallPostingSettings != null && groupWallPostingSettings.b && groupWallPostingSettings.e == GroupAdminLevel.ADMINISTRATOR));
        if (!vmc0.b(editing2)) {
            z = z2;
        } else if (z2 && epx.f(editing2.i.i, PrivacyPostType.AllUsers.b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
