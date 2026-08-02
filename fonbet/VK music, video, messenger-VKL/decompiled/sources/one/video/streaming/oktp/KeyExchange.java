package one.video.streaming.oktp;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes8.dex */
public interface KeyExchange {
    byte[] getPublicKey();

    byte[] getRemotePublicKey();

    byte[] getSecretKey();

    void setRemoteKey(byte[] bArr);
}
