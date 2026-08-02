package defpackage;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import yads.cc1;
import yads.kb3;
import yads.lb3;

/* loaded from: classes7.dex */
public final class l181 {
    public static s181 a(zi71 zi71Var) {
        cc1 cc1Var = zi71Var.b;
        if (cc1Var == null || !jl40.l(cc1Var.b, "omid")) {
            throw new lb3(zi71Var, kb3.c);
        }
        try {
            URL url = new URL(cc1Var.c);
            String str = zi71Var.a;
            String str2 = zi71Var.c;
            if (str2 == null || str2.length() == 0) {
                return new s181(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                ny61.g("VendorKey is null or empty");
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                return new s181(str, url, str2);
            }
            ny61.g("VerificationParameters is null or empty");
            return null;
        } catch (MalformedURLException unused) {
            throw new lb3(zi71Var, kb3.d);
        }
    }
}
