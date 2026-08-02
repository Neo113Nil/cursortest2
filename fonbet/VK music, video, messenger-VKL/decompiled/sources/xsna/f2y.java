package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bex0;
import xsna.i2y;
import xsna.ztz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f2y implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i2y c;
    public final /* synthetic */ JsApiMethodType d;
    public final /* synthetic */ String e;

    public /* synthetic */ f2y(boolean z, i2y i2yVar, JsApiMethodType jsApiMethodType, String str) {
        this.b = z;
        this.c = i2yVar;
        this.d = jsApiMethodType;
        this.e = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebApiApplication v;
        fvv0 M;
        gvv0 view;
        x6y x6yVar = this.c.a;
        i2y.a aVar = (i2y.a) obj;
        boolean z = this.b;
        JsApiMethodType jsApiMethodType = this.d;
        if (z && (aVar.b instanceof ztz.a)) {
            bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
            return s3q0.a;
        }
        ztz ztzVar = aVar.b;
        bex0.a.b(x6yVar, jsApiMethodType, new JSONObject().put(SharedKt.PARAM_ACCESS_TOKEN, aVar.a.a).put("local_access_token", (Object) null).put(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, this.e), null, 12);
        fvv0 M2 = x6yVar.M();
        if (M2 != null && (v = M2.v()) != null && !v.r && (M = x6yVar.M()) != null && (view = M.getView()) != null) {
            view.Qb();
        }
        return s3q0.a;
    }
}
