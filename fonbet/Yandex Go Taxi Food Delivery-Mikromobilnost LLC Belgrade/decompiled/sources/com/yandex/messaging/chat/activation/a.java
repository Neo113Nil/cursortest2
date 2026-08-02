package com.yandex.messaging.chat.activation;

import com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jdb;
import defpackage.k020;
import defpackage.kse;
import defpackage.l020;
import defpackage.l0b;
import defpackage.leb;
import defpackage.o1b0;
import defpackage.tje;

/* loaded from: classes15.dex */
public final class a {
    public final o1b0 a;
    public final k020 b;
    public final kse c;
    public final i3y d;

    public a(o1b0 o1b0Var, k020 k020Var, kse kseVar, h3y h3yVar) {
        this.a = o1b0Var;
        this.b = k020Var;
        this.c = kseVar;
        this.d = kotlin.a.a(new l0b(h3yVar, 0));
    }

    public static final void a(a aVar, boolean z) {
        l020 C = aVar.b.C();
        try {
            long j = aVar.a.a;
            jdb jdbVar = C.B;
            ((Number) androidx.room.util.a.b(jdbVar.c.a, false, true, new leb(z, j))).intValue();
            jdbVar.t.a(j);
            C.s();
            C.close();
        } finally {
        }
    }

    public final Object b(ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1 chatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1) {
        return tje.k0(this.c.e, new ChatActivationProcessor$activateChatIfTransient$2(this, null), chatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1);
    }
}
