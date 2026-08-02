package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicPreviewUrl;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostStartAudio;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.u780;
import xsna.vy40;

/* compiled from: OnMediaAudioAttachmentAnalytics.kt */
/* loaded from: classes4.dex */
public final class k780 {
    public final dx40 a;
    public final osj0 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public MusicPlaybackLaunchContext h;
    public final vy40 i = new vy40(new pw5(), new wdr0(null, new oqu(19)));
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new wb1(29));
    public final vy40.a k = new vy40.a(0);

    public k780(dx40 dx40Var, osj0 osj0Var, boolean z) {
        this.a = dx40Var;
        this.b = osj0Var;
        this.c = z;
    }

    public static MobileOfficialAppsFeedStat$FeedPostAudioItem a(Integer num, Long l, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType) {
        return new MobileOfficialAppsFeedStat$FeedPostAudioItem(num != null ? num.intValue() : 0, l != null ? l.longValue() : UserId.d.b, itemType);
    }

    public static void f(SchemeStat$TypeClick.b bVar, String str) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null), bVar, 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype subtype, Integer num, Long l, String str) {
        MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio = new MobileOfficialAppsFeedStat$TypeFeedPostStartAudio(subtype, new MobileOfficialAppsFeedStat$FeedPostAudioItem(num != null ? num.intValue() : 0, l != null ? l.longValue() : UserId.d.b, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO), str);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedPostStartAudio, 1)).q();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(boolean z, Integer num, Long l, String str) {
        MobileOfficialAppsFeedStat$FeedPostAudioItem a = a(num, l, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO);
        MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode = z ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL;
        u780 u780Var = (u780) this.j.getValue();
        if (u780Var.d != 0) {
            for (u780.a aVar : u780.a.h()) {
                if (aVar.i() > u780Var.d) {
                    u780.b(aVar, mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, a, str);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(long j, boolean z, Integer num, Long l, String str) {
        Object obj;
        Object obj2;
        MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype subtype;
        vy40 vy40Var = this.i;
        vy40.a aVar = this.k;
        vy40Var.c(j, aVar);
        MusicTrack musicTrack = aVar.b;
        if (musicTrack == null) {
            return;
        }
        MobileOfficialAppsFeedStat$FeedPostAudioItem a = a(num, l, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO);
        MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode = z ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL;
        u780 u780Var = (u780) this.j.getValue();
        long j2 = musicTrack.c0;
        u780Var.getClass();
        Integer valueOf = Integer.valueOf(a.a());
        boolean z2 = false;
        if (!epx.f(u780Var.a, valueOf) || j < u780Var.b) {
            u780Var.b = 0L;
            u780Var.c = 0L;
            u780Var.d = 0;
            u780Var.a = valueOf;
        }
        if (j - u780Var.b >= 1000) {
            u780Var.b = j;
            Iterator<E> it = u780.b.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long i = ((u780.b) obj).i();
                boolean z3 = j >= i ? true : z2;
                boolean z4 = i > u780Var.c;
                if (z3 && z4) {
                    break;
                } else {
                    z2 = false;
                }
            }
            u780.b bVar = (u780.b) obj;
            if (bVar != null) {
                u780Var.c = bVar.i();
                int i2 = u780.c.$EnumSwitchMapping$0[bVar.ordinal()];
                if (i2 == 1) {
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.SECONDS_3;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.Subtype.SECONDS_10;
                }
                u780.a(new MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio(mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, a, subtype, str));
            }
            int i3 = (int) ((j / j2) * 100);
            Iterator<E> it2 = u780.a.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it2.next();
                int i4 = ((u780.a) next).i();
                boolean z5 = i3 >= i4;
                boolean z6 = i4 > u780Var.d;
                if (z5 && z6) {
                    obj2 = next;
                    break;
                }
            }
            u780.a aVar2 = (u780.a) obj2;
            if (aVar2 != null) {
                u780Var.d = aVar2.i();
                u780.b(aVar2, mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, a, str);
            }
        }
    }

    public final void d() {
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
    }

    public final vy40.a e(String str) {
        dx40 dx40Var = this.a;
        String h = dx40Var.h();
        vy40.a aVar = this.k;
        aVar.a = h;
        osj0 osj0Var = this.b;
        aVar.b = osj0Var.i();
        aVar.g = osj0Var.i().f;
        aVar.j = str;
        aVar.k = null;
        aVar.d = LoopMode.TRACK;
        aVar.e = false;
        dx40 dx40Var2 = osj0Var.c;
        aVar.i = dx40Var2.getState().j() ? PlayState.PLAYING : dx40Var2.getState().i() ? PlayState.PAUSED : PlayState.IDLE;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.h;
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        }
        aVar.l = musicPlaybackLaunchContext;
        com.vk.core.utils.newtork.b.a.getClass();
        aVar.m = com.vk.core.utils.newtork.b.d();
        aVar.n = dx40Var.C();
        aVar.o = dx40Var.b();
        return aVar;
    }

    public final void g() {
        boolean z = this.e;
        vy40 vy40Var = this.i;
        if (z) {
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.h;
            this.h = MusicPlaybackLaunchContext.C;
            vy40Var.f(e("pause"), null);
            this.h = musicPlaybackLaunchContext;
        } else if (this.d) {
            vy40Var.f(e("pause"), null);
        } else if (this.c) {
            vy40Var.f(e("auto"), null);
        } else {
            vy40Var.f(e("pause"), null);
        }
        d();
    }

    public final void h(long j, MusicTrack musicTrack) {
        MusicPreviewUrl musicPreviewUrl = musicTrack.Y;
        boolean z = j == (musicPreviewUrl != null ? (long) musicPreviewUrl.c : 0L);
        boolean z2 = this.f;
        vy40 vy40Var = this.i;
        if ((z2 && this.c) || this.g) {
            vy40Var.e(e("auto"), null);
        } else if (z) {
            vy40Var.e(e("new"), null);
        } else if (this.d) {
            vy40Var.e(e("pause"), null);
        } else {
            vy40Var.e(e("auto"), null);
        }
        d();
    }

    public final void i() {
        boolean z = this.e;
        vy40 vy40Var = this.i;
        if (z) {
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.h;
            this.h = MusicPlaybackLaunchContext.C;
            vy40Var.f(e("pause"), null);
            this.h = musicPlaybackLaunchContext;
        } else if (this.g) {
            vy40Var.f(e("stop"), null);
            d();
            this.g = true;
            return;
        } else if (this.c) {
            vy40Var.f(e("auto"), null);
        } else {
            vy40Var.f(e("pause"), null);
        }
        d();
    }
}
