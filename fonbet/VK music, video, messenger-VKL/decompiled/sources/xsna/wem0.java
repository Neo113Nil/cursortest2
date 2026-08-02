package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

/* compiled from: StoryStatisticsHeaderDelegate.kt */
/* loaded from: classes6.dex */
public final class wem0 extends p1u0<hfz> {
    public final wrl0 a;

    public wem0(wrl0 wrl0Var) {
        this.a = wrl0Var;
    }

    @Override // xsna.p1u0
    public final void a(vfz<hfz> vfzVar, hfz hfzVar, List<? extends Object> list) {
        vfzVar.W5(hfzVar);
    }

    @Override // xsna.p1u0
    public final vfz<? extends hfz> b(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new yem0(composeView, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof zem0;
    }
}
