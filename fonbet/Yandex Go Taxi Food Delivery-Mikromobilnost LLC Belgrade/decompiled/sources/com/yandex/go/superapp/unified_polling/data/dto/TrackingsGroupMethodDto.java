package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k801;
import defpackage.l801;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/TrackingsGroupMethodDto;", "", "Companion", "l801", "InappWidgets", "Aggregate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TrackingsGroupMethodDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackingsGroupMethodDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TrackingsGroupMethodDto Aggregate;
    public static final l801 Companion;
    public static final TrackingsGroupMethodDto InappWidgets;

    static {
        TrackingsGroupMethodDto trackingsGroupMethodDto = new TrackingsGroupMethodDto("InappWidgets", 0);
        InappWidgets = trackingsGroupMethodDto;
        TrackingsGroupMethodDto trackingsGroupMethodDto2 = new TrackingsGroupMethodDto("Aggregate", 1);
        Aggregate = trackingsGroupMethodDto2;
        TrackingsGroupMethodDto[] trackingsGroupMethodDtoArr = {trackingsGroupMethodDto, trackingsGroupMethodDto2};
        $VALUES = trackingsGroupMethodDtoArr;
        $ENTRIES = kotlin.enums.a.a(trackingsGroupMethodDtoArr);
        Companion = new l801();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(0));
    }

    public static TrackingsGroupMethodDto valueOf(String str) {
        return (TrackingsGroupMethodDto) Enum.valueOf(TrackingsGroupMethodDto.class, str);
    }

    public static TrackingsGroupMethodDto[] values() {
        return (TrackingsGroupMethodDto[]) $VALUES.clone();
    }
}
