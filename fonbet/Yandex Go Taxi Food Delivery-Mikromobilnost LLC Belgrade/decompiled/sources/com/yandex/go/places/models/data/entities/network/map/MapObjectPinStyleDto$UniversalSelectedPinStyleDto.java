package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$UniversalSelectedPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/s", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$UniversalSelectedPinStyleDto extends u {
    public static final s Companion = new s();
    public final ImageDto a;

    public MapObjectPinStyleDto$UniversalSelectedPinStyleDto(int i, ImageDto imageDto) {
        if ((i & 1) == 0) {
            this.a = new ImageDto(0);
        } else {
            this.a = imageDto;
        }
    }

    public MapObjectPinStyleDto$UniversalSelectedPinStyleDto() {
        this.a = new ImageDto(0);
    }
}
