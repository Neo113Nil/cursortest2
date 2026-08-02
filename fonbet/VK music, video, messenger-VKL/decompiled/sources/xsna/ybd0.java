package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.Map;
import xsna.lkv;

/* compiled from: PriorityManagerClientTypeComparator.kt */
/* loaded from: classes2.dex */
public final class ybd0 {
    public static final int a(ckv ckvVar, Map<NetworkClient.ClientType, Integer> map) {
        Integer num = map.get((NetworkClient.ClientType) ckvVar.h(lkv.c.a));
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
