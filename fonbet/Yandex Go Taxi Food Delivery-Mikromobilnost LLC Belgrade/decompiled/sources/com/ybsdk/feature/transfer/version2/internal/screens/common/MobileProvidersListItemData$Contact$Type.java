package com.ybsdk.feature.transfer.version2.internal.screens.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/common/MobileProvidersListItemData$Contact$Type", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/common/MobileProvidersListItemData$Contact$Type;", "<init>", "(Ljava/lang/String;I)V", "CLIPBOARD", "MYSELF", "CONTACT_LIST", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobileProvidersListItemData$Contact$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobileProvidersListItemData$Contact$Type[] $VALUES;
    public static final MobileProvidersListItemData$Contact$Type CLIPBOARD = new MobileProvidersListItemData$Contact$Type("CLIPBOARD", 0);
    public static final MobileProvidersListItemData$Contact$Type MYSELF = new MobileProvidersListItemData$Contact$Type("MYSELF", 1);
    public static final MobileProvidersListItemData$Contact$Type CONTACT_LIST = new MobileProvidersListItemData$Contact$Type("CONTACT_LIST", 2);

    private static final /* synthetic */ MobileProvidersListItemData$Contact$Type[] $values() {
        return new MobileProvidersListItemData$Contact$Type[]{CLIPBOARD, MYSELF, CONTACT_LIST};
    }

    static {
        MobileProvidersListItemData$Contact$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MobileProvidersListItemData$Contact$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MobileProvidersListItemData$Contact$Type valueOf(String str) {
        return (MobileProvidersListItemData$Contact$Type) Enum.valueOf(MobileProvidersListItemData$Contact$Type.class, str);
    }

    public static MobileProvidersListItemData$Contact$Type[] values() {
        return (MobileProvidersListItemData$Contact$Type[]) $VALUES.clone();
    }
}
