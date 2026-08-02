package xsna;

import com.vk.contacts.ContactsManager;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.bwy;

/* compiled from: ProfilesRecommendationsTransformer.kt */
/* loaded from: classes4.dex */
public final class m1e0 implements gn60<ProfilesRecommendations, wm60> {
    public final ContactsManager b;

    public m1e0(ContactsManager contactsManager, a1e0 a1e0Var) {
        this.b = contactsManager;
    }

    public final List a(ProfilesRecommendations profilesRecommendations) {
        ArrayList<RecommendedProfile> arrayList = profilesRecommendations.l;
        boolean H0 = this.b.H0();
        String str = profilesRecommendations.k;
        boolean z = (str == null || str.length() == 0 || arrayList.isEmpty()) ? false : true;
        String str2 = profilesRecommendations.i;
        AbstractList a = a1e0.a(profilesRecommendations, z, H0);
        RecommendedProfile recommendedProfile = (RecommendedProfile) j5g.a0(arrayList);
        String str3 = profilesRecommendations.k;
        bwy bwyVar = profilesRecommendations.f;
        return Collections.singletonList(new n1e0(str2, a, profilesRecommendations, recommendedProfile, H0, z, str3, bwyVar, epx.f(bwyVar, bwy.a.a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((ProfilesRecommendations) pair);
    }
}
