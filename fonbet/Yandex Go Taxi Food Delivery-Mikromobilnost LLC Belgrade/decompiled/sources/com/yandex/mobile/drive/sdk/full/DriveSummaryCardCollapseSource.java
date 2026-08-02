package com.yandex.mobile.drive.sdk.full;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardCollapseSource;", "", "", "raw", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Gesture", "BackButton", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveSummaryCardCollapseSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriveSummaryCardCollapseSource[] $VALUES;
    public static final DriveSummaryCardCollapseSource BackButton;
    public static final DriveSummaryCardCollapseSource Gesture;
    private final String raw;

    static {
        DriveSummaryCardCollapseSource driveSummaryCardCollapseSource = new DriveSummaryCardCollapseSource("Gesture", 0, "gesture");
        Gesture = driveSummaryCardCollapseSource;
        DriveSummaryCardCollapseSource driveSummaryCardCollapseSource2 = new DriveSummaryCardCollapseSource("BackButton", 1, "back_button");
        BackButton = driveSummaryCardCollapseSource2;
        DriveSummaryCardCollapseSource[] driveSummaryCardCollapseSourceArr = {driveSummaryCardCollapseSource, driveSummaryCardCollapseSource2};
        $VALUES = driveSummaryCardCollapseSourceArr;
        $ENTRIES = a.a(driveSummaryCardCollapseSourceArr);
    }

    public DriveSummaryCardCollapseSource(String str, int i, String str2) {
        this.raw = str2;
    }

    public static DriveSummaryCardCollapseSource valueOf(String str) {
        return (DriveSummaryCardCollapseSource) Enum.valueOf(DriveSummaryCardCollapseSource.class, str);
    }

    public static DriveSummaryCardCollapseSource[] values() {
        return (DriveSummaryCardCollapseSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }
}
