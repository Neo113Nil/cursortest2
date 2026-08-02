package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.gco;

/* compiled from: Music.kt */
/* loaded from: classes.dex */
public final class k840 {
    public static final pn40 a;
    public static final ix4 b;
    public static boolean c;
    public static y6l d;
    public static sgl e;
    public static u370 f;

    /* compiled from: Music.kt */
    public static final class a {
        public static ryw b;
        public static s450 c;
        public static com.vk.music.notifications.restriction.a d;
        public static s750 e;
        public static com.vk.music.player.d f;
        public static q5v0 g;
        public static r5v0 h;
        public static fp01 j;
        public static c45 k;
        public static final bpn0 a = new bpn0(new dr6(7));
        public static final g950 i = ((MusicSubscriptionComponent) b().a(fpf0.a(MusicSubscriptionComponent.class))).q1();
        public static gco l = gco.a.a;
        public static final bpn0 m = new bpn0(new er6(4));
        public static final bpn0 n = new bpn0(new fr6(7));
        public static final bpn0 o = new bpn0(new qo(4));
        public static final bpn0 p = new bpn0(new dw9(5));
        public static final bpn0 q = new bpn0(new ib3(7));
        public static final bpn0 r = new bpn0(new mn8(7));

        /* compiled from: Music.kt */
        /* renamed from: xsna.k840$a$a, reason: collision with other inner class name */
        public static final class C3168a implements e {
            public final /* synthetic */ AudioModelsComponent a;

            public C3168a(AudioModelsComponent audioModelsComponent) {
                this.a = audioModelsComponent;
            }

            @Override // xsna.k840.e
            public final u2b0 a() {
                return this.a.s8();
            }

            @Override // xsna.k840.e
            public final u2b0 b() {
                return this.a.r();
            }
        }

        public static qh4 a() {
            return (qh4) p.getValue();
        }

        public static nmg0 b() {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return m7m.e();
        }

        public static abo c() {
            return (abo) o.getValue();
        }

        public static lq40 d() {
            return (lq40) n.getValue();
        }

        public static g950 e() {
            return i;
        }

        public static du70 f() {
            return (du70) m.getValue();
        }

        public static final e g() {
            return (e) a.getValue();
        }

        public static boolean h() {
            return ((MusicKidsModeComponent) b().a(fpf0.a(MusicKidsModeComponent.class))).n().isEnabled().getValue().booleanValue();
        }

        public static boolean i() {
            return !epx.f(l, gco.a.a);
        }
    }

    /* compiled from: Music.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final Object a = pn00.k(new Pair("for_you", -21), new Pair("weekly", -22), new Pair("new", -23), new Pair("discovery", -24));
        public static final List<Integer> b = e43.l(-21, -22, -23, -24, -25, -26, -27, -28, -29);
        public static final i9x c = swe0.m(-21, -42);

        /* compiled from: Music.kt */
        /* loaded from: classes.dex */
        public static final class a {
            public static boolean a;
        }

        /* compiled from: Music.kt */
        /* renamed from: xsna.k840$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C3169b {
            public static boolean a;
        }

        /* compiled from: Music.kt */
        public static final class c {
            public static boolean a;
        }

        /* compiled from: Music.kt */
        public static final class d {
            public static boolean a;

            public static boolean a() {
                return a;
            }
        }

        /* compiled from: Music.kt */
        public static final class e {
            public static boolean a;

            public static boolean a() {
                return a;
            }
        }

        public static String a() {
            return i5s.a(new StringBuilder("https://www."), a0a.d, "/audioplayer");
        }

        public static List b() {
            return b;
        }
    }

    /* compiled from: Music.kt */
    public static final class c {
        public static final com.vk.music.track.a a() {
            return new com.vk.music.track.a();
        }

        public static final ModernPlaylistModel b(Playlist playlist, String str) {
            if (playlist != null && playlist.S4()) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (!com.vk.core.utils.newtork.b.d()) {
                    return new com.vk.music.playlist.g(playlist, str, new eml(a.d()), a.c());
                }
            }
            return new ModernPlaylistModel(playlist, str, new eml(a.d()), a.c());
        }

        public static ModernPlaylistModel c(Class cls, UserId userId, int i, String str) {
            return new ModernPlaylistModel(cls, new eml(a.d()), a.c(), i, userId, str);
        }

        public static final ModernPlaylistModel d() {
            return new ModernPlaylistModel("no persist support fot on-demand model", new eml(a.d()), a.c(), 0, UserId.d, "", null, VideoRecord.DEFAULT_MAX_DIMENSION);
        }
    }

    /* compiled from: Music.kt */
    public interface d {
        void a(Context context);

        boolean b(Context context);

        void c(Context context, String str);

        boolean d(Context context);
    }

    /* compiled from: Music.kt */
    public interface e {
        u2b0 a();

        u2b0 b();
    }

    static {
        pn40 pn40Var = new pn40();
        pn40Var.b = new laq(31, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L);
        a = pn40Var;
        b = new ix4();
    }
}
