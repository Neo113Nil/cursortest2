package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: CallDebugMenuFragment.kt */
/* loaded from: classes7.dex */
public final class b29 extends tl50<z19, p29, w19> implements w8i {
    public static final /* synthetic */ int j1 = 0;
    public o29 i1;

    /* compiled from: CallDebugMenuFragment.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new b29();
        }
    }

    /* compiled from: CallDebugMenuFragment.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<w19, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(w19 w19Var) {
            ((z19) this.receiver).C(w19Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_debug_menu, (ViewGroup) null);
        this.e0 = new jgj(inflate, 0, 0, 14);
        this.i1 = new o29(inflate, new b(1, getFeature(), z19.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((p29) ao50Var).a, new ha(this, 10));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.i1 = null;
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        p19 provide = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).t1().provide();
        ea9 wa = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).wa();
        p19 p19Var = provide != null ? provide : null;
        return new z19(provide, wa, p19Var != null ? p19Var.b : null, new com.vk.movika.sdk.base.ui.g0(8), new i4g(requireContext()));
    }
}
