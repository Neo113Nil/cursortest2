package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;

/* compiled from: Ext.kt */
/* loaded from: classes11.dex */
public final class bbq {
    public static bpn0 a;
    public static bpn0 b;

    public static final h240 a(com.vk.superapp.multiaccount.api.c cVar) {
        return cVar.getValue().c ? cVar.getValue() : h240.d;
    }

    public static final s7n0 b() {
        bpn0 bpn0Var = b;
        if (bpn0Var != null) {
            return (s7n0) bpn0Var.getValue();
        }
        return null;
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String d(Context context, String str) {
        exc0.i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = gb01.a(context);
        }
        int identifier = resources.getIdentifier(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
