package xsna;

import android.content.Context;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.Map;

/* compiled from: GetUnbanRecommendationsTask.kt */
/* loaded from: classes7.dex */
public final class ewt implements z7e0 {
    public final /* synthetic */ gwt a;

    public ewt(gwt gwtVar) {
        this.a = gwtVar;
    }

    @Override // xsna.z7e0
    public final void a(Context context, Map<String, String> map) {
        gwt gwtVar = this.a;
        SuperappUiRouterBridge superappUiRouterBridge = (SuperappUiRouterBridge) gwtVar.c.getValue();
        ((b25) gwtVar.b.getValue()).h();
        superappUiRouterBridge.V(context, map);
    }
}
