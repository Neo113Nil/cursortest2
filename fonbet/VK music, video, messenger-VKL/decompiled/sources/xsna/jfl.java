package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vkontakte.android.R;
import xsna.b5t;
import xsna.gz10;
import xsna.u0x;

/* compiled from: GalleryPickerUIConfigurator.kt */
/* loaded from: classes15.dex */
public class jfl implements b5t {

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class a implements s4t {
        @Override // xsna.s4t
        public final RecyclerView.n a(int i, int i2, int i3) {
            return new rfu(i2, i, i3);
        }

        @Override // xsna.s4t
        public final RecyclerView.n b(int i, int i2, Context context) {
            return null;
        }
    }

    @Override // xsna.b5t
    public hj1 a() {
        return new y9l();
    }

    @Override // xsna.b5t
    public s4t b() {
        return new a();
    }

    @Override // xsna.b5t
    public int c(Context context, boolean z) {
        return (int) context.getResources().getDimension(R.dimen.picker_bottom_button_container_height);
    }

    @Override // xsna.b5t
    public gz10 d(Context context, float f, gz10.a aVar) {
        return new gz10(context, f, n(), aVar, 1);
    }

    @Override // xsna.b5t
    public u0x e(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar) {
        return new v0x(viewGroup, jba0Var, aVar);
    }

    @Override // xsna.b5t
    public boolean f(boolean z) {
        return true;
    }

    @Override // xsna.b5t
    public int g() {
        return 0;
    }

    @Override // xsna.b5t
    public int h() {
        return b5t.a.a;
    }

    @Override // xsna.b5t
    public l5t i() {
        return new q7o();
    }

    @Override // xsna.b5t
    public final String j(Context context) {
        return context.getString(R.string.picker_attach_button);
    }

    @Override // xsna.b5t
    public GalleryGridSpanStyle k() {
        return GalleryGridSpanStyle.EXACT_WIDTH;
    }

    @Override // xsna.b5t
    public boolean l() {
        return true;
    }

    @Override // xsna.b5t
    public final GalleryHeaderButtonStyle m() {
        return GalleryHeaderButtonStyle.FULL_ROW;
    }

    public dba0 n() {
        return new fco0();
    }
}
