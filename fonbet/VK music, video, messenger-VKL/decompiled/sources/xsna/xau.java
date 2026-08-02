package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;

/* compiled from: GradientBubbleDecoration.kt */
/* loaded from: classes2.dex */
public final class xau {
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final LayerDrawable e;
    public final LayerDrawable f;

    /* compiled from: GradientBubbleDecoration.kt */
    public static final class a {
        public static final LayerDrawable a(boolean z) {
            Drawable d = z ? dhr0.t.d(R.attr.vkim_msg_out_def_top) : dhr0.t.d(R.attr.vkim_msg_out_def_full);
            if (d == null) {
                return null;
            }
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) e43.l(d, new nh30(true)).toArray(new Drawable[0]));
            layerDrawable.setLayerGravity(1, 53);
            layerDrawable.setLayerInsetTop(0, iah0.a(4.2f));
            layerDrawable.setLayerInsetRight(1, iah0.a(12.0f));
            return layerDrawable;
        }
    }

    public xau() {
        this(0);
    }

    public xau(int i) {
        abg0 abg0Var = dhr0.t;
        Drawable d = abg0Var.d(R.attr.vkim_msg_out_def_full);
        Drawable d2 = abg0Var.d(R.attr.vkim_msg_out_def_top);
        Drawable d3 = abg0Var.d(R.attr.vkim_msg_out_def_mid);
        Drawable d4 = abg0Var.d(R.attr.vkim_msg_out_def_bottom);
        LayerDrawable a2 = a.a(true);
        LayerDrawable a3 = a.a(false);
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = a2;
        this.f = a3;
    }
}
