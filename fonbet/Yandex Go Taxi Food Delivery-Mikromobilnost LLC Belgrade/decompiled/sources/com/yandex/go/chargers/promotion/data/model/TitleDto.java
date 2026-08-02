package com.yandex.go.chargers.promotion.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nhz0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/promotion/data/model/TitleDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/promotion/data/model/f", "promotion"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TitleDto {
    public static final f Companion = new f();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(4))};
    public final List a;

    public /* synthetic */ TitleDto(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public TitleDto() {
        this.a = null;
    }
}
