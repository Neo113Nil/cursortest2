package com.yandex.go.tariffcard.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/tariffcard/ui/SectionSeparator$AnimationType", "", "Lcom/yandex/go/tariffcard/ui/SectionSeparator$AnimationType;", "DEFAULT", "STANDARD_HEADER", "ULTIMA_HEADER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SectionSeparator$AnimationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionSeparator$AnimationType[] $VALUES;
    public static final SectionSeparator$AnimationType DEFAULT;
    public static final SectionSeparator$AnimationType STANDARD_HEADER;
    public static final SectionSeparator$AnimationType ULTIMA_HEADER;

    static {
        SectionSeparator$AnimationType sectionSeparator$AnimationType = new SectionSeparator$AnimationType("DEFAULT", 0);
        DEFAULT = sectionSeparator$AnimationType;
        SectionSeparator$AnimationType sectionSeparator$AnimationType2 = new SectionSeparator$AnimationType("STANDARD_HEADER", 1);
        STANDARD_HEADER = sectionSeparator$AnimationType2;
        SectionSeparator$AnimationType sectionSeparator$AnimationType3 = new SectionSeparator$AnimationType("ULTIMA_HEADER", 2);
        ULTIMA_HEADER = sectionSeparator$AnimationType3;
        SectionSeparator$AnimationType[] sectionSeparator$AnimationTypeArr = {sectionSeparator$AnimationType, sectionSeparator$AnimationType2, sectionSeparator$AnimationType3};
        $VALUES = sectionSeparator$AnimationTypeArr;
        $ENTRIES = kotlin.enums.a.a(sectionSeparator$AnimationTypeArr);
    }

    public static SectionSeparator$AnimationType valueOf(String str) {
        return (SectionSeparator$AnimationType) Enum.valueOf(SectionSeparator$AnimationType.class, str);
    }

    public static SectionSeparator$AnimationType[] values() {
        return (SectionSeparator$AnimationType[]) $VALUES.clone();
    }
}
