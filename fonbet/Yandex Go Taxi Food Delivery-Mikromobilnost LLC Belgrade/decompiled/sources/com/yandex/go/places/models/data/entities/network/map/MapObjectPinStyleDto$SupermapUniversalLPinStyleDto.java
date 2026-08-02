package com.yandex.go.places.models.data.entities.network.map;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.io00;
import defpackage.qxz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/places/models/data/entities/network/map/MapObjectPinStyleDto$SupermapUniversalLPinStyleDto", "Lcom/yandex/go/places/models/data/entities/network/map/u;", "Lio00;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/map/j", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapObjectPinStyleDto$SupermapUniversalLPinStyleDto extends u implements io00 {
    public static final j Companion = new j();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(23)), null, null};
    public final ImageDto a;
    public final List b;
    public final FormattedText c;
    public final FormattedText d;

    public MapObjectPinStyleDto$SupermapUniversalLPinStyleDto(int i, ImageDto imageDto, List list, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? null : imageDto;
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

    @Override // defpackage.io00
    /* renamed from: a, reason: from getter */
    public final ImageDto getA() {
        return this.a;
    }

    @Override // defpackage.io00
    public final boolean b() {
        return false;
    }

    @Override // defpackage.io00
    /* renamed from: getMedia, reason: from getter */
    public final List getB() {
        return this.b;
    }

    @Override // defpackage.io00
    /* renamed from: getSubtitle, reason: from getter */
    public final FormattedText getD() {
        return this.d;
    }

    @Override // defpackage.io00
    /* renamed from: getTitle, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    public MapObjectPinStyleDto$SupermapUniversalLPinStyleDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = EmptyList.a;
        this.c = formattedText;
        this.d = formattedText;
    }
}
