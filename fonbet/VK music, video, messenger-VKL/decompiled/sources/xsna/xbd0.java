package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PriorityManagerClientTypeComparator.kt */
/* loaded from: classes2.dex */
public final class xbd0 implements Comparator<ckv> {
    public final Map<NetworkClient.ClientType, Integer> b;

    public xbd0(Map<NetworkClient.ClientType, Integer> map) {
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(ckv ckvVar, ckv ckvVar2) {
        Map<NetworkClient.ClientType, Integer> map = this.b;
        return ybd0.a(ckvVar, map) - ybd0.a(ckvVar2, map);
    }
}
