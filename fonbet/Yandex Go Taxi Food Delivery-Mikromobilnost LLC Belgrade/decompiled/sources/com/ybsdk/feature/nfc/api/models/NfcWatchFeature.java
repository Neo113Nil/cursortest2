package com.ybsdk.feature.nfc.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcWatchFeature;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "HW_ENGINE", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcWatchFeature {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcWatchFeature[] $VALUES;
    public static final NfcWatchFeature NONE = new NfcWatchFeature(JCP.RAW_PREFIX, 0);
    public static final NfcWatchFeature HW_ENGINE = new NfcWatchFeature("HW_ENGINE", 1);

    private static final /* synthetic */ NfcWatchFeature[] $values() {
        return new NfcWatchFeature[]{NONE, HW_ENGINE};
    }

    static {
        NfcWatchFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcWatchFeature(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcWatchFeature valueOf(String str) {
        return (NfcWatchFeature) Enum.valueOf(NfcWatchFeature.class, str);
    }

    public static NfcWatchFeature[] values() {
        return (NfcWatchFeature[]) $VALUES.clone();
    }
}
