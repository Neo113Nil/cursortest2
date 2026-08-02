package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerMode;
import com.vk.music.stickyplayer.domain.CoverSwipeDirection;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MusicClickStatSender.kt */
/* loaded from: classes3.dex */
public final class jf40 implements yza0 {
    public final u750 a;
    public final x2b0 b;
    public boolean c;
    public boolean d;
    public final PlayerMode e = PlayerMode.AUDIO;

    /* compiled from: MusicClickStatSender.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PlayerContext.values().length];
            try {
                iArr[PlayerContext.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerContext.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerContext.MINI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerContext.MINI_STANDALONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoopMode.values().length];
            try {
                iArr2[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoopMode.TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CoverSwipeDirection.values().length];
            try {
                iArr3[CoverSwipeDirection.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CoverSwipeDirection.Prev.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public jf40(u750 u750Var, x2b0 x2b0Var) {
        this.a = u750Var;
        this.b = x2b0Var;
    }

    @Override // xsna.yza0
    public final void A() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MIX_TRACK_CHIPS, this.e);
    }

    @Override // xsna.yza0
    public final void B() {
        if (!this.d) {
            this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_TEXT, this.e);
        }
        this.d = false;
        this.c = false;
    }

    @Override // xsna.yza0
    public final void C(boolean z) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        if (z) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void D() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_TO_PLAYLIST_CHIPS, this.e);
        this.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
    }

    @Override // xsna.yza0
    public final void E() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHARE_TRACK, this.e);
    }

    @Override // xsna.yza0
    public final void F() {
        this.c = true;
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void G(boolean z) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        if (z) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_UNHATE_CHIPS;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_HATE_CHIPS;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void H() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_QUEUE_TO_PLAYLIST_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void a(boolean z) {
        PlayerMode playerMode = this.e;
        u750 u750Var = this.a;
        if (z) {
            u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SET_VK_MIX, playerMode);
            return;
        }
        u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_SOURCE_TRACK, playerMode);
        this.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
    }

    @Override // xsna.yza0
    public final void b(PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i = a.$EnumSwitchMapping$0[playerContext.ordinal()];
        if (i == 1 || i == 2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MENU;
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MENU_MINI_PLAYER;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void c() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SET_VK_MIX_CHIPS, this.e);
    }

    @Override // xsna.yza0
    public final void d(CoverSwipeDirection coverSwipeDirection) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i = a.$EnumSwitchMapping$2[coverSwipeDirection.ordinal()];
        if (i == 1) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_NEXT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_PREV;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void e(LoopMode loopMode) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        LoopMode.Companion.getClass();
        int i = a.$EnumSwitchMapping$1[LoopMode.a.a(loopMode).ordinal()];
        if (i == 1) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_OFF;
        } else if (i == 2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ALL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ONE;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void f() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CLOSE_MINI_PLAYER, this.e);
    }

    @Override // xsna.yza0
    public final void g(int i) {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_TRACK_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void h(int i, PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i2 = a.$EnumSwitchMapping$0[playerContext.ordinal()];
        if (i2 == 1) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE;
        } else if (i2 == 2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_QUEUE;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_MINI_PLAYER;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void i(MusicTrack musicTrack, PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i = a.$EnumSwitchMapping$0[playerContext.ordinal()];
        if (i == 1) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY;
        } else if (i == 2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_QUEUE;
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_MINI_PLAYER;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void k(boolean z, PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        if (z) {
            int i = a.$EnumSwitchMapping$0[playerContext.ordinal()];
            if (i == 1) {
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC;
            } else if (i == 2) {
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_QUEUE;
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_MINI_PLAYER;
            }
        } else {
            int i2 = a.$EnumSwitchMapping$0[playerContext.ordinal()];
            if (i2 == 1) {
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_MY_MUSIC;
            } else if (i2 == 2) {
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_MY_MUSIC_QUEUE;
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_MY_MUSIC_MINI_PLAYER;
            }
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void l() {
        if (!this.c) {
            this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_QUEUE, this.e);
        }
        this.c = false;
        this.d = false;
    }

    @Override // xsna.yza0
    public final void m(boolean z, boolean z2, boolean z3) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        if (z) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_CACHE_CHIPS;
        } else if (!z2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_NO_SUBSCRIBE_CHIPS;
        } else if (z3) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_CACHE_CHIPS;
        } else {
            if (z3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_ONLINE_CACHE_CHIPS;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void o() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_TRACK_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void p() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_ARTIST, this.e);
        this.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
    }

    @Override // xsna.yza0
    public final void q(int i, PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i2 = a.$EnumSwitchMapping$0[playerContext.ordinal()];
        if (i2 == 1) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT;
        } else if (i2 == 2) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_QUEUE;
        } else if (i2 == 3) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_MINI_PLAYER;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_NEXT_MINI_PLAYER;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void r() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MINIPLAYER_DOWN, this.e);
        this.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
    }

    @Override // xsna.yza0
    public final void s() {
        this.d = true;
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TEXT, this.e);
    }

    @Override // xsna.yza0
    public final void t(int i, PlayerContext playerContext) {
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        int i2 = a.$EnumSwitchMapping$0[playerContext.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_PREV_MINI_PLAYER;
        }
        this.a.k0(eventType, this.e);
    }

    @Override // xsna.yza0
    public final void u(int i, int i2) {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_TRACK_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void v() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.LONGTAP_CHANGE_QUEUE_QUEUE, this.e);
    }

    @Override // xsna.yza0
    public final void w() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_MINI_PLAYER, this.e);
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        x2b0 x2b0Var = this.b;
        x2b0Var.a(mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        x2b0.c(x2b0Var, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, 13);
    }

    @Override // xsna.yza0
    public final void x() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMELINE, this.e);
    }

    @Override // xsna.yza0
    public final void y() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SET_CHIPS, this.e);
    }

    @Override // xsna.yza0
    public final void j() {
    }

    @Override // xsna.yza0
    public final void n() {
    }

    @Override // xsna.yza0
    public final void z() {
    }
}
