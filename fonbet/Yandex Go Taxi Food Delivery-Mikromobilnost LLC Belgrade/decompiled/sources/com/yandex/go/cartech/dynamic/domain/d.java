package com.yandex.go.cartech.dynamic.domain;

import defpackage.evu0;
import defpackage.ffx;
import defpackage.kj;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.tankerapp.go.sdk.auth.CartechAccount;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.n;
import ru.yandex.taxi.am.o;

/* loaded from: classes12.dex */
public final class d {
    public final ru.yandex.taxi.am.g a;
    public final ru.yandex.taxi.am.token.a b;
    public final f0 c;
    public final m d;
    public final o e;
    public final n0 f = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public d(ru.yandex.taxi.am.g gVar, ru.yandex.taxi.am.token.a aVar, f0 f0Var, m mVar, o oVar) {
        this.a = gVar;
        this.b = aVar;
        this.c = f0Var;
        this.d = mVar;
        this.e = oVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r9 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(long j, String str, ContinuationImpl continuationImpl) {
        TankerAuthAdapterImpl$getAuthorizedUrl$1 tankerAuthAdapterImpl$getAuthorizedUrl$1;
        int i;
        if (continuationImpl instanceof TankerAuthAdapterImpl$getAuthorizedUrl$1) {
            tankerAuthAdapterImpl$getAuthorizedUrl$1 = (TankerAuthAdapterImpl$getAuthorizedUrl$1) continuationImpl;
            int i2 = tankerAuthAdapterImpl$getAuthorizedUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerAuthAdapterImpl$getAuthorizedUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tankerAuthAdapterImpl$getAuthorizedUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerAuthAdapterImpl$getAuthorizedUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = this.e;
                    tankerAuthAdapterImpl$getAuthorizedUrl$1.L$0 = null;
                    tankerAuthAdapterImpl$getAuthorizedUrl$1.L$1 = null;
                    tankerAuthAdapterImpl$getAuthorizedUrl$1.L$2 = null;
                    tankerAuthAdapterImpl$getAuthorizedUrl$1.J$0 = j;
                    tankerAuthAdapterImpl$getAuthorizedUrl$1.label = 1;
                    obj = n.a(oVar, str, tankerAuthAdapterImpl$getAuthorizedUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Serializable failure = (String) obj;
                return failure instanceof Result.Failure ? null : failure;
            }
        }
        tankerAuthAdapterImpl$getAuthorizedUrl$1 = new TankerAuthAdapterImpl$getAuthorizedUrl$1(this, continuationImpl);
        Object obj2 = tankerAuthAdapterImpl$getAuthorizedUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerAuthAdapterImpl$getAuthorizedUrl$1.label;
        if (i != 0) {
        }
        Serializable failure2 = (String) obj2;
        return failure2 instanceof Result.Failure ? null : failure2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0057, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(long j, ContinuationImpl continuationImpl) {
        TankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1 tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1;
        int i;
        long j2;
        Object d;
        String str;
        String str2;
        long j3;
        kj kjVar;
        CartechAccount cartechAccount;
        if (continuationImpl instanceof TankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1) {
            tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1 = (TankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1) continuationImpl;
            int i2 = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j2 = j;
                    tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.J$0 = j2;
                    tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label = 1;
                    d = this.b.d(false, tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.J$0;
                        String str3 = (String) tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.L$0;
                        kotlin.b.b(obj);
                        str2 = str3;
                        kjVar = (kj) obj;
                        if (kjVar == null) {
                            String str4 = kjVar.e;
                            if (str4 == null) {
                                str4 = "";
                            }
                            if (evu0.J(str4)) {
                                str4 = null;
                            }
                            String concat = str4 != null ? str4.concat(" ") : "";
                            long j4 = kjVar.a;
                            String str5 = kjVar.g;
                            String str6 = kjVar.b;
                            boolean z = kjVar.j;
                            String str7 = kjVar.h;
                            String str8 = kjVar.f;
                            cartechAccount = new CartechAccount(str2, str6, str7, concat.concat(str8 != null ? str8 : ""), j4, str5, z);
                        } else {
                            cartechAccount = null;
                        }
                        if (cartechAccount == null && cartechAccount.getUid() == j3) {
                            return cartechAccount;
                        }
                        return null;
                    }
                    j2 = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.J$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                str = (String) d;
                if (str != null) {
                    tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.L$0 = str;
                    tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.J$0 = j2;
                    tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label = 2;
                    f0 f0Var = this.c;
                    f0Var.getClass();
                    Object a = f0.a(f0Var, tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1);
                    if (a != coroutineSingletons) {
                        str2 = str;
                        j3 = j2;
                        obj = a;
                        kjVar = (kj) obj;
                        if (kjVar == null) {
                        }
                        if (cartechAccount == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1 = new TankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1(this, continuationImpl);
        Object obj2 = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerAuthAdapterImpl$getPassportAccountWithOAuthToken$1.label;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
        str = (String) d;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TankerAuthAdapterImpl$requestToken$1 tankerAuthAdapterImpl$requestToken$1;
        int i;
        Object d;
        if (continuationImpl instanceof TankerAuthAdapterImpl$requestToken$1) {
            tankerAuthAdapterImpl$requestToken$1 = (TankerAuthAdapterImpl$requestToken$1) continuationImpl;
            int i2 = tankerAuthAdapterImpl$requestToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerAuthAdapterImpl$requestToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tankerAuthAdapterImpl$requestToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerAuthAdapterImpl$requestToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tankerAuthAdapterImpl$requestToken$1.L$0 = null;
                    tankerAuthAdapterImpl$requestToken$1.L$1 = null;
                    tankerAuthAdapterImpl$requestToken$1.label = 1;
                    d = this.b.d(false, tankerAuthAdapterImpl$requestToken$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (d instanceof Result.Failure) {
                    return d;
                }
                return null;
            }
        }
        tankerAuthAdapterImpl$requestToken$1 = new TankerAuthAdapterImpl$requestToken$1(this, continuationImpl);
        Object obj2 = tankerAuthAdapterImpl$requestToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerAuthAdapterImpl$requestToken$1.label;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
    }
}
