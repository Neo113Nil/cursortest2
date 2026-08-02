package com.yandex.delivery.utils.auth.impl;

import defpackage.g050;
import defpackage.jgz;
import defpackage.mvg;
import defpackage.ni3;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rk3;
import defpackage.uk3;
import defpackage.wi3;
import defpackage.wk3;
import defpackage.wls;
import defpackage.zk3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "authToken", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.auth.impl.AuthManagerImpl$init$1", f = "AuthManagerImpl.kt", l = {113, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AuthManagerImpl$init$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManagerImpl$init$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthManagerImpl$init$1 authManagerImpl$init$1 = new AuthManagerImpl$init$1(this.this$0, continuation);
        authManagerImpl$init$1.L$0 = obj;
        return authManagerImpl$init$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthManagerImpl$init$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        Ref$ObjectRef z;
        a aVar;
        g050 g050Var2;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        a aVar2;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                z = qv10.z(obj);
                aVar = this.this$0;
                g050Var2 = aVar.e;
                this.L$0 = str;
                this.L$1 = z;
                this.L$2 = g050Var2;
                this.L$3 = aVar;
                this.I$0 = 0;
                this.label = 1;
                if (g050Var2.a(this) != coroutineSingletons) {
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$4;
                aVar2 = (a) this.L$3;
                g050Var = (g050) this.L$2;
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                try {
                    b.b(obj);
                    rk3 rk3Var = new rk3((ni3) obj);
                    z = ref$ObjectRef2;
                    g050Var2 = g050Var;
                    t = rk3Var;
                    aVar = aVar2;
                    z.element = t;
                    aVar.g.l(ref$ObjectRef.element);
                    g050Var2.d(null);
                    a aVar3 = this.this$0;
                    zk3 zk3Var = (zk3) ref$ObjectRef.element;
                    for (wi3 wi3Var : (Iterable) aVar3.a.get()) {
                        try {
                            if (zk3Var instanceof rk3) {
                                wi3Var.getClass();
                            } else if (zk3Var instanceof uk3) {
                                wi3Var.a();
                            } else if (!(zk3Var instanceof wk3)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } catch (Throwable th) {
                            jgz jgzVar = jgz.a;
                            jgz.d(th, "DeliveryAuthManager exception.", new Object[0]);
                        }
                    }
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var.d(null);
                    throw th;
                }
            }
            int i3 = this.I$0;
            a aVar4 = (a) this.L$3;
            g050Var2 = (g050) this.L$2;
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
            b.b(obj);
            i = i3;
            aVar = aVar4;
            z = ref$ObjectRef3;
            if (str == null) {
                ref$ObjectRef = z;
                t = uk3.a;
                z.element = t;
                aVar.g.l(ref$ObjectRef.element);
                g050Var2.d(null);
                a aVar32 = this.this$0;
                zk3 zk3Var2 = (zk3) ref$ObjectRef.element;
                while (r9.hasNext()) {
                }
                return zy11.a;
            }
            this.L$0 = null;
            this.L$1 = z;
            this.L$2 = g050Var2;
            this.L$3 = aVar;
            this.L$4 = z;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 2;
            Object a = a.a(aVar, str, this);
            if (a != coroutineSingletons) {
                ref$ObjectRef = z;
                aVar2 = aVar;
                g050Var = g050Var2;
                obj = a;
                ref$ObjectRef2 = ref$ObjectRef;
                rk3 rk3Var2 = new rk3((ni3) obj);
                z = ref$ObjectRef2;
                g050Var2 = g050Var;
                t = rk3Var2;
                aVar = aVar2;
                z.element = t;
                aVar.g.l(ref$ObjectRef.element);
                g050Var2.d(null);
                a aVar322 = this.this$0;
                zk3 zk3Var22 = (zk3) ref$ObjectRef.element;
                while (r9.hasNext()) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            g050Var = g050Var2;
        }
    }
}
