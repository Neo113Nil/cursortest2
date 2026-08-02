package defpackage;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class dq71 {
    public static Map a(sp81 sp81Var) {
        MediatedAdapterInfo a = sp81Var.a();
        String adapterVersion = a.getAdapterVersion();
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        Pair pair = new Pair("mediation_adapter_version", adapterVersion);
        String networkName = a.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        Pair pair2 = new Pair("mediation_network_name", networkName);
        String networkSdkVersion = a.getNetworkSdkVersion();
        return b.i(pair, pair2, new Pair("mediation_network_sdk_version", networkSdkVersion != null ? networkSdkVersion : "null"));
    }
}
