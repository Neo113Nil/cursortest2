package xsna;

import android.content.SharedPreferences;
import java.util.regex.Pattern;
import kotlin.Result;
import org.json.JSONException;

/* compiled from: FirebaseOverrideDomainPrefs.kt */
/* loaded from: classes17.dex */
public final class fjr {
    public static final fjr a = new fjr();
    public static final bpn0 b = new bpn0(new com.vk.movika.sdk.base.model.props.d(23));

    public static boolean a(String str, boolean z) {
        Object failure;
        try {
            failure = Boolean.valueOf(((SharedPreferences) b.getValue()).getBoolean(str, z));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = Boolean.valueOf(z);
        }
        return ((Boolean) failure).booleanValue();
    }

    public static /* synthetic */ boolean b(fjr fjrVar, String str) {
        fjrVar.getClass();
        return a(str, false);
    }

    public static long c() {
        Object failure;
        try {
            failure = Long.valueOf(((SharedPreferences) b.getValue()).getLong("override_domain_part", 100L));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = 100L;
        }
        return ((Number) failure).longValue();
    }

    public static String d(String str) {
        Object failure;
        try {
            failure = ((SharedPreferences) b.getValue()).getString(str, "");
            if (failure == null) {
                failure = "";
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (Result.a(failure) == null ? failure : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(itz0 itz0Var) {
        Long valueOf;
        long j;
        SharedPreferences.Editor edit = ((SharedPreferences) b.getValue()).edit();
        zjr zjrVar = (zjr) itz0Var.b;
        edit.putString("override_api_domain", zjrVar.d("override_api_domain"));
        edit.putString("override_web_domain", zjrVar.d("override_web_domain"));
        edit.putString("override_web_core_domain", zjrVar.d("override_web_core_domain"));
        edit.putString("override_web_wiki_domain", zjrVar.d("override_web_wiki_domain"));
        edit.putString("override_web_sdk_auth_domain", zjrVar.d("override_web_sdk_auth_domain"));
        edit.putString("override_web_validation_domain", zjrVar.d("override_web_validation_domain"));
        edit.putString("override_web_payments_domain", zjrVar.d("override_web_payments_domain"));
        edit.putString("override_web_away_domain", zjrVar.d("override_web_away_domain"));
        edit.putString("override_away_skip_domain", zjrVar.d("override_away_skip_domain"));
        edit.putString("override_ssl_skip_domain", zjrVar.d("override_ssl_skip_domain"));
        edit.putString("override_web_ssl_skip_domain", zjrVar.d("override_web_ssl_skip_domain"));
        edit.putString("override_domains_restrict_to_stores", zjrVar.d("override_domains_restrict_to_stores"));
        edit.putBoolean("override_no_away", zjrVar.c("override_no_away"));
        edit.putBoolean("override_no_web_ssl", zjrVar.c("override_no_web_ssl"));
        pxi pxiVar = zjrVar.f;
        ixi ixiVar = pxiVar.c;
        com.google.firebase.remoteconfig.internal.a b2 = pxi.b(ixiVar);
        Long l = null;
        if (b2 != null) {
            try {
                valueOf = Long.valueOf(b2.b().getLong("override_domain_part"));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                pxiVar.a(pxi.b(ixiVar), "override_domain_part");
                j = valueOf.longValue();
            } else {
                com.google.firebase.remoteconfig.internal.a b3 = pxi.b(pxiVar.d);
                if (b3 != null) {
                    try {
                        l = Long.valueOf(b3.b().getLong("override_domain_part"));
                    } catch (JSONException unused2) {
                    }
                }
                if (l != null) {
                    j = l.longValue();
                } else {
                    Pattern pattern = pxi.e;
                    j = 0;
                }
            }
            edit.putLong("override_domain_part", j);
            edit.putBoolean("override_domain_for_anon", zjrVar.c("override_domain_for_anon"));
            edit.apply();
        }
        valueOf = null;
        if (valueOf == null) {
        }
        edit.putLong("override_domain_part", j);
        edit.putBoolean("override_domain_for_anon", zjrVar.c("override_domain_for_anon"));
        edit.apply();
    }
}
