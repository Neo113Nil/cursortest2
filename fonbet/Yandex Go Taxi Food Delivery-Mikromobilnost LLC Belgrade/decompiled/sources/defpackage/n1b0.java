package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public final class n1b0 {
    public final long a;
    public final long b;
    public final ChatId.ThreadId c;
    public final String d;

    public n1b0(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        ChatId.ThreadId threadId = new ChatId.ThreadId(str);
        this.c = threadId;
        this.d = threadId.c().a;
        new ServerMessageRef(threadId.c().a, j2);
    }
}
