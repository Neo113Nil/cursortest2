package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.a1;
import defpackage.jl40;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q extends com.yandex.passport.common.mvi.g {
    public final i1 c;
    public final Uid d;

    public q(i1 i1Var, Uid uid) {
        this.c = i1Var;
        this.d = uid;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        b0 b0Var = (b0) obj;
        boolean l = jl40.l(b0Var, x.a);
        b bVar = b.a;
        if (l) {
            a(new s(bVar));
        } else {
            boolean z = b0Var instanceof y;
            i1 i1Var = this.c;
            if (z) {
                com.yandex.passport.sloth.i0 i0Var = ((y) b0Var).a;
                boolean l2 = jl40.l(i0Var, com.yandex.passport.sloth.x.a);
                Uid uid = this.d;
                if (l2) {
                    a(new s(new a(uid)));
                } else if (i0Var instanceof com.yandex.passport.sloth.c0) {
                    a(new s(new e(uid)));
                } else if (i0Var instanceof com.yandex.passport.sloth.a0) {
                    Throwable th = ((com.yandex.passport.sloth.a0) i0Var).a;
                    if (com.yandex.passport.internal.ui.sloth.e.j(th)) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Internet connection is lost in Sloth.", 8);
                        }
                    } else {
                        a(new s(new d(th)));
                    }
                } else {
                    i1Var.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.AUTH_SDK);
                }
            } else if (b0Var instanceof z) {
                int i = p.a[((z) b0Var).a.ordinal()];
                if (i == 1 || i == 2) {
                    a(new s(bVar));
                } else if (i != 3) {
                    w511.b();
                    return null;
                }
            } else {
                if (!(b0Var instanceof a0)) {
                    w511.b();
                    return null;
                }
                a1 a1Var = ((a0) b0Var).a;
                if (jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    a(new s(bVar));
                } else if (a1Var instanceof com.yandex.passport.sloth.c) {
                    com.yandex.passport.sloth.c cVar2 = (com.yandex.passport.sloth.c) a1Var;
                    a(new s(new f(cVar2.a, cVar2.b, cVar2.c)));
                } else if (a1Var instanceof com.yandex.passport.sloth.b) {
                    a(new r(new Exception("Failed to process current auth.")));
                } else if (a1Var instanceof com.yandex.passport.sloth.m) {
                    com.yandex.passport.api.exception.b bVar2 = PassportHostProcessedException.Companion;
                    List list = ((com.yandex.passport.sloth.m) a1Var).a;
                    bVar2.getClass();
                    a(new s(new d(com.yandex.passport.api.exception.b.a(list))));
                } else {
                    i1Var.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.AUTH_SDK);
                }
            }
        }
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new r(th));
    }
}
