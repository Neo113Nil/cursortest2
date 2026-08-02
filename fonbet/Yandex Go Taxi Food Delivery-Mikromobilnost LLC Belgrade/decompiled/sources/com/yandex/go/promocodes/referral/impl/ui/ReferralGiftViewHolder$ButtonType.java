package com.yandex.go.promocodes.referral.impl.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/promocodes/referral/impl/ui/ReferralGiftViewHolder$ButtonType", "", "Lcom/yandex/go/promocodes/referral/impl/ui/ReferralGiftViewHolder$ButtonType;", "MAIN_PARENT_ROOT", "MAIN_MODAL_VIEW", "SUMMARY", "POINT_A", "POINT_B", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReferralGiftViewHolder$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReferralGiftViewHolder$ButtonType[] $VALUES;
    public static final ReferralGiftViewHolder$ButtonType MAIN_MODAL_VIEW;
    public static final ReferralGiftViewHolder$ButtonType MAIN_PARENT_ROOT;
    public static final ReferralGiftViewHolder$ButtonType POINT_A;
    public static final ReferralGiftViewHolder$ButtonType POINT_B;
    public static final ReferralGiftViewHolder$ButtonType SUMMARY;

    static {
        ReferralGiftViewHolder$ButtonType referralGiftViewHolder$ButtonType = new ReferralGiftViewHolder$ButtonType("MAIN_PARENT_ROOT", 0);
        MAIN_PARENT_ROOT = referralGiftViewHolder$ButtonType;
        ReferralGiftViewHolder$ButtonType referralGiftViewHolder$ButtonType2 = new ReferralGiftViewHolder$ButtonType("MAIN_MODAL_VIEW", 1);
        MAIN_MODAL_VIEW = referralGiftViewHolder$ButtonType2;
        ReferralGiftViewHolder$ButtonType referralGiftViewHolder$ButtonType3 = new ReferralGiftViewHolder$ButtonType("SUMMARY", 2);
        SUMMARY = referralGiftViewHolder$ButtonType3;
        ReferralGiftViewHolder$ButtonType referralGiftViewHolder$ButtonType4 = new ReferralGiftViewHolder$ButtonType("POINT_A", 3);
        POINT_A = referralGiftViewHolder$ButtonType4;
        ReferralGiftViewHolder$ButtonType referralGiftViewHolder$ButtonType5 = new ReferralGiftViewHolder$ButtonType("POINT_B", 4);
        POINT_B = referralGiftViewHolder$ButtonType5;
        ReferralGiftViewHolder$ButtonType[] referralGiftViewHolder$ButtonTypeArr = {referralGiftViewHolder$ButtonType, referralGiftViewHolder$ButtonType2, referralGiftViewHolder$ButtonType3, referralGiftViewHolder$ButtonType4, referralGiftViewHolder$ButtonType5};
        $VALUES = referralGiftViewHolder$ButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(referralGiftViewHolder$ButtonTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ReferralGiftViewHolder$ButtonType valueOf(String str) {
        return (ReferralGiftViewHolder$ButtonType) Enum.valueOf(ReferralGiftViewHolder$ButtonType.class, str);
    }

    public static ReferralGiftViewHolder$ButtonType[] values() {
        return (ReferralGiftViewHolder$ButtonType[]) $VALUES.clone();
    }
}
