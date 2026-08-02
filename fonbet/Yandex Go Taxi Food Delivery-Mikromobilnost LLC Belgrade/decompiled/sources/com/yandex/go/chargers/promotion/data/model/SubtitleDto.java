package com.yandex.go.chargers.promotion.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w0v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/promotion/data/model/SubtitleDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/promotion/data/model/d", "promotion"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubtitleDto {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(3))};
    public final List a;

    public /* synthetic */ SubtitleDto(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public SubtitleDto() {
        this.a = null;
    }
}
