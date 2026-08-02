package org.chromium.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import internal.org.jni_zero.CalledByNative;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Locale;
import xsna.pzl;

/* loaded from: classes8.dex */
public class LocaleUtils {

    public static class ApisN {
        public static LocaleList prependToLocaleList(String str, LocaleList localeList) {
            return LocaleList.forLanguageTags(String.format("%1$s,%2$s", str, localeList.toLanguageTags().replaceFirst(String.format("(^|,)%1$s$|%1$s,", str), "")));
        }

        public static void setConfigLocales(Context context, Configuration configuration, String str) {
            configuration.setLocales(prependToLocaleList(str, context.getResources().getConfiguration().getLocales()));
        }

        public static void setLocaleList(Configuration configuration) {
            LocaleList.setDefault(configuration.getLocales());
        }
    }

    private LocaleUtils() {
    }

    public static Locale forLanguageTag(String str) {
        return getUpdatedLocaleForAndroid(Locale.forLanguageTag(str));
    }

    public static String getConfigurationLanguage(Configuration configuration) {
        Locale locale = configuration.locale;
        return locale != null ? locale.toLanguageTag() : "";
    }

    public static String getContextLanguage(Context context) {
        return getConfigurationLanguage(context.getResources().getConfiguration());
    }

    @CalledByNative
    public static String getDefaultCountryCode() {
        String switchValue = CommandLine.getInstance().getSwitchValue(BaseSwitches.DEFAULT_COUNTRY_CODE_AT_INSTALL);
        return switchValue != null ? switchValue : Locale.getDefault().getCountry();
    }

    @CalledByNative
    public static String getDefaultLocaleListString() {
        return toLanguageTags(LocaleList.getDefault());
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        return toLanguageTag(Locale.getDefault());
    }

    public static String getUpdatedLanguageForAndroid(String str) {
        str.getClass();
        return !str.equals("fil") ? !str.equals(C.LANGUAGE_UNDETERMINED) ? str : "" : "tl";
    }

    public static String getUpdatedLanguageForChromium(String str) {
        str.getClass();
        switch (str) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "jw":
                return "jv";
            case "tl":
                return "fil";
            case "gom":
                return "kok";
            default:
                return str;
        }
    }

    public static Locale getUpdatedLocaleForAndroid(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(language);
        return updatedLanguageForAndroid.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForAndroid).build();
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        return updatedLanguageForChromium.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static boolean isBaseLanguageEqual(String str, String str2) {
        return TextUtils.equals(toBaseLanguage(str), toBaseLanguage(str2));
    }

    public static void setDefaultLocalesFromConfiguration(Configuration configuration) {
        ApisN.setLocaleList(configuration);
    }

    public static String toBaseLanguage(String str) {
        int indexOf = str.indexOf(45);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static String toLanguageTag(Locale locale) {
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        String country = locale.getCountry();
        return (updatedLanguageForChromium.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? updatedLanguageForChromium : pzl.b(updatedLanguageForChromium, "-", country);
    }

    public static String toLanguageTags(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i))));
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    public static void updateConfig(Context context, Configuration configuration, String str) {
        ApisN.setConfigLocales(context, configuration, str);
    }
}
