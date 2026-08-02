package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vkontakte.android.R;
import xsna.gz10;
import xsna.t7a0;

/* compiled from: GalleryPickerUIConfigurator.kt */
/* loaded from: classes15.dex */
public final class tme extends jfl {

    /* compiled from: GalleryPickerUIConfigurator.kt */
    public static final class a implements dba0 {
        @Override // xsna.dba0
        public final ViewPropertyAnimator a(View view, boolean z, boolean z2) {
            return null;
        }
    }

    @Override // xsna.jfl, xsna.b5t
    public final hj1 a() {
        return new sme();
    }

    @Override // xsna.jfl, xsna.b5t
    public final s4t b() {
        return new t7a0.b();
    }

    @Override // xsna.jfl, xsna.b5t
    public final gz10 d(Context context, float f, gz10.a aVar) {
        dhr0.a.getClass();
        lpj lpjVar = new lpj(context, dhr0.u().c);
        gle gleVar = new gle(R.layout.clips_picker_layout_image_item, lpjVar, 0, 1.525238f, new a(), aVar);
        int b = dm10.b(R.attr.vk_ui_text_primary_invariably, -16777216, lpjVar);
        TextView textView = gleVar.r;
        textView.setTextColor(b);
        textView.setBackground(m33.a(R.drawable.picker_bg_circle_white, lpjVar));
        gleVar.o.x = null;
        return gleVar;
    }

    @Override // xsna.jfl, xsna.b5t
    public final l5t i() {
        return new d370(14);
    }

    @Override // xsna.jfl, xsna.b5t
    public final GalleryGridSpanStyle k() {
        return GalleryGridSpanStyle.EXACT_COUNT;
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
