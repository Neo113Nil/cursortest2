package xsna;

import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockViewSettings;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityProfileLoadingReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class frh {
    public final cph a;

    public frh(cph cphVar) {
        this.a = cphVar;
    }

    public static kdh a(ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabType groupContentTabType;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings = extendedCommunityProfile.L2;
        if (groupsPrimaryBlockSettings == null || !((groupContentTabType = groupsPrimaryBlockSettings.b.b) == GroupContentTabType.MARKET || groupContentTabType == GroupContentTabType.MARKET_ALBUMS || groupContentTabType == GroupContentTabType.SERVICES)) {
            return null;
        }
        GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings = groupsPrimaryBlockSettings.c;
        return new kdh(groupsPrimaryBlockViewSettings != null ? groupsPrimaryBlockViewSettings.b : null, groupContentTabType, null, false, true, false, false, false);
    }
}
