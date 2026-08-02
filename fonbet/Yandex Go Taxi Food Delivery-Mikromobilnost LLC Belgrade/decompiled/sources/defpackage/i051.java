package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.ui.selector.a;
import java.util.HashMap;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class i051 extends sb5 {
    public final g051 R;
    public final pav S;
    public final bbx0 T;
    public final k051 U;
    public final h051 V;
    public final ImageView W;
    public final RobotoTextView Z;
    public final AppCompatImageView a0;
    public final TextView b0;
    public final a c0;
    public rb5 d0;
    public boolean e0;

    public i051(View view, g051 g051Var, pav pavVar, bbx0 bbx0Var, k051 k051Var, h051 h051Var, hbp0 hbp0Var, f1f0 f1f0Var, c cVar, com.yandex.go.taxi.summary.shared.lifecycle.a aVar) {
        super(view, cVar, aVar);
        this.R = g051Var;
        this.S = pavVar;
        this.T = bbx0Var;
        this.U = k051Var;
        this.V = h051Var;
        this.W = (ImageView) view.findViewById(vfh0.wide_tariff_class_icon);
        this.Z = (RobotoTextView) view.findViewById(vfh0.wide_tariff_title);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(vfh0.wide_tariff_surge_icon);
        this.a0 = appCompatImageView;
        this.b0 = (TextView) view.findViewById(vfh0.wide_tariff_modifier);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(vfh0.wide_tariff_touch_area);
        this.d0 = rb5.a;
        this.e0 = true;
        g051Var.B(view);
        ru.yandex.taxi.design.utils.c.z(new hh31(16, view, this), viewGroup);
        this.c0 = new a(f1f0Var, bbx0Var, hbp0Var, (RobotoTextView) view.findViewById(vfh0.wide_tariff_cost), (RobotoTextView) view.findViewById(vfh0.wide_tariff_original_cost), appCompatImageView, (AppCompatImageView) view.findViewById(vfh0.wide_tariff_antisurge_icon));
    }

    @Override // defpackage.sb5
    public final void X() {
        this.a0.animate().cancel();
        this.W.animate().cancel();
    }

    @Override // defpackage.sb5
    public final void a0(elx0 elx0Var, elx0 elx0Var2) {
        boolean z;
        View view = this.a;
        boolean isSelected = view.isSelected();
        boolean z2 = elx0Var2.u;
        boolean z3 = elx0Var2.w;
        view.setSelected(z2);
        this.c0.e(elx0Var2.P);
        String str = elx0Var2.f;
        if (str == null) {
            str = "";
        }
        RobotoTextView robotoTextView = this.Z;
        robotoTextView.setText(str);
        robotoTextView.setContentDescription(cvu0.v(view.getContext().getString(kyh0.pool_tariff_title), CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, str, false));
        robotoTextView.setTextTypeface(z2 ? 3 : 0);
        bbx0 bbx0Var = this.T;
        robotoTextView.setTextColor(z2 ? bbx0Var.c : bbx0Var.d);
        String str2 = elx0Var2.O;
        ImageView imageView = this.W;
        if (z2 || !z3) {
            pav pavVar = this.S;
            if (str2 == null || str2.length() == 0) {
                pavVar.c(imageView);
            } else {
                ((nac) pavVar.a(imageView)).c(str2);
            }
            if (!z2 || this.e0 || isSelected) {
                float f = z2 ? 1.0f : bbx0Var.b;
                imageView.setVisibility(0);
                imageView.setAlpha(f);
            } else {
                ViewPropertyAnimator animate = imageView.animate();
                animate.cancel();
                imageView.setVisibility(0);
                animate.alpha(1.0f).setDuration(300L).setStartDelay(250L);
            }
        } else {
            imageView.setVisibility(8);
            imageView.setAlpha(0.0f);
        }
        CharSequence charSequence = (CharSequence) elx0Var2.t.get(Boolean.valueOf(elx0Var2.u));
        String obj = charSequence != null ? charSequence.toString() : null;
        TextView textView = this.b0;
        if (obj == null || obj.length() == 0) {
            textView.setVisibility(8);
        } else {
            if (obj.length() == 0) {
                z = true;
            } else {
                String obj2 = obj.toString();
                h051 h051Var = this.V;
                Boolean bool = (Boolean) h051Var.a.get(obj2);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    boolean z4 = new StaticLayout(obj, textView.getPaint(), (int) (((float) textView.getMaxWidth()) * 0.95f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1;
                    h051Var.a.put(obj2, Boolean.valueOf(z4));
                    z = z4;
                }
            }
            if (z) {
                textView.setVisibility(0);
                textView.setText(obj);
            } else {
                textView.setVisibility(8);
                String str3 = elx0Var2.b;
                k051 k051Var = this.U;
                if (k051Var.b.add(obj)) {
                    nnx0 nnx0Var = k051Var.a;
                    nnx0Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (str3 != null) {
                        hashMap.put("tariffClass", str3);
                    }
                    nnx0Var.a.a("TariffSelector.TextModifier.Hidden", hashMap, 1, tse0.r("modifier_text", hashMap, obj));
                }
            }
        }
        if (z2 || !z3) {
            view.setBackground((Drawable) bbx0Var.e.invoke());
        } else {
            view.setBackground((Drawable) bbx0Var.g.invoke());
        }
        this.R.t(elx0Var2);
        this.e0 = false;
    }

    @Override // defpackage.sb5
    public final void b0(rb5 rb5Var) {
        this.d0 = rb5Var;
    }
}
