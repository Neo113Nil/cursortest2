package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.Collections;
import xsna.bp40;

/* compiled from: MusicTapsTrackerImpl.kt */
/* loaded from: classes.dex */
public final class x950 implements w950, bp40 {
    public final /* synthetic */ cp40 a = new cp40();

    public static void O(String str, CommonAudioStat$TypeAudioUiClickItem.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 46, null);
        long a = qni0.a();
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = null;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonAudioStat$TypeAudioUiClickItem(eventType, new CommonAudioStat$TypeAudioDomainEventItem(a, commonStat$TypeCommonEventItem, null, null, null, null, null, null, null, 510, null), null, 4, null), 2)).q();
    }

    @Override // xsna.w950
    public final void A(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_OFFLINE_LIBRARY);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        w950.p(this, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY, null, 5);
    }

    @Override // xsna.w950
    public final void B(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_FILTER);
    }

    @Override // xsna.w950
    public final void C(String str, boolean z) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType = z ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 46, null), new CommonAudioStat$TypeAudioPlayerUiClickItem(eventType, new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, null, 510, null)), 2)).q();
    }

    @Override // xsna.w950
    public final void D(String str, boolean z) {
        O(str, z ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_POPULAR_SEARCH_PLACEHOLDER : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_SEARCH_SUGGESTION);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC, null);
    }

    @Override // xsna.w950
    public final void E(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str2) {
        N(str, mobileOfficialAppsCoreNavStat$EventScreen, str2);
    }

    @Override // xsna.w950
    public final void F(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_ADD_PLAYLIST);
    }

    @Override // xsna.w950
    public final void G(String str, boolean z) {
        O(str, z ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PLAYLIST);
    }

    @Override // xsna.w950
    public final void H(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PLAYLIST);
    }

    @Override // xsna.w950
    public final void I(String str, boolean z) {
        O(str, z ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_SEARCH_BY_VOICE : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_SEARCH);
    }

    @Override // xsna.w950
    public final void J(String str, CommonAudioStat$TypeAudioUiClickItem.EventType eventType) {
        O(str, eventType);
    }

    @Override // xsna.w950
    public final void K(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_SHOW_MORE);
    }

    @Override // xsna.w950
    public final void L(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PAUSE);
    }

    @Override // xsna.w950
    public final void M(String str, CommonAudioStat$TypeAudioUiClickItem.EventType eventType) {
        if (eventType == null) {
            eventType = CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO;
        }
        O(str, eventType);
    }

    public final void N(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str2) {
        CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType;
        bp40.a aVar;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        SchemeStat$TypeNavgo a;
        cp40 cp40Var = this.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = cp40Var.b;
        String str3 = cp40Var.a;
        if ((mobileOfficialAppsCoreNavStat$EventScreen3 == null && str3 == null) || (eventType = cp40Var.c) == null) {
            aVar = null;
        } else {
            if (mobileOfficialAppsCoreNavStat$EventScreen3 == null) {
                mobileOfficialAppsCoreNavStat$EventScreen3 = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
            }
            aVar = new bp40.a(new CommonAudioStat$TypeAudioUiNavigationItem(eventType), str3, mobileOfficialAppsCoreNavStat$EventScreen3);
            cp40Var.b = null;
            cp40Var.c = null;
            cp40Var.a = null;
        }
        if (aVar == null) {
            return;
        }
        MobileOfficialAppsCoreNavStat$EventScreen b = aVar.b();
        SchemeStat$TypeNavgo.Subtype subtype = SchemeStat$TypeNavgo.Subtype.GO;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen2 = UiTracker.c();
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        String str4 = new String();
        CommonAudioStat$TypeAudioUiNavigationItem c = aVar.c();
        String a2 = aVar.a();
        a = SchemeStat$TypeNavgo.a.a(subtype, mobileOfficialAppsCoreNavStat$EventScreen2, str4, null, a2 != null ? new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, a2, null, 46, null) : null, (r18 & 32) != 0 ? null : Collections.singletonList(SchemeStat$NavigationScreenInfoItem.a.a(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, null, 510, null))), (r18 & 64) != 0 ? null : (str == null && str2 == null) ? null : new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, str2, str, null, 38, null), null, c);
        new ne50(b, a).q();
    }

    @Override // xsna.w950
    public final void a(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_ADD);
    }

    @Override // xsna.w950
    public final void b(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_BOOKS_AND_SHOWS);
    }

    @Override // xsna.w950
    public final void c(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PAUSE);
    }

    @Override // xsna.w950
    public final void d(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_CLOSE_BY_CROSS);
    }

    @Override // xsna.w950
    public final void e(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_START_TRACK);
    }

    @Override // xsna.w950
    public final void f(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_ARTIST);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_ARTIST, null);
    }

    @Override // xsna.w950
    public final void g(String str, String str2, boolean z) {
        O(str, z ? CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO : CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_TAB_BAR);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(str2, null, null);
    }

    @Override // xsna.w950
    public final void h(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY);
    }

    @Override // xsna.w950
    public final void i(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.SWIPE_SET);
    }

    @Override // xsna.w950
    public final void j(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_KEYBOARD_SEARCH);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC, null);
    }

    @Override // xsna.w950
    public final void k(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_MENU_OPEN_PLAYLIST);
    }

    @Override // xsna.w950
    public final void l(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY);
    }

    @Override // xsna.w950
    public final void m(String str, CommonAudioStat$TypeAudioUiClickItem.EventType eventType) {
        O(str, eventType);
    }

    @Override // xsna.w950
    public final void n(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_START_PODCAST);
    }

    @Override // xsna.w950
    public final void o(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PAUSE);
    }

    @Override // xsna.w950
    public final void q(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_SET);
    }

    @Override // xsna.w950
    public final void r(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_RECENT_SEARCH_PLACEHOLDER);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC, null);
    }

    @Override // xsna.w950
    public final void s(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PAUSE);
    }

    @Override // xsna.bp40
    public final void t(String str, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType) {
        this.a.t(str, eventType);
    }

    @Override // xsna.w950
    public final void u(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_PAUSE);
    }

    @Override // xsna.w950
    public final void v(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_AUDIOBOOK);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_BOOK_PAGE, null);
    }

    @Override // xsna.w950
    public final void w(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_FEED_UPDATES);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO_TOOLBAR);
    }

    @Override // xsna.w950
    public final void x(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_MENU_OPEN_PODCAST);
    }

    @Override // xsna.w950
    public final void y(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_PODCAST);
        t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
        N(null, MobileOfficialAppsCoreNavStat$EventScreen.PODCAST_PAGE, null);
    }

    @Override // xsna.w950
    public final void z(String str) {
        O(str, CommonAudioStat$TypeAudioUiClickItem.EventType.PLAY_FASTPLAY_VIBE);
    }
}
