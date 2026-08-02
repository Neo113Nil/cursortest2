package xsna;

import androidx.datastore.core.DataStoreImpl;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class jvk extends SuspendLambda implements wzs<Boolean, spj<? super Pair<? extends gtk0<Object>, ? extends Boolean>>, Object> {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvk(DataStoreImpl<Object> dataStoreImpl, int i, spj<? super jvk> spjVar) {
        super(2, spjVar);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jvk jvkVar = new jvk(this.this$0, this.$cachedVersion, spjVar);
        jvkVar.Z$0 = ((Boolean) obj).booleanValue();
        return jvkVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Boolean bool, spj<? super Pair<? extends gtk0<Object>, ? extends Boolean>> spjVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((jvk) create(bool2, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i;
        boolean z;
        gtk0 gtk0Var;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z3 = this.label;
        try {
        } catch (Throwable th2) {
            if (z3 != 0) {
                uax g = this.this$0.g();
                this.L$0 = th2;
                this.Z$0 = z3;
                this.label = 2;
                Integer version = g.getVersion();
                if (version != coroutineSingletons) {
                    z = z3;
                    th = th2;
                    obj = version;
                }
            } else {
                boolean z4 = z3;
                th = th2;
                i = this.$cachedVersion;
                z = z4;
            }
        }
        if (z3 == 0) {
            kotlin.a.a(obj);
            boolean z5 = this.Z$0;
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            this.Z$0 = z5;
            this.label = 1;
            obj = DataStoreImpl.f(dataStoreImpl, z5, this);
            z3 = z5;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (z3 != 1) {
                if (z3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                th = (Throwable) this.L$0;
                kotlin.a.a(obj);
                i = ((Number) obj).intValue();
                f7f0 f7f0Var = new f7f0(th, i);
                z2 = z;
                gtk0Var = f7f0Var;
                return new Pair(gtk0Var, Boolean.valueOf(z2));
            }
            boolean z6 = this.Z$0;
            kotlin.a.a(obj);
            z3 = z6;
        }
        gtk0Var = (gtk0) obj;
        z2 = z3;
        return new Pair(gtk0Var, Boolean.valueOf(z2));
    }
}
