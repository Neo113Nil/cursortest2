package xsna;

import android.os.Parcelable;
import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.masterhost.MasterHost;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl$getMaster$1", f = "MasterSelectionComponentImpl.kt", l = {104, 109}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ik10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
    Object L$0;
    int label;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ik10(nk10 nk10Var, CallingAppIds callingAppIds, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, spj<? super ik10> spjVar) {
        super(2, spjVar);
        this.this$0 = nk10Var;
        this.$callingAppIds = callingAppIds;
        this.$onResult = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ik10(this.this$0, this.$callingAppIds, this.$onResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ik10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0035, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object c;
        String str2;
        AidlResult<AidlException> failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bk10 bk10Var = this.this$0.h;
            this.label = 1;
            obj = bk10Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$0;
                kotlin.a.a(obj);
                c = ((Result) obj).d();
                if (c instanceof Result.Failure) {
                    c = null;
                }
                AppInfo appInfo = (AppInfo) c;
                String packageName = appInfo != null ? appInfo.getPackageName() : null;
                this.this$0.o.send(new aj10(str2, packageName, false));
                str = packageName;
                if (str != null) {
                    failure = AidlResult.Companion.success(new MasterHost(str));
                } else {
                    this.this$0.g(false, false);
                    failure = AidlResult.Companion.failure(new IllegalStateException("get master has failed"));
                }
                this.$onResult.invoke(failure);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        str = (String) obj;
        Object m97invokeIoAF18A = this.this$0.g.m97invokeIoAF18A(this.$callingAppIds);
        if (m97invokeIoAF18A instanceof Result.Failure) {
            m97invokeIoAF18A = null;
        }
        AppInfo appInfo2 = (AppInfo) m97invokeIoAF18A;
        String packageName2 = appInfo2 != null ? appInfo2.getPackageName() : null;
        if (str != null) {
            this.this$0.o.send(new aj10(packageName2, str, true));
            if (str != null) {
            }
            this.$onResult.invoke(failure);
            return s3q0.a;
        }
        nj10 nj10Var = this.this$0.c;
        this.L$0 = packageName2;
        this.label = 2;
        c = nj10Var.c(null, this);
        if (c != coroutineSingletons) {
            str2 = packageName2;
            if (c instanceof Result.Failure) {
            }
            AppInfo appInfo3 = (AppInfo) c;
            if (appInfo3 != null) {
            }
            this.this$0.o.send(new aj10(str2, packageName, false));
            str = packageName;
            if (str != null) {
            }
            this.$onResult.invoke(failure);
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}
