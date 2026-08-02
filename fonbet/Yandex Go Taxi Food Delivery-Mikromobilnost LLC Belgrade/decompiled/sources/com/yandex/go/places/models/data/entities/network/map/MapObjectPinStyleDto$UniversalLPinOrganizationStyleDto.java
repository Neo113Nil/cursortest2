package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/o", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto extends u {
    public static final o Companion = new o();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(25)), null, null};
    public final ImageDto a;
    public final List b;
    public final FormattedText c;
    public final FormattedText d;

    public MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto(int i, ImageDto imageDto, List list, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? new ImageDto(0) : imageDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
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

    public MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto() {
        ImageDto imageDto = new ImageDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = imageDto;
        this.b = EmptyList.a;
        this.c = formattedText;
        this.d = formattedText;
    }
}
