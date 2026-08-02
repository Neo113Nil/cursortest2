package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView;
import com.yandex.plus.pay.ui.core.mobile.view.PlusPayResizableSwitch;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class m9f0 {
    public static final /* synthetic */ kgx[] l = {new PropertyReference1Impl("contentView", 0, "getContentView()Landroidx/constraintlayout/widget/ConstraintLayout;", m9f0.class), b64.x(qoi0.a, m9f0.class, "iconImageView", "getIconImageView()Landroid/widget/ImageView;", 0), new PropertyReference1Impl("switch", 0, "getSwitch()Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayResizableSwitch;", m9f0.class), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", m9f0.class), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", m9f0.class), new PropertyReference1Impl("benefitsRecycler", 0, "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", m9f0.class)};
    public final ProductView a;
    public final b5d0 b;
    public final n4u0 c;
    public final tls d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final c7f0 k;

    public m9f0(ProductView productView, b5d0 b5d0Var, n4u0 n4u0Var, tls tlsVar) {
        this.a = productView;
        this.b = b5d0Var;
        this.c = n4u0Var;
        this.d = tlsVar;
        this.e = new wv5(new ged0(productView, z9h0.product_card_root, 27));
        this.f = new wv5(new ged0(productView, z9h0.product_icon, 28));
        this.g = new wv5(new ged0(productView, z9h0.product_switch, 29));
        this.h = new wv5(new l9f0(productView, z9h0.product_title, 0));
        this.i = new wv5(new l9f0(productView, z9h0.product_subtitle, 1));
        wv5 wv5Var = new wv5(new l9f0(productView, z9h0.product_benefits, 2));
        this.j = wv5Var;
        c7f0 c7f0Var = new c7f0();
        this.k = c7f0Var;
        ((RecyclerView) wv5Var.a(l[5])).setAdapter(c7f0Var);
        b().setOnCheckedChangeListener(new vpb(3, this));
    }

    public final ImageView a() {
        return (ImageView) this.f.a(l[1]);
    }

    public final PlusPayResizableSwitch b() {
        return (PlusPayResizableSwitch) this.g.a(l[2]);
    }

    public final void c(o7f0 o7f0Var) {
        Boolean bool = o7f0Var.f;
        List<Object> list = o7f0Var.e;
        ImageView a = a();
        b bVar = (b) this.b;
        bVar.a(a);
        kgx[] kgxVarArr = l;
        ((ConstraintLayout) this.e.a(kgxVarArr[0])).setAlpha(o7f0Var.g ? 0.5f : 1.0f);
        PlusTheme plusTheme = (PlusTheme) this.c.getValue();
        Context context = this.a.getContext();
        PlusThemedImage plusThemedImage = o7f0Var.b;
        String str = (String) (tpd0.a(context, plusTheme) ? plusThemedImage.getDark() : plusThemedImage.getLight());
        if (str != null) {
            bVar.b(str).b(a());
            a().setVisibility(0);
        } else {
            a().setVisibility(8);
        }
        TextView textView = (TextView) this.h.a(kgxVarArr[3]);
        String str2 = o7f0Var.c;
        String str3 = null;
        if (str2 == null || evu0.J(str2)) {
            str2 = null;
        }
        v3a1.c(textView, str2);
        TextView textView2 = (TextView) this.i.a(kgxVarArr[4]);
        String str4 = o7f0Var.d;
        if (str4 != null && !evu0.J(str4)) {
            str3 = str4;
        }
        v3a1.c(textView2, str3);
        boolean isEmpty = list.isEmpty();
        wv5 wv5Var = this.j;
        if (isEmpty) {
            ((RecyclerView) wv5Var.a(kgxVarArr[5])).setVisibility(8);
        } else {
            this.k.submitList(list);
            ((RecyclerView) wv5Var.a(kgxVarArr[5])).setVisibility(0);
        }
        if (bool == null) {
            b().setVisibility(8);
        } else {
            b().setChecked(bool.booleanValue());
            b().setVisibility(0);
        }
    }
}
