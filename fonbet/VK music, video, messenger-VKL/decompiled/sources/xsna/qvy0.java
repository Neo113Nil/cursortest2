package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* loaded from: classes13.dex */
public final class qvy0 {
    public static String a(String str) {
        Context context = rdi.j;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            n34.e(InneractiveMediationDefs.GENDER_FEMALE, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            n34.e(InneractiveMediationDefs.GENDER_FEMALE, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            n34.e(InneractiveMediationDefs.GENDER_FEMALE, "throwable");
            return "";
        }
    }
}
