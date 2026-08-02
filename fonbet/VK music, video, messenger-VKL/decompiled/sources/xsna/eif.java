package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import java.util.List;

/* compiled from: ClipsUploadStatHelper.kt */
/* loaded from: classes16.dex */
public final class eif {
    public static StickersStatInfo a(String str) {
        int i = 0;
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        if (c0.size() == 2) {
            long l = cqm0.l((String) c0.get(1));
            try {
                i = Integer.parseInt((String) c0.get(0));
            } catch (Throwable unused) {
            }
            return new StickersStatInfo("animated", l, i, null, 8, null);
        }
        if (c0.size() == 1) {
            return new StickersStatInfo("animated", cqm0.l(str), 0, null, 8, null);
        }
        return null;
    }
}
