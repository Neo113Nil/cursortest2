package ru.mail.libverify.api.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.mail.libverify.q0.b;
import ru.mail.verify.core.utils.Gsonable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class CodeDeliveryStatus implements Gsonable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CodeDeliveryStatus[] $VALUES;

    @b("DELIVERED")
    public static final CodeDeliveryStatus DELIVERED;

    @b("UNDELIVERABLE")
    public static final CodeDeliveryStatus NOT_DELIVERED;
    public static final CodeDeliveryStatus UNKNOWN;

    static {
        CodeDeliveryStatus codeDeliveryStatus = new CodeDeliveryStatus("DELIVERED", 0);
        DELIVERED = codeDeliveryStatus;
        CodeDeliveryStatus codeDeliveryStatus2 = new CodeDeliveryStatus("NOT_DELIVERED", 1);
        NOT_DELIVERED = codeDeliveryStatus2;
        CodeDeliveryStatus codeDeliveryStatus3 = new CodeDeliveryStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = codeDeliveryStatus3;
        CodeDeliveryStatus[] codeDeliveryStatusArr = {codeDeliveryStatus, codeDeliveryStatus2, codeDeliveryStatus3};
        $VALUES = codeDeliveryStatusArr;
        $ENTRIES = new asp(codeDeliveryStatusArr);
    }

    private CodeDeliveryStatus(String str, int i) {
    }

    public static zrp<CodeDeliveryStatus> getEntries() {
        return $ENTRIES;
    }

    public static CodeDeliveryStatus valueOf(String str) {
        return (CodeDeliveryStatus) Enum.valueOf(CodeDeliveryStatus.class, str);
    }

    public static CodeDeliveryStatus[] values() {
        return (CodeDeliveryStatus[]) $VALUES.clone();
    }
}
