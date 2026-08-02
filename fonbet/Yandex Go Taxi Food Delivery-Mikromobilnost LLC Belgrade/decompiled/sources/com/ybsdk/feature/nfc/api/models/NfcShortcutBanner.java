package com.ybsdk.feature.nfc.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcShortcutBanner;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "SPLIT_SWITCH_BANNER", "SPLIT_SET_AS_DEFAULT", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcShortcutBanner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcShortcutBanner[] $VALUES;
    public static final NfcShortcutBanner DISABLED = new NfcShortcutBanner("DISABLED", 0);
    public static final NfcShortcutBanner SPLIT_SWITCH_BANNER = new NfcShortcutBanner("SPLIT_SWITCH_BANNER", 1);
    public static final NfcShortcutBanner SPLIT_SET_AS_DEFAULT = new NfcShortcutBanner("SPLIT_SET_AS_DEFAULT", 2);

    private static final /* synthetic */ NfcShortcutBanner[] $values() {
        return new NfcShortcutBanner[]{DISABLED, SPLIT_SWITCH_BANNER, SPLIT_SET_AS_DEFAULT};
    }

    static {
        NfcShortcutBanner[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcShortcutBanner(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcShortcutBanner valueOf(String str) {
        return (NfcShortcutBanner) Enum.valueOf(NfcShortcutBanner.class, str);
    }

    public static NfcShortcutBanner[] values() {
        return (NfcShortcutBanner[]) $VALUES.clone();
    }
}
