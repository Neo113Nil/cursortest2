package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final class noh {
    public final /* synthetic */ com.vk.profile.community.impl.ui.profile.a a;

    public noh(com.vk.profile.community.impl.ui.profile.a aVar) {
        this.a = aVar;
    }

    public final void a(ArrayList arrayList) {
        boolean z;
        uvl0 uvl0Var = (uvl0) this.a.k.q.getValue();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += uvl0Var.l((StoriesContainer) it.next());
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            loop1: while (it2.hasNext()) {
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = ((StoriesContainer) it2.next()).g;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<StoryEntry> it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (uvl0Var.j(it3.next().c)) {
                            z = true;
                            break loop1;
                        }
                    }
                }
            }
        }
        z = false;
        CommunityProfileState communityProfileState = (CommunityProfileState) this.a.h.c;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile != null) {
            com.vk.profile.community.impl.ui.profile.a aVar = this.a;
            aVar.C(new CommunityProfileAction.w(i, extendedCommunityProfile));
            CommunityProfileState.LifecycleState lifecycleState = communityProfileState.A;
            boolean z2 = (lifecycleState == CommunityProfileState.LifecycleState.Created || lifecycleState == CommunityProfileState.LifecycleState.Destroy) ? false : true;
            if (z || !z2) {
                return;
            }
            aVar.C(new CommunityProfileAction.o(false));
        }
    }
}
