package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract;

import defpackage.b0h0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/contract/CardNetwork;", "", "", "stringCode", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "lowercaseName", "getLowercaseName", "", "logoImageRes", CA20Status.STATUS_USER_I, "getLogoImageRes", "()I", "AMERICANEXPRESS", "AMEX", "ARCA", "BELKART", "DINACARD", "DISCOVER", "ELCART", "HUMOCARD", "JCB", "MAESTRO", "MASTERCARD", "MIR", "RUPAY", "TROY", "UATP", "UNIONPAY", "UNKNOWN", "UZCARD", "VISA", "VISAELECTRON", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardNetwork {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardNetwork[] $VALUES;
    public static final CardNetwork AMERICANEXPRESS;
    public static final CardNetwork AMEX;
    public static final CardNetwork ARCA;
    public static final CardNetwork BELKART;
    public static final CardNetwork DINACARD;
    public static final CardNetwork DISCOVER;
    public static final CardNetwork ELCART;
    public static final CardNetwork HUMOCARD;
    public static final CardNetwork JCB;
    public static final CardNetwork MAESTRO;
    public static final CardNetwork MASTERCARD;
    public static final CardNetwork MIR;
    public static final CardNetwork RUPAY;
    public static final CardNetwork TROY;
    public static final CardNetwork UATP;
    public static final CardNetwork UNIONPAY;
    public static final CardNetwork UNKNOWN;
    public static final CardNetwork UZCARD;
    public static final CardNetwork VISA;
    public static final CardNetwork VISAELECTRON;
    private final int logoImageRes;
    private final String lowercaseName;
    private final String stringCode;

    static {
        int i = b0h0.finsdk_ic_card_network_amex;
        CardNetwork cardNetwork = new CardNetwork(0, i, "AMERICANEXPRESS", "AMERICANEXPRESS", "AmericanExpress");
        AMERICANEXPRESS = cardNetwork;
        CardNetwork cardNetwork2 = new CardNetwork(1, i, "AMEX", "AMEX", "Amex");
        AMEX = cardNetwork2;
        int i2 = b0h0.finsdk_ic_card_network_unknown;
        CardNetwork cardNetwork3 = new CardNetwork(2, i2, "ARCA", "ARCA", "ArCa");
        ARCA = cardNetwork3;
        CardNetwork cardNetwork4 = new CardNetwork(3, i2, "BELKART", "BELKART", "Белкарт");
        BELKART = cardNetwork4;
        CardNetwork cardNetwork5 = new CardNetwork(4, i2, "DINACARD", "DINACARD", "DinaCard");
        DINACARD = cardNetwork5;
        CardNetwork cardNetwork6 = new CardNetwork(5, b0h0.finsdk_ic_card_network_discover, "DISCOVER", "DISCOVER", "Discover");
        DISCOVER = cardNetwork6;
        CardNetwork cardNetwork7 = new CardNetwork(6, i2, "ELCART", "ELCART", "Elcart");
        ELCART = cardNetwork7;
        CardNetwork cardNetwork8 = new CardNetwork(7, b0h0.finsdk_ic_card_network_humocard, "HUMOCARD", "HUMOCARD", "Humocard");
        HUMOCARD = cardNetwork8;
        CardNetwork cardNetwork9 = new CardNetwork(8, b0h0.finsdk_ic_card_network_jcb, "JCB", "JCB", "JCB");
        JCB = cardNetwork9;
        CardNetwork cardNetwork10 = new CardNetwork(9, b0h0.finsdk_ic_card_network_maestro, "MAESTRO", "MAESTRO", "Maestro");
        MAESTRO = cardNetwork10;
        CardNetwork cardNetwork11 = new CardNetwork(10, b0h0.finsdk_ic_card_network_mastercard, "MASTERCARD", "MASTERCARD", "Mastercard");
        MASTERCARD = cardNetwork11;
        CardNetwork cardNetwork12 = new CardNetwork(11, i2, "MIR", "MIR", "");
        MIR = cardNetwork12;
        CardNetwork cardNetwork13 = new CardNetwork(12, i2, "RUPAY", "RUPAY", "RuPay");
        RUPAY = cardNetwork13;
        CardNetwork cardNetwork14 = new CardNetwork(13, i2, "TROY", "TROY", "Troy");
        TROY = cardNetwork14;
        CardNetwork cardNetwork15 = new CardNetwork(14, i2, "UATP", "UATP", "UATP");
        UATP = cardNetwork15;
        CardNetwork cardNetwork16 = new CardNetwork(15, b0h0.finsdk_ic_card_network_unionpay, "UNIONPAY", "UNIONPAY", "UnionPay");
        UNIONPAY = cardNetwork16;
        CardNetwork cardNetwork17 = new CardNetwork(16, i2, "UNKNOWN", "UNKNOWN", "Unknown");
        UNKNOWN = cardNetwork17;
        CardNetwork cardNetwork18 = new CardNetwork(17, b0h0.finsdk_ic_card_network_uzcard, "UZCARD", "UZCARD", "Uzcard");
        UZCARD = cardNetwork18;
        CardNetwork cardNetwork19 = new CardNetwork(18, b0h0.finsdk_ic_card_network_visa, "VISA", "VISA", "Visa");
        VISA = cardNetwork19;
        CardNetwork cardNetwork20 = new CardNetwork(19, b0h0.finsdk_ic_card_network_visa_electron, "VISAELECTRON", "VISAELECTRON", "Visa Electron");
        VISAELECTRON = cardNetwork20;
        CardNetwork[] cardNetworkArr = {cardNetwork, cardNetwork2, cardNetwork3, cardNetwork4, cardNetwork5, cardNetwork6, cardNetwork7, cardNetwork8, cardNetwork9, cardNetwork10, cardNetwork11, cardNetwork12, cardNetwork13, cardNetwork14, cardNetwork15, cardNetwork16, cardNetwork17, cardNetwork18, cardNetwork19, cardNetwork20};
        $VALUES = cardNetworkArr;
        $ENTRIES = a.a(cardNetworkArr);
    }

    public CardNetwork(int i, int i2, String str, String str2, String str3) {
        this.stringCode = str2;
        this.lowercaseName = str3;
        this.logoImageRes = i2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static CardNetwork valueOf(String str) {
        return (CardNetwork) Enum.valueOf(CardNetwork.class, str);
    }

    public static CardNetwork[] values() {
        return (CardNetwork[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getStringCode() {
        return this.stringCode;
    }
}
