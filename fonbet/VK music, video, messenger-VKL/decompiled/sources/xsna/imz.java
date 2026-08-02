package xsna;

import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.uuid.Uuid;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.media.StreamerLinkStats;
import ru.ok.media.StreamerMediaLinkStats;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.StreamerState;
import xsna.imz;
import xsna.j8y;
import xsna.wcy;

/* compiled from: LiveStreamStatReporterImplDevNull.kt */
/* loaded from: classes3.dex */
public final class imz implements LiveStreamStatReporter {
    public final String a;
    public final String b = Uuid.a.a().h().toUpperCase(Locale.ROOT);
    public LiveStreamStatReporter.PublisherType c = LiveStreamStatReporter.PublisherType.unspecified;
    public LiveStreamStatReporter.ApplicationState d = LiveStreamStatReporter.ApplicationState.active;

    /* compiled from: LiveStreamStatReporterImplDevNull.kt */
    public static final class a {
        public static final int a(long j) {
            if (j > 2147483647L) {
                return -1;
            }
            return (int) j;
        }

        public static final String b(Integer num) {
            String num2;
            return (num == null || (num2 = num.toString()) == null) ? "null" : num2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveStreamStatReporterImplDevNull.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AUDIO_FAILED;
        public static final b CONNECTED;
        public static final b CONNECTING;
        public static final b CREATED;
        public static final b CREATE_FAILED;
        public static final b DISCONNECTED;
        public static final b ENDED;
        public static final b LINK_AUDIO;
        public static final b LINK_VIDEO;
        public static final b PAUSED;
        public static final b PAUSE_FAILED;
        public static final b QUALITY;
        public static final b QUALITY_SWITCH;
        public static final b RESUMED;
        public static final b RESUME_FAILED;
        public static final b STARTED;
        public static final b START_FAILED;
        public static final b STATE_CHANGED;
        public static final b VIDEO_FAILED;
        private final String value;

        static {
            b bVar = new b("CREATE_FAILED", 0, "create_failed");
            CREATE_FAILED = bVar;
            b bVar2 = new b("CREATED", 1, "created");
            CREATED = bVar2;
            b bVar3 = new b("CONNECTING", 2, "connecting");
            CONNECTING = bVar3;
            b bVar4 = new b("CONNECTED", 3, AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED);
            CONNECTED = bVar4;
            b bVar5 = new b("START_FAILED", 4, "start_failed");
            START_FAILED = bVar5;
            b bVar6 = new b(SignalingProtocol.STATE_STARTED, 5, X3.i.d0);
            STARTED = bVar6;
            b bVar7 = new b("QUALITY", 6, "quality");
            QUALITY = bVar7;
            b bVar8 = new b("QUALITY_SWITCH", 7, "quality_switch");
            QUALITY_SWITCH = bVar8;
            b bVar9 = new b("PAUSE_FAILED", 8, "pause_failed");
            PAUSE_FAILED = bVar9;
            b bVar10 = new b("PAUSED", 9, X3.i.e0);
            PAUSED = bVar10;
            b bVar11 = new b("RESUMED", 10, "resumed");
            RESUMED = bVar11;
            b bVar12 = new b("RESUME_FAILED", 11, "resume_failed");
            RESUME_FAILED = bVar12;
            b bVar13 = new b("DISCONNECTED", 12, "disconnected");
            DISCONNECTED = bVar13;
            b bVar14 = new b(SignalingProtocol.STATE_ENDED, 13, X3.i.g0);
            ENDED = bVar14;
            b bVar15 = new b("STATE_CHANGED", 14, "state_changed");
            STATE_CHANGED = bVar15;
            b bVar16 = new b("AUDIO_FAILED", 15, "audio_failed");
            AUDIO_FAILED = bVar16;
            b bVar17 = new b("VIDEO_FAILED", 16, "video_failed");
            VIDEO_FAILED = bVar17;
            b bVar18 = new b("LINK_AUDIO", 17, "link_audio");
            LINK_AUDIO = bVar18;
            b bVar19 = new b("LINK_VIDEO", 18, "link_video");
            LINK_VIDEO = bVar19;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, String str2) {
            this.value = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public imz(String str) {
        this.a = str;
    }

    public static void a(imz imzVar, b bVar, String str, Integer num, String str2, Integer num2, Integer num3, String str3, Integer num4, String str4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, int i) {
        String str5 = (i & 2) != 0 ? null : str;
        Integer num14 = (i & 4) != 0 ? null : num;
        String str6 = (i & 8) != 0 ? null : str2;
        Integer num15 = (i & 16) != 0 ? null : num2;
        Integer num16 = (i & 32) != 0 ? null : num3;
        String str7 = (i & 64) != 0 ? null : str3;
        Integer num17 = (i & 128) != 0 ? null : num4;
        String str8 = (i & 256) != 0 ? null : str4;
        Integer num18 = (i & 512) != 0 ? null : num5;
        Integer num19 = (i & 1024) != 0 ? null : num6;
        Integer num20 = (i & 2048) != 0 ? null : num7;
        Integer num21 = (i & 4096) != 0 ? null : num8;
        Integer num22 = (i & 8192) != 0 ? null : num9;
        Integer num23 = (i & 16384) != 0 ? null : num10;
        Integer num24 = (32768 & i) != 0 ? null : num11;
        Integer num25 = (65536 & i) != 0 ? null : num12;
        Integer num26 = (i & 131072) != 0 ? null : num13;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem("stream", str5, str6, num14, bVar.h(), num15, str7, num16, str8, num17, null, num18, null, num19, null, num20, null, num21, null, num22, null, num23, null, num24, null, num25, null, Integer.valueOf(imzVar.d.ordinal()), null, null, imzVar.a, num26, imzVar.b, Integer.valueOf(imzVar.c.getType()), 894784512, 0, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    public final void b(b bVar, StreamerMediaLinkStats streamerMediaLinkStats, StreamerState streamerState) {
        int a2 = a.a(streamerMediaLinkStats.getStallsCount());
        int a3 = a.a(streamerMediaLinkStats.getStallDuration());
        int a4 = a.a(streamerMediaLinkStats.getUnstableCount());
        int a5 = a.a(streamerMediaLinkStats.getUnstableDuration());
        int a6 = a.a(streamerMediaLinkStats.getPauseCount());
        int a7 = a.a(streamerMediaLinkStats.getPauseDuration());
        int a8 = a.a(streamerMediaLinkStats.getDisconnectCount());
        int a9 = a.a(streamerMediaLinkStats.getDisconnectDuration());
        int a10 = a.a(streamerMediaLinkStats.getDuration());
        a(this, bVar, null, null, null, Integer.valueOf(a2), Integer.valueOf(a3), streamerMediaLinkStats.getState().name(), Integer.valueOf(a4), streamerState.name(), Integer.valueOf(a5), Integer.valueOf(a6), Integer.valueOf(a7), Integer.valueOf(a8), Integer.valueOf(a9), null, null, null, Integer.valueOf(a10), 114702);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void setApplicationState(LiveStreamStatReporter.ApplicationState applicationState) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: setApplicationState - " + applicationState.ordinal() + ' ' + applicationState);
            }
            this.d = applicationState;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamAudioFailed(String str, String str2) {
        String str3;
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                StringBuilder sb = new StringBuilder("stream stat: streamAudioFailed - event: ");
                sb.append(str);
                sb.append(" error: ");
                str3 = str2;
                sb.append(str3);
                ne7.m("Publisher", sb.toString());
            } else {
                str3 = str2;
            }
            a(this, b.AUDIO_FAILED, null, null, null, null, null, str.length() == 0 ? null : str, null, str3.length() == 0 ? null : str3, null, null, null, null, null, null, null, null, null, 261822);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamConnected(String str, String str2) {
        String str3;
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                StringBuilder sb = new StringBuilder("stream stat: streamConnected - fromAddress= ");
                sb.append(str);
                sb.append(" interface= ");
                str3 = str2;
                sb.append(str3);
                ne7.m("Publisher", sb.toString());
            } else {
                str3 = str2;
            }
            a(this, b.CONNECTED, null, null, str.length() == 0 ? null : str, null, null, null, null, str3.length() == 0 ? null : str3, null, null, null, null, null, null, null, null, null, 261878);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamConnecting(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamConnecting - " + str);
            }
            a(this, b.CONNECTING, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamCreateFailed(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamCreateFailed - " + str);
            }
            a(this, b.CREATE_FAILED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamCreated(LiveStreamStatReporter.PublisherType publisherType) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamCreated - " + publisherType.ordinal() + ' ' + publisherType);
            }
            this.c = publisherType;
            a(this, b.CREATED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamDisconnected(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamDisconnected - " + str);
            }
            a(this, b.DISCONNECTED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamEnded(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamEnded - " + str);
            }
            a(this, b.ENDED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamLink(StreamerState streamerState, StreamerLinkStats streamerLinkStats) {
        if (ne7.y(0, "Publisher")) {
            ne7.m("Publisher", "stream stat: streamLink - state: " + streamerState + " linkStats: " + streamerLinkStats);
        }
        b(b.LINK_AUDIO, streamerLinkStats.getAudio(), streamerState);
        b(b.LINK_VIDEO, streamerLinkStats.getVideo(), streamerState);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamPauseFailed(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamPauseFailed - " + str);
            }
            a(this, b.PAUSE_FAILED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamPaused(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamPaused - " + str);
            }
            a(this, b.PAUSED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamQuality(final int i, final StreamerState streamerState, final Integer num, final Integer num2, final int i2, final Integer num3, final int i3, final Integer num4, final int i4, final long j, final long j2, final long j3, final int i5, final int i6, final int i7, final long j4, final Integer[] numArr, final long j5, final Integer[] numArr2) {
        String str;
        synchronized (this) {
            gzs gzsVar = new gzs() { // from class: xsna.hmz
                @Override // xsna.gzs
                public final Object invoke() {
                    String str2;
                    String Z;
                    StringBuilder sb = new StringBuilder("stream stat: streamQuality - ");
                    sb.append(i);
                    sb.append(" ms ");
                    sb.append(streamerState);
                    sb.append(' ');
                    sb.append(imz.a.b(num));
                    sb.append('x');
                    sb.append(imz.a.b(num2));
                    sb.append('@');
                    sb.append(i2);
                    sb.append(" (@");
                    sb.append(imz.a.b(num3));
                    sb.append(") bitrate: ");
                    sb.append(i3);
                    sb.append(" altBitrate: ");
                    sb.append(imz.a.b(num4));
                    sb.append(" bandwidth: ");
                    sb.append(i4);
                    sb.append(" bytes sent: ");
                    sb.append(j);
                    tj0.d(sb, " rcvd: ", j2, " vframes dropped: ");
                    cgn.a(i5, i6, " lost packets v: ", " a: ", sb);
                    sb.append(i7);
                    sb.append(" bytes dropped: ");
                    sb.append(j3);
                    tj0.d(sb, " ticks: ", j4, " lastBlocksNative: ");
                    String str3 = "null";
                    Integer[] numArr3 = numArr;
                    if (numArr3 == null || (str2 = rl3.Z(numArr3, ", ", X3.j.d, X3.j.e, null, 56)) == null) {
                        str2 = "null";
                    }
                    sb.append(str2);
                    sb.append(" ticks2: ");
                    sb.append(j5);
                    sb.append(" lastBlocks: ");
                    Integer[] numArr4 = numArr2;
                    if (numArr4 != null && (Z = rl3.Z(numArr4, ", ", X3.j.d, X3.j.e, null, 56)) != null) {
                        str3 = Z;
                    }
                    sb.append(str3);
                    return sb.toString();
                }
            };
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", (String) gzsVar.invoke());
            }
            Map k = pn00.k(new Pair("bd", Long.valueOf(j3)), new Pair("ticks", Long.valueOf(j4)), new Pair("qbn", numArr), new Pair("t2", Long.valueOf(j5)), new Pair("qb", numArr2));
            try {
                j8y.a aVar = j8y.d;
                de deVar = aVar.b;
                int i8 = wcy.c;
                str = aVar.b(s1v.p(deVar, fpf0.g(wcy.a.a(fpf0.d(String.class)), wcy.a.a(fpf0.c(Serializable.class)))), k);
            } catch (Exception e) {
                ne7.n("Publisher", "failed to serialize to JSON, value: " + k + " error: " + e);
                str = null;
            }
            a(this, b.QUALITY, str, Integer.valueOf(i2), null, num, num2, streamerState.name(), Integer.valueOf(i3), null, num4, Integer.valueOf(i4), Integer.valueOf(a.a(j)), Integer.valueOf(a.a(j2)), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), num3, Integer.valueOf(i), 264);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamQualitySwitched(int i, int i2, int i3, int i4) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamQualitySwitched - " + i + 'x' + i2 + " video: " + i3 + " audio: " + i4);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamResumeFailed(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamResumeFailed - " + str);
            }
            a(this, b.RESUME_FAILED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamResumed() {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamResumed");
            }
            a(this, b.RESUMED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamStartFailed(String str) {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamStartFailed - " + str);
            }
            a(this, b.START_FAILED, null, null, str.length() == 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262134);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamStarted() {
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                ne7.m("Publisher", "stream stat: streamStarted");
            }
            a(this, b.STARTED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamStateChanged(StreamerState streamerState, StreamerState streamerState2, String str) {
        StreamerState streamerState3;
        String str2;
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                StringBuilder sb = new StringBuilder("stream stat: streamStateChanged - ");
                sb.append(streamerState);
                sb.append(" -> ");
                streamerState3 = streamerState2;
                sb.append(streamerState3);
                sb.append(" reason: ");
                str2 = str;
                sb.append(str2);
                ne7.m("Publisher", sb.toString());
            } else {
                streamerState3 = streamerState2;
                str2 = str;
            }
            a(this, b.STATE_CHANGED, null, null, str2.length() == 0 ? null : str2, null, null, streamerState3.name(), null, streamerState.name(), null, null, null, null, null, null, null, null, null, 261814);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public final void streamVideoFailed(String str, String str2) {
        String str3;
        synchronized (this) {
            if (ne7.y(0, "Publisher")) {
                StringBuilder sb = new StringBuilder("stream stat: streamVideoFailed - event: ");
                sb.append(str);
                sb.append(" error: ");
                str3 = str2;
                sb.append(str3);
                ne7.m("Publisher", sb.toString());
            } else {
                str3 = str2;
            }
            a(this, b.VIDEO_FAILED, null, null, null, null, null, str.length() == 0 ? null : str, null, str3.length() == 0 ? null : str3, null, null, null, null, null, null, null, null, null, 261822);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
