package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition", "", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;", "LEFT", "CENTER", "LEFT_YANGO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppLogoPositionRepository$LogoPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppLogoPositionRepository$LogoPosition[] $VALUES;
    public static final SuperAppLogoPositionRepository$LogoPosition CENTER;
    public static final SuperAppLogoPositionRepository$LogoPosition LEFT;
    public static final SuperAppLogoPositionRepository$LogoPosition LEFT_YANGO;

    static {
        SuperAppLogoPositionRepository$LogoPosition superAppLogoPositionRepository$LogoPosition = new SuperAppLogoPositionRepository$LogoPosition("LEFT", 0);
        LEFT = superAppLogoPositionRepository$LogoPosition;
        SuperAppLogoPositionRepository$LogoPosition superAppLogoPositionRepository$LogoPosition2 = new SuperAppLogoPositionRepository$LogoPosition("CENTER", 1);
        CENTER = superAppLogoPositionRepository$LogoPosition2;
        SuperAppLogoPositionRepository$LogoPosition superAppLogoPositionRepository$LogoPosition3 = new SuperAppLogoPositionRepository$LogoPosition("LEFT_YANGO", 2);
        LEFT_YANGO = superAppLogoPositionRepository$LogoPosition3;
        SuperAppLogoPositionRepository$LogoPosition[] superAppLogoPositionRepository$LogoPositionArr = {superAppLogoPositionRepository$LogoPosition, superAppLogoPositionRepository$LogoPosition2, superAppLogoPositionRepository$LogoPosition3};
        $VALUES = superAppLogoPositionRepository$LogoPositionArr;
        $ENTRIES = kotlin.enums.a.a(superAppLogoPositionRepository$LogoPositionArr);
    }

    public static SuperAppLogoPositionRepository$LogoPosition valueOf(String str) {
        return (SuperAppLogoPositionRepository$LogoPosition) Enum.valueOf(SuperAppLogoPositionRepository$LogoPosition.class, str);
    }

    public static SuperAppLogoPositionRepository$LogoPosition[] values() {
        return (SuperAppLogoPositionRepository$LogoPosition[]) $VALUES.clone();
    }
}
