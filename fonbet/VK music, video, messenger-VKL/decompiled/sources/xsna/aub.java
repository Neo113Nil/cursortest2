package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ChatOnlineMembersLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class aub implements com.vk.im.chat.onlines.api.a {
    public final u04 a;
    public final dz5 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public aub(u04 u04Var, dz5 dz5Var, k7b0 k7b0Var) {
        this.a = u04Var;
        this.b = dz5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(aub aubVar, fmb fmbVar, ContinuationImpl continuationImpl) {
        ytb ytbVar;
        int i;
        ConcurrentHashMap concurrentHashMap = aubVar.c;
        if (continuationImpl instanceof ytb) {
            ytbVar = (ytb) continuationImpl;
            int i2 = ytbVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ytbVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ytbVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ytbVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    kp80 kp80Var = (kp80) concurrentHashMap.get(fmbVar);
                    if (kp80Var != null && qni0.a() <= kp80Var.c + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                        return kp80Var;
                    }
                    u04 u04Var = aubVar.a;
                    Peer peer = fmbVar.a;
                    Peer peer2 = fmbVar.b;
                    ytbVar.L$0 = fmbVar;
                    ytbVar.L$1 = null;
                    ytbVar.label = 1;
                    obj = myc0.k((ovj) u04Var.c, new bub(peer, peer2, null), ytbVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fmbVar = (fmb) ytbVar.L$0;
                    kotlin.a.a(obj);
                }
                kp80 kp80Var2 = new kp80(fmbVar, ((Number) obj).intValue(), qni0.a());
                concurrentHashMap.put(fmbVar, kp80Var2);
                return kp80Var2;
            }
        }
        ytbVar = new ytb(aubVar, continuationImpl);
        Object obj2 = ytbVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ytbVar.label;
        if (i != 0) {
        }
        kp80 kp80Var22 = new kp80(fmbVar, ((Number) obj2).intValue(), qni0.a());
        concurrentHashMap.put(fmbVar, kp80Var22);
        return kp80Var22;
    }

    @Override // com.vk.im.chat.onlines.api.a
    public final ksr<Integer> a(Peer peer, Peer peer2) {
        return !peer.zb() ? ufp.b : new izg0(new ztb(this, new fmb(peer, peer2), null));
    }
}
