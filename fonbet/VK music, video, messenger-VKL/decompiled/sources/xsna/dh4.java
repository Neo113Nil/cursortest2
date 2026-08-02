package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dh4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hh4 hh4Var = (hh4) this.d;
                ((qh4) hh4Var.c.getValue()).F(this.c, ((b25) hh4Var.b.getValue()).c(), false);
                break;
            default:
                TextView textView = (TextView) this.d;
                Drawable drawable = (Drawable) obj;
                if (drawable == null) {
                    break;
                } else {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.c, PorterDuff.Mode.SRC_ATOP));
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    break;
                }
        }
        return s3q0.a;
    }
}
