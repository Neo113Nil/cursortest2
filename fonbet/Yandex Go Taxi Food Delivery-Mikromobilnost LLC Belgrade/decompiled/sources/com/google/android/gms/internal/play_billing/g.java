package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import defpackage.ms5;
import defpackage.ns5;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class g {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        Log.isLoggable(str, 5);
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(long j, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static ns5 d(Intent intent, String str) {
        if (intent != null) {
            ms5 a2 = ns5.a();
            a2.a = a(intent.getExtras(), str);
            a2.b = e(intent.getExtras(), str);
            return a2.a();
        }
        Log.isLoggable("BillingHelper", 5);
        ms5 a3 = ns5.a();
        a3.a = 6;
        a3.b = "An internal error occurred.";
        return a3.a();
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        Log.isLoggable(str, 5);
        return "";
    }

    public static String f(int i) {
        return zzd.a(i).toString();
    }

    public static void g(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int min = Math.min(str2.length(), Math.min(4000, i));
            str2 = str2.substring(min);
            i -= min;
        }
    }

    public static void h(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    public static Bundle i(ns5 ns5Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", ns5Var.a);
        bundle.putString("DEBUG_MESSAGE", ns5Var.b);
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            e.toString();
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
