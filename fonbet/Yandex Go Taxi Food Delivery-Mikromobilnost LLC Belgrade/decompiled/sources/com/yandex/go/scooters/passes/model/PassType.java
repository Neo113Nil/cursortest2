package com.yandex.go.scooters.passes.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/model/PassType;", "", "TARIFF", "PACKAGE", "SUPER_PASS", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassType[] $VALUES;
    public static final PassType PACKAGE;
    public static final PassType SUPER_PASS;
    public static final PassType TARIFF;

    static {
        PassType passType = new PassType("TARIFF", 0);
        TARIFF = passType;
        PassType passType2 = new PassType("PACKAGE", 1);
        PACKAGE = passType2;
        PassType passType3 = new PassType("SUPER_PASS", 2);
        SUPER_PASS = passType3;
        PassType[] passTypeArr = {passType, passType2, passType3};
        $VALUES = passTypeArr;
        $ENTRIES = kotlin.enums.a.a(passTypeArr);
    }

    public static PassType valueOf(String str) {
        return (PassType) Enum.valueOf(PassType.class, str);
    }

    public static PassType[] values() {
        return (PassType[]) $VALUES.clone();
    }
}
