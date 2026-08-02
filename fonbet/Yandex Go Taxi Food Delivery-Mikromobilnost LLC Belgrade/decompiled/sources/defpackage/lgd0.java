package defpackage;

import android.widget.ImageButton;
import android.widget.TextView;
import com.yandex.plus.glide.b;
import com.yandex.plus.pay.ui.core.mobile.view.PlusPayAvatarImageView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class lgd0 {
    public static final /* synthetic */ kgx[] f = {new PropertyReference1Impl("avatarImage", 0, "getAvatarImage()Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayAvatarImageView;", lgd0.class), b64.x(qoi0.a, lgd0.class, "loginText", "getLoginText()Landroid/widget/TextView;", 0), new PropertyReference1Impl("closeButton", 0, "getCloseButton()Landroid/widget/ImageButton;", lgd0.class)};
    public final b5d0 a;
    public final sls b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;

    public lgd0(PlusPayToolbarView plusPayToolbarView, b5d0 b5d0Var, sls slsVar) {
        this.a = b5d0Var;
        this.b = slsVar;
        this.c = new wv5(new ged0(plusPayToolbarView, y9h0.plus_pay_toolbar_avatar_image, 7));
        this.d = new wv5(new ged0(plusPayToolbarView, y9h0.plus_pay_toolbar_login_text, 8));
        this.e = new wv5(new ged0(plusPayToolbarView, y9h0.plus_pay_toolbar_close_button, 9));
        plusPayToolbarView.getContext();
        b().setGradientDrawable(t2d0.a());
    }

    public final void a(kgd0 kgd0Var) {
        ggd0 ggd0Var = kgd0Var.a;
        if (ggd0Var instanceof fgd0) {
            fgd0 fgd0Var = (fgd0) ggd0Var;
            b().setPlusStroked(fgd0Var.b);
            b().setVisibility(0);
            ((b) this.a).b(fgd0Var.a).b(b());
        } else {
            if (!(ggd0Var instanceof dgd0) && !(ggd0Var instanceof egd0)) {
                w511.b();
                return;
            }
            b().setVisibility(4);
        }
        jgd0 jgd0Var = kgd0Var.b;
        boolean z = jgd0Var instanceof hgd0;
        kgx[] kgxVarArr = f;
        wv5 wv5Var = this.d;
        if (z) {
            ((TextView) wv5Var.a(kgxVarArr[1])).setVisibility(4);
        } else if (!(jgd0Var instanceof igd0)) {
            w511.b();
            return;
        } else {
            ((TextView) wv5Var.a(kgxVarArr[1])).setText(((igd0) jgd0Var).a);
            ((TextView) wv5Var.a(kgxVarArr[1])).setVisibility(0);
        }
        bb1.L((ImageButton) this.e.a(kgxVarArr[2]), new d5b0(11, this));
    }

    public final PlusPayAvatarImageView b() {
        return (PlusPayAvatarImageView) this.c.a(f[0]);
    }
}
