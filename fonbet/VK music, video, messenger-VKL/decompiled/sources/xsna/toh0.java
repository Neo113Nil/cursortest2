package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;

/* compiled from: SearchCommunitiesOnMapListRouter.kt */
/* loaded from: classes5.dex */
public interface toh0 {

    /* compiled from: SearchCommunitiesOnMapListRouter.kt */
    public interface a {
        void n3(SearchCommunitiesOnMapFragment.h hVar);
    }

    void a(Group group, LocationCoordinate locationCoordinate, SearchStatsLoggingInfo searchStatsLoggingInfo);
}
