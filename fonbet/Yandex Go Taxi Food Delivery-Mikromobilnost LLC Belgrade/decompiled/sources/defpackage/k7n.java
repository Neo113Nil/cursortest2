package defpackage;

import android.app.Activity;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2;
import com.yandex.go.dynamic.impl.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class k7n implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ DynamicFeature c;
    public final /* synthetic */ DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 w;

    public /* synthetic */ k7n(b bVar, DynamicFeature dynamicFeature, DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2, int i) {
        this.a = i;
        this.b = bVar;
        this.c = dynamicFeature;
        this.w = dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Activity activity;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 = this.w;
        DynamicFeature dynamicFeature = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                WeakReference weakReference = y5e.d0;
                if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
                    kst0.a(activity);
                }
                g7n g7nVar = bVar.c;
                String id = dynamicFeature.getId();
                pj pjVar = g7nVar.a;
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                if (id != null) {
                    hashMap.put("id", id);
                }
                pjVar.a.a("DynamicFeature.Download.Success", hashMap, 1, new HashMap());
                dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2.invoke(zy11Var);
                break;
            default:
                g7n g7nVar2 = bVar.c;
                String id2 = dynamicFeature.getId();
                g7nVar2.a.d(id2);
                xby.l(jst.e, "DynamicFeature.Download.Error", null, (Throwable) obj, id2, 2);
                dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2.invoke(zy11Var);
                break;
        }
        return zy11Var;
    }
}
