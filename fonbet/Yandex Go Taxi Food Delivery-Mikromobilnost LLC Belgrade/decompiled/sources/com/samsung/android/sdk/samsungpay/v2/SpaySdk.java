package com.samsung.android.sdk.samsungpay.v2;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import defpackage.ny61;
import java.lang.ref.WeakReference;
import java.util.Locale;
import ru.CryptoPro.JCP.ProviderParameters;

/* loaded from: classes11.dex */
public abstract class SpaySdk {
    protected static final SdkApiLevel e = SdkApiLevel.LEVEL_1_4;
    protected Binder a;
    protected WeakReference<Context> b;
    protected PartnerInfo c;
    protected Handler d = new Handler(Looper.getMainLooper());

    public enum Brand implements Parcelable {
        AMERICANEXPRESS,
        MASTERCARD,
        VISA,
        DISCOVER,
        CHINAUNIONPAY,
        UNKNOWN_CARD,
        OCTOPUS,
        ECI,
        PAGOBANCOMAT;

        public static final Parcelable.Creator<Brand> CREATOR = new Parcelable.Creator<Brand>() { // from class: com.samsung.android.sdk.samsungpay.v2.SpaySdk.Brand.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Brand createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                if (readInt < Brand.values().length) {
                    return Brand.values()[readInt];
                }
                Log.e("SPAYSDK:SpaySdk", "Brand name in Parcel is not included in current SDK");
                return Brand.UNKNOWN_CARD;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Brand[] newArray(int i) {
                return new Brand[i];
            }
        };

        public static Brand convert(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            return ("VISA".equals(upperCase) || AddCardInfo.PROVIDER_VISA.equals(upperCase)) ? VISA : ("MASTERCARD".equals(upperCase) || AddCardInfo.PROVIDER_MASTERCARD.equals(upperCase) || upperCase.contains("MASTER")) ? MASTERCARD : ("AMEX".equals(upperCase) || AddCardInfo.PROVIDER_AMEX.equals(upperCase) || upperCase.contains("AMERICANEXPRESS")) ? AMERICANEXPRESS : ("DISCOVER".equals(upperCase) || AddCardInfo.PROVIDER_DISCOVER.equals(upperCase)) ? DISCOVER : ("CUP".equals(upperCase) || upperCase.contains("CHINA")) ? CHINAUNIONPAY : ("OCL".equals(upperCase) || upperCase.contains("OC")) ? OCTOPUS : "ECI".equals(upperCase) ? ECI : AddCardInfo.PROVIDER_PAGOBANCOMAT.equals(upperCase) ? PAGOBANCOMAT : UNKNOWN_CARD;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum SdkApiLevel {
        LEVEL_UNKNOWN(ProviderParameters.DEFAULT_PRODUCT_VER),
        LEVEL_1_1("1.1"),
        LEVEL_1_2("1.2"),
        LEVEL_1_3("1.3"),
        LEVEL_1_4("1.4"),
        LEVEL_1_5("1.5"),
        LEVEL_1_6("1.6"),
        LEVEL_1_7("1.7"),
        LEVEL_1_8("1.8"),
        LEVEL_1_9("1.9"),
        LEVEL_2_0("2.0"),
        LEVEL_2_1("2.1"),
        LEVEL_2_2("2.2"),
        LEVEL_2_3("2.3"),
        LEVEL_2_4("2.4"),
        LEVEL_2_5("2.5"),
        LEVEL_2_6("2.6"),
        LEVEL_2_7("2.7"),
        LEVEL_2_8("2.8"),
        LEVEL_2_9("2.9"),
        LEVEL_2_11("2.11"),
        LEVEL_2_13("2.13"),
        LEVEL_2_14("2.14"),
        LEVEL_2_15("2.15"),
        LEVEL_2_16("2.16"),
        LEVEL_2_17("2.17");

        private String apiLevel;

        SdkApiLevel(String str) {
            this.apiLevel = str;
        }

        public static SdkApiLevel a(String str) {
            for (SdkApiLevel sdkApiLevel : values()) {
                if (TextUtils.equals(sdkApiLevel.apiLevel, str)) {
                    return sdkApiLevel;
                }
            }
            Log.e("SPAYSDK:SpaySdk", "Can not find a api level : " + str);
            return LEVEL_UNKNOWN;
        }

        public String b() {
            return this.apiLevel;
        }
    }

    public enum ServiceType {
        INAPP_PAYMENT,
        APP2APP,
        WEB_PAYMENT,
        W3C,
        MOBILEWEB_PAYMENT,
        INTERNAL_APK
    }

    public SpaySdk(Context context, PartnerInfo partnerInfo) {
        this.c = null;
        c();
        this.b = new WeakReference<>(context instanceof Activity ? context : context.getApplicationContext());
        this.c = partnerInfo;
        if (!e(partnerInfo)) {
            ny61.t("Context and PartnerInfo.serviceId have to be set.");
            throw null;
        }
        synchronized (partnerInfo) {
            try {
                Bundle data = partnerInfo.getData();
                if (data == null) {
                    data = new Bundle();
                    partnerInfo.setData(data);
                }
                data.putString("sdkVersion", c());
                Binder binder = new Binder();
                this.a = binder;
                data.putBinder("binder", binder);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String c() {
        return "2.17.00";
    }

    public void a(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t("Input parameter must be set");
    }

    public PartnerInfo b() {
        return this.c;
    }

    public boolean d() {
        return this.b.get() != null;
    }

    public boolean e(PartnerInfo partnerInfo) {
        return d() && f(partnerInfo);
    }

    public boolean f(PartnerInfo partnerInfo) {
        return (partnerInfo == null || partnerInfo.getServiceId() == null || "".equals(partnerInfo.getServiceId())) ? false : true;
    }
}
