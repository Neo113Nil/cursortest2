package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.coauthors.list.common.mvi.ClipCoauthorListLaunchType;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import xsna.inc;
import xsna.poc;
import xsna.wmd;

/* compiled from: ClipsCoauthorsLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class kmd implements jmd {
    @Override // xsna.jmd
    public final void a(Context context, ClipVideoFile clipVideoFile) {
        new CoauthorsInviteDialog(context, clipVideoFile).f.m();
    }

    @Override // xsna.jmd
    public final void b(Context context, ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams, FragmentManager fragmentManager) {
        new wmd.a(context, clipsCoauthorsSelectorInputParams).H0(fragmentManager, "ClipsCoauthorsSelectorBottomSheet");
    }

    @Override // xsna.jmd
    public final void c(Activity activity, ClipVideoFile clipVideoFile, UserId userId) {
        new inc.a(activity, clipVideoFile, new ClipCoauthorsDecisionLaunchType.DeleteClip(userId)).I0("ClipCoauthorPendingRequestsBottomSheet");
    }

    @Override // xsna.jmd
    public final void d(Context context, ClipVideoFile clipVideoFile, boolean z, syf syfVar) {
        UiTracker uiTracker = UiTracker.a;
        new god(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.VIEW_AUTHORS, new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, null, 4, null))).q();
        new poc.a(context, clipVideoFile, syfVar, clipVideoFile.F ? ClipCoauthorListLaunchType.Author : ClipCoauthorListLaunchType.Viewer, z).I0("ClipCoauthorsListBottomSheet");
    }
}
