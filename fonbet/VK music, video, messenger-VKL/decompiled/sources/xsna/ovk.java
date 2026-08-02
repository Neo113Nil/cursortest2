package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ovk extends SuspendLambda implements wzs<y2y0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $newData;
    final /* synthetic */ Ref$IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovk(Ref$IntRef ref$IntRef, DataStoreImpl<Object> dataStoreImpl, Object obj, boolean z, spj<? super ovk> spjVar) {
        super(2, spjVar);
        this.$newVersion = ref$IntRef;
        this.this$0 = dataStoreImpl;
        this.$newData = obj;
        this.$updateCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ovk ovkVar = new ovk(this.$newVersion, this.this$0, this.$newData, this.$updateCache, spjVar);
        ovkVar.L$0 = obj;
        return ovkVar;
    }

    @Override // xsna.wzs
    public final Object invoke(y2y0<Object> y2y0Var, spj<? super s3q0> spjVar) {
        return ((ovk) create(y2y0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r3.d(r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$IntRef ref$IntRef;
        y2y0 y2y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            y2y0 y2y0Var2 = (y2y0) this.L$0;
            ref$IntRef = this.$newVersion;
            uax g = this.this$0.g();
            this.L$0 = y2y0Var2;
            this.L$1 = ref$IntRef;
            this.label = 1;
            Integer a = g.a();
            if (a != coroutineSingletons) {
                y2y0Var = y2y0Var2;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$updateCache) {
                tu tuVar = this.this$0.h;
                Object obj2 = this.$newData;
                tuVar.b(new rtk(obj2, obj2 != null ? obj2.hashCode() : 0, this.$newVersion.element));
            }
            return s3q0.a;
        }
        ref$IntRef = (Ref$IntRef) this.L$1;
        y2y0Var = (y2y0) this.L$0;
        kotlin.a.a(obj);
        ref$IntRef.element = ((Number) obj).intValue();
        Object obj3 = this.$newData;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
