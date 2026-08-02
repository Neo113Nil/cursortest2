package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReorderableLazyListState.kt */
@b6l(c = "com.vk.core.compose.reorder.ReorderableLazyListStateKt$rememberReorderableLazyListState$2$1", f = "ReorderableLazyListState.kt", l = {47, 48}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class b0g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ zzf0 $state;
    float F$0;
    float F$1;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0g0(xvy xvyVar, boolean z, zzf0 zzf0Var, spj<? super b0g0> spjVar) {
        super(2, spjVar);
        this.$listState = xvyVar;
        this.$isRtl = z;
        this.$state = zzf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b0g0(this.$listState, this.$isRtl, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b0g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (xsna.fdi.K(r8.$listState, r9 * r1, r8) != r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r8.$listState.j().getOrientation() != androidx.compose.foundation.gestures.Orientation.Vertical) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0079 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        float f;
        int i;
        ?? r9;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            boolean i3 = this.$listState.j().i();
            boolean z2 = !i3 ? 1 : 0;
            if (this.$isRtl) {
                z = i3;
            }
            z = z2;
            if (z) {
                f = 1.0f;
                r9 = z;
            } else {
                f = -1.0f;
                r9 = z;
            }
            nm8 nm8Var = this.$state.i;
            this.I$0 = r9;
            this.F$0 = f;
            this.label = 1;
            a = nm8Var.a(this);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = this.F$0;
            i = this.I$0;
            kotlin.a.a(obj);
            r9 = i;
            nm8 nm8Var2 = this.$state.i;
            this.I$0 = r9;
            this.F$0 = f;
            this.label = 1;
            a = nm8Var2.a(this);
            if (a != coroutineSingletons) {
                i = r9;
                obj = a;
                float floatValue = ((Number) obj).floatValue();
                this.I$0 = i;
                this.F$0 = f;
                this.F$1 = floatValue;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        f = this.F$0;
        i = this.I$0;
        kotlin.a.a(obj);
        float floatValue2 = ((Number) obj).floatValue();
        this.I$0 = i;
        this.F$0 = f;
        this.F$1 = floatValue2;
        this.label = 2;
    }
}
