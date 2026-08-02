package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoTypeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionArguments;
import xsna.k1m;

/* compiled from: DescriptionAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class q1m implements h7f0<DescriptionState, k1m, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> {
    public final DescriptionArguments b;
    public final sl50<DescriptionState, k1m, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> c;

    public q1m(DescriptionArguments descriptionArguments, sl50<DescriptionState, k1m, on50, ll50<on50, bwj, dwj>, jl50<DescriptionState>, w1m> sl50Var) {
        this.b = descriptionArguments;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        k1m k1mVar = (k1m) lj50Var;
        if ((k1mVar instanceof k1m.b) || (k1mVar instanceof k1m.a)) {
            if (epx.f(((DescriptionState) getCurrentState()).c, this.b.b)) {
                a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.EXIT_DESCRIPTION);
            }
        } else if ((k1mVar instanceof k1m.e.b) || (k1mVar instanceof k1m.e.c)) {
            a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.EXIT_DESCRIPTION_NO_SAVE);
        } else if (k1mVar instanceof k1m.c) {
            a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.SAVE_DESCRIPTION);
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    public final void a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        DescriptionArguments descriptionArguments = this.b;
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, descriptionArguments.c != null ? Long.valueOf(r5.intValue()) : null, Long.valueOf(descriptionArguments.d.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick(eventType, MobileOfficialAppsVideoStat$VideoTypeItem.VIDEO), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.rl50
    public final void init() {
        a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.OPEN_DESCRIPTION);
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
