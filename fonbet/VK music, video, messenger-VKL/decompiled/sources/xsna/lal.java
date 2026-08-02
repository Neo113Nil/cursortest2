package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.log.L;
import com.vk.network.proxy.data.VkProxyPreferences;
import com.vk.network.proxy.data.model.VkProxyNetwork;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lal implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lal(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                oal oalVar = (oal) this.c;
                ((Boolean) obj).booleanValue();
                oalVar.e();
                break;
            default:
                kae0 kae0Var = (kae0) this.c;
                NetworkState networkState = (NetworkState) obj;
                if (!epx.f(null, networkState.a) && networkState.d) {
                    ConcurrentHashMap concurrentHashMap = kae0Var.b;
                    String str = networkState.a;
                    VkProxyNetwork vkProxyNetwork = (VkProxyNetwork) concurrentHashMap.get(str);
                    if (vkProxyNetwork == null) {
                        Object failure = !Preference.v("NetworkProxy", "net_id_".concat(str)) ? new Result.Failure(new VkProxyPreferences.StoreNetworkException(zr.a("Can't find networkId [", str, "] in store!"))) : Boolean.valueOf(Preference.d("NetworkProxy", "net_id_".concat(str), false));
                        if (Result.a(failure) == null) {
                            VkProxyNetwork.Status status = ((Boolean) failure).booleanValue() ? VkProxyNetwork.Status.ENABLED : VkProxyNetwork.Status.BLOCKED;
                            L.e("[PROXY-STORE] From persistence " + str + " - " + status);
                            vkProxyNetwork = new VkProxyNetwork(str, true, status);
                        } else {
                            L.e(go9.b("[PROXY-STORE] From scratch ", str));
                            vkProxyNetwork = new VkProxyNetwork(str, false, VkProxyNetwork.Status.UNKNOWN);
                        }
                    } else {
                        StringBuilder a = t33.a("[PROXY-STORE] From memory cache ", str, " - ");
                        a.append(vkProxyNetwork.c);
                        L.e(a.toString());
                    }
                    kae0Var.a.onNext(vkProxyNetwork);
                }
                break;
        }
        return s3q0.a;
    }
}
