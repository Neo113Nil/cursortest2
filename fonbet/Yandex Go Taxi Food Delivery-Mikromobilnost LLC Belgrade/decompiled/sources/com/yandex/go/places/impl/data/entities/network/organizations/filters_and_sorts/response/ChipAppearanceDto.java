package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/ChipAppearanceDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChipAppearanceDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final String b;
    public final boolean c;
    public final FormattedText d;
    public final String e;
    public final ImageDto f;
    public final String g;

    public /* synthetic */ ChipAppearanceDto(int i, FormattedText formattedText, String str, boolean z, FormattedText formattedText2, String str2, ImageDto imageDto, String str3) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "#5C5A57";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = imageDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public ChipAppearanceDto() {
        this(0);
    }

    public ChipAppearanceDto(int i) {
        this.a = FormattedText.c;
        this.b = "#5C5A57";
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
