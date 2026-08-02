package xsna;

import android.content.Intent;
import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.k840;
import xsna.ws4;

/* compiled from: ServiceActionHandler.kt */
/* loaded from: classes3.dex */
public final class boi0 {
    public final kza0 a;
    public final jg8 b;
    public final PlayerService c;
    public final kd50 d;
    public final u2b0 e;
    public final bx40 f;
    public final u750 g;
    public io.reactivex.rxjava3.disposables.c h;
    public final ArrayList i;
    public final bpn0 j;

    /* compiled from: ServiceActionHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicPlayerAction.values().length];
            try {
                iArr[MusicPlayerAction.ACTION_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_NEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_NEXT_15.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_PREV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_PREV_15.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_PLAY_NEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_PLAY_UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_TOGGLE_SHUFFLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_SET_PODCAST_PLAYBACK_SPEED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_TOGGLE_REPEAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_SHOW_PLAYER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_ADD_CURRENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_LOAD_MORE_TRACKS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MusicPlayerAction.ACTION_RESTORE_PLAYBACK_QUEUE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boi0(kza0 kza0Var, jg8 jg8Var, PlayerService playerService, kd50 kd50Var, u2b0 u2b0Var, bx40 bx40Var) {
        this.a = kza0Var;
        this.b = jg8Var;
        this.c = playerService;
        this.d = kd50Var;
        this.e = u2b0Var;
        this.f = bx40Var;
        s750 s750Var = k840.a.e;
        this.g = s750Var == null ? null : s750Var;
        this.h = EmptyDisposable.INSTANCE;
        this.i = new ArrayList();
        this.j = new bpn0(new in60(this, 14));
    }

    public final void a(Intent intent) {
        this.i.add(intent);
    }

    public final ws4.a b(Intent intent) {
        boolean j = ((xch0) this.b.c).j();
        MusicTrack b = this.e.b();
        return new ws4.a(j, intent, b != null ? Boolean.valueOf(b.Tb()) : null);
    }

    public final ws4 c() {
        return (ws4) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Intent intent) {
        PlaybackActionMeta playbackActionMeta;
        int i;
        CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType;
        MusicTrack f;
        Object parcelableExtra;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        try {
            MusicPlayerAction valueOf = MusicPlayerAction.valueOf(action);
            String stringExtra = intent.getStringExtra("EXTRA_PAYLOAD");
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_NEED_TO_REWIND", true);
            if (gz80.a(33)) {
                parcelableExtra = intent.getParcelableExtra("EXTRA_ACTION_META", PlaybackActionMeta.class);
                playbackActionMeta = (PlaybackActionMeta) parcelableExtra;
            } else {
                playbackActionMeta = (PlaybackActionMeta) intent.getParcelableExtra("EXTRA_ACTION_META");
            }
            if (playbackActionMeta == null) {
                playbackActionMeta = new PlaybackActionMeta(-99, 0L, 2, null);
            }
            int i2 = playbackActionMeta.b;
            if (i2 != 24 && i2 != 25) {
                switch (i2) {
                }
                PlaybackActionMeta playbackActionMeta2 = playbackActionMeta;
                bn40.f("ServiceActionHandler onStartCommand ", "action: " + intent.getAction());
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("handle_intent");
                aVar.c("action", action);
                aVar.i("FirebaseTracker");
                bVar.k(aVar.e());
                i = a.$EnumSwitchMapping$0[valueOf.ordinal()];
                u2b0 u2b0Var = this.e;
                jg8 jg8Var = this.b;
                PlayerService playerService = this.c;
                u750 u750Var = this.g;
                kza0 kza0Var = this.a;
                switch (i) {
                    case 1:
                        bn40.f("ServiceActionHandler request: " + valueOf.name());
                        if (this.f.a && !playerService.k()) {
                            kza0Var.x(playbackActionMeta2.b, true);
                            kza0Var.F();
                        }
                        ws4 c = c();
                        if (c != null) {
                            ws4.a b = b(intent);
                            if (ws4.a(b)) {
                                c.a.k0(b.a ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_NOTICE_BLOCK, c.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        playerService.g = true;
                        bn40.f("ServiceActionHandler request: " + valueOf.name());
                        kza0Var.B(34, stringExtra, true);
                        kza0Var.e();
                        return;
                    case 3:
                        if (e()) {
                            kza0Var.L(playbackActionMeta2, stringExtra);
                        }
                        u750Var.f(intent, "resume_pause");
                        ws4 c2 = c();
                        if (c2 != null) {
                            ws4.a b2 = b(intent);
                            boolean h = u2b0Var.h();
                            boolean z = b2.a;
                            Intent intent2 = b2.b;
                            if (ws4.a(b2)) {
                                c2.a.k0(h ? ws4.b(intent2) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_SCREEN_WIDGET : z ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_NOTICE_BLOCK : ws4.b(intent2) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_SCREEN_WIDGET : z ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_NOTICE_BLOCK, c2.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        if (e()) {
                            kza0Var.M(false, playbackActionMeta2, stringExtra);
                        }
                        u750Var.f(intent, "resume_pause");
                        return;
                    case 5:
                        JSONObject jSONObject = stringExtra != null ? new JSONObject(stringExtra) : null;
                        String D = jSONObject != null ? f370.D(jSONObject, "action") : null;
                        if (D == null) {
                            D = "";
                        }
                        if (e() && (!jg8Var.a() || D.equals("dislike") || kza0Var.P())) {
                            kza0Var.z(playbackActionMeta2, "next", stringExtra, true);
                        }
                        u750Var.f(intent, "next_prev");
                        ws4 c3 = c();
                        if (c3 != null) {
                            ws4.a b3 = b(intent);
                            if (ws4.a(b3)) {
                                c3.a.k0(ws4.b(b3.b) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_SCREEN_WIDGET : b3.a ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_NOTICE_BLOCK, c3.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        if (e() && !jg8Var.a()) {
                            kza0Var.u(playbackActionMeta2, stringExtra);
                        }
                        u750Var.f(intent, "next_prev");
                        return;
                    case 7:
                        if (e() && !jg8Var.b() && !kza0Var.y(booleanExtra, playbackActionMeta2, stringExtra)) {
                            playerService.m();
                        }
                        u750Var.f(intent, "next_prev");
                        ws4 c4 = c();
                        if (c4 != null) {
                            ws4.a b4 = b(intent);
                            if (ws4.a(b4)) {
                                c4.a.k0(ws4.b(b4.b) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_SCREEN_WIDGET : b4.a ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_NOTICE_BLOCK, c4.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 8:
                        if (e() && !jg8Var.b() && !kza0Var.v(playbackActionMeta2, stringExtra)) {
                            playerService.m();
                        }
                        u750Var.f(intent, "next_prev");
                        return;
                    case 9:
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("MUSIC_FILES");
                        if (!e() || parcelableArrayListExtra == null) {
                            return;
                        }
                        StartPlaySource startPlaySource = (StartPlaySource) intent.getParcelableExtra("MUSIC_SOURCE");
                        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(intent.getStringExtra("LAUNCH_CONTEXT"));
                        boolean booleanExtra2 = intent.getBooleanExtra("NEED_ADD_TO_AND", false);
                        if (!kza0Var.E() || kza0Var.getState() == PlayState.IDLE || kza0Var.getState() == PlayState.STOPPED) {
                            this.a.D(parcelableArrayListExtra, null, Fb, 0, false, stringExtra, startPlaySource, PlaybackActionMeta.zb(playbackActionMeta2, parcelableArrayListExtra.size() == 1 ? -2 : parcelableArrayListExtra.size() > 1 ? -3 : 6, 0L, 2), null);
                            return;
                        } else {
                            kza0Var.w(startPlaySource, parcelableArrayListExtra, Fb, booleanExtra2);
                            return;
                        }
                    case 10:
                        String stringExtra2 = intent.getStringExtra(IronSourceConstants.TYPE_UUID);
                        boolean booleanExtra3 = intent.getBooleanExtra("PRESERVE_STATE", false);
                        String stringExtra3 = intent.getStringExtra("EXTRA_REASON");
                        if (stringExtra3 == null) {
                            stringExtra3 = "new";
                        }
                        String str = stringExtra3;
                        if (!e() || stringExtra2 == null || stringExtra2.length() == 0) {
                            return;
                        }
                        this.a.O(stringExtra2, booleanExtra3, str, playbackActionMeta2, stringExtra);
                        return;
                    case 11:
                        kza0Var.o();
                        ws4 c5 = c();
                        if (c5 != null) {
                            ws4.a b5 = b(intent);
                            boolean c6 = kza0Var.c();
                            boolean z2 = b5.a;
                            Intent intent3 = b5.b;
                            if (ws4.a(b5)) {
                                c5.a.k0(!c6 ? ws4.b(intent3) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_SCREEN_WIDGET : z2 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_NOTICE_BLOCK : ws4.b(intent3) ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_SCREEN_WIDGET : z2 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_NOTICE_BLOCK, c5.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 12:
                        kza0Var.s(intent.getFloatExtra("PLAYBACK_SPEED", 1.0f), intent.getBooleanExtra("SAVE_PLAYBACK_SPEED", false));
                        return;
                    case 13:
                        LoopMode.a aVar2 = LoopMode.Companion;
                        LoopMode a2 = kza0Var.a();
                        aVar2.getClass();
                        kza0Var.b(LoopMode.a.a(a2));
                        ws4 c7 = c();
                        if (c7 != null) {
                            ws4.a b6 = b(intent);
                            LoopMode a3 = kza0Var.a();
                            if (ws4.a(b6)) {
                                int i3 = ws4.b.$EnumSwitchMapping$0[a3.ordinal()];
                                if (i3 == 1) {
                                    eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_OFF_SCREEN_WIDGET;
                                } else if (i3 == 2) {
                                    eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ALL_SCREEN_WIDGET;
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eventType = CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ONE_SCREEN_WIDGET;
                                }
                                c7.a.k0(eventType, c7.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 14:
                        fl4 g = lyd.g();
                        int i4 = fl4.a;
                        g.x(playerService, false);
                        return;
                    case 15:
                        u750Var.f(intent, "add_music_track");
                        Event.a aVar3 = new Event.a();
                        aVar3.g("PLAYER_ADD_CURRENT_EVENT");
                        aVar3.b("music_build_version", Integer.valueOf(BuildInfo.e));
                        aVar3.f();
                        bVar.k(aVar3.e());
                        com.vk.music.player.f C = kza0Var.C();
                        if (C != null && (f = C.f()) != null) {
                            kd50 kd50Var = this.d;
                            if (kd50Var.i(f)) {
                                kd50Var.o1(f, u2b0Var.x0());
                            }
                        }
                        ws4 c8 = c();
                        if (c8 != null) {
                            ws4.a b7 = b(intent);
                            if (ws4.a(b7)) {
                                c8.a.k0(b7.a ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_NOTICE_BLOCK, c8.b);
                                return;
                            }
                            return;
                        }
                        return;
                    case 16:
                        kza0Var.A();
                        return;
                    case 17:
                        final boolean booleanExtra4 = intent.getBooleanExtra("EXTRA_NEED_RESET_STATE_ON_RESTORE", false);
                        if (booleanExtra4) {
                            kza0Var.e();
                        }
                        this.h = itg0.l(io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.aoi0
                            @Override // io.reactivex.rxjava3.functions.a
                            public final void run() {
                                boi0 boi0Var = boi0.this;
                                kza0 kza0Var2 = boi0Var.a;
                                boolean z3 = booleanExtra4;
                                kza0Var2.J(z3, new agk(boi0Var, z3, 1));
                            }
                        }).q(io.reactivex.rxjava3.schedulers.a.b()));
                        return;
                    default:
                        bn40.d("ServiceActionHandler Unhandled action received: " + intent.getAction());
                        return;
                }
            }
            playbackActionMeta = PlaybackActionMeta.zb(playbackActionMeta, 0, SystemClock.elapsedRealtime(), 1);
            PlaybackActionMeta playbackActionMeta22 = playbackActionMeta;
            bn40.f("ServiceActionHandler onStartCommand ", "action: " + intent.getAction());
            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
            el3 el3Var2 = Event.b;
            Event.a aVar4 = new Event.a();
            aVar4.g("handle_intent");
            aVar4.c("action", action);
            aVar4.i("FirebaseTracker");
            bVar2.k(aVar4.e());
            i = a.$EnumSwitchMapping$0[valueOf.ordinal()];
            u2b0 u2b0Var2 = this.e;
            jg8 jg8Var2 = this.b;
            PlayerService playerService2 = this.c;
            u750 u750Var2 = this.g;
            kza0 kza0Var2 = this.a;
            switch (i) {
            }
        } catch (IllegalArgumentException e) {
            bn40.c(e, new Object[0]);
        }
    }

    public final boolean e() {
        return ((xch0) this.b.c).i() && !this.c.k();
    }

    public final void f() {
        this.h.dispose();
    }
}
