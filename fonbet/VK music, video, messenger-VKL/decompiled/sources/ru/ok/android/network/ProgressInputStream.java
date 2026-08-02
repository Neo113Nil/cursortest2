package ru.ok.android.network;

import com.unity3d.services.UnityAdsConstants;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public class ProgressInputStream extends FilterInputStream {
    private final float contentLength;
    private final Listener listener;
    private int readCount;

    public interface Listener {
        void onProgress(float f);
    }

    public ProgressInputStream(InputStream inputStream, int i, Listener listener) {
        super(inputStream);
        this.contentLength = i;
        this.listener = listener;
    }

    private void notifyListener() {
        float f = this.contentLength;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int i = this.readCount;
        if (i > f) {
            this.listener.onProgress(1.0f);
        } else {
            this.listener.onProgress(i / f);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read == -1) {
            this.listener.onProgress(1.0f);
            return read;
        }
        this.readCount += read;
        notifyListener();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read == -1) {
            this.listener.onProgress(1.0f);
            return read;
        }
        this.readCount++;
        notifyListener();
        return read;
    }
}
