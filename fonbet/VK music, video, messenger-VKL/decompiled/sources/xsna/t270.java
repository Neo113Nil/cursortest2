package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.mk50;
import xsna.v270;

/* compiled from: NoMemoryBottomSheet.kt */
/* loaded from: classes3.dex */
public final class t270 extends tl50<u270, z270, s270> implements w8i {
    public static final /* synthetic */ int j1 = 0;
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new io60(this, 4));

    /* compiled from: NoMemoryBottomSheet.kt */
    public static final class a extends dw20.b {
        public final boolean e;

        public a(Context context, boolean z) {
            super(context, null);
            this.e = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            P0();
            O0();
            if (this.e) {
                dhr0.a.getClass();
                u0(dhr0.u().c);
            }
            return new t270();
        }
    }

    @Override // xsna.xn50
    @SuppressLint({"InflateParams"})
    public final mk50 Fl() {
        return new mk50.c(LayoutInflater.from(this.A0 == -1 ? requireContext() : new ContextThemeWrapper(requireContext(), this.A0)).inflate(R.layout.no_memory_layout, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        View findViewById = view.findViewById(R.id.go_to_button);
        if (findViewById != null) {
            bwt0.i0(findViewById, new lxz(this, 11));
        }
        View findViewById2 = view.findViewById(R.id.close_button);
        if (findViewById2 != null) {
            bwt0.i0(findViewById2, new c230(this, 6));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((u270) vk50Var).g.a(new owv(this, 18), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new u270(fxc0.B().s(), new y270(v270.a.b));
    }
}
