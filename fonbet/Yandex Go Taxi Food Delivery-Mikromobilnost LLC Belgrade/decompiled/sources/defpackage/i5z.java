package defpackage;

import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class i5z {
    public final Locale a;
    public final int b;
    public final int c;
    public static final i5z d = new i5z(ClearCryptoProPrefs.COUNTRY, "RU", kyh0.locale_name_ru, kyh0.locale_native_name_ru);
    public static final i5z e = new i5z("en", "US", kyh0.locale_name_en, kyh0.locale_native_name_en);
    public static final i5z f = new i5z("hy", kyh0.locale_name_hy, kyh0.locale_native_name_hy);
    public static final i5z g = new i5z("kk", kyh0.locale_name_kk, kyh0.locale_native_name_kk);
    public static final i5z h = new i5z("ka", kyh0.locale_name_ka, kyh0.locale_native_name_ka);
    public static final i5z i = new i5z("uk", kyh0.locale_name_uk, kyh0.locale_native_name_uk);
    public static final i5z j = new i5z("az", kyh0.locale_name_az, kyh0.locale_native_name_az);
    public static final i5z k = new i5z("ro", kyh0.locale_name_ro, kyh0.locale_native_name_ro);
    public static final i5z l = new i5z("zh", kyh0.locale_name_zh, kyh0.locale_native_name_zh);
    public static final i5z m = new i5z("ky", kyh0.locale_name_ky, kyh0.locale_native_name_ky);
    public static final i5z n = new i5z("lv", kyh0.locale_name_lv, kyh0.locale_native_name_lv);
    public static final i5z o = new i5z("uz", kyh0.locale_name_uz, kyh0.locale_native_name_uz);
    public static final i5z p = new i5z("et", kyh0.locale_name_et, kyh0.locale_native_name_et);
    public static final i5z q = new i5z("sr", kyh0.locale_name_sr, kyh0.locale_native_name_sr);
    public static final i5z r = new i5z("lt", kyh0.locale_name_lt, kyh0.locale_native_name_lt);
    public static final i5z s = new i5z("fr", kyh0.locale_name_fr, kyh0.locale_native_name_fr);
    public static final i5z t = new i5z("fi", "FI", kyh0.locale_name_fi, kyh0.locale_native_name_fi);
    public static final i5z u = new i5z("he", kyh0.locale_name_he, kyh0.locale_native_name_he);
    public static final i5z v = new i5z("no", kyh0.locale_name_no, kyh0.locale_native_name_no);
    public static final i5z w = new i5z("pt", kyh0.locale_name_pt, kyh0.locale_native_name_pt);
    public static final i5z x = new i5z("es", kyh0.locale_name_es, kyh0.locale_native_name_es);
    public static final i5z y = new i5z("tr", kyh0.locale_name_tr, kyh0.locale_native_name_tr);
    public static final i5z z = new i5z(kyh0.locale_name_ar, kyh0.locale_native_name_ar, new Locale.Builder().setLanguage("ar").setExtension('u', "nu-latn").build());
    public static final i5z A = new i5z("tg", "TJ", kyh0.locale_name_tg, kyh0.locale_native_name_tg);

    static {
        new i5z("ur", kyh0.locale_name_ur, kyh0.locale_native_name_ur);
        new i5z("am", kyh0.locale_name_am, kyh0.locale_native_name_am);
        new i5z("km", "KH", kyh0.locale_name_km, kyh0.locale_native_name_km);
        new i5z("ne", AddCardInfo.PROVIDER_NAPAS, kyh0.locale_name_ne, kyh0.locale_native_name_ne);
        new i5z("sw", kyh0.locale_name_sw, kyh0.locale_native_name_sw);
        new i5z("hi", "IN", kyh0.locale_name_hi, kyh0.locale_native_name_hi);
        new i5z("mr", "IN", kyh0.locale_name_mr, kyh0.locale_native_name_mr);
    }

    public i5z(int i2, int i3, Locale locale) {
        this.a = locale;
        this.b = i2;
        this.c = i3;
    }

    public final String a() {
        return qje.E(this.a.getLanguage());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5z)) {
            return false;
        }
        i5z i5zVar = (i5z) obj;
        return jl40.l(this.a, i5zVar.a) && this.b == i5zVar.b && this.c == i5zVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocaleCompat(locale=");
        sb.append(this.a);
        sb.append(", langNameResId=");
        sb.append(this.b);
        sb.append(", langNativeNameResId=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public i5z(String str, String str2, int i2, int i3) {
        this(i2, i3, new Locale(str, str2));
    }

    public i5z(String str, int i2, int i3) {
        this(i2, i3, new Locale(str));
    }
}
