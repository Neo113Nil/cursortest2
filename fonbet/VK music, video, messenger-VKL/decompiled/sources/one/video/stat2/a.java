package one.video.stat2;

import android.net.Uri;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.L2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.ResponseInfo;
import one.video.player.f;
import one.video.player.g;
import one.video.player.model.FrameSize;
import one.video.stat.transport.ErrorSeverity;
import one.video.stat.transport.Param;
import one.video.stat.transport.SeekType;
import one.video.stat.transport.SequencePosition;
import one.video.stat2.PauseResumeEventsHelper;
import org.json.JSONObject;
import xsna.a6l;
import xsna.ao90;
import xsna.asp;
import xsna.b410;
import xsna.cms0;
import xsna.deb0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.i4;
import xsna.kcc0;
import xsna.lsk0;
import xsna.mnh0;
import xsna.o860;
import xsna.pzl;
import xsna.qbx0;
import xsna.qw80;
import xsna.ryk0;
import xsna.sht0;
import xsna.so4;
import xsna.tya0;
import xsna.uw3;
import xsna.vrn0;
import xsna.vw3;
import xsna.who0;
import xsna.wn80;
import xsna.wua0;
import xsna.xk80;
import xsna.y6b0;
import xsna.yi80;
import xsna.z000;
import xsna.zrp;

