package xsna;

import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import xsna.u4a;

/* compiled from: CatalogEntryPointFactory.kt */
/* loaded from: classes.dex */
public interface t4a {

    /* compiled from: CatalogEntryPointFactory.kt */
    public static final class a {
        public static xhu0 a;

        public static String a(String str) {
            String str2 = (String) j5g.a0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            return str2 == null ? "" : str2;
        }

        public static String b(rfc rfcVar) {
            return rfcVar.a().getCanonicalName();
        }
    }

    u4a.a a(Bundle bundle, String str);
}
