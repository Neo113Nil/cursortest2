package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcFailAction;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "CLOSE", "RETRY", "RESTART", "DEEPLINK", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcFailAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcFailAction[] $VALUES;
    public static final NfcFailAction UNKNOWN = new NfcFailAction("UNKNOWN", 0);
    public static final NfcFailAction CLOSE = new NfcFailAction("CLOSE", 1);
    public static final NfcFailAction RETRY = new NfcFailAction("RETRY", 2);
    public static final NfcFailAction RESTART = new NfcFailAction("RESTART", 3);
    public static final NfcFailAction DEEPLINK = new NfcFailAction("DEEPLINK", 4);

    private static final /* synthetic */ NfcFailAction[] $values() {
        return new NfcFailAction[]{UNKNOWN, CLOSE, RETRY, RESTART, DEEPLINK};
    }

    static {
        NfcFailAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private NfcFailAction(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcFailAction valueOf(String str) {
        return (NfcFailAction) Enum.valueOf(NfcFailAction.class, str);
    }

    public static NfcFailAction[] values() {
        return (NfcFailAction[]) $VALUES.clone();
    }
}
