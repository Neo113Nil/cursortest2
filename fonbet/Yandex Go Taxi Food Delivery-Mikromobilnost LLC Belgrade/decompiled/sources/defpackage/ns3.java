package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class ns3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;

    public /* synthetic */ ns3(n70 n70Var, int i) {
        this.a = i;
        this.b = n70Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 createMonthAdapter$lambda$9$lambda$8;
        zy11 viewBinding$lambda$27$lambda$22$lambda$21;
        zy11 viewBinding$lambda$27$lambda$19$lambda$18;
        zy11 viewBinding$lambda$27$lambda$19$lambda$18$lambda$17;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n70 n70Var = this.b;
        switch (i) {
            case 0:
                tz51 tz51Var = (tz51) n70Var.N;
                tz51Var.c.setText(((PageHeaderEntity) n70Var.Z()).getTitle());
                tz51Var.b.setText(((PageHeaderEntity) n70Var.Z()).getDescription());
                return zy11Var;
            case 1:
                createMonthAdapter$lambda$9$lambda$8 = AutoTopupSummaryView.createMonthAdapter$lambda$9$lambda$8(n70Var, (List) obj);
                return createMonthAdapter$lambda$9$lambda$8;
            case 2:
                viewBinding$lambda$27$lambda$22$lambda$21 = CardDetailsFragment.getViewBinding$lambda$27$lambda$22$lambda$21(n70Var, (List) obj);
                return viewBinding$lambda$27$lambda$22$lambda$21;
            case 3:
                viewBinding$lambda$27$lambda$19$lambda$18 = CardDetailsFragment.getViewBinding$lambda$27$lambda$19$lambda$18(n70Var, (List) obj);
                return viewBinding$lambda$27$lambda$19$lambda$18;
            case 4:
                viewBinding$lambda$27$lambda$19$lambda$18$lambda$17 = CardDetailsFragment.getViewBinding$lambda$27$lambda$19$lambda$18$lambda$17(n70Var, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$27$lambda$19$lambda$18$lambda$17;
            case 5:
                v061 v061Var = (v061) n70Var.N;
                if (((krc) n70Var.Z()).h) {
                    v061Var.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    v061Var.b.setBackground(null);
                } else {
                    v061Var.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    v061Var.b.setBackgroundResource(nyg0.ybsdk_round_background);
                }
                rbv rbvVar = ((krc) n70Var.Z()).c;
                ImageView imageView = v061Var.b;
                TextView textView = v061Var.d;
                TextView textView2 = v061Var.c;
                v4b1.k(rbvVar, imageView, null, null, 6);
                xty0.d(textView, ((krc) n70Var.Z()).d);
                textView.setVisibility(d.c(((krc) n70Var.Z()).d) ? 0 : 8);
                ColorModel colorModel = ((krc) n70Var.Z()).e;
                if (colorModel == null) {
                    colorModel = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                }
                xty0.e(textView, colorModel);
                xty0.d(textView2, ((krc) n70Var.Z()).f);
                textView2.setVisibility(d.c(((krc) n70Var.Z()).f) ? 0 : 8);
                if (d.d(((krc) n70Var.Z()).d)) {
                    textView2.setTextAppearance(l1i0.Widget_YB_Text_Body2);
                    if (!d.c(((krc) n70Var.Z()).f)) {
                        x4c.g("Null or empty title and subtitle in communicationInfoItem", null, null, null, 14);
                    }
                }
                ColorModel colorModel2 = ((krc) n70Var.Z()).g;
                if (colorModel2 == null) {
                    colorModel2 = d.d(((krc) n70Var.Z()).d) ? new ColorModel.Attr(ung0.ybColor_textIcon_primary) : new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                }
                xty0.e(textView2, colorModel2);
                return zy11Var;
            case 6:
                b64.D(n70Var.Z());
                throw null;
            case 7:
                ((c261) n70Var.N).a.render(((hyk) n70Var.Z()).d);
                return zy11Var;
            case 8:
                ((r561) n70Var.N).a.render(((q8m0) n70Var.Z()).d);
                return zy11Var;
            case 9:
                x561 x561Var = (x561) n70Var.N;
                AppCompatTextView appCompatTextView = x561Var.b;
                SpoilerTextView spoilerTextView = x561Var.c;
                Text.Constant constant = ((c9m0) n70Var.Z()).b;
                Context context = n70Var.P;
                appCompatTextView.setText(d.a(context, constant));
                ColorModel colorModel3 = ((c9m0) n70Var.Z()).c;
                if (colorModel3 != null) {
                    x561Var.b.setTextColor(colorModel3.get(context));
                }
                spoilerTextView.setText(d.a(context, ((c9m0) n70Var.Z()).a));
                ColorModel colorModel4 = ((c9m0) n70Var.Z()).d;
                if (colorModel4 != null) {
                    spoilerTextView.setTextColor(colorModel4.get(context));
                }
                ColorModel colorModel5 = ((c9m0) n70Var.Z()).e;
                if (colorModel5 != null) {
                    x561Var.a.getBackground().setTint(colorModel5.get(context));
                }
                return zy11Var;
            case 10:
                YbDivView.setData$default(((d261) n70Var.N).b, ((t8m0) n70Var.Z()).d, null, null, false, 14, null);
                return zy11Var;
            case 11:
                li91.j(((o561) n70Var.N).a, ((tdm0) n70Var.Z()).c);
                ((o561) n70Var.N).a.render((tdm0) n70Var.Z());
                return zy11Var;
            case 12:
                YbDivView.setData$default(((d261) n70Var.N).b, ((rtl) n70Var.Z()).c, null, null, false, 14, null);
                return zy11Var;
            case 13:
                xty0.d(((r261) n70Var.N).b, ((l8r0) n70Var.Z()).b);
                return zy11Var;
            case 14:
                s261 s261Var = (s261) n70Var.N;
                TextView textView3 = s261Var.c;
                TextView textView4 = s261Var.b;
                textView3.setVisibility(((d9r0) n70Var.Z()).b != null ? 0 : 8);
                Text text = ((d9r0) n70Var.Z()).b;
                if (text != null) {
                    xty0.d(s261Var.c, text);
                }
                textView4.setVisibility(((d9r0) n70Var.Z()).c != null ? 0 : 8);
                Text text2 = ((d9r0) n70Var.Z()).c;
                if (text2 != null) {
                    xty0.d(textView4, text2);
                }
                return zy11Var;
            case 15:
                ((t261) n70Var.N).b.setText(d.a(n70Var.P, ((f9r0) n70Var.Z()).c));
                xty0.b(((t261) n70Var.N).b);
                return zy11Var;
            case 16:
                xty0.d(((x261) n70Var.N).c, ((ier0) n70Var.Z()).a);
                x261 x261Var = (x261) n70Var.N;
                x261Var.b.setVisibility(((ier0) n70Var.Z()).b != null ? 0 : 8);
                Text.Constant constant2 = ((ier0) n70Var.Z()).b;
                if (constant2 != null) {
                    xty0.d(x261Var.b, constant2);
                }
                return zy11Var;
            case 17:
                m361 m361Var = (m361) n70Var.N;
                m361Var.d.setText(d.a(sm91.c(m361Var), ((n0t0) n70Var.Z()).a));
                TextView textView5 = m361Var.b;
                textView5.setVisibility(((n0t0) n70Var.Z()).b instanceof Text.Empty ? 8 : 0);
                textView5.setText(d.a(sm91.c(m361Var), ((n0t0) n70Var.Z()).b));
                return zy11Var;
            case 18:
                z461 z461Var = (z461) n70Var.N;
                z461Var.c.setText(((PageHeaderEntity) n70Var.Z()).getTitle());
                z461Var.b.setText(((PageHeaderEntity) n70Var.Z()).getDescription());
                return zy11Var;
            case 19:
                if (((List) obj).isEmpty()) {
                    zo31 zo31Var = n70Var.N;
                    Context context2 = n70Var.P;
                    k861 k861Var = (k861) zo31Var;
                    k861Var.c.setText(d.a(context2, ((acq0) n70Var.Z()).a));
                    k861Var.b.setText(d.a(context2, ((acq0) n70Var.Z()).b));
                }
                return zy11Var;
            case 20:
                ((y261) n70Var.N).a.setText(((fjz0) n70Var.Z()).c);
                return zy11Var;
            case 21:
                Object Z = n70Var.Z();
                zo31 zo31Var2 = n70Var.N;
                px11 px11Var = ((hzt0) Z).b;
                if (px11Var != null) {
                    ((x961) zo31Var2).c.render(px11Var);
                }
                x961 x961Var = (x961) zo31Var2;
                x961Var.b.render(((hzt0) n70Var.Z()).a);
                x961Var.c.setVisibility(((hzt0) n70Var.Z()).b == null ? 4 : 0);
                x961Var.b.setVisibility(((hzt0) n70Var.Z()).b != null ? 4 : 0);
                return zy11Var;
            case 22:
                ((p961) n70Var.N).a.render(((tqj0) n70Var.Z()).a);
                return zy11Var;
            default:
                YbDivView.setData$default(((d261) n70Var.N).b, ((uqj0) n70Var.Z()).b, null, null, false, 14, null);
                return zy11Var;
        }
    }
}
