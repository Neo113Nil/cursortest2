package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class v0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.core.tokens.a c;
    public final com.yandex.passport.internal.account.b d;
    public final com.yandex.passport.internal.analytics.c0 e;
    public final m f;
    public final com.yandex.passport.internal.core.accounts.t g;
    public final com.yandex.passport.internal.flags.j h;
    public final com.yandex.passport.internal.push.i0 i;
    public final com.yandex.passport.internal.push.k0 j;

    public v0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.tokens.a aVar2, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.analytics.c0 c0Var, m mVar, com.yandex.passport.internal.core.accounts.t tVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.push.i0 i0Var, com.yandex.passport.internal.push.k0 k0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
        this.c = aVar2;
        this.d = bVar;
        this.e = c0Var;
        this.f = mVar;
        this.g = tVar;
        this.h = jVar;
        this.i = i0Var;
        this.j = k0Var;
    }

    public final void c(ModernAccount modernAccount) {
        Uid uid = modernAccount.getUid();
        this.c.a(modernAccount);
        this.i.a(uid, false);
        this.j.b(uid);
        this.d.a(uid);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(6:19|20|(1:22)(1:56)|(9:27|(4:30|(3:32|33|34)(1:36)|35|28)|37|38|(4:41|(3:43|44|45)(1:47)|46|39)|48|(1:50)|51|(1:53))|51|(0))|12|13|14))|64|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b2, code lost:
    
        c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        r9 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d4, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        r9 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uid uid, Continuation continuation) {
        LogoutUseCase$run$1 logoutUseCase$run$1;
        int i;
        m mVar;
        ArrayList f;
        if (continuation instanceof LogoutUseCase$run$1) {
            logoutUseCase$run$1 = (LogoutUseCase$run$1) continuation;
            int i2 = logoutUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.b a = this.b.a();
                    ModernAccount e = a.e(uid);
                    Uid masterUid = e != null ? e.getMasterUid() : null;
                    if (masterUid != null && ((Boolean) this.h.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
                        ArrayList c = this.g.c(masterUid, a);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            ModernAccount e2 = a.e(((com.yandex.passport.internal.entities.k) it.next()).d());
                            if (e2 != null) {
                                arrayList.add(e2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            ModernAccount modernAccount = (ModernAccount) it2.next();
                            c(modernAccount);
                            if (jl40.l(modernAccount.getUid(), e.getUid())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            c(e);
                        }
                        mVar = this.f;
                        f = a.f();
                        logoutUseCase$run$1.L$0 = this;
                        logoutUseCase$run$1.label = 1;
                        if (mVar.a(f, logoutUseCase$run$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    mVar = this.f;
                    f = a.f();
                    logoutUseCase$run$1.L$0 = this;
                    logoutUseCase$run$1.label = 1;
                    if (mVar.a(f, logoutUseCase$run$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (v0) logoutUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                this.e.e(null);
                Object obj2 = zy11.a;
                return new Result(obj2);
            }
        }
        logoutUseCase$run$1 = new LogoutUseCase$run$1(this, (ContinuationImpl) continuation);
        Object obj3 = logoutUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutUseCase$run$1.label;
        if (i != 0) {
        }
        this.e.e(null);
        Object obj22 = zy11.a;
        return new Result(obj22);
    }
}
