package androidx.media3.exoplayer.drm;

import java.io.IOException;

/* loaded from: classes10.dex */
public class DrmSession$DrmSessionException extends IOException {
    public final int errorCode;

    public DrmSession$DrmSessionException(int i, Throwable th) {
        super(th);
        this.errorCode = i;
    }
}
