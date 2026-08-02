package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;

/* compiled from: Decoder.java */
/* loaded from: classes12.dex */
public interface a8l<I, O, E extends DecoderException> {
    void a(long j);

    void b(u0n0 u0n0Var) throws DecoderException;

    @Nullable
    I dequeueInputBuffer() throws DecoderException;

    @Nullable
    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    void release();
}
