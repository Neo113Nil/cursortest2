package com.yandex.messaging;

import com.yandex.messaging.files.ImageFileInfo;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import java.io.IOException;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&¢\u0006\u0002\u0010\u000eR\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/CreateChannelRequest;", "Lcom/yandex/messaging/ChatRequest;", "requestId", "", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatar", "Lcom/yandex/messaging/files/ImageFileInfo;", "channelPublicity", "", "getChannelPublicity", "()Z", "members", "", "()[Ljava/lang/String;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CreateChannelRequest extends ChatRequest {
    ImageFileInfo avatar();

    String description();

    boolean getChannelPublicity();

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ int handle(n8b n8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ Object handle(k8b k8bVar);

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ void handle(m8b m8bVar) throws IOException;

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ boolean handle(l8b l8bVar);

    String[] members();

    String name();

    String requestId();

    @Override // com.yandex.messaging.ChatRequest
    /* synthetic */ String uniqueRequestId();
}
