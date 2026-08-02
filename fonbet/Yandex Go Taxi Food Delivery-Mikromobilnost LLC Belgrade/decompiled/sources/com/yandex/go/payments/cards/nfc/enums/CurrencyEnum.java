package com.yandex.go.payments.cards.nfc.enums;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bj\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/CurrencyEnum;", "", "", "", "numeric", CA20Status.STATUS_USER_I, "Lcom/yandex/go/payments/cards/nfc/enums/CurrencyEnum$Digits;", "digits", "Lcom/yandex/go/payments/cards/nfc/enums/CurrencyEnum$Digits;", "", "country", "Ljava/lang/String;", "", "Lcom/yandex/go/payments/cards/nfc/enums/CountryCodeEnum;", "countries", "[Lcom/yandex/go/payments/cards/nfc/enums/CountryCodeEnum;", AuthSdkActivity.RESPONSE_TYPE_CODE, "Digits", "EUR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CurrencyEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CurrencyEnum[] $VALUES;
    public static final CurrencyEnum EUR;
    private final CountryCodeEnum[] countries;
    private final Digits digits;
    private final int numeric = 978;
    private final String country = "Euro";
    private final String code = "Euro".toUpperCase(Locale.getDefault());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/CurrencyEnum$Digits;", "", "DIGITS_0", "DIGITS_2", "DIGITS_3", "DIGITS_07", "DIGITS_NO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Digits {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Digits[] $VALUES;
        public static final Digits DIGITS_0;
        public static final Digits DIGITS_07;
        public static final Digits DIGITS_2;
        public static final Digits DIGITS_3;
        public static final Digits DIGITS_NO;

        static {
            Digits digits = new Digits("DIGITS_0", 0);
            DIGITS_0 = digits;
            Digits digits2 = new Digits("DIGITS_2", 1);
            DIGITS_2 = digits2;
            Digits digits3 = new Digits("DIGITS_3", 2);
            DIGITS_3 = digits3;
            Digits digits4 = new Digits("DIGITS_07", 3);
            DIGITS_07 = digits4;
            Digits digits5 = new Digits("DIGITS_NO", 4);
            DIGITS_NO = digits5;
            Digits[] digitsArr = {digits, digits2, digits3, digits4, digits5};
            $VALUES = digitsArr;
            $ENTRIES = a.a(digitsArr);
        }

        public static Digits valueOf(String str) {
            return (Digits) Enum.valueOf(Digits.class, str);
        }

        public static Digits[] values() {
            return (Digits[]) $VALUES.clone();
        }
    }

    static {
        CurrencyEnum currencyEnum = new CurrencyEnum(Digits.DIGITS_2, new CountryCodeEnum[]{CountryCodeEnum.AD, CountryCodeEnum.AT, CountryCodeEnum.BE, CountryCodeEnum.CY, CountryCodeEnum.EE, CountryCodeEnum.FI, CountryCodeEnum.FR, CountryCodeEnum.DE, CountryCodeEnum.GR, CountryCodeEnum.IE, CountryCodeEnum.IT, CountryCodeEnum.LU, CountryCodeEnum.MT, CountryCodeEnum.MC, CountryCodeEnum.ME, CountryCodeEnum.NL, CountryCodeEnum.PT, CountryCodeEnum.SM, CountryCodeEnum.SK, CountryCodeEnum.SI, CountryCodeEnum.ES, CountryCodeEnum.VA});
        EUR = currencyEnum;
        CurrencyEnum[] currencyEnumArr = {currencyEnum};
        $VALUES = currencyEnumArr;
        $ENTRIES = a.a(currencyEnumArr);
    }

    public CurrencyEnum(Digits digits, CountryCodeEnum[] countryCodeEnumArr) {
        this.digits = digits;
        this.countries = countryCodeEnumArr;
    }

    public static CurrencyEnum valueOf(String str) {
        return (CurrencyEnum) Enum.valueOf(CurrencyEnum.class, str);
    }

    public static CurrencyEnum[] values() {
        return (CurrencyEnum[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNumeric() {
        return this.numeric;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.code;
    }
}
