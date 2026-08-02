package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vkontakte.android.R;
import xsna.fox0;
import xsna.gm50;
import xsna.mk50;
import xsna.xn50;

/* compiled from: WidgetSettingsTabFragment.kt */
/* loaded from: classes6.dex */
public final class hox0 extends yk50<gox0, mox0, fox0> implements zc80 {
    public RecyclerView i;
    public rnx0 j;

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_widget_settings_tab);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((mox0) ao50Var).a, new cbt0(this, 16));
        this.i = (RecyclerView) view.findViewById(R.id.widgets_recycler_view);
        rnx0 rnx0Var = new rnx0(this);
        this.j = rnx0Var;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(rnx0Var);
        bwt0.p0(view.findViewById(R.id.shadow), false);
        RecyclerView recyclerView2 = this.i;
        f4m.t(0, recyclerView2 != null ? recyclerView2 : null);
    }

    @Override // xsna.zc80
    public final void Zc(tnx0 tnx0Var, boolean z) {
        xn50.a.c(this, new fox0.a(tnx0Var, z));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Fragment parentFragment = getParentFragment();
        dw20 dw20Var = parentFragment instanceof dw20 ? (dw20) parentFragment : null;
        if (dw20Var != null) {
            dw20Var.Un(new uxb0(this, 22));
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gox0(new kox0(new iox0(requireContext())), ((SuperAppServicesComponent) m7m.d(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).Tb());
    }
}
