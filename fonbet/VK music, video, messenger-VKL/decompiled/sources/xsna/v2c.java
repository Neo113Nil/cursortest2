package xsna;

import android.annotation.SuppressLint;
import com.coremedia.iso.boxes.AuthorBox;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import io.reactivex.rxjava3.internal.functions.a;
import okhttp3.t;
import org.json.JSONObject;

/* compiled from: CheckoutApiCommand.kt */
/* loaded from: classes6.dex */
public abstract class v2c<T extends VkCheckoutResponse> extends nx2<T> {
    public static void k() {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rdx0.u(new k730("money.getAuthData")).U(new gv(new n82(9), 9));
        hv hvVar = new hv(new mo1(8), 11);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        U.E(hvVar, lVar, kVar, kVar).F(new ir0(new s8(xgx0.a, 5), 4)).a();
    }

    public abstract ara<T> g(alv alvVar, l7r0 l7r0Var);

    public abstract String getUrl();

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        x25 x25Var = r490.b;
        x25Var.getClass();
        return jSONObject.put(AuthorBox.TYPE, new JSONObject().put("auth_data", x25Var.a).put("auth_sign", x25Var.b));
    }

    @Override // xsna.nx2
    @SuppressLint({"CheckResult"})
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final T f(l7r0 l7r0Var) {
        int i;
        x25 x25Var = r490.b;
        if (x25Var.a.length() == 0 || x25Var.b.length() == 0) {
            k();
        }
        String jSONObject = i().toString();
        String url = getUrl();
        t.a aVar = okhttp3.t.Companion;
        okhttp3.m mVar = hbv0.a;
        aVar.getClass();
        alv alvVar = new alv(url, 0L, 0, 0, t.a.a(jSONObject, mVar), null, 46);
        Object a = zdq.a(l7r0Var, alvVar, g(alvVar, l7r0Var), true);
        while (i < 2) {
            VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus = ((VkCheckoutResponse) a).a;
            x25 x25Var2 = r490.b;
            if (x25Var2.a.length() == 0 || x25Var2.b.length() == 0 || vkCheckoutResponseStatus == VkCheckoutResponse.VkCheckoutResponseStatus.ERR_AUTH_DATA_MALFORMED) {
                k();
                a = f(l7r0Var);
            }
            VkCheckoutResponse vkCheckoutResponse = (VkCheckoutResponse) a;
            VkCheckoutResponse.VkCheckoutResponseStatus vkCheckoutResponseStatus2 = vkCheckoutResponse.a;
            if (vkCheckoutResponseStatus2 == VkCheckoutResponse.VkCheckoutResponseStatus.OK) {
                x25 x25Var3 = r490.b;
                i = (x25Var3.a.length() == 0 || x25Var3.b.length() == 0 || vkCheckoutResponseStatus2 == VkCheckoutResponse.VkCheckoutResponseStatus.ERR_AUTH_DATA_MALFORMED) ? 0 : i + 1;
            }
            xgx0 xgx0Var = xgx0.a;
            String obj = vkCheckoutResponse.a.toString();
            xgx0Var.getClass();
            xgx0.a(obj);
        }
        return (T) a;
    }
}
