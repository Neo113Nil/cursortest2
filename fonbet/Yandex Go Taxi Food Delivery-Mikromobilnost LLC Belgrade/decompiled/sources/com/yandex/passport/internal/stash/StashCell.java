package com.yandex.passport.internal.stash;

import com.yandex.passport.api.KPassportStashCell;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/passport/internal/stash/StashCell;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "isInternal", "Z", "b", "()Z", "Companion", "com/yandex/passport/internal/stash/b", "ALICE_SMART_DEVICES_PIN_CODE", "MARKET_PARTNER_PIN_CODE", "YANGO_PAY_PIN_CODE", "DISK_PIN_CODE", "MAIL_PIN_CODE", "DIRECT_PIN_CODE", "INVEST_PIN_CODE", "BANK_PIN_CODE", "BANK_PIN_CODE_V2", "GIMAP_TRACK", "MAILISH_SOCIAL_CODE", "UPGRADE_STATUS", "UPGRADE_POSTPONED_AT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StashCell {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StashCell[] $VALUES;
    public static final StashCell ALICE_SMART_DEVICES_PIN_CODE;
    public static final StashCell BANK_PIN_CODE;
    public static final StashCell BANK_PIN_CODE_V2;
    public static final b Companion;
    public static final StashCell DIRECT_PIN_CODE;
    public static final StashCell DISK_PIN_CODE;
    public static final StashCell GIMAP_TRACK;
    public static final StashCell INVEST_PIN_CODE;
    public static final StashCell MAILISH_SOCIAL_CODE;
    public static final StashCell MAIL_PIN_CODE;
    public static final StashCell MARKET_PARTNER_PIN_CODE;
    public static final StashCell UPGRADE_POSTPONED_AT;
    public static final StashCell UPGRADE_STATUS;
    public static final StashCell YANGO_PAY_PIN_CODE;
    private final boolean isInternal;
    private final String value;

    static {
        StashCell stashCell = new StashCell("ALICE_SMART_DEVICES_PIN_CODE", 0, KPassportStashCell.ALICE_SMART_DEVICES_PIN_CODE);
        ALICE_SMART_DEVICES_PIN_CODE = stashCell;
        StashCell stashCell2 = new StashCell("MARKET_PARTNER_PIN_CODE", 1, KPassportStashCell.MARKET_PARTNER_PIN_CODE);
        MARKET_PARTNER_PIN_CODE = stashCell2;
        StashCell stashCell3 = new StashCell("YANGO_PAY_PIN_CODE", 2, KPassportStashCell.YANGO_PAY_PIN_CODE);
        YANGO_PAY_PIN_CODE = stashCell3;
        StashCell stashCell4 = new StashCell("DISK_PIN_CODE", 3, KPassportStashCell.DISK_PIN_CODE);
        DISK_PIN_CODE = stashCell4;
        StashCell stashCell5 = new StashCell("MAIL_PIN_CODE", 4, KPassportStashCell.MAIL_PIN_CODE);
        MAIL_PIN_CODE = stashCell5;
        StashCell stashCell6 = new StashCell("DIRECT_PIN_CODE", 5, KPassportStashCell.DIRECT_PIN_CODE);
        DIRECT_PIN_CODE = stashCell6;
        StashCell stashCell7 = new StashCell("INVEST_PIN_CODE", 6, KPassportStashCell.INVEST_PIN_CODE);
        INVEST_PIN_CODE = stashCell7;
        StashCell stashCell8 = new StashCell("BANK_PIN_CODE", 7, KPassportStashCell.BANK_PIN_CODE);
        BANK_PIN_CODE = stashCell8;
        StashCell stashCell9 = new StashCell("BANK_PIN_CODE_V2", 8, KPassportStashCell.BANK_PIN_CODE_V2);
        BANK_PIN_CODE_V2 = stashCell9;
        StashCell stashCell10 = new StashCell("GIMAP_TRACK", 9, KPassportStashCell.GIMAP_TRACK);
        GIMAP_TRACK = stashCell10;
        StashCell stashCell11 = new StashCell("MAILISH_SOCIAL_CODE", 10, KPassportStashCell.MAILISH_SOCIAL_CODE);
        MAILISH_SOCIAL_CODE = stashCell11;
        StashCell stashCell12 = new StashCell("UPGRADE_STATUS", 11, "upgrade_status", true);
        UPGRADE_STATUS = stashCell12;
        StashCell stashCell13 = new StashCell("UPGRADE_POSTPONED_AT", 12, "upgrade_postponed_at", true);
        UPGRADE_POSTPONED_AT = stashCell13;
        StashCell[] stashCellArr = {stashCell, stashCell2, stashCell3, stashCell4, stashCell5, stashCell6, stashCell7, stashCell8, stashCell9, stashCell10, stashCell11, stashCell12, stashCell13};
        $VALUES = stashCellArr;
        $ENTRIES = kotlin.enums.a.a(stashCellArr);
        Companion = new b();
    }

    public StashCell(String str, int i, KPassportStashCell kPassportStashCell) {
        this(str, i, kPassportStashCell.getValue(), false);
    }

    public static StashCell valueOf(String str) {
        return (StashCell) Enum.valueOf(StashCell.class, str);
    }

    public static StashCell[] values() {
        return (StashCell[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsInternal() {
        return this.isInternal;
    }

    public StashCell(String str, int i, String str2, boolean z) {
        this.value = str2;
        this.isInternal = z;
    }
}
