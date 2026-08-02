package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMoviePageButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.dd30;
import xsna.wc30;

/* compiled from: MovieButtonsAnalyticsDelegate.kt */
/* loaded from: classes16.dex */
public final class xc30 {
    public final dd30.a a;

    public xc30(dd30.a aVar) {
        this.a = aVar;
    }

    public static void b(CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype eventSubtype) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoMoviePageButtonClick(CommonVideoStat$TypeVideoMoviePageButtonClick.EventType.BUTTON_CLICK, eventSubtype, null, 4, null), 2)).q();
    }

    public final void a(wc30 wc30Var) {
        CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype eventSubtype;
        if (wc30Var instanceof wc30.a) {
            return;
        }
        if (wc30Var instanceof wc30.b) {
            b(CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.WATCH);
            return;
        }
        if (!(wc30Var instanceof wc30.c)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean X = ((MovieButtonsBlockState) this.a.get()).f.X();
        if (X) {
            eventSubtype = CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.REMOVE_VIDEO;
        } else {
            if (X) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = CommonVideoStat$TypeVideoMoviePageButtonClick.EventSubtype.ADD_VIDEO;
        }
        b(eventSubtype);
    }
}
