package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class n8a0 extends d9a0 {
    public static final /* synthetic */ kgx[] Z = {new PropertyReference1Impl("methodIcon", 0, "getMethodIcon()Landroid/widget/ImageView;", n8a0.class), b64.x(qoi0.a, n8a0.class, "methodTextView", "getMethodTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("methodAdditionalTextView", 0, "getMethodAdditionalTextView()Landroid/widget/TextView;", n8a0.class), new PropertyReference1Impl("methodPromoTextView", 0, "getMethodPromoTextView()Landroid/widget/TextView;", n8a0.class), new PropertyReference1Impl("selectedIcon", 0, "getSelectedIcon()Landroid/widget/ImageView;", n8a0.class), new PropertyReference1Impl("divider", 0, "getDivider()Landroid/view/View;", n8a0.class)};
    public final PlusTheme N;
    public final b5d0 O;
    public final tls P;
    public final wv5 Q;
    public final wv5 R;
    public final wv5 S;
    public final wv5 T;
    public final wv5 U;
    public final wv5 V;
    public ked0 W;

    public n8a0(View view, PlusTheme plusTheme, b5d0 b5d0Var, gv40 gv40Var) {
        super(view);
        this.N = plusTheme;
        this.O = b5d0Var;
        this.P = gv40Var;
        this.Q = new wv5(new a450(view, y9h0.payment_method_icon, 9));
        this.R = new wv5(new a450(view, y9h0.payment_method_text, 10));
        wv5 wv5Var = new wv5(new a450(view, y9h0.payment_method_additional_info_text, 11));
        this.S = wv5Var;
        wv5 wv5Var2 = new wv5(new a450(view, y9h0.payment_method_promo_text, 12));
        this.T = wv5Var2;
        this.U = new wv5(new a450(view, y9h0.payment_method_selected_icon, 13));
        this.V = new wv5(new a450(view, y9h0.payment_card_divider, 14));
        X().setBackground(msa1.o(new ColorDrawable(bb1.o(sng0.pay_sdk_secondaryBlockColor, view)), view.getContext().getResources().getDimension(pvg0.pay_sdk_payment_methods_icon_corner_radius)));
        view.setBackground(new ColorDrawable(0));
        bb1.L(view, new zgv(29, this));
        kgx[] kgxVarArr = Z;
        ((TextView) wv5Var.a(kgxVarArr[2])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        ((TextView) wv5Var2.a(kgxVarArr[3])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    @Override // defpackage.d9a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(b9a0 b9a0Var, boolean z) {
        Integer num;
        PlusThemedColor plusThemedColor;
        boolean z2;
        int i;
        jed0 jed0Var;
        if (!(b9a0Var instanceof z8a0)) {
            ny61.g("item must be PaymentMethodsAdapter.Item.PaymentMethod");
            return;
        }
        ked0 ked0Var = ((z8a0) b9a0Var).a;
        this.W = ked0Var;
        PlusThemedColor plusThemedColor2 = ked0Var.h;
        Integer num2 = null;
        PlusTheme plusTheme = this.N;
        View view = this.a;
        if (plusThemedColor2 != null) {
            PlusColor plusColor = (PlusColor) (tpd0.a(view.getContext(), plusTheme) ? plusThemedColor2.getDark() : plusThemedColor2.getLight());
            if (plusColor != null) {
                num = Integer.valueOf(s2d0.g(plusColor));
                plusThemedColor = ked0Var.i;
                if (plusThemedColor != null) {
                    PlusColor plusColor2 = (PlusColor) (tpd0.a(view.getContext(), plusTheme) ? plusThemedColor.getDark() : plusThemedColor.getLight());
                    if (plusColor2 != null) {
                        num2 = Integer.valueOf(s2d0.g(plusColor2));
                    }
                }
                ied0 ied0Var = ked0Var.c;
                z2 = ied0Var.b;
                boolean z3 = ied0Var.a;
                kgx[] kgxVarArr = Z;
                kgx kgxVar = kgxVarArr[4];
                wv5 wv5Var = this.U;
                ImageView imageView = (ImageView) wv5Var.a(kgxVar);
                if (!z2) {
                    int o = bb1.o(sng0.pay_sdk_secondaryTextColor, view);
                    ((ImageView) wv5Var.a(kgxVarArr[4])).setImageResource(lxg0.pay_sdk_ic_next_arrow);
                    ((ImageView) wv5Var.a(kgxVarArr[4])).setImageTintList(ColorStateList.valueOf(o));
                } else if (!ked0Var.b || z3) {
                    i = 4;
                    imageView.setVisibility(i);
                    ((View) this.V.a(kgxVarArr[5])).setVisibility(z ? 0 : 4);
                    kgx kgxVar2 = kgxVarArr[1];
                    wv5 wv5Var2 = this.R;
                    ((TextView) wv5Var2.a(kgxVar2)).setText(ked0Var.d);
                    v3a1.c((TextView) this.S.a(kgxVarArr[2]), ked0Var.e);
                    v3a1.c((TextView) this.T.a(kgxVarArr[3]), ked0Var.f);
                    jed0Var = ked0Var.g;
                    if (jed0Var != null) {
                        Context context = view.getContext();
                        PlusThemedImage plusThemedImage = jed0Var.a;
                        Object dark = tpd0.a(context, plusTheme) ? plusThemedImage.getDark() : plusThemedImage.getLight();
                        X().setVisibility(0);
                        ((b) this.O).b((String) dark).b(X());
                    } else {
                        if (jed0Var != null) {
                            w511.b();
                            return;
                        }
                        X().setVisibility(8);
                    }
                    if (num != null) {
                        ((TextView) wv5Var2.a(kgxVarArr[1])).setTextColor(num.intValue());
                    }
                    if (num2 != null) {
                        view.setBackgroundColor(num2.intValue());
                        return;
                    }
                    return;
                }
                i = 0;
                imageView.setVisibility(i);
                ((View) this.V.a(kgxVarArr[5])).setVisibility(z ? 0 : 4);
                kgx kgxVar22 = kgxVarArr[1];
                wv5 wv5Var22 = this.R;
                ((TextView) wv5Var22.a(kgxVar22)).setText(ked0Var.d);
                v3a1.c((TextView) this.S.a(kgxVarArr[2]), ked0Var.e);
                v3a1.c((TextView) this.T.a(kgxVarArr[3]), ked0Var.f);
                jed0Var = ked0Var.g;
                if (jed0Var != null) {
                }
                if (num != null) {
                }
                if (num2 != null) {
                }
            }
        }
        num = null;
        plusThemedColor = ked0Var.i;
        if (plusThemedColor != null) {
        }
        ied0 ied0Var2 = ked0Var.c;
        z2 = ied0Var2.b;
        boolean z32 = ied0Var2.a;
        kgx[] kgxVarArr2 = Z;
        kgx kgxVar3 = kgxVarArr2[4];
        wv5 wv5Var3 = this.U;
        ImageView imageView2 = (ImageView) wv5Var3.a(kgxVar3);
        if (!z2) {
        }
        i = 0;
        imageView2.setVisibility(i);
        ((View) this.V.a(kgxVarArr2[5])).setVisibility(z ? 0 : 4);
        kgx kgxVar222 = kgxVarArr2[1];
        wv5 wv5Var222 = this.R;
        ((TextView) wv5Var222.a(kgxVar222)).setText(ked0Var.d);
        v3a1.c((TextView) this.S.a(kgxVarArr2[2]), ked0Var.e);
        v3a1.c((TextView) this.T.a(kgxVarArr2[3]), ked0Var.f);
        jed0Var = ked0Var.g;
        if (jed0Var != null) {
        }
        if (num != null) {
        }
        if (num2 != null) {
        }
    }

    public final ImageView X() {
        return (ImageView) this.Q.a(Z[0]);
    }
}
