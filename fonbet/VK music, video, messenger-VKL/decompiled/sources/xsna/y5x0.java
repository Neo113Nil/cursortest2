package xsna;

import android.os.Bundle;
import android.view.View;
import com.vkontakte.android.R;
import xsna.f6x0;
import xsna.gm50;
import xsna.m5x0;
import xsna.mk50;

/* compiled from: VoipVmojiFragment.kt */
/* loaded from: classes7.dex */
public final class y5x0 extends tl50<v5x0, h6x0, m5x0> {
    public static final /* synthetic */ int l1 = 0;
    public f6x0 i1;
    public g6x0 j1;
    public va9 k1;

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_vmoji_configure_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h6x0 h6x0Var = (h6x0) ao50Var;
        g6x0 g6x0Var = new g6x0(requireContext(), getFeature());
        f6x0 f6x0Var = new f6x0(view, g6x0Var, this.k1);
        gm50.a.b(this, h6x0Var.a, new mvl0(f6x0Var, 23));
        gm50.a.b(this, h6x0Var.b, new wgm0(f6x0Var, 23));
        gm50.a.b(this, h6x0Var.c, new q3s0(f6x0Var, 8));
        gm50.a.b(this, h6x0Var.f, new e0w0(f6x0Var, 7));
        gm50.a.b(this, h6x0Var.d, new qjm0(f6x0Var, 16));
        gm50.a.b(this, h6x0Var.e, new l1k0(12, f6x0Var, this));
        gm50.a.b(this, h6x0Var.g, new w5x0(this, 0));
        this.i1 = f6x0Var;
        this.j1 = g6x0Var;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.k1 == null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar;
        f6x0 f6x0Var = this.i1;
        if (f6x0Var != null) {
            f6x0Var.o.dispose();
            f6x0.c cVar2 = f6x0Var.f;
            if (cVar2 != null && (cVar = cVar2.c) != null) {
                cVar.dispose();
            }
            f6x0Var.f = null;
        }
        this.i1 = null;
        g6x0 g6x0Var = this.j1;
        if (g6x0Var != null) {
            g6x0Var.d.dispose();
        }
        this.j1 = null;
        super.onDestroyView();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(m5x0.f.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new v5x0(this.k1);
    }
}
