package com.yandex.messaging.domain.folders;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.entities.ChatId;
import defpackage.j4t;
import defpackage.k020;
import defpackage.kse;
import defpackage.p8b;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class i extends vds0 {
    public final com.yandex.messaging.domain.chat.g b;
    public final j4t c;
    public final k020 d;

    public i(com.yandex.messaging.domain.chat.g gVar, j4t j4tVar, k020 k020Var, kse kseVar) {
        super(kseVar.e);
        this.b = gVar;
        this.c = j4tVar;
        this.d = k020Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        String str = (String) obj;
        ExistingChatRequest a = p8b.a(ChatId.Companion.a(str).a);
        return kotlinx.coroutines.flow.e.X(this.b.a(a), new GetFolderChatDisplayDataUseCase$run$1(str, this, a, null));
    }
}
