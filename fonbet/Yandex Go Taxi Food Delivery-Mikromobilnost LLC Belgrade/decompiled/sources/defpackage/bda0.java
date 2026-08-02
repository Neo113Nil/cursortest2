package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSideContainer;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes13.dex */
public final class bda0 extends wys {
    public static final /* synthetic */ int Z = 0;
    public final ListItemComponent R;
    public final pav S;
    public final hba0 T;
    public final int U;
    public final int V;
    public xba0 W;

    public bda0(ListItemComponent listItemComponent, pav pavVar, hba0 hba0Var) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = pavVar;
        this.T = hba0Var;
        this.U = (int) c.j(10, listItemComponent);
        this.V = (int) tje.w(44, listItemComponent.getContext());
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        kdc c;
        super.applyTheme(themeType);
        xba0 xba0Var = this.W;
        if (xba0Var == null || (c = xba0Var.c()) == null) {
            return;
        }
        ListItemComponent listItemComponent = this.R;
        ShimmeringImageView shimmeringImageView = (ShimmeringImageView) listItemComponent.getLeadViewAs(ShimmeringImageView.class);
        if (shimmeringImageView == null) {
            return;
        }
        shimmeringImageView.setCenterColor(lhc.f(s8o.m(c, listItemComponent.getContext()), Math.abs(25) & 255));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        xba0 xba0Var = (xba0) obj;
        this.W = xba0Var;
        CharSequence charSequence = xba0Var.d;
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(xba0Var.e);
        listItemComponent.setTitleTextColor(xba0Var.c());
        listItemComponent.setSubtitleTextColor(xba0Var.c());
        listItemComponent.setBackgroundColor(xba0Var.c);
        String str = xba0Var.g;
        kdc c = xba0Var.c();
        ShimmeringImageView shimmeringImageView = (ShimmeringImageView) listItemComponent.getLeadViewAs(ShimmeringImageView.class);
        if (shimmeringImageView != null) {
            if (str == null) {
                shimmeringImageView.setVisibility(8);
            } else {
                shimmeringImageView.setCenterColor(lhc.f(s8o.m(c, listItemComponent.getContext()), Math.abs(25) & 255));
                pav pavVar = this.S;
                pavVar.c(shimmeringImageView);
                nac nacVar = (nac) pavVar.a(shimmeringImageView);
                nacVar.h = new u290(21, shimmeringImageView);
                nacVar.c(str);
                int i = this.V;
                c.D(i, i, shimmeringImageView);
                ListItemSideContainer listItemSideContainer = listItemComponent.leadFrame;
                int i2 = this.U;
                listItemSideContainer.setPadding(i2, i2, i2, i2);
            }
        }
        if (xba0Var.h != null) {
            listItemComponent.getNavigationIconParams().b = xba0Var.c();
            listItemComponent.setTrailMode(2);
            listItemComponent.setDebounceClickListener(new yo90(4, this, xba0Var));
        } else {
            listItemComponent.setTrailMode(0);
        }
        this.T.a8(xba0Var.b);
    }
}
