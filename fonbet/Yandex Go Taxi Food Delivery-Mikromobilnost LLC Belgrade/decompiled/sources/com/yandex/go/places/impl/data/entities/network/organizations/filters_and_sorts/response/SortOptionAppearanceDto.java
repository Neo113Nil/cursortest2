package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/SortOptionAppearanceDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SortOptionAppearanceDto {
    public static final u Companion = new u();
    public final FormattedText a;
    public final FormattedText b;

    public /* synthetic */ SortOptionAppearanceDto(int i, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
    }

    public SortOptionAppearanceDto() {
        this(0);
    }

    public SortOptionAppearanceDto(int i) {
        this.a = FormattedText.c;
        this.b = null;
    }
}
