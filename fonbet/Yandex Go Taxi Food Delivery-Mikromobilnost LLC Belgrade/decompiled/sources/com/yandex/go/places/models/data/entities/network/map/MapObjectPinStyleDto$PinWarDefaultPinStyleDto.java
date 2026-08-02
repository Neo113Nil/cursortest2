package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$PinWarDefaultPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/f", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$PinWarDefaultPinStyleDto extends u {
    public static final f Companion = new f();
    public final FormattedText a;
    public final FormattedText b;
    public final ImageDto c;
    public final String d;
    public final ImageDto e;

    public MapObjectPinStyleDto$PinWarDefaultPinStyleDto(int i, FormattedText formattedText, FormattedText formattedText2, ImageDto imageDto, String str, ImageDto imageDto2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = new ImageDto(0);
        } else {
            this.c = imageDto;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = imageDto2;
        }
    }

    public MapObjectPinStyleDto$PinWarDefaultPinStyleDto() {
        FormattedText formattedText = FormattedText.c;
        ImageDto imageDto = new ImageDto(0);
        this.a = formattedText;
        this.b = formattedText;
        this.c = imageDto;
        this.d = "";
        this.e = null;
    }
}
