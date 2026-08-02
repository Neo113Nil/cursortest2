package com.ybsdk.feature.autotopup.internal.domain.entities.regular;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupStatusEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegularAutotopupStatusEntity[] $VALUES;
    public static final RegularAutotopupStatusEntity ENABLED = new RegularAutotopupStatusEntity("ENABLED", 0);
    public static final RegularAutotopupStatusEntity DISABLED = new RegularAutotopupStatusEntity("DISABLED", 1);

    private static final /* synthetic */ RegularAutotopupStatusEntity[] $values() {
        return new RegularAutotopupStatusEntity[]{ENABLED, DISABLED};
    }

    static {
        RegularAutotopupStatusEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RegularAutotopupStatusEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegularAutotopupStatusEntity valueOf(String str) {
        return (RegularAutotopupStatusEntity) Enum.valueOf(RegularAutotopupStatusEntity.class, str);
    }

    public static RegularAutotopupStatusEntity[] values() {
        return (RegularAutotopupStatusEntity[]) $VALUES.clone();
    }
}
