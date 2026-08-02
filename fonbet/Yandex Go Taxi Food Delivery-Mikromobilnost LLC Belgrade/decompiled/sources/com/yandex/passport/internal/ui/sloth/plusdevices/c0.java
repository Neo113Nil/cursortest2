package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.data.exceptions.DeviceValidationException;
import com.yandex.passport.internal.usecase.o1;
import com.yandex.passport.internal.usecase.p1;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c0 extends com.yandex.passport.common.mvi.g {
    public final o c;
    public final com.yandex.passport.internal.report.reporters.h0 d;
    public final p1 e;
    public final com.yandex.passport.internal.usecase.k0 f;

    public c0(o oVar, com.yandex.passport.internal.report.reporters.h0 h0Var, p1 p1Var, com.yandex.passport.internal.usecase.k0 k0Var) {
        this.c = oVar;
        this.d = h0Var;
        this.e = p1Var;
        this.f = k0Var;
    }

    public static int k(Throwable th) {
        if (th instanceof DeviceValidationException) {
            return 1111;
        }
        return ((th instanceof InvalidTokenException) || (th instanceof PassportAccountNotFoundException)) ? 401 : 1112;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        a0 a0Var = (a0) obj;
        boolean z = a0Var instanceof x;
        zy11 zy11Var = zy11.a;
        if (z) {
            Object l = l((ContinuationImpl) continuation);
            if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return l;
            }
        } else {
            if (a0Var instanceof y) {
                int i = ((y) a0Var).a;
                if (i == -1) {
                    e(new z(false));
                    return zy11Var;
                }
                a(new d0(i));
                return zy11Var;
            }
            if (!(a0Var instanceof z)) {
                w511.b();
                return null;
            }
            Object m = m(((z) a0Var).a, (ContinuationImpl) continuation);
            if (m == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return m;
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        p0 p0Var = (p0) obj;
        boolean l = jl40.l(p0Var, l0.a);
        i0 i0Var = i0.a;
        if (l) {
            f(i0Var);
        } else {
            boolean z = p0Var instanceof m0;
            o oVar = this.c;
            com.yandex.passport.internal.report.reporters.h0 h0Var = this.d;
            if (z) {
                com.yandex.passport.sloth.i0 i0Var2 = ((m0) p0Var).a;
                if (i0Var2 instanceof com.yandex.passport.sloth.a0) {
                    com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) i0Var2;
                    Throwable th = a0Var.a;
                    if (com.yandex.passport.internal.ui.sloth.e.j(th)) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Internet connection is lost in Sloth.", 8);
                        }
                    } else {
                        h0Var.j(oVar.a, oVar.c, oVar.d, a0Var.b);
                        e(new y(th instanceof InvalidTokenException ? 401 : 1112));
                    }
                }
            } else if (p0Var instanceof n0) {
                int i = b0.a[((n0) p0Var).a.ordinal()];
                if (i == 1 || i == 2) {
                    f(i0Var);
                } else if (i != 3) {
                    w511.b();
                    return null;
                }
            } else {
                if (!(p0Var instanceof o0)) {
                    w511.b();
                    return null;
                }
                a1 a1Var = ((o0) p0Var).a;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New event: " + a1Var, 8);
                }
                if (a1Var instanceof com.yandex.passport.sloth.a) {
                    h0Var.m(oVar.a, oVar.c, oVar.d, ((com.yandex.passport.sloth.a) a1Var).a);
                    e(new y(-1));
                }
            }
        }
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new d0(k(th)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        ManagingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1 managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1;
        int i;
        Object value;
        Throwable a;
        c0 c0Var = this;
        if (continuationImpl instanceof ManagingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1) {
            managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1 = (ManagingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1) continuationImpl;
            int i2 = managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uid uid = c0Var.c.a;
                    managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.L$0 = c0Var;
                    managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.label = 1;
                    obj = c0Var.f.a(uid, managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0Var = (c0) managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    long longValue = ((Number) value).longValue();
                    o oVar = c0Var.c;
                    c0Var.a(new e0(new SlothParams(new com.yandex.passport.sloth.data.q(oVar.a, longValue, com.yandex.passport.internal.properties.u.X(oVar.b), oVar.c, oVar.d), oVar.a.getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null)));
                }
                a = Result.a(value);
                if (a != null) {
                    c0Var.getClass();
                    c0Var.a(new d0(k(a)));
                }
                return zy11.a;
            }
        }
        managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1 = new ManagingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1(c0Var, continuationImpl);
        Object obj2 = managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managingPlusDevicesStoreFactory$ExecutorImpl$showManagingPlusDevicesOrError$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(boolean z, ContinuationImpl continuationImpl) {
        ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1 managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1;
        int i;
        Object value;
        c0 c0Var;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1) {
            managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1 = (ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1) continuationImpl;
            int i2 = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o oVar = this.c;
                    o1 o1Var = new o1(oVar.a, oVar.c, oVar.d, "managing_plus_devices");
                    managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$0 = this;
                    managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.Z$0 = z;
                    managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label = 1;
                    obj2 = this.e.a(o1Var, managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$1;
                        c0Var = (c0) managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$0;
                        kotlin.b.b(obj2);
                        value = obj;
                        this = c0Var;
                        a = Result.a(value);
                        if (a != null) {
                            this.getClass();
                            this.a(new d0(k(a)));
                        }
                        return zy11.a;
                    }
                    z = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.Z$0;
                    this = (c0) managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$0;
                    kotlin.b.b(obj2);
                }
                value = ((Result) obj2).getValue();
                if (!(value instanceof Result.Failure)) {
                    if (((Boolean) value).booleanValue()) {
                        this.a(new d0(-1));
                    } else {
                        if (z) {
                            managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$0 = this;
                            managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.L$1 = value;
                            managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label = 2;
                            if (this.l(managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1) != coroutineSingletons) {
                                c0Var = this;
                                obj = value;
                                value = obj;
                                this = c0Var;
                            }
                            return coroutineSingletons;
                        }
                        this.a(new d0(1112));
                    }
                }
                a = Result.a(value);
                if (a != null) {
                }
                return zy11.a;
            }
        }
        managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1 = new ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1(this, continuationImpl);
        Object obj22 = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1.label;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }
}
