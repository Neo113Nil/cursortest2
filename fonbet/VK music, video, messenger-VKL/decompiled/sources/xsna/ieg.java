package xsna;

import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import org.json.JSONObject;
import xsna.j9y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ieg implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ieg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                leg legVar = (leg) this.c;
                c2y0 c2y0Var = (c2y0) this.d;
                legVar.d.invoke(Boolean.FALSE);
                q420 q420Var = legVar.l;
                if (q420Var == null) {
                    q420Var = null;
                }
                legVar.g.j(drm0.p0(q420Var.b()).toString(), c2y0Var.l(), true);
                break;
            case 1:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
                ea0.a(baseSharingExternalActivity, new com.vk.catalog2.common.ui.holders.b(18, baseSharingExternalActivity, (m340) this.d));
                break;
            case 2:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) this.c;
                gzs gzsVar = (gzs) this.d;
                ify.g(fVar);
                fVar.H.X(5);
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) this.c;
                osy0 osy0Var = (osy0) this.d;
                var0 var0Var = var0.a;
                String string = jSONObject.getString("token");
                String str = osy0Var.e;
                var0Var.getClass();
                zar0.a(new j9y0.d(string, str));
                break;
        }
    }
}
