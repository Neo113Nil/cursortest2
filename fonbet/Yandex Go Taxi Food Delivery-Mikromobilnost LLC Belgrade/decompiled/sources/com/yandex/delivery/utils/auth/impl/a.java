package com.yandex.delivery.utils.auth.impl;

import defpackage.bvf0;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.ij3;
import defpackage.ijz;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.lj21;
import defpackage.lse;
import defpackage.ni3;
import defpackage.nwh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.wk3;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.n;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class a {
    public final h3y a;
    public final ijz b;
    public final h3y c;
    public pzt0 d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final ike f;
    public final r0 g;
    public final gci0 h;

    public a(st2 st2Var, h3y h3yVar, ijz ijzVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = ijzVar;
        this.c = h3yVar2;
        this.f = bvf0.a(st2Var.c.plus(jl40.a()).plus(new ij3(lse.a, 0)));
        r0 c = bvf0.c(wk3.a);
        this.g = c;
        this.h = e.d(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        AuthManagerImpl$getCredentials$1 authManagerImpl$getCredentials$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof AuthManagerImpl$getCredentials$1) {
            authManagerImpl$getCredentials$1 = (AuthManagerImpl$getCredentials$1) continuationImpl;
            int i2 = authManagerImpl$getCredentials$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authManagerImpl$getCredentials$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authManagerImpl$getCredentials$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authManagerImpl$getCredentials$1.label;
                String str2 = null;
                if (i != 0) {
                    b.b(obj);
                    ijz ijzVar = aVar.b;
                    if (ijzVar != null) {
                        authManagerImpl$getCredentials$1.L$0 = str;
                        authManagerImpl$getCredentials$1.label = 1;
                        obj = ((h) ((nwh) ijzVar.a.j.get()).d).Hg();
                    } else {
                        com.yandex.delivery.utils.auth.impl.user.a aVar2 = (com.yandex.delivery.utils.auth.impl.user.a) aVar.c.get();
                        authManagerImpl$getCredentials$1.L$0 = str;
                        authManagerImpl$getCredentials$1.label = 2;
                        obj = aVar2.a(str, authManagerImpl$getCredentials$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    str = (String) authManagerImpl$getCredentials$1.L$0;
                    b.b(obj);
                    str2 = (String) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) authManagerImpl$getCredentials$1.L$0;
                    b.b(obj);
                    lj21 lj21Var = (lj21) obj;
                    if (lj21Var != null) {
                        str2 = lj21Var.a();
                    }
                }
                return new ni3(str, str2);
            }
        }
        authManagerImpl$getCredentials$1 = new AuthManagerImpl$getCredentials$1(aVar, continuationImpl);
        Object obj3 = authManagerImpl$getCredentials$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authManagerImpl$getCredentials$1.label;
        String str22 = null;
        if (i != 0) {
        }
        return new ni3(str, str22);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AuthManagerImpl$getAuthStateSync$1 authManagerImpl$getAuthStateSync$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof AuthManagerImpl$getAuthStateSync$1) {
                authManagerImpl$getAuthStateSync$1 = (AuthManagerImpl$getAuthStateSync$1) continuationImpl;
                int i2 = authManagerImpl$getAuthStateSync$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    authManagerImpl$getAuthStateSync$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = authManagerImpl$getAuthStateSync$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = authManagerImpl$getAuthStateSync$1.label;
                    if (i != 0) {
                        b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.e;
                        authManagerImpl$getAuthStateSync$1.L$0 = aVar;
                        authManagerImpl$getAuthStateSync$1.I$0 = 0;
                        authManagerImpl$getAuthStateSync$1.label = 1;
                        if (aVar.a(authManagerImpl$getAuthStateSync$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) authManagerImpl$getAuthStateSync$1.L$0;
                        b.b(obj);
                    }
                    return this.g.getValue();
                }
            }
            return this.g.getValue();
        } finally {
            g050Var.d(null);
        }
        authManagerImpl$getAuthStateSync$1 = new AuthManagerImpl$getAuthStateSync$1(this, continuationImpl);
        Object obj2 = authManagerImpl$getAuthStateSync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authManagerImpl$getAuthStateSync$1.label;
        if (i != 0) {
        }
    }

    public final void c(n nVar) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = e.H(this.f, new jqr(e.t(nVar), new AuthManagerImpl$init$1(this, null), 3));
    }
}
