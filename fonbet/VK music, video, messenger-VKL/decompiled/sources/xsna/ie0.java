package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerMode;
import com.vk.music.stickyplayer.domain.CoverSwipeDirection;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdClickStatSender.kt */
/* loaded from: classes3.dex */
public final class ie0 implements yza0 {
    public final u750 a;
    public boolean b;
    public boolean c;
    public final PlayerMode d = PlayerMode.ADVERTISEMENT;

    /* compiled from: AdClickStatSender.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public ie0(u750 u750Var) {
        this.a = u750Var;
    }

    @Override // xsna.yza0
    public final void B() {
        if (!this.c) {
            this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_TEXT, this.d);
        }
        this.c = false;
        this.b = false;
    }

    @Override // xsna.yza0
    public final void F() {
        this.b = true;
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_QUEUE, this.d);
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
        this.a.k0(eventType, this.d);
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
        this.a.k0(eventType, this.d);
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
        this.a.k0(eventType, this.d);
    }

    @Override // xsna.yza0
    public final void j() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_BUTTON, this.d);
    }

    @Override // xsna.yza0
    public final void l() {
        if (!this.b) {
            this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_QUEUE, this.d);
        }
        this.b = false;
        this.c = false;
    }

    @Override // xsna.yza0
    public final void n() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_BANNER, this.d);
    }

    @Override // xsna.yza0
    public final void r() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MINIPLAYER_DOWN, this.d);
    }

    @Override // xsna.yza0
    public final void s() {
        this.c = true;
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TEXT, this.d);
    }

    @Override // xsna.yza0
    public final void w() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_MINI_PLAYER, this.d);
    }

    @Override // xsna.yza0
    public final void z() {
        this.a.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DISABLE_ADS, this.d);
    }

    @Override // xsna.yza0
    public final void A() {
    }

    @Override // xsna.yza0
    public final void D() {
    }

    @Override // xsna.yza0
    public final void E() {
    }

    @Override // xsna.yza0
    public final void H() {
    }

    @Override // xsna.yza0
    public final void c() {
    }

    @Override // xsna.yza0
    public final void f() {
    }

    @Override // xsna.yza0
    public final void o() {
    }

    @Override // xsna.yza0
    public final void p() {
    }

    @Override // xsna.yza0
    public final void v() {
    }

    @Override // xsna.yza0
    public final void x() {
    }

    @Override // xsna.yza0
    public final void y() {
    }

    @Override // xsna.yza0
    public final void C(boolean z) {
    }

    @Override // xsna.yza0
    public final void G(boolean z) {
    }

    @Override // xsna.yza0
    public final void a(boolean z) {
    }

    @Override // xsna.yza0
    public final void d(CoverSwipeDirection coverSwipeDirection) {
    }

    @Override // xsna.yza0
    public final void e(LoopMode loopMode) {
    }

    @Override // xsna.yza0
    public final void g(int i) {
    }

    @Override // xsna.yza0
    public final void k(boolean z, PlayerContext playerContext) {
    }

    @Override // xsna.yza0
    public final void q(int i, PlayerContext playerContext) {
    }

    @Override // xsna.yza0
    public final void t(int i, PlayerContext playerContext) {
    }

    @Override // xsna.yza0
    public final void u(int i, int i2) {
    }

    @Override // xsna.yza0
    public final void m(boolean z, boolean z2, boolean z3) {
    }
}
