package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import xsna.f0k;

/* compiled from: CoverChooseAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class g0k implements h7f0<CoverChooseState, f0k, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> {
    public final CoverChooseArguments.VideoCoverChooseArguments b;
    public final sl50<CoverChooseState, f0k, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> c;
    public final boolean d;

    public g0k(CoverChooseArguments.VideoCoverChooseArguments videoCoverChooseArguments, sl50<CoverChooseState, f0k, on50, ll50<on50, bwj, dwj>, jl50<CoverChooseState>, m0k> sl50Var) {
        this.b = videoCoverChooseArguments;
        this.c = sl50Var;
        this.d = videoCoverChooseArguments.c == null;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        if (((f0k) lj50Var) instanceof f0k.d.b) {
            MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick = new MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick(this.d ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.EventType.COVER_READY : MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.EventType.COVER_READY_EDIT);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
            CoverChooseArguments.VideoCoverChooseArguments videoCoverChooseArguments = this.b;
            new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, videoCoverChooseArguments.c != null ? Long.valueOf(r5.intValue()) : null, Long.valueOf(videoCoverChooseArguments.d.b), null, null, null, 56, null), mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick, 2)).q();
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        if (((m0k) pk50Var) instanceof k0k) {
            new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction(this.d ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.EventType.ERROR_CHOOSE_COVER : MobileOfficialAppsVideoStat$TypeVideoUploadCoverAction.EventType.ERROR_CHOOSE_COVER_EDIT), 3)).q();
        }
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.rl50
    public final void init() {
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto(this.d ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.EventType.APPLY_PHOTO : MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.EventType.APPLY_PHOTO_EDIT, this.b.e ? MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.PhotoOrientation.VERTICAL : MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.PhotoOrientation.HORIZONTAL, null, 4, null), 3)).q();
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
}
