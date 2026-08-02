package xsna;

import com.vk.push.common.AppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$notifyAllHostsAboutNewMaster$2", f = "MasterHostElectionsInteractor.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class gj10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<AppInfo> $hostForConnectionList;
    final /* synthetic */ String $newMasterPackage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nj10 this$0;

    /* compiled from: MasterHostElectionsInteractor.kt */
    @b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$notifyAllHostsAboutNewMaster$2$1$1", f = "MasterHostElectionsInteractor.kt", l = {345}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AppInfo $hostAppInfo;
        final /* synthetic */ String $newMasterPackage;
        int label;
        final /* synthetic */ nj10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nj10 nj10Var, AppInfo appInfo, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = nj10Var;
            this.$hostAppInfo = appInfo;
            this.$newMasterPackage = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$hostAppInfo, this.$newMasterPackage, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                nj10 nj10Var = this.this$0;
                String packageName = this.$hostAppInfo.getPackageName();
                String str = this.$newMasterPackage;
                this.label = 1;
                if (nj10Var.d(packageName, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((Result) obj).getClass();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj10(List<AppInfo> list, nj10 nj10Var, String str, spj<? super gj10> spjVar) {
        super(2, spjVar);
        this.$hostForConnectionList = list;
        this.this$0 = nj10Var;
        this.$newMasterPackage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gj10 gj10Var = new gj10(this.$hostForConnectionList, this.this$0, this.$newMasterPackage, spjVar);
        gj10Var.L$0 = obj;
        return gj10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gj10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            List<AppInfo> list = this.$hostForConnectionList;
            nj10 nj10Var = this.this$0;
            String str = this.$newMasterPackage;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(myc0.h(yvjVar, null, null, new a(nj10Var, (AppInfo) it.next(), str, null), 3));
            }
            this.label = 1;
            if (fto0.o(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
