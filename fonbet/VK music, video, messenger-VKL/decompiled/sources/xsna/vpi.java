package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ComposeModalBottomSheet.kt */
/* loaded from: classes17.dex */
public abstract class vpi extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    public vpi() {
        this.G = true;
        this.H = new yh3(7);
    }

    @Override // xsna.dw20
    public final void Nn(FrameLayout frameLayout) {
        ComposeView ao = ao();
        aqw.l(ao, new jai(-380463620, new f9h(this, 1), true));
        dw20.Rn(this, ao, 6);
        ComposeView a = mpi.a(requireContext());
        aqw.l(a, new jai(110373066, new u61(this, 2), true));
        this.v0 = a;
    }

    public void Yn(int i, androidx.compose.runtime.a aVar) {
        aVar.K(304088792);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(304088792, 0, -1, "com.vk.core.compose.modal.ComposeModalBottomSheet.BottomContent (ComposeModalBottomSheet.kt:53)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public abstract void Zn(int i, androidx.compose.runtime.a aVar);

    public ComposeView ao() {
        return mpi.a(requireContext());
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        ComposeView ao = ao();
        aqw.l(ao, new jai(-380463620, new f9h(this, 1), true));
        dw20.Rn(this, ao, 6);
        ComposeView a = mpi.a(requireContext());
        aqw.l(a, new jai(110373066, new u61(this, 2), true));
        this.v0 = a;
        Dialog yn = super.yn(bundle);
        bo((b33) yn);
        return yn;
    }

    public void bo(b33 b33Var) {
    }
}
