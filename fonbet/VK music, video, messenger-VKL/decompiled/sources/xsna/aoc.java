package xsna;

import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorPendingItem;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.toggle.features.ClipsFeatures;
import java.util.ArrayList;
import java.util.List;
import xsna.znc;

/* compiled from: ClipCoauthorDecisionVS.kt */
/* loaded from: classes16.dex */
public final class aoc {
    public static final znc a(ClipCoauthorDecisionState clipCoauthorDecisionState) {
        List<ClipCoauthorPendingItem> list = clipCoauthorDecisionState.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ClipCoauthorPendingItem clipCoauthorPendingItem : list) {
            Owner owner = clipCoauthorPendingItem.b;
            UserId userId = owner.b;
            String str = owner.c;
            if (str == null) {
                str = "";
            }
            String str2 = owner.d;
            arrayList.add(new znc.a(userId, str, str2 != null ? str2 : "", clipCoauthorPendingItem.c, fkq0.b(userId) ? znc.a.InterfaceC4185a.C4186a.a : clipCoauthorPendingItem.b.l() ? znc.a.InterfaceC4185a.b.a : znc.a.InterfaceC4185a.c.a));
        }
        ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = clipCoauthorDecisionState.c;
        boolean q = BuildInfo.q();
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        return new znc(arrayList, clipCoauthorsDecisionLaunchType, q, com.vk.toggle.b.A.a(clipsFeatures));
    }
}
