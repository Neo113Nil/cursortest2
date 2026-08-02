package xsna;

import android.view.View;
import android.widget.ViewAnimator;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.money.MoneyTransfer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z1q implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                FragmentActivity activity = ((a2q) this.c).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 1:
                ((xlu) this.c).getPresenter().i2();
                break;
            case 2:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                t4w t4wVar = gVar.t;
                if (t4wVar == null) {
                    t4wVar = null;
                }
                if (!t4wVar.W0()) {
                    fh5 fh5Var = gVar.w;
                    (fh5Var != null ? fh5Var : null).n0();
                    break;
                }
                break;
            case 3:
                p730 p730Var = (p730) this.c;
                int i = p730.m1;
                rwi.d().e().b(p730Var.requireContext(), MoneyTransfer.n(a0a.d));
                p730Var.dismiss();
                break;
            case 4:
                Object obj = ((vl90) this.c).o;
                ((tl90) (obj != null ? obj : null)).I();
                break;
            case 5:
                ifb0 ifb0Var = (ifb0) this.c;
                ifb0Var.A.refresh();
                ViewAnimator viewAnimator = ifb0Var.F;
                viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(ifb0Var.G));
                break;
            case 6:
                ((com.vk.photo.editor.features.markup.text.a) this.c).K();
                break;
            default:
                mxy0 mxy0Var = (mxy0) this.c;
                if (mxy0Var.g == 1) {
                    mxy0Var.b();
                    break;
                }
                break;
        }
    }
}
