package defpackage;

import android.view.View;
import android.widget.ScrollView;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import java.util.HashMap;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.settings.main.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class e700 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i700 b;

    public /* synthetic */ e700(i700 i700Var, int i) {
        this.a = i;
        this.b = i700Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        f fVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i700 i700Var = this.b;
        switch (i) {
            case 0:
                View view = i700Var.F;
                int systemWindowInsetTop = view.getRootWindowInsets().getSystemWindowInsetTop();
                ScrollView scrollView = i700Var.G;
                scrollView.setPadding(0, systemWindowInsetTop, 0, 0);
                scrollView.setBackgroundColor(c.c(xng0.bgMain, view));
                i700Var.H.setPadding(0, 0, 0, ((t1w) obj).g);
                break;
            case 1:
                i700Var.c.Cg();
                i700Var.E.b.Cg();
                ((g1a0) ((z0a0) i700Var.x.get())).d();
                i700Var.v0.cancel();
                break;
            case 2:
                l600 l600Var = (l600) obj;
                if (!i700Var.s0 && !i700Var.t0 && (fVar = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    boolean z = l600Var instanceof j600;
                    boolean z2 = ((UserPhotoUploadingExperiment) ((com.yandex.go.user_profile.main_menu.profile.domain.c) ((o600) fVar.T.get())).c.a.a().b()).b;
                    if (!z || !z2) {
                        fVar.Lg();
                        break;
                    } else {
                        fVar.Mg();
                        break;
                    }
                }
                break;
            default:
                ly51 ly51Var = i700Var.E.b;
                ((f600) ly51Var.C.get()).f();
                jj10 jj10Var = ly51Var.z;
                jj10Var.getClass();
                jj10Var.a.a("Menu.YandexWallet.Tapped", new HashMap(), 1, new HashMap());
                ((dv51) ((cv51) ly51Var.A.b.get())).b(new fv51(new yv51(YbScreenSource.MENU_ITEM), true), new dp51(16));
                break;
        }
        return zy11Var;
    }
}
