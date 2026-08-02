package com.yandex.go.scooters.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/ScootersPassesListService;", "", "CHARGERS", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesListService {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesListService[] $VALUES;
    public static final ScootersPassesListService CHARGERS;

    static {
        ScootersPassesListService scootersPassesListService = new ScootersPassesListService("CHARGERS", 0);
        CHARGERS = scootersPassesListService;
        ScootersPassesListService[] scootersPassesListServiceArr = {scootersPassesListService};
        $VALUES = scootersPassesListServiceArr;
        $ENTRIES = kotlin.enums.a.a(scootersPassesListServiceArr);
    }

    public static ScootersPassesListService valueOf(String str) {
        return (ScootersPassesListService) Enum.valueOf(ScootersPassesListService.class, str);
    }

    public static ScootersPassesListService[] values() {
        return (ScootersPassesListService[]) $VALUES.clone();
    }
}
