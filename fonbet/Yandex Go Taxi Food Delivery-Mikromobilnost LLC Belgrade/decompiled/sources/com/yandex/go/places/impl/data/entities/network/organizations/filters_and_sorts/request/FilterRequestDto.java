package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nsq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/FilterRequestDto;", "", "Companion", "FilterTypeDto", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterRequestDto {
    public static final b Companion = new b();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(23))};
    public final String a;
    public final FilterOptionRequestDto b;
    public final FilterTypeDto c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/FilterRequestDto$FilterTypeDto;", "", "Companion", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/c", "TOGGLE", "SELECTION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FilterTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterTypeDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final FilterTypeDto SELECTION;
        public static final FilterTypeDto TOGGLE;

        static {
            FilterTypeDto filterTypeDto = new FilterTypeDto("TOGGLE", 0);
            TOGGLE = filterTypeDto;
            FilterTypeDto filterTypeDto2 = new FilterTypeDto("SELECTION", 1);
            SELECTION = filterTypeDto2;
            FilterTypeDto[] filterTypeDtoArr = {filterTypeDto, filterTypeDto2};
            $VALUES = filterTypeDtoArr;
            $ENTRIES = kotlin.enums.a.a(filterTypeDtoArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(24));
        }

        public static FilterTypeDto valueOf(String str) {
            return (FilterTypeDto) Enum.valueOf(FilterTypeDto.class, str);
        }

        public static FilterTypeDto[] values() {
            return (FilterTypeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ FilterRequestDto(int i, String str, FilterOptionRequestDto filterOptionRequestDto, FilterTypeDto filterTypeDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new FilterOptionRequestDto(0);
        } else {
            this.b = filterOptionRequestDto;
        }
        if ((i & 4) == 0) {
            this.c = FilterTypeDto.TOGGLE;
        } else {
            this.c = filterTypeDto;
        }
    }

    public FilterRequestDto(String str, FilterOptionRequestDto filterOptionRequestDto, FilterTypeDto filterTypeDto) {
        this.a = str;
        this.b = filterOptionRequestDto;
        this.c = filterTypeDto;
    }

    public FilterRequestDto() {
        this("", new FilterOptionRequestDto(0), FilterTypeDto.TOGGLE);
    }
}
