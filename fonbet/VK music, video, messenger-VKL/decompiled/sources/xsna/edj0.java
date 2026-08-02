package xsna;

import androidx.compose.material3.SheetValue;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: SheetDefaults.kt */
@b6l(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class edj0 extends SuspendLambda implements zzs<dz1, tgo<SheetValue>, SheetValue, spj<? super s3q0>, Object> {
    final /* synthetic */ phr<Float> $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ gdj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edj0(gdj0 gdj0Var, float f, phr<Float> phrVar, spj<? super edj0> spjVar) {
        super(4, spjVar);
        this.this$0 = gdj0Var;
        this.$velocity = f;
        this.$animationSpec = phrVar;
    }

    @Override // xsna.zzs
    public final Object invoke(dz1 dz1Var, tgo<SheetValue> tgoVar, SheetValue sheetValue, spj<? super s3q0> spjVar) {
        edj0 edj0Var = new edj0(this.this$0, this.$velocity, this.$animationSpec, spjVar);
        edj0Var.L$0 = dz1Var;
        edj0Var.L$1 = tgoVar;
        edj0Var.L$2 = sheetValue;
        return edj0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dz1 dz1Var = (dz1) this.L$0;
            float c = ((tgo) this.L$1).c((SheetValue) this.L$2);
            if (!Float.isNaN(c)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float floatValue = Float.isNaN(((vak0) this.this$0.d.j).getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((vak0) this.this$0.d.j).getFloatValue();
                ref$FloatRef.element = floatValue;
                float f = this.$velocity;
                phr<Float> phrVar = this.$animationSpec;
                y61 y61Var = new y61(11, dz1Var, ref$FloatRef);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (nkn0.a(floatValue, c, f, phrVar, y61Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
