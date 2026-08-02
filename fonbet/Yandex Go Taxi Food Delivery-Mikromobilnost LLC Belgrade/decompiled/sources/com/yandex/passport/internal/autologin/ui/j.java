package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import android.os.Build;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.b0;
import com.yandex.passport.api.exception.PassportAutoLoginRetryRequiredException;
import com.yandex.passport.internal.impl.o;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import defpackage.g6u;
import defpackage.m50;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u40;
import defpackage.uyj;
import defpackage.v40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class j {
    public final Context a;
    public final o b;
    public final com.yandex.passport.internal.impl.i c;
    public final com.yandex.passport.internal.impl.f d;
    public final tse e;
    public final n0 f;
    public final wls g;
    public boolean h;
    public final m50 i;
    public final m50 j;

    public j(Context context, o oVar, com.yandex.passport.internal.impl.i iVar, com.yandex.passport.internal.impl.f fVar, com.yandex.passport.api.e eVar, v40 v40Var, tse tseVar, n0 n0Var, wls wlsVar) {
        this.a = context;
        this.b = oVar;
        this.c = iVar;
        this.d = fVar;
        this.e = tseVar;
        this.f = n0Var;
        this.g = wlsVar;
        final int i = 0;
        this.i = v40Var.registerForActivityResult(new h(eVar, i), new u40(this) { // from class: com.yandex.passport.internal.autologin.ui.f
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                int i2 = i;
                j jVar = this.b;
                Result result = (Result) obj;
                switch (i2) {
                    case 0:
                        tje.N(jVar.e, null, null, new KNewAutologinPerformer$autologinWithAccountLauncher$1$1(result, jVar, null), 3);
                        break;
                    default:
                        tje.N(jVar.e, null, null, new KNewAutologinPerformer$autologinLauncher$4$1(result, jVar, null), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.j = v40Var.registerForActivityResult(new i(), new u40(this) { // from class: com.yandex.passport.internal.autologin.ui.f
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                int i22 = i2;
                j jVar = this.b;
                Result result = (Result) obj;
                switch (i22) {
                    case 0:
                        tje.N(jVar.e, null, null, new KNewAutologinPerformer$autologinWithAccountLauncher$1$1(result, jVar, null), 3);
                        break;
                    default:
                        tje.N(jVar.e, null, null, new KNewAutologinPerformer$autologinLauncher$4$1(result, jVar, null), 3);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
    
        if (defpackage.tje.k0(r4, r5, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (defpackage.tje.k0(r6, r8, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r2 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r5.emit(r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, a0 a0Var, ContinuationImpl continuationImpl) {
        KNewAutologinPerformer$autoLoginWithCredentialManager$1 kNewAutologinPerformer$autoLoginWithCredentialManager$1;
        int i;
        Object e;
        j jVar2;
        Object obj;
        a0 a0Var2;
        Throwable a;
        jVar.getClass();
        if (continuationImpl instanceof KNewAutologinPerformer$autoLoginWithCredentialManager$1) {
            kNewAutologinPerformer$autoLoginWithCredentialManager$1 = (KNewAutologinPerformer$autoLoginWithCredentialManager$1) continuationImpl;
            int i2 = kNewAutologinPerformer$autoLoginWithCredentialManager$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kNewAutologinPerformer$autoLoginWithCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = kNewAutologinPerformer$autoLoginWithCredentialManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kNewAutologinPerformer$autoLoginWithCredentialManager$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e eVar = new e(jVar.c, jVar.d.b);
                    kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0 = jVar;
                    kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1 = a0Var;
                    kNewAutologinPerformer$autoLoginWithCredentialManager$1.label = 1;
                    e = jVar.e(eVar, a0Var, kNewAutologinPerformer$autoLoginWithCredentialManager$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj2);
                                return zy11.a;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$2;
                        a0 a0Var3 = (a0) kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1;
                        j jVar3 = (j) kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0;
                        kotlin.b.b(obj2);
                        a0Var2 = a0Var3;
                        jVar2 = jVar3;
                        if (!(obj instanceof Result.Failure)) {
                            com.yandex.passport.internal.entities.a aVar = (com.yandex.passport.internal.entities.a) ((b0) obj);
                            if (!aVar.b()) {
                                jVar2.d(aVar.a());
                            } else if (aVar.a().getAccountType() != PassportAccountType.CHILDISH) {
                                sjh sjhVar = uyj.a;
                                g6u g6uVar = o400.a;
                                KNewAutologinPerformer$autoLoginWithCredentialManager$3$1$1 kNewAutologinPerformer$autoLoginWithCredentialManager$3$1$1 = new KNewAutologinPerformer$autoLoginWithCredentialManager$3$1$1(jVar2, a0Var2, aVar, null);
                                kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0 = obj;
                                kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1 = null;
                                kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$2 = null;
                                kNewAutologinPerformer$autoLoginWithCredentialManager$1.label = 4;
                            } else {
                                tje.N(jVar2.e, null, null, new KNewAutologinPerformer$checkChild$$inlined$emitOn$1(jVar2.f, null), 3);
                            }
                        }
                        return zy11.a;
                    }
                    a0Var = (a0) kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1;
                    jVar = (j) kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0;
                    kotlin.b.b(obj2);
                    e = ((Result) obj2).getValue();
                }
                a0 a0Var4 = a0Var;
                jVar2 = jVar;
                obj = e;
                a0Var2 = a0Var4;
                a = Result.a(obj);
                if (a != null) {
                    if (a instanceof PassportAutoLoginRetryRequiredException) {
                        sjh sjhVar2 = uyj.a;
                        g6u g6uVar2 = o400.a;
                        KNewAutologinPerformer$autoLoginWithCredentialManager$2$1 kNewAutologinPerformer$autoLoginWithCredentialManager$2$1 = new KNewAutologinPerformer$autoLoginWithCredentialManager$2$1(jVar2, a, null);
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0 = jVar2;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1 = a0Var2;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$2 = obj;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.label = 2;
                    } else {
                        n0 n0Var = jVar2.f;
                        Result result = new Result(new Result.Failure(a));
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$0 = jVar2;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$1 = a0Var2;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.L$2 = obj;
                        kNewAutologinPerformer$autoLoginWithCredentialManager$1.label = 3;
                    }
                    a0Var2 = a0Var3;
                    jVar2 = jVar3;
                }
                if (!(obj instanceof Result.Failure)) {
                }
                return zy11.a;
            }
        }
        kNewAutologinPerformer$autoLoginWithCredentialManager$1 = new KNewAutologinPerformer$autoLoginWithCredentialManager$1(jVar, continuationImpl);
        Object obj22 = kNewAutologinPerformer$autoLoginWithCredentialManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kNewAutologinPerformer$autoLoginWithCredentialManager$1.label;
        if (i != 0) {
        }
        a0 a0Var42 = a0Var;
        jVar2 = jVar;
        obj = e;
        a0Var2 = a0Var42;
        a = Result.a(obj);
        if (a != null) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (r10.emit(r11, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (defpackage.tje.k0(r5, r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, a0 a0Var, ContinuationImpl continuationImpl) {
        KNewAutologinPerformer$autologinWithoutCredentialManager$1 kNewAutologinPerformer$autologinWithoutCredentialManager$1;
        int i;
        Object C;
        j jVar2;
        Object obj;
        Throwable a;
        jVar.getClass();
        if (continuationImpl instanceof KNewAutologinPerformer$autologinWithoutCredentialManager$1) {
            kNewAutologinPerformer$autologinWithoutCredentialManager$1 = (KNewAutologinPerformer$autologinWithoutCredentialManager$1) continuationImpl;
            int i2 = kNewAutologinPerformer$autologinWithoutCredentialManager$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kNewAutologinPerformer$autologinWithoutCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = kNewAutologinPerformer$autologinWithoutCredentialManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kNewAutologinPerformer$autologinWithoutCredentialManager$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.impl.i iVar = jVar.c;
                    kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$0 = jVar;
                    kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$1 = a0Var;
                    kNewAutologinPerformer$autologinWithoutCredentialManager$1.label = 1;
                    C = iVar.C(a0Var, kNewAutologinPerformer$autologinWithoutCredentialManager$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj2);
                                return zy11.a;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$1;
                        jVar2 = (j) kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$0;
                        kotlin.b.b(obj2);
                        a = Result.a(obj);
                        if (a != null) {
                            n0 n0Var = jVar2.f;
                            Result result = new Result(new Result.Failure(a));
                            kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$0 = obj;
                            kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$1 = null;
                            kNewAutologinPerformer$autologinWithoutCredentialManager$1.label = 3;
                        }
                        return zy11.a;
                    }
                    a0Var = (a0) kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$1;
                    jVar = (j) kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$0;
                    kotlin.b.b(obj2);
                    C = ((Result) obj2).getValue();
                }
                a0 a0Var2 = a0Var;
                jVar2 = jVar;
                obj = C;
                if (!(obj instanceof Result.Failure)) {
                    com.yandex.passport.api.i iVar2 = (com.yandex.passport.api.i) obj;
                    if (iVar2.getAccountType() != PassportAccountType.CHILDISH) {
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        KNewAutologinPerformer$autologinWithoutCredentialManager$2$1$1 kNewAutologinPerformer$autologinWithoutCredentialManager$2$1$1 = new KNewAutologinPerformer$autologinWithoutCredentialManager$2$1$1(jVar2, a0Var2, iVar2, null);
                        kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$0 = jVar2;
                        kNewAutologinPerformer$autologinWithoutCredentialManager$1.L$1 = obj;
                        kNewAutologinPerformer$autologinWithoutCredentialManager$1.label = 2;
                    } else {
                        tje.N(jVar2.e, null, null, new KNewAutologinPerformer$checkChild$$inlined$emitOn$1(jVar2.f, null), 3);
                    }
                }
                a = Result.a(obj);
                if (a != null) {
                }
                return zy11.a;
            }
        }
        kNewAutologinPerformer$autologinWithoutCredentialManager$1 = new KNewAutologinPerformer$autologinWithoutCredentialManager$1(jVar, continuationImpl);
        Object obj22 = kNewAutologinPerformer$autologinWithoutCredentialManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kNewAutologinPerformer$autologinWithoutCredentialManager$1.label;
        if (i != 0) {
        }
        a0 a0Var22 = a0Var;
        jVar2 = jVar;
        obj = C;
        if (!(obj instanceof Result.Failure)) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        return zy11.a;
    }

    public static final void c(j jVar, Object obj) {
        jVar.getClass();
        if (!(obj instanceof Result.Failure)) {
            jVar.d((com.yandex.passport.api.i) obj);
        }
        if (Result.a(obj) != null) {
            tje.N(jVar.e, null, null, new KNewAutologinPerformer$finishOrSetCurrentAccount$lambda$14$$inlined$emitOn$1(jVar.f, obj, null), 3);
        }
    }

    public final void d(com.yandex.passport.api.i iVar) {
        boolean z = this.h;
        tse tseVar = this.e;
        if (!z) {
            tje.N(tseVar, null, null, new KNewAutologinPerformer$finishOrSetCurrentAccount$$inlined$emitOn$1(this.f, null, iVar), 3);
        } else {
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new KNewAutologinPerformer$setCurrentAccount$1(this, iVar, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(e eVar, a0 a0Var, ContinuationImpl continuationImpl) {
        KNewAutologinPerformer$getAutoLoginResult$1 kNewAutologinPerformer$getAutoLoginResult$1;
        int i;
        if (continuationImpl instanceof KNewAutologinPerformer$getAutoLoginResult$1) {
            kNewAutologinPerformer$getAutoLoginResult$1 = (KNewAutologinPerformer$getAutoLoginResult$1) continuationImpl;
            int i2 = kNewAutologinPerformer$getAutoLoginResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kNewAutologinPerformer$getAutoLoginResult$1.label = i2 - Integer.MIN_VALUE;
                KNewAutologinPerformer$getAutoLoginResult$1 kNewAutologinPerformer$getAutoLoginResult$12 = kNewAutologinPerformer$getAutoLoginResult$1;
                Object obj = kNewAutologinPerformer$getAutoLoginResult$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kNewAutologinPerformer$getAutoLoginResult$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = Build.VERSION.SDK_INT;
                Context context = this.a;
                if (i3 < 34) {
                    o oVar = this.b;
                    m50 m50Var = oVar.q;
                    n0 n0Var = oVar.k;
                    kNewAutologinPerformer$getAutoLoginResult$12.label = 1;
                    Object e = eVar.e(context, a0Var, m50Var, n0Var, kNewAutologinPerformer$getAutoLoginResult$12);
                    if (e != obj2) {
                        return e;
                    }
                } else {
                    kNewAutologinPerformer$getAutoLoginResult$12.label = 2;
                    Object D = this.c.D(context, a0Var, kNewAutologinPerformer$getAutoLoginResult$12);
                    if (D != obj2) {
                        return D;
                    }
                }
                return obj2;
            }
        }
        kNewAutologinPerformer$getAutoLoginResult$1 = new KNewAutologinPerformer$getAutoLoginResult$1(this, continuationImpl);
        KNewAutologinPerformer$getAutoLoginResult$1 kNewAutologinPerformer$getAutoLoginResult$122 = kNewAutologinPerformer$getAutoLoginResult$1;
        Object obj3 = kNewAutologinPerformer$getAutoLoginResult$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kNewAutologinPerformer$getAutoLoginResult$122.label;
        if (i == 0) {
        }
    }

    public final void f(AutoLoginProperties autoLoginProperties) {
        this.h = autoLoginProperties.getSetAsCurrent();
        sjh sjhVar = uyj.a;
        tje.N(this.e, mdh.b, null, new KNewAutologinPerformer$launch$1(false, this, autoLoginProperties, null), 2);
    }
}
