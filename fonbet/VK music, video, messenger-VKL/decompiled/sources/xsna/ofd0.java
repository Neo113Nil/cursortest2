package xsna;

import android.view.View;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.user.UserProfile;
import com.vk.navigation.NavigationDelegateActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ofd0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ofd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                pfd0 pfd0Var = (pfd0) this.c;
                pfd0Var.p.invoke((UserProfile) this.d);
                break;
            case 1:
                i9g0 i9g0Var = (i9g0) this.c;
                NavigationDelegateActivity navigationDelegateActivity = (NavigationDelegateActivity) this.d;
                VkTooltip vkTooltip = i9g0Var.d;
                if (vkTooltip != null) {
                    vkTooltip.dismiss();
                }
                i9g0Var.d = null;
                io.reactivex.rxjava3.disposables.c cVar = i9g0Var.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                i9g0Var.c = i9g0Var.a.a(60, null, new com.vk.movika.sdk.base.flow.binding.g(22, i9g0Var, navigationDelegateActivity), new defpackage.e0(22, i9g0Var, navigationDelegateActivity));
                break;
            default:
                VkTabs.k((VkTabs) this.c, (VkTabs.c) this.d);
                break;
        }
    }
}
