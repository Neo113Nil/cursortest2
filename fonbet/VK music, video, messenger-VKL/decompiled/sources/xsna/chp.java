package xsna;

import androidx.media3.decoder.DecoderInputBuffer;

/* compiled from: EmptySampleStream.java */
/* loaded from: classes12.dex */
public final class chp implements m0h0 {
    @Override // xsna.m0h0
    public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.b = 4;
        return -4;
    }

    @Override // xsna.m0h0
    public final boolean isReady() {
        return true;
    }

    @Override // xsna.m0h0
    public final int skipData(long j) {
        return 0;
    }

    @Override // xsna.m0h0
    public final void maybeThrowError() {
    }
}
