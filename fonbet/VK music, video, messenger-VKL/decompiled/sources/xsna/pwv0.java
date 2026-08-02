package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiLeaveGroupCommand.kt */
/* loaded from: classes6.dex */
public final class pwv0 extends dvv0 {
    @Override // xsna.dvv0
    public final void a(String str) {
        if (str == null) {
            return;
        }
        try {
            long j = new JSONObject(str).getLong("group_id");
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.disposables.c subscribe = vdx0Var.j().d(j).subscribe(new k2y(new mdk0(this, 24), 29), new bpt0(new kvm0(this, 16), 2));
            io.reactivex.rxjava3.disposables.b b = b();
            if (b != null) {
                b.b(subscribe);
            }
        } catch (Exception e) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_GROUP_INFO, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
            xgx0.a.getClass();
            xgx0.d(e);
        }
    }
}