/* compiled from: Session.kt */
/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final long b;
    public final boolean c;
    public Mode d;
    public final ContentType e;
    public boolean f;
    public final vw3 g;
    public final AtomicInteger h;
    public String i;
    public final vrn0 j;
    public final qbx0 k;
    public final PauseResumeEventsHelper l;
    public final tya0 m;
    public final wua0 n;
    public final JSONObject o;
    public final JSONObject p;
    public final ListBuilder q;
    public OneVideoPlayer r;
    public volatile String s;
    public volatile Boolean t;
    public final e u;
    public final d v;
    public final c w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Session.kt */
    /* renamed from: one.video.stat2.a$a, reason: collision with other inner class name */
    public static final class EnumC2182a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC2182a[] $VALUES;
        public static final EnumC2182a INVALID_CONNECTION_REUSED_PARAM;
        public static final EnumC2182a INVALID_PLAYER;
        public static final EnumC2182a PLAYER_IS_NULL_ON_FAILOVER;
        public static final EnumC2182a PLAYER_IS_NULL_ON_SET_IS_VISIBLE;
        public static final EnumC2182a PLAYER_IS_NULL_ON_TELEMETRY_EVENT;
        public static final EnumC2182a PLAYER_IS_NULL_ON_WC_EVENT;
        public static final EnumC2182a POSITIVE_DURATION_ON_SHITTY_LIVES;
        public static final EnumC2182a POSITIVE_POSITION_ON_SHITTY_LIVES;
        public static final EnumC2182a TVT_MISMATCH_IN_HEARTBEAT;
        public static final EnumC2182a USE_AFTER_RELEASE_PREFETCH;
        public static final EnumC2182a USE_AFTER_RELEASE_RELEASE;
        public static final EnumC2182a USE_AFTER_RELEASE_SET_PLAYER;
        public static final EnumC2182a USE_AFTER_RELEASE_SET_VIDEO_MODE;
        public static final EnumC2182a USE_AFTER_RELEASE_VISIBLE;
        private final String value;

        static {
            EnumC2182a enumC2182a = new EnumC2182a("INVALID_PLAYER", 0, "inv_p");
            INVALID_PLAYER = enumC2182a;
            EnumC2182a enumC2182a2 = new EnumC2182a("INVALID_CONNECTION_REUSED_PARAM", 1, "inv_cr");
            INVALID_CONNECTION_REUSED_PARAM = enumC2182a2;
            EnumC2182a enumC2182a3 = new EnumC2182a("PLAYER_IS_NULL_ON_SET_IS_VISIBLE", 2, "p_null_vis");
            PLAYER_IS_NULL_ON_SET_IS_VISIBLE = enumC2182a3;
            EnumC2182a enumC2182a4 = new EnumC2182a("PLAYER_IS_NULL_ON_TELEMETRY_EVENT", 3, "p_null_tel");
            PLAYER_IS_NULL_ON_TELEMETRY_EVENT = enumC2182a4;
            EnumC2182a enumC2182a5 = new EnumC2182a("PLAYER_IS_NULL_ON_FAILOVER", 4, "p_null_fo");
            PLAYER_IS_NULL_ON_FAILOVER = enumC2182a5;
            EnumC2182a enumC2182a6 = new EnumC2182a("PLAYER_IS_NULL_ON_WC_EVENT", 5, "p_null_wc");
            PLAYER_IS_NULL_ON_WC_EVENT = enumC2182a6;
            EnumC2182a enumC2182a7 = new EnumC2182a("POSITIVE_DURATION_ON_SHITTY_LIVES", 6, "inv_dur");
            POSITIVE_DURATION_ON_SHITTY_LIVES = enumC2182a7;
            EnumC2182a enumC2182a8 = new EnumC2182a("POSITIVE_POSITION_ON_SHITTY_LIVES", 7, "inv_pos");
            POSITIVE_POSITION_ON_SHITTY_LIVES = enumC2182a8;
            EnumC2182a enumC2182a9 = new EnumC2182a("USE_AFTER_RELEASE_SET_PLAYER", 8, "uar_sp");
            USE_AFTER_RELEASE_SET_PLAYER = enumC2182a9;
            EnumC2182a enumC2182a10 = new EnumC2182a("USE_AFTER_RELEASE_RELEASE", 9, "uar_r");
            USE_AFTER_RELEASE_RELEASE = enumC2182a10;
            EnumC2182a enumC2182a11 = new EnumC2182a("USE_AFTER_RELEASE_PREFETCH", 10, "uar_p");
            USE_AFTER_RELEASE_PREFETCH = enumC2182a11;
            EnumC2182a enumC2182a12 = new EnumC2182a("USE_AFTER_RELEASE_VISIBLE", 11, "uar_v");
            USE_AFTER_RELEASE_VISIBLE = enumC2182a12;
            EnumC2182a enumC2182a13 = new EnumC2182a("USE_AFTER_RELEASE_SET_VIDEO_MODE", 12, "uar_m");
            USE_AFTER_RELEASE_SET_VIDEO_MODE = enumC2182a13;
            EnumC2182a enumC2182a14 = new EnumC2182a("TVT_MISMATCH_IN_HEARTBEAT", 13, "tvt_mm_hb");
            TVT_MISMATCH_IN_HEARTBEAT = enumC2182a14;
            EnumC2182a[] enumC2182aArr = {enumC2182a, enumC2182a2, enumC2182a3, enumC2182a4, enumC2182a5, enumC2182a6, enumC2182a7, enumC2182a8, enumC2182a9, enumC2182a10, enumC2182a11, enumC2182a12, enumC2182a13, enumC2182a14};
            $VALUES = enumC2182aArr;
            $ENTRIES = new asp(enumC2182aArr);
        }

        public EnumC2182a(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumC2182a valueOf(String str) {
            return (EnumC2182a) Enum.valueOf(EnumC2182a.class, str);
        }

        public static EnumC2182a[] values() {
            return (EnumC2182a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* compiled from: Session.kt */
    public static final class b {
        public static final String a(OneVideoPlayer oneVideoPlayer) {
            String str;
            so4 so4Var;
            String str2;
            cms0 cms0Var;
            one.video.player.tracks.c E = oneVideoPlayer.E();
            String str3 = "";
            if (E == null || (cms0Var = (cms0) E.c) == null || (str = cms0Var.c) == null) {
                str = "";
            }
            one.video.player.tracks.a M = oneVideoPlayer.M();
            if (M != null && (so4Var = (so4) M.c) != null && (str2 = so4Var.c) != null) {
                str3 = str2;
            }
            return pzl.b(str, StringUtils.COMMA, str3);
        }

        public static final String b(one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            FrameSize b;
            String frameSize;
            return (cVar == null || (cms0Var = (cms0) cVar.c) == null || (b = cms0Var.b()) == null || (frameSize = b.toString()) == null) ? "audio" : frameSize;
        }

        public static final String c(one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            FrameSize b;
            String frameSize;
            return (cVar == null || (cms0Var = (cms0) cVar.c) == null || (b = cms0Var.b()) == null || (frameSize = b.toString()) == null) ? "auto" : frameSize;
        }

        public static final boolean d(BaseVideoPlayer baseVideoPlayer) {
            OneVideoPlayer.State state = baseVideoPlayer.getState();
            return (state == OneVideoPlayer.State.IDLE || state == OneVideoPlayer.State.RELEASED) ? false : true;
        }
    }

    /* compiled from: Session.kt */
    public static final class c implements f {
        public boolean a;
        public boolean b;

        /* compiled from: Session.kt */
        /* renamed from: one.video.stat2.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2183a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PauseResumeEventsHelper.Event.values().length];
                try {
                    iArr[PauseResumeEventsHelper.Event.PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PauseResumeEventsHelper.Event.RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            String c;
            String str;
            long j;
            long j2;
            SequencePosition sequencePosition;
            Uri uri;
            sht0 a;
            Uri uri2;
            a.a(a.this, oneVideoPlayer);
            oneVideoPlayer.getCurrentPosition();
            oneVideoPlayer.getDuration();
            discontinuityReason.toString();
            deb0Var.toString();
            deb0Var2.toString();
            int i = wn80.a;
            a aVar = a.this;
            if (aVar.c && (deb0Var.c == null || deb0Var2.c == null)) {
                return;
            }
            long b = a.b(aVar, oneVideoPlayer, deb0Var);
            long b2 = a.b(a.this, oneVideoPlayer, deb0Var2);
            int i2 = deb0Var.a;
            if (i2 != deb0Var2.a) {
                y6b0 U = oneVideoPlayer.U();
                a.this.f(b, (U == null || (a = U.a(i2)) == null || (uri2 = a.b) == null) ? null : uri2.getHost());
                return;
            }
            vrn0 vrn0Var = a.this.j;
            vrn0Var.getClass();
            discontinuityReason.toString();
            if (vrn0Var.a()) {
                if (vrn0Var.i > b) {
                    vrn0Var.d.b(false, vrn0.a.INVALID_POSITION2, new uw3(0));
                    vrn0Var.d.b(vrn0Var.a(), vrn0.a.INVALID_INTERVAL_STATE2, new uw3(0));
                    vrn0Var.i = -1L;
                } else {
                    vrn0Var.b(b);
                    vrn0Var.d.b(vrn0Var.a(), vrn0.a.INVALID_INTERVAL_STATE2, new uw3(0));
                    vrn0Var.i = -1L;
                }
                if (discontinuityReason != OneVideoPlayer.DiscontinuityReason.REMOVE) {
                    vrn0Var.c(b2);
                }
            }
            qbx0 qbx0Var = a.this.k;
            qbx0Var.getClass();
            discontinuityReason.toString();
            if (qbx0Var.a()) {
                if (qbx0Var.b > b) {
                    qbx0Var.a.b(false, qbx0.a.INVALID_POSITION, new uw3(0));
                    qbx0Var.b = -1L;
                    c = null;
                } else {
                    c = qbx0Var.c(b);
                }
                if (discontinuityReason != OneVideoPlayer.DiscontinuityReason.REMOVE) {
                    qbx0Var.b(b2);
                }
                str = c;
            } else {
                str = null;
            }
            long j3 = a.this.j.e;
            if (str != null) {
                a.this.j(b2, a.this.i, str, b.b(oneVideoPlayer.E()), j3, oneVideoPlayer.i());
                j2 = b2;
                j = j3;
            } else {
                j = j3;
                j2 = b2;
            }
            OneVideoPlayer.DiscontinuityReason discontinuityReason2 = OneVideoPlayer.DiscontinuityReason.SEEK;
            if (discontinuityReason == discontinuityReason2 || discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT) {
                a aVar2 = a.this;
                sequencePosition = null;
                yi80.a d = aVar2.d(Event.SEEKING, b, aVar2.i, j);
                d.i.put(Param.SEEK_TYPE, SeekType.UNKNOWN.h());
                a.g(aVar2, d, null, 6);
            } else {
                sequencePosition = null;
            }
            if (deb0Var.a != deb0Var2.a) {
                a aVar3 = a.this;
                sht0 j4 = oneVideoPlayer.j();
                aVar3.i = (j4 == null || (uri = j4.b) == null) ? sequencePosition : uri.getHost();
            }
            if (discontinuityReason == discontinuityReason2 || discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT) {
                a aVar4 = a.this;
                yi80.a d2 = aVar4.d(Event.SEEKED, j2, aVar4.i, j);
                d2.i.put(Param.SEEK_TYPE, SeekType.UNKNOWN.h());
                a.g(aVar4, d2, sequencePosition, 6);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            if (b.d(baseVideoPlayer)) {
                one.video.player.tracks.c E = baseVideoPlayer.E();
                one.video.player.tracks.c J = baseVideoPlayer.J();
                String b = b.b(E);
                String c = b.c(J);
                String a = b.a(baseVideoPlayer);
                long e = a.this.e(baseVideoPlayer);
                a aVar = a.this;
                Event event = Event.QUALITY_CHANGED;
                String str = aVar.i;
                vrn0 vrn0Var = aVar.j;
                vrn0Var.b(e);
                yi80.a d = aVar.d(event, e, str, vrn0Var.e);
                d.i.put(Param.USER_QUALITY, c);
                d.c(b);
                d.i.put(Param.CODEC_INFO, a);
                a.g(aVar, d, null, 6);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
            if (b.d(baseVideoPlayer)) {
                float f2 = baseVideoPlayer.A;
                int i = (int) (100 * f2);
                boolean z = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                long e = a.this.e(baseVideoPlayer);
                a aVar = a.this;
                Event event = Event.SOUND_CHANGED;
                String str = aVar.i;
                vrn0 vrn0Var = aVar.j;
                vrn0Var.b(e);
                yi80.a d = aVar.d(event, e, str, vrn0Var.e);
                d.i.put(Param.SOUND_VOLUME, Integer.valueOf(i));
                d.i.put(Param.MUTED, Boolean.valueOf(z));
                a.g(aVar, d, null, 6);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
            a.a(a.this, oneVideoPlayer);
            if (this.a) {
                return;
            }
            this.a = true;
            long e = a.this.e(oneVideoPlayer);
            a aVar = a.this;
            Event event = Event.FIRST_VIDEO_FRAME_DECODED;
            String str = aVar.i;
            vrn0 vrn0Var = aVar.j;
            vrn0Var.b(e);
            a.g(aVar, aVar.d(event, e, str, vrn0Var.e), null, 6);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
            who0 who0Var;
            if (b.d(xk80Var)) {
                one.video.player.tracks.b Q = xk80Var.Q();
                boolean z2 = Q != null;
                String str = (Q == null || (who0Var = (who0) Q.c) == null) ? null : who0Var.c;
                long e = a.this.e(xk80Var);
                a aVar = a.this;
                Event event = Event.SUBTITLES_SWITCHED;
                String str2 = aVar.i;
                vrn0 vrn0Var = aVar.j;
                vrn0Var.b(e);
                yi80.a d = aVar.d(event, e, str2, vrn0Var.e);
                d.i.put(Param.SUBTITLES_ENABLED, Boolean.valueOf(z2));
                LinkedHashMap linkedHashMap = d.i;
                if (str != null) {
                    linkedHashMap.put(Param.SUBTITLES_TRACK_LANG, str);
                } else {
                    linkedHashMap.remove(Param.SUBTITLES_TRACK_LANG);
                }
                a.g(aVar, d, null, 6);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
            String str;
            Uri uri;
            a.a(a.this, oneVideoPlayer);
            if (this.b) {
                return;
            }
            this.b = true;
            long e = a.this.e(oneVideoPlayer);
            a aVar = a.this;
            Event event = Event.FIRST_BYTE_MANIFEST;
            String str2 = aVar.i;
            vrn0 vrn0Var = aVar.j;
            vrn0Var.b(e);
            yi80.a d = aVar.d(event, e, str2, vrn0Var.e);
            sht0 j = oneVideoPlayer.j();
            if (j == null || (uri = j.b) == null || (str = uri.toString()) == null) {
                str = "playback_url is NULL";
            }
            drm0.N(str);
            d.i.put(Param.PLAYBACK_URL, str);
            String str3 = a.this.s;
            if (str3 == null) {
                str3 = "other";
            }
            d.i.put(Param.CONNECTION_TYPE, str3);
            Boolean bool = a.this.t;
            LinkedHashMap linkedHashMap = d.i;
            if (bool != null) {
                linkedHashMap.put(Param.CONNECTION_REUSED, bool);
            } else {
                linkedHashMap.remove(Param.CONNECTION_REUSED);
            }
            a.g(aVar, d, null, 6);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            Uri uri;
            a.a(a.this, oneVideoPlayer);
            OneVideoSourceException i = oneVideoPlaybackException.i();
            OneVideoSourceException.a g = i != null ? i.g() : null;
            Integer valueOf = g != null ? Integer.valueOf(g.a) : null;
            long e = a.this.e(oneVideoPlayer);
            ResponseInfo responseInfo = g != null ? g.d : null;
            vrn0 vrn0Var = a.this.j;
            vrn0Var.b(e);
            long j = vrn0Var.e;
            a aVar = a.this;
            yi80.a c = aVar.c(Event.ERROR, e, (sht0Var == null || (uri = sht0Var.b) == null) ? null : uri.getHost(), j);
            c.i.put(Param.ERROR_SEVERITY, ErrorSeverity.CRITICAL.h());
            c.i.put(Param.ERROR_CATEGORY, oneVideoPlaybackException.j().toString());
            c.i.put(Param.PLAYER_ERROR_CODE, oneVideoPlaybackException.g());
            c.i.put(Param.PLAYER_ERROR_TRACE, mnh0.A(oneVideoPlaybackException));
            if (valueOf != null) {
                c.i.put(Param.HTTP_ERROR_CODE, Integer.valueOf(valueOf.intValue()));
            }
            if (responseInfo != null) {
                c.i.put(Param.BACKEND_UV_ERROR_CODE, String.valueOf(responseInfo.i()));
            }
            String message = oneVideoPlaybackException.getMessage();
            if (message != null) {
                c.i.put(Param.ERROR_MESSAGE, message);
            }
            c.b(a.this.e.toString());
            a.g(aVar, c, null, 4);
            a.this.i(e, j);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
            so4 so4Var;
            BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) oneVideoPlayer;
            if (b.d(baseVideoPlayer)) {
                one.video.player.tracks.a M = baseVideoPlayer.M();
                String str = (M == null || (so4Var = (so4) M.c) == null) ? null : so4Var.h;
                String a = b.a(oneVideoPlayer);
                long e = a.this.e(oneVideoPlayer);
                a aVar2 = a.this;
                Event event = Event.AUDIO_TRACK_SWITCHED;
                String str2 = aVar2.i;
                vrn0 vrn0Var = aVar2.j;
                vrn0Var.b(e);
                yi80.a d = aVar2.d(event, e, str2, vrn0Var.e);
                LinkedHashMap linkedHashMap = d.i;
                if (str != null) {
                    linkedHashMap.put(Param.AUDIO_TRACK_LANG, str);
                } else {
                    linkedHashMap.remove(Param.AUDIO_TRACK_LANG);
                }
                d.i.put(Param.CODEC_INFO, a);
                a.g(aVar2, d, null, 6);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            a.a(a.this, baseVideoPlayer);
            long e = a.this.e(baseVideoPlayer);
            a aVar = a.this;
            wua0 wua0Var = aVar.n;
            if (wua0Var.a || wua0Var.b) {
                return;
            }
            wua0Var.a = true;
            String str = aVar.i;
            vrn0 vrn0Var = aVar.j;
            vrn0Var.b(e);
            a.g(aVar, aVar.d(Event.PLAY, e, str, vrn0Var.e), null, 6);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0178 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0187 A[ADDED_TO_REGION] */
        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            String str;
            long j;
            String c;
            String str2;
            String str3;
            String str4;
            long j2;
            int i;
            String str5;
            String str6;
            SequencePosition sequencePosition;
            String str7;
            OneVideoPlayer.State state3;
            PauseResumeEventsHelper.Event event;
            OneVideoPlayer.State state4;
            a aVar;
            wua0 wua0Var;
            tya0 tya0Var;
            JSONObject jSONObject;
            so4 so4Var;
            who0 who0Var;
            Uri uri;
            a.a(a.this, baseVideoPlayer);
            state.toString();
            state2.toString();
            int i2 = wn80.a;
            a aVar2 = a.this;
            sht0 j3 = baseVideoPlayer.j();
            aVar2.i = (j3 == null || (uri = j3.b) == null) ? null : uri.getHost();
            long e = a.this.e(baseVideoPlayer);
            vrn0 vrn0Var = a.this.j;
            vrn0Var.b(e);
            long j4 = vrn0Var.e;
            float f = baseVideoPlayer.z;
            one.video.player.tracks.c E = baseVideoPlayer.E();
            one.video.player.tracks.c J = baseVideoPlayer.J();
            String b = b.b(E);
            String c2 = b.c(J);
            Size f2 = baseVideoPlayer.f();
            int width = f2 != null ? f2.getWidth() : 0;
            int height = f2 != null ? f2.getHeight() : 0;
            float f3 = baseVideoPlayer.A;
            float f4 = 100;
            int i3 = (int) (f3 * f4);
            boolean z = f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            long a = baseVideoPlayer.a();
            one.video.player.tracks.b Q = baseVideoPlayer.Q();
            boolean z2 = Q != null;
            String str8 = (Q == null || (who0Var = (who0) Q.c) == null) ? null : who0Var.c;
            one.video.player.tracks.a M = baseVideoPlayer.M();
            String str9 = (M == null || (so4Var = (so4) M.c) == null) ? null : so4Var.h;
            int i4 = (int) (f * f4);
            vrn0 vrn0Var2 = a.this.j;
            vrn0Var2.getClass();
            state.toString();
            state2.toString();
            OneVideoPlayer.State state5 = OneVideoPlayer.State.PLAYING;
            if (state2 == state5) {
                vrn0Var2.c(e);
            } else if (state == state5) {
                vrn0Var2.b(e);
                str = b;
                j = a;
                vrn0Var2.d.b(vrn0Var2.a(), vrn0.a.INVALID_INTERVAL_STATE2, new uw3(0));
                vrn0Var2.i = -1L;
                qbx0 qbx0Var = a.this.k;
                qbx0Var.getClass();
                state.toString();
                state2.toString();
                if (state2 != state5) {
                    qbx0Var.b(e);
                } else if (state == state5) {
                    String str10 = str8;
                    c = qbx0Var.c(e);
                    str2 = str10;
                    if (c != null) {
                        a aVar3 = a.this;
                        String str11 = aVar3.i;
                        boolean i5 = baseVideoPlayer.i();
                        i = i3;
                        String str12 = str;
                        str6 = c2;
                        long j5 = j;
                        str3 = str9;
                        str4 = str2;
                        j2 = j5;
                        aVar3.j(e, str11, c, str12, j4, i5);
                        str5 = str12;
                        j4 = j4;
                        e = e;
                    } else {
                        long j6 = j;
                        str3 = str9;
                        str4 = str2;
                        j2 = j6;
                        i = i3;
                        str5 = str;
                        str6 = c2;
                    }
                    if ((state2 == state5 || state == OneVideoPlayer.State.PAUSED) && (state2 != OneVideoPlayer.State.PAUSED || state == state5)) {
                        sequencePosition = null;
                    } else {
                        a aVar4 = a.this;
                        yi80.a d = aVar4.d(Event.READY, e, aVar4.i, j4);
                        d.a(j2);
                        sequencePosition = null;
                        a.g(aVar4, d, null, 6);
                    }
                    if (state2 == state5) {
                        a aVar5 = a.this;
                        str7 = str4;
                        yi80.a d2 = aVar5.d(Event.PLAYING, e, aVar5.i, j4);
                        d2.a(j2);
                        a.g(aVar5, d2, sequencePosition, 6);
                    } else {
                        str7 = str4;
                    }
                    PauseResumeEventsHelper pauseResumeEventsHelper = a.this.l;
                    pauseResumeEventsHelper.getClass();
                    state3 = OneVideoPlayer.State.BUFFERING;
                    if (state2 == state3) {
                        pauseResumeEventsHelper.a = state;
                    }
                    OneVideoPlayer.State state6 = OneVideoPlayer.State.PAUSED;
                    event = ((state == state6 || state2 != state5) && !(state == state3 && pauseResumeEventsHelper.a == state6 && state2 == state5)) ? (state == state5 || state2 != state6) ? null : PauseResumeEventsHelper.Event.PAUSE : PauseResumeEventsHelper.Event.RESUME;
                    if (event != null) {
                        a aVar6 = a.this;
                        int i6 = C2183a.$EnumSwitchMapping$0[event.ordinal()];
                        if (i6 == 1) {
                            state4 = state3;
                            a.g(aVar6, aVar6.d(Event.PAUSE, e, aVar6.i, j4), null, 6);
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a.g(aVar6, aVar6.d(Event.RESUME, e, aVar6.i, j4), null, 6);
                            state4 = state3;
                        }
                    } else {
                        state4 = state3;
                    }
                    aVar = a.this;
                    wua0Var = aVar.n;
                    if (!wua0Var.a && state2 == state5) {
                        wua0Var.a = true;
                        a.g(aVar, aVar.d(Event.PLAY, e, aVar.i, j4), null, 6);
                    }
                    tya0Var = a.this.m;
                    tya0Var.getClass();
                    if (state2 == state5 && !tya0Var.a) {
                        tya0Var.a = true;
                        a aVar7 = a.this;
                        yi80.a c3 = aVar7.c(Event.PLAYBACK_STARTED, e, aVar7.i, j4);
                        c3.c(str5);
                        c3.i.put(Param.USER_QUALITY, str6);
                        c3.i.put(Param.PLAYER_WIDTH, Integer.valueOf(width));
                        c3.i.put(Param.PLAYER_HEIGHT, Integer.valueOf(height));
                        c3.i.put(Param.MUTED, Boolean.valueOf(z));
                        c3.i.put(Param.SOUND_VOLUME, Integer.valueOf(i));
                        c3.a(j2);
                        c3.i.put(Param.MODE, a.this.d.h());
                        c3.i.put(Param.VISIBILITY, !a.this.y ? "foreground" : L2.g);
                        c3.i.put(Param.SUBTITLES_ENABLED, Boolean.valueOf(z2));
                        LinkedHashMap linkedHashMap = c3.i;
                        if (str7 == null) {
                            linkedHashMap.put(Param.SUBTITLES_TRACK_LANG, str7);
                        } else {
                            linkedHashMap.remove(Param.SUBTITLES_TRACK_LANG);
                        }
                        LinkedHashMap linkedHashMap2 = c3.i;
                        if (str3 == null) {
                            linkedHashMap2.put(Param.AUDIO_TRACK_LANG, str3);
                        } else {
                            linkedHashMap2.remove(Param.AUDIO_TRACK_LANG);
                        }
                        c3.i.put(Param.PLAYBACK_RATE, Integer.valueOf(i4));
                        jSONObject = a.this.p;
                        LinkedHashMap linkedHashMap3 = c3.i;
                        if (jSONObject == null) {
                            linkedHashMap3.put(Param.RECOM_INFO, jSONObject);
                        } else {
                            linkedHashMap3.remove(Param.RECOM_INFO);
                        }
                        a.g(aVar7, c3, null, 4);
                        a.this.i(e, j4);
                    }
                    if (state == state5 && state2 == state4) {
                        a aVar8 = a.this;
                        yi80.a d3 = aVar8.d(Event.BUFFER_STARVATION, e, aVar8.i, j4);
                        d3.a(j2);
                        a.g(aVar8, d3, null, 6);
                        a.this.i(e, j4);
                        return;
                    }
                    return;
                }
                str2 = str8;
                c = null;
                if (c != null) {
                }
                if (state2 == state5) {
                }
                sequencePosition = null;
                if (state2 == state5) {
                }
                PauseResumeEventsHelper pauseResumeEventsHelper2 = a.this.l;
                pauseResumeEventsHelper2.getClass();
                state3 = OneVideoPlayer.State.BUFFERING;
                if (state2 == state3) {
                }
                OneVideoPlayer.State state62 = OneVideoPlayer.State.PAUSED;
                if (state == state62) {
                }
                if (event != null) {
                }
                aVar = a.this;
                wua0Var = aVar.n;
                if (!wua0Var.a) {
                    wua0Var.a = true;
                    a.g(aVar, aVar.d(Event.PLAY, e, aVar.i, j4), null, 6);
                }
                tya0Var = a.this.m;
                tya0Var.getClass();
                if (state2 == state5) {
                    tya0Var.a = true;
                    a aVar72 = a.this;
                    yi80.a c32 = aVar72.c(Event.PLAYBACK_STARTED, e, aVar72.i, j4);
                    c32.c(str5);
                    c32.i.put(Param.USER_QUALITY, str6);
                    c32.i.put(Param.PLAYER_WIDTH, Integer.valueOf(width));
                    c32.i.put(Param.PLAYER_HEIGHT, Integer.valueOf(height));
                    c32.i.put(Param.MUTED, Boolean.valueOf(z));
                    c32.i.put(Param.SOUND_VOLUME, Integer.valueOf(i));
                    c32.a(j2);
                    c32.i.put(Param.MODE, a.this.d.h());
                    c32.i.put(Param.VISIBILITY, !a.this.y ? "foreground" : L2.g);
                    c32.i.put(Param.SUBTITLES_ENABLED, Boolean.valueOf(z2));
                    LinkedHashMap linkedHashMap4 = c32.i;
                    if (str7 == null) {
                    }
                    LinkedHashMap linkedHashMap22 = c32.i;
                    if (str3 == null) {
                    }
                    c32.i.put(Param.PLAYBACK_RATE, Integer.valueOf(i4));
                    jSONObject = a.this.p;
                    LinkedHashMap linkedHashMap32 = c32.i;
                    if (jSONObject == null) {
                    }
                    a.g(aVar72, c32, null, 4);
                    a.this.i(e, j4);
                }
                if (state == state5) {
                    return;
                } else {
                    return;
                }
            }
            str = b;
            j = a;
            qbx0 qbx0Var2 = a.this.k;
            qbx0Var2.getClass();
            state.toString();
            state2.toString();
            if (state2 != state5) {
            }
            str2 = str8;
            c = null;
            if (c != null) {
            }
            if (state2 == state5) {
            }
            sequencePosition = null;
            if (state2 == state5) {
            }
            PauseResumeEventsHelper pauseResumeEventsHelper22 = a.this.l;
            pauseResumeEventsHelper22.getClass();
            state3 = OneVideoPlayer.State.BUFFERING;
            if (state2 == state3) {
            }
            OneVideoPlayer.State state622 = OneVideoPlayer.State.PAUSED;
            if (state == state622) {
            }
            if (event != null) {
            }
            aVar = a.this;
            wua0Var = aVar.n;
            if (!wua0Var.a) {
            }
            tya0Var = a.this.m;
            tya0Var.getClass();
            if (state2 == state5) {
            }
            if (state == state5) {
            }
        }
    }

    /* compiled from: Session.kt */
    public static final class d implements OneVideoPlayer.d {
        public d() {
        }

        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            a aVar = a.this;
            aVar.j.b(aVar.e(baseVideoPlayer));
        }
    }

    /* compiled from: Session.kt */
    public static final class e implements g {
        public e() {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
            Boolean bool;
            a.this.s = str;
            a aVar = a.this;
            if (str2.equals("0")) {
                bool = Boolean.FALSE;
            } else if (str2.equals("1")) {
                bool = Boolean.TRUE;
            } else {
                aVar.g.b(false, EnumC2182a.INVALID_CONNECTION_REUSED_PARAM, new b410(str2, 27));
                bool = null;
            }
            aVar.t = bool;
        }
    }

    public a(String str, String str2, long j, JSONObject jSONObject, long j2, String str3, boolean z, Mode mode, boolean z2, boolean z3, boolean z4, ContentType contentType) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = mode;
        this.e = contentType;
        UUID randomUUID = UUID.randomUUID();
        this.g = ryk0.a;
        this.h = new AtomicInteger(0);
        vrn0 vrn0Var = new vrn0(new o860(this, 4), new qw80(this, 8), new ao90(this, 4));
        this.j = vrn0Var;
        this.k = new qbx0();
        PauseResumeEventsHelper pauseResumeEventsHelper = new PauseResumeEventsHelper();
        pauseResumeEventsHelper.a = OneVideoPlayer.State.IDLE;
        this.l = pauseResumeEventsHelper;
        this.m = new tya0();
        wua0 wua0Var = new wua0();
        wua0Var.b = z3;
        this.n = wua0Var;
        this.o = jSONObject != null ? jSONObject.optJSONObject(NotificationCompat.CATEGORY_NAVIGATION) : null;
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("recom_info") : null;
        this.p = optJSONObject;
        a6l a6lVar = (wn80.q ? this : null) != null ? new a6l() : null;
        lsk0 lsk0Var = new lsk0(randomUUID);
        ListBuilder e2 = e43.e();
        e2.add(lsk0Var);
        if (wn80.q && a6lVar != null) {
            e2.add(a6lVar);
        }
        this.q = e2.g();
        Objects.toString(this.d);
        yi80.a c2 = c(Event.START_SESSION, z ? -1L : j2, str3, vrn0Var.e);
        c2.g = str2;
        c2.i.put(Param.DPI, Integer.valueOf(ryk0.j));
        LinkedHashMap linkedHashMap = c2.i;
        if (optJSONObject != null) {
            linkedHashMap.put(Param.RECOM_INFO, optJSONObject);
        } else {
            linkedHashMap.remove(Param.RECOM_INFO);
        }
        c2.i.put(Param.FROM_DOWNLOADS, Boolean.valueOf(z4));
        g(this, c2, SequencePosition.FIRST, 2);
        this.i = str3;
        this.u = new e();
        this.v = new d();
        this.w = new c();
        this.x = z3;
        this.y = z2;
    }

    public static final void a(a aVar, OneVideoPlayer oneVideoPlayer) {
        aVar.g.b(aVar.r == oneVideoPlayer, EnumC2182a.INVALID_PLAYER, new i4(16, aVar, oneVideoPlayer));
    }

    public static final long b(a aVar, final OneVideoPlayer oneVideoPlayer, final deb0 deb0Var) {
        vw3 vw3Var = aVar.g;
        final long l0 = oneVideoPlayer.l0();
        y6b0 U = oneVideoPlayer.U();
        sht0 a = U != null ? U.a(deb0Var.a) : null;
        if (a == null || !a.c) {
            return l0 + deb0Var.b;
        }
        Long l = deb0Var.c;
        long j = deb0Var.b;
        if (l != null) {
            return l.longValue() + l0;
        }
        final long duration = oneVideoPlayer.getDuration();
        vw3Var.b(duration <= 0, EnumC2182a.POSITIVE_DURATION_ON_SHITTY_LIVES, new uw3(0));
        vw3Var.b(j <= 0, EnumC2182a.POSITIVE_POSITION_ON_SHITTY_LIVES, new gzs() { // from class: xsna.rsi0
            @Override // xsna.gzs
            public final Object invoke() {
                OneVideoPlayer oneVideoPlayer2 = OneVideoPlayer.this;
                int N = oneVideoPlayer2.N();
                long j2 = deb0Var.b;
                String i0 = oneVideoPlayer2.i0();
                StringBuilder b2 = jr.b(N, X3.j.d, "] newPosition.position= ", j2);
                tj0.d(b2, " windowStartUnixTime= ", l0, " duration= ");
                b2.append(duration);
                b2.append(" player= ");
                b2.append(i0);
                return b2.toString();
            }
        });
        return l0 + j;
    }

    public static void g(a aVar, yi80.a aVar2, SequencePosition sequencePosition, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            sequencePosition = SequencePosition.MIDDLE;
        }
        aVar2.h = aVar.h.getAndIncrement();
        yi80 yi80Var = new yi80(aVar2);
        Iterator<E> it = aVar.q.iterator();
        while (it.hasNext()) {
            ((z000) it.next()).a(yi80Var, z, sequencePosition);
        }
    }

    public final yi80.a c(Event event, long j, String str, long j2) {
        yi80.a d2 = d(event, j, str, j2);
        LinkedHashMap linkedHashMap = d2.i;
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            linkedHashMap.put(Param.NAVIGATION, jSONObject);
        } else {
            linkedHashMap.remove(Param.NAVIGATION);
        }
        linkedHashMap.put(Param.STATS_VERSION, "2.1.1");
        linkedHashMap.put(Param.OS, X3.d);
        linkedHashMap.put(Param.OS_VERSION, ryk0.f);
        linkedHashMap.put(Param.DEVICE_TYPE, ryk0.g.h());
        linkedHashMap.put(Param.DEVICE_MANUFACTURER, ryk0.h);
        linkedHashMap.put(Param.DEVICE_MODEL, ryk0.i);
        return d2;
    }

    public final yi80.a d(Event event, long j, String str, long j2) {
        return new yi80.a(this.b, j2, Long.valueOf(j), event.h(), this.a, str);
    }

    public final long e(OneVideoPlayer oneVideoPlayer) {
        long l0 = oneVideoPlayer.l0();
        if (this.c) {
            if (l0 > 0) {
                return oneVideoPlayer.Z() + l0;
            }
            return -1L;
        }
        long Z = oneVideoPlayer.Z();
        long duration = oneVideoPlayer.getDuration();
        if (Z > duration) {
            int i = wn80.a;
        }
        return Math.min(Z, duration);
    }

    public final void f(long j, String str) {
        int i = wn80.a;
        if (this.f) {
            this.g.b(false, EnumC2182a.USE_AFTER_RELEASE_RELEASE, new uw3(0));
            return;
        }
        l(null, Long.valueOf(j));
        vrn0 vrn0Var = this.j;
        vrn0Var.b(j);
        g(this, d(Event.STOP, j, str, vrn0Var.e), SequencePosition.LAST, 2);
        this.f = true;
    }

    public final void h(String str) {
        this.g.b(this.r != null, EnumC2182a.PLAYER_IS_NULL_ON_FAILOVER, new com.vk.movika.sdk.base.model.props.a(28));
        OneVideoPlayer oneVideoPlayer = this.r;
        if (oneVideoPlayer == null) {
            return;
        }
        long e2 = e(oneVideoPlayer);
        Event event = Event.FAILOVER;
        vrn0 vrn0Var = this.j;
        vrn0Var.b(e2);
        yi80.a d2 = d(event, e2, str, vrn0Var.e);
        d2.b(this.e.toString());
        g(this, d2, null, 6);
    }

    public final void i(long j, long j2) {
        so4 so4Var;
        cms0 cms0Var;
        int i = 0;
        this.g.b(this.r != null, EnumC2182a.PLAYER_IS_NULL_ON_TELEMETRY_EVENT, new kcc0(4));
        OneVideoPlayer oneVideoPlayer = this.r;
        if (oneVideoPlayer == null) {
            return;
        }
        long a = oneVideoPlayer.a();
        one.video.player.tracks.c E = oneVideoPlayer.E();
        one.video.player.tracks.a M = oneVideoPlayer.M();
        one.video.player.tracks.c J = oneVideoPlayer.J();
        String b2 = b.b(E);
        String c2 = b.c(J);
        String a2 = b.a(oneVideoPlayer);
        int i2 = (E == null || (cms0Var = (cms0) E.c) == null) ? 0 : cms0Var.d;
        if (M != null && (so4Var = (so4) M.c) != null) {
            i = so4Var.d;
        }
        int i3 = (i2 + i) / 1000;
        yi80.a d2 = d(Event.TELEMETRY, j, this.i, j2);
        LinkedHashMap linkedHashMap = d2.i;
        d2.a(a);
        d2.b(this.e.toString());
        linkedHashMap.put(Param.USER_QUALITY, c2);
        d2.c(b2);
        linkedHashMap.put(Param.CODEC_INFO, a2);
        linkedHashMap.put(Param.BANDWIDTH_FROM_MANIFEST, Long.valueOf(i3));
        g(this, d2, null, 6);
    }

    public final void j(long j, String str, String str2, String str3, long j2, boolean z) {
        boolean z2 = this.c;
        yi80.a c2 = c(z2 ? Event.WATCH_COVERAGE_LIVE : Event.WATCH_COVERAGE, j, str, j2);
        LinkedHashMap linkedHashMap = c2.i;
        linkedHashMap.put(Param.WATCH_INTERVAL, str2);
        if (z2) {
            linkedHashMap.put(Param.LIVE, Boolean.valueOf(z));
        }
        c2.b(this.e.toString());
        c2.c(str3);
        JSONObject jSONObject = this.p;
        if (jSONObject != null) {
            linkedHashMap.put(Param.RECOM_INFO, jSONObject);
        } else {
            linkedHashMap.remove(Param.RECOM_INFO);
        }
        g(this, c2, null, 4);
    }

    public final void k(long j, String str) {
        OneVideoPlayer oneVideoPlayer = this.r;
        if (oneVideoPlayer == null) {
            this.g.b(false, EnumC2182a.PLAYER_IS_NULL_ON_WC_EVENT, new uw3(0));
        } else {
            j(j, this.i, str, b.b(oneVideoPlayer.E()), this.j.e, oneVideoPlayer.i());
        }
    }

    public final void l(OneVideoPlayer oneVideoPlayer, Long l) {
        Uri uri;
        if (this.f) {
            this.g.b(false, EnumC2182a.USE_AFTER_RELEASE_SET_PLAYER, new uw3(0));
            return;
        }
        if (epx.f(this.r, oneVideoPlayer)) {
            return;
        }
        Objects.toString(this.r);
        Objects.toString(oneVideoPlayer);
        int i = wn80.a;
        OneVideoPlayer oneVideoPlayer2 = this.r;
        qbx0 qbx0Var = this.k;
        vrn0 vrn0Var = this.j;
        c cVar = this.w;
        e eVar = this.u;
        d dVar = this.v;
        if (oneVideoPlayer2 != null) {
            long longValue = l != null ? l.longValue() : e(oneVideoPlayer2);
            oneVideoPlayer2.i0();
            oneVideoPlayer2.toString();
            new Exception();
            oneVideoPlayer2.T(dVar);
            oneVideoPlayer2.r(eVar);
            oneVideoPlayer2.c0(cVar);
            if (oneVideoPlayer2.getState() == OneVideoPlayer.State.PLAYING) {
                vrn0Var.getClass();
                vrn0Var.b(longValue);
                vrn0Var.d.b(vrn0Var.a(), vrn0.a.INVALID_INTERVAL_STATE2, new uw3(0));
                vrn0Var.i = -1L;
                String c2 = qbx0Var.c(longValue);
                if (c2 != null) {
                    k(longValue, c2);
                }
            }
        }
        if (oneVideoPlayer != null) {
            long longValue2 = l != null ? l.longValue() : e(oneVideoPlayer);
            sht0 j = oneVideoPlayer.j();
            if (j != null && (uri = j.b) != null) {
                uri.getHost();
            }
            oneVideoPlayer.i0();
            oneVideoPlayer.toString();
            new Exception();
            oneVideoPlayer.d0(cVar);
            oneVideoPlayer.W(eVar);
            oneVideoPlayer.s(dVar);
            if (oneVideoPlayer.getState() == OneVideoPlayer.State.PLAYING) {
                vrn0Var.c(longValue2);
                qbx0Var.b(longValue2);
            }
        }
        this.r = oneVideoPlayer;
    }
}
