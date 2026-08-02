package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkBalanceModel$Currency", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkBalanceModel$Currency;", "USD", "RUB", "UAH", "KZT", "BYR", "BYN", "AZN", "UZS", "MDL", "AMD", "ILS", "GEL", "KGS", "AED", "EUR", "SAR", "OMR", "KWD", "BHD", "QAR", "EGP", "TRY", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkBalanceModel$Currency {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkBalanceModel$Currency[] $VALUES;
    public static final NetworkBalanceModel$Currency AED;
    public static final NetworkBalanceModel$Currency AMD;
    public static final NetworkBalanceModel$Currency AZN;
    public static final NetworkBalanceModel$Currency BHD;
    public static final NetworkBalanceModel$Currency BYN;
    public static final NetworkBalanceModel$Currency BYR;
    public static final NetworkBalanceModel$Currency EGP;
    public static final NetworkBalanceModel$Currency EUR;
    public static final NetworkBalanceModel$Currency GEL;
    public static final NetworkBalanceModel$Currency ILS;
    public static final NetworkBalanceModel$Currency KGS;
    public static final NetworkBalanceModel$Currency KWD;
    public static final NetworkBalanceModel$Currency KZT;
    public static final NetworkBalanceModel$Currency MDL;
    public static final NetworkBalanceModel$Currency OMR;
    public static final NetworkBalanceModel$Currency QAR;
    public static final NetworkBalanceModel$Currency RUB;
    public static final NetworkBalanceModel$Currency SAR;
    public static final NetworkBalanceModel$Currency TRY;
    public static final NetworkBalanceModel$Currency UAH;
    public static final NetworkBalanceModel$Currency USD;
    public static final NetworkBalanceModel$Currency UZS;

    static {
        NetworkBalanceModel$Currency networkBalanceModel$Currency = new NetworkBalanceModel$Currency("USD", 0);
        USD = networkBalanceModel$Currency;
        NetworkBalanceModel$Currency networkBalanceModel$Currency2 = new NetworkBalanceModel$Currency("RUB", 1);
        RUB = networkBalanceModel$Currency2;
        NetworkBalanceModel$Currency networkBalanceModel$Currency3 = new NetworkBalanceModel$Currency("UAH", 2);
        UAH = networkBalanceModel$Currency3;
        NetworkBalanceModel$Currency networkBalanceModel$Currency4 = new NetworkBalanceModel$Currency("KZT", 3);
        KZT = networkBalanceModel$Currency4;
        NetworkBalanceModel$Currency networkBalanceModel$Currency5 = new NetworkBalanceModel$Currency("BYR", 4);
        BYR = networkBalanceModel$Currency5;
        NetworkBalanceModel$Currency networkBalanceModel$Currency6 = new NetworkBalanceModel$Currency("BYN", 5);
        BYN = networkBalanceModel$Currency6;
        NetworkBalanceModel$Currency networkBalanceModel$Currency7 = new NetworkBalanceModel$Currency("AZN", 6);
        AZN = networkBalanceModel$Currency7;
        NetworkBalanceModel$Currency networkBalanceModel$Currency8 = new NetworkBalanceModel$Currency("UZS", 7);
        UZS = networkBalanceModel$Currency8;
        NetworkBalanceModel$Currency networkBalanceModel$Currency9 = new NetworkBalanceModel$Currency("MDL", 8);
        MDL = networkBalanceModel$Currency9;
        NetworkBalanceModel$Currency networkBalanceModel$Currency10 = new NetworkBalanceModel$Currency("AMD", 9);
        AMD = networkBalanceModel$Currency10;
        NetworkBalanceModel$Currency networkBalanceModel$Currency11 = new NetworkBalanceModel$Currency("ILS", 10);
        ILS = networkBalanceModel$Currency11;
        NetworkBalanceModel$Currency networkBalanceModel$Currency12 = new NetworkBalanceModel$Currency("GEL", 11);
        GEL = networkBalanceModel$Currency12;
        NetworkBalanceModel$Currency networkBalanceModel$Currency13 = new NetworkBalanceModel$Currency("KGS", 12);
        KGS = networkBalanceModel$Currency13;
        NetworkBalanceModel$Currency networkBalanceModel$Currency14 = new NetworkBalanceModel$Currency("AED", 13);
        AED = networkBalanceModel$Currency14;
        NetworkBalanceModel$Currency networkBalanceModel$Currency15 = new NetworkBalanceModel$Currency("EUR", 14);
        EUR = networkBalanceModel$Currency15;
        NetworkBalanceModel$Currency networkBalanceModel$Currency16 = new NetworkBalanceModel$Currency("SAR", 15);
        SAR = networkBalanceModel$Currency16;
        NetworkBalanceModel$Currency networkBalanceModel$Currency17 = new NetworkBalanceModel$Currency("OMR", 16);
        OMR = networkBalanceModel$Currency17;
        NetworkBalanceModel$Currency networkBalanceModel$Currency18 = new NetworkBalanceModel$Currency("KWD", 17);
        KWD = networkBalanceModel$Currency18;
        NetworkBalanceModel$Currency networkBalanceModel$Currency19 = new NetworkBalanceModel$Currency("BHD", 18);
        BHD = networkBalanceModel$Currency19;
        NetworkBalanceModel$Currency networkBalanceModel$Currency20 = new NetworkBalanceModel$Currency("QAR", 19);
        QAR = networkBalanceModel$Currency20;
        NetworkBalanceModel$Currency networkBalanceModel$Currency21 = new NetworkBalanceModel$Currency("EGP", 20);
        EGP = networkBalanceModel$Currency21;
        NetworkBalanceModel$Currency networkBalanceModel$Currency22 = new NetworkBalanceModel$Currency("TRY", 21);
        TRY = networkBalanceModel$Currency22;
        NetworkBalanceModel$Currency[] networkBalanceModel$CurrencyArr = {networkBalanceModel$Currency, networkBalanceModel$Currency2, networkBalanceModel$Currency3, networkBalanceModel$Currency4, networkBalanceModel$Currency5, networkBalanceModel$Currency6, networkBalanceModel$Currency7, networkBalanceModel$Currency8, networkBalanceModel$Currency9, networkBalanceModel$Currency10, networkBalanceModel$Currency11, networkBalanceModel$Currency12, networkBalanceModel$Currency13, networkBalanceModel$Currency14, networkBalanceModel$Currency15, networkBalanceModel$Currency16, networkBalanceModel$Currency17, networkBalanceModel$Currency18, networkBalanceModel$Currency19, networkBalanceModel$Currency20, networkBalanceModel$Currency21, networkBalanceModel$Currency22};
        $VALUES = networkBalanceModel$CurrencyArr;
        $ENTRIES = a.a(networkBalanceModel$CurrencyArr);
    }

    public static NetworkBalanceModel$Currency valueOf(String str) {
        return (NetworkBalanceModel$Currency) Enum.valueOf(NetworkBalanceModel$Currency.class, str);
    }

    public static NetworkBalanceModel$Currency[] values() {
        return (NetworkBalanceModel$Currency[]) $VALUES.clone();
    }
}
