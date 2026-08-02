package com.yandex.images;

import defpackage.ljt0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/images/SourcePolicy;", "", "", "index", CA20Status.STATUS_USER_I, "Companion", "ljt0", "SKIP_DISK_CACHE", "OFFLINE", "SKIP_CACHE", "images_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum SourcePolicy {
    SKIP_DISK_CACHE(1),
    OFFLINE(2),
    SKIP_CACHE(4);

    public static final ljt0 Companion = new ljt0();
    public final int index;

    SourcePolicy(int i) {
        this.index = i;
    }
}
