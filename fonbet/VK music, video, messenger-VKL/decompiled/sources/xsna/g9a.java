package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import xsna.b5x;

/* compiled from: isCatalog.kt */
/* loaded from: classes18.dex */
public final class g9a extends fl10 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fl10, xsna.el10
    public final boolean d(b5x b5xVar) {
        return b(b5xVar.getDesignInspectorParams(), ((View) b5xVar).getContext());
    }

    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        Integer num;
        int intValue;
        b5x.c designInspectorParams;
        Integer num2;
        if (cVar != null && (num = cVar.c) != null && (intValue = num.intValue()) != -1 && intValue != 0) {
            try {
                bpn0 bpn0Var = enj.a;
                String resourceName = context.getResources().getResourceName(intValue);
                if (resourceName != null && drm0.D(resourceName, "catalog", false) && drm0.D(resourceName, "vk_apps_catalog_fragment_redesign", false)) {
                    Object obj = cVar.e;
                    if (obj != null) {
                        View view = obj instanceof View ? (View) obj : null;
                        for (ViewParent parent = view != null ? view.getParent() : null; parent != null; parent = parent.getParent()) {
                            if ((parent instanceof b5x) && (designInspectorParams = ((b5x) parent).getDesignInspectorParams()) != null && (num2 = designInspectorParams.c) != null && num2.intValue() == intValue) {
                            }
                        }
                    }
                    return new f9a(resourceName);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
