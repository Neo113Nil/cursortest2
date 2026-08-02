package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OpenNavigatorActionSubtypeDto", "", "Lcom/yandex/go/places/models/data/entities/network/ActionDto$OpenNavigatorActionSubtypeDto;", "Companion", "nv", "GO_VIA_ACTION", "GO_TO_ACTION", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionDto$OpenNavigatorActionSubtypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionDto$OpenNavigatorActionSubtypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final nv Companion;
    public static final ActionDto$OpenNavigatorActionSubtypeDto GO_TO_ACTION;
    public static final ActionDto$OpenNavigatorActionSubtypeDto GO_VIA_ACTION;

    static {
        ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto = new ActionDto$OpenNavigatorActionSubtypeDto("GO_VIA_ACTION", 0);
        GO_VIA_ACTION = actionDto$OpenNavigatorActionSubtypeDto;
        ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto2 = new ActionDto$OpenNavigatorActionSubtypeDto("GO_TO_ACTION", 1);
        GO_TO_ACTION = actionDto$OpenNavigatorActionSubtypeDto2;
        ActionDto$OpenNavigatorActionSubtypeDto[] actionDto$OpenNavigatorActionSubtypeDtoArr = {actionDto$OpenNavigatorActionSubtypeDto, actionDto$OpenNavigatorActionSubtypeDto2};
        $VALUES = actionDto$OpenNavigatorActionSubtypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(actionDto$OpenNavigatorActionSubtypeDtoArr);
        Companion = new nv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(4));
    }

    public static ActionDto$OpenNavigatorActionSubtypeDto valueOf(String str) {
        return (ActionDto$OpenNavigatorActionSubtypeDto) Enum.valueOf(ActionDto$OpenNavigatorActionSubtypeDto.class, str);
    }

    public static ActionDto$OpenNavigatorActionSubtypeDto[] values() {
        return (ActionDto$OpenNavigatorActionSubtypeDto[]) $VALUES.clone();
    }
}
