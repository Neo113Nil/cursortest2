package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiShowCommunityWidgetCommand.kt */
/* loaded from: classes6.dex */
public final class lxv0 extends dvv0 {
    @Override // xsna.dvv0
    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j = jSONObject.getLong("group_id");
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("code");
            long j2 = jSONObject.getLong("app_id");
            String string3 = jSONObject.getString("app_name");
            String string4 = jSONObject.getString("app_icon");
            io.reactivex.rxjava3.disposables.b b = b();
            if (b != null) {
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                io.reactivex.rxjava3.core.q<JSONObject> I = vdx0Var.d().I(j, j2, string2, string);
                vdx0 vdx0Var2 = e370.e;
                b.b(io.reactivex.rxjava3.core.q.I0(I, (vdx0Var2 != null ? vdx0Var2 : null).j().f(j), new hgj0(4)).subscribe(new o330(new kxv0(j2, j, string3, string4, string2, string), 29), new cp50(new dso0(this, 22), 24)));
            }
        } catch (JSONException unused) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.SHOW_COMMUNITY_WIDGET_PREVIEW_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }
}
