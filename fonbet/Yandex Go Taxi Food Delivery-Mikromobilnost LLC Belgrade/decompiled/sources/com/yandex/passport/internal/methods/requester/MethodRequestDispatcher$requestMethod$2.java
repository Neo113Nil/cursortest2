package com.yandex.passport.internal.methods.requester;

import android.os.Bundle;
import com.yandex.passport.internal.methods.FlagName;
import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.q0;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.z0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.i3y;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.mqn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lkotlin/Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.requester.MethodRequestDispatcher$requestMethod$2", f = "MethodRequestDispatcher.kt", l = {49, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MethodRequestDispatcher$requestMethod$2 extends SuspendLambda implements wls {
    final /* synthetic */ x2 $method;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodRequestDispatcher$requestMethod$2(f fVar, x2 x2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$method = x2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MethodRequestDispatcher$requestMethod$2(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MethodRequestDispatcher$requestMethod$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r8 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bundle bundle = null;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            x2 x2Var = this.$method;
            i3y i3yVar = f.g;
            fVar.getClass();
            if ((x2Var instanceof p1) || (x2Var instanceof q0)) {
                f fVar2 = this.this$0;
                Boolean bool = fVar2.f;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z0 z0Var = new z0(FlagName.PARTIAL_BINDING_SERVICE_IMPL);
                    mqn e = fVar2.e(MethodRef.GetBooleanFlag, z0Var.a());
                    if (e instanceof iqn) {
                        bundle = (Bundle) ((iqn) e).a;
                    } else {
                        if (!(e instanceof kqn)) {
                            w511.b();
                            return null;
                        }
                    }
                    if (bundle != null) {
                        Object d = z0Var.d(bundle);
                        Boolean bool2 = Boolean.FALSE;
                        if (d instanceof Result.Failure) {
                            d = bool2;
                        }
                        Boolean bool3 = (Boolean) d;
                        bool3.getClass();
                        fVar2.f = bool3;
                        z = bool3.booleanValue();
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    f fVar3 = this.this$0;
                    x2 x2Var2 = this.$method;
                    MethodRef methodRef = x2Var2.a;
                    Bundle a = x2Var2.a();
                    this.label = 1;
                    b = f.b(fVar3, methodRef, a, this);
                }
            }
            f fVar4 = this.this$0;
            x2 x2Var3 = this.$method;
            MethodRef methodRef2 = x2Var3.a;
            Bundle a2 = x2Var3.a();
            this.label = 2;
            b = f.a(fVar4, methodRef2, a2, this);
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        x2 x2Var4 = this.$method;
        if (!(b instanceof Result.Failure)) {
            try {
                Object d2 = x2Var4.d((Bundle) b);
                kotlin.b.b(d2);
                b = d2;
            } catch (Throwable th) {
                b = new Result.Failure(th);
            }
        }
        return new Result(b);
    }
}
