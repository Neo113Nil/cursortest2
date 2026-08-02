package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import defpackage.sls;
import kotlin.Result;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class ic0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ ic0(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 CreateEditFolderDialogRoot$lambda$11$lambda$10;
        zy11 render$lambda$1$lambda$0;
        int i = this.a;
        int i2 = 4;
        final int i3 = 0;
        final int i4 = 1;
        zy11 zy11Var = zy11.a;
        final sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                slsVar.invoke();
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                slsVar.invoke();
                break;
            case 5:
                slsVar.invoke();
                break;
            case 6:
                ca1 ca1Var = new ca1((ButtonComponent) obj, 3);
                ButtonComponent buttonComponent = (ButtonComponent) ((View) ca1Var.R);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int d = c.d(mrg0.go_design_m_space, buttonComponent);
                int r = tje.r(mrg0.go_design_s_space, buttonComponent.getContext());
                marginLayoutParams.setMargins(r, 0, r, d);
                buttonComponent.setLayoutParams(marginLayoutParams);
                buttonComponent.setAccent(true);
                buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.zones.info.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        sls slsVar2 = slsVar;
                        switch (i5) {
                            case 0:
                                ((ScootersZonesInfoModalView$adapter$2) slsVar2).invoke();
                                break;
                            default:
                                ((ScootersZonesInfoModalView$adapter$1) slsVar2).invoke();
                                break;
                        }
                    }
                });
                break;
            case 7:
                ca1 ca1Var2 = new ca1((ButtonComponent) obj, i2);
                ButtonComponent buttonComponent2 = (ButtonComponent) ((View) ca1Var2.R);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                int d2 = c.d(mrg0.go_design_l_space, buttonComponent2);
                int r2 = tje.r(mrg0.go_design_s_space, buttonComponent2.getContext());
                marginLayoutParams2.setMargins(r2, d2, r2, tje.r(mrg0.go_design_m_space, buttonComponent2.getContext()));
                buttonComponent2.setLayoutParams(marginLayoutParams2);
                buttonComponent2.setAccent(true);
                buttonComponent2.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.zones.legend.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ScootersZonesLegendModalView$adapter$1) sls.this).invoke();
                    }
                });
                break;
            case 8:
                ca1 ca1Var3 = new ca1((ButtonComponent) obj, 5);
                ButtonComponent buttonComponent3 = (ButtonComponent) ((View) ca1Var3.R);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                int d3 = c.d(mrg0.go_design_s_space, buttonComponent3);
                marginLayoutParams3.setMargins(d3, d3, d3, d3);
                buttonComponent3.setLayoutParams(marginLayoutParams3);
                buttonComponent3.setAccent(true);
                buttonComponent3.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.offers.v2.surge.info.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ScootersSurgeInfoModalView$adapter$2) sls.this).invoke();
                    }
                });
                break;
            case 9:
                break;
            case 10:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 11:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 12:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 13:
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 14:
                ButtonComponent buttonComponent4 = (ButtonComponent) obj;
                ca1 ca1Var4 = new ca1(buttonComponent4, 6);
                View view = (View) ca1Var4.R;
                ButtonComponent buttonComponent5 = (ButtonComponent) view;
                ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                int h = c.h(4, buttonComponent5);
                int r3 = tje.r(mrg0.go_design_s_space, buttonComponent5.getContext());
                marginLayoutParams4.setMargins(r3, 0, r3, h);
                buttonComponent5.setLayoutParams(marginLayoutParams4);
                buttonComponent5.setText(buttonComponent5.getContext().getString(kyh0.common_close));
                buttonComponent5.setButtonTitleColor(new bdc(xng0.textMain));
                buttonComponent5.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.qr.unavailable_scooter.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        sls slsVar2 = slsVar;
                        switch (i5) {
                            case 0:
                                ((ScootersQrUnavailableScooterModalView$adapter$2) slsVar2).invoke();
                                break;
                            default:
                                ((ScootersQrUnavailableScooterModalView$adapter$3) slsVar2).invoke();
                                break;
                        }
                    }
                });
                ((ButtonComponent) view).setButtonBackground(c.c(xng0.controlMinor, buttonComponent4));
                break;
            case 15:
                CreateEditFolderDialogRoot$lambda$11$lambda$10 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$11$lambda$10(slsVar, (y4f) obj);
                break;
            case 16:
                render$lambda$1$lambda$0 = DashboardCardView.render$lambda$1$lambda$0(slsVar, ((Boolean) obj).booleanValue());
                break;
            case 17:
                slsVar.invoke();
                break;
            case 18:
                slsVar.invoke();
                break;
            case 19:
                slsVar.invoke();
                break;
            case 20:
                ca1 ca1Var5 = new ca1((ButtonComponent) obj, 14);
                ButtonComponent buttonComponent6 = (ButtonComponent) ((View) ca1Var5.R);
                ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-1, -2);
                int h2 = c.h(4, buttonComponent6);
                int r4 = tje.r(mrg0.go_design_s_space, buttonComponent6.getContext());
                marginLayoutParams5.setMargins(r4, 0, r4, h2);
                buttonComponent6.setLayoutParams(marginLayoutParams5);
                buttonComponent6.setText(buttonComponent6.getContext().getString(kyh0.scooters_qr_unavailable_scooter_find_on_map_button));
                buttonComponent6.setAccent(true);
                buttonComponent6.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.qr.unavailable_scooter.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        sls slsVar2 = slsVar;
                        switch (i5) {
                            case 0:
                                ((ScootersQrUnavailableScooterModalView$adapter$2) slsVar2).invoke();
                                break;
                            default:
                                ((ScootersQrUnavailableScooterModalView$adapter$3) slsVar2).invoke();
                                break;
                        }
                    }
                });
                break;
            case 21:
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    slsVar.invoke();
                }
                Throwable a = Result.a(value);
                if (a != null) {
                    xby.l(jst.e, "MainActivity", null, a, "authorization failed", 2);
                    break;
                }
                break;
            case 22:
                slsVar.invoke();
                break;
            case 23:
                if (((nza0) obj).d(Permission.WRITE_EXTERNAL_STORAGE)) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 24:
                meo meoVar = ymx.b;
                slsVar.invoke();
                break;
            case 25:
                meo meoVar2 = ymx.b;
                slsVar.invoke();
                break;
            case 26:
                ca1 ca1Var6 = new ca1((ListItemComponent) obj, 19);
                ListItemComponent listItemComponent = (ListItemComponent) ((View) ca1Var6.R);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.zones.info.ui.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        sls slsVar2 = slsVar;
                        switch (i5) {
                            case 0:
                                ((ScootersZonesInfoModalView$adapter$2) slsVar2).invoke();
                                break;
                            default:
                                ((ScootersZonesInfoModalView$adapter$1) slsVar2).invoke();
                                break;
                        }
                    }
                });
                break;
            case 27:
                slsVar.invoke();
                break;
            case 28:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }
}
