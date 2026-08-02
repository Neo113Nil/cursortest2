package com.yandex.passport.internal.startup;

import android.content.Context;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.network.u;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.report.od;
import defpackage.xwv;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/startup/HostProcessInitializer;", "Lxwv;", "Lzy11;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HostProcessInitializer implements xwv {
    @Override // defpackage.xwv
    public final Object create(Context context) {
        Object failure;
        c cVar = c.a;
        Context applicationContext = context.getApplicationContext();
        synchronized (cVar) {
            if (c.b) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "already initialized", 8);
                }
            } else {
                try {
                    if (p.a == null) {
                        p.a = p.a();
                    }
                    b.a.b(new f(applicationContext, new u(applicationContext.getContentResolver(), com.yandex.passport.internal.util.p.l(applicationContext.getPackageName())), od.b(applicationContext)));
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "HostProcessInitializer initialized in host process", 8);
                    }
                    c.b = true;
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "HostProcessInitializer init failed " + a, 8);
                    }
                }
            }
        }
        return zy11.a;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return EmptyList.a;
    }
}
