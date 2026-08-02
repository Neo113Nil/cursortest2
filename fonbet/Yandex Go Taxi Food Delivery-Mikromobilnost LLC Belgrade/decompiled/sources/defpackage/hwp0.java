package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto$BusNearbySearchListItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto$RailwayScheduleSearchListItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.g0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class hwp0 extends xqt {
    public static final hwp0 e = new hwp0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g0.INSTANCE.serializer(), qoi0.a(g0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("bus_nearby", SearchResultListItemDto$BusNearbySearchListItemDto.Companion.serializer(), qoi0.a(SearchResultListItemDto$BusNearbySearchListItemDto.class)), new f9("railway_schedule", SearchResultListItemDto$RailwayScheduleSearchListItemDto.Companion.serializer(), qoi0.a(SearchResultListItemDto$RailwayScheduleSearchListItemDto.class)));
    }
}
