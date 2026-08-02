package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$UniversalMPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/q", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$UniversalMPinStyleDto extends u {
    public static final q Companion = new q();
    public final ImageDto a;
    public final ImageDto b;
    public final FormattedText c;
    public final FormattedText d;

    public MapObjectPinStyleDto$UniversalMPinStyleDto(int i, ImageDto imageDto, ImageDto imageDto2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? new ImageDto(0) : imageDto;
        if ((i & 2) == 0) {
            this.b = new ImageDto(0);
        } else {
            this.b = imageDto2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
    }

    public MapObjectPinStyleDto$UniversalMPinStyleDto() {
        ImageDto imageDto = new ImageDto(0);
        ImageDto imageDto2 = new ImageDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = imageDto;
        this.b = imageDto2;
        this.c = formattedText;
        this.d = formattedText;
    }
}
