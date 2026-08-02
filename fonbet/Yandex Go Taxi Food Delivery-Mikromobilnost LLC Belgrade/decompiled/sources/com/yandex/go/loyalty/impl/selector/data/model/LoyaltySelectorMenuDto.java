package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.o3z;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltySelectorMenuDto;", "", "Companion", "com/yandex/go/loyalty/impl/selector/data/model/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltySelectorMenuDto {
    public static final g Companion = new g();
    public static final i3y[] c;
    public static final LoyaltySelectorMenuDto d;
    public final String a;
    public final List b;

    static {
        h hVar = LoyaltySelectorMenuOptionDto.Companion;
        c = new i3y[]{null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(28))};
        d = new LoyaltySelectorMenuDto(0);
    }

    public /* synthetic */ LoyaltySelectorMenuDto(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public LoyaltySelectorMenuDto(int i) {
        this.a = "";
        this.b = EmptyList.a;
    }

    public LoyaltySelectorMenuDto() {
        this(0);
    }
}
