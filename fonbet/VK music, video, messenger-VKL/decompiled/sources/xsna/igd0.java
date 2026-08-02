package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.models.comment.ReplyInfo;
import kotlin.text.Regex;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.hl10;

/* compiled from: PrivateVideoLink.kt */
/* loaded from: classes14.dex */
public final class igd0 implements kss0 {
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        Regex regex = new Regex("video([-0-9]+)_([0-9]+)/(.*)?");
        String queryParameter = peq0Var.a.getQueryParameter("z");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return regex.f(queryParameter);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        hl10.b bVar;
        String str;
        Long n;
        String str2;
        Integer m;
        String str3;
        String str4;
        String str5;
        String queryParameter;
        ReplyInfo replyInfo;
        Integer m2;
        String str6 = launchContext.d;
        Regex regex = new Regex("video([-0-9]+)_([0-9]+)/(.*)?");
        Uri uri = peq0Var.a;
        String queryParameter2 = uri.getQueryParameter("z");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        hl10 b = regex.b(queryParameter2);
        if (b == null || (bVar = b.c) == null) {
            return Boolean.FALSE;
        }
        uk10 c = bVar.c(1);
        if (c == null || (str = c.a) == null || (n = arm0.n(str)) == null) {
            return Boolean.FALSE;
        }
        long longValue = n.longValue();
        uk10 c2 = bVar.c(2);
        if (c2 == null || (str2 = c2.a) == null || (m = arm0.m(10, str2)) == null) {
            return Boolean.FALSE;
        }
        int intValue = m.intValue();
        uk10 c3 = bVar.c(3);
        if (c3 == null || (str3 = c3.a) == null || (str4 = (String) j5g.a0(drm0.c0(str3, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6))) == null) {
            return Boolean.FALSE;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.b = new UserId(longValue);
        videoFileOld.c = intValue;
        videoFileOld.r0 = str4;
        hgd0 hgd0Var = new hgd0(yp80Var, 0);
        if (launchContext.a) {
            str6 = "push";
        } else {
            if (epx.f(str6, "notification")) {
                str5 = "notification";
                queryParameter = uri.getQueryParameter("reply");
                if (queryParameter != null || (m2 = arm0.m(10, queryParameter)) == null) {
                    replyInfo = null;
                } else {
                    int intValue2 = m2.intValue();
                    String queryParameter3 = uri.getQueryParameter("thread");
                    replyInfo = new ReplyInfo(intValue2, queryParameter3 != null ? arm0.m(10, queryParameter3) : null);
                }
                String str7 = launchContext.i;
                ydt0Var.k(context, videoFileOld, (r43 & 4) != 0 ? null : str5, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : hgd0Var, (r43 & 256) != 0 ? null : replyInfo, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return Boolean.TRUE;
            }
            if (!BuildInfo.q() || str6 == null || str6.length() == 0) {
                str6 = SignalingProtocol.KEY_CHAT_DIRECT;
            }
        }
        str5 = str6;
        queryParameter = uri.getQueryParameter("reply");
        if (queryParameter != null) {
        }
        replyInfo = null;
        String str72 = launchContext.i;
        ydt0Var.k(context, videoFileOld, (r43 & 4) != 0 ? null : str5, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : hgd0Var, (r43 & 256) != 0 ? null : replyInfo, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        return Boolean.TRUE;
    }
}
