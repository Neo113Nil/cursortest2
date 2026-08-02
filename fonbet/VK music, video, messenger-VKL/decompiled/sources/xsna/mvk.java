package xsna;

import androidx.datastore.core.DataStoreImpl;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mvk extends SuspendLambda implements wzs<yvj, spj<? super gtk0<Object>>, Object> {
    final /* synthetic */ boolean $requireLock;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvk(DataStoreImpl<Object> dataStoreImpl, boolean z, spj<? super mvk> spjVar) {
        super(2, spjVar);
        this.this$0 = dataStoreImpl;
        this.$requireLock = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mvk(this.this$0, this.$requireLock, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super gtk0<Object>> spjVar) {
        return ((mvk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r5 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r5.h(r4) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.this$0.h.a() instanceof qgr) {
                    return this.this$0.h.a();
                }
                DataStoreImpl<Object> dataStoreImpl = this.this$0;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return (gtk0) obj;
                }
                kotlin.a.a(obj);
            }
            DataStoreImpl<Object> dataStoreImpl2 = this.this$0;
            boolean z = this.$requireLock;
            this.label = 2;
            obj = DataStoreImpl.e(dataStoreImpl2, z, this);
        } catch (Throwable th) {
            return new f7f0(th, -1);
        }
    }
}
