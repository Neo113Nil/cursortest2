package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public final class i3b {
    public final long a;
    public final ServerMessageRef b;

    public i3b(long j, long j2, String str) {
        this.a = j;
        ChatId.ThreadId threadId = new ChatId.ThreadId(str);
        threadId.c();
        this.b = new ServerMessageRef(threadId.c().a, j2);
    }
}
