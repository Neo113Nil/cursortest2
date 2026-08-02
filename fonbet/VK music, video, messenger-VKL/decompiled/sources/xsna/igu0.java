package xsna;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.vk.superapp.bridges.SuperappUiRouterBridge;

/* compiled from: VkBrowserView.kt */
/* loaded from: classes6.dex */
public final class igu0 implements g680 {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ ggu0 b;

    public igu0(FrameLayout frameLayout, ggu0 ggu0Var) {
        this.a = frameLayout;
        this.b = ggu0Var;
    }

    @Override // xsna.g680
    public final void a() {
        ggu0 ggu0Var = this.b;
        Context context = ggu0Var.b;
        if (f4m.h(this.a)) {
            ggu0Var.q = true;
            Activity b = gnj.b(context);
            if (b != null) {
                b.setRequestedOrientation(-1);
            }
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.r(context);
        }
    }

    @Override // xsna.g680
    public final void b() {
        ggu0 ggu0Var = this.b;
        ggu0Var.q = false;
        Context context = ggu0Var.b;
        Activity b = gnj.b(context);
        if (b != null) {
            b.setRequestedOrientation(1);
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.b0(context);
    }
}
