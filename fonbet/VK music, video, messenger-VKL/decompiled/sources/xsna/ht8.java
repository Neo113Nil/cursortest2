package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.billing.StorePurchasesManager;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vkontakte.android.R;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k840;
import xsna.mge0;

/* compiled from: BuyMusicSubscriptionHelper.java */
/* loaded from: classes3.dex */
public final class ht8<D extends mge0> implements tb0, StorePurchasesManager.a<D> {
    public final oge0 b;
    public qge0<D> c;

    public ht8(oge0 oge0Var) {
        this.b = oge0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(ht8 ht8Var, Activity activity) {
        if (activity instanceof aeg0) {
            ((aeg0) activity).yk(ht8Var);
        } else if (BuildInfo.h()) {
            throw new RuntimeException("activity must implement's ResulterProvider");
        }
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        cvk.u(R.string.purchase_cancelled, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(D d, nge0 nge0Var) {
        long j;
        long optLong;
        JSONObject jSONObject = nge0Var.b;
        JSONArray jSONArray = nge0Var.c;
        if (jSONObject == null) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.optInt("id") == 1) {
                            optLong = jSONObject2.optLong("expires_date");
                        }
                    } catch (Throwable th) {
                        L.i(th);
                    }
                }
            }
            j = 0;
            k840.a.i.k(j, true);
            o25.a().k(j, true);
            k840.a.h.b(new oe50(true, j));
        }
        optLong = jSONObject.optLong("expires_date");
        j = optLong * 1000;
        k840.a.i.k(j, true);
        o25.a().k(j, true);
        k840.a.h.b(new oe50(true, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        if (activity instanceof aeg0) {
            ((aeg0) activity).Li(this);
        } else if (BuildInfo.h()) {
            throw new RuntimeException("activity must implement's ResulterProvider ");
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        qge0<D> qge0Var = this.c;
        if (qge0Var != null) {
            qge0Var.i(i, i2);
        }
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(D d) {
    }
}
