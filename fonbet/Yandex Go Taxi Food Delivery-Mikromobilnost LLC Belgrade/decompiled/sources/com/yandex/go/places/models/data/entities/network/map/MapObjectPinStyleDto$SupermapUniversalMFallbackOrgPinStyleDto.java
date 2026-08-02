package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jo00;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Ljo00;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/l", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto extends u implements jo00 {
    public static final l Companion = new l();
    public final ImageDto a;
    public final FormattedText b;
    public final FormattedText c;

    public MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto(int i, ImageDto imageDto, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? new ImageDto(0) : imageDto;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
    }

    @Override // defpackage.jo00
    public final boolean b() {
        return true;
    }

    @Override // defpackage.jo00
    /* renamed from: f, reason: from getter */
    public final ImageDto getA() {
        return this.a;
    }

    @Override // defpackage.jo00
    /* renamed from: getSubtitle, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    @Override // defpackage.jo00
    /* renamed from: getTitle, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto() {
        ImageDto imageDto = new ImageDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = imageDto;
        this.b = formattedText;
        this.c = formattedText;
    }
}
