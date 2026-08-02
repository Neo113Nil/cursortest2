package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/api/KPassportStashCell;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ALICE_SMART_DEVICES_PIN_CODE", "MARKET_PARTNER_PIN_CODE", "YANGO_PAY_PIN_CODE", "DISK_PIN_CODE", "MAIL_PIN_CODE", "DIRECT_PIN_CODE", "INVEST_PIN_CODE", "BANK_PIN_CODE", "BANK_PIN_CODE_V2", "GIMAP_TRACK", "MAILISH_SOCIAL_CODE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class KPassportStashCell {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KPassportStashCell[] $VALUES;
    public static final KPassportStashCell ALICE_SMART_DEVICES_PIN_CODE;
    public static final KPassportStashCell BANK_PIN_CODE;
    public static final KPassportStashCell BANK_PIN_CODE_V2;
    public static final KPassportStashCell DIRECT_PIN_CODE;
    public static final KPassportStashCell DISK_PIN_CODE;
    public static final KPassportStashCell GIMAP_TRACK;
    public static final KPassportStashCell INVEST_PIN_CODE;
    public static final KPassportStashCell MAILISH_SOCIAL_CODE;
    public static final KPassportStashCell MAIL_PIN_CODE;
    public static final KPassportStashCell MARKET_PARTNER_PIN_CODE;
    public static final KPassportStashCell YANGO_PAY_PIN_CODE;
    private final String value;

    static {
        KPassportStashCell kPassportStashCell = new KPassportStashCell("ALICE_SMART_DEVICES_PIN_CODE", 0, "alice_smart_devices_pin_code");
        ALICE_SMART_DEVICES_PIN_CODE = kPassportStashCell;
        KPassportStashCell kPassportStashCell2 = new KPassportStashCell("MARKET_PARTNER_PIN_CODE", 1, "market_partner_pin_code");
        MARKET_PARTNER_PIN_CODE = kPassportStashCell2;
        KPassportStashCell kPassportStashCell3 = new KPassportStashCell("YANGO_PAY_PIN_CODE", 2, "yango_pay_pin_code");
        YANGO_PAY_PIN_CODE = kPassportStashCell3;
        KPassportStashCell kPassportStashCell4 = new KPassportStashCell("DISK_PIN_CODE", 3, "disk_pin_code");
        DISK_PIN_CODE = kPassportStashCell4;
        KPassportStashCell kPassportStashCell5 = new KPassportStashCell("MAIL_PIN_CODE", 4, "mail_pin_code");
        MAIL_PIN_CODE = kPassportStashCell5;
        KPassportStashCell kPassportStashCell6 = new KPassportStashCell("DIRECT_PIN_CODE", 5, "direct_pin_code");
        DIRECT_PIN_CODE = kPassportStashCell6;
        KPassportStashCell kPassportStashCell7 = new KPassportStashCell("INVEST_PIN_CODE", 6, "invest_pin_code");
        INVEST_PIN_CODE = kPassportStashCell7;
        KPassportStashCell kPassportStashCell8 = new KPassportStashCell("BANK_PIN_CODE", 7, "bank_pin_code");
        BANK_PIN_CODE = kPassportStashCell8;
        KPassportStashCell kPassportStashCell9 = new KPassportStashCell("BANK_PIN_CODE_V2", 8, "bank_pin_code_v2");
        BANK_PIN_CODE_V2 = kPassportStashCell9;
        KPassportStashCell kPassportStashCell10 = new KPassportStashCell("GIMAP_TRACK", 9, "generic_imap_settings");
        GIMAP_TRACK = kPassportStashCell10;
        KPassportStashCell kPassportStashCell11 = new KPassportStashCell("MAILISH_SOCIAL_CODE", 10, "mailish_social_code");
        MAILISH_SOCIAL_CODE = kPassportStashCell11;
        KPassportStashCell[] kPassportStashCellArr = {kPassportStashCell, kPassportStashCell2, kPassportStashCell3, kPassportStashCell4, kPassportStashCell5, kPassportStashCell6, kPassportStashCell7, kPassportStashCell8, kPassportStashCell9, kPassportStashCell10, kPassportStashCell11};
        $VALUES = kPassportStashCellArr;
        $ENTRIES = kotlin.enums.a.a(kPassportStashCellArr);
    }

    public KPassportStashCell(String str, int i, String str2) {
        this.value = str2;
    }

    public static KPassportStashCell valueOf(String str) {
        return (KPassportStashCell) Enum.valueOf(KPassportStashCell.class, str);
    }

    public static KPassportStashCell[] values() {
        return (KPassportStashCell[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
