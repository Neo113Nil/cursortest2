package com.yandex.go.payments.cards.nfc.enums;

import defpackage.ddb1;
import defpackage.k4o;
import defpackage.kxw0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/SwEnum;", "", "", ACSPConstants.STATUS, "[B", "", "detail", "Ljava/lang/String;", "Companion", "kxw0", "SW_6C", "SW_9000", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SwEnum[] $VALUES;
    public static final kxw0 Companion;
    public static final SwEnum SW_6C;
    public static final SwEnum SW_9000;
    private final String detail;
    private final byte[] status;

    static {
        SwEnum swEnum = new SwEnum(0, "SW_6C", ddb1.b("6C"), "xx = exact Le");
        SW_6C = swEnum;
        SwEnum swEnum2 = new SwEnum(1, "SW_9000", ddb1.b("9000"), "Command successfully executed (OK)");
        SW_9000 = swEnum2;
        SwEnum[] swEnumArr = {swEnum, swEnum2};
        $VALUES = swEnumArr;
        $ENTRIES = a.a(swEnumArr);
        Companion = new kxw0();
    }

    public SwEnum(int i, String str, byte[] bArr, String str2) {
        this.status = bArr;
        this.detail = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static SwEnum valueOf(String str) {
        return (SwEnum) Enum.valueOf(SwEnum.class, str);
    }

    public static SwEnum[] values() {
        return (SwEnum[]) $VALUES.clone();
    }
}
