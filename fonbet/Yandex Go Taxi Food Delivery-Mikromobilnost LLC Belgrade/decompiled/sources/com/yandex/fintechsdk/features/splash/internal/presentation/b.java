package com.yandex.fintechsdk.features.splash.internal.presentation;

import android.content.Context;
import android.os.SystemClock;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.ai3;
import defpackage.co90;
import defpackage.cqt0;
import defpackage.di9;
import defpackage.dn90;
import defpackage.ek;
import defpackage.fo90;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.jp90;
import defpackage.kva0;
import defpackage.li3;
import defpackage.ll3;
import defpackage.m7b;
import defpackage.mqt0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.ova0;
import defpackage.pu11;
import defpackage.qk3;
import defpackage.qu11;
import defpackage.sb2;
import defpackage.sk3;
import defpackage.sqt0;
import defpackage.uo90;
import defpackage.wc5;
import defpackage.z22;
import defpackage.zn90;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class b extends wc5 {
    public final jp90 A;
    public final cqt0 B;
    public final mqt0 C;
    public final sqt0 D;
    public final kotlinx.coroutines.channels.a E;
    public final di9 F;
    public final z22 c;
    public final hk3 w;
    public final DefaultEnvironment x;
    public final dn90 y;
    public final zn90 z;

    public b(z22 z22Var, hk3 hk3Var, DefaultEnvironment defaultEnvironment, dn90 dn90Var, zn90 zn90Var, jp90 jp90Var, cqt0 cqt0Var, mqt0 mqt0Var, sqt0 sqt0Var) {
        super(zy11.a);
        this.c = z22Var;
        this.w = hk3Var;
        this.x = defaultEnvironment;
        this.y = dn90Var;
        this.z = zn90Var;
        this.A = jp90Var;
        this.B = cqt0Var;
        this.C = mqt0Var;
        this.D = sqt0Var;
        kotlinx.coroutines.channels.a a = sb2.a(0, null, null, 7);
        this.E = a;
        this.F = new di9(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X(b bVar, ContinuationImpl continuationImpl) {
        SplashViewModel$preloadData$1 splashViewModel$preloadData$1;
        int i;
        Object a;
        bVar.getClass();
        if (continuationImpl instanceof SplashViewModel$preloadData$1) {
            splashViewModel$preloadData$1 = (SplashViewModel$preloadData$1) continuationImpl;
            int i2 = splashViewModel$preloadData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashViewModel$preloadData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashViewModel$preloadData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashViewModel$preloadData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mqt0 mqt0Var = bVar.C;
                    splashViewModel$preloadData$1.label = 1;
                    a = mqt0Var.a(splashViewModel$preloadData$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                return Boolean.valueOf(!(a instanceof Result.Failure));
            }
        }
        splashViewModel$preloadData$1 = new SplashViewModel$preloadData$1(bVar, continuationImpl);
        Object obj2 = splashViewModel$preloadData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashViewModel$preloadData$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!(a instanceof Result.Failure));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r15 == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (r15 == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0091, code lost:
    
        if (r15 == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y(b bVar, Context context, ContinuationImpl continuationImpl) {
        SplashViewModel$processAuth$1 splashViewModel$processAuth$1;
        Object obj;
        int i;
        Context context2;
        qu11 qu11Var;
        n4u0 e;
        Object a;
        Context context3;
        qk3 qk3Var;
        cqt0 cqt0Var = bVar.B;
        hk3 hk3Var = bVar.w;
        z22 z22Var = bVar.c;
        if (continuationImpl instanceof SplashViewModel$processAuth$1) {
            splashViewModel$processAuth$1 = (SplashViewModel$processAuth$1) continuationImpl;
            int i2 = splashViewModel$processAuth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashViewModel$processAuth$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = splashViewModel$processAuth$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashViewModel$processAuth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (hk3Var.c.a.getValue() instanceof qk3) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(true));
                        return Boolean.TRUE;
                    }
                    jp90 jp90Var = bVar.A;
                    if (jp90Var == null || (e = jp90Var.e()) == null) {
                        context2 = context;
                        qu11Var = null;
                        splashViewModel$processAuth$1.L$0 = context2;
                        splashViewModel$processAuth$1.L$1 = qu11Var;
                        splashViewModel$processAuth$1.label = 2;
                        a = cqt0Var.a(splashViewModel$processAuth$1);
                        if (a != obj) {
                            context3 = context2;
                            obj2 = a;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            if (qu11Var instanceof pu11) {
                            }
                        }
                    }
                    SplashViewModel$processAuth$uidState$1 splashViewModel$processAuth$uidState$1 = new SplashViewModel$processAuth$uidState$1(2, null);
                    splashViewModel$processAuth$1.L$0 = context;
                    splashViewModel$processAuth$1.label = 1;
                    obj2 = e.z(e, splashViewModel$processAuth$uidState$1, splashViewModel$processAuth$1);
                } else if (i == 1) {
                    context = (Context) splashViewModel$processAuth$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i == 2) {
                        qu11Var = (qu11) splashViewModel$processAuth$1.L$1;
                        context3 = (Context) splashViewModel$processAuth$1.L$0;
                        kotlin.b.b(obj2);
                        if (!((Boolean) obj2).booleanValue() && !(qu11Var instanceof pu11)) {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(false));
                            return Boolean.TRUE;
                        }
                        if (qu11Var instanceof pu11) {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(false));
                            splashViewModel$processAuth$1.L$0 = null;
                            splashViewModel$processAuth$1.L$1 = null;
                            splashViewModel$processAuth$1.label = 4;
                            obj2 = bVar.a0(context3, splashViewModel$processAuth$1);
                        } else {
                            long j = ((pu11) qu11Var).a;
                            splashViewModel$processAuth$1.L$0 = null;
                            splashViewModel$processAuth$1.L$1 = null;
                            splashViewModel$processAuth$1.label = 3;
                            obj2 = bVar.Z(context3, j, splashViewModel$processAuth$1);
                        }
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                kotlin.b.b(obj2);
                                return obj2;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        qk3Var = (qk3) obj2;
                        if (qk3Var != null) {
                            splashViewModel$processAuth$1.label = 5;
                            Object a2 = cqt0Var.a(splashViewModel$processAuth$1);
                            return a2 == obj ? obj : a2;
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        hk3Var.a(qk3Var);
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new kva0(((Number) new Pair(zy11.a, new Long(SystemClock.elapsedRealtime() - elapsedRealtime)).getSecond()).longValue()));
                        return Boolean.TRUE;
                    }
                    kotlin.b.b(obj2);
                    qk3Var = (qk3) obj2;
                    if (qk3Var != null) {
                    }
                }
                qu11 qu11Var2 = (qu11) obj2;
                context2 = context;
                qu11Var = qu11Var2;
                splashViewModel$processAuth$1.L$0 = context2;
                splashViewModel$processAuth$1.L$1 = qu11Var;
                splashViewModel$processAuth$1.label = 2;
                a = cqt0Var.a(splashViewModel$processAuth$1);
                if (a != obj) {
                }
            }
        }
        splashViewModel$processAuth$1 = new SplashViewModel$processAuth$1(bVar, continuationImpl);
        Object obj22 = splashViewModel$processAuth$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashViewModel$processAuth$1.label;
        if (i != 0) {
        }
        qu11 qu11Var22 = (qu11) obj22;
        context2 = context;
        qu11Var = qu11Var22;
        splashViewModel$processAuth$1.L$0 = context2;
        splashViewModel$processAuth$1.L$1 = qu11Var;
        splashViewModel$processAuth$1.label = 2;
        a = cqt0Var.a(splashViewModel$processAuth$1);
        if (a != obj) {
        }
    }

    @Override // defpackage.wc5
    public final void W() {
        this.D.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(Context context, long j, ContinuationImpl continuationImpl) {
        SplashViewModel$authorizeByHostUid$1 splashViewModel$authorizeByHostUid$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SplashViewModel$authorizeByHostUid$1) {
            splashViewModel$authorizeByHostUid$1 = (SplashViewModel$authorizeByHostUid$1) continuationImpl;
            int i2 = splashViewModel$authorizeByHostUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashViewModel$authorizeByHostUid$1.label = i2 - Integer.MIN_VALUE;
                obj = splashViewModel$authorizeByHostUid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashViewModel$authorizeByHostUid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.w.a(new sk3(j));
                    qk3 b0 = b0(context, j);
                    z22 z22Var = this.c;
                    if (b0 != null) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(true));
                        return b0;
                    }
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(false));
                    splashViewModel$authorizeByHostUid$1.L$0 = context;
                    splashViewModel$authorizeByHostUid$1.label = 1;
                    obj = this.B.a(splashViewModel$authorizeByHostUid$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) splashViewModel$authorizeByHostUid$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                splashViewModel$authorizeByHostUid$1.L$0 = null;
                splashViewModel$authorizeByHostUid$1.label = 2;
                Object a0 = a0(context, splashViewModel$authorizeByHostUid$1);
                return a0 == obj2 ? obj2 : a0;
            }
        }
        splashViewModel$authorizeByHostUid$1 = new SplashViewModel$authorizeByHostUid$1(this, continuationImpl);
        obj = splashViewModel$authorizeByHostUid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashViewModel$authorizeByHostUid$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(Context context, ContinuationImpl continuationImpl) {
        SplashViewModel$authorizeByPassport$1 splashViewModel$authorizeByPassport$1;
        int i;
        Long l;
        if (continuationImpl instanceof SplashViewModel$authorizeByPassport$1) {
            splashViewModel$authorizeByPassport$1 = (SplashViewModel$authorizeByPassport$1) continuationImpl;
            int i2 = splashViewModel$authorizeByPassport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashViewModel$authorizeByPassport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splashViewModel$authorizeByPassport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splashViewModel$authorizeByPassport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    splashViewModel$authorizeByPassport$1.L$0 = context;
                    splashViewModel$authorizeByPassport$1.label = 1;
                    com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this, new SplashViewModel$getUidFromPassport$2(2, null));
                    obj = e.A(this.F, splashViewModel$authorizeByPassport$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) splashViewModel$authorizeByPassport$1.L$0;
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                z22 z22Var = this.c;
                if (l != null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(ai3.c);
                    return null;
                }
                this.w.a(new sk3(l.longValue()));
                qk3 b0 = b0(context, l.longValue());
                if (b0 != null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(ll3.c);
                    return b0;
                }
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(ai3.c);
                return b0;
            }
        }
        splashViewModel$authorizeByPassport$1 = new SplashViewModel$authorizeByPassport$1(this, continuationImpl);
        Object obj2 = splashViewModel$authorizeByPassport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splashViewModel$authorizeByPassport$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        z22 z22Var2 = this.c;
        if (l != null) {
        }
    }

    public final qk3 b0(Context context, long j) {
        qk3 qk3Var = null;
        dn90 dn90Var = this.y;
        if (dn90Var == null) {
            c0("Отсутствует паспорт адаптер, подключите зависимость в вашем gradle файле");
            return null;
        }
        this.B.getClass();
        z22 z22Var = this.c;
        m7b m7bVar = new m7b(new uo90(z22Var, 2), new uo90(z22Var, 5));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zn90 zn90Var = this.z;
            String c = ((hn90) dn90Var).c(context, j, zn90Var.a, zn90Var.b, this.x == DefaultEnvironment.TESTING, false, m7bVar);
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new fo90(false));
            qk3Var = new qk3(new ek(c, j), TokenSource.PASSPORT);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Пользователь не авторизован";
            }
            c0(message);
        } catch (NoSuchMethodError unused) {
            c0("Метод отсутствует в паспорт адаптере, проверьте версию адаптера");
        }
        Pair pair = new Pair(qk3Var, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        qk3 qk3Var2 = (qk3) pair.getFirst();
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ova0(((Number) pair.getSecond()).longValue(), false, qk3Var2 != null));
        return qk3Var2;
    }

    public final void c0(String str) {
        this.B.getClass();
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.c).a(new co90(false, str));
    }
}
