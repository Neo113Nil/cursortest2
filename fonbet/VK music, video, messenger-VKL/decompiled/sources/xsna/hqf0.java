package xsna;

import com.vk.push.pushsdk.work.CheckThatDeletedAppIsHostWorker;
import com.vk.push.pushsdk.work.InitiateMasterElectionsWorker;
import com.vk.push.pushsdk.work.NotifyOldMasterWorker;
import com.vk.push.pushsdk.work.OneTimePushReceiveWorker;
import com.vk.push.pushsdk.work.StopDeliverToUninstalledWork;
import com.vk.push.pushsdk.work.TokensHealthCheckWorker;
import com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;

/* compiled from: RegisterWorkersUseCase.kt */
/* loaded from: classes5.dex */
public final class hqf0 {
    public final gzx0 a;

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class a extends Lambda implements gzs<CheckThatDeletedAppIsHostWorker.b> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final CheckThatDeletedAppIsHostWorker.b invoke() {
            return new CheckThatDeletedAppIsHostWorker.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class b extends Lambda implements gzs<InitiateMasterElectionsWorker.b> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final InitiateMasterElectionsWorker.b invoke() {
            return new InitiateMasterElectionsWorker.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class c extends Lambda implements gzs<NotifyOldMasterWorker.b> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final NotifyOldMasterWorker.b invoke() {
            return new NotifyOldMasterWorker.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class d extends Lambda implements gzs<OneTimePushReceiveWorker.b> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final OneTimePushReceiveWorker.b invoke() {
            return new OneTimePushReceiveWorker.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class e extends Lambda implements gzs<StopDeliverToUninstalledWork.b> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final StopDeliverToUninstalledWork.b invoke() {
            return new StopDeliverToUninstalledWork.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class f extends Lambda implements gzs<TokensHealthCheckWorker.b> {
        public static final f i = new f(0);

        @Override // xsna.gzs
        public final TokensHealthCheckWorker.b invoke() {
            return new TokensHealthCheckWorker.b();
        }
    }

    /* compiled from: RegisterWorkersUseCase.kt */
    public static final class g extends Lambda implements gzs<DeleteTokensFromServerWorker.b> {
        public static final g i = new g(0);

        @Override // xsna.gzs
        public final DeleteTokensFromServerWorker.b invoke() {
            return new DeleteTokensFromServerWorker.b();
        }
    }

    public hqf0(gzx0 gzx0Var) {
        this.a = gzx0Var;
    }

    public final void a() {
        bpn0 bpn0Var = new bpn0(a.i);
        gzx0 gzx0Var = this.a;
        gzx0Var.a.put("VKPNS_CheckThatDeletedAppIsHostWorker", CheckThatDeletedAppIsHostWorker.b);
        ConcurrentHashMap<String, Lazy<xvj>> concurrentHashMap = gzx0Var.c;
        concurrentHashMap.put("VKPNS_CheckThatDeletedAppIsHostWorker", bpn0Var);
        bpn0 bpn0Var2 = new bpn0(b.i);
        ConcurrentHashMap<String, wj80> concurrentHashMap2 = gzx0Var.a;
        concurrentHashMap2.put("VKPNS_InitiateMasterElectionsWorker", InitiateMasterElectionsWorker.b);
        concurrentHashMap.put("VKPNS_InitiateMasterElectionsWorker", bpn0Var2);
        bpn0 bpn0Var3 = new bpn0(c.i);
        concurrentHashMap2.put("VKPNS_NotifyOldMasterWorker", NotifyOldMasterWorker.b);
        concurrentHashMap.put("VKPNS_NotifyOldMasterWorker", bpn0Var3);
        bpn0 bpn0Var4 = new bpn0(d.i);
        ConcurrentHashMap<String, px90> concurrentHashMap3 = gzx0Var.b;
        concurrentHashMap3.put("VKPNS_OneTimePushReceiveWorker", OneTimePushReceiveWorker.b);
        concurrentHashMap.put("VKPNS_OneTimePushReceiveWorker", bpn0Var4);
        bpn0 bpn0Var5 = new bpn0(e.i);
        concurrentHashMap3.put("VKPNS_StopDeliverToUninstalledWork", StopDeliverToUninstalledWork.b);
        concurrentHashMap.put("VKPNS_StopDeliverToUninstalledWork", bpn0Var5);
        bpn0 bpn0Var6 = new bpn0(f.i);
        concurrentHashMap3.put("VKPNS_PushTokensHealthCheckWork", TokensHealthCheckWorker.b);
        concurrentHashMap.put("VKPNS_PushTokensHealthCheckWork", bpn0Var6);
        bpn0 bpn0Var7 = new bpn0(g.i);
        concurrentHashMap2.put("DeleteTokensFromServerWorker", DeleteTokensFromServerWorker.b);
        concurrentHashMap.put("DeleteTokensFromServerWorker", bpn0Var7);
    }
}
