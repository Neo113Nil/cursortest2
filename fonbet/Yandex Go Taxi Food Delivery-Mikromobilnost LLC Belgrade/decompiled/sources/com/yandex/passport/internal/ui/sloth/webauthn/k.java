package com.yandex.passport.internal.ui.sloth.webauthn;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.bd;
import com.yandex.passport.internal.report.cd;
import com.yandex.passport.internal.report.dd;
import com.yandex.passport.internal.report.ed;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.sloth.a0;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.c0;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.i0;
import com.yandex.passport.sloth.j0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class k extends com.yandex.passport.common.mvi.g {
    public final RegisterWebAuthNProperties c;
    public final com.yandex.passport.internal.core.accounts.d d;
    public final j1 e;

    public k(RegisterWebAuthNProperties registerWebAuthNProperties, com.yandex.passport.internal.core.accounts.d dVar, j1 j1Var) {
        this.c = registerWebAuthNProperties;
        this.d = dVar;
        this.e = j1Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        if (((i) obj) == null) {
            w511.b();
            return null;
        }
        Uid uid = this.c.getUid();
        j1 j1Var = this.e;
        j1Var.getClass();
        j1Var.f(dd.w, new jd(Long.valueOf(uid.getValue())));
        Object m = m((ContinuationImpl) continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        v vVar = (v) obj;
        boolean z = vVar instanceof s;
        zy11 zy11Var = zy11.a;
        if (z) {
            i0 i0Var = ((s) vVar).a;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "New slothExternalRequest " + i0Var, 8);
            }
            if (i0Var instanceof a0) {
                j(((a0) i0Var).a);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            } else if (i0Var instanceof c0) {
                l(401, "invalid_token", null);
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return zy11Var;
        }
        boolean z2 = vVar instanceof t;
        RegisterWebAuthNProperties registerWebAuthNProperties = this.c;
        j1 j1Var = this.e;
        if (z2) {
            int i = j.a[((t) vVar).a.ordinal()];
            if (i == 1 || i == 2) {
                Uid uid = registerWebAuthNProperties.getUid();
                j1Var.getClass();
                j1Var.f(bd.w, new jd(Long.valueOf(uid.getValue())));
                f(q.a);
                return zy11Var;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
        } else {
            if (!(vVar instanceof u)) {
                w511.b();
                return null;
            }
            a1 a1Var = ((u) vVar).a;
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New slothResult: " + a1Var, 8);
            }
            if (jl40.l(a1Var, j0.b)) {
                Uid uid2 = registerWebAuthNProperties.getUid();
                j1Var.getClass();
                j1Var.f(ed.w, new jd(Long.valueOf(uid2.getValue())));
                a(new l(-1, null));
                return zy11Var;
            }
            if (a1Var instanceof com.yandex.passport.sloth.m) {
                Set set = com.yandex.passport.sloth.k.b;
                String a = com.yandex.passport.sloth.j.a(((com.yandex.passport.sloth.m) a1Var).a);
                Intent intent = new Intent();
                intent.putExtra(RegisterWebAuthNActivity.KEY_WEBAUTHN_ERRORS, a);
                l(601, a, intent);
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        if (th instanceof InvalidTokenException) {
            l(401, "invalid_token", null);
        } else if (th instanceof PassportAccountNotFoundException) {
            k();
        } else {
            l(1112, String.valueOf(th.getMessage()), null);
        }
    }

    public final void k() {
        Intent intent = new Intent();
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(this.c.getUid());
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", A);
        intent.putExtras(bundle);
        l(RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND, "account_not_found", intent);
    }

    public final void l(int i, String str, Intent intent) {
        Uid uid = this.c.getUid();
        j1 j1Var = this.e;
        j1Var.getClass();
        j1Var.f(cd.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 26, false));
        a(new l(i, intent));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        RegisterWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1 registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1;
        int i;
        ModernAccount modernAccount;
        if (continuationImpl instanceof RegisterWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1) {
            registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1 = (RegisterWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1) continuationImpl;
            int i2 = registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uid uid = this.c.getUid();
                    registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.L$0 = this;
                    registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.label = 1;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new RegisterWebAuthNStoreFactory$ExecutorImpl$getAccount$2(this, uid, null), registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (k) registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.L$0;
                    kotlin.b.b(obj);
                }
                modernAccount = (ModernAccount) obj;
                zy11 zy11Var = zy11.a;
                if (modernAccount != null) {
                    this.k();
                    return zy11Var;
                }
                RegisterWebAuthNProperties registerWebAuthNProperties = this.c;
                this.a(new m(new SlothParams(new com.yandex.passport.sloth.data.v(modernAccount.getLocationId(), registerWebAuthNProperties.getUid(), com.yandex.passport.internal.properties.u.X(registerWebAuthNProperties.getTheme())), registerWebAuthNProperties.getUid().getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null)));
                return zy11Var;
            }
        }
        registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1 = new RegisterWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1(this, continuationImpl);
        Object obj2 = registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerWebAuthNStoreFactory$ExecutorImpl$startShowSloth$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        zy11 zy11Var2 = zy11.a;
        if (modernAccount != null) {
        }
    }
}
