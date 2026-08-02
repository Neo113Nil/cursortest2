package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes12.dex */
public interface ni20 {
    public static final a a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    public class a implements ni20 {
        public final b920 a(androidx.media3.common.a aVar) {
            String str = aVar.n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new n53();
                    case "application/x-icy":
                        return new wrv();
                    case "application/id3":
                        return new zrv(null);
                    case "application/x-emsg":
                        return new h0q();
                    case "application/x-scte35":
                        return new dlk0();
                }
            }
            throw new IllegalArgumentException(go9.b("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(androidx.media3.common.a aVar) {
            String str = aVar.n;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
