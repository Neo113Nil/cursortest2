package xsna;

import android.os.Bundle;
import android.view.View;
import kotlin.LazyThreadSafetyMode;
import xsna.mk50;

/* compiled from: HideAppContentBottomSheet.kt */
/* loaded from: classes15.dex */
public final class y2v extends tl50<a3v, l3v, x2v> implements w8i {
    public static final /* synthetic */ int m1 = 0;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public k3v l1;

    /* compiled from: HideAppContentBottomSheet.kt */
    public static final class a extends kmu0 {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new y2v();
        }
    }

    public y2v() {
        u3k u3kVar = new u3k(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, u3kVar);
        this.j1 = msy.a(lazyThreadSafetyMode, new w8q(this, 8));
        this.k1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.a(11));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        k3v k3vVar = new k3v(requireContext(), this);
        vq.b(-1, -2, k3vVar.d);
        this.l1 = k3vVar;
        return new mk50.c(k3vVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        l3v l3vVar = (l3v) ao50Var;
        this.e0 = new jgj(view, 0, 0, 62);
        k3v k3vVar = this.l1;
        if (k3vVar != null) {
            k3vVar.f(l3vVar, new z2v(1, getFeature(), a3v.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
        }
        getFeature().h.a(new omf(this, 26), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.l1 = null;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new a3v((p97) this.i1.getValue(), r57.b().a());
    }
}
