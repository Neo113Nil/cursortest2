package xsna;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: BundleExt.kt */
/* loaded from: classes17.dex */
public final class bo8 {
    public static final boolean a(Bundle bundle, Set set, Bundle bundle2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!epx.f(bundle != null ? bundle.get(str) : null, bundle2 != null ? bundle2.get(str) : null)) {
                return false;
            }
        }
        return true;
    }

    public static final Boolean b(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        return null;
    }

    public static final Double c(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Double.valueOf(bundle.getDouble(str));
        }
        return null;
    }

    public static final Integer d(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public static final Long e(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Long.valueOf(bundle.getLong(str));
        }
        return null;
    }
}
