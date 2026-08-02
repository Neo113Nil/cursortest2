package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;

/* compiled from: CommunityProfileContactAddDelegate.kt */
/* loaded from: classes5.dex */
public final class cfh {
    public final Context a;
    public final CommunityDetailsComponent b;
    public final hy0 c;

    public cfh(Context context, CommunityDetailsComponent communityDetailsComponent, hy0 hy0Var) {
        this.a = context;
        this.b = communityDetailsComponent;
        this.c = hy0Var;
    }

    public final void a(UserId userId, CommunityAddContactsParams communityAddContactsParams, String str) {
        this.b.a().e(this.a, new CommunityAddContactsParams(communityAddContactsParams.b, communityAddContactsParams.c, communityAddContactsParams.d, communityAddContactsParams.e, communityAddContactsParams.f), userId, str, new ng1(this, 29));
    }
}
