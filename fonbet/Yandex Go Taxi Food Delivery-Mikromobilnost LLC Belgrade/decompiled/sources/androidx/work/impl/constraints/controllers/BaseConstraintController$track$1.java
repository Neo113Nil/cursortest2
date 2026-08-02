package androidx.work.impl.constraints.controllers;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e8e;
import defpackage.f8e;
import defpackage.hgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ou;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import defpackage.zy4;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Ls8e;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseConstraintController$track$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConstraintController$track$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseConstraintController$track$1 baseConstraintController$track$1 = new BaseConstraintController$track$1(this.this$0, continuation);
        baseConstraintController$track$1.L$0 = obj;
        return baseConstraintController$track$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseConstraintController$track$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            a aVar = this.this$0;
            zy4 zy4Var = new zy4(aVar, y6f0Var);
            e8e e8eVar = aVar.a;
            synchronized (e8eVar.c) {
                try {
                    if (e8eVar.d.add(zy4Var)) {
                        if (e8eVar.d.size() == 1) {
                            e8eVar.e = e8eVar.a();
                            hgz g = hgz.g();
                            int i2 = f8e.a;
                            Objects.toString(e8eVar.e);
                            g.getClass();
                            e8eVar.c();
                        }
                        zy4Var.a(e8eVar.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ou ouVar = new ou(5, this.this$0, zy4Var);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, ouVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
