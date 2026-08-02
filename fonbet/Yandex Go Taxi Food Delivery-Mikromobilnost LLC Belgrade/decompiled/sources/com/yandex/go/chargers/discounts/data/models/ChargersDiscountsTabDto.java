package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsTabDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsTabDto {
    public static final d0 Companion = new d0();
    public static final i3y[] e;
    public final ChargersDiscountsTypeDto a;
    public final FormattedText b;
    public final Integer c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wu9(3)), null, null, kotlin.a.b(lazyThreadSafetyMode, new wu9(4))};
    }

    public /* synthetic */ ChargersDiscountsTabDto(int i, ChargersDiscountsTypeDto chargersDiscountsTypeDto, FormattedText formattedText, Integer num, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersDiscountsTypeDto;
        }
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public ChargersDiscountsTabDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = formattedText;
        this.c = null;
        this.d = null;
    }
}
