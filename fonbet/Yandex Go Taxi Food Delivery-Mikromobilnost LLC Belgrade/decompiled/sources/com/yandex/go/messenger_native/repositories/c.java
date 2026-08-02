package com.yandex.go.messenger_native.repositories;

import android.content.Context;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.profile.d;
import com.yandex.messaging.sync.CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1;
import defpackage.jb7;
import defpackage.kse;
import defpackage.p8b;
import defpackage.z8g;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes15.dex */
public final class c {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final n a(String str) {
        ExistingChatRequest a = p8b.a(str);
        jb7 jb7Var = new jb7(this.a);
        ((z8g) jb7Var.k()).a().c("tech_chat_unread_count", "chat", a.uniqueRequestId());
        z8g z8gVar = (z8g) jb7Var.k();
        d dVar = (d) z8gVar.S.get();
        return new n(new b(e.F(e.X(dVar.b(), new CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1(a, null)), ((kse) z8gVar.f.get()).b)), new MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2(2, null));
    }
}
