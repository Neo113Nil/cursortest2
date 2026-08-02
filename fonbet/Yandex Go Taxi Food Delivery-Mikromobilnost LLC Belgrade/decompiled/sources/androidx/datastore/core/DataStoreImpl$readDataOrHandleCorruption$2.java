package androidx.datastore.core;

import defpackage.f8w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lqng;", "<anonymous>", "(Z)Lqng;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$readDataOrHandleCorruption$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $preLockVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$2(f fVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$preLockVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.this$0, this.$preLockVersion, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataOrHandleCorruption$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
    
        if (r6 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            z = this.Z$0;
            f fVar = this.this$0;
            this.Z$0 = z;
            this.label = 1;
            obj = fVar.i(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                i = ((Number) obj).intValue();
                return new qng(obj2, obj2 != null ? obj2.hashCode() : 0, i);
            }
            z = this.Z$0;
            kotlin.b.b(obj);
        }
        if (!z) {
            Object obj3 = obj;
            i = this.$preLockVersion;
            obj2 = obj3;
            return new qng(obj2, obj2 != null ? obj2.hashCode() : 0, i);
        }
        f8w h = this.this$0.h();
        this.L$0 = obj;
        this.label = 2;
        Object b = h.b(this);
        if (b != coroutineSingletons) {
            Object obj4 = obj;
            obj = b;
            obj2 = obj4;
            i = ((Number) obj).intValue();
            return new qng(obj2, obj2 != null ? obj2.hashCode() : 0, i);
        }
        return coroutineSingletons;
    }
}
