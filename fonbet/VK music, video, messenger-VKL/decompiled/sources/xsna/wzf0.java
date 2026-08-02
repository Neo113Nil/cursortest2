package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: Reorderable.kt */
@b6l(c = "com.vk.core.compose.reorder.ReorderableKt$detectDrag$4", f = "Reorderable.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class wzf0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ long $down;
    final /* synthetic */ wzs<xlb0, ov70, s3q0> $onDrag;
    final /* synthetic */ gzs<s3q0> $onDragCancel;
    final /* synthetic */ gzs<s3q0> $onDragEnd;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wzf0(long j, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, wzs<? super xlb0, ? super ov70, s3q0> wzsVar, spj<? super wzf0> spjVar) {
        super(2, spjVar);
        this.$down = j;
        this.$onDragEnd = gzsVar;
        this.$onDragCancel = gzsVar2;
        this.$onDrag = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        wzf0 wzf0Var = new wzf0(this.$down, this.$onDragEnd, this.$onDragCancel, this.$onDrag, spjVar);
        wzf0Var.L$0 = obj;
        return wzf0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((wzf0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var = (eu5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$down;
            w110 w110Var = new w110(this.$onDrag, 21);
            this.L$0 = eu5Var;
            this.label = 1;
            obj = lgo.h(eu5Var, j, w110Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            for (xlb0 xlb0Var : eu5Var.z0().a) {
                if (fdi.n(xlb0Var)) {
                    xlb0Var.a();
                }
            }
            this.$onDragEnd.invoke();
        } else {
            this.$onDragCancel.invoke();
        }
        return s3q0.a;
    }
}
