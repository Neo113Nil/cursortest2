package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* compiled from: DelegatingSubtitleDecoder.java */
/* loaded from: classes12.dex */
public final class jul extends eqj0 implements o0n0 {
    public final a1n0 n;

    public jul(a1n0 a1n0Var) {
        super(new u0n0[2], new y0n0[2]);
        int i = this.g;
        DecoderInputBuffer[] decoderInputBufferArr = this.e;
        fxc0.z(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.e(1024);
        }
        this.n = a1n0Var;
    }

    @Override // xsna.eqj0
    public final DecoderInputBuffer c() {
        return new u0n0();
    }

    @Override // xsna.eqj0
    public final k8l d() {
        return new tsj0(this);
    }

    @Override // xsna.eqj0
    public final DecoderException e(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // xsna.eqj0
    @Nullable
    public final DecoderException f(DecoderInputBuffer decoderInputBuffer, k8l k8lVar, boolean z) {
        u0n0 u0n0Var = (u0n0) decoderInputBuffer;
        y0n0 y0n0Var = (y0n0) k8lVar;
        try {
            ByteBuffer byteBuffer = u0n0Var.e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            a1n0 a1n0Var = this.n;
            if (z) {
                a1n0Var.reset();
            }
            y0n0Var.i(u0n0Var.g, a1n0Var.c(0, limit, array), u0n0Var.j);
            y0n0Var.d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // xsna.o0n0
    public final void setPositionUs(long j) {
    }
}
