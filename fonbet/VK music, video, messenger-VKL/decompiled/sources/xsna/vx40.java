package xsna;

import android.content.res.Resources;
import com.vk.superapp.api.internal.requests.app.OrdersCancelUserSubscriptionResult;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx40 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vx40(yx40 yx40Var, int i, Resources resources) {
        this.c = i;
        this.d = resources;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Resources resources = (Resources) this.d;
                Throwable th = (Throwable) obj;
                bn40.c(th, "getLoadingImageObservable");
                return mcr0.g(resources, this.c).U(new xx40(new kdn(th, 28), 0));
            default:
                mov0 mov0Var = (mov0) this.d;
                if (((OrdersCancelUserSubscriptionResult) obj) == OrdersCancelUserSubscriptionResult.SUCCESS) {
                    mov0Var.c.n(JsApiMethodType.SHOW_SUBSCRIPTION_BOX, new JSONObject().put("success", true).put("subscriptionId", this.c));
                } else {
                    mov0Var.h(VkAppsErrors.Client.UNKNOWN_ERROR);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ vx40(mov0 mov0Var, int i) {
        this.d = mov0Var;
        this.c = i;
    }
}
