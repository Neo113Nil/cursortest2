package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AsyncUpdates {
    private static final /* synthetic */ AsyncUpdates[] $VALUES;
    public static final AsyncUpdates AUTOMATIC;
    public static final AsyncUpdates DISABLED;
    public static final AsyncUpdates ENABLED;

    static {
        AsyncUpdates asyncUpdates = new AsyncUpdates("AUTOMATIC", 0);
        AUTOMATIC = asyncUpdates;
        AsyncUpdates asyncUpdates2 = new AsyncUpdates("ENABLED", 1);
        ENABLED = asyncUpdates2;
        AsyncUpdates asyncUpdates3 = new AsyncUpdates("DISABLED", 2);
        DISABLED = asyncUpdates3;
        $VALUES = new AsyncUpdates[]{asyncUpdates, asyncUpdates2, asyncUpdates3};
    }

    public static AsyncUpdates valueOf(String str) {
        return (AsyncUpdates) Enum.valueOf(AsyncUpdates.class, str);
    }

    public static AsyncUpdates[] values() {
        return (AsyncUpdates[]) $VALUES.clone();
    }
}
