package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vkontakte.android.R;
import xsna.gz10;
import xsna.t7a0;
import xsna.u0x;

/* compiled from: GalleryPickerUIConfigurator.kt */
/* loaded from: classes15.dex */
public class k8m0 extends jfl {

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class a implements dba0 {
        @Override // xsna.dba0
        public final ViewPropertyAnimator a(View view, boolean z, boolean z2) {
            return null;
        }
    }

    @Override // xsna.jfl, xsna.b5t
    public final hj1 a() {
        return new ywl0();
    }

    @Override // xsna.jfl, xsna.b5t
    public final s4t b() {
        return new t7a0.b();
    }

    @Override // xsna.jfl, xsna.b5t
    public final int c(Context context, boolean z) {
        if (z) {
            return (int) context.getResources().getDimension(R.dimen.picker_bottom_button_container_height);
        }
        return 0;
    }

    @Override // xsna.jfl, xsna.b5t
    public final gz10 d(Context context, float f, gz10.a aVar) {
        return new m6m0(context, new a(), aVar);
    }

    @Override // xsna.jfl, xsna.b5t
    public final u0x e(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar) {
        return new a5m0(viewGroup, jba0Var, aVar);
    }

    @Override // xsna.jfl, xsna.b5t
    public l5t i() {
        return new j8m0();
    }

    @Override // xsna.jfl, xsna.b5t
    public final GalleryGridSpanStyle k() {
        return GalleryGridSpanStyle.EXACT_COUNT;
    }

    @Override // xsna.jfl, xsna.b5t
    public final boolean l() {
        return false;
    }

    @Override // xsna.jfl
    public final dba0 n() {
        return new a();
    }

    @Override // xsna.jfl, xsna.b5t
    public final boolean f(boolean z) {
        return z;
    }
}
