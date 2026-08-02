package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityCommentSuggestSelectorDto;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/l;", "Companion", "SuggestItemDto", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityCommentSuggestSelectorDto extends l {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final List a;
    public final IntercityDashboardCommentSelectorTypeDto b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new i8w(4)), kotlin.a.b(lazyThreadSafetyMode, new i8w(5))};
    }

    public IntercityCommentSuggestSelectorDto(int i, List list, IntercityDashboardCommentSelectorTypeDto intercityDashboardCommentSelectorTypeDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = IntercityDashboardCommentSelectorTypeDto.SUGGESTS;
        } else {
            this.b = intercityDashboardCommentSelectorTypeDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityCommentSuggestSelectorDto$SuggestItemDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuggestItemDto {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ SuggestItemDto(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public SuggestItemDto() {
            this.a = "";
            this.b = "";
        }
    }

    public IntercityCommentSuggestSelectorDto() {
        this.a = EmptyList.a;
        this.b = IntercityDashboardCommentSelectorTypeDto.SUGGESTS;
    }
}
