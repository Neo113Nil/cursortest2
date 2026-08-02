package com.yandex.go.payments.cards.nfc.enums;

import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/CountryCodeEnum;", "", "", "", "country", "Ljava/lang/String;", "alpha3", "", "numeric", CA20Status.STATUS_USER_I, "AD", "AT", "BE", "CY", "DE", "EE", "ES", "FI", "FR", "GR", "IE", "IT", "LU", AddCardInfo.PROVIDER_MASTERCARD, "ME", "MT", "NL", "PT", "SI", "SK", "SM", "VA", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CountryCodeEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CountryCodeEnum[] $VALUES;
    public static final CountryCodeEnum AD;
    public static final CountryCodeEnum AT;
    public static final CountryCodeEnum BE;
    public static final CountryCodeEnum CY;
    public static final CountryCodeEnum DE;
    public static final CountryCodeEnum EE;
    public static final CountryCodeEnum ES;
    public static final CountryCodeEnum FI;
    public static final CountryCodeEnum FR;
    public static final CountryCodeEnum GR;
    public static final CountryCodeEnum IE;
    public static final CountryCodeEnum IT;
    public static final CountryCodeEnum LU;
    public static final CountryCodeEnum MC;
    public static final CountryCodeEnum ME;
    public static final CountryCodeEnum MT;
    public static final CountryCodeEnum NL;
    public static final CountryCodeEnum PT;
    public static final CountryCodeEnum SI;
    public static final CountryCodeEnum SK;
    public static final CountryCodeEnum SM;
    public static final CountryCodeEnum VA;
    private final String alpha3;
    private final String country;
    private final int numeric;

    static {
        CountryCodeEnum countryCodeEnum = new CountryCodeEnum(0, 16, "AD", "Andorra", VsidGenerator.PLAYER_SERVICE_CODE);
        AD = countryCodeEnum;
        CountryCodeEnum countryCodeEnum2 = new CountryCodeEnum(1, 40, "AT", "Austria", "AUT");
        AT = countryCodeEnum2;
        CountryCodeEnum countryCodeEnum3 = new CountryCodeEnum(2, 56, "BE", "Belgium", "BEL");
        BE = countryCodeEnum3;
        CountryCodeEnum countryCodeEnum4 = new CountryCodeEnum(3, 196, "CY", "Cyprus", "CYP");
        CY = countryCodeEnum4;
        CountryCodeEnum countryCodeEnum5 = new CountryCodeEnum(4, 276, "DE", "Germany", "DEU");
        DE = countryCodeEnum5;
        CountryCodeEnum countryCodeEnum6 = new CountryCodeEnum(5, 233, "EE", "Estonia", "EST");
        EE = countryCodeEnum6;
        CountryCodeEnum countryCodeEnum7 = new CountryCodeEnum(6, 724, "ES", "Spain", "ESP");
        ES = countryCodeEnum7;
        CountryCodeEnum countryCodeEnum8 = new CountryCodeEnum(7, 246, "FI", "Finland", "FIN");
        FI = countryCodeEnum8;
        CountryCodeEnum countryCodeEnum9 = new CountryCodeEnum(8, 250, "FR", "France", "FRA");
        FR = countryCodeEnum9;
        CountryCodeEnum countryCodeEnum10 = new CountryCodeEnum(9, 300, "GR", "Greece", "GRC");
        GR = countryCodeEnum10;
        CountryCodeEnum countryCodeEnum11 = new CountryCodeEnum(10, 372, "IE", "Ireland", "IRL");
        IE = countryCodeEnum11;
        CountryCodeEnum countryCodeEnum12 = new CountryCodeEnum(11, 380, "IT", "Italy", "ITA");
        IT = countryCodeEnum12;
        CountryCodeEnum countryCodeEnum13 = new CountryCodeEnum(12, 442, "LU", "Luxembourg", "LUX");
        LU = countryCodeEnum13;
        CountryCodeEnum countryCodeEnum14 = new CountryCodeEnum(13, 492, AddCardInfo.PROVIDER_MASTERCARD, "Monaco", "MCO");
        MC = countryCodeEnum14;
        CountryCodeEnum countryCodeEnum15 = new CountryCodeEnum(14, 499, "ME", "Montenegro", "MNE");
        ME = countryCodeEnum15;
        CountryCodeEnum countryCodeEnum16 = new CountryCodeEnum(15, 470, "MT", "Malta", "MLT");
        MT = countryCodeEnum16;
        CountryCodeEnum countryCodeEnum17 = new CountryCodeEnum(16, 528, "NL", "Netherlands", "NLD");
        NL = countryCodeEnum17;
        CountryCodeEnum countryCodeEnum18 = new CountryCodeEnum(17, 620, "PT", "Portugal", "PRT");
        PT = countryCodeEnum18;
        CountryCodeEnum countryCodeEnum19 = new CountryCodeEnum(18, 705, "SI", "Slovenia", "SVN");
        SI = countryCodeEnum19;
        CountryCodeEnum countryCodeEnum20 = new CountryCodeEnum(19, 703, "SK", "Slovakia", "SVK");
        SK = countryCodeEnum20;
        CountryCodeEnum countryCodeEnum21 = new CountryCodeEnum(20, 674, "SM", "San Marino", "SMR");
        SM = countryCodeEnum21;
        CountryCodeEnum countryCodeEnum22 = new CountryCodeEnum(21, 336, "VA", "Holy See", "VAT");
        VA = countryCodeEnum22;
        CountryCodeEnum[] countryCodeEnumArr = {countryCodeEnum, countryCodeEnum2, countryCodeEnum3, countryCodeEnum4, countryCodeEnum5, countryCodeEnum6, countryCodeEnum7, countryCodeEnum8, countryCodeEnum9, countryCodeEnum10, countryCodeEnum11, countryCodeEnum12, countryCodeEnum13, countryCodeEnum14, countryCodeEnum15, countryCodeEnum16, countryCodeEnum17, countryCodeEnum18, countryCodeEnum19, countryCodeEnum20, countryCodeEnum21, countryCodeEnum22};
        $VALUES = countryCodeEnumArr;
        $ENTRIES = a.a(countryCodeEnumArr);
    }

    public CountryCodeEnum(int i, int i2, String str, String str2, String str3) {
        this.country = str2;
        this.alpha3 = str3;
        this.numeric = i2;
    }

    public static CountryCodeEnum valueOf(String str) {
        return (CountryCodeEnum) Enum.valueOf(CountryCodeEnum.class, str);
    }

    public static CountryCodeEnum[] values() {
        return (CountryCodeEnum[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNumeric() {
        return this.numeric;
    }
}
