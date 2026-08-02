package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.tariffcard.ui.view.TariffLeadView;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class mn40 extends lys {
    public static final /* synthetic */ int W = 0;
    public final pav S;
    public final wls T;
    public final TariffLeadView U;
    public final TariffTrailView V;

    public mn40(ListItemComponent listItemComponent, pav pavVar, wls wlsVar) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = wlsVar;
        TariffLeadView tariffLeadView = new TariffLeadView(listItemComponent.getContext());
        this.U = tariffLeadView;
        TariffTrailView tariffTrailView = new TariffTrailView(listItemComponent.getContext());
        this.V = tariffTrailView;
        nzs.s((ListItemComponent) ((View) this.R), -1, -2);
        ((ListItemComponent) ((View) this.R)).setBackgroundColor(qje.t(xng0.bgMain, listItemComponent.getContext()));
        ((ListItemComponent) ((View) this.R)).setTitleTextColor(new bdc(xng0.textMain));
        ((ListItemComponent) ((View) this.R)).setLeadView(tariffLeadView);
        ((ListItemComponent) ((View) this.R)).setTrailView(tariffTrailView);
        ((ListItemComponent) ((View) this.R)).setUseAutoAccessibilityDelegate(false);
        b.p((View) this.R, new mg(24, this));
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        View view = (View) this.R;
        ((ListItemComponent) view).setBackgroundColor(c.c(xng0.bgMain, this.a));
        ((ListItemComponent) view).applyTheme(themeType);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        kn40 kn40Var = (kn40) obj;
        View view = (View) this.R;
        nco ncoVar = kn40Var.j;
        hq40 hq40Var = kn40Var.i;
        g18 upVar = this.U.setup(this.S, ncoVar, kn40Var.b, kn40Var.c);
        if (upVar != null) {
            a0(upVar);
        }
        dn40 dn40Var = kn40Var.e;
        TariffTrailView tariffTrailView = this.V;
        tariffTrailView.setCheckedCheckboxTint(dn40Var);
        if (hq40Var.a) {
            tariffTrailView.setCheckboxToggleOnClickEnabled(false);
            tariffTrailView.setOnClickListener(null);
        } else {
            tariffTrailView.setCheckboxToggleOnClickEnabled(true);
            c.z(new ve30(19, this, kn40Var), tariffTrailView);
        }
        tariffTrailView.setPriceInfo(kn40Var.k);
        tariffTrailView.setChecked(kn40Var.d);
        ListItemComponent listItemComponent = (ListItemComponent) view;
        listItemComponent.setTitle(kn40Var.f);
        fqb1.b(listItemComponent, hq40Var, kn40Var.g);
        if (kn40Var.h) {
            listItemComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
        } else {
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.ICON_MARGIN);
        }
    }
}
