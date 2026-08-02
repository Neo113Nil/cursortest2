package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tqs0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/SortModalItemBlockDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SortModalItemBlockDto {
    public static final t Companion = new t();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(25))};
    public final FormattedText a;
    public final List b;

    public /* synthetic */ SortModalItemBlockDto(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? null : formattedText;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public SortModalItemBlockDto(int i) {
        this.a = null;
        this.b = EmptyList.a;
    }

    public SortModalItemBlockDto() {
        this(0);
    }
}
