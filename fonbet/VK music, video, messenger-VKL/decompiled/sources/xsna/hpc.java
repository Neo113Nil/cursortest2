package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipUploadSettingItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$VkTicket;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Collections;
import xsna.fpc;
import xsna.npc;

/* compiled from: ClipCtaWithDonutMviAnalyticsMiddleware.kt */
/* loaded from: classes16.dex */
public final class hpc implements h7f0<ppc, fpc, on50, xpc, npc, mpc> {
    public final sl50<ppc, fpc, on50, xpc, npc, mpc> b;
    public final lbk c;

    public hpc(sl50<ppc, fpc, on50, xpc, npc, mpc> sl50Var, lbk lbkVar, String str, int i) {
        this.b = sl50Var;
        this.c = lbkVar;
        if (lbkVar.getContext() == null) {
            lbkVar.j(new kbk(wrp.a(str), i, true, false));
        }
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        ClipInvolvementActionButton.VkTicket.WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto;
        String str;
        String str2;
        if ((((fpc) lj50Var) instanceof fpc.a) && (((ppc) getCurrentState()).b instanceof ClipInvolvementActionButton.VkTicket)) {
            ClipInvolvementActionButton.VkTicket vkTicket = (ClipInvolvementActionButton.VkTicket) ((ppc) getCurrentState()).b;
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType.DELETE_ACTION_BUTTON;
            MobileOfficialAppsClipsStat$ClipsCreateContext a = a();
            ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = vkTicket.g;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = null;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2 = (vkTicketParams == null || (str2 = vkTicketParams.b) == null) ? null : new CommonStat$TypeTrackCodeItem(str2);
            ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams2 = vkTicket.g;
            if (vkTicketParams2 != null && (wallActionButtonVkTicketSeanceDto = vkTicketParams2.e) != null && (str = wallActionButtonVkTicketSeanceDto.b) != null) {
                commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str);
            }
            new stp0(c, new MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(eventType, a, Collections.singletonList(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_VK_TICKET_ENABLED, true)), new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem2, commonStat$TypeTrackCodeItem))).q();
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        if (((mpc) pk50Var) instanceof kpc) {
            UiTracker uiTracker = UiTracker.a;
            new stp0(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType.TRANSITION_TO_BUTTON_DETAILS, a(), Collections.singletonList(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_VK_TICKET_ENABLED, true)), null, 8, null)).q();
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
        ClipInvolvementActionButton.VkTicket.WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto;
        String str;
        String str2;
        npc npcVar = (npc) yl50Var;
        if (npcVar instanceof npc.c) {
            ClipInvolvementActionButton<?> clipInvolvementActionButton = ((npc.c) npcVar).a;
            if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket) {
                ClipInvolvementActionButton.VkTicket vkTicket = (ClipInvolvementActionButton.VkTicket) clipInvolvementActionButton;
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem.EventType.ATTACH_ACTION_BUTTON;
                MobileOfficialAppsClipsStat$ClipsCreateContext a = a();
                ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = vkTicket.g;
                CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = null;
                CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2 = (vkTicketParams == null || (str2 = vkTicketParams.b) == null) ? null : new CommonStat$TypeTrackCodeItem(str2);
                ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams2 = vkTicket.g;
                if (vkTicketParams2 != null && (wallActionButtonVkTicketSeanceDto = vkTicketParams2.e) != null && (str = wallActionButtonVkTicketSeanceDto.b) != null) {
                    commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str);
                }
                new stp0(c, new MobileOfficialAppsClipsStat$TypeClipsCreationScreenButtonsItem(eventType, a, Collections.singletonList(new MobileOfficialAppsClipsStat$ClipUploadSettingItem(MobileOfficialAppsClipsStat$ClipUploadSettingItem.Name.IS_VK_TICKET_ENABLED, true)), new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem2, commonStat$TypeTrackCodeItem))).q();
            }
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
