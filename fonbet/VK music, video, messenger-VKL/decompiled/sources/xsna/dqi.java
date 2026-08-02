package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: PausableComposition.kt */
@b6l(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dqi extends RestrictedSuspendLambda implements wzs<ali0<? super String>, spj<? super s3q0>, Object> {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eqi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqi(eqi eqiVar, spj<? super dqi> spjVar) {
        super(2, spjVar);
        this.this$0 = eqiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dqi dqiVar = new dqi(this.this$0, spjVar);
        dqiVar.L$0 = obj;
        return dqiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super String> ali0Var, spj<? super s3q0> spjVar) {
        return ((dqi) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0041 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ali0 ali0Var;
        int i2;
        int i3;
        int i4;
        a9x a9xVar;
        a9x a9xVar2;
        String str;
        rp70 rp70Var;
        a9x a9xVar3;
        a9x a9xVar4;
        a9x a9xVar5;
        a9x a9xVar6;
        a9x a9xVar7;
        a9x a9xVar8;
        int i5;
        rp70 rp70Var2;
        int i6;
        a9x a9xVar9;
        rp70 rp70Var3;
        rp70 rp70Var4;
        rp70 rp70Var5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        if (i7 == 0) {
            kotlin.a.a(obj);
            i = 0;
            ali0Var = (ali0) this.L$0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = this.I$2;
            int i9 = this.I$1;
            int i10 = this.I$0;
            ali0Var = (ali0) this.L$0;
            kotlin.a.a(obj);
            i2 = i9;
            i3 = i8;
            i = i10;
        }
        while (i < Math.min(i4 + 10, a9xVar.b)) {
            a9xVar2 = this.this$0.operations;
            int i11 = i + 1;
            int a = a9xVar2.a(i);
            switch (a) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    rp70Var = this.this$0.instances;
                    str = cqi.c(rp70Var.d(i2), "down ");
                    i2++;
                    break;
                case 2:
                    a9xVar3 = this.this$0.operations;
                    int a2 = a9xVar3.a(i11);
                    a9xVar4 = this.this$0.operations;
                    str = "remove " + a2 + ' ' + a9xVar4.a(i + 2);
                    i11 = i + 3;
                    break;
                case 3:
                    a9xVar5 = this.this$0.operations;
                    int a3 = a9xVar5.a(i11);
                    a9xVar6 = this.this$0.operations;
                    int a4 = a9xVar6.a(i + 2);
                    a9xVar7 = this.this$0.operations;
                    str = "move " + a3 + ' ' + a4 + ' ' + a9xVar7.a(i + 3);
                    i11 = i + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    a9xVar8 = this.this$0.operations;
                    i5 = i + 2;
                    int a5 = a9xVar8.a(i11);
                    rp70Var2 = this.this$0.instances;
                    i6 = i2 + 1;
                    str = "insertBottomUp " + a5 + ' ' + rp70Var2.d(i2);
                    i11 = i5;
                    i2 = i6;
                    break;
                case 6:
                    a9xVar9 = this.this$0.operations;
                    i5 = i + 2;
                    int a6 = a9xVar9.a(i11);
                    rp70Var3 = this.this$0.instances;
                    i6 = i2 + 1;
                    str = "insertTopDown " + a6 + ' ' + rp70Var3.d(i2);
                    i11 = i5;
                    i2 = i6;
                    break;
                case 7:
                    rp70Var4 = this.this$0.instances;
                    Object d = rp70Var4.d(i2);
                    ttp0.d(2, d);
                    i2 += 2;
                    str = "apply " + ((wzs) d);
                    break;
                case 8:
                    StringBuilder sb = new StringBuilder("reuse ");
                    rp70Var5 = this.this$0.reused;
                    sb.append(rp70Var5.d(i3));
                    str = sb.toString();
                    i3++;
                    break;
                case 9:
                    str = "recompose pending";
                    break;
                default:
                    str = lhg.a(a, "unknown op: ");
                    break;
            }
            String str2 = i + ": " + str;
            this.L$0 = ali0Var;
            this.I$0 = i11;
            this.I$1 = i2;
            this.I$2 = i3;
            this.label = 1;
            if (ali0Var.a(str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i11;
        }
        return s3q0.a;
    }
}
