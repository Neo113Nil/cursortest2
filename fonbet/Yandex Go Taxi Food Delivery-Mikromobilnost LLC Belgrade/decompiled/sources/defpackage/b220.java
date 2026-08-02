package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.messaging.sdk.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b220 {
    public final ept a;
    public final dpt b;

    public b220(a aVar) {
        this.a = (ept) ((zzf) aVar.b()).vg.get();
        ((zzf) aVar.b()).getClass();
        this.b = new dpt();
    }

    public final b5o a() {
        this.b.getClass();
        return d("NATIVE_MSNGR_REGISTRY");
    }

    public final b5o b() {
        this.b.getClass();
        return d("NATIVE_MSNGR_FANOUT");
    }

    public final b5o c() {
        this.b.getClass();
        return d("NATIVE_MSNGR_FILES");
    }

    public final b5o d(String str) {
        ept eptVar = this.a;
        Map map = ((kl20) eptVar.a.get()).e(eptVar.b.a().a, HostMobSupportedApiNames.NATIVE_MSNGR_REGISTRY.getApiName(), HostMobSupportedApiNames.NATIVE_MSNGR_FANOUT.getApiName(), HostMobSupportedApiNames.NATIVE_MSNGR_FILES.getApiName(), HostMobSupportedApiNames.NATIVE_MSNGR_IMAGES.getApiName(), HostMobSupportedApiNames.NATIVE_MSNGR_PUSH.getApiName(), HostMobSupportedApiNames.NATIVE_MSNGR_TOOLS.getApiName()).b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((iq20) entry.getValue()).a.a.d);
        }
        String str2 = (String) linkedHashMap.get(str);
        return new b5o(str2, str2);
    }

    public final b5o e() {
        this.b.getClass();
        return d("NATIVE_MSNGR_PUSH");
    }

    public final b5o f() {
        this.b.getClass();
        return d("NATIVE_MSNGR_IMAGES");
    }

    public final b5o g() {
        this.b.getClass();
        return d("NATIVE_MSNGR_TOOLS");
    }
}
