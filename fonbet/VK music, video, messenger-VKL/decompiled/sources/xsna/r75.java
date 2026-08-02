package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCreateChannelClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoTypeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorItem;
import xsna.b85;
import xsna.h75;

/* compiled from: AuthorAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class r75 implements h7f0<AuthorState, h75, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> {
    public final AuthorArguments b;
    public final sl50<AuthorState, h75, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> c;

    public r75(AuthorArguments authorArguments, sl50<AuthorState, h75, on50, ll50<on50, bwj, dwj>, jl50<AuthorState>, b85> sl50Var) {
        this.b = authorArguments;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        if (((h75) lj50Var) instanceof h75.b) {
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoCreateChannelClick(CommonVideoStat$TypeVideoCreateChannelClick.EventType.CLICK_CREATE_CHANNEL, null, null, 6, null), 2)).q();
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        if (((b85) pk50Var) instanceof b85.a) {
            a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.CHANGE_AUTHOR);
        }
    }

    public final void a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        AuthorArguments authorArguments = this.b;
        AuthorItem authorItem = (AuthorItem) j5g.b0(authorArguments.c, authorArguments.b);
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, authorItem != null ? Long.valueOf(authorItem.d.b) : null, null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick(eventType, MobileOfficialAppsVideoStat$VideoTypeItem.VIDEO), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.rl50
    public final void init() {
        a(MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.EventType.AUTHOR_OPEN);
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
