package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Response;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Response;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Response;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Response;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Response;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class c2n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public c2n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2, String str) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppLocalStorageDelete"), new LocalStorageDelete$Response(null, new LocalStorageDelete$Response.Data(arrayList, arrayList2, str), null, str, 5, null), null, null, false, null, 60);
    }

    public final void b(String str, List list) {
        JsMethod jsMethod = new JsMethod("VKWebAppLocalStorageGetMeta");
        List<ai20> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ai20 ai20Var : list2) {
            arrayList.add(new LocalStorageGetMeta$Response.Data.MetaRecords(ai20Var.a, Integer.valueOf(ai20Var.b), ai20Var.e, Long.valueOf(ai20Var.c), Long.valueOf(ai20Var.d)));
        }
        com.vk.superapp.base.js.bridge.b.p(this.a, jsMethod, new LocalStorageGetMeta$Response(null, new LocalStorageGetMeta$Response.Data(arrayList, str), null, str, 5, null), null, null, false, null, 60);
    }

    public final void c(v13 v13Var, String str) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppLocalStorageGetState"), new LocalStorageGetState$Response(null, new LocalStorageGetState$Response.Data(ServiceProvider.HTTP_CACHE_DISK_SIZE, v13Var.a, v13Var.b, str), null, str, 5, null), null, null, false, null, 60);
    }

    public final void d(String str, String str2) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppLocalStorageRead"), new LocalStorageRead$Response(null, new LocalStorageRead$Response.Data(str == null || str.length() == 0, str, str2), null, str2, 5, null), null, null, false, null, 60);
    }

    public final void e(String str, boolean z) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppLocalStorageWrite"), new LocalStorageWrite$Response(null, new LocalStorageWrite$Response.Data(z, str), null, str, 5, null), null, null, false, null, 60);
    }
}
