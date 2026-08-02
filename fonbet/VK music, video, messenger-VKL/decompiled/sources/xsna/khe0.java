package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PushDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$startDeliver$1", f = "PushDeliveryComponent.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class khe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ nhe0 this$0;

    /* compiled from: PushDeliveryComponent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ nhe0 b;

        public a(nhe0 nhe0Var) {
            this.b = nhe0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            AppInfo appInfo = (AppInfo) obj;
            nhe0 nhe0Var = this.b;
            Logger.DefaultImpls.info$default(nhe0Var.o, "Start deliver pushes to " + appInfo.getPackageName(), null, 2, null);
            hpj hpjVar = nhe0Var.b;
            nhe0Var.p.put(appInfo.getPackageName(), myc0.h(hpjVar, null, null, new mhe0(nhe0Var, appInfo, null), 3));
            Logger.DefaultImpls.info$default(nhe0Var.o, "Start deliver invalidate to " + appInfo.getPackageName(), null, 2, null);
            nhe0Var.q.put(appInfo.getPackageName(), myc0.h(hpjVar, null, null, new lhe0(nhe0Var, appInfo, null), 3));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khe0(nhe0 nhe0Var, spj<? super khe0> spjVar) {
        super(2, spjVar);
        this.this$0 = nhe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new khe0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((khe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr ksrVar = (ksr) this.this$0.e.getValue();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (ksrVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
