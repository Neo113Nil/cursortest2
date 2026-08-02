package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C4217a2;
import com.ironsource.Wa;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vk.core.preference.Preference;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.model.n2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.epx;

/* loaded from: classes7.dex */
public final class PrivacyManager {
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static String d;
    public static String e;
    public static String f;
    public static Long g;
    public static PrivacyConsent h;
    public static FilePreferences i;
    public static SharedPreferences j;

    public static String b() {
        String str = d;
        return str == null ? "unknown" : str;
    }

    public static COPPA c() {
        AtomicReference atomicReference = b;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : epx.f(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : epx.f(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public static Boolean d() {
        Object failure;
        String string;
        try {
            SharedPreferences sharedPreferences = j;
            failure = sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt("IABTCF_gdprApplies", -1)) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            try {
                SharedPreferences sharedPreferences2 = j;
                failure = (sharedPreferences2 == null || (string = sharedPreferences2.getString("IABTCF_gdprApplies", C4217a2.f)) == null) ? null : Integer.valueOf(Integer.parseInt(string));
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean e() {
        int a2 = v.a(a());
        if (a2 != 0) {
            if (a2 == 1) {
                return false;
            }
            if (a2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Boolean bool = (Boolean) a.get();
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public static boolean f() {
        FilePreferences filePreferences;
        if (!epx.f(d(), Boolean.TRUE)) {
            return false;
        }
        ConfigManager.INSTANCE.getClass();
        n2 n = ConfigManager.n();
        int i2 = n == null ? -1 : a.a[n.ordinal()];
        if (i2 != -1) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }
        SharedPreferences sharedPreferences = j;
        String string = sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
        String str = string != null ? string : "";
        FilePreferences filePreferences2 = i;
        if (epx.f(filePreferences2 != null ? filePreferences2.c() : null, str)) {
            return false;
        }
        if (str.length() != 0 && (filePreferences = i) != null) {
            filePreferences.a("previous_tcf_token", str).b();
        }
        return true;
    }

    public final synchronized void a(Context context) {
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get()) {
            boolean z = u.a;
            t.c("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        j = Preference.g(context);
        FilePreferences filePreferences = (FilePreferences) ServiceLocator.d.a(context).getService(FilePreferences.class);
        i = filePreferences;
        AtomicReference atomicReference = a;
        Boolean bool = (Boolean) atomicReference.get();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FilePreferences filePreferences2 = i;
            if (filePreferences2 != null) {
                filePreferences2.a(booleanValue, "disable_ad_id").b();
            }
        } else {
            Boolean a2 = filePreferences.a("disable_ad_id");
            if (a2 != null) {
                atomicReference.set(a2);
            }
        }
        String str = d;
        if (str != null) {
            String str2 = e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = f;
            if (str3 == null) {
                str3 = "";
            }
            Long l = g;
            long longValue = l != null ? l.longValue() : 0L;
            FilePreferences filePreferences3 = i;
            if (filePreferences3 != null) {
                filePreferences3.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str3).b("gdpr_timestamp", longValue).b();
            }
        } else {
            String string = filePreferences.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (epx.f(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (epx.f(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            d = string;
            e = filePreferences.getString("gdpr_source");
            f = filePreferences.getString("gdpr_message_version");
            g = Long.valueOf(filePreferences.a("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = h;
        if (privacyConsent3 != null) {
            FilePreferences filePreferences4 = i;
            if (filePreferences4 != null) {
                filePreferences4.a("ccpa_status", privacyConsent3.getValue()).b();
            }
        } else {
            String string2 = filePreferences.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!epx.f(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            h = privacyConsent4;
        }
        AtomicReference atomicReference2 = b;
        Boolean bool2 = (Boolean) atomicReference2.get();
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            FilePreferences filePreferences5 = i;
            if (filePreferences5 != null) {
                filePreferences5.a(booleanValue2, Wa.G).b();
            }
        } else {
            Boolean a3 = filePreferences.a(Wa.G);
            if (a3 != null) {
                atomicReference2.set(a3);
            }
        }
        atomicBoolean.set(true);
    }

    public final void updateCcpaConsent(PrivacyConsent privacyConsent) {
        h = privacyConsent;
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("ccpa_status", privacyConsent.getValue()).b();
        }
    }

    public static void a(String str, String str2, String str3) {
        d = str;
        e = str2;
        f = str3;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        g = Long.valueOf(currentTimeMillis);
        String str4 = f;
        if (str4 == null) {
            str4 = "";
        }
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str4).b("gdpr_timestamp", currentTimeMillis).b();
        }
    }

    public static void a(boolean z) {
        a.set(Boolean.valueOf(z));
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a(z, "disable_ad_id").b();
        }
    }

    public static int a() {
        Boolean d2 = d();
        if (!epx.f(d2, Boolean.TRUE)) {
            return d2 == null ? 3 : 1;
        }
        ConfigManager.INSTANCE.getClass();
        n2 n = ConfigManager.n();
        int i2 = n == null ? -1 : a.a[n.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }
}
