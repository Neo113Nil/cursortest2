package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class tp1 {
    public static Map a(gp1 gp1Var) {
        MediatedAdapterInfo b = gp1Var.b();
        String adapterVersion = b.getAdapterVersion();
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        Pair pair = new Pair("mediation_adapter_version", adapterVersion);
        String networkName = b.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        Pair pair2 = new Pair("mediation_network_name", networkName);
        String networkSdkVersion = b.getNetworkSdkVersion();
        return pn00.k(pair, pair2, new Pair("mediation_network_sdk_version", networkSdkVersion != null ? networkSdkVersion : "null"));
    }
}
