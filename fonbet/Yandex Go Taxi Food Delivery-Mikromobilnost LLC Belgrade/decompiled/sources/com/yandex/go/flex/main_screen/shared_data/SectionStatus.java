package com.yandex.go.flex.main_screen.shared_data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/SectionStatus;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ADDED", "REMOVED", "MODIFIED", "UNMODIFIED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SectionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionStatus[] $VALUES;
    public static final SectionStatus ADDED;
    public static final SectionStatus MODIFIED;
    public static final SectionStatus REMOVED;
    public static final SectionStatus UNMODIFIED;
    private final String rawValue;

    static {
        SectionStatus sectionStatus = new SectionStatus("ADDED", 0, "added");
        ADDED = sectionStatus;
        SectionStatus sectionStatus2 = new SectionStatus("REMOVED", 1, "removed");
        REMOVED = sectionStatus2;
        SectionStatus sectionStatus3 = new SectionStatus("MODIFIED", 2, "modified");
        MODIFIED = sectionStatus3;
        SectionStatus sectionStatus4 = new SectionStatus("UNMODIFIED", 3, "unmodified");
        UNMODIFIED = sectionStatus4;
        SectionStatus[] sectionStatusArr = {sectionStatus, sectionStatus2, sectionStatus3, sectionStatus4};
        $VALUES = sectionStatusArr;
        $ENTRIES = kotlin.enums.a.a(sectionStatusArr);
    }

    public SectionStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SectionStatus valueOf(String str) {
        return (SectionStatus) Enum.valueOf(SectionStatus.class, str);
    }

    public static SectionStatus[] values() {
        return (SectionStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
