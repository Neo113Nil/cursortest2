package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class s3h implements a0t {
    public final /* synthetic */ d4h b;

    public /* synthetic */ s3h(d4h d4hVar) {
        this.b = d4hVar;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ExtendedCommunityProfile.c cVar = (ExtendedCommunityProfile.c) obj2;
        ((d3h) this.b.c.invoke()).g.a((UserId) obj, new CommunityAddContactsParams(cVar != null ? cVar.a : null, cVar != null ? cVar.b : null, (String) obj3, (String) obj4, (String) obj5), "onboarding_2025");
        return s3q0.a;
    }
}
