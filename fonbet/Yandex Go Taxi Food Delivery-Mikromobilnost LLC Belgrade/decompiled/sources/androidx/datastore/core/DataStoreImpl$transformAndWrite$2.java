package androidx.datastore.core;

import defpackage.fse;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qng;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {350, 351, 357}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements tls {
    final /* synthetic */ fse $callerContext;
    final /* synthetic */ wls $transform;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2(f fVar, fse fseVar, wls wlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$callerContext = fseVar;
        this.$transform = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$transformAndWrite$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        if (r9 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qng qngVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            this.label = 1;
            obj = f.g(fVar, true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.L$0;
                    kotlin.b.b(obj);
                    return obj2;
                }
                qngVar = (qng) this.L$0;
                kotlin.b.b(obj);
                Object obj3 = qngVar.b;
                if ((obj3 != null ? obj3.hashCode() : 0) != qngVar.c) {
                    ny61.r("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!jl40.l(qngVar.b, obj)) {
                    f fVar2 = this.this$0;
                    this.L$0 = obj;
                    this.label = 3;
                    if (fVar2.j(obj, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
            kotlin.b.b(obj);
        }
        qngVar = (qng) obj;
        fse fseVar = this.$callerContext;
        DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, qngVar, null);
        this.L$0 = qngVar;
        this.label = 2;
        obj = tje.k0(fseVar, dataStoreImpl$transformAndWrite$2$newData$1, this);
    }
}
