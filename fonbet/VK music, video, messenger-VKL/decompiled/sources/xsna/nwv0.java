package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.aex0;
import xsna.bex0;

/* compiled from: VkUiLeaveGroupCommand.kt */
/* loaded from: classes6.dex */
public final class nwv0 implements aex0.b {
    public final /* synthetic */ pwv0 a;

    public nwv0(pwv0 pwv0Var) {
        this.a = pwv0Var;
    }

    @Override // xsna.aex0.b
    public final void a() {
        r6y r6yVar = this.a.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.LEAVE_GROUP, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
    }
}
