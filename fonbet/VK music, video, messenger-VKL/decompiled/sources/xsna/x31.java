package xsna;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x31 implements a9y {
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        if (!(b9yVar instanceof x9y)) {
            return AdvertisementConfig.SlotConfig.a;
        }
        Type type = new com.vk.external.miniapp.net.ad.b().getType();
        x9y x9yVar = (x9y) b9yVar;
        TreeTypeAdapter.a aVar = (TreeTypeAdapter.a) z8yVar;
        return new AdvertisementConfig.SlotConfig((List) aVar.a(x9yVar.q("slot_ids"), new com.vk.external.miniapp.net.ad.a().getType()), (Map) aVar.a(x9yVar.q("virtual_slots"), type), x9yVar.q("auto_update_ms").f(), x9yVar.q("limit_ms").f(), x9yVar.q("timeout_ms").f(), x9yVar.q("preload_ttl").f());
    }
}
