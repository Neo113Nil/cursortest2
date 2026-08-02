package com.yandex.go.places.models.data.entities.network.bottom_panel;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$OpenMoreActionItemDto", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/c", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$OpenMoreActionItemDto {
    public static final c Companion = new c();
    public final k a;
    public final String b;
    public final ImageDto c;

    public /* synthetic */ BottomPanelButtonActionDto$OpenMoreActionItemDto(int i, k kVar, String str, ImageDto imageDto) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, BottomPanelButtonActionDto$OpenMoreActionItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = kVar;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonActionDto$OpenMoreActionItemDto)) {
            return false;
        }
        BottomPanelButtonActionDto$OpenMoreActionItemDto bottomPanelButtonActionDto$OpenMoreActionItemDto = (BottomPanelButtonActionDto$OpenMoreActionItemDto) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$OpenMoreActionItemDto.a) && jl40.l(this.b, bottomPanelButtonActionDto$OpenMoreActionItemDto.b) && jl40.l(this.c, bottomPanelButtonActionDto$OpenMoreActionItemDto.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ImageDto imageDto = this.c;
        return b + (imageDto == null ? 0 : imageDto.hashCode());
    }

    public final String toString() {
        return "OpenMoreActionItemDto(action=" + this.a + ", text=" + this.b + ", image=" + this.c + Extension.C_BRAKE;
    }
}
