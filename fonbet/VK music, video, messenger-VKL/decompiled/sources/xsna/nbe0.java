package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoTypeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.dbe0;
import xsna.sbe0;

/* compiled from: PublishAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class nbe0 implements h7f0<PublishState, dbe0, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> {
    public final sl50<PublishState, dbe0, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> b;

    public nbe0(sl50<PublishState, dbe0, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> sl50Var) {
        this.b = sl50Var;
    }

    public static void a(boolean z) {
        MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.EventType eventType = z ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.EventType.ERROR_CHOOSE_COVER : MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.EventType.ERROR_CHOOSE_COVER_EDIT;
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction(eventType), 3)).q();
    }

    public static void g(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType eventType, long j) {
        UiTracker uiTracker = UiTracker.a;
        String str = null;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, Long.valueOf(j), null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(eventType, str, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventSubtype.POSTPONED, 2, null), 2)).q();
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        PublishState.Edit j;
        VideoFile videoFile;
        VideoFile videoFile2;
        VideoFile videoFile3;
        dbe0 dbe0Var = (dbe0) lj50Var;
        if ((dbe0Var instanceof dbe0.d) || (dbe0Var instanceof dbe0.p)) {
            PublishState.Edit j2 = ((PublishState) getCurrentState()).j();
            if (j2 == null || !j2.Z1()) {
                e(MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.EventType.TRY_TO_EXIT);
                return;
            } else {
                c(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.TRY_TO_EXIT_DRAFT);
                return;
            }
        }
        Long l = null;
        if (dbe0Var instanceof dbe0.f.b) {
            PublishState.Edit j3 = ((PublishState) getCurrentState()).j();
            if (j3 != null && (videoFile3 = j3.b) != null) {
                l = Long.valueOf(videoFile3.o0());
            }
            Long l2 = l;
            long j4 = ((PublishState) getCurrentState()).h.b;
            MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.EventType eventType = l2 == null ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.EventType.CHOOSE_COVER : MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.EventType.CHOOSE_COVER_EDIT;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, l2, Long.valueOf(j4), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick(eventType), 2)).q();
            return;
        }
        boolean z = false;
        if (dbe0Var instanceof dbe0.f.c) {
            a(((PublishState) getCurrentState()).o() != null);
            return;
        }
        if (dbe0Var instanceof dbe0.i) {
            dbe0.i iVar = (dbe0.i) dbe0Var;
            if (iVar instanceof lbe0) {
                h(MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventType.OPEN_PRIVACY, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventSubtype.VIEWS, null);
                return;
            }
            if (iVar instanceof mbe0) {
                h(MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventType.SAVE_PRIVACY, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventSubtype.VIEWS, ((mbe0) iVar).b);
                return;
            } else if (iVar instanceof jbe0) {
                h(MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventType.OPEN_PRIVACY, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventSubtype.COMMENTS, null);
                return;
            } else {
                if (!(iVar instanceof kbe0)) {
                    throw new NoWhenBranchMatchedException();
                }
                h(MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventType.SAVE_PRIVACY, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventSubtype.COMMENTS, ((kbe0) iVar).b);
                return;
            }
        }
        if (dbe0Var instanceof dbe0.j.d) {
            MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType eventType2 = MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.RESET_POSTPONED_TIME;
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
            PublishState.Edit j5 = ((PublishState) getCurrentState()).j();
            if (j5 != null && (videoFile2 = j5.b) != null) {
                l = Long.valueOf(videoFile2.o0());
            }
            new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, l, Long.valueOf(((PublishState) getCurrentState()).h.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick(eventType2, MobileOfficialAppsVideoStat$VideoTypeItem.VIDEO), 2)).q();
            return;
        }
        if (!(dbe0Var instanceof dbe0.e.b)) {
            if (dbe0Var instanceof dbe0.k) {
                c(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.SAVE_DRAFT);
                return;
            }
            if (dbe0Var instanceof dbe0.h) {
                dbe0.h hVar = (dbe0.h) dbe0Var;
                if ((hVar instanceof dbe0.h.b) || ((hVar instanceof dbe0.h.c) && ((PublishState) getCurrentState()).K)) {
                    z = true;
                }
                PublishState.Edit j6 = ((PublishState) getCurrentState()).j();
                if (j6 == null || !j6.Z1()) {
                    e(!z ? MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.EventType.RETURN_TO_UPLOAD : ((PublishState) getCurrentState()).j() != null ? MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.EventType.EXIT_FROM_EDIT : MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.EventType.EXIT_FROM_UPLOAD);
                    return;
                } else {
                    if (z) {
                        c(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.EXIT_FROM_DRAFT);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        PublishState.Block block = ((PublishState) getCurrentState()).b;
        if (block instanceof PublishState.Upload) {
            if (((PublishState) getCurrentState()).n == null) {
                return;
            }
            g(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.CREATE_POSTPONED, ((PublishState) getCurrentState()).h.b);
            return;
        }
        if (!(block instanceof PublishState.Edit)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((PublishState.Edit) block).Z1()) {
            c(((PublishState) getCurrentState()).n != null ? MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.DRAFT_AS_POSTPONED : MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.PUBLISH_DRAFT);
            return;
        }
        if (!((PublishState) getCurrentState()).m || (j = ((PublishState) getCurrentState()).j()) == null || (videoFile = j.b) == null) {
            return;
        }
        Date date = ((PublishState) getCurrentState()).n;
        if (date == null) {
            g(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.PUBLISH_POSTPONED, ((PublishState) getCurrentState()).h.b);
        } else if (videoFile.k1() != TimeUnit.MILLISECONDS.toSeconds(date.getTime())) {
            g(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.CHANGE_POSTPONED, ((PublishState) getCurrentState()).h.b);
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        if (((sbe0) pk50Var) instanceof sbe0.l) {
            a(((PublishState) getCurrentState()).o() != null);
        }
    }

    public final void c(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType eventType) {
        VideoFile videoFile;
        UserId I0;
        VideoFile videoFile2;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        PublishState.Edit j = ((PublishState) getCurrentState()).j();
        Long l = null;
        Long valueOf = (j == null || (videoFile2 = j.b) == null) ? null : Long.valueOf(videoFile2.o0());
        PublishState.Edit j2 = ((PublishState) getCurrentState()).j();
        if (j2 != null && (videoFile = j2.b) != null && (I0 = videoFile.I0()) != null) {
            l = Long.valueOf(I0.b);
        }
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, valueOf, l, null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoDraftClick(eventType, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype.DRAFT), 2)).q();
    }

    public final void e(MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog.EventType eventType) {
        VideoFile videoFile;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        PublishState.Edit j = ((PublishState) getCurrentState()).j();
        new iid0(c, SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(type, (j == null || (videoFile = j.b) == null) ? null : Long.valueOf(videoFile.o0()), Long.valueOf(((PublishState) getCurrentState()).h.b), null, null, null, 56, null), null, new MobileOfficialAppsVideoStat$TypeUploadExitConfirmationDialog(eventType, MobileOfficialAppsVideoStat$VideoTypeItem.VIDEO), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    public final void h(MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventType eventType, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.EventSubtype eventSubtype, PrivacySetting privacySetting) {
        VideoFile videoFile;
        List<PrivacySetting.PrivacyRule> list;
        PrivacySetting.PrivacyRule privacyRule;
        Long l = null;
        String str = (privacySetting == null || (list = privacySetting.e) == null || (privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(list)) == null) ? null : (String) j5g.a0(privacyRule.zb());
        MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue objectValue = epx.f(str, PrivacyRules.a.d) ? MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue.ALL_USERS : epx.f(str, PrivacyRules.d.d) ? MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue.FOLLOWERS : epx.f(str, PrivacyRules.g.d) ? MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue.ADMINS_AND_EDITORS : epx.f(str, PrivacyRules.f.d) ? MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue.DONS : epx.f(str, PrivacyRules.e.d) ? MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.ObjectValue.HAS_LINK : null;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        PublishState.Edit j = ((PublishState) getCurrentState()).j();
        if (j != null && (videoFile = j.b) != null) {
            l = Long.valueOf(videoFile.o0());
        }
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, l, Long.valueOf(((PublishState) getCurrentState()).h.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick(eventType, MobileOfficialAppsVideoStat$VideoTypeItem.VIDEO, eventSubtype, objectValue), 2)).q();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
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
