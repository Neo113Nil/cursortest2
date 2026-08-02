package yads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import xsna.epx;

/* loaded from: classes10.dex */
public abstract class eb2 {
    public static qe3 a(ke3 ke3Var) {
        de1 de1Var = ke3Var.b;
        if (de1Var == null || !epx.f(de1Var.b, CampaignEx.KEY_OMID)) {
            throw new me3(ke3Var, le3.c);
        }
        try {
            URL url = new URL(de1Var.c);
            String str = ke3Var.a;
            String str2 = ke3Var.c;
            if (str2 == null || str2.length() == 0) {
                return new qe3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new qe3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new me3(ke3Var, le3.d);
        }
    }
}
