package com.ybsdk.feature.transfer.version2.api;

import defpackage.bt01;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "bt01", "SCENARIO", "ACTION_BUTTONS", "PILL", "SUGGESTS", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferSkeletonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferSkeletonType[] $VALUES;
    public static final bt01 Companion;
    public static final TransferSkeletonType SCENARIO = new TransferSkeletonType("SCENARIO", 0);
    public static final TransferSkeletonType ACTION_BUTTONS = new TransferSkeletonType("ACTION_BUTTONS", 1);
    public static final TransferSkeletonType PILL = new TransferSkeletonType("PILL", 2);
    public static final TransferSkeletonType SUGGESTS = new TransferSkeletonType("SUGGESTS", 3);

    private static final /* synthetic */ TransferSkeletonType[] $values() {
        return new TransferSkeletonType[]{SCENARIO, ACTION_BUTTONS, PILL, SUGGESTS};
    }

    static {
        TransferSkeletonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new bt01();
    }

    private TransferSkeletonType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferSkeletonType valueOf(String str) {
        return (TransferSkeletonType) Enum.valueOf(TransferSkeletonType.class, str);
    }

    public static TransferSkeletonType[] values() {
        return (TransferSkeletonType[]) $VALUES.clone();
    }
}
