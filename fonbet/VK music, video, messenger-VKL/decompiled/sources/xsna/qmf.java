package xsna;

import com.vk.clips.attachments.api.di.f;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangeVideoAttachment;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsVideoAttachmentStatControllerImpl.kt */
/* loaded from: classes16.dex */
public final class qmf implements com.vk.clips.attachments.api.di.f {
    @Override // com.vk.clips.attachments.api.di.f
    public final void a(f.b bVar) {
        MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType eventType;
        if (bVar instanceof f.b.c) {
            eventType = MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.TRY_TO_ATTACH_CLIP;
        } else if (bVar instanceof f.b.a) {
            eventType = MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.ATTACH_CLIP_CANCEL;
        } else {
            if (!(bVar instanceof f.b.C0545b)) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.ATTACH_CLIP_CLICK;
        }
        MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType eventType2 = eventType;
        MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype eventSubtype = bVar.c ? MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_UPLOAD_CLIP : MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_EDIT_CLIP_SECTION_CABINET;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, bVar.a, bVar.b, null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoToClipAttach(eventType2, eventSubtype, null, 4, null), 2)).q();
    }

    @Override // com.vk.clips.attachments.api.di.f
    public final void b(f.a aVar, kbk kbkVar) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        int i = kbkVar != null ? kbkVar.b : -1;
        if (kbkVar == null || (creationEntryPoint = kbkVar.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint);
        MobileOfficialAppsClipsStat$ChangeVideoAttachment.EventType eventType = aVar instanceof f.a.C0544a ? MobileOfficialAppsClipsStat$ChangeVideoAttachment.EventType.ADD : aVar instanceof f.a.c ? MobileOfficialAppsClipsStat$ChangeVideoAttachment.EventType.EDIT : MobileOfficialAppsClipsStat$ChangeVideoAttachment.EventType.DELETE;
        UiTracker uiTracker = UiTracker.a;
        new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CHANGE_VIDEO_ATTACHMENT, mobileOfficialAppsClipsStat$ClipsCreateContext, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ChangeVideoAttachment(eventType, aVar.a), null, null, 1788, null)).q();
    }
}
