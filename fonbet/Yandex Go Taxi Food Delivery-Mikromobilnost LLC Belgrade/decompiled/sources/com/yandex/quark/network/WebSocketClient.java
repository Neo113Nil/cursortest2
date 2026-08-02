package com.yandex.quark.network;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/quark/network/WebSocketClient;", "", "", "url", "", "headers", "Lcom/yandex/quark/network/WebSocketListener;", "listener", "Lzy11;", OpenList.STR_OPEN, "(Ljava/lang/String;Ljava/util/Map;Lcom/yandex/quark/network/WebSocketListener;)V", "close", "()V", "", Constants.KEY_DATA, "sendData", "([B)V", "text", "sendText", "(Ljava/lang/String;)V", "", "getSocketFd", "()I", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebSocketClient {
    void close();

    int getSocketFd();

    void open(String url, Map<String, String> headers, WebSocketListener listener);

    void sendData(byte[] data);

    void sendText(String text);
}
