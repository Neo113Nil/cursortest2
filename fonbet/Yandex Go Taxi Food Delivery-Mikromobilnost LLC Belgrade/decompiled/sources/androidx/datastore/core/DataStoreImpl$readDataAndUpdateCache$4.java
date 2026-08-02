package androidx.datastore.core;

import defpackage.f3u0;
import defpackage.f8w;
import defpackage.mvg;
import defpackage.nbi0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lf3u0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {324, 328}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements wls {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(f fVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cachedVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.this$0, this.$cachedVersion, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Throwable th;
        boolean z;
        f3u0 f3u0Var;
        boolean z2;
        boolean z3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z4 = this.label;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                f8w h = this.this$0.h();
                this.L$0 = th2;
                this.Z$0 = z4;
                this.label = 2;
                Object b = h.b(this);
                if (b != coroutineSingletons) {
                    obj = b;
                    th = th2;
                    z = z4 ? 1 : 0;
                }
            } else {
                i = this.$cachedVersion;
                th = th2;
                z3 = z4;
            }
        }
        if (z4 == 0) {
            kotlin.b.b(obj);
            boolean z5 = this.Z$0;
            f fVar = this.this$0;
            this.Z$0 = z5;
            this.label = 1;
            obj = f.g(fVar, z5, this);
            z4 = z5;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                th = (Throwable) this.L$0;
                kotlin.b.b(obj);
                i = ((Number) obj).intValue();
                z3 = z;
                f3u0Var = new nbi0(i, th);
                z2 = z3;
                return new Pair(f3u0Var, Boolean.valueOf(z2));
            }
            boolean z6 = this.Z$0;
            kotlin.b.b(obj);
            z4 = z6;
        }
        f3u0Var = (f3u0) obj;
        z2 = z4;
        return new Pair(f3u0Var, Boolean.valueOf(z2));
    }
}
