package com.yandex.messaging.data;

import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.kse;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public final class a {
    public final kse a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public a(kse kseVar) {
        this.a = kseVar;
    }

    public final kotlinx.coroutines.flow.b a(MessageRef messageRef) {
        return kotlinx.coroutines.flow.e.g(new PendingStarsStorage$getPendingStarFlow$1(this, messageRef, null));
    }
}
