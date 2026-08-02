package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.g2;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class e1 implements w0 {
    public static final String[] x = {"ru.yandex.mail", "ru.yandex.disk", "yandex.auto"};
    public final Context a;
    public final com.yandex.passport.internal.analytics.c0 b;
    public final com.yandex.passport.internal.core.accounts.z c;
    public final com.yandex.passport.internal.core.accounts.n w;

    public e1(Context context, com.yandex.passport.internal.analytics.c0 c0Var, com.yandex.passport.internal.core.accounts.z zVar, com.yandex.passport.internal.core.accounts.n nVar) {
        this.a = context;
        this.b = c0Var;
        this.c = zVar;
        this.w = nVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object g = com.yandex.passport.common.util.a.g(new RemoveAccountPerformer$performMethod$1((g2) x2Var, this, null));
        Throwable a = Result.a(g);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccountUseCase executing failed: " + a.getMessage(), 8);
            }
        }
        return g;
    }
}
