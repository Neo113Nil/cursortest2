package xsna;

import android.os.Bundle;
import com.vk.push.common.Logger;
import com.vk.push.core.work.WorkModel;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$notifyOldMasterWithWorkerSetup$2", f = "MasterHostElectionsInteractor.kt", l = {Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ij10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $newMasterPackage;
    final /* synthetic */ String $oldMasterPackage;
    int label;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij10(nj10 nj10Var, String str, String str2, spj<? super ij10> spjVar) {
        super(2, spjVar);
        this.this$0 = nj10Var;
        this.$oldMasterPackage = str;
        this.$newMasterPackage = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ij10(this.this$0, this.$oldMasterPackage, this.$newMasterPackage, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ij10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lec lecVar = this.this$0.g;
            String str = this.$oldMasterPackage;
            String str2 = this.$newMasterPackage;
            WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.NO;
            Bundle bundle = new Bundle(3);
            bundle.putString("old_master_package", str);
            bundle.putString("new_master_package", str2);
            bundle.putLong("initial_delay_millis", 300000L);
            s3q0 s3q0Var = s3q0.a;
            ((ezx0) lecVar.b).b(new WorkModel("VKPNS_NotifyOldMasterWorker", keepExistingWork, bundle));
            this.this$0.d.storeTiming("notify_old_master");
            nj10 nj10Var = this.this$0;
            String str3 = this.$oldMasterPackage;
            String str4 = this.$newMasterPackage;
            this.label = 1;
            d = nj10Var.d(str3, str4, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            d = ((Result) obj).d();
        }
        nj10 nj10Var2 = this.this$0;
        Throwable a = Result.a(d);
        if (a == null) {
            Logger.DefaultImpls.info$default(nj10Var2.o, "IPC old master notified successfully", null, 2, null);
            ((ezx0) nj10Var2.h.b).a("VKPNS_NotifyOldMasterWorker");
        } else {
            nj10Var2.o.error("IPC notifyOldMaster failed", a);
        }
        nj10 nj10Var3 = this.this$0;
        nj10Var3.c.send(new cl70(this.$oldMasterPackage, d, nj10Var3.d.getTimePassed("notify_old_master")));
        return s3q0.a;
    }
}
