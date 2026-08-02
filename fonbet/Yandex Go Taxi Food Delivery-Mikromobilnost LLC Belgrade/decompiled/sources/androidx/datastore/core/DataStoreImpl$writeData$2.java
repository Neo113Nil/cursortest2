package androidx.datastore.core;

import defpackage.f8w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qng;
import defpackage.wls;
import defpackage.wpg;
import defpackage.z2r;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lz2r;", "Lzy11;", "<anonymous>", "(Lz2r;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {372, 373}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$writeData$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $newData;
    final /* synthetic */ Ref$IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref$IntRef ref$IntRef, f fVar, Object obj, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$newVersion = ref$IntRef;
        this.this$0 = fVar;
        this.$newData = obj;
        this.$updateCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, continuation);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$writeData$2) create((z2r) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$IntRef ref$IntRef;
        z2r z2rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            z2r z2rVar2 = (z2r) this.L$0;
            ref$IntRef = this.$newVersion;
            f8w h = this.this$0.h();
            this.L$0 = z2rVar2;
            this.L$1 = ref$IntRef;
            this.label = 1;
            Object e = h.e(this);
            if (e != coroutineSingletons) {
                z2rVar = z2rVar2;
                obj = e;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (this.$updateCache) {
                wpg wpgVar = this.this$0.h;
                Object obj2 = this.$newData;
                wpgVar.b(new qng(obj2, obj2 != null ? obj2.hashCode() : 0, this.$newVersion.element));
            }
            return zy11Var;
        }
        ref$IntRef = (Ref$IntRef) this.L$1;
        z2rVar = (z2r) this.L$0;
        kotlin.b.b(obj);
        ref$IntRef.element = ((Number) obj).intValue();
        Object obj3 = this.$newData;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (z2rVar.c.get()) {
            ny61.r("This scope has already been closed.");
            return null;
        }
        Object a = h.a(z2rVar.a, new FileWriteScope$writeData$2(z2rVar, obj3, null), this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
    }
}
