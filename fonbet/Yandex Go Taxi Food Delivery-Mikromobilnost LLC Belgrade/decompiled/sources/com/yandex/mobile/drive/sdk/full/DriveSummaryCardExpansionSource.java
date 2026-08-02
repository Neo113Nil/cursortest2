package com.yandex.mobile.drive.sdk.full;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardExpansionSource;", "", "", "raw", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Gesture", "ContinueButton", "OfferSelection", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveSummaryCardExpansionSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriveSummaryCardExpansionSource[] $VALUES;
    public static final DriveSummaryCardExpansionSource ContinueButton;
    public static final DriveSummaryCardExpansionSource Gesture;
    public static final DriveSummaryCardExpansionSource OfferSelection;
    private final String raw;

    static {
        DriveSummaryCardExpansionSource driveSummaryCardExpansionSource = new DriveSummaryCardExpansionSource("Gesture", 0, "gesture");
        Gesture = driveSummaryCardExpansionSource;
        DriveSummaryCardExpansionSource driveSummaryCardExpansionSource2 = new DriveSummaryCardExpansionSource("ContinueButton", 1, "continue_button");
        ContinueButton = driveSummaryCardExpansionSource2;
        DriveSummaryCardExpansionSource driveSummaryCardExpansionSource3 = new DriveSummaryCardExpansionSource("OfferSelection", 2, "offer_selection");
        OfferSelection = driveSummaryCardExpansionSource3;
        DriveSummaryCardExpansionSource[] driveSummaryCardExpansionSourceArr = {driveSummaryCardExpansionSource, driveSummaryCardExpansionSource2, driveSummaryCardExpansionSource3};
        $VALUES = driveSummaryCardExpansionSourceArr;
        $ENTRIES = a.a(driveSummaryCardExpansionSourceArr);
    }

    public DriveSummaryCardExpansionSource(String str, int i, String str2) {
        this.raw = str2;
    }

    public static DriveSummaryCardExpansionSource valueOf(String str) {
        return (DriveSummaryCardExpansionSource) Enum.valueOf(DriveSummaryCardExpansionSource.class, str);
    }

    public static DriveSummaryCardExpansionSource[] values() {
        return (DriveSummaryCardExpansionSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }
}
