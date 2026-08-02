package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.BatteryChargeViewV2;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.p;
import ru.yandex.taxi.scooters.experiments.s;
import ru.yandex.taxi.scooters.experiments.t;
import ru.yandex.taxi.scooters.presentation.common.ui.widget.ScootersBatteryChargeViewV3;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class c0n0 {
    public final Context a;
    public final pdc b;
    public final wro0 c;

    public c0n0(Context context, pdc pdcVar, wro0 wro0Var) {
        this.a = context;
        this.b = pdcVar;
        this.c = wro0Var;
    }

    public final View a(t tVar, ScootersCardV2.a aVar, q7p0 q7p0Var) {
        boolean z = tVar instanceof p;
        wro0 wro0Var = this.c;
        if (z) {
            p pVar = (p) tVar;
            BatteryChargeViewV2 batteryChargeViewV2 = new BatteryChargeViewV2(this.a, null, 0, 6, null);
            batteryChargeViewV2.disableAutoSize();
            batteryChargeViewV2.setTextSize(tje.s(mrg0.component_text_size_body, this.a));
            batteryChargeViewV2.setLowAndMediumChargePercents(aVar.a, aVar.b);
            ScootersCardV2.ChargeConfig.ValueOption valueOption = pVar.b;
            batteryChargeViewV2.setAppearanceOption(new sf5(valueOption != ScootersCardV2.ChargeConfig.ValueOption.NONE, pVar.c, pVar.d));
            String a = wro0Var.a(valueOption, q7p0Var);
            batteryChargeViewV2.setChargeLevel(q7p0Var.a, a);
            batteryChargeViewV2.setContentDescription(wro0Var.b(valueOption, a));
            return batteryChargeViewV2;
        }
        if (!(tVar instanceof s)) {
            w511.b();
            return null;
        }
        s sVar = (s) tVar;
        String str = sVar.d;
        bdc bdcVar = new bdc(xng0.textMinor);
        ufu ufuVar = (ufu) this.b;
        kdc h = ufuVar.h(bdcVar, str);
        kdc h2 = ufuVar.h(new bdc(xng0.textMinor), sVar.c);
        ScootersCardV2.ChargeConfig.ValueOption valueOption2 = sVar.b;
        String a2 = wro0Var.a(valueOption2, q7p0Var);
        GoLinearLayout goLinearLayout = new GoLinearLayout(this.a, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        goLinearLayout.setBackground(vng.t(s3h0.scooters_rounded_background_minor, goLinearLayout.getContext()));
        int u = tje.u(5, goLinearLayout.getContext());
        int u2 = tje.u(9, goLinearLayout.getContext());
        goLinearLayout.setPadding(u2, 0, u2, 0);
        ScootersBatteryChargeViewV3 scootersBatteryChargeViewV3 = new ScootersBatteryChargeViewV3(goLinearLayout.getContext(), null, 0, 6, null);
        scootersBatteryChargeViewV3.setLayoutParams(new LinearLayout.LayoutParams(tje.u(22, scootersBatteryChargeViewV3.getContext()), tje.u(14, scootersBatteryChargeViewV3.getContext())));
        scootersBatteryChargeViewV3.setBodyColor(h);
        scootersBatteryChargeViewV3.setDivisionColor(h2);
        int i = q7p0Var.a;
        scootersBatteryChargeViewV3.setActiveDivisionsSize((i > aVar.a ? 1 : 0) + 1 + (i > aVar.b ? 1 : 0));
        goLinearLayout.addView(scootersBatteryChargeViewV3);
        Context context = goLinearLayout.getContext();
        int r = tje.r(msg0.scooters_card_labels_height, goLinearLayout.getContext());
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, r));
        robotoTextView.setGravity(16);
        robotoTextView.setText(a2);
        robotoTextView.setTextColor(qje.t(xng0.textMinor, robotoTextView.getContext()));
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
        robotoTextView.setPaddingRelative(u, 0, 0, 0);
        goLinearLayout.addView(robotoTextView);
        goLinearLayout.setContentDescription(wro0Var.b(valueOption2, a2));
        return goLinearLayout;
    }
}
