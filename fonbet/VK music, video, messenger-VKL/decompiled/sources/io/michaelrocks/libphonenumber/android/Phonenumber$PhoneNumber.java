package io.michaelrocks.libphonenumber.android;

import java.io.Serializable;
import xsna.urd0;

/* loaded from: classes8.dex */
public class Phonenumber$PhoneNumber implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean hasCountryCode;
    private boolean hasCountryCodeSource;
    private boolean hasExtension;
    private boolean hasItalianLeadingZero;
    private boolean hasNationalNumber;
    private boolean hasNumberOfLeadingZeros;
    private boolean hasPreferredDomesticCarrierCode;
    private boolean hasRawInput;
    private int countryCode_ = 0;
    private long nationalNumber_ = 0;
    private String extension_ = "";
    private boolean italianLeadingZero_ = false;
    private int numberOfLeadingZeros_ = 1;
    private String rawInput_ = "";
    private String preferredDomesticCarrierCode_ = "";
    private CountryCodeSource countryCodeSource_ = CountryCodeSource.UNSPECIFIED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CountryCodeSource {
        private static final /* synthetic */ CountryCodeSource[] $VALUES;
        public static final CountryCodeSource FROM_DEFAULT_COUNTRY;
        public static final CountryCodeSource FROM_NUMBER_WITHOUT_PLUS_SIGN;
        public static final CountryCodeSource FROM_NUMBER_WITH_IDD;
        public static final CountryCodeSource FROM_NUMBER_WITH_PLUS_SIGN;
        public static final CountryCodeSource UNSPECIFIED;

        static {
            CountryCodeSource countryCodeSource = new CountryCodeSource("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            FROM_NUMBER_WITH_PLUS_SIGN = countryCodeSource;
            CountryCodeSource countryCodeSource2 = new CountryCodeSource("FROM_NUMBER_WITH_IDD", 1);
            FROM_NUMBER_WITH_IDD = countryCodeSource2;
            CountryCodeSource countryCodeSource3 = new CountryCodeSource("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            FROM_NUMBER_WITHOUT_PLUS_SIGN = countryCodeSource3;
            CountryCodeSource countryCodeSource4 = new CountryCodeSource("FROM_DEFAULT_COUNTRY", 3);
            FROM_DEFAULT_COUNTRY = countryCodeSource4;
            CountryCodeSource countryCodeSource5 = new CountryCodeSource("UNSPECIFIED", 4);
            UNSPECIFIED = countryCodeSource5;
            $VALUES = new CountryCodeSource[]{countryCodeSource, countryCodeSource2, countryCodeSource3, countryCodeSource4, countryCodeSource5};
        }

        public CountryCodeSource() {
            throw null;
        }

        public static CountryCodeSource valueOf(String str) {
            return (CountryCodeSource) Enum.valueOf(CountryCodeSource.class, str);
        }

        public static CountryCodeSource[] values() {
            return (CountryCodeSource[]) $VALUES.clone();
        }
    }

    public final void d() {
        this.hasCountryCodeSource = false;
        this.countryCodeSource_ = CountryCodeSource.UNSPECIFIED;
    }

    public final boolean equals(Object obj) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber;
        if (!(obj instanceof Phonenumber$PhoneNumber) || (phonenumber$PhoneNumber = (Phonenumber$PhoneNumber) obj) == null) {
            return false;
        }
        if (this == phonenumber$PhoneNumber) {
            return true;
        }
        return this.countryCode_ == phonenumber$PhoneNumber.countryCode_ && this.nationalNumber_ == phonenumber$PhoneNumber.nationalNumber_ && this.extension_.equals(phonenumber$PhoneNumber.extension_) && this.italianLeadingZero_ == phonenumber$PhoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phonenumber$PhoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phonenumber$PhoneNumber.rawInput_) && this.countryCodeSource_ == phonenumber$PhoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phonenumber$PhoneNumber.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode;
    }

    public final int g() {
        return this.countryCode_;
    }

    public final long h() {
        return this.nationalNumber_;
    }

    public final int hashCode() {
        return urd0.a((this.countryCodeSource_.hashCode() + urd0.a((((urd0.a((Long.valueOf(this.nationalNumber_).hashCode() + ((2173 + this.countryCode_) * 53)) * 53, 53, this.extension_) + (this.italianLeadingZero_ ? 1231 : 1237)) * 53) + this.numberOfLeadingZeros_) * 53, 53, this.rawInput_)) * 53, 53, this.preferredDomesticCarrierCode_) + (this.hasPreferredDomesticCarrierCode ? 1231 : 1237);
    }

    public final int i() {
        return this.numberOfLeadingZeros_;
    }

    public final String j() {
        return this.rawInput_;
    }

    public final boolean k() {
        return this.italianLeadingZero_;
    }

    public final void l(int i) {
        this.hasCountryCode = true;
        this.countryCode_ = i;
    }

    public final void m(CountryCodeSource countryCodeSource) {
        countryCodeSource.getClass();
        this.hasCountryCodeSource = true;
        this.countryCodeSource_ = countryCodeSource;
    }

    public final void n(String str) {
        this.hasExtension = true;
        this.extension_ = str;
    }

    public final void o() {
        this.hasItalianLeadingZero = true;
        this.italianLeadingZero_ = true;
    }

    public final void p(long j) {
        this.hasNationalNumber = true;
        this.nationalNumber_ = j;
    }

    public final void q(int i) {
        this.hasNumberOfLeadingZeros = true;
        this.numberOfLeadingZeros_ = i;
    }

    public final void r(String str) {
        str.getClass();
        this.hasPreferredDomesticCarrierCode = true;
        this.preferredDomesticCarrierCode_ = str;
    }

    public final void s(String str) {
        this.hasRawInput = true;
        this.rawInput_ = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.countryCode_);
        sb.append(" National Number: ");
        sb.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.hasNumberOfLeadingZeros) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.numberOfLeadingZeros_);
        }
        if (this.hasExtension) {
            sb.append(" Extension: ");
            sb.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            sb.append(" Country Code Source: ");
            sb.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.preferredDomesticCarrierCode_);
        }
        return sb.toString();
    }
}
