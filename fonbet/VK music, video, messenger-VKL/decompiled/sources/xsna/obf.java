package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.attachments.api.di.f;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadUnmodifiableData;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCreateChannelClick;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangeStory;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$VkTicket;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.lbf;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadAnalyticsMiddleware.kt */
/* loaded from: classes17.dex */
public final class obf implements h7f0<ClipsUploadState, lbf, Object, mjf, ugf, qef> {
    public final sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> b;
    public final lbk c;
    public final com.vk.clips.attachments.api.di.f d;

    public obf(sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> sl50Var, lbk lbkVar, com.vk.clips.attachments.api.di.f fVar) {
        this.b = sl50Var;
        this.c = lbkVar;
        this.d = fVar;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        ClipInvolvementActionButton.VkTicket.WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto;
        String str;
        String str2;
        f.a cVar;
        UserId userId;
        lbf lbfVar = (lbf) lj50Var;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = null;
        if (lbfVar instanceof lbf.c.v) {
            lbf.c.v vVar = (lbf.c.v) lbfVar;
            ClipAttachedVideoInfo clipAttachedVideoInfo = ((ClipsUploadState.Loaded) getCurrentState()).b.e.h.b;
            String str3 = clipAttachedVideoInfo != null ? clipAttachedVideoInfo.d : null;
            boolean f = epx.f(vVar, lbf.c.v.a.b);
            com.vk.clips.attachments.api.di.f fVar = this.d;
            if (f) {
                ClipsUploadState currentState = this.b.getCurrentState();
                ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
                fVar.a(new f.b.c(null, (loaded == null || (userId = loaded.f) == null) ? null : Long.valueOf(userId.b), true));
                return;
            }
            if (!epx.f(vVar, lbf.c.v.b.b)) {
                if (!(vVar instanceof lbf.c.v.C3257c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = str3 != null ? new f.a.c(str3) : new f.a.C0544a(((lbf.c.v.C3257c) vVar).b.e);
            } else if (str3 == null) {
                return;
            } else {
                cVar = new f.a.b(str3);
            }
            fVar.b(cVar, this.c.getContext());
            return;
        }
        if (lbfVar instanceof lbf.b.d) {
            UiTracker uiTracker = UiTracker.a;
            new xxd(UiTracker.c(), a(), new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.SAVE_DRAFT)).q();
            return;
        }
        if (lbfVar instanceof lbf.c.a.d) {
            ClipInvolvementActionButton<?> clipInvolvementActionButton = ((ClipsUploadState.Loaded) getCurrentState()).b.e.f.b;
            if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket) {
                ClipInvolvementActionButton.VkTicket vkTicket = (ClipInvolvementActionButton.VkTicket) clipInvolvementActionButton;
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType.DELETE_ACTION_BUTTON;
                MobileOfficialAppsClipsStat$ClipsCreateContext a = a();
                ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = vkTicket.g;
                CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2 = (vkTicketParams == null || (str2 = vkTicketParams.b) == null) ? null : new CommonStat$TypeTrackCodeItem(str2);
                ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams2 = vkTicket.g;
                if (vkTicketParams2 != null && (wallActionButtonVkTicketSeanceDto = vkTicketParams2.e) != null && (str = wallActionButtonVkTicketSeanceDto.b) != null) {
                    commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str);
                }
                new stp0(c, new MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(eventType, a, null, new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem2, commonStat$TypeTrackCodeItem), 4, null)).q();
                return;
            }
            return;
        }
        if (lbfVar instanceof lbf.c.l.a) {
            new kze(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH, new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.OPEN_PRODUCT, a(), null, null, null, null, null, null, null, null, null, 2044, null)).q();
            return;
        }
        if (lbfVar instanceof lbf.c.l.b) {
            ArrayList<Good> arrayList = ((lbf.c.l.b) lbfVar).b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (Good good : arrayList) {
                String m = cqm0.m("MARKET_ITEM");
                StringBuilder sb = new StringBuilder();
                sb.append(good.c);
                sb.append('_');
                sb.append(good.b);
                arrayList2.add(new MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem(m, 0L, null, sb.toString(), null, null, null, null, 244, null));
            }
            UiTracker uiTracker3 = UiTracker.a;
            new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.PRODUCT_SELECT, a(), null, null, null, null, null, null, null, null, arrayList2, 1020, null)).q();
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        qef qefVar = (qef) pk50Var;
        if (qefVar instanceof qef.f) {
            UiTracker uiTracker = UiTracker.a;
            new kod(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_ACTION_BUTTON, a())).q();
        } else if (qefVar instanceof qef.c) {
            UiTracker uiTracker2 = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoCreateChannelClick(CommonVideoStat$TypeVideoCreateChannelClick.EventType.CLICK_CREATE_CHANNEL, null, CommonVideoStat$TypeVideoCreateChannelClick.Source.CLIP_PUBLISH_BLOCK, 2, null), 2)).q();
        }
    }

    public final MobileOfficialAppsClipsStat$ClipsCreateContext a() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        kbk context = this.c.getContext();
        int i = context != null ? context.b : -1;
        if (context == null || (creationEntryPoint = context.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        return new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint);
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final void o(yl50 yl50Var) {
        ugf ugfVar = (ugf) yl50Var;
        if (!(ugfVar instanceof ugf.f.c)) {
            if (ugfVar instanceof ugf.g.a) {
                UiTracker uiTracker = UiTracker.a;
                new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CHANGE_STORY, a(), new MobileOfficialAppsClipsStat$ChangeStory(((ugf.g.a) ugfVar).a), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null)).q();
                return;
            }
            return;
        }
        ClipsUploadUnmodifiableData clipsUploadUnmodifiableData = ((ugf.f.c) ugfVar).a.c;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a = wrp.a(clipsUploadUnmodifiableData.c);
        int i = clipsUploadUnmodifiableData.b;
        lbk lbkVar = this.c;
        if (lbkVar.getContext() == null) {
            lbkVar.j(new kbk(a, i, true, false));
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
