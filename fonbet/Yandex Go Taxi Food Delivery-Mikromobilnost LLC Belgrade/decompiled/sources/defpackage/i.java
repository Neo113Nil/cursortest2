package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.view.InterfaceC0134a;

/* loaded from: classes.dex */
public abstract class i {
    public static final tih a = new tih(0);

    public static final boolean a(hev hevVar) {
        int i = h.a[hevVar.w().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return false;
                }
                if ((hevVar.h().a() != null || !(hevVar.z() instanceof n0k)) && (!(hevVar.B() instanceof nv31) || !(hevVar.z() instanceof InterfaceC0134a) || !(((nv31) hevVar.B()).getView() instanceof ImageView) || ((nv31) hevVar.B()).getView() != ((qdi0) ((InterfaceC0134a) hevVar.z())).b())) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Drawable b(hev hevVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return nga1.d(num.intValue(), hevVar.e());
    }
}
