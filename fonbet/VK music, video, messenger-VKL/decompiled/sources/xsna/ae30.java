package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMoviePageButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.be30;
import xsna.de30;

/* compiled from: MovieInfoAnalyticsDelegate.kt */
/* loaded from: classes16.dex */
public final class ae30 {
    public final be30.a a;

    public ae30(be30.a aVar) {
        this.a = aVar;
    }

    public final void a(de30 de30Var) {
        CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype eventSubtype;
        if (!(de30Var instanceof de30.a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = ((MovieInfoView$MovieInfoBlockState) this.a.get()).p;
        if (z) {
            eventSubtype = CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.DETAILS_CLOSE;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.DETAILS_OPEN;
        }
        CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype eventSubtype2 = eventSubtype;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoMoviePageButtonClick(CommonVideoStat$TypeVideoMoviePageButtonClick.EventType.BUTTON_CLICK, eventSubtype2, null, 4, null), 2)).q();
    }
}
