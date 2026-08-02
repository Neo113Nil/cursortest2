package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.chat.attachments.YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1;
import defpackage.ak51;
import defpackage.ek51;
import defpackage.ike;
import defpackage.jqr;
import defpackage.jwf;
import defpackage.p8b;
import defpackage.pw91;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes15.dex */
public final class i0 implements ak51 {
    public final tse a;
    public final com.yandex.messaging.chat.attachments.d b;
    public final com.yandex.messaging.ui.yadisk.a c;
    public ek51 w;
    public ExistingChatRequest x;

    public i0(jwf jwfVar, ike ikeVar) {
        this.a = ikeVar;
        this.b = (com.yandex.messaging.chat.attachments.d) jwfVar.A;
        this.c = (com.yandex.messaging.ui.yadisk.a) jwfVar.B;
    }

    @Override // defpackage.ak51
    public final void cleanup() {
        this.w = null;
        this.x = null;
        com.yandex.messaging.ui.yadisk.a aVar = this.c;
        aVar.q.dismiss();
        aVar.e = null;
        kotlinx.coroutines.a.g(aVar.s.a, null);
    }

    @Override // defpackage.ak51
    public final void j(String str, String str2) {
        ExistingChatRequest a = p8b.a(str);
        this.x = a;
        com.yandex.messaging.chat.attachments.d dVar = this.b;
        dVar.getClass();
        tje.e();
        kotlinx.coroutines.flow.e.H(this.a, new jqr(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(((com.yandex.messaging.internal.authorized.chat.b) dVar.a.get()).b(a), new YaDiskSpaceErrorInteractor$getErrorFlow$$inlined$flatMapLatest$1(str2, null))), dVar.c.e), new YaDiskErrorHelper$Default$bind$1(this, null), 3));
    }

    @Override // defpackage.ak51
    public final void p(pw91 pw91Var) {
        ek51 ek51Var;
        ExistingChatRequest existingChatRequest = this.x;
        if (existingChatRequest == null || (ek51Var = this.w) == null) {
            return;
        }
        this.c.c(existingChatRequest, ek51Var, pw91Var);
    }
}
