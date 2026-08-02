package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: WebGroupDelegate.kt */
/* loaded from: classes6.dex */
public class mgx0 implements qju {
    public final onx a;
    public final pnx b;

    public mgx0(onx onxVar, pnx pnxVar) {
        this.a = onxVar;
        this.b = pnxVar;
    }

    @Override // xsna.qju
    public final void a(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.GROUP_INVITE_LINK_CREATED;
        if (this.a.u(jsApiMethodType, str)) {
            f(jsApiMethodType, str);
        }
    }

    @Override // xsna.qju
    public final void b(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_INVITE_FRIENDS_MODAL;
        onx onxVar = this.a;
        if (onxVar.u(jsApiMethodType, str)) {
            if (str == null) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            final long optLong = jSONObject.optLong("user_id");
            final long optLong2 = jSONObject.optLong("group_id");
            i0q0.j(new Runnable() { // from class: xsna.lgx0
                @Override // java.lang.Runnable
                public final void run() {
                    mgx0 mgx0Var = mgx0.this;
                    long j = optLong;
                    long j2 = optLong2;
                    pnx pnxVar = mgx0Var.b;
                    gzs<s3q0> gzsVar = fkq0.a;
                    pnxVar.a(new UserId(j), new UserId(j2));
                }
            });
        }
    }

    @Override // xsna.qju
    public boolean c(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.UPDATE_COMMUNITY_PAGE;
        onx onxVar = this.a;
        if (onxVar.u(jsApiMethodType, str)) {
            try {
                if (str == null) {
                    bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return false;
                }
                if (new JSONObject(str).has("group_id")) {
                    bex0.a.b(onxVar, jsApiMethodType, new JSONObject().put("result", true), null, 12);
                    return true;
                }
            } catch (JSONException unused) {
                bex0.a.a(onxVar, JsApiMethodType.UPDATE_COMMUNITY_PAGE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return false;
            }
        }
        return false;
    }

    @Override // xsna.qju
    public void d(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.GROUP_CREATED;
        onx onxVar = this.a;
        if (onxVar.u(jsApiMethodType, str)) {
            if (str == null) {
                bex0.a.a(onxVar, JsApiMethodType.UPDATE_COMMUNITY_PAGE, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                return;
            }
            long optLong = new JSONObject(str).optLong("id", 0L);
            final UserId userId = new UserId(optLong);
            final boolean optBoolean = new JSONObject(str).optBoolean("isNewFlow");
            o1e0.a.a(new oju(userId));
            if (optLong != 0) {
                i0q0.j(new Runnable() { // from class: xsna.kgx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mgx0.this.b.b(fkq0.e(userId), optBoolean);
                    }
                });
            }
        }
    }

    @Override // xsna.qju
    public final void e(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.GROUP_INVITE_LINK_DELETED;
        if (this.a.u(jsApiMethodType, str)) {
            f(jsApiMethodType, str);
        }
    }

    public final void f(JsApiMethodType jsApiMethodType, String str) {
        onx onxVar = this.a;
        try {
            if (str == null) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                return;
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("inviteLink");
            if (optJSONObject == null) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            } else {
                i0q0.j(new cy3(11, this, new CommunityInviteLink(Integer.valueOf(optJSONObject.optInt("id")), new UserId(optJSONObject.optLong("group_id")), new UserId(optJSONObject.optLong("owner_id")), optJSONObject.optString("url"), optJSONObject.optLong("create_time"), optJSONObject.optLong("expire_time"), optJSONObject.optInt("expire_count"), optJSONObject.optInt("invited_count"))));
            }
        } catch (Exception e) {
            L.e(e);
        }
    }
}
