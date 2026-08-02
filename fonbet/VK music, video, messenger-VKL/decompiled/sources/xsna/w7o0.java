package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Size;
import com.vk.video.bugreport.api.dto.DecodersDebugInfo;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import java.util.ArrayList;
import java.util.Iterator;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;

/* compiled from: TechBugreportDataExt.kt */
/* loaded from: classes3.dex */
public final class w7o0 {
    public static final VideoTechBugreportData a(OneVideoPlayer oneVideoPlayer, VideoTechBugreportData.VideoType videoType, wsk0 wsk0Var) {
        String str;
        String str2;
        so4 so4Var;
        cms0 cms0Var;
        so4 so4Var2;
        cms0 cms0Var2;
        v0b0 v0b0Var = new v0b0(oneVideoPlayer.getBufferedPosition() - oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getCurrentPosition(), oneVideoPlayer.getDuration(), oneVideoPlayer.getState().toString());
        one.video.player.tracks.c E = oneVideoPlayer.E();
        Long l = null;
        jlt0 jlt0Var = (E == null || (cms0Var2 = (cms0) E.c) == null) ? null : new jlt0(cms0Var2.b, cms0Var2.e, cms0Var2.f, cms0Var2.g, cms0Var2.d / 1024, cms0Var2.c);
        one.video.player.tracks.a M = oneVideoPlayer.M();
        cz4 cz4Var = (M == null || (so4Var2 = (so4) M.c) == null) ? null : new cz4(so4Var2.f, so4Var2.e, so4Var2.d / 1024, so4Var2.b, so4Var2.h, so4Var2.c);
        boolean z = oneVideoPlayer instanceof BaseVideoPlayer;
        BaseVideoPlayer baseVideoPlayer = z ? (BaseVideoPlayer) oneVideoPlayer : null;
        if (baseVideoPlayer != null) {
            baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.getVideoDecoderNameString");
            str = baseVideoPlayer.j;
        } else {
            str = null;
        }
        one.video.player.tracks.c E2 = oneVideoPlayer.E();
        DecodersDebugInfo.Type c = c((E2 == null || (cms0Var = (cms0) E2.c) == null) ? null : cms0Var.b, str);
        BaseVideoPlayer baseVideoPlayer2 = z ? (BaseVideoPlayer) oneVideoPlayer : null;
        if (baseVideoPlayer2 != null) {
            baseVideoPlayer2.verifyThread("one.video.player.BaseVideoPlayer.getAudioDecoderNameString");
            str2 = baseVideoPlayer2.k;
        } else {
            str2 = null;
        }
        one.video.player.tracks.a M2 = oneVideoPlayer.M();
        DecodersDebugInfo decodersDebugInfo = new DecodersDebugInfo(str, c, str2, c((M2 == null || (so4Var = (so4) M2.c) == null) ? null : so4Var.b, str2));
        Size f = oneVideoPlayer.f();
        BaseVideoPlayer baseVideoPlayer3 = z ? (BaseVideoPlayer) oneVideoPlayer : null;
        if (baseVideoPlayer3 != null) {
            vw3 vw3Var = BaseVideoPlayer.H;
            l = Long.valueOf(baseVideoPlayer3.h(false));
        }
        return new VideoTechBugreportData(videoType, wsk0Var, v0b0Var, jlt0Var, cz4Var, decodersDebugInfo, new lgq(f, l));
    }

    public static final VideoTechBugreportData b(d3b0 d3b0Var, VideoTechBugreportData.VideoType videoType) {
        wsk0 wsk0Var;
        OneVideoPlayer a = d3b0Var.a();
        if (a != null) {
            m7q c = d3b0Var.c();
            if (c != null) {
                wsk0Var = new wsk0(c.b, c.z, c.g, c.c);
            } else {
                wsk0Var = null;
            }
            if (wsk0Var != null) {
                return a(a, videoType, wsk0Var);
            }
        }
        return null;
    }

    public static final DecodersDebugInfo.Type c(String str, String str2) {
        Object obj;
        if (str == null || str2 == null) {
            return DecodersDebugInfo.Type.UNKNOWN;
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (brm0.w(supportedTypes[i], str, true)) {
                        arrayList.add(mediaCodecInfo);
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((MediaCodecInfo) obj).getName(), str2)) {
                break;
            }
        }
        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) obj;
        if (mediaCodecInfo2 == null) {
            return DecodersDebugInfo.Type.UNKNOWN;
        }
        if (Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo2.isHardwareAccelerated() : false) {
            return DecodersDebugInfo.Type.HW;
        }
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo2.isSoftwareOnly() : false ? DecodersDebugInfo.Type.SW : DecodersDebugInfo.Type.UNKNOWN;
    }
}
