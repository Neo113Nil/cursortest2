package defpackage;

import android.animation.Animator;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ijm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3k0 b;
    public final /* synthetic */ pjm c;

    public /* synthetic */ ijm(pjm pjmVar, r3k0 r3k0Var) {
        this.a = 4;
        this.c = pjmVar;
        this.b = r3k0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        pjm pjmVar = this.c;
        r3k0 r3k0Var = this.b;
        Animator animator = (Animator) obj;
        switch (i) {
            case 0:
                r3k0Var.d(null, false);
                sue0 sue0Var = pjmVar.a;
                ((RideCardDriverSectionView) sue0Var.b).setAlpha(0.0f);
                sue0Var.m(true);
                break;
            case 1:
                r3k0Var.d(null, false);
                pjmVar.a.m(true);
                break;
            case 2:
                r3k0Var.d(null, false);
                pjmVar.a.m(true);
                break;
            case 3:
                r3k0Var.d(Long.valueOf(animator.getDuration()), true);
                pjmVar.a.c();
                break;
            case 4:
                sue0 sue0Var2 = pjmVar.a;
                ((RideCardDriverSectionView) sue0Var2.b).callLayoutInContentAnimations = false;
                r3k0Var.d(250L, true);
                sue0Var2.c();
                break;
            default:
                r3k0Var.d(null, false);
                pjmVar.a.c();
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ijm(r3k0 r3k0Var, pjm pjmVar, int i) {
        this.a = i;
        this.b = r3k0Var;
        this.c = pjmVar;
    }
}
