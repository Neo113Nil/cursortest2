package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$collectRemoteHostAppInfoList$2", f = "MasterHostElectionsInteractor.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class bj10 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends HostAppInfo>>, Object> {
    final /* synthetic */ List<AppInfo> $hostForConnectionList;
    final /* synthetic */ HostAppInfo $selfHostAppInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nj10 this$0;

    /* compiled from: MasterHostElectionsInteractor.kt */
    @b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$collectRemoteHostAppInfoList$2$hostInfoResultList$1$1", f = "MasterHostElectionsInteractor.kt", l = {245}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super HostAppInfo>, Object> {
        final /* synthetic */ AppInfo $host;
        int label;
        final /* synthetic */ nj10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nj10 nj10Var, AppInfo appInfo, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = nj10Var;
            this.$host = appInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$host, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super HostAppInfo> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object o;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.d.storeTiming("collect_host_info_".concat(this.$host.getPackageName()));
                nj10 nj10Var = this.this$0;
                AppInfo appInfo = this.$host;
                nj10Var.getClass();
                ak10 ak10Var = new ak10(nj10Var.a, appInfo, nj10Var.o, 10000L, new jj10(nj10Var, appInfo));
                ak10 putIfAbsent = nj10Var.f.putIfAbsent(appInfo, ak10Var);
                if (putIfAbsent != null) {
                    ak10Var = putIfAbsent;
                }
                long millis = TimeUnit.SECONDS.toMillis(20L);
                this.label = 1;
                o = ak10Var.o(millis, this);
                if (o == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                o = ((Result) obj).d();
            }
            nj10 nj10Var2 = this.this$0;
            nj10Var2.c.send(new o4g(nj10Var2.d.getTimePassed("collect_host_info_".concat(this.$host.getPackageName())), o));
            nj10 nj10Var3 = this.this$0;
            Throwable a = Result.a(o);
            if (a != null) {
                nj10Var3.o.error("IPC getHostAppInfo failed", a);
            }
            if (o instanceof Result.Failure) {
                return null;
            }
            return o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj10(List<AppInfo> list, HostAppInfo hostAppInfo, nj10 nj10Var, spj<? super bj10> spjVar) {
        super(2, spjVar);
        this.$hostForConnectionList = list;
        this.$selfHostAppInfo = hostAppInfo;
        this.this$0 = nj10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        bj10 bj10Var = new bj10(this.$hostForConnectionList, this.$selfHostAppInfo, this.this$0, spjVar);
        bj10Var.L$0 = obj;
        return bj10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends HostAppInfo>> spjVar) {
        return ((bj10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(myc0.b(yvjVar, null, null, new a(nj10Var, (AppInfo) it.next(), null), 3));
            }
            this.label = 1;
            obj = fto0.e(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return j5g.V(j5g.v0(this.$selfHostAppInfo, (List) obj));
    }
}
