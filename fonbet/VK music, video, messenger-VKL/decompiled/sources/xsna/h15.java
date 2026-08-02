package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;

/* compiled from: AudiobookPersonIconToCollapsingToolbar.kt */
/* loaded from: classes16.dex */
public final class h15 implements too0 {
    public final LayerDrawable b;
    public final Drawable c;
    public final LayerDrawable d;
    public final LayerDrawable e;

    public h15() {
        LayerDrawable layerDrawable;
        Drawable drawable;
        abg0 abg0Var = dhr0.t;
        Drawable a = abg0Var.a(R.drawable.audiobook_person_arrow_back_toolbar);
        LayerDrawable layerDrawable2 = null;
        if (a != null) {
            layerDrawable = (LayerDrawable) a;
            layerDrawable.findDrawableByLayerId(R.id.arrow).setTint(-1);
        } else {
            layerDrawable = null;
        }
        this.b = layerDrawable;
        Drawable a2 = abg0Var.a(R.drawable.vk_icon_arrow_left_outline_28);
        if (a2 == null || (drawable = a2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(abg0Var.c(R.attr.vk_ui_icon_accent_themed));
        }
        this.c = drawable;
        Drawable a3 = abg0Var.a(R.drawable.audiobook_person_menu_toolbar);
        if (a3 != null) {
            layerDrawable2 = (LayerDrawable) a3;
            layerDrawable2.findDrawableByLayerId(R.id.menu).setTint(-1);
        }
        this.d = layerDrawable2;
        LayerDrawable layerDrawable3 = new LayerDrawable(new Drawable[]{drawable, layerDrawable});
        layerDrawable3.setLayerGravity(0, 17);
        this.e = layerDrawable3;
    }

    @Override // xsna.too0
    public final void Ng() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTint(dhr0.t.c(R.attr.vk_ui_icon_accent_themed));
        }
    }
}
