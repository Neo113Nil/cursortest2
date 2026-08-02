package xsna;

import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NonTouchScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class k670 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ qta<Object> $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: NonTouchScrollingLogic.kt */
    @b6l(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1", f = "NonTouchScrollingLogic.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvjVar = (yvj) this.L$0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yvjVar = (yvj) this.L$0;
                kotlin.a.a(obj);
            }
            while (iyx.h(yvjVar.getCoroutineContext())) {
                p7x p7xVar = new p7x(12);
                this.L$0 = yvjVar;
                this.label = 1;
                if (i830.a(getContext()).k(p7xVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k670(qta<Object> qtaVar, spj<? super k670> spjVar) {
        super(2, spjVar);
        this.$this_busyReceive = qtaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        k670 k670Var = new k670(this.$this_busyReceive, spjVar);
        k670Var.L$0 = obj;
        return k670Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((k670) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eyx eyxVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yok0 h = myc0.h((yvj) this.L$0, null, null, new a(2, null), 3);
            try {
                qta<Object> qtaVar = this.$this_busyReceive;
                this.L$0 = h;
                this.label = 1;
                Object a2 = qtaVar.a(this);
                if (a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eyxVar = h;
                obj = a2;
            } catch (Throwable th2) {
                eyxVar = h;
                th = th2;
                eyxVar.b(null);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eyxVar = (eyx) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th3) {
                th = th3;
                eyxVar.b(null);
                throw th;
            }
        }
        eyxVar.b(null);
        return obj;
    }
}
