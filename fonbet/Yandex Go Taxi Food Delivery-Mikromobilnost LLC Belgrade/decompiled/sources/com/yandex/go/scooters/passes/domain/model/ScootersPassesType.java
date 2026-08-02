package com.yandex.go.scooters.passes.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/passes/domain/model/ScootersPassesType;", "", "PACKAGES", "SUPER_PASSES", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesType[] $VALUES;
    public static final ScootersPassesType PACKAGES;
    public static final ScootersPassesType SUPER_PASSES;

    static {
        ScootersPassesType scootersPassesType = new ScootersPassesType("PACKAGES", 0);
        PACKAGES = scootersPassesType;
        ScootersPassesType scootersPassesType2 = new ScootersPassesType("SUPER_PASSES", 1);
        SUPER_PASSES = scootersPassesType2;
        ScootersPassesType[] scootersPassesTypeArr = {scootersPassesType, scootersPassesType2};
        $VALUES = scootersPassesTypeArr;
        $ENTRIES = a.a(scootersPassesTypeArr);
    }

    public static ScootersPassesType valueOf(String str) {
        return (ScootersPassesType) Enum.valueOf(ScootersPassesType.class, str);
    }

    public static ScootersPassesType[] values() {
        return (ScootersPassesType[]) $VALUES.clone();
    }
}
