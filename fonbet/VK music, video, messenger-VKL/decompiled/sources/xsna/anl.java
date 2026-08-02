package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;
import xsna.a1n0;

/* compiled from: DefaultSubtitleParserFactory.java */
/* loaded from: classes12.dex */
public final class anl implements a1n0.a {
    @Override // xsna.a1n0.a
    public final boolean a(androidx.media3.common.a aVar) {
        String str = aVar.n;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // xsna.a1n0.a
    public final int b(androidx.media3.common.a aVar) {
        String str = aVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(go9.b("Unsupported MIME type: ", str));
    }

    @Override // xsna.a1n0.a
    public final a1n0 c(androidx.media3.common.a aVar) {
        String str = aVar.n;
        List<byte[]> list = aVar.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new poo(list);
                case "application/pgs":
                    return new a2a0();
                case "application/x-mp4-vtt":
                    return new bg30();
                case "text/vtt":
                    return new bkx0();
                case "application/x-quicktime-tx3g":
                    return new ltp0(list);
                case "text/x-ssa":
                    return new knk0(list);
                case "application/vobsub":
                    return new rbw0(list);
                case "application/x-subrip":
                    return new xum0();
                case "application/ttml+xml":
                    return new vsp0();
            }
        }
        throw new IllegalArgumentException(go9.b("Unsupported MIME type: ", str));
    }
}
