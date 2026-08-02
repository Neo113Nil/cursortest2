package com.yandex.go.shortcuts.view.adapter.model.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/model/SectionTypedHeaderModel$AppearanceType", "", "Lcom/yandex/go/shortcuts/view/adapter/model/model/SectionTypedHeaderModel$AppearanceType;", "DEFAULT", "ICON_ONLY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SectionTypedHeaderModel$AppearanceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionTypedHeaderModel$AppearanceType[] $VALUES;
    public static final SectionTypedHeaderModel$AppearanceType DEFAULT;
    public static final SectionTypedHeaderModel$AppearanceType ICON_ONLY;

    static {
        SectionTypedHeaderModel$AppearanceType sectionTypedHeaderModel$AppearanceType = new SectionTypedHeaderModel$AppearanceType("DEFAULT", 0);
        DEFAULT = sectionTypedHeaderModel$AppearanceType;
        SectionTypedHeaderModel$AppearanceType sectionTypedHeaderModel$AppearanceType2 = new SectionTypedHeaderModel$AppearanceType("ICON_ONLY", 1);
        ICON_ONLY = sectionTypedHeaderModel$AppearanceType2;
        SectionTypedHeaderModel$AppearanceType[] sectionTypedHeaderModel$AppearanceTypeArr = {sectionTypedHeaderModel$AppearanceType, sectionTypedHeaderModel$AppearanceType2};
        $VALUES = sectionTypedHeaderModel$AppearanceTypeArr;
        $ENTRIES = a.a(sectionTypedHeaderModel$AppearanceTypeArr);
    }

    public static SectionTypedHeaderModel$AppearanceType valueOf(String str) {
        return (SectionTypedHeaderModel$AppearanceType) Enum.valueOf(SectionTypedHeaderModel$AppearanceType.class, str);
    }

    public static SectionTypedHeaderModel$AppearanceType[] values() {
        return (SectionTypedHeaderModel$AppearanceType[]) $VALUES.clone();
    }
}
