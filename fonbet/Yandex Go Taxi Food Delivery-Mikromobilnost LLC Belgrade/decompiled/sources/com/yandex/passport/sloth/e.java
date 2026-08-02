package com.yandex.passport.sloth;

import android.webkit.CookieManager;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {
    public final i3y a = kotlin.a.a(new androidx.core.app.a1(25));

    public static void a(String str, List list) {
        CookieManager cookieManager = CookieManager.getInstance();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(str, (String) it.next());
        }
        cookieManager.flush();
    }

    public static String b(String str, String str2) {
        List W;
        int i;
        List W2;
        W = evu0.W(str, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
        for (String str3 : (String[]) W.toArray(new String[0])) {
            W2 = evu0.W(str3, new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
            String[] strArr = (String[]) W2.toArray(new String[0]);
            if (strArr.length == 2) {
                String str4 = strArr[0];
                int length = str4.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = jl40.q(str4.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                if (cvu0.t(str4.subSequence(i2, length + 1).toString(), str2, true)) {
                    return strArr[1];
                }
            }
        }
        return null;
    }
}
