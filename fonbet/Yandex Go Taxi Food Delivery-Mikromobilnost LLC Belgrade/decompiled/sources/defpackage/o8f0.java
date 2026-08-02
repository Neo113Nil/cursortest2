package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class o8f0 extends x0 {
    public static final /* synthetic */ kgx[] Q = {new PropertyReference1Impl("cardView", 0, "getCardView()Lcom/google/android/material/card/MaterialCardView;", o8f0.class), b64.x(qoi0.a, o8f0.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)};
    public final wv5 N;
    public final wv5 O;
    public final /* synthetic */ p8f0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8f0(p8f0 p8f0Var, View view) {
        super(view);
        this.P = p8f0Var;
        this.N = new wv5(new ged0(view, z9h0.product_logo_card, 25));
        this.O = new wv5(new ged0(view, z9h0.product_logo_image, 26));
    }
}
