package com.yandex.go.scooters.promocodes.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promocodes/data/model/ScootersPromocodesUseResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/promocodes/data/model/c", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromocodesUseResponse {
    public static final c Companion = new c();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(21))};
    public final FormattedText a;
    public final List b;

    public /* synthetic */ ScootersPromocodesUseResponse(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ScootersPromocodesUseResponse() {
        this.a = FormattedText.c;
        this.b = EmptyList.a;
    }
}
