package com.yandex.passport.internal.ui.bouncer.model.middleware;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/yandex/passport/internal/ui/bouncer/model/middleware/GetClientTokenActor$ExecuteBouncerActionException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "bouncerAction", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "a", "()Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class GetClientTokenActor$ExecuteBouncerActionException extends Exception {
    private final com.yandex.passport.internal.ui.bouncer.model.n0 bouncerAction;

    public GetClientTokenActor$ExecuteBouncerActionException(com.yandex.passport.internal.ui.bouncer.model.j0 j0Var) {
        this.bouncerAction = j0Var;
    }

    /* renamed from: a, reason: from getter */
    public final com.yandex.passport.internal.ui.bouncer.model.n0 getBouncerAction() {
        return this.bouncerAction;
    }
}
