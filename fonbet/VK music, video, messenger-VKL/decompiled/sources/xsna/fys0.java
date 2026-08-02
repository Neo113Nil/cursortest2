package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.hys0;
import xsna.mk50;

/* compiled from: VideoNotLoadedBottomSheet.kt */
/* loaded from: classes3.dex */
public final class fys0 extends tl50<gys0, lys0, eys0> {
    public static final /* synthetic */ int j1 = 0;
    public gzs<s3q0> i1;

    /* compiled from: VideoNotLoadedBottomSheet.kt */
    public static final class a extends dw20.b {
        public final gzs<s3q0> e;

        public a(Context context, gzs<s3q0> gzsVar) {
            super(context, null);
            this.e = gzsVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            P0();
            O0();
            fys0 fys0Var = new fys0();
            fys0Var.i1 = this.e;
            return fys0Var;
        }
    }

    @Override // xsna.xn50
    @SuppressLint({"InflateParams"})
    public final mk50 Fl() {
        return new mk50.c(LayoutInflater.from(requireContext()).inflate(R.layout.video_not_loaded_layout, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkButton vkButton = (VkButton) view.findViewById(R.id.watch_button);
        if (vkButton != null) {
            bwt0.i0(vkButton, new emh0(this, 18));
        }
        VkButton vkButton2 = (VkButton) view.findViewById(R.id.cancel_button);
        if (vkButton2 != null) {
            bwt0.i0(vkButton2, new z8l0(this, 12));
        }
        View findViewById = view.findViewById(R.id.close_button);
        if (findViewById != null) {
            bwt0.i0(findViewById, new jan0(this, 8));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((gys0) vk50Var).f.a(new gqe0(this, 22), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gys0(new kys0(hys0.a.b));
    }
}
