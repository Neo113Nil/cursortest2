package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i0;", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity extends i0 {
    public static final u Companion = new u();
    public final String a;
    public final l b;

    public IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity(int i, String str, l lVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = a.INSTANCE;
        } else {
            this.b = lVar;
        }
    }

    public IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity() {
        a aVar = a.INSTANCE;
        this.a = "";
        this.b = aVar;
    }
}
