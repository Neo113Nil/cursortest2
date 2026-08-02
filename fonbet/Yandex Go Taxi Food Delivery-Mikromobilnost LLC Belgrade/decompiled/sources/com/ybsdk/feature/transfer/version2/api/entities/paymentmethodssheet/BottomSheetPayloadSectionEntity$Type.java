package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/BottomSheetPayloadSectionEntity$Type", "", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/BottomSheetPayloadSectionEntity$Type;", "<init>", "(Ljava/lang/String;I)V", "YANDEX_PRODUCTS", "OTHER_BANKS", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetPayloadSectionEntity$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomSheetPayloadSectionEntity$Type[] $VALUES;
    public static final BottomSheetPayloadSectionEntity$Type YANDEX_PRODUCTS = new BottomSheetPayloadSectionEntity$Type("YANDEX_PRODUCTS", 0);
    public static final BottomSheetPayloadSectionEntity$Type OTHER_BANKS = new BottomSheetPayloadSectionEntity$Type("OTHER_BANKS", 1);

    private static final /* synthetic */ BottomSheetPayloadSectionEntity$Type[] $values() {
        return new BottomSheetPayloadSectionEntity$Type[]{YANDEX_PRODUCTS, OTHER_BANKS};
    }

    static {
        BottomSheetPayloadSectionEntity$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BottomSheetPayloadSectionEntity$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetPayloadSectionEntity$Type valueOf(String str) {
        return (BottomSheetPayloadSectionEntity$Type) Enum.valueOf(BottomSheetPayloadSectionEntity$Type.class, str);
    }

    public static BottomSheetPayloadSectionEntity$Type[] values() {
        return (BottomSheetPayloadSectionEntity$Type[]) $VALUES.clone();
    }
}
