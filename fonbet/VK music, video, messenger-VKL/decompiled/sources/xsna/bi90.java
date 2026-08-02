package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.CommunityScheduledClipsActionEnableState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParamsHelpers.kt */
/* loaded from: classes5.dex */
public final class bi90 {
    public static final boolean a(j0i j0iVar) {
        VideoAccessInfo videoAccessInfo = j0iVar.a.A;
        if (videoAccessInfo == null) {
            return false;
        }
        List<VideoEditForbiddenReason> list = videoAccessInfo.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((VideoEditForbiddenReason) it.next()) instanceof VideoEditForbiddenReason.Ad) {
                return true;
            }
        }
        return false;
    }

    public static final CommunityScheduledClipsActionEnableState b(j0i j0iVar) {
        return j0iVar.a.G ? CommunityScheduledClipsActionEnableState.Enabled : a(j0iVar) ? CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction : CommunityScheduledClipsActionEnableState.Disabled;
    }

    public static final boolean c(j0i j0iVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (fxc0.B().c(clipVideoFile)) {
            return false;
        }
        VideoRestriction videoRestriction = clipVideoFile.O0;
        return (videoRestriction == null || videoRestriction.f) && !fxc0.B().b0().e(clipVideoFile);
    }

    public static final boolean d(j0i j0iVar, boolean z) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        boolean z2 = clipVideoFile.G || a(j0iVar);
        return (z2 && z) ? !o25.a().a(clipVideoFile.b) && fkq0.b(j0iVar.d) : z2;
    }
}
