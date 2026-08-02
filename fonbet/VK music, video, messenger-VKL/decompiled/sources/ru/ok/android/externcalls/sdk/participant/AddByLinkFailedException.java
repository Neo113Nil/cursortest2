package ru.ok.android.externcalls.sdk.participant;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: AddByLinkFailedException.kt */
/* loaded from: classes9.dex */
public final class AddByLinkFailedException extends RuntimeException {
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddByLinkFailedException.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason LINK_OUTDATED = new Reason("LINK_OUTDATED", 0);
        public static final Reason WRONG_SIGNATURE = new Reason("WRONG_SIGNATURE", 1);
        public static final Reason MALFORMED_QR_URL = new Reason("MALFORMED_QR_URL", 2);
        public static final Reason QR_WRONG_PREFIX = new Reason("QR_WRONG_PREFIX", 3);
        public static final Reason QR_NO_USER_ID_PARAMETER = new Reason("QR_NO_USER_ID_PARAMETER", 4);
        public static final Reason QR_GENERAL_ERROR = new Reason("QR_GENERAL_ERROR", 5);
        public static final Reason UNKNOWN = new Reason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{LINK_OUTDATED, WRONG_SIGNATURE, MALFORMED_QR_URL, QR_WRONG_PREFIX, QR_NO_USER_ID_PARAMETER, QR_GENERAL_ERROR, UNKNOWN};
        }

        static {
            Reason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private Reason(String str, int i) {
        }

        public static zrp<Reason> getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public AddByLinkFailedException(String str, Reason reason) {
        super(str);
        this.reason = reason;
    }

    public final Reason getReason() {
        return this.reason;
    }
}
