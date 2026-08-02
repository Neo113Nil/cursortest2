package com.yandex.go.flex.main_screen.presentation.divkit.custom_view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/MainScreenDivCustomViewTypes;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAIN_SCREEN_ONBOARDING_BUTTON", "AZIMUTH_ROTATABLE_ICON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MainScreenDivCustomViewTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenDivCustomViewTypes[] $VALUES;
    public static final MainScreenDivCustomViewTypes AZIMUTH_ROTATABLE_ICON;
    public static final MainScreenDivCustomViewTypes MAIN_SCREEN_ONBOARDING_BUTTON;
    private final String type;

    static {
        MainScreenDivCustomViewTypes mainScreenDivCustomViewTypes = new MainScreenDivCustomViewTypes("MAIN_SCREEN_ONBOARDING_BUTTON", 0, "native_feed_onboarding_block");
        MAIN_SCREEN_ONBOARDING_BUTTON = mainScreenDivCustomViewTypes;
        MainScreenDivCustomViewTypes mainScreenDivCustomViewTypes2 = new MainScreenDivCustomViewTypes("AZIMUTH_ROTATABLE_ICON", 1, "superapp_azimuth_rotatable_icon");
        AZIMUTH_ROTATABLE_ICON = mainScreenDivCustomViewTypes2;
        MainScreenDivCustomViewTypes[] mainScreenDivCustomViewTypesArr = {mainScreenDivCustomViewTypes, mainScreenDivCustomViewTypes2};
        $VALUES = mainScreenDivCustomViewTypesArr;
        $ENTRIES = a.a(mainScreenDivCustomViewTypesArr);
    }

    public MainScreenDivCustomViewTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public static MainScreenDivCustomViewTypes valueOf(String str) {
        return (MainScreenDivCustomViewTypes) Enum.valueOf(MainScreenDivCustomViewTypes.class, str);
    }

    public static MainScreenDivCustomViewTypes[] values() {
        return (MainScreenDivCustomViewTypes[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
