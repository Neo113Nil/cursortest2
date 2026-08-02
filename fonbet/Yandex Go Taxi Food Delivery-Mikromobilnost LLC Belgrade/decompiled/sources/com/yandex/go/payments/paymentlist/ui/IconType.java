package com.yandex.go.payments.paymentlist.ui;

import defpackage.k4o;
import defpackage.x2h0;
import defpackage.y2h0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b.\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lcom/yandex/go/payments/paymentlist/ui/IconType;", "", "", "resourceId", CA20Status.STATUS_USER_I, "a", "()I", "VISA", "MASTERCARD", "MAESTRO", "MIR", "ELCART", "BELKART", "MAAL", "DISCOVER", "AMERICAN_EXPRESS", "JCB", "DINERS", "UNIONPAY", "DINACARD", "HUMO", "TROY", "UZCARD", "GENERIC_CARD", "CASH", "CASH_LIKE", "FASTSHIFT_ACCOUNT", "JAZZCASH_WALLET", "CORP", "CARGO_CORP", "SHARED_FAMILY", "SHARED_BUSINESS", "GOOGLE_PAY", "PERSONAL_WALLET", "PERSONAL_WALLET_NEW", "YANGO_WALLET", "ADD_CARD_V2", "GENERIC_SBP_BANK", "SBP_TOKEN", "MBANK_ACCOUNT", "YAPE_TOKEN", "NEQUI_TOKEN", "SBP_BIND_TOKEN", "KASPI", "TIPS", "TRANSPORT_CARD", "TROYKA_CARD", "TRANSPORT_EXTERNAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;
    public static final IconType ADD_CARD_V2;
    public static final IconType AMERICAN_EXPRESS;
    public static final IconType BELKART;
    public static final IconType CARGO_CORP;
    public static final IconType CASH;
    public static final IconType CASH_LIKE;
    public static final IconType CORP;
    public static final IconType DINACARD;
    public static final IconType DINERS;
    public static final IconType DISCOVER;
    public static final IconType ELCART;
    public static final IconType FASTSHIFT_ACCOUNT;
    public static final IconType GENERIC_CARD;
    public static final IconType GENERIC_SBP_BANK;
    public static final IconType GOOGLE_PAY;
    public static final IconType HUMO;
    public static final IconType JAZZCASH_WALLET;
    public static final IconType JCB;
    public static final IconType KASPI;
    public static final IconType MAAL;
    public static final IconType MAESTRO;
    public static final IconType MASTERCARD;
    public static final IconType MBANK_ACCOUNT;
    public static final IconType MIR;
    public static final IconType NEQUI_TOKEN;
    public static final IconType PERSONAL_WALLET;
    public static final IconType PERSONAL_WALLET_NEW;
    public static final IconType SBP_BIND_TOKEN;
    public static final IconType SBP_TOKEN;
    public static final IconType SHARED_BUSINESS;
    public static final IconType SHARED_FAMILY;
    public static final IconType TIPS;
    public static final IconType TRANSPORT_CARD;
    public static final IconType TRANSPORT_EXTERNAL;
    public static final IconType TROY;
    public static final IconType TROYKA_CARD;
    public static final IconType UNIONPAY;
    public static final IconType UZCARD;
    public static final IconType VISA;
    public static final IconType YANGO_WALLET;
    public static final IconType YAPE_TOKEN;
    private final int resourceId;

    static {
        IconType iconType = new IconType("VISA", 0, y2h0.ic_payment_visa);
        VISA = iconType;
        IconType iconType2 = new IconType("MASTERCARD", 1, y2h0.ic_payment_mastercard);
        MASTERCARD = iconType2;
        IconType iconType3 = new IconType("MAESTRO", 2, y2h0.ic_payment_maestro);
        MAESTRO = iconType3;
        IconType iconType4 = new IconType("MIR", 3, y2h0.ic_payment_mir);
        MIR = iconType4;
        IconType iconType5 = new IconType("ELCART", 4, y2h0.ic_payment_elcart);
        ELCART = iconType5;
        IconType iconType6 = new IconType("BELKART", 5, y2h0.ic_payment_belkart);
        BELKART = iconType6;
        IconType iconType7 = new IconType("MAAL", 6, y2h0.ic_payment_maal);
        MAAL = iconType7;
        IconType iconType8 = new IconType("DISCOVER", 7, y2h0.ic_payment_discover_network);
        DISCOVER = iconType8;
        IconType iconType9 = new IconType("AMERICAN_EXPRESS", 8, y2h0.ic_payment_amer_exp);
        AMERICAN_EXPRESS = iconType9;
        IconType iconType10 = new IconType("JCB", 9, y2h0.ic_payment_jcb);
        JCB = iconType10;
        IconType iconType11 = new IconType("DINERS", 10, y2h0.ic_payment_diners);
        DINERS = iconType11;
        IconType iconType12 = new IconType("UNIONPAY", 11, y2h0.ic_payment_unionpay);
        UNIONPAY = iconType12;
        IconType iconType13 = new IconType("DINACARD", 12, y2h0.ic_payment_dinacard);
        DINACARD = iconType13;
        IconType iconType14 = new IconType("HUMO", 13, y2h0.ic_payment_humo);
        HUMO = iconType14;
        IconType iconType15 = new IconType("TROY", 14, y2h0.ic_payment_troy);
        TROY = iconType15;
        IconType iconType16 = new IconType("UZCARD", 15, y2h0.ic_payment_uzcard);
        UZCARD = iconType16;
        IconType iconType17 = new IconType("GENERIC_CARD", 16, x2h0.ic_payment_undefined);
        GENERIC_CARD = iconType17;
        IconType iconType18 = new IconType("CASH", 17, y2h0.ic_payment_cash);
        CASH = iconType18;
        IconType iconType19 = new IconType("CASH_LIKE", 18, y2h0.ic_payment_cash_like);
        CASH_LIKE = iconType19;
        IconType iconType20 = new IconType("FASTSHIFT_ACCOUNT", 19, y2h0.ic_payment_fastshift_account);
        FASTSHIFT_ACCOUNT = iconType20;
        IconType iconType21 = new IconType("JAZZCASH_WALLET", 20, y2h0.ic_payment_jazzcash_wallet);
        JAZZCASH_WALLET = iconType21;
        int i = y2h0.ic_payment_corp;
        IconType iconType22 = new IconType("CORP", 21, i);
        CORP = iconType22;
        IconType iconType23 = new IconType("CARGO_CORP", 22, y2h0.ic_payment_cargo_corp);
        CARGO_CORP = iconType23;
        IconType iconType24 = new IconType("SHARED_FAMILY", 23, y2h0.ic_payment_shared_family);
        SHARED_FAMILY = iconType24;
        IconType iconType25 = new IconType("SHARED_BUSINESS", 24, i);
        SHARED_BUSINESS = iconType25;
        IconType iconType26 = new IconType("GOOGLE_PAY", 25, y2h0.ic_payment_google_pay);
        GOOGLE_PAY = iconType26;
        IconType iconType27 = new IconType("PERSONAL_WALLET", 26, x2h0.ic_payment_personal_wallet);
        PERSONAL_WALLET = iconType27;
        IconType iconType28 = new IconType("PERSONAL_WALLET_NEW", 27, y2h0.ic_payment_yandex_plus);
        PERSONAL_WALLET_NEW = iconType28;
        IconType iconType29 = new IconType("YANGO_WALLET", 28, y2h0.ic_payment_yango_pay);
        YANGO_WALLET = iconType29;
        int i2 = y2h0.ic_add_card;
        IconType iconType30 = new IconType("ADD_CARD_V2", 29, i2);
        ADD_CARD_V2 = iconType30;
        IconType iconType31 = new IconType("GENERIC_SBP_BANK", 30, y2h0.ic_generic_sbp_bank);
        GENERIC_SBP_BANK = iconType31;
        int i3 = y2h0.ic_payment_sbp_token;
        IconType iconType32 = new IconType("SBP_TOKEN", 31, i3);
        SBP_TOKEN = iconType32;
        IconType iconType33 = new IconType("MBANK_ACCOUNT", 32, y2h0.ic_payment_mbank_account);
        MBANK_ACCOUNT = iconType33;
        IconType iconType34 = new IconType("YAPE_TOKEN", 33, y2h0.ic_payment_yape_token);
        YAPE_TOKEN = iconType34;
        IconType iconType35 = new IconType("NEQUI_TOKEN", 34, y2h0.ic_payment_nequi_token);
        NEQUI_TOKEN = iconType35;
        IconType iconType36 = new IconType("SBP_BIND_TOKEN", 35, i3);
        SBP_BIND_TOKEN = iconType36;
        IconType iconType37 = new IconType("KASPI", 36, y2h0.ic_payment_kaspi);
        KASPI = iconType37;
        IconType iconType38 = new IconType("TIPS", 37, y2h0.ic_payment_tips);
        TIPS = iconType38;
        IconType iconType39 = new IconType("TRANSPORT_CARD", 38, y2h0.ic_payment_transport_card);
        TRANSPORT_CARD = iconType39;
        IconType iconType40 = new IconType("TROYKA_CARD", 39, y2h0.ic_payment_troyka_card);
        TROYKA_CARD = iconType40;
        IconType iconType41 = new IconType("TRANSPORT_EXTERNAL", 40, i2);
        TRANSPORT_EXTERNAL = iconType41;
        IconType[] iconTypeArr = {iconType, iconType2, iconType3, iconType4, iconType5, iconType6, iconType7, iconType8, iconType9, iconType10, iconType11, iconType12, iconType13, iconType14, iconType15, iconType16, iconType17, iconType18, iconType19, iconType20, iconType21, iconType22, iconType23, iconType24, iconType25, iconType26, iconType27, iconType28, iconType29, iconType30, iconType31, iconType32, iconType33, iconType34, iconType35, iconType36, iconType37, iconType38, iconType39, iconType40, iconType41};
        $VALUES = iconTypeArr;
        $ENTRIES = kotlin.enums.a.a(iconTypeArr);
    }

    public IconType(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getResourceId() {
        return this.resourceId;
    }
}
