package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.CoopAccountApi;
import com.yandex.go.payments.shared.data.model.SetInvitationReadRequest;
import defpackage.cda0;
import defpackage.cmt;
import defpackage.cog;
import defpackage.i3y;
import defpackage.m6i0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.qhq0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yqg;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class x {
    public final on2 a;
    public final yqg b;
    public final m6i0 c;
    public final cda0 d;
    public final cog e;
    public final tt2 f;
    public final i3y g = kotlin.a.a(new qhq0(5, this));

    public x(on2 on2Var, yqg yqgVar, m6i0 m6i0Var, cda0 cda0Var, cog cogVar, tt2 tt2Var) {
        this.a = on2Var;
        this.b = yqgVar;
        this.c = m6i0Var;
        this.d = cda0Var;
        this.e = cogVar;
        this.f = tt2Var;
    }

    public static final Object a(x xVar, String str, SuspendLambda suspendLambda) {
        return ru.yandex.taxi.network.api.a.a(xVar.b().m(str), null, suspendLambda);
    }

    public final CoopAccountApi b() {
        return (CoopAccountApi) this.g.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (defpackage.tje.k0(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        SharedPaymentRepository$leaveAccount$1 sharedPaymentRepository$leaveAccount$1;
        int i;
        if (continuationImpl instanceof SharedPaymentRepository$leaveAccount$1) {
            sharedPaymentRepository$leaveAccount$1 = (SharedPaymentRepository$leaveAccount$1) continuationImpl;
            int i2 = sharedPaymentRepository$leaveAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentRepository$leaveAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentRepository$leaveAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentRepository$leaveAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SharedPaymentRepository$leaveAccount$2 sharedPaymentRepository$leaveAccount$2 = new SharedPaymentRepository$leaveAccount$2(this, str, null);
                    sharedPaymentRepository$leaveAccount$1.L$0 = null;
                    sharedPaymentRepository$leaveAccount$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                sharedPaymentRepository$leaveAccount$1.L$0 = null;
                sharedPaymentRepository$leaveAccount$1.label = 2;
                Object q = ((com.yandex.go.payments.paymentlist.data.c) this.d).q(sharedPaymentRepository$leaveAccount$1);
                return q != coroutineSingletons ? coroutineSingletons : q;
            }
        }
        sharedPaymentRepository$leaveAccount$1 = new SharedPaymentRepository$leaveAccount$1(this, continuationImpl);
        Object obj2 = sharedPaymentRepository$leaveAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentRepository$leaveAccount$1.label;
        if (i != 0) {
        }
        sharedPaymentRepository$leaveAccount$1.L$0 = null;
        sharedPaymentRepository$leaveAccount$1.label = 2;
        Object q2 = ((com.yandex.go.payments.paymentlist.data.c) this.d).q(sharedPaymentRepository$leaveAccount$1);
        if (q2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        SharedPaymentRepository$removeAccount$1 sharedPaymentRepository$removeAccount$1;
        int i;
        if (continuationImpl instanceof SharedPaymentRepository$removeAccount$1) {
            sharedPaymentRepository$removeAccount$1 = (SharedPaymentRepository$removeAccount$1) continuationImpl;
            int i2 = sharedPaymentRepository$removeAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentRepository$removeAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentRepository$removeAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentRepository$removeAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SharedPaymentRepository$removeAccount$2 sharedPaymentRepository$removeAccount$2 = new SharedPaymentRepository$removeAccount$2(this, str, null);
                    sharedPaymentRepository$removeAccount$1.L$0 = null;
                    sharedPaymentRepository$removeAccount$1.label = 1;
                    if (tje.k0(mdhVar, sharedPaymentRepository$removeAccount$2, sharedPaymentRepository$removeAccount$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ((com.yandex.go.payments.paymentlist.data.c) this.d).p();
                return zy11.a;
            }
        }
        sharedPaymentRepository$removeAccount$1 = new SharedPaymentRepository$removeAccount$1(this, continuationImpl);
        Object obj2 = sharedPaymentRepository$removeAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentRepository$removeAccount$1.label;
        if (i != 0) {
        }
        ((com.yandex.go.payments.paymentlist.data.c) this.d).p();
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        SharedPaymentRepository$setAccountInvitationRead$1 sharedPaymentRepository$setAccountInvitationRead$1;
        int i;
        if (continuationImpl instanceof SharedPaymentRepository$setAccountInvitationRead$1) {
            sharedPaymentRepository$setAccountInvitationRead$1 = (SharedPaymentRepository$setAccountInvitationRead$1) continuationImpl;
            int i2 = sharedPaymentRepository$setAccountInvitationRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentRepository$setAccountInvitationRead$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentRepository$setAccountInvitationRead$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentRepository$setAccountInvitationRead$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<zy11> f = b().f(str, new SetInvitationReadRequest(0));
                    sharedPaymentRepository$setAccountInvitationRead$1.L$0 = null;
                    sharedPaymentRepository$setAccountInvitationRead$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(f, null, sharedPaymentRepository$setAccountInvitationRead$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ((com.yandex.go.payments.paymentlist.data.c) this.d).p();
                return zy11.a;
            }
        }
        sharedPaymentRepository$setAccountInvitationRead$1 = new SharedPaymentRepository$setAccountInvitationRead$1(this, continuationImpl);
        Object obj2 = sharedPaymentRepository$setAccountInvitationRead$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentRepository$setAccountInvitationRead$1.label;
        if (i != 0) {
        }
        ((com.yandex.go.payments.paymentlist.data.c) this.d).p();
        return zy11.a;
    }
}
