package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: SubtitleDecoderFactory.java */
/* loaded from: classes12.dex */
public interface p0n0 {
    public static final a a = new a();

    /* compiled from: SubtitleDecoderFactory.java */
    public class a implements p0n0 {
        public final anl b = new anl();

        @Override // xsna.p0n0
        public final boolean a(androidx.media3.common.a aVar) {
            String str = aVar.n;
            return this.b.a(aVar) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }

        @Override // xsna.p0n0
        public final o0n0 b(androidx.media3.common.a aVar) {
            String str = aVar.n;
            int i = aVar.K;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new tla(str, i);
                    case "application/cea-708":
                        return new vla(i, aVar.q);
                }
            }
            anl anlVar = this.b;
            if (!anlVar.a(aVar)) {
                throw new IllegalArgumentException(go9.b("Attempted to create decoder for unsupported MIME type: ", str));
            }
            a1n0 c = anlVar.c(aVar);
            c.getClass().getSimpleName().concat("Decoder");
            return new jul(c);
        }
    }

    boolean a(androidx.media3.common.a aVar);

    o0n0 b(androidx.media3.common.a aVar);
}
