package xsna;

import android.content.Context;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import java.util.Set;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vt3 implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ dvv0 c;

    public /* synthetic */ vt3(dvv0 dvv0Var, int i) {
        this.b = i;
        this.c = dvv0Var;
    }

    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        switch (this.b) {
            case 0:
                yt3 yt3Var = (yt3) this.c;
                Context mo2getContext = yt3Var.e.mo2getContext();
                if (mo2getContext != null) {
                    yt3Var.f.j(mo2getContext, RequestedMiniApp.VK_WORKOUT, new s9(yt3Var, 4), new p1(yt3Var, 6));
                    break;
                } else {
                    r6y r6yVar = yt3Var.b;
                    if (r6yVar != null) {
                        bex0.a.a(r6yVar, JsApiMethodType.ASK_WORKOUT_PERMISSIONS, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                        break;
                    }
                }
                break;
            default:
                ((bst) this.c).f((Set) obj);
                break;
        }
    }
}
