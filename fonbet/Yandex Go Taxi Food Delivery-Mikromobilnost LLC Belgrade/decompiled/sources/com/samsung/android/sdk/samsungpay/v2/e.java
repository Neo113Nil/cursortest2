package com.samsung.android.sdk.samsungpay.v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.objsys.asn1j.runtime.Asn1Enumerated;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.AmountBoxControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
public final class e {
    protected static SpaySdk.SdkApiLevel j = SpaySdk.SdkApiLevel.LEVEL_UNKNOWN;
    private Context b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private final int a = 203710006;
    protected SpaySdk.SdkApiLevel h = SpaySdk.SdkApiLevel.LEVEL_UNKNOWN;
    protected PackageInfo i = new PackageInfo();

    public e(Context context, boolean z) {
        this.g = false;
        this.g = z;
        p(context);
    }

    private void A() {
        this.h = C(this.b);
        a.e().f(this.h);
        Log.i("SPAYSDK:SpayValidity", "Partner defined SDK API Level : " + this.h);
    }

    private boolean B(Object obj) {
        if ((obj instanceof String) || (obj instanceof Bundle) || obj.getClass().isEnum()) {
            if (a.e().h(obj)) {
                return true;
            }
        } else if (obj instanceof CustomSheet) {
            for (SheetControl sheetControl : ((CustomSheet) obj).getSheetControls()) {
                if (sheetControl instanceof AmountBoxControl) {
                    Iterator<SheetItem> it = ((AmountBoxControl) sheetControl).getItems().iterator();
                    while (it.hasNext()) {
                        if (a.e().h(it.next().getSValue())) {
                            return true;
                        }
                    }
                }
            }
        } else if (obj.getClass().isArray()) {
            for (Object obj2 : (Object[]) obj) {
                if (B(obj2)) {
                    return true;
                }
            }
        } else if (a.e().d(obj)) {
            return true;
        }
        return false;
    }

