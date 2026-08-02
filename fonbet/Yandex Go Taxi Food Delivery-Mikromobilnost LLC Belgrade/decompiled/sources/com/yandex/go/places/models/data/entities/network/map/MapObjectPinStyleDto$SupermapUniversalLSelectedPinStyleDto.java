package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/k", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto extends u {
    public static final k Companion = new k();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(24))};
    public final ImageDto a;
    public final List b;

    public MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto(int i, ImageDto imageDto, List list) {
        this.a = (i & 1) == 0 ? null : imageDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
