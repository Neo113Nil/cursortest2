package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class coz0 {
    public static final dpj0 a = new dpj0();

    @Nullable
    public static Locale b;

    @Nullable
    public static String a(int i, Context context) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return h(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return h(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    @NonNull
    public static String b(int i, Context context) {
        String h = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(i, context);
        return h == null ? context.getResources().getString(R.string.common_google_play_services_try_again_title) : h;
    }

    @NonNull
    public static String c(int i, Context context) {
        Resources resources = context.getResources();
        String f = f(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, f);
        }
        if (i == 2) {
            return e43.j(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, f) : resources.getString(R.string.common_google_play_services_update_text, f);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, f);
        }
        if (i == 4) {
            return resources.getString(R.string.common_google_play_services_signin_required_text, f);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", f);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", f);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, f);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", f);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", f);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", f);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, f);
            default:
                return resources.getString(R.string.common_google_play_services_try_again_text, f);
        }
    }

    @NonNull
    public static String d(int i, Context context) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(i, context);
    }

    @NonNull
    public static String e(int i, Context context) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = xzx0.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = h(context, str);
        if (h == null) {
            h = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, str2);
    }

    @Nullable
    public static String h(Context context, String str) {
        Resources resources;
        dpj0 dpj0Var = a;
        synchronized (dpj0Var) {
            try {
                Locale locale = hyi.a(context.getResources().getConfiguration()).a.a.get(0);
                if (!locale.equals(b)) {
                    dpj0Var.clear();
                    b = locale;
                }
                String str2 = (String) dpj0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = GooglePlayServicesUtil.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        new StringBuilder(str.length() + 18);
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            dpj0Var.put(str, string);
                            return string;
                        }
                        new StringBuilder(str.length() + 20);
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
