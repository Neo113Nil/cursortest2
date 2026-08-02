package androidx.collection;

import defpackage.az40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zy40;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lsrq0;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1493}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ az40 this$0;
    final /* synthetic */ e this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(az40 az40Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = az40Var;
        this.this$1 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0064 -> B:5:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long[] jArr;
        int i;
        srq0 srq0Var;
        e eVar;
        az40 az40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            srq0 srq0Var2 = (srq0) this.L$0;
            az40 az40Var2 = this.this$0;
            zy40 zy40Var = az40Var2.b;
            e eVar2 = this.this$1;
            jArr = zy40Var.c;
            i = zy40Var.e;
            srq0Var = srq0Var2;
            eVar = eVar2;
            az40Var = az40Var2;
            if (i != Integer.MAX_VALUE) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            long[] jArr2 = (long[]) this.L$3;
            az40Var = (az40) this.L$2;
            e eVar3 = (e) this.L$1;
            srq0Var = (srq0) this.L$0;
            kotlin.b.b(obj);
            eVar = eVar3;
            jArr = jArr2;
            i = i3;
            if (i != Integer.MAX_VALUE) {
                i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                eVar.a = i;
                Object obj2 = az40Var.b.b[i];
                this.L$0 = srq0Var;
                this.L$1 = eVar;
                this.L$2 = az40Var;
                this.L$3 = jArr;
                this.I$0 = i3;
                this.label = 1;
                if (srq0Var.a(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i3;
                if (i != Integer.MAX_VALUE) {
                    return zy11.a;
                }
            }
        }
    }
}
