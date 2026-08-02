package xsna;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: DragGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {384, 385, 390}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ggo extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<xlb0, ov70, s3q0> $onDrag;
    final /* synthetic */ gzs<s3q0> $onDragCancel;
    final /* synthetic */ gzs<s3q0> $onDragEnd;
    final /* synthetic */ izs<ov70, s3q0> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggo(spj spjVar, gzs gzsVar, gzs gzsVar2, izs izsVar, wzs wzsVar) {
        super(2, spjVar);
        this.$onDragStart = izsVar;
        this.$onDragEnd = gzsVar;
        this.$onDragCancel = gzsVar2;
        this.$onDrag = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ggo ggoVar = new ggo(spjVar, this.$onDragEnd, this.$onDragCancel, this.$onDragStart, this.$onDrag);
        ggoVar.L$0 = obj;
        return ggoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((ggo) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x007c, B:11:0x0084, B:13:0x0094, B:15:0x00a0, B:17:0x00a3, B:20:0x00a6, B:24:0x00ac, B:28:0x0026, B:29:0x0055, B:31:0x0059, B:36:0x002e, B:37:0x0046, B:41:0x003a), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x007c, B:11:0x0084, B:13:0x0094, B:15:0x00a0, B:17:0x00a3, B:20:0x00a6, B:24:0x00ac, B:28:0x0026, B:29:0x0055, B:31:0x0059, B:36:0x002e, B:37:0x0046, B:41:0x003a), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:9:0x007c, B:11:0x0084, B:13:0x0094, B:15:0x00a0, B:17:0x00a3, B:20:0x00a6, B:24:0x00ac, B:28:0x0026, B:29:0x0055, B:31:0x0059, B:36:0x002e, B:37:0x0046, B:41:0x003a), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        xlb0 xlb0Var;
        eu5 eu5Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
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
                    if (i == 2) {
                        eu5Var = (eu5) this.L$0;
                        kotlin.a.a(obj);
                        xlb0Var = (xlb0) obj;
                        if (xlb0Var != null) {
                            this.$onDragStart.invoke(new ov70(xlb0Var.c));
                            long j = xlb0Var.a;
                            n6f n6fVar = new n6f(this.$onDrag, 16);
                            this.L$0 = eu5Var;
                            this.label = 3;
                            obj = lgo.h(eu5Var, j, n6fVar, this);
                            if (obj != coroutineSingletons) {
                                eu5Var2 = eu5Var;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return s3q0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eu5Var2 = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    if (((Boolean) obj).booleanValue()) {
                        this.$onDragCancel.invoke();
                    } else {
                        List<xlb0> list = eu5Var2.z0().a;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            xlb0 xlb0Var2 = list.get(i2);
                            if (fdi.n(xlb0Var2)) {
                                xlb0Var2.a();
                            }
                        }
                        this.$onDragEnd.invoke();
                    }
                    return s3q0.a;
                }
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
            }
            long j2 = ((xlb0) obj).a;
            this.L$0 = eu5Var;
            this.label = 2;
            obj = lgo.d(eu5Var, j2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            xlb0Var = (xlb0) obj;
            if (xlb0Var != null) {
            }
            return s3q0.a;
        } catch (CancellationException e) {
            this.$onDragCancel.invoke();
            throw e;
        }
    }
}
