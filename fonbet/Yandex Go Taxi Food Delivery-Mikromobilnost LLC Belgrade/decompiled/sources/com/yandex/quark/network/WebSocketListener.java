package com.yandex.quark.network;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/yandex/quark/network/WebSocketListener;", "", "Lzy11;", "onConnectionOpened", "()V", "onConnectionClosed", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "onConnectionStateChanged", "(Ljava/lang/String;)V", Constants.KEY_MESSAGE, "onTextMessageReceived", "", Constants.KEY_DATA, "onByteMessageReceived", "([B)V", "onPongMessageReceived", "error", "onFailure", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebSocketListener {
    void onByteMessageReceived(byte[] data);

    void onConnectionClosed();

    void onConnectionOpened();

    void onConnectionStateChanged(String description);

    void onFailure(String error);

    void onPongMessageReceived();

    void onTextMessageReceived(String message);
}
