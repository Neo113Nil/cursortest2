package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rm6;
import defpackage.x47;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/ButtonsArrangementDto;", "", "Companion", "x47", "VERTICAL", "HORIZONTAL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ButtonsArrangementDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonsArrangementDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final x47 Companion;
    public static final ButtonsArrangementDto HORIZONTAL;
    public static final ButtonsArrangementDto VERTICAL;

    static {
        ButtonsArrangementDto buttonsArrangementDto = new ButtonsArrangementDto("VERTICAL", 0);
        VERTICAL = buttonsArrangementDto;
        ButtonsArrangementDto buttonsArrangementDto2 = new ButtonsArrangementDto("HORIZONTAL", 1);
        HORIZONTAL = buttonsArrangementDto2;
        ButtonsArrangementDto[] buttonsArrangementDtoArr = {buttonsArrangementDto, buttonsArrangementDto2};
        $VALUES = buttonsArrangementDtoArr;
        $ENTRIES = kotlin.enums.a.a(buttonsArrangementDtoArr);
        Companion = new x47();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(24));
    }

    public static ButtonsArrangementDto valueOf(String str) {
        return (ButtonsArrangementDto) Enum.valueOf(ButtonsArrangementDto.class, str);
    }

    public static ButtonsArrangementDto[] values() {
        return (ButtonsArrangementDto[]) $VALUES.clone();
    }
}