    public static SpaySdk.SdkApiLevel C(Context context) {
        if (j != SpaySdk.SdkApiLevel.LEVEL_UNKNOWN) {
            return j;
        }
        try {
            SpaySdk.SdkApiLevel a = SpaySdk.SdkApiLevel.a(String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getFloat("spay_sdk_api_level")));
            j = a;
            return a;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            throw new IllegalStateException("Failed to load SDK API Level in Application Manifest" + e.toString());
        }
    }

    private static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                sb.append((char) ((i < 0 || i > 9) ? i + 87 : i + 48));
                i = b & PKIBody._CCP;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    private static String h(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
        messageDigest.update(bArr, 0, bArr.length);
        return d(messageDigest.digest());
    }

    private String o() {
        try {
            return h(this.b.getPackageManager().getPackageInfo("com.samsung.android.samsungpay.gear", 64).signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            Log.e("SPAYSDK:SpayValidity", e.toString());
            return null;
        }
    }

    private void p(Context context) {
        this.b = context;
        this.c = Build.BRAND;
        this.d = Build.MANUFACTURER;
        A();
        boolean z = this.g;
        this.e = z ? "com.samsung.android.samsungpay.gear" : "com.samsung.android.spay";
        this.f = z ? "com.samsung.android.samsungpay.gear.sdk.v2.service.SPaySDKV2Service" : "com.samsung.android.spay.sdk.v2.service.SPaySDKV2Service";
    }

    private boolean q() {
        if (this.g) {
            return z();
        }
        boolean z = this.b.getPackageManager().checkSignatures(ConstantDeviceInfo.APP_PLATFORM, "com.samsung.android.spay") == 0;
        if (!z) {
            Log.e("SPAYSDK:SpayValidity", "Spay has no integrity.");
        }
        return z;
    }

    private boolean u() {
        PackageInfo packageInfo = this.i;
        return packageInfo != null && packageInfo.versionCode >= 203710006;
    }

    private boolean z() {
        try {
            if (TextUtils.equals("34df0e7a9f1cf1892e45c056b4973cd81ccf148a4050d11aea4ac5a65f900a42", o())) {
                return true;
            }
            Log.e("SPAYSDK:SpayValidity", "Signature of Samsung Pay(Watch Plugin) is not matched");
            return false;
        } catch (Exception e) {
            Log.e("SPAYSDK:SpayValidity", e.toString());
            return false;
        }
    }

    public void D(PackageInfo packageInfo) {
        this.i = packageInfo;
    }

    public boolean a(String str, String str2) {
        try {
            this.b.getPackageManager().getServiceInfo(new ComponentName(str, str2), 4);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("SPAYSDK:SpayValidity", "can not find spay app or service");
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    public boolean b(String str) {
        try {
            D(this.b.getPackageManager().getPackageInfo(str, 1));
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("SPAYSDK:SpayValidity", "Unable to find Samsung Pay application on the device");
            return false;
        }
    }

    public boolean c(PartnerRequest partnerRequest) {
        Object[] objArr = partnerRequest.g;
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj != null && B(obj)) {
                return true;
            }
        }
        return false;
    }

    public int e(int i) {
        if (i == -999) {
            return 2;
        }
        if (i != -361 && i != -360) {
            if (i == -11 || i == -10) {
                return -99;
            }
            switch (i) {
                case -358:
                    return -99;
                case -357:
                case -356:
                    return 1;
                default:
                    switch (i) {
                        case -352:
                        case -351:
                        case -350:
                            break;
                        default:
                            Log.e("SPAYSDK:SpayValidity", "sdk can not catch spay status. " + j());
                            return 0;
                    }
            }
        }
        return 0;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    public SpaySdk.SdkApiLevel i() {
        return this.h;
    }

    public int j() {
        if (!this.g && !s()) {
            Log.i("SPAYSDK:SpayValidity", "This is not Samsung device.");
            return -350;
        }
        if (b(l())) {
            return 999;
        }
        Log.i("SPAYSDK:SpayValidity", "SamsungPay package is not exist.");
        return -351;
    }

    public PackageInfo k() {
        return this.i;
    }

    public String l() {
        return this.e;
    }

    public String m() {
        return this.f;
    }

    public int n(PartnerInfo partnerInfo, SpaySdk.SdkApiLevel sdkApiLevel, PartnerRequest partnerRequest) {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.csc.countryiso_code");
        } catch (Exception unused) {
            str = "";
        }
        String upperCase = str.toUpperCase(Locale.US);
        if (!v()) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Spay Local validity check");
            return j();
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Spay Local validity check");
        if (this.g && !u()) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] CA version validity check");
            return -357;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] CA version validity check");
        if (!q()) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Spay integrity check");
            return -360;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Spay integrity check");
        if (r(upperCase, k().versionCode / AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength)) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Minimum Spay app version check");
            return -357;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Minimum Spay app version check");
        if (!a(l(), m())) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Spay SDK service check");
            return -356;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Spay SDK service check");
        if (!x(partnerInfo.getData())) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Defined Service Type check");
            return -11;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Defined Service Type check");
        if (!t(upperCase, partnerInfo.getData())) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Minimum Android Platform version check");
            return -361;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Minimum Android Platform version check");
        if (!w()) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Defined SDK API Level check");
            return -10;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Defined SDK API Level check");
        if (!y(sdkApiLevel)) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Using SDK API Level check");
            return -10;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Using SDK API Level check");
        if (c(partnerRequest)) {
            Log.i("SPAYSDK:SpayValidity", "[FAIL] Using parameters Level check");
            return -10;
        }
        Log.i("SPAYSDK:SpayValidity", "[PASS] Using parameters Level check");
        return Asn1Enumerated.UNDEFINED;
    }

    public boolean r(String str, int i) {
        if (this.g) {
            return 173000006 >= k().versionCode;
        }
        h hVar = new h();
        return hVar.c(str) && !hVar.a(str, i);
    }

    public boolean s() {
        return "Samsung".compareToIgnoreCase(f()) == 0 || "Samsung".compareToIgnoreCase(g()) == 0;
    }

    public boolean t(String str, Bundle bundle) {
        bundle.getString("PartnerServiceType", "");
        return true;
    }

    public boolean v() {
        return j() == 999;
    }

    public boolean w() {
        try {
            return new h().b(this.h, SpaySdk.SdkApiLevel.a("2.17"));
        } catch (NullPointerException unused) {
            Log.e("SPAYSDK:SpayValidity", "Fail to validate SDK API Level.");
            return false;
        }
    }

    public boolean x(Bundle bundle) {
        try {
            String string = bundle.getString("PartnerServiceType", "");
            Log.i("SPAYSDK:SpayValidity", "Partner defined Service Type : " + string);
            for (SpaySdk.ServiceType serviceType : SpaySdk.ServiceType.values()) {
                if (string.equals(serviceType.toString())) {
                    return true;
                }
            }
            Log.e("SPAYSDK:SpayValidity", "Partner service type is not valid. Refer SpaySdk.ServiceType enum.");
            return false;
        } catch (NullPointerException unused) {
            Log.e("SPAYSDK:SpayValidity", "Fail to validate Partner service type.");
            return false;
        }
    }

    public boolean y(SpaySdk.SdkApiLevel sdkApiLevel) {
        try {
            return new h().b(sdkApiLevel, this.h);
        } catch (NullPointerException unused) {
            Log.e("SPAYSDK:SpayValidity", "Fail to validate SDK API Level.");
            return false;
        }
    }
}
