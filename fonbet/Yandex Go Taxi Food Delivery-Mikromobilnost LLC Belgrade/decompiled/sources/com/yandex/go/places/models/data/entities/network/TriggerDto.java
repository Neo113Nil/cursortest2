package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ve11;
import defpackage.z411;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/TriggerDto;", "", "Companion", "ve11", "SHOW", "TAP", "UNKNOWN", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TriggerDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TriggerDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ve11 Companion;
    public static final TriggerDto SHOW;
    public static final TriggerDto TAP;
    public static final TriggerDto UNKNOWN;

    static {
        TriggerDto triggerDto = new TriggerDto("SHOW", 0);
        SHOW = triggerDto;
        TriggerDto triggerDto2 = new TriggerDto("TAP", 1);
        TAP = triggerDto2;
        TriggerDto triggerDto3 = new TriggerDto("UNKNOWN", 2);
        UNKNOWN = triggerDto3;
        TriggerDto[] triggerDtoArr = {triggerDto, triggerDto2, triggerDto3};
        $VALUES = triggerDtoArr;
        $ENTRIES = kotlin.enums.a.a(triggerDtoArr);
        Companion = new ve11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z411(27));
    }

    public static TriggerDto valueOf(String str) {
        return (TriggerDto) Enum.valueOf(TriggerDto.class, str);
    }

    public static TriggerDto[] values() {
        return (TriggerDto[]) $VALUES.clone();
    }
}
