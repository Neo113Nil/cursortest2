package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.media.player.VideoMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeCastEventItem;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: VKCastActionStatisticsLogger.kt */
/* loaded from: classes.dex */
public final class dbr0 extends fz9 {
    public static final dbr0 a = new dbr0();
    public static a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKCastActionStatisticsLogger.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PLAYER_STATE_IDLE_REASON_ERROR;
        public static final a SESSION_ENDED;
        public static final a SESSION_STARTED;
        public static final a VIDEO_FINISHED;
        public static final a VIDEO_PAUSED;
        public static final a VIDEO_PLAYED;

        static {
            a aVar = new a("SESSION_STARTED", 0);
            SESSION_STARTED = aVar;
            a aVar2 = new a("VIDEO_PLAYED", 1);
            VIDEO_PLAYED = aVar2;
            a aVar3 = new a("VIDEO_PAUSED", 2);
            VIDEO_PAUSED = aVar3;
            a aVar4 = new a("VIDEO_FINISHED", 3);
            VIDEO_FINISHED = aVar4;
            a aVar5 = new a("SESSION_ENDED", 4);
            SESSION_ENDED = aVar5;
            a aVar6 = new a("PLAYER_STATE_IDLE_REASON_ERROR", 5);
            PLAYER_STATE_IDLE_REASON_ERROR = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: VKCastActionStatisticsLogger.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SESSION_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.VIDEO_PLAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.VIDEO_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.VIDEO_FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.SESSION_ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.PLAYER_STATE_IDLE_REASON_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void g(a aVar, String str) {
        SchemeStat$TypeCastEventItem.EventType eventType;
        if (b != aVar) {
            b = aVar;
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            switch (b.$EnumSwitchMapping$0[aVar.ordinal()]) {
                case 1:
                    eventType = SchemeStat$TypeCastEventItem.EventType.SESSION_START;
                    break;
                case 2:
                    eventType = SchemeStat$TypeCastEventItem.EventType.VIDEO_PLAY;
                    break;
                case 3:
                    eventType = SchemeStat$TypeCastEventItem.EventType.VIDEO_PAUSE;
                    break;
                case 4:
                    eventType = SchemeStat$TypeCastEventItem.EventType.VIDEO_FINISH;
                    break;
                case 5:
                    eventType = SchemeStat$TypeCastEventItem.EventType.SESSION_END;
                    break;
                case 6:
                    eventType = SchemeStat$TypeCastEventItem.EventType.ERROR;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            new yz9(c, new SchemeStat$TypeCastEventItem(eventType, str)).q();
        }
    }

    @Override // xsna.ez9
    public final void a() {
        yg5 a2;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 d = b.C1208b.a().d();
        if (d != null && (a2 = d.a()) != null) {
            a2.L(VideoMode.EMPTY);
        }
        g(a.SESSION_ENDED, null);
    }

    @Override // xsna.ez9
    public final void b() {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 d = b.C1208b.a().d();
        yg5 a2 = d != null ? d.a() : null;
        if (a2 != null) {
            a2.L(VideoMode.CHROMECAST);
        }
        e4t0.a(VideoPlayerMode.CHROMECAST, a2);
        g(a.SESSION_STARTED, null);
    }

    @Override // xsna.ez9
    public final void c(JSONObject jSONObject) {
        Object obj;
        a aVar = a.VIDEO_PLAYED;
        String str = null;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("video_id");
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        str = (String) obj;
        g(aVar, str);
    }

    @Override // xsna.ez9
    public final void d(JSONObject jSONObject) {
        Object obj;
        a aVar = a.VIDEO_PAUSED;
        String str = null;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("video_id");
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        str = (String) obj;
        g(aVar, str);
    }

    @Override // xsna.ez9
    public final void e(JSONObject jSONObject) {
        Object obj;
        a aVar = a.VIDEO_FINISHED;
        String str = null;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("video_id");
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        str = (String) obj;
        g(aVar, str);
    }

    @Override // xsna.ez9
    public final void f() {
        g(a.PLAYER_STATE_IDLE_REASON_ERROR, null);
    }
}
