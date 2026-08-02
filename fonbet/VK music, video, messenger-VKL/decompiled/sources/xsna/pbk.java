package xsna;

import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import java.util.Locale;

/* compiled from: CreationEntryPointUtils.kt */
/* loaded from: classes6.dex */
public final class pbk {
    public static final MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint a(String str) {
        for (MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.values()) {
            if (creationEntryPoint.name().toLowerCase(Locale.ROOT).equals(str)) {
                return creationEntryPoint;
            }
        }
        return null;
    }
}
