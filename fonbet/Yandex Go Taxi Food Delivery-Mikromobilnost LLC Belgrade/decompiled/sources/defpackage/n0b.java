package defpackage;

import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.ApiResponse;
import com.yandex.messaging.core.net.entities.UpdateChatOrganizationsParams;
import com.yandex.messaging.core.net.entities.UpdateOrganizationError;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class n0b extends w920 {
    public final /* synthetic */ o0b a;
    public final /* synthetic */ UpdateChatOrganizationsParams b;
    public final /* synthetic */ j18 c;

    public n0b(o0b o0bVar, UpdateChatOrganizationsParams updateChatOrganizationsParams, j18 j18Var) {
        this.a = o0bVar;
        this.b = updateChatOrganizationsParams;
        this.c = j18Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        int i = kvj0Var.w;
        o0b o0bVar = this.a;
        if (i == 422 && rvj0Var != null) {
            String string = rvj0Var.string();
            JSONObject optJSONObject = new JSONObject(string).optJSONObject(Constants.KEY_DATA);
            ApiResponse apiResponse = null;
            String optString = optJSONObject != null ? optJSONObject.optString(AuthSdkActivity.RESPONSE_TYPE_CODE) : null;
            if (jl40.l(optString, UpdateOrganizationResult.UserError.USERS_JSON_CODE)) {
                apiResponse = (ApiResponse) o0bVar.c.adapter(Types.newParameterizedType(ApiResponse.class, UpdateOrganizationResult.UserError.class)).fromJson(string);
            } else if (jl40.l(optString, UpdateOrganizationResult.OrganizationMismatchError.ORGANIZATIONS_JSON_CODE)) {
                apiResponse = (ApiResponse) o0bVar.c.adapter(Types.newParameterizedType(ApiResponse.class, UpdateOrganizationResult.OrganizationMismatchError.class)).fromJson(string);
            }
            if (apiResponse != null) {
                return new fg70(new UpdateOrganizationError((UpdateOrganizationResult.BaseError) apiResponse.getData()), 1);
            }
            z83.j("incorrect body in update organizations response. It must contains Error");
        }
        return ouu.b(o0bVar.a, "update_chat_organizations", UpdateOrganizationResult.Success.class, kvj0Var);
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        j18 j18Var = this.c;
        if (!(j18Var.t() instanceof mf60)) {
            return false;
        }
        if (ngzVar instanceof UpdateOrganizationError) {
            j18Var.resumeWith(((UpdateOrganizationError) ngzVar).e);
            return false;
        }
        j18Var.resumeWith(new UpdateOrganizationResult.NetworkError(ngzVar.b));
        return false;
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        UpdateOrganizationResult updateOrganizationResult = (UpdateOrganizationResult) obj;
        j18 j18Var = this.c;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(updateOrganizationResult);
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        return this.a.a.a(this.b, "update_chat_organizations");
    }
}
