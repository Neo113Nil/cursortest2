package com.yandex.go.scooters.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersComeFrom;", "", "QR", "ANOTHER", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersComeFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersComeFrom[] $VALUES;
    public static final ScootersComeFrom ANOTHER;
    public static final ScootersComeFrom QR;

    static {
        ScootersComeFrom scootersComeFrom = new ScootersComeFrom("QR", 0);
        QR = scootersComeFrom;
        ScootersComeFrom scootersComeFrom2 = new ScootersComeFrom("ANOTHER", 1);
        ANOTHER = scootersComeFrom2;
        ScootersComeFrom[] scootersComeFromArr = {scootersComeFrom, scootersComeFrom2};
        $VALUES = scootersComeFromArr;
        $ENTRIES = a.a(scootersComeFromArr);
    }

    public static ScootersComeFrom valueOf(String str) {
        return (ScootersComeFrom) Enum.valueOf(ScootersComeFrom.class, str);
    }

    public static ScootersComeFrom[] values() {
        return (ScootersComeFrom[]) $VALUES.clone();
    }
}
