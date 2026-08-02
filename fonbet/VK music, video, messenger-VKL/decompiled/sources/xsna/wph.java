package xsna;

import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityProfileLegacyAuthorHeaderReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class wph implements heh {
    @Override // xsna.heh
    public final List<String> c(List<String> list) {
        return EmptyList.b;
    }

    @Override // xsna.heh
    public final CommunityProfileViewState.Data.e e(ExtendedCommunityProfile extendedCommunityProfile, CommunityProfileState.a aVar, ArrayList arrayList, a8p0 a8p0Var) {
        return new CommunityProfileViewState.Data.e.a(arrayList);
    }

    @Override // xsna.heh
    public final CommunityProfileViewState.Data.c b(CommunityProfileViewState.Data.c cVar) {
        return cVar;
    }

    @Override // xsna.heh
    public final CommunityProfileState a(CommunityProfileState communityProfileState, d.v vVar) {
        return communityProfileState;
    }

    @Override // xsna.heh
    public final CommunityProfileState d(CommunityProfileState communityProfileState, d.C1611d c1611d) {
        return communityProfileState;
    }

    @Override // xsna.heh
    public final CommunityProfileState f(CommunityProfileState communityProfileState, d.e eVar) {
        return communityProfileState;
    }
}
