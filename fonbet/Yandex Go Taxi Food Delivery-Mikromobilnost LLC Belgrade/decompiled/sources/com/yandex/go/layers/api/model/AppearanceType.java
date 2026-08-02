package com.yandex.go.layers.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/layers/api/model/AppearanceType;", "", "NORMAL", "SIMPLIFIED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppearanceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppearanceType[] $VALUES;
    public static final AppearanceType NORMAL;
    public static final AppearanceType SIMPLIFIED;

    static {
        AppearanceType appearanceType = new AppearanceType("NORMAL", 0);
        NORMAL = appearanceType;
        AppearanceType appearanceType2 = new AppearanceType("SIMPLIFIED", 1);
        SIMPLIFIED = appearanceType2;
        AppearanceType[] appearanceTypeArr = {appearanceType, appearanceType2};
        $VALUES = appearanceTypeArr;
        $ENTRIES = a.a(appearanceTypeArr);
    }

    public static AppearanceType valueOf(String str) {
        return (AppearanceType) Enum.valueOf(AppearanceType.class, str);
    }

    public static AppearanceType[] values() {
        return (AppearanceType[]) $VALUES.clone();
    }
}
