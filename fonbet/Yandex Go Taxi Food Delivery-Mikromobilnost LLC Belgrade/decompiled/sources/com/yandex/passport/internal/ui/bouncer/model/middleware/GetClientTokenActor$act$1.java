package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/j;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/j;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.GetClientTokenActor$act$1", f = "GetClientTokenActor.kt", l = {52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetClientTokenActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClientTokenActor$act$1(a0 a0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = a0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetClientTokenActor$act$1 getClientTokenActor$act$1 = new GetClientTokenActor$act$1(this.this$0, (Continuation) obj3);
        getClientTokenActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.j) obj;
        getClientTokenActor$act$1.L$1 = (s1) obj2;
        return getClientTokenActor$act$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(11:6|7|8|9|10|11|12|13|(3:21|22|(1:24)(5:25|(2:30|(3:32|(1:36)|37)(1:38))|39|(1:41)(1:48)|(3:43|(1:45)|46)(1:47)))|15|(1:20)(2:17|18))(2:69|70))(4:71|72|73|74))(5:90|91|92|(1:94)|78)|75|76|(8:79|10|11|12|13|(0)|15|(0)(0))|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d2, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00cf, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, com.yandex.passport.internal.ModernAccount, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.ui.bouncer.model.j jVar;
        a0 a0Var;
        s1 s1Var;
        Ref$ObjectRef ref$ObjectRef;
        Object b;
        s1 s1Var2;
        Object a;
        s1 s1Var3;
        ModernAccount modernAccount;
        Result.Failure failure;
        com.yandex.passport.internal.ui.bouncer.model.j jVar2;
        Object obj2;
        Throwable a2;
        Result.Failure failure2;
        VisualProperties visualProperties;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                jVar = (com.yandex.passport.internal.ui.bouncer.model.j) this.L$0;
                s1 s1Var4 = (s1) this.L$1;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                a0Var = this.this$0;
                try {
                    LoginProperties loginProperties = s1Var4.c;
                    this.L$0 = jVar;
                    this.L$1 = s1Var4;
                    this.L$2 = ref$ObjectRef2;
                    this.L$3 = a0Var;
                    this.label = 1;
                    b = a0.b(a0Var, jVar, loginProperties, this);
                    if (b != coroutineSingletons) {
                        s1Var2 = s1Var4;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return coroutineSingletons;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    s1Var = s1Var4;
                    ref$ObjectRef = ref$ObjectRef2;
                    failure = new Result.Failure(e);
                    s1Var3 = s1Var;
                    jVar2 = jVar;
                    obj2 = failure;
                    a0 a0Var2 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    Throwable a3 = Result.a(obj2);
                    if (a3 != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    s1Var = s1Var4;
                    ref$ObjectRef = ref$ObjectRef2;
                    failure = new Result.Failure(th);
                    s1Var3 = s1Var;
                    jVar2 = jVar;
                    obj2 = failure;
                    a0 a0Var22 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    Throwable a32 = Result.a(obj2);
                    if (a32 != null) {
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ModernAccount modernAccount2 = (ModernAccount) this.L$3;
                    ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                    s1Var = (s1) this.L$1;
                    jVar = (com.yandex.passport.internal.ui.bouncer.model.j) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        modernAccount = modernAccount2;
                        s1Var3 = s1Var;
                        a = obj;
                        jVar2 = jVar;
                        try {
                            Object value = ((Result) a).getValue();
                            kotlin.b.b(value);
                            obj2 = new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(modernAccount, (ClientToken) value, jVar2.getLoginAction(), null, null, null, 56));
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            s1Var = s1Var3;
                            jVar = jVar2;
                            failure = new Result.Failure(e);
                            s1Var3 = s1Var;
                            jVar2 = jVar;
                            obj2 = failure;
                            a0 a0Var222 = this.this$0;
                            a2 = Result.a(obj2);
                            if (a2 != null) {
                            }
                            Throwable a322 = Result.a(obj2);
                            if (a322 != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            s1Var = s1Var3;
                            jVar = jVar2;
                            failure = new Result.Failure(th);
                            s1Var3 = s1Var;
                            jVar2 = jVar;
                            obj2 = failure;
                            a0 a0Var2222 = this.this$0;
                            a2 = Result.a(obj2);
                            if (a2 != null) {
                            }
                            Throwable a3222 = Result.a(obj2);
                            if (a3222 != null) {
                            }
                        }
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        s1Var3 = s1Var;
                        jVar2 = jVar;
                        obj2 = failure;
                        a0 a0Var22222 = this.this$0;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                        Throwable a32222 = Result.a(obj2);
                        if (a32222 != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        failure = new Result.Failure(th);
                        s1Var3 = s1Var;
                        jVar2 = jVar;
                        obj2 = failure;
                        a0 a0Var222222 = this.this$0;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                        Throwable a322222 = Result.a(obj2);
                        if (a322222 != null) {
                        }
                    }
                    a0 a0Var2222222 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                        try {
                            if (a2 instanceof GetClientTokenActor$ExecuteBouncerActionException) {
                                obj2 = ((GetClientTokenActor$ExecuteBouncerActionException) a2).getBouncerAction();
                            } else {
                                if (!(a2 instanceof InvalidTokenException) && !(a2 instanceof GetClientTokenActor$MemberNotFoundException)) {
                                    if (!(a2 instanceof IOException)) {
                                        throw a2;
                                    }
                                    com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var3.d;
                                    if (g1Var != null && (visualProperties = g1Var.a.getVisualProperties()) != null) {
                                        z = visualProperties.isNoReturnToHost();
                                    }
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.g(z);
                                }
                                com.yandex.passport.internal.ui.bouncer.model.g1 g1Var2 = s1Var3.d;
                                LoginProperties loginProperties2 = g1Var2 != null ? g1Var2.a : null;
                                if (loginProperties2 != null) {
                                    Uid a4 = jVar2.a();
                                    ModernAccount modernAccount3 = (ModernAccount) ref$ObjectRef.element;
                                    String displayLogin = modernAccount3 != null ? modernAccount3.getDisplayLogin() : null;
                                    a0Var2222222.getClass();
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.d0(LoginProperties.m307copyLjS6rdk$default(loginProperties2, null, false, null, null, null, null, com.yandex.passport.internal.util.p.A(a4), false, false, null, displayLogin, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147482559, null), null, (ModernAccount) ref$ObjectRef.element, null, true, true, null, null, 202);
                                } else {
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.o("GetClientTokenActor", "No login properties in current state", null);
                                }
                            }
                        } catch (TimeoutCancellationException e4) {
                            failure2 = new Result.Failure(e4);
                            obj2 = failure2;
                            Throwable a3222222 = Result.a(obj2);
                            if (a3222222 != null) {
                            }
                        } catch (CancellationException e5) {
                            throw e5;
                        } catch (Throwable th4) {
                            failure2 = new Result.Failure(th4);
                            obj2 = failure2;
                            Throwable a32222222 = Result.a(obj2);
                            if (a32222222 != null) {
                            }
                        }
                    }
                    Throwable a322222222 = Result.a(obj2);
                    return a322222222 != null ? obj2 : new com.yandex.passport.internal.ui.bouncer.model.o("GetClientTokenActor", "Failure", a322222222);
                }
                a0 a0Var3 = (a0) this.L$3;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
                s1Var2 = (s1) this.L$1;
                com.yandex.passport.internal.ui.bouncer.model.j jVar3 = (com.yandex.passport.internal.ui.bouncer.model.j) this.L$0;
                try {
                    kotlin.b.b(obj);
                    a0Var = a0Var3;
                    ref$ObjectRef = ref$ObjectRef3;
                    jVar = jVar3;
                    b = obj;
                } catch (TimeoutCancellationException e6) {
                    e = e6;
                    ref$ObjectRef = ref$ObjectRef3;
                    s1Var = s1Var2;
                    jVar = jVar3;
                    failure = new Result.Failure(e);
                    s1Var3 = s1Var;
                    jVar2 = jVar;
                    obj2 = failure;
                    a0 a0Var22222222 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    Throwable a3222222222 = Result.a(obj2);
                    if (a3222222222 != null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    ref$ObjectRef = ref$ObjectRef3;
                    s1Var = s1Var2;
                    jVar = jVar3;
                    failure = new Result.Failure(th);
                    s1Var3 = s1Var;
                    jVar2 = jVar;
                    obj2 = failure;
                    a0 a0Var222222222 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    Throwable a32222222222 = Result.a(obj2);
                    if (a32222222222 != null) {
                    }
                }
            }
            ?? r9 = (ModernAccount) b;
            ref$ObjectRef.element = r9;
            com.yandex.passport.internal.usecase.h0 h0Var = a0Var.a;
            com.yandex.passport.internal.usecase.g0 g0Var = new com.yandex.passport.internal.usecase.g0((ModernAccount) r9, (ClientCredentials) null, 6);
            this.L$0 = jVar;
            this.L$1 = s1Var2;
            this.L$2 = ref$ObjectRef;
            this.L$3 = r9;
            this.label = 2;
            a = h0Var.a(g0Var, this);
            if (a != coroutineSingletons) {
                s1Var3 = s1Var2;
                modernAccount = r9;
                jVar2 = jVar;
                Object value2 = ((Result) a).getValue();
                kotlin.b.b(value2);
                obj2 = new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(modernAccount, (ClientToken) value2, jVar2.getLoginAction(), null, null, null, 56));
                a0 a0Var2222222222 = this.this$0;
                a2 = Result.a(obj2);
                if (a2 != null) {
                }
                Throwable a322222222222 = Result.a(obj2);
                if (a322222222222 != null) {
                }
            }
            return coroutineSingletons;
        } catch (CancellationException e7) {
            throw e7;
        }
    }
}
