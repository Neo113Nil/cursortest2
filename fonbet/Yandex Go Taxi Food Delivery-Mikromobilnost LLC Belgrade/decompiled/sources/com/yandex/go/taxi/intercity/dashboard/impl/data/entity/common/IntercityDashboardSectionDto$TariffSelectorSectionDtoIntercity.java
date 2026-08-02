package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i0;", "Companion", "SelectorItemDto", "FallbackSelectorItem", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity extends i0 {
    public static final c0 Companion = new c0();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(26)), null, null};
    public final List a;
    public final String b;
    public final FallbackSelectorItem c;

    public IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity(int i, List list, String str, FallbackSelectorItem fallbackSelectorItem) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = new FallbackSelectorItem(0);
        } else {
            this.c = fallbackSelectorItem;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$FallbackSelectorItem;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FallbackSelectorItem {
        public static final d0 Companion = new d0();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ FallbackSelectorItem(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public FallbackSelectorItem() {
            this(0);
        }

        public FallbackSelectorItem(int i) {
            this.a = new FormattedText(0);
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto;", "", "Companion", "SelectorItemState", "OptionalSelectorItemState", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SelectorItemDto {
        public static final e0 Companion = new e0();
        public final String a;
        public final String b;
        public final Boolean c;
        public final SelectorItemState d;
        public final OptionalSelectorItemState e;
        public final OptionalSelectorItemState f;

        public /* synthetic */ SelectorItemDto(int i, String str, String str2, Boolean bool, SelectorItemState selectorItemState, OptionalSelectorItemState optionalSelectorItemState, OptionalSelectorItemState optionalSelectorItemState2) {
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
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 8) == 0) {
                this.d = new SelectorItemState(0);
            } else {
                this.d = selectorItemState;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = optionalSelectorItemState;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = optionalSelectorItemState2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$OptionalSelectorItemState;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class OptionalSelectorItemState {
            public static final f0 Companion = new f0();
            public final String a;
            public final String b;
            public final String c;

            public /* synthetic */ OptionalSelectorItemState(int i, String str, String str2, String str3) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
            }

            public OptionalSelectorItemState() {
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$SelectorItemState;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/g0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SelectorItemState {
            public static final g0 Companion = new g0();
            public final String a;
            public final String b;
            public final String c;

            public /* synthetic */ SelectorItemState(int i, String str, String str2, String str3) {
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
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
            }

            public SelectorItemState(int i) {
                this.a = "";
                this.b = "";
                this.c = null;
            }

            public SelectorItemState() {
                this(0);
            }
        }

        public SelectorItemDto() {
            SelectorItemState selectorItemState = new SelectorItemState(0);
            this.a = "";
            this.b = "";
            this.c = null;
            this.d = selectorItemState;
            this.e = null;
            this.f = null;
        }
    }

    public IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity() {
        FallbackSelectorItem fallbackSelectorItem = new FallbackSelectorItem(0);
        this.a = EmptyList.a;
        this.b = null;
        this.c = fallbackSelectorItem;
    }
}
