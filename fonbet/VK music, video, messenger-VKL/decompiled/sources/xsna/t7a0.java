package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vkontakte.android.R;
import xsna.b5t;
import xsna.gz10;
import xsna.u0x;

/* compiled from: GalleryPickerUIConfigurator.kt */
/* loaded from: classes15.dex */
public class t7a0 implements b5t {

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class a implements s4t {
        @Override // xsna.s4t
        public final RecyclerView.n a(int i, int i2, int i3) {
            return new jgu(i, cn70.b(2), false, i3);
        }

        @Override // xsna.s4t
        public final RecyclerView.n b(int i, int i2, Context context) {
            return new kfu(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, context);
        }
    }

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class b implements s4t {
        @Override // xsna.s4t
        public final RecyclerView.n a(int i, int i2, int i3) {
            return new jgu(i, cn70.b(2), false, i3);
        }

        @Override // xsna.s4t
        public final RecyclerView.n b(int i, int i2, Context context) {
            return new kfu(10.0f, i, i2, context);
        }
    }

    @Override // xsna.b5t
    public final hj1 a() {
        return new p7a0();
    }

    @Override // xsna.b5t
    public final s4t b() {
        return new a();
    }

    @Override // xsna.b5t
    public final int c(Context context, boolean z) {
        if (!z) {
            return 0;
        }
        Resources resources = context.getResources();
        return (int) (resources.getDimension(R.dimen.picker_preview_height) + resources.getDimension(R.dimen.picker_bottom_button_container_height));
    }

    @Override // xsna.b5t
    public final gz10 d(Context context, float f, gz10.a aVar) {
        z7a0 z7a0Var = new z7a0(context, f, new xo9(), aVar, 1);
        z7a0Var.o.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        bwt0.p0(z7a0Var.p, false);
        z7a0Var.r.setBackground(krv0.e(R.drawable.picker_bg_accent_circle, context));
        return z7a0Var;
    }

    @Override // xsna.b5t
    public final u0x e(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar) {
        return new v0x(viewGroup, jba0Var, aVar);
    }

    @Override // xsna.b5t
    public final int g() {
        return 0;
    }

    @Override // xsna.b5t
    public final int h() {
        return b5t.a.a;
    }

    @Override // xsna.b5t
    public final l5t i() {
        return new u7a0();
    }

    @Override // xsna.b5t
    public String j(Context context) {
        return context.getString(R.string.picker_attach_button_upload);
    }

    @Override // xsna.b5t
    public final GalleryGridSpanStyle k() {
        return GalleryGridSpanStyle.EXACT_COUNT;
    }

    @Override // xsna.b5t
    public final boolean l() {
        return true;
    }

    @Override // xsna.b5t
    public final GalleryHeaderButtonStyle m() {
        return GalleryHeaderButtonStyle.SINGLE_SPAN;
    }

    @Override // xsna.b5t
    public final boolean f(boolean z) {
        return z;
    }
}
