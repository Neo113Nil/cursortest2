package xsna;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.ShareItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import org.chromium.base.TimeUtils;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.akt0;
import xsna.qs80;

/* compiled from: PublicVideoLink.kt */
/* loaded from: classes14.dex */
public final class zae0 implements kss0 {
    public final Object a;

    public zae0(Lazy lazy) {
        this.a = lazy;
    }

    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("/(?:video|live)([-0-9]+)_([0-9]+)", peq0Var, null, null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (com.vk.toggle.b.A.a(r0) == false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, final Context context, final LaunchContext launchContext, final yp80 yp80Var) {
        String str;
        String queryParameter;
        ReplyInfo replyInfo;
        Integer m;
        String str2 = launchContext.d;
        final VideoFileOld videoFileOld = new VideoFileOld();
        boolean z = true;
        videoFileOld.b = new UserId(peq0Var.c(1));
        videoFileOld.c = peq0Var.b(2);
        Uri uri = peq0Var.a;
        String queryParameter2 = uri.getQueryParameter("t");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        videoFileOld.l = queryParameter2;
        String a = cqm0.a(uri.getQueryParameter("access_key"));
        if (a == null) {
            a = uri.getQueryParameter("list");
        }
        videoFileOld.r0 = a != null ? a : "";
        com.vk.video.ui.share.api.b bVar = (com.vk.video.ui.share.api.b) this.a.getValue();
        if (bVar != null) {
            bVar.a(ShareItemType.VIDEO, uri.toString(), peq0Var.c(2), peq0Var.c(1));
        }
        if (Boolean.parseBoolean(uri.getQueryParameter("download"))) {
            VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RESTRICTION_DOWNLOAD_IN_VK_APP;
            videoFeatures.getClass();
        }
        if (!Boolean.parseBoolean(uri.getQueryParameter("start_download"))) {
            z = false;
        }
        String queryParameter3 = uri.getQueryParameter("t");
        long j = -1;
        if (queryParameter3 != null && !drm0.N(queryParameter3)) {
            Set S0 = j5g.S0(akt0.a.h());
            ArrayList arrayList = new ArrayList(c5g.u(S0, 10));
            Iterator it = S0.iterator();
            while (it.hasNext()) {
                arrayList.add(Character.valueOf(((akt0.a) it.next()).i()));
            }
            int i = 0;
            while (true) {
                if (i >= queryParameter3.length()) {
                    Long n = arm0.n(queryParameter3);
                    if (n != null) {
                        j = n.longValue();
                    }
                } else if (arrayList.contains(Character.valueOf(queryParameter3.charAt(i)))) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        int length = queryParameter3.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            char charAt = queryParameter3.charAt(i2);
                            if (charAt == akt0.a.HOURS.i()) {
                                j = Integer.parseInt(sb.toString()) * TimeUtils.SECONDS_PER_HOUR;
                                sb.setLength(0);
                            } else if (charAt == akt0.a.MINUTES.i()) {
                                long parseInt = Integer.parseInt(sb.toString()) * 60;
                                j = j > 0 ? j + parseInt : parseInt;
                                sb.setLength(0);
                            } else if (charAt == akt0.a.SECONDS.i()) {
                                long parseLong = Long.parseLong(sb.toString());
                                if (j > 0) {
                                    parseLong += j;
                                }
                                j = parseLong;
                            } else {
                                sb.append(charAt);
                            }
                            i2++;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                } else {
                    i++;
                }
            }
        }
        long j2 = j;
        final boolean z2 = z;
        izs izsVar = new izs(launchContext, this, videoFileOld, z2, context) { // from class: xsna.yae0
            public final /* synthetic */ LaunchContext c;
            public final /* synthetic */ VideoFileOld d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ Context f;

            {
                this.d = videoFileOld;
                this.e = z2;
                this.f = context;
            }

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                qs80 qs80Var = (qs80) obj;
                boolean z3 = qs80Var instanceof qs80.c;
                yp80 yp80Var2 = yp80.this;
                if (z3) {
                    if (yp80Var2 != null) {
                        yp80Var2.onSuccess();
                    }
                    String str3 = this.c.i;
                    if (str3 != null) {
                        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
                        VideoFileOld videoFileOld2 = this.d;
                        yg5 e = a2.e(videoFileOld2, null);
                        VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                        if (videoAutoPlay != null) {
                            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFileOld2.c), Long.valueOf(videoFileOld2.b.b), str3, videoFileOld2.W, null, 32, null), new MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem(new CommonStat$TypeCommonEventItem(Long.valueOf(videoFileOld2.c), Long.valueOf(videoFileOld2.b.b), str3, videoAutoPlay.K)), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b, uzp0Var.a).q();
                        }
                    }
                    if (this.e) {
                        g7s0.e(fxc0.B(), this.f, ((qs80.c) qs80Var).a, null, true, null, 96);
                        VideoFeatures videoFeatures2 = VideoFeatures.VK_VIDEO_RESTRICTION_DOWNLOAD_IN_VK_APP;
                        videoFeatures2.getClass();
                        com.vk.toggle.b.A.a(videoFeatures2);
                    }
                } else if (qs80Var instanceof qs80.a) {
                    if (yp80Var2 != null) {
                        yp80Var2.onError(((qs80.a) qs80Var).a);
                    }
                } else if (yp80Var2 != null) {
                    yp80Var2.U();
                }
                return s3q0.a;
            }
        };
        if (launchContext.a) {
            str2 = "push";
        } else {
            if (epx.f(str2, "notification")) {
                str = "notification";
                queryParameter = uri.getQueryParameter("reply");
                if (queryParameter != null || (m = arm0.m(10, queryParameter)) == null) {
                    replyInfo = null;
                } else {
                    int intValue = m.intValue();
                    String queryParameter4 = uri.getQueryParameter("thread");
                    replyInfo = new ReplyInfo(intValue, queryParameter4 != null ? arm0.m(10, queryParameter4) : null);
                }
                String str3 = launchContext.i;
                ydt0Var.k(context, videoFileOld, (r43 & 4) != 0 ? null : str, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : izsVar, (r43 & 256) != 0 ? null : replyInfo, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : j2, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return Boolean.TRUE;
            }
            if (!BuildInfo.q() || str2 == null || str2.length() == 0) {
                str2 = SignalingProtocol.KEY_CHAT_DIRECT;
            }
        }
        str = str2;
        queryParameter = uri.getQueryParameter("reply");
        if (queryParameter != null) {
        }
        replyInfo = null;
        String str32 = launchContext.i;
        ydt0Var.k(context, videoFileOld, (r43 & 4) != 0 ? null : str, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : izsVar, (r43 & 256) != 0 ? null : replyInfo, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : j2, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        return Boolean.TRUE;
    }
}
