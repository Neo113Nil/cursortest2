package com.ybsdk.feature.kyc.internal.screens.photov3;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/kyc/internal/screens/photov3/PhotoState$Stage$Upload$Status", "", "Lcom/ybsdk/feature/kyc/internal/screens/photov3/PhotoState$Stage$Upload$Status;", "<init>", "(Ljava/lang/String;I)V", Card.ACTIVE, "ACTIVE_TOO_LONG", "ERROR_UPLOAD", "ERROR_GENERAL", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoState$Stage$Upload$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoState$Stage$Upload$Status[] $VALUES;
    public static final PhotoState$Stage$Upload$Status ACTIVE = new PhotoState$Stage$Upload$Status(Card.ACTIVE, 0);
    public static final PhotoState$Stage$Upload$Status ACTIVE_TOO_LONG = new PhotoState$Stage$Upload$Status("ACTIVE_TOO_LONG", 1);
    public static final PhotoState$Stage$Upload$Status ERROR_UPLOAD = new PhotoState$Stage$Upload$Status("ERROR_UPLOAD", 2);
    public static final PhotoState$Stage$Upload$Status ERROR_GENERAL = new PhotoState$Stage$Upload$Status("ERROR_GENERAL", 3);

    private static final /* synthetic */ PhotoState$Stage$Upload$Status[] $values() {
        return new PhotoState$Stage$Upload$Status[]{ACTIVE, ACTIVE_TOO_LONG, ERROR_UPLOAD, ERROR_GENERAL};
    }

    static {
        PhotoState$Stage$Upload$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PhotoState$Stage$Upload$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PhotoState$Stage$Upload$Status valueOf(String str) {
        return (PhotoState$Stage$Upload$Status) Enum.valueOf(PhotoState$Stage$Upload$Status.class, str);
    }

    public static PhotoState$Stage$Upload$Status[] values() {
        return (PhotoState$Stage$Upload$Status[]) $VALUES.clone();
    }
}
