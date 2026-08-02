package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import one.video.player.FormatSupport;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoRendererException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.OneVideoUnexpectedException;
import one.video.player.error.ResponseInfo;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* compiled from: VideoTechErrorEventBuilder.kt */
/* loaded from: classes2.dex */
public final class njt0 extends l5m {
    public static final List<String> r;
    public static final Regex s;
    public static final HashMap<OneVideoPlaybackException.Type, Integer> t;
    public static final HashMap<OneVideoPlaybackException.ErrorCode, Integer> u;
    public static final HashMap<FormatSupport, Integer> v;
    public final int h;
    public final m7q i;
    public final Throwable j;
    public final int k;
    public final PlayerType l;
    public final int m;
    public final String n;
    public final String o;
    public final boolean p;
    public final int q;

    static {
        List<String> l = e43.l("vkvd[0-9]+", "vksvd[0-9]+", "vd[0-9]+", "vk[0-9]+", "ok[0-9]+", "vklive[0-9]+", "vkvdс[1-9]+");
        r = l;
        s = new Regex(ho8.a(new StringBuilder("("), j5g.g0(l, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ')'));
        t = pn00.i(new Pair(OneVideoPlaybackException.Type.SOURCE, 0), new Pair(OneVideoPlaybackException.Type.RENDERER, 1), new Pair(OneVideoPlaybackException.Type.UNEXPECTED, 2), new Pair(OneVideoPlaybackException.Type.REMOTE, 3));
        u = pn00.i(new Pair(OneVideoPlaybackException.ErrorCode.UNSPECIFIED, 1000), new Pair(OneVideoPlaybackException.ErrorCode.REMOTE_ERROR, 1001), new Pair(OneVideoPlaybackException.ErrorCode.BEHIND_LIVE_WINDOW, 1002), new Pair(OneVideoPlaybackException.ErrorCode.TIMEOUT, 1003), new Pair(OneVideoPlaybackException.ErrorCode.FAILED_RUNTIME_CHECK, 1004), new Pair(OneVideoPlaybackException.ErrorCode.IO_UNSPECIFIED, 2000), new Pair(OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_FAILED, 2001), new Pair(OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT, 2002), new Pair(OneVideoPlaybackException.ErrorCode.IO_INVALID_HTTP_CONTENT_TYPE, 2003), new Pair(OneVideoPlaybackException.ErrorCode.IO_BAD_HTTP_STATUS, 2004), new Pair(OneVideoPlaybackException.ErrorCode.IO_FILE_NOT_FOUND, 2005), new Pair(OneVideoPlaybackException.ErrorCode.IO_NO_PERMISSION, 2006), new Pair(OneVideoPlaybackException.ErrorCode.IO_CLEARTEXT_NOT_PERMITTED, 2007), new Pair(OneVideoPlaybackException.ErrorCode.IO_READ_POSITION_OUT_OF_RANGE, 2008), new Pair(OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED, 3001), new Pair(OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED, 3002), new Pair(OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_UNSUPPORTED, Integer.valueOf(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE)), new Pair(OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_UNSUPPORTED, 3004), new Pair(OneVideoPlaybackException.ErrorCode.DECODER_INIT_FAILED, 4001), new Pair(OneVideoPlaybackException.ErrorCode.DECODER_QUERY_FAILED, 4002), new Pair(OneVideoPlaybackException.ErrorCode.DECODING_FAILED, 4003), new Pair(OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_EXCEEDS_CAPABILITIES, 4004), new Pair(OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_UNSUPPORTED, 4005), new Pair(OneVideoPlaybackException.ErrorCode.DECODING_RESOURCES_RECLAIMED, 4006), new Pair(OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_INIT_FAILED, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)), new Pair(OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_WRITE_FAILED, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_UNSPECIFIED, Integer.valueOf(RtpSenderHelper.AUDIO_BITRATE_MIN)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_SCHEME_UNSUPPORTED, Integer.valueOf(AuthCode.StatusCode.WAITING_CONNECT)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_PROVISIONING_FAILED, Integer.valueOf(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_CONTENT_ERROR, Integer.valueOf(AuthCode.StatusCode.CERT_FINGERPRINT_ERROR)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_LICENSE_ACQUISITION_FAILED, Integer.valueOf(AuthCode.StatusCode.PERMISSION_NOT_EXIST)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_DISALLOWED_OPERATION, Integer.valueOf(AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_SYSTEM_ERROR, Integer.valueOf(AuthCode.StatusCode.PERMISSION_EXPIRED)), new Pair(OneVideoPlaybackException.ErrorCode.DRM_DEVICE_REVOKED, 6007), new Pair(OneVideoPlaybackException.ErrorCode.DRM_LICENSE_EXPIRED, 6008), new Pair(OneVideoPlaybackException.ErrorCode.VIDEO_FRAME_PROCESSOR_INIT_FAILED, 7000), new Pair(OneVideoPlaybackException.ErrorCode.VIDEO_FRAME_PROCESSING_FAILED, 7001));
        v = pn00.i(new Pair(FormatSupport.FORMAT_HANDLED, 4), new Pair(FormatSupport.FORMAT_EXCEEDS_CAPABILITIES, 3), new Pair(FormatSupport.FORMAT_UNSUPPORTED_DRM, 2), new Pair(FormatSupport.FORMAT_UNSUPPORTED_SUBTYPE, 1), new Pair(FormatSupport.FORMAT_UNSUPPORTED_TYPE, 0));
    }

    public njt0(int i, m7q m7qVar, Throwable th, int i2, PlayerType playerType, int i3, String str, String str2, boolean z, int i4) {
        super(null, null, 3);
        this.h = i;
        this.i = m7qVar;
        this.j = th;
        this.k = i2;
        this.l = playerType;
        this.m = i3;
        this.n = str;
        this.o = str2;
        this.p = z;
        this.q = i4;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String str;
        String str2;
        String str3;
        Integer num;
        OneVideoUnexpectedException k;
        OneVideoUnexpectedException.a d;
        OneVideoPlaybackException.StuckType stuckType;
        OneVideoSourceException i;
        OneVideoSourceException.a g;
        OneVideoSourceException i2;
        OneVideoSourceException.a g2;
        OneVideoRendererException h;
        FormatSupport i3;
        OneVideoPlaybackException.ErrorCode d2;
        OneVideoRendererException h2;
        OneVideoPlaybackException.Type j;
        OneVideoSourceException i4;
        OneVideoSourceException.a g3;
        ResponseInfo responseInfo;
        OneVideoSourceException i5;
        OneVideoSourceException.a g4;
        OneVideoRendererException h3;
        OneVideoRendererException h4;
        OneVideoRendererException h5;
        FormatSupport i6;
        OneVideoRendererException h6;
        er10 h7;
        OneVideoRendererException h8;
        String h9 = DevNullEventKey.OVPLAYER_ERROR.h();
        m7q m7qVar = this.i;
        String uri = m7qVar.e.b.toString();
        String obj = this.l.toString();
        Throwable th = this.j;
        String message = th.getMessage();
        OneVideoPlaybackException v2 = v();
        Integer num2 = null;
        String k2 = (v2 == null || (h8 = v2.h()) == null) ? null : h8.k();
        OneVideoPlaybackException v3 = v();
        String g5 = v3 != null ? v3.g() : null;
        OneVideoPlaybackException v4 = v();
        if (v4 == null || (h6 = v4.h()) == null || (h7 = h6.h()) == null) {
            str = null;
        } else {
            str = h7 instanceof cms0 ? ((cms0) h7).c : h7 instanceof so4 ? ((so4) h7).c : null;
        }
        OneVideoPlaybackException v5 = v();
        if (v5 == null || (h5 = v5.h()) == null || (i6 = h5.i()) == null) {
            str2 = null;
        } else {
            String str4 = (String) y8s.b.get(i6);
            if (str4 == null) {
                str4 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            str2 = str4;
        }
        OneVideoPlaybackException v6 = v();
        String g6 = (v6 == null || (h4 = v6.h()) == null) ? null : h4.g();
        OneVideoPlaybackException v7 = v();
        String d3 = (v7 == null || (h3 = v7.h()) == null) ? null : h3.d();
        String str5 = this.o;
        if (str5 == null) {
            str5 = m7qVar.r;
        }
        String str6 = str5;
        gpt0 gpt0Var = gpt0.a;
        String h10 = gpt0.h(m7qVar);
        Throwable cause = th.getCause();
        String message2 = cause != null ? cause.getMessage() : null;
        OneVideoPlaybackException v8 = v();
        String str7 = (v8 == null || (i5 = v8.i()) == null || (g4 = i5.g()) == null) ? null : g4.b;
        OneVideoPlaybackException v9 = v();
        String description = (v9 == null || (i4 = v9.i()) == null || (g3 = i4.g()) == null || (responseInfo = g3.d) == null) ? null : responseInfo.getDescription();
        hl10 b = s.b(String.valueOf(m7qVar.e.b.getHost()));
        if (b == null || (str3 = b.a.group()) == null) {
            str3 = "other";
        }
        String str8 = str3;
        OneVideoPlaybackException v10 = v();
        Integer num3 = (v10 == null || (j = v10.j()) == null) ? null : t.get(j);
        OneVideoPlaybackException v11 = v();
        Integer valueOf = (v11 == null || (h2 = v11.h()) == null) ? null : Integer.valueOf(h2.j());
        OneVideoPlaybackException v12 = v();
        if (v12 == null || (d2 = v12.d()) == null) {
            num = null;
        } else {
            Integer num4 = u.get(d2);
            num = Integer.valueOf(num4 != null ? num4.intValue() : 0);
        }
        OneVideoPlaybackException v13 = v();
        Integer num5 = (v13 == null || (h = v13.h()) == null || (i3 = h.i()) == null) ? null : v.get(i3);
        OneVideoPlaybackException v14 = v();
        Integer valueOf2 = (v14 == null || (i2 = v14.i()) == null || (g2 = i2.g()) == null) ? null : Integer.valueOf(g2.a);
        int i7 = m7qVar.k;
        OneVideoPlaybackException v15 = v();
        Integer valueOf3 = (v15 == null || (i = v15.i()) == null || (g = i.g()) == null) ? null : Integer.valueOf(g.a);
        boolean i8 = r6m.i();
        OneVideoPlaybackException v16 = v();
        if (v16 != null && (k = v16.k()) != null && (d = k.d()) != null && (stuckType = d.a) != null) {
            num2 = Integer.valueOf(stuckType.ordinal());
        }
        this.g = new SchemeStat$TypeDevNullItem(h9, null, uri, Integer.valueOf(this.h), obj, Integer.valueOf(this.k), message, num3, k2, valueOf, g5, num, this.n, num5, str, null, str2, valueOf2, g6, Integer.valueOf(this.m), d3, Integer.valueOf(i7), str6, Integer.valueOf(this.p ? 1 : 0), h10, Integer.valueOf(this.q), message2, valueOf3, str7, null, description, Integer.valueOf(i8 ? 1 : 0), str8, num2, 536903682, 0, null);
        return super.p();
    }

    public final OneVideoPlaybackException v() {
        Throwable th = this.j;
        if (th instanceof OneVideoPlaybackException) {
            return (OneVideoPlaybackException) th;
        }
        return null;
    }
}
