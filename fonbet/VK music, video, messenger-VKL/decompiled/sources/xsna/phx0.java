package xsna;

import okio.ByteString;

/* compiled from: WebSocket.kt */
/* loaded from: classes8.dex */
public interface phx0 {
    void cancel();

    boolean close(int i, String str);

    boolean f(ByteString byteString);

    okhttp3.p request();

    boolean send(String str);
}
