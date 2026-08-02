package xsna;

import android.os.Parcelable;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl$notifyOldMaster$1", f = "MasterSelectionComponentImpl.kt", l = {147, 160}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class kk10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    final /* synthetic */ String $newMasterPackage;
    final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
    int label;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kk10(nk10 nk10Var, String str, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, CallingAppIds callingAppIds, spj<? super kk10> spjVar) {
        super(2, spjVar);
        this.this$0 = nk10Var;
        this.$newMasterPackage = str;
        this.$onResult = izsVar;
        this.$callingAppIds = callingAppIds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kk10(this.this$0, this.$newMasterPackage, this.$onResult, this.$callingAppIds, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kk10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r6 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        if (r6 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AidlResult<AidlException> failure;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            this.this$0.p.warn("unable to validate caller host", e);
            failure = AidlResult.Companion.failure(e);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            kpt kptVar = this.this$0.f;
            this.label = 1;
            a = kptVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                failure = (AidlResult) obj;
                this.$onResult.invoke(failure);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        nk10 nk10Var = this.this$0;
        CallingAppIds callingAppIds = this.$callingAppIds;
        if (!(a instanceof Result.Failure)) {
            try {
                Object m97invokeIoAF18A = nk10Var.g.m97invokeIoAF18A(callingAppIds);
                kotlin.a.a(m97invokeIoAF18A);
                a = Boolean.valueOf(((List) a).contains((AppInfo) m97invokeIoAF18A));
            } catch (Throwable th) {
                a = new Result.Failure(th);
            }
        }
        kotlin.a.a(a);
        if (!((Boolean) a).booleanValue()) {
            Logger.DefaultImpls.info$default(this.this$0.p, "Invalid caller. Host notified successfully", null, 2, null);
            failure = AidlResult.Companion.success(MasterHostIPCResult.HOST_NOTIFIED_ABOUT_NEW_MASTER);
            this.$onResult.invoke(failure);
            return s3q0.a;
        }
        nk10 nk10Var2 = this.this$0;
        String str = this.$newMasterPackage;
        this.label = 2;
        obj = nk10.f(nk10Var2, str, this);
    }
}
