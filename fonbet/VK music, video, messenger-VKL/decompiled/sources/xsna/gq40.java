package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.network.proxy.VkProxyProvider;
import com.vk.network.proxy.data.model.VkProxyNetwork;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import xsna.kae0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gq40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gq40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                jq40 jq40Var = (jq40) this.c;
                ib50 ib50Var = (ib50) obj;
                MusicTrack musicTrack = ib50Var.a;
                DownloadingState downloadingState = musicTrack.J;
                if ((downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.NotLoaded)) {
                    jq40Var.i.remove(musicTrack.Fb());
                } else {
                    jq40Var.i.put(musicTrack.Fb(), ib50Var.a.J);
                }
                return s3q0.a;
            case 1:
                VkProxyProvider vkProxyProvider = (VkProxyProvider) this.c;
                VkProxyNetwork vkProxyNetwork = (VkProxyNetwork) obj;
                ReentrantLock reentrantLock = vkProxyProvider.g;
                reentrantLock.lock();
                try {
                    int i = VkProxyProvider.a.$EnumSwitchMapping$0[vkProxyNetwork.c.ordinal()];
                    boolean z = true;
                    VkProxyProvider.State state = i != 1 ? i != 2 ? null : VkProxyProvider.State.Enabled : VkProxyProvider.State.Forbidden;
                    if (state != null) {
                        L.e("Network type [" + vkProxyNetwork + "] has already checked, up state to " + state.name() + '!');
                        if (!vkProxyNetwork.b) {
                            vkProxyProvider.f = state;
                            s3q0 s3q0Var = s3q0.a;
                            reentrantLock.unlock();
                            return s3q0.a;
                        }
                        if (state == VkProxyProvider.State.Enabled) {
                            vkProxyProvider.d.c();
                        }
                        vkProxyProvider.f = state;
                    }
                    L.e("Repeated configuration check");
                    VkProxyProvider.State state2 = vkProxyProvider.f;
                    int[] iArr = VkProxyProvider.a.$EnumSwitchMapping$1;
                    int i2 = iArr[state2.ordinal()];
                    if (i2 == 1) {
                        vkProxyProvider.f();
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            s3q0 s3q0Var2 = s3q0.a;
                            reentrantLock.unlock();
                            return s3q0.a;
                        }
                        vkProxyProvider.d();
                    }
                    if (!vkProxyNetwork.b || state != vkProxyProvider.f) {
                        int i3 = iArr[vkProxyProvider.f.ordinal()];
                        if (i3 == 2) {
                            pev0 pev0Var = vkProxyProvider.d;
                            VkProxyNetwork a = VkProxyNetwork.a(vkProxyNetwork, VkProxyNetwork.Status.ENABLED);
                            kae0 kae0Var = pev0Var.d;
                            StringBuilder sb = new StringBuilder("[PROXY-STORE] From memory cache ");
                            String str = a.a;
                            sb.append(str);
                            sb.append(" - ");
                            VkProxyNetwork.Status status = a.c;
                            sb.append(status);
                            L.e(sb.toString());
                            kae0Var.b.put(str, a);
                            int i4 = kae0.a.$EnumSwitchMapping$0[status.ordinal()];
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    z = false;
                                } else if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            Preference.I("NetworkProxy", "net_id_".concat(str), z);
                        } else if (i3 == 3) {
                            pev0 pev0Var2 = vkProxyProvider.d;
                            VkProxyNetwork a2 = VkProxyNetwork.a(vkProxyNetwork, VkProxyNetwork.Status.BLOCKED);
                            kae0 kae0Var2 = pev0Var2.d;
                            StringBuilder sb2 = new StringBuilder("[PROXY-STORE] From memory cache ");
                            String str2 = a2.a;
                            sb2.append(str2);
                            sb2.append(" - ");
                            VkProxyNetwork.Status status2 = a2.c;
                            sb2.append(status2);
                            L.e(sb2.toString());
                            kae0Var2.b.put(str2, a2);
                            int i5 = kae0.a.$EnumSwitchMapping$0[status2.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    z = false;
                                } else if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            Preference.I("NetworkProxy", "net_id_".concat(str2), z);
                        }
                    }
                    s3q0 s3q0Var22 = s3q0.a;
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((ayx0) this.c).b((HashMap) obj);
                return s3q0.a;
        }
    }
}
