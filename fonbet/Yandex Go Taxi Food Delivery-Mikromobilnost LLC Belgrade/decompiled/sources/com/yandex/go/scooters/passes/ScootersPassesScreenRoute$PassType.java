package com.yandex.go.scooters.passes;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/passes/ScootersPassesScreenRoute$PassType", "", "Lcom/yandex/go/scooters/passes/ScootersPassesScreenRoute$PassType;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SUPERPASSES", "PACKAGES", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesScreenRoute$PassType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesScreenRoute$PassType[] $VALUES;
    public static final ScootersPassesScreenRoute$PassType PACKAGES;
    public static final ScootersPassesScreenRoute$PassType SUPERPASSES;
    private final String value;

    static {
        ScootersPassesScreenRoute$PassType scootersPassesScreenRoute$PassType = new ScootersPassesScreenRoute$PassType("SUPERPASSES", 0, "superpasses");
        SUPERPASSES = scootersPassesScreenRoute$PassType;
        ScootersPassesScreenRoute$PassType scootersPassesScreenRoute$PassType2 = new ScootersPassesScreenRoute$PassType("PACKAGES", 1, "packages");
        PACKAGES = scootersPassesScreenRoute$PassType2;
        ScootersPassesScreenRoute$PassType[] scootersPassesScreenRoute$PassTypeArr = {scootersPassesScreenRoute$PassType, scootersPassesScreenRoute$PassType2};
        $VALUES = scootersPassesScreenRoute$PassTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersPassesScreenRoute$PassTypeArr);
    }

    public ScootersPassesScreenRoute$PassType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ScootersPassesScreenRoute$PassType valueOf(String str) {
        return (ScootersPassesScreenRoute$PassType) Enum.valueOf(ScootersPassesScreenRoute$PassType.class, str);
    }

    public static ScootersPassesScreenRoute$PassType[] values() {
        return (ScootersPassesScreenRoute$PassType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
