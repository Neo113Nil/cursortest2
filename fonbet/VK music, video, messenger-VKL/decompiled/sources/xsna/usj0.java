package xsna;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import xsna.sn80;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes8.dex */
public abstract class usj0 extends dqj0<u0n0, y0n0, SubtitleDecoderException> implements o0n0 {
    @Override // xsna.dqj0
    @Nullable
    public final SubtitleDecoderException c(u0n0 u0n0Var, y0n0 y0n0Var, boolean z) {
        u0n0 u0n0Var2 = u0n0Var;
        y0n0 y0n0Var2 = y0n0Var;
        try {
            ByteBuffer byteBuffer = u0n0Var2.e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            a1n0 a1n0Var = ((sn80.a) this).n;
            if (z) {
                a1n0Var.reset();
            }
            y0n0Var2.i(u0n0Var2.g, a1n0Var.c(0, limit, array), u0n0Var2.j);
            y0n0Var2.d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // xsna.o0n0
    public final void setPositionUs(long j) {
    }
}
