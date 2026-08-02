package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.NestedScrollableHost;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderMultimodalRoutesView;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class bkx0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ bkx0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DriveState onAttachedToWindow$lambda$1$0$1;
        int i = 9;
        switch (this.a) {
            case 0:
                NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nestedScrollableHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return nestedScrollableHost;
            case 1:
                return new ca1((NestedScrollableHost) obj, 26);
            case 2:
                ((cjx0) obj).a.r(new ajx0(TariffPageCloseReason.FOOTER_BUTTON, 1));
                return zy11.a;
            case 3:
                ((cjx0) obj).a.r(new ajx0(TariffPageCloseReason.OUT_CARD_TAP, 1));
                return zy11.a;
            case 4:
                ((cjx0) obj).a.r(new ajx0(TariffPageCloseReason.PULL, 1));
                return zy11.a;
            case 5:
                RobotoTextView robotoTextView = new RobotoTextView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                robotoTextView.setPadding(tje.u(18, robotoTextView.getContext()), tje.u(13, robotoTextView.getContext()), tje.u(18, robotoTextView.getContext()), tje.u(5, robotoTextView.getContext()));
                robotoTextView.setTextTypeface(3);
                robotoTextView.setTextSize(13.0f);
                robotoTextView.setTextColorAttr(xng0.textMinor);
                robotoTextView.setFontFeatureSettings(robotoTextView.getContext().getString(mzh0.go_default_font_settings));
                return robotoTextView;
            case 6:
                return new ca1((RobotoTextView) obj, 27);
            case 7:
                ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return listGroupHeaderComponent;
            case 8:
                return new ca1((ListGroupHeaderComponent) obj, 28);
            case 9:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent.setLayoutParams(marginLayoutParams);
                return listItemComponent;
            case 10:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return listItemComponent2;
            case 11:
                TariffsRibbonView tariffsRibbonView = (TariffsRibbonView) obj;
                ca1 ca1Var = new ca1(tariffsRibbonView, 29);
                ((View) ca1Var.R).setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                int d = c.d(ssg0.tariff_card_selector_height, tariffsRibbonView);
                int r = tje.r(qsg0.high_tariffs_selector_height, tariffsRibbonView.getContext());
                int r2 = tje.r(qsg0.tariffs_selector_top_space, tariffsRibbonView.getContext());
                xw31.E(tariffsRibbonView, null, Integer.valueOf(-r2), null, null);
                xw31.E(tariffsRibbonView, null, null, null, Integer.valueOf(-((r - r2) - d)));
                return ca1Var;
            case 12:
                pw1 pw1Var = ((gox0) obj).a;
                pw1Var.r(new qu(i));
                ((uh60) pw1Var.F).invoke();
                return zy11.a;
            case 13:
                ((gox0) obj).a.r(new qu(i));
                return zy11.a;
            case 14:
                jst.e.k((Throwable) obj, "Fetch communication media file failed");
                return zy11.a;
            case 15:
                ((m2k0) obj).j(1);
                return zy11.a;
            case 16:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.D(m2k0Var.K.getDensity() * (-12.0f));
                return zy11.a;
            case 17:
                m2k0 m2k0Var2 = (m2k0) obj;
                m2k0Var2.D(m2k0Var2.K.getDensity() * (-12.0f));
                return zy11.a;
            case 18:
                y4c0 y4c0Var = ((azx0) obj).a;
                y4c0Var.r(new qu(i));
                ((fw70) y4c0Var.G).run();
                return zy11.a;
            case 19:
                y4c0 y4c0Var2 = ((azx0) obj).a;
                y4c0Var2.r(new qu(i));
                ((fw70) y4c0Var2.H).run();
                return zy11.a;
            case 20:
                return ((TaxiOrder) obj).h.getB();
            case 21:
                onAttachedToWindow$lambda$1$0$1 = TaxiOrderMultimodalRoutesView.onAttachedToWindow$lambda$1$0$1((TaxiOrder) obj);
                return onAttachedToWindow$lambda$1$0$1;
            case 22:
                ((s5y0) obj).a.r(new qu(i));
                return zy11.a;
            case 23:
                return ((o2y0) obj).b().a;
            case 24:
                return ((xw) obj).a.getAnalyticAlias();
            case 25:
                ((ImageView) obj).setImageDrawable(null);
                return zy11.a;
            case 26:
                return ((TaxiOrder) obj).h.getB();
            case 27:
                ccv ccvVar = new ccv(txg0.ybsdk_ic_yb_placeholder);
                rev revVar = rev.o;
                return new pbv((dcv) ccvVar, (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) revVar, (vfv) h2b1.G, (String) obj, false);
            case 28:
                ListItemComponent listItemComponent3 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u2 = tje.u(16, listItemComponent3.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams2.setMargins(u2, 0, u2, 0);
                listItemComponent3.setLayoutParams(marginLayoutParams2);
                listItemComponent3.setLeadFrameMinimumWidth(tje.u(56, listItemComponent3.getContext()));
                listItemComponent3.setTrailMode(2);
                listItemComponent3.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent3;
            default:
                return new omc((ListItemComponent) obj, 2);
        }
    }
}
