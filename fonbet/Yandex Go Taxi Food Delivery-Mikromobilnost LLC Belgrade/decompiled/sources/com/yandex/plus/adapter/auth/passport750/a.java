package com.yandex.plus.adapter.auth.passport750;

import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.b;
import com.yandex.passport.api.f;
import com.yandex.passport.api.g1;
import com.yandex.passport.api.h1;
import com.yandex.passport.api.i;
import com.yandex.passport.api.i1;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.j1;
import com.yandex.passport.api.k1;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.q;
import com.yandex.passport.api.s;
import com.yandex.passport.api.s1;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.w;
import com.yandex.passport.internal.autologin.ui.h;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.c;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$AuthException;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Theme;
import com.yandex.plus.home.common.utils.d;
import defpackage.a1d0;
import defpackage.b1d0;
import defpackage.bvf0;
import defpackage.c1d0;
import defpackage.d1d0;
import defpackage.f5d0;
import defpackage.ffx;
import defpackage.g5d0;
import defpackage.h5d0;
import defpackage.i5d0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.v0d0;
import defpackage.w0d0;
import defpackage.w511;
import defpackage.ww90;
import defpackage.x0d0;
import defpackage.y0d0;
import defpackage.z0d0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a extends i5d0 {
    public final b a;
    public final r0 b = bvf0.c(null);
    public final n0 c = ffx.c(0, 0, null, 7);
    public final d d = (d) d.a.getValue();

    public a(b bVar) {
        this.a = bVar;
    }

    public static KPassportEnvironment l(PlusAuthAdapter$Environment plusAuthAdapter$Environment) {
        int i = f5d0.a[plusAuthAdapter$Environment.ordinal()];
        if (i == 1) {
            return KPassportEnvironment.TESTING;
        }
        if (i == 2) {
            return KPassportEnvironment.PRODUCTION;
        }
        w511.b();
        return null;
    }

    public static PassportTheme m(PlusAuthAdapter$Theme plusAuthAdapter$Theme) {
        int i = f5d0.b[plusAuthAdapter$Theme.ordinal()];
        if (i == 1) {
            return PassportTheme.LIGHT;
        }
        if (i == 2) {
            return PassportTheme.DARK;
        }
        if (i == 3) {
            return PassportTheme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.e1d0
    public final r0 a() {
        return this.b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(6:11|12|13|14|15|17)(2:20|21))(3:22|23|24))(3:30|31|(2:33|29)(1:34))|25|(1:27)|15|17))|7|(0)(0)|25|(0)|15|17) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        r2 = new kotlin.Result.Failure(r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #1 {all -> 0x004d, blocks: (B:12:0x0042, B:13:0x00df, B:27:0x00bc), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.yandex.passport.api.k2] */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d1d0 d1d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$updateAndInjectAuthCookie$1 plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1;
        int i;
        Object failure;
        d1d0 d1d0Var2;
        PassportUidImpl passportUidImpl;
        int i2;
        int i3;
        Object d;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$updateAndInjectAuthCookie$1) {
                plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1 = (PlusKPassport750AuthAdapter$updateAndInjectAuthCookie$1) continuationImpl;
                int i4 = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label;
                    Object obj3 = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        PassportUidImpl passportUidImpl2 = new PassportUidImpl(PassportEnvironmentImpl.from(l(d1d0Var.b())), j());
                        b bVar = this.a;
                        String a = d1d0Var.a();
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$0 = d1d0Var;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$1 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$2 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$3 = this;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$4 = passportUidImpl2;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$0 = 0;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$1 = 0;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label = 1;
                        Object c = bVar.c(passportUidImpl2, a, plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1);
                        if (c == obj2) {
                            return obj2;
                        }
                        d1d0Var2 = d1d0Var;
                        passportUidImpl = passportUidImpl2;
                        i2 = 0;
                        failure = c;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            d = ((Result) obj).getValue();
                            kotlin.b.b(d);
                            failure = obj3;
                            kotlin.b.b(failure);
                            return obj3;
                        }
                        int i5 = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$1;
                        int i6 = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$0;
                        ?? r2 = (k2) plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$4;
                        a aVar = (a) plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$3;
                        d1d0Var2 = (d1d0) plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$0;
                        kotlin.b.b(obj);
                        i2 = i5;
                        this = aVar;
                        passportUidImpl = r2;
                        failure = ((Result) obj).getValue();
                        i3 = i6;
                    }
                    if (!(failure instanceof Result.Failure)) {
                        b bVar2 = this.a;
                        String a2 = d1d0Var2.a();
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$0 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$1 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$2 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$3 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$4 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.L$5 = null;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$0 = i3;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$1 = i2;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.I$2 = 0;
                        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label = 2;
                        d = bVar2.d(passportUidImpl, a2, plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1);
                    }
                    kotlin.b.b(failure);
                    return obj3;
                }
            }
            if (i != 0) {
            }
            if (!(failure instanceof Result.Failure)) {
            }
            kotlin.b.b(failure);
            return obj3;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1 = new PlusKPassport750AuthAdapter$updateAndInjectAuthCookie$1(this, continuationImpl);
        Object obj4 = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$updateAndInjectAuthCookie$1.label;
        Object obj32 = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a1d0 a1d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$isXTokenValid$1 plusKPassport750AuthAdapter$isXTokenValid$1;
        int i;
        Object u;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$isXTokenValid$1) {
                plusKPassport750AuthAdapter$isXTokenValid$1 = (PlusKPassport750AuthAdapter$isXTokenValid$1) continuationImpl;
                int i2 = plusKPassport750AuthAdapter$isXTokenValid$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$isXTokenValid$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$isXTokenValid$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$isXTokenValid$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        KPassportEnvironment l = l(a1d0Var.a);
                        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(l), j());
                        b bVar = this.a;
                        plusKPassport750AuthAdapter$isXTokenValid$1.L$0 = null;
                        plusKPassport750AuthAdapter$isXTokenValid$1.L$1 = null;
                        plusKPassport750AuthAdapter$isXTokenValid$1.L$2 = null;
                        plusKPassport750AuthAdapter$isXTokenValid$1.L$3 = null;
                        plusKPassport750AuthAdapter$isXTokenValid$1.L$4 = null;
                        plusKPassport750AuthAdapter$isXTokenValid$1.I$0 = 0;
                        plusKPassport750AuthAdapter$isXTokenValid$1.I$1 = 0;
                        plusKPassport750AuthAdapter$isXTokenValid$1.label = 1;
                        u = bVar.u(passportUidImpl, plusKPassport750AuthAdapter$isXTokenValid$1);
                        if (u == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        u = ((Result) obj).getValue();
                    }
                    kotlin.b.b(u);
                    return u;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(u);
            return u;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$isXTokenValid$1 = new PlusKPassport750AuthAdapter$isXTokenValid$1(this, continuationImpl);
        Object obj2 = plusKPassport750AuthAdapter$isXTokenValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$isXTokenValid$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: all -> 0x00b4, CancellationException -> 0x00bb, TimeoutCancellationException -> 0x00bd, TryCatch #2 {TimeoutCancellationException -> 0x00bd, CancellationException -> 0x00bb, all -> 0x00b4, blocks: (B:11:0x0038, B:12:0x007a, B:14:0x007e, B:15:0x0097, B:17:0x009d, B:19:0x00ab, B:20:0x00b0, B:27:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(x0d0 x0d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$getAccountInfo$1 plusKPassport750AuthAdapter$getAccountInfo$1;
        int i;
        Object g;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$getAccountInfo$1) {
                plusKPassport750AuthAdapter$getAccountInfo$1 = (PlusKPassport750AuthAdapter$getAccountInfo$1) continuationImpl;
                int i2 = plusKPassport750AuthAdapter$getAccountInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$getAccountInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$getAccountInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$getAccountInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        KPassportEnvironment l = l(x0d0Var.a());
                        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(l), j());
                        b bVar = this.a;
                        plusKPassport750AuthAdapter$getAccountInfo$1.L$0 = null;
                        plusKPassport750AuthAdapter$getAccountInfo$1.L$1 = null;
                        plusKPassport750AuthAdapter$getAccountInfo$1.L$2 = null;
                        plusKPassport750AuthAdapter$getAccountInfo$1.L$3 = null;
                        plusKPassport750AuthAdapter$getAccountInfo$1.L$4 = null;
                        plusKPassport750AuthAdapter$getAccountInfo$1.I$0 = 0;
                        plusKPassport750AuthAdapter$getAccountInfo$1.I$1 = 0;
                        plusKPassport750AuthAdapter$getAccountInfo$1.label = 1;
                        g = bVar.g(passportUidImpl, plusKPassport750AuthAdapter$getAccountInfo$1);
                        if (g == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                    }
                    if (!(g instanceof Result.Failure)) {
                        i iVar = (i) g;
                        boolean isYandexoid = iVar.isYandexoid();
                        s1 partitions = iVar.getPartitions();
                        ArrayList arrayList = new ArrayList(tcc.n(partitions, 10));
                        Iterator it = partitions.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PassportPartition) it.next()).m240unboximpl());
                        }
                        g = new v0d0(arrayList, isYandexoid);
                    }
                    kotlin.b.b(g);
                    return g;
                }
            }
            if (i != 0) {
            }
            if (!(g instanceof Result.Failure)) {
            }
            kotlin.b.b(g);
            return g;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$getAccountInfo$1 = new PlusKPassport750AuthAdapter$getAccountInfo$1(this, continuationImpl);
        Object obj2 = plusKPassport750AuthAdapter$getAccountInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$getAccountInfo$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:47|48|(2:50|26))|19|(3:21|22|(3:24|(3:27|12|13)|26)(1:28))(2:29|(2:31|(2:33|(2:35|(2:37|38)(2:39|40))(2:41|42))(2:43|44))(2:45|46))))|57|6|7|(0)(0)|19|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0066, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0063, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5 A[Catch: all -> 0x0063, TimeoutCancellationException -> 0x0066, CancellationException -> 0x0120, TryCatch #2 {TimeoutCancellationException -> 0x0066, CancellationException -> 0x0120, all -> 0x0063, blocks: (B:18:0x005f, B:19:0x00cf, B:21:0x00d5, B:29:0x00e6, B:31:0x00ea, B:33:0x00ee, B:35:0x00f2, B:37:0x00f6, B:38:0x00fb, B:39:0x00fc, B:40:0x0101, B:41:0x0102, B:42:0x0107, B:43:0x0108, B:44:0x0113, B:45:0x0114, B:46:0x0119, B:48:0x006c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6 A[Catch: all -> 0x0063, TimeoutCancellationException -> 0x0066, CancellationException -> 0x0120, TryCatch #2 {TimeoutCancellationException -> 0x0066, CancellationException -> 0x0120, all -> 0x0063, blocks: (B:18:0x005f, B:19:0x00cf, B:21:0x00d5, B:29:0x00e6, B:31:0x00ea, B:33:0x00ee, B:35:0x00f2, B:37:0x00f6, B:38:0x00fb, B:39:0x00fc, B:40:0x0101, B:41:0x0102, B:42:0x0107, B:43:0x0108, B:44:0x0113, B:45:0x0114, B:46:0x0119, B:48:0x006c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b1d0 b1d0Var, Continuation continuation) {
        PlusKPassport750AuthAdapter$login$1 plusKPassport750AuthAdapter$login$1;
        int i;
        Object obj;
        w wVar;
        if (continuation instanceof PlusKPassport750AuthAdapter$login$1) {
            plusKPassport750AuthAdapter$login$1 = (PlusKPassport750AuthAdapter$login$1) continuation;
            int i2 = plusKPassport750AuthAdapter$login$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusKPassport750AuthAdapter$login$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusKPassport750AuthAdapter$login$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusKPassport750AuthAdapter$login$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Filter.a aVar = new Filter.a();
                    aVar.d(null);
                    aVar.a = l(b1d0Var.a());
                    Filter a = aVar.a();
                    LoginProperties.a aVar2 = new LoginProperties.a();
                    aVar2.f(a);
                    aVar2.i(m(b1d0Var.b()));
                    LoginProperties.Companion.getClass();
                    LoginProperties b = com.yandex.passport.internal.properties.i.b(aVar2);
                    rol0 d = this.d.d(new h(this.a.t().a, i3), b);
                    plusKPassport750AuthAdapter$login$1.L$0 = null;
                    plusKPassport750AuthAdapter$login$1.L$1 = null;
                    plusKPassport750AuthAdapter$login$1.L$2 = null;
                    plusKPassport750AuthAdapter$login$1.L$3 = null;
                    plusKPassport750AuthAdapter$login$1.L$4 = null;
                    plusKPassport750AuthAdapter$login$1.L$5 = null;
                    plusKPassport750AuthAdapter$login$1.L$6 = null;
                    plusKPassport750AuthAdapter$login$1.L$7 = null;
                    plusKPassport750AuthAdapter$login$1.I$0 = 0;
                    plusKPassport750AuthAdapter$login$1.I$1 = 0;
                    plusKPassport750AuthAdapter$login$1.label = 1;
                    obj2 = e.y(d, plusKPassport750AuthAdapter$login$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = plusKPassport750AuthAdapter$login$1.L$2;
                        kotlin.b.b(obj2);
                        return obj;
                    }
                    kotlin.b.b(obj2);
                }
                wVar = (w) obj2;
                if (wVar instanceof u) {
                    if (wVar instanceof v) {
                        throw new PlusAuthAdapter$AuthException.Unsupported();
                    }
                    if (wVar instanceof s) {
                        throw new PlusAuthAdapter$AuthException.Other(((s) wVar).a());
                    }
                    if (wVar instanceof t) {
                        throw new PlusAuthAdapter$AuthException.Forbidden();
                    }
                    if (wVar instanceof q) {
                        throw new PlusAuthAdapter$AuthException.Cancelled();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Object failure = new Long(((u) wVar).d().getValue());
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                long longValue = ((Number) failure).longValue();
                Long l = new Long(longValue);
                r0 r0Var = this.b;
                r0Var.getClass();
                r0Var.m(null, l);
                g5d0 g5d0Var = new g5d0(longValue);
                plusKPassport750AuthAdapter$login$1.L$0 = null;
                plusKPassport750AuthAdapter$login$1.L$1 = null;
                plusKPassport750AuthAdapter$login$1.L$2 = failure;
                plusKPassport750AuthAdapter$login$1.L$3 = null;
                plusKPassport750AuthAdapter$login$1.L$4 = null;
                plusKPassport750AuthAdapter$login$1.L$5 = null;
                plusKPassport750AuthAdapter$login$1.L$6 = null;
                plusKPassport750AuthAdapter$login$1.L$7 = null;
                plusKPassport750AuthAdapter$login$1.J$0 = longValue;
                plusKPassport750AuthAdapter$login$1.I$0 = 0;
                plusKPassport750AuthAdapter$login$1.label = 2;
                if (this.c.emit(g5d0Var, plusKPassport750AuthAdapter$login$1) != coroutineSingletons) {
                    obj = failure;
                    return obj;
                }
                return coroutineSingletons;
            }
        }
        plusKPassport750AuthAdapter$login$1 = new PlusKPassport750AuthAdapter$login$1(this, (ContinuationImpl) continuation);
        Object obj22 = plusKPassport750AuthAdapter$login$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$login$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        wVar = (w) obj22;
        if (wVar instanceof u) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:44|45|(2:47|41))|19|(2:21|(2:23|(2:25|(2:27|28)(2:29|30))(2:31|32))(2:33|34))(4:35|36|37|(3:39|(3:42|12|13)|41)(1:43))))|54|6|7|(0)(0)|19|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        r11 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[Catch: all -> 0x005b, TimeoutCancellationException -> 0x005e, CancellationException -> 0x00fb, TryCatch #2 {TimeoutCancellationException -> 0x005e, CancellationException -> 0x00fb, all -> 0x005b, blocks: (B:18:0x0057, B:19:0x00c1, B:21:0x00c7, B:23:0x00cb, B:25:0x00cf, B:27:0x00d3, B:28:0x00d8, B:29:0x00d9, B:30:0x00de, B:31:0x00df, B:32:0x00e4, B:33:0x00e5, B:34:0x00f0, B:35:0x00f1, B:45:0x0064), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1 A[Catch: all -> 0x005b, TimeoutCancellationException -> 0x005e, CancellationException -> 0x00fb, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x005e, CancellationException -> 0x00fb, all -> 0x005b, blocks: (B:18:0x0057, B:19:0x00c1, B:21:0x00c7, B:23:0x00cb, B:25:0x00cf, B:27:0x00d3, B:28:0x00d8, B:29:0x00d9, B:30:0x00de, B:31:0x00df, B:32:0x00e4, B:33:0x00e5, B:34:0x00f0, B:35:0x00f1, B:45:0x0064), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(c1d0 c1d0Var, Continuation continuation) {
        PlusKPassport750AuthAdapter$logout$1 plusKPassport750AuthAdapter$logout$1;
        int i;
        Object obj;
        k1 k1Var;
        if (continuation instanceof PlusKPassport750AuthAdapter$logout$1) {
            plusKPassport750AuthAdapter$logout$1 = (PlusKPassport750AuthAdapter$logout$1) continuation;
            int i2 = plusKPassport750AuthAdapter$logout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusKPassport750AuthAdapter$logout$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusKPassport750AuthAdapter$logout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusKPassport750AuthAdapter$logout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PassportLogoutPropertiesImpl.a aVar = new PassportLogoutPropertiesImpl.a();
                    aVar.c(c.c(l(c1d0Var.a()), j()));
                    aVar.b(m(c1d0Var.b()));
                    aVar.a();
                    PassportLogoutPropertiesImpl.Companion.getClass();
                    PassportLogoutPropertiesImpl b = l.b(aVar);
                    rol0 d = this.d.d(new h(this.a.t().a, 11), b);
                    plusKPassport750AuthAdapter$logout$1.L$0 = null;
                    plusKPassport750AuthAdapter$logout$1.L$1 = null;
                    plusKPassport750AuthAdapter$logout$1.L$2 = null;
                    plusKPassport750AuthAdapter$logout$1.L$3 = null;
                    plusKPassport750AuthAdapter$logout$1.L$4 = null;
                    plusKPassport750AuthAdapter$logout$1.L$5 = null;
                    plusKPassport750AuthAdapter$logout$1.I$0 = 0;
                    plusKPassport750AuthAdapter$logout$1.I$1 = 0;
                    plusKPassport750AuthAdapter$logout$1.label = 1;
                    obj2 = e.y(d, plusKPassport750AuthAdapter$logout$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = plusKPassport750AuthAdapter$logout$1.L$1;
                        kotlin.b.b(obj2);
                        return obj;
                    }
                    kotlin.b.b(obj2);
                }
                k1Var = (k1) obj2;
                if (k1Var instanceof j1) {
                    if (k1Var instanceof h1) {
                        throw new PlusAuthAdapter$AuthException.Other(((h1) k1Var).a());
                    }
                    if (k1Var instanceof i1) {
                        throw new PlusAuthAdapter$AuthException.Forbidden();
                    }
                    if (k1Var instanceof g1) {
                        throw new PlusAuthAdapter$AuthException.Cancelled();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Object failure = zy11.a;
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                this.b.l(null);
                h5d0 h5d0Var = h5d0.a;
                plusKPassport750AuthAdapter$logout$1.L$0 = null;
                plusKPassport750AuthAdapter$logout$1.L$1 = failure;
                plusKPassport750AuthAdapter$logout$1.L$2 = null;
                plusKPassport750AuthAdapter$logout$1.L$3 = null;
                plusKPassport750AuthAdapter$logout$1.L$4 = null;
                plusKPassport750AuthAdapter$logout$1.L$5 = null;
                plusKPassport750AuthAdapter$logout$1.I$0 = 0;
                plusKPassport750AuthAdapter$logout$1.label = 2;
                if (this.c.emit(h5d0Var, plusKPassport750AuthAdapter$logout$1) != coroutineSingletons) {
                    obj = failure;
                    return obj;
                }
                return coroutineSingletons;
            }
        }
        plusKPassport750AuthAdapter$logout$1 = new PlusKPassport750AuthAdapter$logout$1(this, (ContinuationImpl) continuation);
        Object obj22 = plusKPassport750AuthAdapter$logout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$logout$1.label;
        if (i != 0) {
        }
        k1Var = (k1) obj22;
        if (k1Var instanceof j1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(w0d0 w0d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$dropAuthToken$1 plusKPassport750AuthAdapter$dropAuthToken$1;
        int i;
        Object A;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$dropAuthToken$1) {
                plusKPassport750AuthAdapter$dropAuthToken$1 = (PlusKPassport750AuthAdapter$dropAuthToken$1) continuationImpl;
                int i2 = plusKPassport750AuthAdapter$dropAuthToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$dropAuthToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$dropAuthToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$dropAuthToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String a = w0d0Var.a();
                        b bVar = this.a;
                        plusKPassport750AuthAdapter$dropAuthToken$1.L$0 = null;
                        plusKPassport750AuthAdapter$dropAuthToken$1.L$1 = null;
                        plusKPassport750AuthAdapter$dropAuthToken$1.L$2 = null;
                        plusKPassport750AuthAdapter$dropAuthToken$1.L$3 = null;
                        plusKPassport750AuthAdapter$dropAuthToken$1.L$4 = null;
                        plusKPassport750AuthAdapter$dropAuthToken$1.I$0 = 0;
                        plusKPassport750AuthAdapter$dropAuthToken$1.I$1 = 0;
                        plusKPassport750AuthAdapter$dropAuthToken$1.label = 1;
                        A = bVar.A(a, plusKPassport750AuthAdapter$dropAuthToken$1);
                        if (A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        A = ((Result) obj).getValue();
                    }
                    kotlin.b.b(A);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(A);
            return zy11.a;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$dropAuthToken$1 = new PlusKPassport750AuthAdapter$dropAuthToken$1(this, continuationImpl);
        Object obj2 = plusKPassport750AuthAdapter$dropAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$dropAuthToken$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(z0d0 z0d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$getAuthorizationUrl$1 plusKPassport750AuthAdapter$getAuthorizationUrl$1;
        int i;
        Object p;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$getAuthorizationUrl$1) {
                plusKPassport750AuthAdapter$getAuthorizationUrl$1 = (PlusKPassport750AuthAdapter$getAuthorizationUrl$1) continuationImpl;
                int i2 = plusKPassport750AuthAdapter$getAuthorizationUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$getAuthorizationUrl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$getAuthorizationUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        KPassportEnvironment l = l(z0d0Var.a());
                        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(l), j());
                        b bVar = this.a;
                        ww90 ww90Var = new ww90(28, passportUidImpl, z0d0Var);
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.L$0 = null;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.L$1 = null;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.L$2 = null;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.L$3 = null;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.L$4 = null;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.I$0 = 0;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.I$1 = 0;
                        plusKPassport750AuthAdapter$getAuthorizationUrl$1.label = 1;
                        p = bVar.p(ww90Var, plusKPassport750AuthAdapter$getAuthorizationUrl$1);
                        if (p == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        p = ((Result) obj).getValue();
                    }
                    kotlin.b.b(p);
                    return p;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(p);
            return p;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$getAuthorizationUrl$1 = new PlusKPassport750AuthAdapter$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = plusKPassport750AuthAdapter$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$getAuthorizationUrl$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: all -> 0x0098, CancellationException -> 0x009f, TimeoutCancellationException -> 0x00a1, TryCatch #2 {TimeoutCancellationException -> 0x00a1, CancellationException -> 0x009f, all -> 0x0098, blocks: (B:11:0x003c, B:12:0x008c, B:14:0x0090, B:15:0x0094, B:22:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(y0d0 y0d0Var, ContinuationImpl continuationImpl) {
        PlusKPassport750AuthAdapter$getAuthToken$1 plusKPassport750AuthAdapter$getAuthToken$1;
        int i;
        Object w;
        try {
            if (continuationImpl instanceof PlusKPassport750AuthAdapter$getAuthToken$1) {
                plusKPassport750AuthAdapter$getAuthToken$1 = (PlusKPassport750AuthAdapter$getAuthToken$1) continuationImpl;
                int i2 = plusKPassport750AuthAdapter$getAuthToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusKPassport750AuthAdapter$getAuthToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusKPassport750AuthAdapter$getAuthToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusKPassport750AuthAdapter$getAuthToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        KPassportEnvironment l = l(y0d0Var.a);
                        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(l), j());
                        String str = y0d0Var.b;
                        String str2 = y0d0Var.c;
                        ClientCredentials.Factory.getClass();
                        Credentials credentials = new Credentials(str, str2);
                        b bVar = this.a;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$0 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$1 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$2 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$3 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$4 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.L$5 = null;
                        plusKPassport750AuthAdapter$getAuthToken$1.I$0 = 0;
                        plusKPassport750AuthAdapter$getAuthToken$1.I$1 = 0;
                        plusKPassport750AuthAdapter$getAuthToken$1.label = 1;
                        w = bVar.w(passportUidImpl, credentials, plusKPassport750AuthAdapter$getAuthToken$1);
                        if (w == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        w = ((Result) obj).getValue();
                    }
                    if (!(w instanceof Result.Failure)) {
                        w = ((f) w).a;
                    }
                    kotlin.b.b(w);
                    return w;
                }
            }
            if (i != 0) {
            }
            if (!(w instanceof Result.Failure)) {
            }
            kotlin.b.b(w);
            return w;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plusKPassport750AuthAdapter$getAuthToken$1 = new PlusKPassport750AuthAdapter$getAuthToken$1(this, continuationImpl);
        Object obj2 = plusKPassport750AuthAdapter$getAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusKPassport750AuthAdapter$getAuthToken$1.label;
    }

    public final long j() {
        Object value = this.b.getValue();
        if (value != null) {
            return ((Number) value).longValue();
        }
        ny61.r("userId is not specified!");
        return 0L;
    }

    public final void k(Long l) {
        this.b.l(l);
    }
}
