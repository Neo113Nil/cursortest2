package xsna;

import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5v0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u5v0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                w5v0 w5v0Var = (w5v0) this.c;
                w7k0.d(w5v0Var.b(), (ContextWrapper) this.d, R.string.music_player_snack_bar_common_error);
                break;
            default:
                ubr0 ubr0Var = (ubr0) this.c;
                WebApiApplication webApiApplication = (WebApiApplication) this.d;
                com.vk.superapp.browser.ui.a aVar = ((ggu0) ubr0Var.f.c).n;
                if (aVar != null) {
                    aVar.Sm(ubr0Var.a.t().v);
                }
                com.vk.superapp.browser.internal.ui.shortcats.a aVar2 = ((ggu0) ubr0Var.d.c).x;
                if (aVar2 != null) {
                    qro0.c(new com.vk.movika.sdk.android.defaultplayer.interactive.a(aVar2, 2));
                }
                tdr0 tdr0Var = ubr0Var.e;
                yfu0 yfu0Var = tdr0Var.i;
                if (yfu0Var != null) {
                    VkBrowserMenuFactory c = tdr0Var.c();
                    c.getClass();
                    if (yfu0Var.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yfu0Var.getLayoutParams();
                        layoutParams.gravity = c.b(webApiApplication);
                        yfu0Var.setLayoutParams(layoutParams);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
