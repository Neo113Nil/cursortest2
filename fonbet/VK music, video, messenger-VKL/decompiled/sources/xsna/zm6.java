package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zm6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zm6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                BaseSharingExternalActivity.b bVar = (BaseSharingExternalActivity.b) this.c;
                BaseSharingExternalActivity.Q2(BaseSharingExternalActivity.this, (UserId) this.d, bVar.e, (List) obj);
                break;
            default:
                String str = (String) this.c;
                v1y v1yVar = (v1y) this.d;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SharedKt.PARAM_ACCESS_TOKEN, ((yfx0) obj).a);
                jSONObject.put(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, str);
                bex0.a.b(v1yVar, JsApiMethodType.GET_AUTH_TOKEN, jSONObject, null, 12);
                break;
        }
    }
}
