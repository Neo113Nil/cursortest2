package defpackage;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ni00 extends lys {
    public static final /* synthetic */ int a0 = 0;
    public final pav S;
    public final tls T;
    public final i3y U;
    public final i3y V;
    public final i3y W;
    public final i3y Z;

    public ni00(final r4x0 r4x0Var, pav pavVar, tls tlsVar) {
        super(r4x0Var);
        this.S = pavVar;
        this.T = tlsVar;
        final int i = 0;
        this.U = a.a(new sls() { // from class: li00
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                r4x0 r4x0Var2 = r4x0Var;
                switch (i2) {
                    case 0:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_text_padding, r4x0Var2.a));
                    case 1:
                        return Float.valueOf(tje.s(mrg0.component_text_size_caption_secondary, r4x0Var2.a.getContext()));
                    case 2:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_size_old, r4x0Var2.a));
                    default:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_margin_old, r4x0Var2.a));
                }
            }
        });
        final int i2 = 1;
        this.V = a.a(new sls() { // from class: li00
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                r4x0 r4x0Var2 = r4x0Var;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_text_padding, r4x0Var2.a));
                    case 1:
                        return Float.valueOf(tje.s(mrg0.component_text_size_caption_secondary, r4x0Var2.a.getContext()));
                    case 2:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_size_old, r4x0Var2.a));
                    default:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_margin_old, r4x0Var2.a));
                }
            }
        });
        final int i3 = 2;
        this.W = a.a(new sls() { // from class: li00
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                r4x0 r4x0Var2 = r4x0Var;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_text_padding, r4x0Var2.a));
                    case 1:
                        return Float.valueOf(tje.s(mrg0.component_text_size_caption_secondary, r4x0Var2.a.getContext()));
                    case 2:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_size_old, r4x0Var2.a));
                    default:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_margin_old, r4x0Var2.a));
                }
            }
        });
        final int i4 = 3;
        this.Z = a.a(new sls() { // from class: li00
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                r4x0 r4x0Var2 = r4x0Var;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_text_padding, r4x0Var2.a));
                    case 1:
                        return Float.valueOf(tje.s(mrg0.component_text_size_caption_secondary, r4x0Var2.a.getContext()));
                    case 2:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_size_old, r4x0Var2.a));
                    default:
                        return Integer.valueOf(c.d(dug0.discovery_map_category_filter_icon_margin_old, r4x0Var2.a));
                }
            }
        });
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ibc0 ibc0Var = (ibc0) obj;
        r4x0 r4x0Var = (r4x0) ((zo31) this.R);
        RobotoTextView robotoTextView = r4x0Var.c;
        GoLinearLayout goLinearLayout = r4x0Var.a;
        ImageView imageView = r4x0Var.b;
        String str = ibc0Var.d;
        String str2 = ibc0Var.c;
        robotoTextView.setText(str);
        RobotoTextView robotoTextView2 = r4x0Var.c;
        String str3 = ibc0Var.d;
        robotoTextView2.setVisibility(!evu0.J(str3) ? 0 : 8);
        if (evu0.J(str2)) {
            imageView.setVisibility(8);
        } else {
            ((nac) this.S.a(imageView)).c(str2);
            imageView.setVisibility(0);
        }
        if (ibc0Var.h) {
            boolean J = evu0.J(str2);
            i3y i3yVar = this.U;
            robotoTextView2.setPadding(!J ? 0 : ((Number) i3yVar.getValue()).intValue(), 0, ((Number) i3yVar.getValue()).intValue(), 0);
        } else {
            robotoTextView2.setTextSize(((Number) this.V.getValue()).floatValue());
            imageView.setImageTintList(ColorStateList.valueOf(c.c(xng0.textMain, goLinearLayout)));
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                i3y i3yVar2 = this.W;
                layoutParams2.width = ((Number) i3yVar2.getValue()).intValue();
                layoutParams2.height = ((Number) i3yVar2.getValue()).intValue();
                layoutParams2.setMargins(0, 0, ((Number) this.Z.getValue()).intValue(), 0);
                imageView.setLayoutParams(layoutParams2);
            }
        }
        goLinearLayout.setSelected(ibc0Var.i);
        String str4 = ibc0Var.e;
        if (str4 != null) {
            str3 = str4;
        }
        goLinearLayout.setContentDescription(str3);
        mia1.c(goLinearLayout);
        c.z(new g700(2, this, ibc0Var), goLinearLayout);
    }
}
