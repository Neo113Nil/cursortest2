package com.yandex.delivery.utils.auth.impl.user;

import defpackage.bpc;
import defpackage.bvf0;
import defpackage.dpc;
import defpackage.fo2;
import defpackage.fpc;
import defpackage.lj21;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.wp21;
import defpackage.x2u0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class a {
    public final x2u0 a;
    public final b b;
    public final wp21 c;

    public a(x2u0 x2u0Var, b bVar, wp21 wp21Var) {
        this.a = x2u0Var;
        this.b = bVar;
        this.c = wp21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        UserDataSource$fetchUserData$1 userDataSource$fetchUserData$1;
        int i;
        if (continuationImpl instanceof UserDataSource$fetchUserData$1) {
            userDataSource$fetchUserData$1 = (UserDataSource$fetchUserData$1) continuationImpl;
            int i2 = userDataSource$fetchUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userDataSource$fetchUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userDataSource$fetchUserData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userDataSource$fetchUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userDataSource$fetchUserData$1.L$0 = null;
                    userDataSource$fetchUserData$1.label = 1;
                    obj = d(str, userDataSource$fetchUserData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (lj21) obj;
                    }
                    kotlin.b.b(obj);
                }
                userDataSource$fetchUserData$1.L$0 = null;
                userDataSource$fetchUserData$1.L$1 = null;
                userDataSource$fetchUserData$1.label = 2;
                obj = b((fpc) obj, userDataSource$fetchUserData$1);
            }
        }
        userDataSource$fetchUserData$1 = new UserDataSource$fetchUserData$1(this, continuationImpl);
        Object obj3 = userDataSource$fetchUserData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userDataSource$fetchUserData$1.label;
        if (i != 0) {
        }
        userDataSource$fetchUserData$1.L$0 = null;
        userDataSource$fetchUserData$1.L$1 = null;
        userDataSource$fetchUserData$1.label = 2;
        obj3 = b((fpc) obj3, userDataSource$fetchUserData$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fpc fpcVar, ContinuationImpl continuationImpl) {
        UserDataSource$handleRequestUserDataResult$1 userDataSource$handleRequestUserDataResult$1;
        int i;
        if (continuationImpl instanceof UserDataSource$handleRequestUserDataResult$1) {
            userDataSource$handleRequestUserDataResult$1 = (UserDataSource$handleRequestUserDataResult$1) continuationImpl;
            int i2 = userDataSource$handleRequestUserDataResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userDataSource$handleRequestUserDataResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userDataSource$handleRequestUserDataResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userDataSource$handleRequestUserDataResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(fpcVar instanceof dpc)) {
                        if (fpcVar instanceof bpc) {
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    userDataSource$handleRequestUserDataResult$1.L$0 = null;
                    userDataSource$handleRequestUserDataResult$1.label = 1;
                    obj = c((dpc) fpcVar, userDataSource$handleRequestUserDataResult$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (lj21) obj;
            }
        }
        userDataSource$handleRequestUserDataResult$1 = new UserDataSource$handleRequestUserDataResult$1(this, continuationImpl);
        Object obj3 = userDataSource$handleRequestUserDataResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userDataSource$handleRequestUserDataResult$1.label;
        if (i != 0) {
        }
        return (lj21) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(dpc dpcVar, ContinuationImpl continuationImpl) {
        UserDataSource$handleRequestUserDataSuccess$1 userDataSource$handleRequestUserDataSuccess$1;
        int i;
        if (continuationImpl instanceof UserDataSource$handleRequestUserDataSuccess$1) {
            userDataSource$handleRequestUserDataSuccess$1 = (UserDataSource$handleRequestUserDataSuccess$1) continuationImpl;
            int i2 = userDataSource$handleRequestUserDataSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userDataSource$handleRequestUserDataSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userDataSource$handleRequestUserDataSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userDataSource$handleRequestUserDataSuccess$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lj21 lj21Var = (lj21) userDataSource$handleRequestUserDataSuccess$1.L$1;
                    kotlin.b.b(obj);
                    return lj21Var;
                }
                kotlin.b.b(obj);
                fo2 fo2Var = dpcVar.b;
                String str = fo2Var != null ? fo2Var.b : null;
                String phone = ((StartupResponse) dpcVar.a).getPhone();
                lj21 lj21Var2 = new lj21(str, phone);
                userDataSource$handleRequestUserDataSuccess$1.L$0 = null;
                userDataSource$handleRequestUserDataSuccess$1.L$1 = lj21Var2;
                userDataSource$handleRequestUserDataSuccess$1.label = 1;
                if (str != null) {
                    tje.N(bvf0.a(userDataSource$handleRequestUserDataSuccess$1.get_context()), null, null, new UserDataSource$saveUserData$2$1(this, str, null), 3);
                }
                if (phone != null) {
                    this.c.a = phone;
                }
                return zy11.a == coroutineSingletons ? coroutineSingletons : lj21Var2;
            }
        }
        userDataSource$handleRequestUserDataSuccess$1 = new UserDataSource$handleRequestUserDataSuccess$1(this, continuationImpl);
        Object obj2 = userDataSource$handleRequestUserDataSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userDataSource$handleRequestUserDataSuccess$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        UserDataSource$requestUserData$1 userDataSource$requestUserData$1;
        int i;
        String str2;
        x2u0 x2u0Var;
        if (continuationImpl instanceof UserDataSource$requestUserData$1) {
            userDataSource$requestUserData$1 = (UserDataSource$requestUserData$1) continuationImpl;
            int i2 = userDataSource$requestUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userDataSource$requestUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userDataSource$requestUserData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userDataSource$requestUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String concat = "Bearer ".concat(str);
                    userDataSource$requestUserData$1.L$0 = null;
                    x2u0 x2u0Var2 = this.a;
                    userDataSource$requestUserData$1.L$1 = x2u0Var2;
                    userDataSource$requestUserData$1.L$2 = concat;
                    userDataSource$requestUserData$1.label = 1;
                    Object a = this.b.a(userDataSource$requestUserData$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        str2 = concat;
                        x2u0Var = x2u0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return (fpc) obj;
                }
                str2 = (String) userDataSource$requestUserData$1.L$2;
                x2u0Var = (x2u0) userDataSource$requestUserData$1.L$1;
                kotlin.b.b(obj);
                userDataSource$requestUserData$1.L$0 = null;
                userDataSource$requestUserData$1.L$1 = null;
                userDataSource$requestUserData$1.L$2 = null;
                userDataSource$requestUserData$1.label = 2;
                x2u0Var.getClass();
                obj = x2u0Var.a(new StartupRequestInteractor$request$2(x2u0Var, str2, (String) obj, null), userDataSource$requestUserData$1);
            }
        }
        userDataSource$requestUserData$1 = new UserDataSource$requestUserData$1(this, continuationImpl);
        Object obj2 = userDataSource$requestUserData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userDataSource$requestUserData$1.label;
        if (i != 0) {
        }
        userDataSource$requestUserData$1.L$0 = null;
        userDataSource$requestUserData$1.L$1 = null;
        userDataSource$requestUserData$1.L$2 = null;
        userDataSource$requestUserData$1.label = 2;
        x2u0Var.getClass();
        obj2 = x2u0Var.a(new StartupRequestInteractor$request$2(x2u0Var, str2, (String) obj2, null), userDataSource$requestUserData$1);
    }
}
