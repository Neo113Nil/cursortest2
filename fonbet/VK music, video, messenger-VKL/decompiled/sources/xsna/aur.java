package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Zip.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class aur extends SuspendLambda implements yzs<lsr<Object>, Object[], spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<Object, Object, spj<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aur(yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, spj<? super aur> spjVar) {
        super(3, spjVar);
        this.$transform = yzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<Object> lsrVar, Object[] objArr, spj<? super s3q0> spjVar) {
        aur aurVar = new aur(this.$transform, spjVar);
        aurVar.L$0 = lsrVar;
        aurVar.L$1 = objArr;
        return aurVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsrVar = (lsr) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            yzs<Object, Object, spj<Object>, Object> yzsVar = this.$transform;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.L$0 = lsrVar;
            this.label = 1;
            obj = yzsVar.invoke(obj2, obj3, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            lsrVar = (lsr) this.L$0;
            kotlin.a.a(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
