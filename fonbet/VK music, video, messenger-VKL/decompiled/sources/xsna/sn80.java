package xsna;

import androidx.media3.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: OneVideoSubtitleDecoderFactory.java */
/* loaded from: classes8.dex */
public final class sn80 implements p0n0 {
    public final tn80 b = new tn80();

    /* compiled from: OneVideoSubtitleDecoderFactory.java */
    public static final class a extends usj0 {
        public final a1n0 n;

        public a(a1n0 a1n0Var) {
            super(new u0n0[2], new y0n0[2]);
            int i = this.g;
            DecoderInputBuffer[] decoderInputBufferArr = this.e;
            fxc0.z(i == decoderInputBufferArr.length);
            for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
                decoderInputBuffer.e(1024);
            }
            this.n = a1n0Var;
        }
    }

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
        tn80 tn80Var = this.b;
        if (!tn80Var.a(aVar)) {
            throw new IllegalArgumentException(go9.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
        a1n0 c = tn80Var.c(aVar);
        c.getClass().getSimpleName().concat("Decoder");
        return new a(c);
    }
}
