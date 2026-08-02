package com.yandex.go.explorer.impl.data.api;

import com.yandex.go.explorer.impl.data.models.DiscoveredCellsRequest;
import com.yandex.go.explorer.impl.data.models.DiscoveredCellsResponse;
import com.yandex.go.explorer.impl.data.models.RegionCoverageRequestParams;
import com.yandex.go.explorer.impl.data.models.RegionCoverageResponse;
import com.yandex.go.explorer.impl.data.models.UserLocationsRequestDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/explorer/impl/data/api/ExplorerInternalApi;", "", "Lcom/yandex/go/explorer/impl/data/models/RegionCoverageRequestParams;", "params", "Lcmt;", "Lcom/yandex/go/explorer/impl/data/models/RegionCoverageResponse;", "c", "(Lcom/yandex/go/explorer/impl/data/models/RegionCoverageRequestParams;)Lcmt;", "Lcom/yandex/go/explorer/impl/data/models/UserLocationsRequestDto;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Lcom/yandex/go/explorer/impl/data/models/UserLocationsRequestDto;)Lcmt;", "Lcom/yandex/go/explorer/impl/data/models/DiscoveredCellsRequest;", "Lcom/yandex/go/explorer/impl/data/models/DiscoveredCellsResponse;", "a", "(Lcom/yandex/go/explorer/impl/data/models/DiscoveredCellsRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ExplorerInternalApi {
    @s490("organizations-manager/v1/places/discovery/discovered-cells")
    cmt<DiscoveredCellsResponse> a(@q76 DiscoveredCellsRequest params);

    @s490("v1/user-locations")
    cmt<zy11> b(@q76 UserLocationsRequestDto params);

    @s490("organizations-manager/v1/places/discovery/region-coverage")
    cmt<RegionCoverageResponse> c(@q76 RegionCoverageRequestParams params);
}
