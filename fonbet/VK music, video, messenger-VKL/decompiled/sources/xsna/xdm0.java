package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import java.util.List;

/* compiled from: StoryStatHelper.kt */
/* loaded from: classes18.dex */
public final class xdm0 {
    public static StickersStatInfo a(String str) {
        int i = 0;
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        int size = c0.size();
        if (size == 1) {
            return new StickersStatInfo("animated", cqm0.l(str), 0, null, 8, null);
        }
        if (size != 2) {
            return null;
        }
        long l = cqm0.l((String) c0.get(1));
        try {
            i = Integer.parseInt((String) c0.get(0));
        } catch (Throwable unused) {
        }
        return new StickersStatInfo("animated", l, i, null, 8, null);
    }
}
