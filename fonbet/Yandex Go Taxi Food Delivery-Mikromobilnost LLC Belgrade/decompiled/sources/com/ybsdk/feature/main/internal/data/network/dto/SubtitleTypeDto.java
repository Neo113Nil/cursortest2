package com.ybsdk.feature.main.internal.data.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SubtitleTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "DEFAULT", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubtitleTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubtitleTypeDto[] $VALUES;
    public static final SubtitleTypeDto ULTRA = new SubtitleTypeDto("ULTRA", 0);
    public static final SubtitleTypeDto DEFAULT = new SubtitleTypeDto("DEFAULT", 1);

    private static final /* synthetic */ SubtitleTypeDto[] $values() {
        return new SubtitleTypeDto[]{ULTRA, DEFAULT};
    }

    static {
        SubtitleTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SubtitleTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SubtitleTypeDto valueOf(String str) {
        return (SubtitleTypeDto) Enum.valueOf(SubtitleTypeDto.class, str);
    }

    public static SubtitleTypeDto[] values() {
        return (SubtitleTypeDto[]) $VALUES.clone();
    }
}
