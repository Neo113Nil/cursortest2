package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import xsna.go9;

/* loaded from: classes10.dex */
public final class y53 implements z53 {
    public final w53 a(nx0 nx0Var) {
        String str = nx0Var.m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new fl0(nx0Var.o);
                case "application/pgs":
                    return new ld2();
                case "application/x-mp4-vtt":
                    return new mw1();
                case "text/vtt":
                    return new vp3();
                case "application/x-quicktime-tx3g":
                    return new bb3(nx0Var.o);
                case "text/x-ssa":
                    return new f43(nx0Var.o);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new ht(str, nx0Var.E);
                case "text/x-exoplayer-cues":
                    return new wp0();
                case "application/cea-708":
                    return new mt(nx0Var.E, nx0Var.o);
                case "application/x-subrip":
                    return new t53();
                case "application/ttml+xml":
                    return new va3();
            }
        }
        throw new IllegalArgumentException(go9.b("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(nx0 nx0Var) {
        String str = nx0Var.m;
        return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
    }
}
