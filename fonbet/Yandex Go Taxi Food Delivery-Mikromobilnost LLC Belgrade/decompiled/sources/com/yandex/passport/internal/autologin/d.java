package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.methods.performer.w0;
import com.yandex.passport.internal.methods.r2;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k1;
import com.yandex.passport.internal.report.v1;
import com.yandex.passport.internal.report.yd;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes8.dex */
public final class d implements w0 {
    public final g a;
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.report.reporters.j c;
    public final com.yandex.passport.internal.methods.performer.error.a w;
    public final com.yandex.passport.internal.filter.i x;

    public d(g gVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.report.reporters.j jVar, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.filter.i iVar) {
        this.a = gVar;
        this.b = dVar;
        this.c = jVar;
        this.w = aVar;
        this.x = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.passport.internal.autologin.AutoLoginPerformer$performMethod$1$1] */
    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        final r2 r2Var = (r2) x2Var;
        try {
            return b((AutoLoginProperties) new PropertyReference0Impl(r2Var) { // from class: com.yandex.passport.internal.autologin.AutoLoginPerformer$performMethod$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                public final Object get() {
                    return (AutoLoginProperties) ((r2) this.receiver).b.c;
                }
            }.get());
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public final PassportAccountImpl b(AutoLoginProperties autoLoginProperties) {
        Object h = com.yandex.passport.common.util.a.h(new AutoLoginPerformer$tryAutoLogin$1(this, autoLoginProperties, null));
        boolean z = h instanceof Result.Failure;
        com.yandex.passport.internal.report.reporters.j jVar = this.c;
        if (!z) {
            ModernAccount modernAccount = (ModernAccount) h;
            if (modernAccount == null) {
                PassportAutoLoginImpossibleException passportAutoLoginImpossibleException = new PassportAutoLoginImpossibleException("Failed perform autologin: autologin in founded accounts is disabled or can't get token");
                PassportAutoLoginMode mode = autoLoginProperties.getMode();
                jVar.getClass();
                jVar.f(k1.w, new com.yandex.passport.internal.report.c(mode), new yd(passportAutoLoginImpossibleException));
                throw passportAutoLoginImpossibleException;
            }
            PassportAutoLoginMode mode2 = autoLoginProperties.getMode();
            long value = modernAccount.getUid().getValue();
            jVar.getClass();
            jVar.f(v1.w, new com.yandex.passport.internal.report.c(mode2), new jd(String.valueOf(value), 3));
            h = a0.g0(modernAccount);
        }
        Throwable a = Result.a(h);
        if (a != null) {
            try {
                Throwable a2 = com.yandex.passport.internal.methods.performer.error.a.a(this.w, a, null, null, null, null, null, 62);
                PassportAutoLoginMode mode3 = autoLoginProperties.getMode();
                jVar.getClass();
                jVar.f(k1.w, new com.yandex.passport.internal.report.c(mode3), new yd(a));
                throw a2;
            } catch (Throwable th) {
                h = new Result.Failure(th);
            }
        }
        kotlin.b.b(h);
        return (PassportAccountImpl) h;
    }
}
