package com.ybsdk.feature.transfer.version2.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$Request", "", "Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$Request;", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "CONFIRM_TRANSFER", "CONFIRM_ME2ME_DEBIT", "CONFIRM_ME2ME_AUTO_PULL", "CONFIRM_FPS_PAY", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferTwoFactorScreenProvider$Request {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferTwoFactorScreenProvider$Request[] $VALUES;
    private final String key;
    public static final TransferTwoFactorScreenProvider$Request CONFIRM_TRANSFER = new TransferTwoFactorScreenProvider$Request("CONFIRM_TRANSFER", 0, "CONFIRM_TRANSFER_REQUEST_KEY");
    public static final TransferTwoFactorScreenProvider$Request CONFIRM_ME2ME_DEBIT = new TransferTwoFactorScreenProvider$Request("CONFIRM_ME2ME_DEBIT", 1, "CONFIRM_ME2ME_DEBIT_REQUEST_KEY");
    public static final TransferTwoFactorScreenProvider$Request CONFIRM_ME2ME_AUTO_PULL = new TransferTwoFactorScreenProvider$Request("CONFIRM_ME2ME_AUTO_PULL", 2, "CONFIRM_ME2ME_AUTO_PULL");
    public static final TransferTwoFactorScreenProvider$Request CONFIRM_FPS_PAY = new TransferTwoFactorScreenProvider$Request("CONFIRM_FPS_PAY", 3, "CONFIRM_FPS_PAY_REQUEST_KEY");

    private static final /* synthetic */ TransferTwoFactorScreenProvider$Request[] $values() {
        return new TransferTwoFactorScreenProvider$Request[]{CONFIRM_TRANSFER, CONFIRM_ME2ME_DEBIT, CONFIRM_ME2ME_AUTO_PULL, CONFIRM_FPS_PAY};
    }

    static {
        TransferTwoFactorScreenProvider$Request[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferTwoFactorScreenProvider$Request(String str, int i, String str2) {
        this.key = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferTwoFactorScreenProvider$Request valueOf(String str) {
        return (TransferTwoFactorScreenProvider$Request) Enum.valueOf(TransferTwoFactorScreenProvider$Request.class, str);
    }

    public static TransferTwoFactorScreenProvider$Request[] values() {
        return (TransferTwoFactorScreenProvider$Request[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
