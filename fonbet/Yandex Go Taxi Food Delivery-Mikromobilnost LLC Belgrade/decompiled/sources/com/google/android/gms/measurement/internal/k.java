package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.ybsdk.widgets.common.MoneyInputEditView;

/* loaded from: classes.dex */
public abstract class k {
    public static final ImmutableList a = ImmutableList.u("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        zzoe zzoeVar;
        char c;
        int c2 = c(zzkpVar);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(zzkpVar, immutableMap2) == zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && immutableSet.contains(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (immutableMap.containsKey(zzkpVar) && (zzoeVar = (zzoe) immutableMap.get(zzkpVar)) != null) {
                int ordinal = zzoeVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(zzkpVar, immutableMap2) == zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? f(zzkpVar, cArr, str3, z2) : e(zzkpVar, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return g(zzkpVar, immutableMap2) == zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? e(zzkpVar, cArr, str2, z) : f(zzkpVar, cArr, str3, z2);
                        }
                    } else if (g(zzkpVar, immutableMap2) != zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(zzkpVar, cArr, str3, z2);
                    }
                } else if (g(zzkpVar, immutableMap2) != zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(zzkpVar, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(zzkp zzkpVar) {
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(zzkp zzkpVar, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < zzkpVar.zza()) ? "0" : String.valueOf(str.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzkpVar.zza()) {
            str3 = String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(zzkp zzkpVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zzkpVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= zzkpVar.zza()) {
                char charAt = str.charAt(zzkpVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = MoneyInputEditView.DEFAULT_VALUE;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(zzkp zzkpVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zzkpVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= zzkpVar.zza()) {
                char charAt = str.charAt(zzkpVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = MoneyInputEditView.DEFAULT_VALUE;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final zzkq g(zzkp zzkpVar, ImmutableMap immutableMap) {
        Object obj = zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = immutableMap.get(zzkpVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (zzkq) obj;
    }
}
