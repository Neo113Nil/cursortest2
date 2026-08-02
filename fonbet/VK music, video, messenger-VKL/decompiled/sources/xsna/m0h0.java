package xsna;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;

/* compiled from: SampleStream.java */
/* loaded from: classes12.dex */
public interface m0h0 {
    int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j);
}
