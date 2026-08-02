package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/g", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto extends u {
    public static final g Companion = new g();
    public final float[] a;
    public final ImageDto b;
    public final String c;

    public MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto(int i, float[] fArr, ImageDto imageDto, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = fArr;
        }
        if ((i & 2) == 0) {
            this.b = new ImageDto(0);
        } else {
            this.b = imageDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto() {
        ImageDto imageDto = new ImageDto(0);
        this.a = null;
        this.b = imageDto;
        this.c = null;
    }
}
