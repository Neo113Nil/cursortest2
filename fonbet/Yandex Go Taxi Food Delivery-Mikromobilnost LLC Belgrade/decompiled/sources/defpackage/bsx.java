package defpackage;

import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.settings.language_settings.VoiceLanguage;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes12.dex */
public final class bsx {
    public final zuj0 a;

    public bsx(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public final String a(NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment, NavigatorLanguageSettingAvailabilityExperiment.Language language) {
        String str;
        Object failure;
        Integer valueOf;
        String str2 = null;
        if (language != null) {
            str = language.c;
            String str3 = language.a;
            if (d6z.Z(navigatorLanguageSettingAvailabilityExperiment, str3)) {
                str = d6z.Y(navigatorLanguageSettingAvailabilityExperiment, str3);
            } else {
                try {
                    failure = VoiceLanguage.valueOf(str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                VoiceLanguage voiceLanguage = (VoiceLanguage) failure;
                if (voiceLanguage == null) {
                    valueOf = null;
                } else {
                    switch (asx.a[voiceLanguage.ordinal()]) {
                        case 1:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_en);
                            break;
                        case 2:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_fr);
                            break;
                        case 3:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_hy);
                            break;
                        case 4:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_ka);
                            break;
                        case 5:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_kk);
                            break;
                        case 6:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_ro);
                            break;
                        case 7:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_ru);
                            break;
                        case 8:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_sr);
                            break;
                        case 9:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_uz);
                            break;
                        case 10:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_az);
                            break;
                        case 11:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_es);
                            break;
                        case 12:
                            valueOf = Integer.valueOf(kyh0.locale_native_name_pt);
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                }
                if (valueOf != null) {
                    String h = ((avj0) this.a).h(valueOf.intValue());
                    if (h != null) {
                        str = h;
                    }
                }
            }
        } else {
            str = null;
        }
        if (str != null) {
            if (str.length() > 0) {
                str2 = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
            } else {
                str2 = str;
            }
        }
        return str2 == null ? "" : str2;
    }
}
