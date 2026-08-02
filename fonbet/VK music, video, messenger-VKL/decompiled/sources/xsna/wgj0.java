package xsna;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.huawei.hms.framework.common.BundleUtil;

/* compiled from: ShortcutHelper.kt */
/* loaded from: classes6.dex */
public final class wgj0 {
    public static boolean a(Context context, long j, String str) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            for (ShortcutInfo shortcutInfo : shortcutManager.getPinnedShortcuts()) {
                String str2 = (String) j5g.b0(2, drm0.c0(shortcutInfo.getId(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                Long n = str2 != null ? arm0.n(str2) : null;
                String str3 = (String) j5g.b0(3, drm0.c0(shortcutInfo.getId(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                if (str3 == null) {
                    str3 = "";
                }
                if (drm0.D(shortcutInfo.getId(), "web_app", false) && n != null && n.longValue() == j && (str == null || str3.equals(str))) {
                    return true;
                }
            }
        }
        return false;
    }
}
