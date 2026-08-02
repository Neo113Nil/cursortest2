package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.ContextThemeWrapper;

/* loaded from: classes5.dex */
public final class a87 implements s9e0 {
    public final Activity a;

    public a87(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.s9e0
    public final Drawable a() {
        int i = f1h0.ic_point_24;
        Drawable t = vng.t(i, new ContextThemeWrapper(this.a, a2i0.IconGray550Normal));
        if (t != null) {
            return t;
        }
        w511.f(oyr.j(i, "Drawable resource ", " not found"));
        return null;
    }

    @Override // defpackage.s9e0
    public final Drawable source() {
        int i = f1h0.ic_point_24;
        Drawable t = vng.t(i, new ContextThemeWrapper(this.a, a2i0.IconCinnabarToxicNormal));
        if (t != null) {
            return t;
        }
        w511.f(oyr.j(i, "Drawable resource ", " not found"));
        return null;
    }
}
