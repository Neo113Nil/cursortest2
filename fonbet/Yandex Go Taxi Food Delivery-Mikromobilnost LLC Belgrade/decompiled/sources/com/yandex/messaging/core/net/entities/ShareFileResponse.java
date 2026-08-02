package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ShareFileResponse;", "", "fileIds", "", "", "<init>", "([Ljava/lang/String;)V", "getFileIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShareFileResponse {
    private final String[] fileIds;

    public ShareFileResponse(@Json(name = "file_ids") String[] strArr) {
        this.fileIds = strArr;
    }

    public final String[] getFileIds() {
        return this.fileIds;
    }
}
