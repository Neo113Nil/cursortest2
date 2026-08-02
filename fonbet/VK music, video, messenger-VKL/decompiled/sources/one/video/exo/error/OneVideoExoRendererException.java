package one.video.exo.error;

import android.media.MediaCodecInfo;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import one.video.player.FormatSupport;
import one.video.player.error.OneVideoRendererException;
import xsna.dgn;
import xsna.er10;
import xsna.fr10;
import xsna.fxc0;
import xsna.hq10;
import xsna.pzl;
import xsna.y8s;

/* compiled from: OneVideoExoRendererException.kt */
/* loaded from: classes8.dex */
public final class OneVideoExoRendererException extends OneVideoRendererException {
    private final String codecInfo;
    private final boolean isDecoderException;
    private final boolean isDecoderInitializationException;
    private final String mimeType;
    private final er10 rendererFormat;
    private final FormatSupport rendererFormatSupport;
    private final int rendererIndex;
    private final String rendererName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OneVideoExoRendererException(ExoPlaybackException exoPlaybackException) {
        super((Exception) r0);
        er10 er10Var;
        MediaCodecRenderer.DecoderInitializationException decoderInitializationException;
        MediaCodecDecoderException mediaCodecDecoderException;
        String b;
        a aVar;
        a aVar2;
        a aVar3;
        fxc0.z(exoPlaybackException.type == 1);
        Throwable cause = exoPlaybackException.getCause();
        cause.getClass();
        String str = exoPlaybackException.rendererName;
        this.rendererName = str;
        String str2 = null;
        if (exoPlaybackException.type == 1 && str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1782852404) {
                if (hashCode != -598752976) {
                    if (hashCode == 846582055 && str.equals("MediaCodecAudioRenderer") && (aVar3 = exoPlaybackException.rendererFormat) != null) {
                        er10Var = fr10.a(aVar3);
                    }
                } else if (str.equals("TextRenderer") && (aVar2 = exoPlaybackException.rendererFormat) != null) {
                    er10Var = fr10.c(aVar2);
                }
            } else if (str.equals("MediaCodecVideoRenderer") && (aVar = exoPlaybackException.rendererFormat) != null) {
                er10Var = fr10.d(aVar);
            }
            this.rendererFormat = er10Var;
            HashMap hashMap = y8s.a;
            FormatSupport formatSupport = (FormatSupport) y8s.a.get(Integer.valueOf(exoPlaybackException.rendererFormatSupport));
            this.rendererFormatSupport = formatSupport == null ? FormatSupport.UNKNOWN : formatSupport;
            this.rendererIndex = exoPlaybackException.rendererIndex;
            this.isDecoderInitializationException = getCause() instanceof MediaCodecRenderer.DecoderInitializationException;
            Throwable cause2 = getCause();
            MediaCodecRenderer.DecoderInitializationException decoderInitializationException2 = !(cause2 instanceof MediaCodecRenderer.DecoderInitializationException) ? (MediaCodecRenderer.DecoderInitializationException) cause2 : null;
            this.mimeType = decoderInitializationException2 == null ? decoderInitializationException2.mimeType : null;
            this.isDecoderException = getCause() instanceof MediaCodecDecoderException;
            Throwable cause3 = getCause();
            decoderInitializationException = !(cause3 instanceof MediaCodecRenderer.DecoderInitializationException) ? (MediaCodecRenderer.DecoderInitializationException) cause3 : null;
            if (decoderInitializationException != null || (b = pzl.b(m(decoderInitializationException.codecInfo), StringUtils.COMMA, decoderInitializationException.diagnosticInfo)) == null) {
                Throwable cause4 = getCause();
                mediaCodecDecoderException = !(cause4 instanceof MediaCodecDecoderException) ? (MediaCodecDecoderException) cause4 : null;
                if (mediaCodecDecoderException != null) {
                    str2 = pzl.b(m(mediaCodecDecoderException.codecInfo), StringUtils.COMMA, mediaCodecDecoderException.diagnosticInfo);
                }
            } else {
                str2 = b;
            }
            this.codecInfo = str2;
        }
        er10Var = null;
        this.rendererFormat = er10Var;
        HashMap hashMap2 = y8s.a;
        FormatSupport formatSupport2 = (FormatSupport) y8s.a.get(Integer.valueOf(exoPlaybackException.rendererFormatSupport));
        this.rendererFormatSupport = formatSupport2 == null ? FormatSupport.UNKNOWN : formatSupport2;
        this.rendererIndex = exoPlaybackException.rendererIndex;
        this.isDecoderInitializationException = getCause() instanceof MediaCodecRenderer.DecoderInitializationException;
        Throwable cause22 = getCause();
        if (!(cause22 instanceof MediaCodecRenderer.DecoderInitializationException)) {
        }
        this.mimeType = decoderInitializationException2 == null ? decoderInitializationException2.mimeType : null;
        this.isDecoderException = getCause() instanceof MediaCodecDecoderException;
        Throwable cause32 = getCause();
        if (!(cause32 instanceof MediaCodecRenderer.DecoderInitializationException)) {
        }
        if (decoderInitializationException != null) {
        }
        Throwable cause42 = getCause();
        if (!(cause42 instanceof MediaCodecDecoderException)) {
        }
        if (mediaCodecDecoderException != null) {
        }
        this.codecInfo = str2;
    }

    public static String m(hq10 hq10Var) {
        if (hq10Var == null) {
            return "";
        }
        String str = hq10Var.a;
        int compare = Boolean.compare(hq10Var.h, false);
        int compare2 = Boolean.compare(hq10Var.e, false);
        int compare3 = Boolean.compare(hq10Var.f(), false);
        MediaCodecInfo.CodecCapabilities codecCapabilities = hq10Var.d;
        int maxSupportedInstances = codecCapabilities == null ? -1 : codecCapabilities.getMaxSupportedInstances();
        int compare4 = Boolean.compare(hq10Var.g, false);
        int compare5 = Boolean.compare(hq10Var.i, false);
        int compare6 = Boolean.compare(hq10Var.j, false);
        int compare7 = Boolean.compare(hq10Var.f, false);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(StringUtils.COMMA);
        sb.append(compare);
        sb.append(StringUtils.COMMA);
        sb.append(compare2);
        dgn.a(compare3, maxSupportedInstances, StringUtils.COMMA, StringUtils.COMMA, sb);
        dgn.a(compare4, compare5, StringUtils.COMMA, StringUtils.COMMA, sb);
        sb.append(StringUtils.COMMA);
        sb.append(compare6);
        sb.append(StringUtils.COMMA);
        sb.append(compare7);
        return sb.toString();
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final String d() {
        return this.codecInfo;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final String g() {
        return this.mimeType;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final er10 h() {
        return this.rendererFormat;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final FormatSupport i() {
        return this.rendererFormatSupport;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final int j() {
        return this.rendererIndex;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final String k() {
        return this.rendererName;
    }

    @Override // one.video.player.error.OneVideoRendererException
    public final boolean l() {
        return this.isDecoderInitializationException;
    }
}
