package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {727, 730, 738}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class hgo extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onDragCancel;
    final /* synthetic */ gzs<s3q0> $onDragEnd;
    final /* synthetic */ izs<ov70, s3q0> $onDragStart;
    final /* synthetic */ wzs<xlb0, Float, s3q0> $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgo(spj spjVar, gzs gzsVar, gzs gzsVar2, izs izsVar, wzs wzsVar) {
        super(2, spjVar);
        this.$onDragStart = izsVar;
        this.$onHorizontalDrag = wzsVar;
        this.$onDragEnd = gzsVar;
        this.$onDragCancel = gzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hgo hgoVar = new hgo(spjVar, this.$onDragEnd, this.$onDragCancel, this.$onDragStart, this.$onHorizontalDrag);
        hgoVar.L$0 = obj;
        return hgoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((hgo) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        Ref$FloatRef ref$FloatRef;
        hgo hgoVar;
        eu5 eu5Var2;
        xlb0 xlb0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            this.L$0 = eu5Var;
            this.label = 1;
            obj = z2o0.b(eu5Var, null, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    hgoVar = this;
                    if (((Boolean) obj).booleanValue()) {
                        hgoVar.$onDragEnd.invoke();
                    } else {
                        hgoVar.$onDragCancel.invoke();
                    }
                    return s3q0.a;
                }
                ref$FloatRef = (Ref$FloatRef) this.L$1;
                eu5Var2 = (eu5) this.L$0;
                kotlin.a.a(obj);
                hgoVar = this;
                xlb0Var = (xlb0) obj;
                if (xlb0Var != null) {
                    hgoVar.$onDragStart.invoke(new ov70(xlb0Var.c));
                    hgoVar.$onHorizontalDrag.invoke(xlb0Var, new Float(ref$FloatRef.element));
                    long j = xlb0Var.a;
                    i4e i4eVar = new i4e(hgoVar.$onHorizontalDrag, 25);
                    hgoVar.L$0 = null;
                    hgoVar.L$1 = null;
                    hgoVar.label = 3;
                    obj = lgo.i(eu5Var2, j, i4eVar, this);
                }
                return s3q0.a;
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
        }
        eu5 eu5Var3 = eu5Var;
        xlb0 xlb0Var2 = (xlb0) obj;
        ref$FloatRef = new Ref$FloatRef();
        long j2 = xlb0Var2.a;
        int i2 = xlb0Var2.i;
        u05 u05Var = new u05(ref$FloatRef, 3);
        this.L$0 = eu5Var3;
        this.L$1 = ref$FloatRef;
        this.label = 2;
        hgoVar = this;
        obj = lgo.c(eu5Var3, j2, i2, u05Var, hgoVar);
        if (obj != coroutineSingletons) {
            eu5Var2 = eu5Var3;
            xlb0Var = (xlb0) obj;
            if (xlb0Var != null) {
            }
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}
