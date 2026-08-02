package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class kvk extends SuspendLambda implements wzs<Boolean, spj<? super rtk<Object>>, Object> {
    final /* synthetic */ int $preLockVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvk(DataStoreImpl<Object> dataStoreImpl, int i, spj<? super kvk> spjVar) {
        super(2, spjVar);
        this.this$0 = dataStoreImpl;
        this.$preLockVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        kvk kvkVar = new kvk(this.this$0, this.$preLockVersion, spjVar);
        kvkVar.Z$0 = ((Boolean) obj).booleanValue();
        return kvkVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Boolean bool, spj<? super rtk<Object>> spjVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((kvk) create(bool2, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
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
        Object obj2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            z = this.Z$0;
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            this.Z$0 = z;
            this.label = 1;
            obj = dataStoreImpl.i(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                kotlin.a.a(obj);
                i = ((Number) obj).intValue();
                return new rtk(obj2, obj2 != null ? obj2.hashCode() : 0, i);
            }
            z = this.Z$0;
            kotlin.a.a(obj);
        }
        if (!z) {
            obj2 = obj;
            i = this.$preLockVersion;
            return new rtk(obj2, obj2 != null ? obj2.hashCode() : 0, i);
        }
        uax g = this.this$0.g();
        this.L$0 = obj;
        this.label = 2;
        Integer version = g.getVersion();
        if (version != coroutineSingletons) {
            obj2 = obj;
            obj = version;
            i = ((Number) obj).intValue();
            return new rtk(obj2, obj2 != null ? obj2.hashCode() : 0, i);
        }
        return coroutineSingletons;
    }
}
