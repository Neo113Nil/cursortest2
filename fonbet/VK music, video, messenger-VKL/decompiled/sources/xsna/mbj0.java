package xsna;

import android.content.Intent;
import com.vk.superapp.navigation.api.data.AppShareType;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zex0;

/* compiled from: SharingController.kt */
/* loaded from: classes6.dex */
public final class mbj0 {
    public final mfu0 a;
    public final qzl0 b;
    public boolean c;
    public io.reactivex.rxjava3.disposables.c d;
    public boolean e;
    public final nhj f;
    public final tvq g;

    public mbj0(mfu0 mfu0Var, qzl0 qzl0Var) {
        this.a = mfu0Var;
        this.b = qzl0Var;
        int i = 2;
        this.f = new nhj(this, i);
        this.g = new tvq(this, i);
    }

    public final void a(Intent intent, JSONArray jSONArray, AppShareType appShareType) {
        String h = appShareType.h();
        if (intent != null && intent.hasExtra(h) && intent.getBooleanExtra(h, false)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", appShareType.h());
            this.b.invoke(appShareType);
            jSONArray.put(jSONObject);
        }
    }

    public final void b() {
        bd70 bd70Var;
        if (this.c) {
            zex0 zex0Var = e370.q;
            if (zex0Var != null && (bd70Var = (bd70) ((HashMap) zex0Var.c.getValue()).remove(this.f)) != null) {
                zex0Var.a(zex0.a.STORY).g(bd70Var);
            }
            zex0 zex0Var2 = e370.q;
            if (zex0Var2 != null) {
                zex0.a aVar = zex0.a.NEWS_FEED;
                HashMap<Object, bd70<?>> b = zex0Var2.b(aVar);
                tvq tvqVar = this.g;
                if (b.containsKey(tvqVar)) {
                    zex0Var2.a(aVar).g((bd70) ((HashMap) zex0Var2.c.getValue()).get(tvqVar));
                }
            }
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.c = false;
        }
    }
}
