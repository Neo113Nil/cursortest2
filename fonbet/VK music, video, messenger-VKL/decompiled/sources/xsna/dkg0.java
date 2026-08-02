package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.z2o0;

/* compiled from: RightClickGestures.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dkg0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<ov70, s3q0> $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dkg0(izs<? super ov70, s3q0> izsVar, spj<? super dkg0> spjVar) {
        super(2, spjVar);
        this.$onDown = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dkg0 dkg0Var = new dkg0(this.$onDown, spjVar);
        dkg0Var.L$0 = obj;
        return dkg0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((dkg0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            this.L$0 = eu5Var;
            this.label = 1;
            obj = ahn.d(eu5Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                xlb0 xlb0Var = (xlb0) obj;
                if (xlb0Var != null) {
                    xlb0Var.a();
                }
                return s3q0.a;
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
        }
        xlb0 xlb0Var2 = (xlb0) obj;
        xlb0Var2.a();
        this.$onDown.invoke(new ov70(xlb0Var2.c));
        this.L$0 = null;
        this.label = 2;
        z2o0.a aVar = z2o0.a;
        obj = z2o0.j(eu5Var, PointerEventPass.Main, this);
    }
}
