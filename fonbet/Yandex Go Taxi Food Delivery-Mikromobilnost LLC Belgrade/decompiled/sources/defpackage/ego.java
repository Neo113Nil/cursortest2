package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.yandex.payment.common.result.ResultType;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public class ego implements j42 {
    public static final NumberFormat e;
    public final String a;
    public final z8z0 b;
    public final y8z0 c;
    public final long d;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public ego(int i) {
        this.a = "EventLogger";
        this.b = new z8z0();
        this.c = new y8z0();
        this.d = SystemClock.elapsedRealtime();
    }

    public static String a(ah3 ah3Var) {
        return ah3Var.a + "," + ah3Var.c + "," + ah3Var.b + "," + ah3Var.d + "," + ah3Var.e + "," + ah3Var.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return e.format(j / 1000.0f);
    }

    public final String b(h42 h42Var, String str, String str2, Throwable th) {
        StringBuilder v = oyr.v(str, " [");
        v.append(c(h42Var));
        String sb = v.toString();
        if (th instanceof PlaybackException) {
            StringBuilder v2 = oyr.v(sb, ", errorCode=");
            v2.append(((PlaybackException) th).a());
            sb = v2.toString();
        }
        if (str2 != null) {
            sb = g8e.p(sb, Extension.FIX_SPACE, str2);
        }
        String g = lk91.g(th);
        if (!TextUtils.isEmpty(g)) {
            StringBuilder v3 = oyr.v(sb, "\n  ");
            v3.append(g.replace("\n", "\n  "));
            v3.append('\n');
            sb = v3.toString();
        }
        return sb.concat("]");
    }

    public final String c(h42 h42Var) {
        String str = "window=" + h42Var.c;
        sf10 sf10Var = h42Var.d;
        if (sf10Var != null) {
            StringBuilder v = oyr.v(str, ", period=");
            v.append(h42Var.b.b(sf10Var.a));
            str = v.toString();
            if (sf10Var.b()) {
                StringBuilder v2 = oyr.v(str, ", adGroup=");
                v2.append(sf10Var.b);
                StringBuilder v3 = oyr.v(v2.toString(), ", ad=");
                v3.append(sf10Var.c);
                str = v3.toString();
            }
        }
        return "eventTime=" + d(h42Var.a - this.d) + ", mediaPos=" + d(h42Var.e) + Extension.FIX_SPACE + str;
    }

    public final void e(h42 h42Var, String str) {
        lk91.d(b(h42Var, str, null, null));
    }

    public final void f(h42 h42Var, String str, String str2) {
        lk91.d(b(h42Var, str, str2, null));
    }

    public final void g(w820 w820Var, String str) {
        for (int i = 0; i < w820Var.a.length; i++) {
            StringBuilder t = qv10.t(str);
            t.append(w820Var.a[i]);
            lk91.d(t.toString());
        }
    }

    @Override // defpackage.j42
    public final void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
        f(h42Var, "audioAttributes", oyr.m(ue3Var.a, ",0,1,1", new StringBuilder()));
    }

    @Override // defpackage.j42
    public final void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
        f(h42Var, "audioDecoderInitialized", str);
    }

    @Override // defpackage.j42
    public final void onAudioDecoderReleased(h42 h42Var, String str) {
        f(h42Var, "audioDecoderReleased", str);
    }

    @Override // defpackage.j42
    public final void onAudioDisabled(h42 h42Var, kyg kygVar) {
        e(h42Var, "audioDisabled");
    }

    @Override // defpackage.j42
    public final void onAudioEnabled(h42 h42Var, kyg kygVar) {
        e(h42Var, "audioEnabled");
    }

    @Override // defpackage.j42
    public final void onAudioInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
        f(h42Var, "audioInputFormat", a.c(aVar));
    }

    @Override // defpackage.j42
    public final void onAudioSessionIdChanged(h42 h42Var, int i) {
        f(h42Var, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.j42
    public final void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
        f(h42Var, "audioTrackInit", a(ah3Var));
    }

    @Override // defpackage.j42
    public final void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
        f(h42Var, "audioTrackReleased", a(ah3Var));
    }

    @Override // defpackage.j42
    public final void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
        lk91.e(this.a, b(h42Var, "audioTrackUnderrun", i + Extension.FIX_SPACE + j + Extension.FIX_SPACE + j2, null));
    }

    @Override // defpackage.j42
    public final void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
        f(h42Var, "downstreamFormat", a.c(he10Var.c));
    }

    @Override // defpackage.j42
    public final void onDrmKeysLoaded(h42 h42Var) {
        e(h42Var, "drmKeysLoaded");
    }

    @Override // defpackage.j42
    public final void onDrmKeysRemoved(h42 h42Var) {
        e(h42Var, "drmKeysRemoved");
    }

    @Override // defpackage.j42
    public final void onDrmKeysRestored(h42 h42Var) {
        e(h42Var, "drmKeysRestored");
    }

    @Override // defpackage.j42
    public final void onDrmSessionAcquired(h42 h42Var, int i) {
        f(h42Var, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.j42
    public final void onDrmSessionManagerError(h42 h42Var, Exception exc) {
        lk91.e(this.a, b(h42Var, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.j42
    public final void onDrmSessionReleased(h42 h42Var) {
        e(h42Var, "drmSessionReleased");
    }

    @Override // defpackage.j42
    public final void onDroppedVideoFrames(h42 h42Var, int i, long j) {
        f(h42Var, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.j42
    public final void onIsLoadingChanged(h42 h42Var, boolean z) {
        f(h42Var, ResultType.RESULT_TYPE_LOADING, Boolean.toString(z));
    }

    @Override // defpackage.j42
    public final void onIsPlayingChanged(h42 h42Var, boolean z) {
        f(h42Var, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.j42
    public final void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        lk91.e(this.a, b(h42Var, "internalError", "loadError", iOException));
    }

    @Override // defpackage.j42
    public final void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(h42Var));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        lk91.d(sb.toString());
    }

    @Override // defpackage.j42
    public final void onMetadata(h42 h42Var, w820 w820Var) {
        lk91.d("metadata [".concat(c(h42Var)));
        g(w820Var, "  ");
        lk91.d("]");
    }

    @Override // defpackage.j42
    public final void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(Extension.FIX_SPACE);
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(h42Var, "playWhenReady", sb.toString());
    }

    @Override // defpackage.j42
    public final void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
        f(h42Var, "playbackParameters", lxc0Var.toString());
    }

    @Override // defpackage.j42
    public final void onPlaybackStateChanged(h42 h42Var, int i) {
        f(h42Var, ClidProvider.STATE, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.j42
    public final void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
        f(h42Var, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? "?" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : JCP.RAW_PREFIX);
    }

    @Override // defpackage.j42
    public final void onPlayerError(h42 h42Var, PlaybackException playbackException) {
        lk91.e(this.a, b(h42Var, "playerFailed", null, playbackException));
    }

    @Override // defpackage.j42
    public final void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        int i2 = yxc0Var.b;
        int i3 = yxc0Var.h;
        sb.append(i2);
        sb.append(", period=");
        sb.append(yxc0Var.e);
        sb.append(", pos=");
        sb.append(yxc0Var.f);
        if (i3 != -1) {
            sb.append(", contentPos=");
            vfc.y(sb, yxc0Var.g, ", adGroup=", i3);
            sb.append(", ad=");
            sb.append(yxc0Var.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        int i4 = yxc0Var2.b;
        int i5 = yxc0Var2.h;
        sb.append(i4);
        sb.append(", period=");
        sb.append(yxc0Var2.e);
        sb.append(", pos=");
        sb.append(yxc0Var2.f);
        if (i5 != -1) {
            sb.append(", contentPos=");
            vfc.y(sb, yxc0Var2.g, ", adGroup=", i5);
            sb.append(", ad=");
            sb.append(yxc0Var2.i);
        }
        sb.append("]");
        f(h42Var, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.j42
    public final void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
        f(h42Var, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.j42
    public final void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
        StringBuilder t = b64.t(i, "rendererIndex=", Extension.FIX_SPACE);
        t.append(tw21.K(i2));
        t.append(Extension.FIX_SPACE);
        t.append(z);
        f(h42Var, "rendererReady", t.toString());
    }

    @Override // defpackage.j42
    public final void onRepeatModeChanged(h42 h42Var, int i) {
        f(h42Var, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.j42
    public final void onShuffleModeChanged(h42 h42Var, boolean z) {
        f(h42Var, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.j42
    public final void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
        f(h42Var, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.j42
    public final void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
        f(h42Var, "surfaceSize", i + Extension.FIX_SPACE + i2);
    }

    @Override // defpackage.j42
    public final void onTimelineChanged(h42 h42Var, int i) {
        a9z0 a9z0Var = h42Var.b;
        int i2 = a9z0Var.i();
        int p = a9z0Var.p();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(h42Var));
        sb.append(", periodCount=");
        sb.append(i2);
        n.A(sb, ", windowCount=", p, ", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        lk91.d(sb.toString());
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            y8z0 y8z0Var = this.c;
            a9z0Var.g(i3, y8z0Var, false);
            lk91.d("  period [" + d(tw21.l0(y8z0Var.d)) + "]");
        }
        if (i2 > 3) {
            lk91.d("  ...");
        }
        for (int i4 = 0; i4 < Math.min(p, 3); i4++) {
            z8z0 z8z0Var = this.b;
            a9z0Var.o(z8z0Var, i4);
            lk91.d("  window [" + d(tw21.l0(z8z0Var.l)) + ", seekable=" + z8z0Var.g + ", dynamic=" + z8z0Var.h + "]");
        }
        if (p > 3) {
            lk91.d("  ...");
        }
        lk91.d("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j42
    public final void onTracksChanged(h42 h42Var, r801 r801Var) {
        w820 w820Var;
        lk91.d("tracks [".concat(c(h42Var)));
        ImmutableList immutableList = r801Var.a;
        for (int i = 0; i < immutableList.size(); i++) {
            q801 q801Var = (q801) immutableList.get(i);
            lk91.d("  group [");
            for (int i2 = 0; i2 < q801Var.a; i2++) {
                String str = q801Var.e[i2] ? "[X]" : "[ ]";
                String C = tw21.C(q801Var.d[i2]);
                StringBuilder u = b64.u(i2, Extension.TAB_CHAR, str, " Track:", Extension.FIX_SPACE);
                u.append(a.c(q801Var.a(i2)));
                u.append(", supported=");
                u.append(C);
                lk91.d(u.toString());
            }
            lk91.d("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < immutableList.size(); i3++) {
            q801 q801Var2 = (q801) immutableList.get(i3);
            for (int i4 = 0; !z && i4 < q801Var2.a; i4++) {
                if (q801Var2.e[i4] && (w820Var = q801Var2.a(i4).l) != null && w820Var.a.length > 0) {
                    lk91.d("  Metadata [");
                    g(w820Var, Extension.TAB_CHAR);
                    lk91.d("  ]");
                    z = true;
                }
            }
        }
        lk91.d("]");
    }

    @Override // defpackage.j42
    public final void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
        f(h42Var, "upstreamDiscarded", a.c(he10Var.c));
    }

    @Override // defpackage.j42
    public final void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
        f(h42Var, "videoDecoderInitialized", str);
    }

    @Override // defpackage.j42
    public final void onVideoDecoderReleased(h42 h42Var, String str) {
        f(h42Var, "videoDecoderReleased", str);
    }

    @Override // defpackage.j42
    public final void onVideoDisabled(h42 h42Var, kyg kygVar) {
        e(h42Var, "videoDisabled");
    }

    @Override // defpackage.j42
    public final void onVideoEnabled(h42 h42Var, kyg kygVar) {
        e(h42Var, "videoEnabled");
    }

    @Override // defpackage.j42
    public final void onVideoInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
        f(h42Var, "videoInputFormat", a.c(aVar));
    }

    @Override // defpackage.j42
    public final void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
        f(h42Var, "videoSize", do31Var.a + Extension.FIX_SPACE + do31Var.b);
    }

    @Override // defpackage.j42
    public final void onVolumeChanged(h42 h42Var, float f) {
        f(h42Var, "volume", Float.toString(f));
    }

    public ego() {
        this(0);
    }
}
